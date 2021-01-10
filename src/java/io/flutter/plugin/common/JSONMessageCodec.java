/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.JSONUtil
 *  io.flutter.plugin.common.MessageCodec
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.JSONUtil;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StringCodec;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class JSONMessageCodec
implements MessageCodec<Object> {
    public static final JSONMessageCodec INSTANCE = new JSONMessageCodec();

    private JSONMessageCodec() {
    }

    public Object decodeMessage(ByteBuffer byteBuffer) {
        block4 : {
            if (byteBuffer == null) {
                return null;
            }
            try {
                JSONTokener jSONTokener = new JSONTokener((String)StringCodec.INSTANCE.decodeMessage(byteBuffer));
                Object object = jSONTokener.nextValue();
                if (jSONTokener.more()) break block4;
                return object;
            }
            catch (JSONException jSONException) {
                throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
            }
        }
        throw new IllegalArgumentException("Invalid JSON");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ByteBuffer encodeMessage(Object object) {
        String string;
        StringCodec stringCodec;
        if (object == null) {
            return null;
        }
        Object object2 = JSONUtil.wrap((Object)object);
        if (object2 instanceof String) {
            stringCodec = StringCodec.INSTANCE;
            string = JSONObject.quote((String)((String)object2));
            do {
                return stringCodec.encodeMessage(string);
                break;
            } while (true);
        }
        stringCodec = StringCodec.INSTANCE;
        string = object2.toString();
        return stringCodec.encodeMessage(string);
    }
}

