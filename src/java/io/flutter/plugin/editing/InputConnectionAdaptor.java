/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ClipboardManager
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.text.DynamicLayout
 *  android.text.Editable
 *  android.text.Layout
 *  android.text.Layout$Alignment
 *  android.text.Selection
 *  android.text.Spannable
 *  android.text.TextPaint
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.inputmethod.BaseInputConnection
 *  android.view.inputmethod.CursorAnchorInfo
 *  android.view.inputmethod.CursorAnchorInfo$Builder
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputMethodManager
 *  android.view.inputmethod.InputMethodSubtype
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;

class InputConnectionAdaptor
extends BaseInputConnection {
    private final boolean isSamsung;
    private int mBatchCount;
    private final int mClient;
    private final Editable mEditable;
    private final EditorInfo mEditorInfo;
    private final View mFlutterView;
    private InputMethodManager mImm;
    private final Layout mLayout;
    private final TextInputChannel textInputChannel;

    public InputConnectionAdaptor(View view, int n2, TextInputChannel textInputChannel, Editable editable, EditorInfo editorInfo) {
        super(view, true);
        this.mFlutterView = view;
        this.mClient = n2;
        this.textInputChannel = textInputChannel;
        this.mEditable = editable;
        this.mEditorInfo = editorInfo;
        this.mBatchCount = 0;
        DynamicLayout dynamicLayout = new DynamicLayout((CharSequence)this.mEditable, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.mLayout = dynamicLayout;
        this.mImm = (InputMethodManager)view.getContext().getSystemService("input_method");
        this.isSamsung = this.isSamsung();
    }

    private static int clampIndexToEditable(int n2, Editable editable) {
        int n3 = Math.max((int)0, (int)Math.min((int)editable.length(), (int)n2));
        if (n3 != n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Text selection index was clamped (");
            stringBuilder.append(n2);
            stringBuilder.append("->");
            stringBuilder.append(n3);
            stringBuilder.append(") to remain in bounds. This may not be your fault, as some keyboards may select outside of bounds.");
            Log.d("flutter", stringBuilder.toString());
        }
        return n3;
    }

    @SuppressLint(value={"NewApi"})
    private boolean isSamsung() {
        if (this.mImm.getCurrentInputMethodSubtype() != null && Build.VERSION.SDK_INT >= 21 && Build.MANUFACTURER.equals((Object)"samsung")) {
            return Settings.Secure.getString((ContentResolver)this.mFlutterView.getContext().getContentResolver(), (String)"default_input_method").contains((CharSequence)"Samsung");
        }
        return false;
    }

    private void updateEditingState() {
        if (this.mBatchCount > 0) {
            return;
        }
        int n2 = Selection.getSelectionStart((CharSequence)this.mEditable);
        int n3 = Selection.getSelectionEnd((CharSequence)this.mEditable);
        int n4 = BaseInputConnection.getComposingSpanStart((Spannable)this.mEditable);
        int n5 = BaseInputConnection.getComposingSpanEnd((Spannable)this.mEditable);
        this.mImm.updateSelection(this.mFlutterView, n2, n3, n4, n5);
        this.textInputChannel.updateEditingState(this.mClient, this.mEditable.toString(), n2, n3, n4, n5);
    }

    public boolean beginBatchEdit() {
        this.mBatchCount = 1 + this.mBatchCount;
        return super.beginBatchEdit();
    }

    public boolean commitText(CharSequence charSequence, int n2) {
        boolean bl = super.commitText(charSequence, n2);
        InputConnectionAdaptor.super.updateEditingState();
        return bl;
    }

    public boolean deleteSurroundingText(int n2, int n3) {
        if (Selection.getSelectionStart((CharSequence)this.mEditable) == -1) {
            return true;
        }
        boolean bl = super.deleteSurroundingText(n2, n3);
        InputConnectionAdaptor.super.updateEditingState();
        return bl;
    }

    public boolean endBatchEdit() {
        boolean bl = super.endBatchEdit();
        this.mBatchCount = -1 + this.mBatchCount;
        this.updateEditingState();
        return bl;
    }

    public boolean finishComposingText() {
        boolean bl = super.finishComposingText();
        if (this.isSamsung && Build.VERSION.SDK_INT >= 21) {
            CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
            builder.setComposingText(-1, (CharSequence)"");
            CursorAnchorInfo cursorAnchorInfo = builder.build();
            this.mImm.updateCursorAnchorInfo(this.mFlutterView, cursorAnchorInfo);
        }
        this.updateEditingState();
        return bl;
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public boolean performContextMenuAction(int n2) {
        if (n2 == 16908319) {
            this.setSelection(0, this.mEditable.length());
            return true;
        }
        if (n2 == 16908320) {
            int n3;
            int n4 = Selection.getSelectionStart((CharSequence)this.mEditable);
            if (n4 != (n3 = Selection.getSelectionEnd((CharSequence)this.mEditable))) {
                int n5 = Math.min((int)n4, (int)n3);
                int n6 = Math.max((int)n4, (int)n3);
                CharSequence charSequence = this.mEditable.subSequence(n5, n6);
                ((ClipboardManager)this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)charSequence));
                this.mEditable.delete(n5, n6);
                this.setSelection(n5, n5);
            }
            return true;
        }
        if (n2 == 16908321) {
            int n7;
            int n8 = Selection.getSelectionStart((CharSequence)this.mEditable);
            if (n8 != (n7 = Selection.getSelectionEnd((CharSequence)this.mEditable))) {
                CharSequence charSequence = this.mEditable.subSequence(Math.min((int)n8, (int)n7), Math.max((int)n8, (int)n7));
                ((ClipboardManager)this.mFlutterView.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)charSequence));
            }
            return true;
        }
        if (n2 == 16908322) {
            ClipData clipData = ((ClipboardManager)this.mFlutterView.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (clipData != null) {
                int n9;
                int n10;
                CharSequence charSequence = clipData.getItemAt(0).coerceToText(this.mFlutterView.getContext());
                int n11 = Math.max((int)0, (int)Selection.getSelectionStart((CharSequence)this.mEditable));
                int n12 = Math.min((int)n11, (int)(n9 = Math.max((int)0, (int)Selection.getSelectionEnd((CharSequence)this.mEditable))));
                if (n12 != (n10 = Math.max((int)n11, (int)n9))) {
                    this.mEditable.delete(n12, n10);
                }
                this.mEditable.insert(n12, charSequence);
                int n13 = n12 + charSequence.length();
                this.setSelection(n13, n13);
            }
            return true;
        }
        return false;
    }

    public boolean performEditorAction(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            if (n2 != 5) {
                                if (n2 != 7) {
                                    this.textInputChannel.done(this.mClient);
                                    return true;
                                }
                                this.textInputChannel.previous(this.mClient);
                                return true;
                            }
                            this.textInputChannel.next(this.mClient);
                            return true;
                        }
                        this.textInputChannel.send(this.mClient);
                        return true;
                    }
                    this.textInputChannel.search(this.mClient);
                    return true;
                }
                this.textInputChannel.go(this.mClient);
                return true;
            }
            this.textInputChannel.newline(this.mClient);
            return true;
        }
        this.textInputChannel.unspecifiedAction(this.mClient);
        return true;
    }

    /*
     * Exception decompiling
     */
    public boolean sendKeyEvent(KeyEvent var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl71 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean setComposingRegion(int n2, int n3) {
        boolean bl = super.setComposingRegion(n2, n3);
        InputConnectionAdaptor.super.updateEditingState();
        return bl;
    }

    public boolean setComposingText(CharSequence charSequence, int n2) {
        boolean bl = charSequence.length() == 0 ? super.commitText(charSequence, n2) : super.setComposingText(charSequence, n2);
        InputConnectionAdaptor.super.updateEditingState();
        return bl;
    }

    public boolean setSelection(int n2, int n3) {
        boolean bl = super.setSelection(n2, n3);
        InputConnectionAdaptor.super.updateEditingState();
        return bl;
    }
}

