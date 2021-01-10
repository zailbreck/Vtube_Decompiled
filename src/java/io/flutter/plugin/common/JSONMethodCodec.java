/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.FlutterException
 *  io.flutter.plugin.common.JSONUtil
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodCodec
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.FlutterException;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugin.common.JSONUtil;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodCodec;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class JSONMethodCodec
implements MethodCodec {
    public static final JSONMethodCodec INSTANCE = new JSONMethodCodec();

    private JSONMethodCodec() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object decodeEnvelope(ByteBuffer byteBuffer) {
        try {
            Object object = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (object instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray)object;
                if (jSONArray.length() == 1) {
                    return this.unwrapNull(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object object2 = jSONArray.get(0);
                    Object object3 = this.unwrapNull(jSONArray.opt(1));
                    Object object4 = this.unwrapNull(jSONArray.opt(2));
                    if (object2 instanceof String && (object3 == null || object3 instanceof String)) {
                        throw new FlutterException((String)object2, (String)object3, object4);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid envelope: ");
            stringBuilder.append(object);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
        try {
            Object object = JSONMessageCodec.INSTANCE.decodeMessage(byteBuffer);
            if (object instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject)object;
                Object object2 = jSONObject.get("method");
                Object object3 = this.unwrapNull(jSONObject.opt("args"));
                if (object2 instanceof String) {
                    return new MethodCall((String)object2, object3);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid method call: ");
            stringBuilder.append(object);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    public ByteBuffer encodeErrorEnvelope(String string, String string2, Object object) {
        return JSONMessageCodec.INSTANCE.encodeMessage((Object)new JSONArray().put((Object)string).put(JSONUtil.wrap((Object)string2)).put(JSONUtil.wrap((Object)object)));
    }

    public ByteBuffer encodeMethodCall(MethodCall methodCall) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (Object)methodCall.method);
            jSONObject.put("args", JSONUtil.wrap((Object)methodCall.arguments));
            ByteBuffer byteBuffer = JSONMessageCodec.INSTANCE.encodeMessage((Object)jSONObject);
            return byteBuffer;
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    public ByteBuffer encodeSuccessEnvelope(Object object) {
        return JSONMessageCodec.INSTANCE.encodeMessage((Object)new JSONArray().put(JSONUtil.wrap((Object)object)));
    }

    Object unwrapNull(Object object) {
        if (object == JSONObject.NULL) {
            object = null;
        }
        return object;
    }
}

