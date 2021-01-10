/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.Editable
 *  android.text.Editable$Factory
 *  android.text.Selection
 *  android.text.Spannable
 *  android.view.View
 *  android.view.inputmethod.BaseInputConnection
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.view.inputmethod.InputMethodSubtype
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.editing.InputConnectionAdaptor;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformViewsController;

public class TextInputPlugin {
    private TextInputChannel.Configuration configuration;
    private InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private boolean isInputConnectionLocked;
    private InputConnection lastInputConnection;
    private Editable mEditable;
    private final InputMethodManager mImm;
    private boolean mRestartInputPending;
    private final View mView;
    private PlatformViewsController platformViewsController;
    private final boolean restartAlwaysRequired;
    private final TextInputChannel textInputChannel;

    public TextInputPlugin(View view, DartExecutor dartExecutor, PlatformViewsController platformViewsController) {
        this.mView = view;
        this.mImm = (InputMethodManager)view.getContext().getSystemService("input_method");
        this.textInputChannel = new TextInputChannel(dartExecutor);
        this.textInputChannel.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler((TextInputPlugin)this){
            final /* synthetic */ TextInputPlugin this$0;
            {
                this.this$0 = textInputPlugin;
            }

            public void clearClient() {
                TextInputPlugin.access$400(this.this$0);
            }

            public void hide() {
                TextInputPlugin textInputPlugin = this.this$0;
                TextInputPlugin.access$200(textInputPlugin, TextInputPlugin.access$000(textInputPlugin));
            }

            public void setClient(int n2, TextInputChannel.Configuration configuration) {
                this.this$0.setTextInputClient(n2, configuration);
            }

            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = this.this$0;
                textInputPlugin.setTextInputEditingState(TextInputPlugin.access$000(textInputPlugin), textEditState);
            }

            public void setPlatformViewClient(int n2) {
                TextInputPlugin.access$300(this.this$0, n2);
            }

            public void show() {
                TextInputPlugin textInputPlugin = this.this$0;
                TextInputPlugin.access$100(textInputPlugin, TextInputPlugin.access$000(textInputPlugin));
            }
        });
        this.textInputChannel.requestExistingInputState();
        this.platformViewsController = platformViewsController;
        this.platformViewsController.attachTextInputPlugin((TextInputPlugin)this);
        this.restartAlwaysRequired = TextInputPlugin.super.isRestartAlwaysRequired();
    }

    static /* synthetic */ View access$000(TextInputPlugin textInputPlugin) {
        return textInputPlugin.mView;
    }

    static /* synthetic */ void access$100(TextInputPlugin textInputPlugin, View view) {
        textInputPlugin.showTextInput(view);
    }

    static /* synthetic */ void access$200(TextInputPlugin textInputPlugin, View view) {
        textInputPlugin.hideTextInput(view);
    }

    static /* synthetic */ void access$300(TextInputPlugin textInputPlugin, int n2) {
        textInputPlugin.setPlatformViewTextInputClient(n2);
    }

    static /* synthetic */ void access$400(TextInputPlugin textInputPlugin) {
        textInputPlugin.clearTextInputClient();
    }

    private void applyStateToSelection(TextInputChannel.TextEditState textEditState) {
        int n2 = textEditState.selectionStart;
        int n3 = textEditState.selectionEnd;
        if (n2 >= 0 && n2 <= this.mEditable.length() && n3 >= 0 && n3 <= this.mEditable.length()) {
            Selection.setSelection((Spannable)this.mEditable, (int)n2, (int)n3);
            return;
        }
        Selection.removeSelection((Spannable)this.mEditable);
    }

    private void clearTextInputClient() {
        if (this.inputTarget.type == InputTarget.Type.PLATFORM_VIEW) {
            return;
        }
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        this.unlockPlatformViewInputConnection();
    }

    private void hideTextInput(View view) {
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean bl, boolean bl2, boolean bl3, TextInputChannel.TextCapitalization textCapitalization) {
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int n2 = 2;
            if (inputType.isSigned) {
                n2 = 4098;
            }
            if (inputType.isDecimal) {
                n2 |= 8192;
            }
            return n2;
        }
        if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        }
        int n3 = 1;
        if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
            n3 = 131073;
        } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS) {
            n3 = 33;
        } else if (textInputType == TextInputChannel.TextInputType.URL) {
            n3 = 17;
        } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
            n3 = 145;
        }
        if (bl) {
            n3 = 128 | (n3 | 524288);
        } else {
            if (bl2) {
                n3 |= 32768;
            }
            if (!bl3) {
                n3 |= 524288;
            }
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS) {
            return n3 | 4096;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.WORDS) {
            return n3 | 8192;
        }
        if (textCapitalization == TextInputChannel.TextCapitalization.SENTENCES) {
            n3 |= 16384;
        }
        return n3;
    }

    @SuppressLint(value={"NewApi"})
    private boolean isRestartAlwaysRequired() {
        if (this.mImm.getCurrentInputMethodSubtype() != null && Build.VERSION.SDK_INT >= 21 && Build.MANUFACTURER.equals((Object)"samsung")) {
            return Settings.Secure.getString((ContentResolver)this.mView.getContext().getContentResolver(), (String)"default_input_method").contains((CharSequence)"Samsung");
        }
        return false;
    }

    private void setPlatformViewTextInputClient(int n2) {
        this.mView.requestFocus();
        this.inputTarget = new InputTarget(InputTarget.Type.PLATFORM_VIEW, n2);
        this.mImm.restartInput(this.mView);
        this.mRestartInputPending = false;
    }

    private void showTextInput(View view) {
        view.requestFocus();
        this.mImm.showSoftInput(view, 0);
    }

    public void clearPlatformViewClient(int n2) {
        InputTarget inputTarget = this.inputTarget;
        if (inputTarget.type == InputTarget.Type.PLATFORM_VIEW && inputTarget.id == n2) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            TextInputPlugin.super.hideTextInput(this.mView);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public InputConnection createInputConnection(View view, EditorInfo editorInfo) {
        InputTarget inputTarget = this.inputTarget;
        InputTarget.Type type = inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        }
        if (type == InputTarget.Type.PLATFORM_VIEW) {
            if (this.isInputConnectionLocked) {
                return this.lastInputConnection;
            }
            this.lastInputConnection = this.platformViewsController.getPlatformViewById(inputTarget.id).onCreateInputConnection(editorInfo);
            return this.lastInputConnection;
        }
        TextInputChannel.Configuration configuration = this.configuration;
        editorInfo.inputType = TextInputPlugin.inputTypeFromTextInputType(configuration.inputType, configuration.obscureText, configuration.autocorrect, configuration.enableSuggestions, configuration.textCapitalization);
        editorInfo.imeOptions = 33554432;
        Integer n2 = this.configuration.inputAction;
        int n3 = n2 == null ? ((131072 & editorInfo.inputType) != 0 ? 1 : 6) : n2;
        String string2 = this.configuration.actionLabel;
        if (string2 != null) {
            editorInfo.actionLabel = string2;
            editorInfo.actionId = n3;
        }
        editorInfo.imeOptions = n3 | editorInfo.imeOptions;
        InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.id, this.textInputChannel, this.mEditable, editorInfo);
        editorInfo.initialSelStart = Selection.getSelectionStart((CharSequence)this.mEditable);
        editorInfo.initialSelEnd = Selection.getSelectionEnd((CharSequence)this.mEditable);
        this.lastInputConnection = inputConnectionAdaptor;
        return this.lastInputConnection;
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
    }

    Editable getEditable() {
        return this.mEditable;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public void lockPlatformViewInputConnection() {
        if (this.inputTarget.type == InputTarget.Type.PLATFORM_VIEW) {
            this.isInputConnectionLocked = true;
        }
    }

    void setTextInputClient(int n2, TextInputChannel.Configuration configuration) {
        this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, n2);
        this.configuration = configuration;
        this.mEditable = Editable.Factory.getInstance().newEditable((CharSequence)"");
        this.mRestartInputPending = true;
        this.unlockPlatformViewInputConnection();
    }

    void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        if (!textEditState.text.equals((Object)this.mEditable.toString())) {
            Editable editable = this.mEditable;
            editable.replace(0, editable.length(), (CharSequence)textEditState.text);
        }
        TextInputPlugin.super.applyStateToSelection(textEditState);
        if (!this.restartAlwaysRequired && !this.mRestartInputPending) {
            this.mImm.updateSelection(this.mView, Math.max((int)Selection.getSelectionStart((CharSequence)this.mEditable), (int)0), Math.max((int)Selection.getSelectionEnd((CharSequence)this.mEditable), (int)0), BaseInputConnection.getComposingSpanStart((Spannable)this.mEditable), BaseInputConnection.getComposingSpanEnd((Spannable)this.mEditable));
            return;
        }
        this.mImm.restartInput(view);
        this.mRestartInputPending = false;
    }

    public void unlockPlatformViewInputConnection() {
        this.isInputConnectionLocked = false;
    }

    private static class InputTarget {
        int id;
        Type type;

        public InputTarget(Type type, int n2) {
            this.type = type;
            this.id = n2;
        }

        static final class Type
        extends Enum<Type> {
            private static final /* synthetic */ Type[] $VALUES;
            public static final /* enum */ Type FRAMEWORK_CLIENT;
            public static final /* enum */ Type NO_TARGET;
            public static final /* enum */ Type PLATFORM_VIEW;

            static {
                NO_TARGET = new Type();
                FRAMEWORK_CLIENT = new Type();
                PLATFORM_VIEW = new Type();
                Type[] arrtype = new Type[]{NO_TARGET, FRAMEWORK_CLIENT, PLATFORM_VIEW};
                $VALUES = arrtype;
            }

            public static Type valueOf(String string2) {
                return (Type)Enum.valueOf(Type.class, (String)string2);
            }

            public static Type[] values() {
                return (Type[])$VALUES.clone();
            }
        }

    }

}

