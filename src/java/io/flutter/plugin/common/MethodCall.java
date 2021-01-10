/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  org.json.JSONObject
 */
package io.flutter.plugin.common;

import java.util.Map;
import org.json.JSONObject;

public final class MethodCall {
    public final Object arguments;
    public final String method;

    public MethodCall(String string2, Object object) {
        this.method = string2;
        this.arguments = object;
    }

    public <T> T argument(String string2) {
        Object object = this.arguments;
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            return (T)((Map)object).get((Object)string2);
        }
        if (object instanceof JSONObject) {
            return (T)((JSONObject)object).opt(string2);
        }
        throw new ClassCastException();
    }

    public <T> T arguments() {
        return (T)this.arguments;
    }

    public boolean hasArgument(String string2) {
        Object object = this.arguments;
        if (object == null) {
            return false;
        }
        if (object instanceof Map) {
            return ((Map)object).containsKey((Object)string2);
        }
        if (object instanceof JSONObject) {
            return ((JSONObject)object).has(string2);
        }
        throw new ClassCastException();
    }
}

