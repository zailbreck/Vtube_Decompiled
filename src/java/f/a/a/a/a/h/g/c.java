/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package f.a.a.a.a.h.g;

import java.util.HashMap;

public class c<k, v>
extends HashMap<k, v> {
    public v get(Object object) {
        if (object != null && !this.containsKey(object) && object instanceof String) {
            String string = ((String)object).toLowerCase();
            if (this.containsKey((Object)string)) {
                return this.get(string);
            }
            return null;
        }
        return (v)super.get(object);
    }
}

