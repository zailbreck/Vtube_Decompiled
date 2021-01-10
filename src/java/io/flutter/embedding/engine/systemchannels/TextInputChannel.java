/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.HashMap
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler parsingMethodHandler;
    private TextInputMethodHandler textInputMethodHandler;

    public TextInputChannel(DartExecutor dartExecutor) {
        this.parsingMethodHandler = new MethodChannel.MethodCallHandler((TextInputChannel)this){
            final /* synthetic */ TextInputChannel this$0;
            {
                this.this$0 = textInputChannel;
            }

            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                block20 : {
                    block15 : {
                        block16 : {
                            String string2;
                            block21 : {
                                Object object;
                                void var10_16;
                                block17 : {
                                    block18 : {
                                        block19 : {
                                            if (TextInputChannel.access$000(this.this$0) == null) {
                                                return;
                                            }
                                            String string3 = methodCall.method;
                                            object = methodCall.arguments;
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("Received '");
                                            stringBuilder.append(string3);
                                            stringBuilder.append("' message.");
                                            Log.v("TextInputChannel", stringBuilder.toString());
                                            int n2 = -1;
                                            switch (string3.hashCode()) {
                                                default: {
                                                    break;
                                                }
                                                case 1904427655: {
                                                    if (!string3.equals((Object)"TextInput.clearClient")) break;
                                                    n2 = 5;
                                                    break;
                                                }
                                                case 270803918: {
                                                    if (!string3.equals((Object)"TextInput.show")) break;
                                                    n2 = 0;
                                                    break;
                                                }
                                                case 270476819: {
                                                    if (!string3.equals((Object)"TextInput.hide")) break;
                                                    n2 = 1;
                                                    break;
                                                }
                                                case -37561188: {
                                                    if (!string3.equals((Object)"TextInput.setClient")) break;
                                                    n2 = 2;
                                                    break;
                                                }
                                                case -1015421462: {
                                                    if (!string3.equals((Object)"TextInput.setEditingState")) break;
                                                    n2 = 4;
                                                    break;
                                                }
                                                case -1779068172: {
                                                    if (!string3.equals((Object)"TextInput.setPlatformViewClient")) break;
                                                    n2 = 3;
                                                }
                                            }
                                            if (n2 == 0) break block15;
                                            if (n2 == 1) break block16;
                                            if (n2 == 2) break block17;
                                            if (n2 == 3) break block18;
                                            if (n2 == 4) break block19;
                                            if (n2 != 5) {
                                                result.notImplemented();
                                                return;
                                            }
                                            TextInputChannel.access$000(this.this$0).clearClient();
                                            break block20;
                                        }
                                        try {
                                            JSONObject jSONObject = (JSONObject)object;
                                            TextInputChannel.access$000(this.this$0).setEditingState(TextEditState.fromJson(jSONObject));
                                            result.success(null);
                                            return;
                                        }
                                        catch (JSONException jSONException) {
                                            string2 = jSONException.getMessage();
                                        }
                                        break block21;
                                    }
                                    int n3 = (Integer)object;
                                    TextInputChannel.access$000(this.this$0).setPlatformViewClient(n3);
                                    return;
                                }
                                try {
                                    org.json.JSONArray jSONArray = (org.json.JSONArray)object;
                                    int n4 = jSONArray.getInt(0);
                                    JSONObject jSONObject = jSONArray.getJSONObject(1);
                                    TextInputChannel.access$000(this.this$0).setClient(n4, Configuration.fromJson(jSONObject));
                                    result.success(null);
                                    return;
                                }
                                catch (NoSuchFieldException noSuchFieldException) {
                                }
                                catch (JSONException jSONException) {
                                    // empty catch block
                                }
                                string2 = var10_16.getMessage();
                            }
                            result.error("error", string2, null);
                            return;
                        }
                        TextInputChannel.access$000(this.this$0).hide();
                        break block20;
                    }
                    TextInputChannel.access$000(this.this$0).show();
                }
                result.success(null);
            }
        };
        this.channel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel.setMethodCallHandler(this.parsingMethodHandler);
    }

    static /* synthetic */ TextInputMethodHandler access$000(TextInputChannel textInputChannel) {
        return textInputChannel.textInputMethodHandler;
    }

    public void done(int n2) {
        Log.v(TAG, "Sending 'done' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.done"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void go(int n2) {
        Log.v(TAG, "Sending 'go' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.go"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void newline(int n2) {
        Log.v(TAG, "Sending 'newline' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.newline"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void next(int n2) {
        Log.v(TAG, "Sending 'next' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.next"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void previous(int n2) {
        Log.v(TAG, "Sending 'previous' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.previous"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int n2) {
        Log.v(TAG, "Sending 'search' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.search"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void send(int n2) {
        Log.v(TAG, "Sending 'send' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.send"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int n2) {
        Log.v(TAG, "Sending 'unspecified' message.");
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), "TextInputAction.unspecified"};
        methodChannel.invokeMethod("TextInputClient.performAction", (Object)Arrays.asList((Object[])arrobject));
    }

    public void updateEditingState(int n2, String string2, int n3, int n4, int n5, int n6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to update editing state: \nText: ");
        stringBuilder.append(string2);
        stringBuilder.append("\nSelection start: ");
        stringBuilder.append(n3);
        stringBuilder.append("\nSelection end: ");
        stringBuilder.append(n4);
        stringBuilder.append("\nComposing start: ");
        stringBuilder.append(n5);
        stringBuilder.append("\nComposing end: ");
        stringBuilder.append(n6);
        Log.v(TAG, stringBuilder.toString());
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"text", (Object)string2);
        hashMap.put((Object)"selectionBase", (Object)n3);
        hashMap.put((Object)"selectionExtent", (Object)n4);
        hashMap.put((Object)"composingBase", (Object)n5);
        hashMap.put((Object)"composingExtent", (Object)n6);
        MethodChannel methodChannel = this.channel;
        Object[] arrobject = new Serializable[]{Integer.valueOf((int)n2), hashMap};
        methodChannel.invokeMethod("TextInputClient.updateEditingState", (Object)Arrays.asList((Object[])arrobject));
    }

    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final boolean enableSuggestions;
        public final Integer inputAction;
        public final InputType inputType;
        public final boolean obscureText;
        public final TextCapitalization textCapitalization;

        public Configuration(boolean bl, boolean bl2, boolean bl3, TextCapitalization textCapitalization, InputType inputType, Integer n2, String string2) {
            this.obscureText = bl;
            this.autocorrect = bl2;
            this.enableSuggestions = bl3;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = n2;
            this.actionLabel = string2;
        }

        public static Configuration fromJson(JSONObject jSONObject) {
            String string2 = jSONObject.getString("inputAction");
            if (string2 != null) {
                Integer n2 = Configuration.inputActionFromTextInputAction(string2);
                boolean bl = jSONObject.optBoolean("obscureText");
                boolean bl2 = jSONObject.optBoolean("autocorrect", true);
                boolean bl3 = jSONObject.optBoolean("enableSuggestions");
                TextCapitalization textCapitalization = TextCapitalization.fromValue(jSONObject.getString("textCapitalization"));
                InputType inputType = InputType.fromJson(jSONObject.getJSONObject("inputType"));
                String string3 = jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel");
                Configuration configuration = new Configuration(bl, bl2, bl3, textCapitalization, inputType, n2, string3);
                return configuration;
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        private static Integer inputActionFromTextInputAction(String string2) {
            Integer n2;
            Integer n3;
            int n4;
            block21 : {
                int n5 = string2.hashCode();
                n2 = 1;
                n3 = 0;
                switch (n5) {
                    default: {
                        break;
                    }
                    case 2110497650: {
                        if (!string2.equals((Object)"TextInputAction.previous")) break;
                        n4 = 8;
                        break block21;
                    }
                    case 1539450297: {
                        if (!string2.equals((Object)"TextInputAction.newline")) break;
                        n4 = 0;
                        break block21;
                    }
                    case 1241689507: {
                        if (!string2.equals((Object)"TextInputAction.go")) break;
                        n4 = 4;
                        break block21;
                    }
                    case 469250275: {
                        if (!string2.equals((Object)"TextInputAction.search")) break;
                        n4 = 5;
                        break block21;
                    }
                    case -736940669: {
                        if (!string2.equals((Object)"TextInputAction.send")) break;
                        n4 = 6;
                        break block21;
                    }
                    case -737080013: {
                        if (!string2.equals((Object)"TextInputAction.none")) break;
                        n4 = 1;
                        break block21;
                    }
                    case -737089298: {
                        if (!string2.equals((Object)"TextInputAction.next")) break;
                        n4 = 7;
                        break block21;
                    }
                    case -737377923: {
                        if (!string2.equals((Object)"TextInputAction.done")) break;
                        n4 = 3;
                        break block21;
                    }
                    case -810971940: {
                        if (!string2.equals((Object)"TextInputAction.unspecified")) break;
                        n4 = 2;
                        break block21;
                    }
                }
                n4 = -1;
            }
            switch (n4) {
                default: {
                    return n3;
                }
                case 8: {
                    return 7;
                }
                case 7: {
                    return 5;
                }
                case 6: {
                    return 4;
                }
                case 5: {
                    return 3;
                }
                case 4: {
                    return 2;
                }
                case 3: {
                    return 6;
                }
                case 2: {
                    return n3;
                }
                case 0: 
                case 1: 
            }
            return n2;
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final TextInputType type;

        public InputType(TextInputType textInputType, boolean bl, boolean bl2) {
            this.type = textInputType;
            this.isSigned = bl;
            this.isDecimal = bl2;
        }

        public static InputType fromJson(JSONObject jSONObject) {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public static final class TextCapitalization
    extends Enum<TextCapitalization> {
        private static final /* synthetic */ TextCapitalization[] $VALUES;
        public static final /* enum */ TextCapitalization CHARACTERS = new TextCapitalization("TextCapitalization.characters");
        public static final /* enum */ TextCapitalization NONE;
        public static final /* enum */ TextCapitalization SENTENCES;
        public static final /* enum */ TextCapitalization WORDS;
        private final String encodedName;

        static {
            WORDS = new TextCapitalization("TextCapitalization.words");
            SENTENCES = new TextCapitalization("TextCapitalization.sentences");
            NONE = new TextCapitalization("TextCapitalization.none");
            TextCapitalization[] arrtextCapitalization = new TextCapitalization[]{CHARACTERS, WORDS, SENTENCES, NONE};
            $VALUES = arrtextCapitalization;
        }

        private TextCapitalization(String string3) {
            this.encodedName = string3;
        }

        static TextCapitalization fromValue(String string2) {
            NoSuchFieldException noSuchFieldException;
            for (TextCapitalization textCapitalization : TextCapitalization.values()) {
                if (!textCapitalization.encodedName.equals((Object)string2)) continue;
                return textCapitalization;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such TextCapitalization: ");
            stringBuilder.append(string2);
            noSuchFieldException = new NoSuchFieldException(stringBuilder.toString());
            throw noSuchFieldException;
        }

        public static TextCapitalization valueOf(String string2) {
            return (TextCapitalization)Enum.valueOf(TextCapitalization.class, (String)string2);
        }

        public static TextCapitalization[] values() {
            return (TextCapitalization[])$VALUES.clone();
        }
    }

    public static class TextEditState {
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public TextEditState(String string2, int n2, int n3) {
            this.text = string2;
            this.selectionStart = n2;
            this.selectionEnd = n3;
        }

        public static TextEditState fromJson(JSONObject jSONObject) {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"));
        }
    }

    public static interface TextInputMethodHandler {
        public void clearClient();

        public void hide();

        public void setClient(int var1, Configuration var2);

        public void setEditingState(TextEditState var1);

        public void setPlatformViewClient(int var1);

        public void show();
    }

    public static final class TextInputType
    extends Enum<TextInputType> {
        private static final /* synthetic */ TextInputType[] $VALUES;
        public static final /* enum */ TextInputType DATETIME;
        public static final /* enum */ TextInputType EMAIL_ADDRESS;
        public static final /* enum */ TextInputType MULTILINE;
        public static final /* enum */ TextInputType NUMBER;
        public static final /* enum */ TextInputType PHONE;
        public static final /* enum */ TextInputType TEXT;
        public static final /* enum */ TextInputType URL;
        public static final /* enum */ TextInputType VISIBLE_PASSWORD;
        private final String encodedName;

        static {
            TEXT = new TextInputType("TextInputType.text");
            DATETIME = new TextInputType("TextInputType.datetime");
            NUMBER = new TextInputType("TextInputType.number");
            PHONE = new TextInputType("TextInputType.phone");
            MULTILINE = new TextInputType("TextInputType.multiline");
            EMAIL_ADDRESS = new TextInputType("TextInputType.emailAddress");
            URL = new TextInputType("TextInputType.url");
            VISIBLE_PASSWORD = new TextInputType("TextInputType.visiblePassword");
            TextInputType[] arrtextInputType = new TextInputType[]{TEXT, DATETIME, NUMBER, PHONE, MULTILINE, EMAIL_ADDRESS, URL, VISIBLE_PASSWORD};
            $VALUES = arrtextInputType;
        }

        private TextInputType(String string3) {
            this.encodedName = string3;
        }

        static TextInputType fromValue(String string2) {
            NoSuchFieldException noSuchFieldException;
            for (TextInputType textInputType : TextInputType.values()) {
                if (!textInputType.encodedName.equals((Object)string2)) continue;
                return textInputType;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such TextInputType: ");
            stringBuilder.append(string2);
            noSuchFieldException = new NoSuchFieldException(stringBuilder.toString());
            throw noSuchFieldException;
        }

        public static TextInputType valueOf(String string2) {
            return (TextInputType)Enum.valueOf(TextInputType.class, (String)string2);
        }

        public static TextInputType[] values() {
            return (TextInputType[])$VALUES.clone();
        }
    }

}

