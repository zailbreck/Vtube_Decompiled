/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Objects
 */
package e.e.j;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

public class c {
    public static int a(Object object) {
        if (object != null) {
            return object.hashCode();
        }
        return 0;
    }

    public static /* varargs */ int a(Object ... arrobject) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash((Object[])arrobject);
        }
        return Arrays.hashCode((Object[])arrobject);
    }

    public static boolean a(Object object, Object object2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals((Object)object, (Object)object2);
        }
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }
}

