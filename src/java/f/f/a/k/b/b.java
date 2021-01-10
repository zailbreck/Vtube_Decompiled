/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.k.b;

public final class b
extends Throwable {
    public b(Exception exception) {
        super((Throwable)exception);
    }

    public b(String string) {
        super(string);
    }

    public final void a(Class<?> class_) {
    }

    public final void a(String string) {
    }

    public final String toString() {
        if (this.getCause() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(b.class.getName());
            stringBuilder.append(": ");
            stringBuilder.append((Object)this.getCause());
            return stringBuilder.toString();
        }
        return super.toString();
    }
}

