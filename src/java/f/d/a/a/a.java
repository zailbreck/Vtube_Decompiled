/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package f.d.a.a;

import java.util.Arrays;

public final class a {
    public static b a(Object object) {
        return new b(object.getClass().getSimpleName(), null);
    }

    public static final class b {
        private final String a;
        private final a b;
        private a c;
        private boolean d;

        private b(String string) {
            this.c = this.b = new a(null);
            this.d = false;
            f.d.a.a.b.a(string);
            this.a = string;
        }

        /* synthetic */ b(String string, f.d.a.a.a$a a2) {
            super(string);
        }

        private a a() {
            a a2;
            this.c.c = a2 = new a(null);
            this.c = a2;
            return a2;
        }

        private b b(Object object) {
            b.super.a().b = object;
            return this;
        }

        public b a(Object object) {
            b.super.b(object);
            return this;
        }

        public String toString() {
            boolean bl = this.d;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.a);
            stringBuilder.append('{');
            a a2 = this.b.c;
            String string = "";
            while (a2 != null) {
                Object object = a2.b;
                if (!bl || object != null) {
                    stringBuilder.append(string);
                    String string2 = a2.a;
                    if (string2 != null) {
                        stringBuilder.append(string2);
                        stringBuilder.append('=');
                    }
                    if (object != null && object.getClass().isArray()) {
                        String string3 = Arrays.deepToString((Object[])new Object[]{object});
                        stringBuilder.append((CharSequence)string3, 1, string3.length() - 1);
                    } else {
                        stringBuilder.append(object);
                    }
                    string = ", ";
                }
                a2 = a2.c;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        private static final class a {
            String a;
            Object b;
            a c;

            private a() {
            }

            /* synthetic */ a(f.d.a.a.a$a a2) {
            }
        }

    }

}

