/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package f.f.a.k.b;

import java.lang.reflect.Method;

public final class a {
    private static a a;

    public static <T> b<T> a(ClassLoader classLoader, String string) {
        try {
            b b2 = new b(classLoader.loadClass(string));
            return b2;
        }
        catch (Exception exception) {
            a.b(new f.f.a.k.b.b(exception));
            return new b(null);
        }
    }

    static /* synthetic */ void a(f.f.a.k.b.b b2) {
        a.b(b2);
    }

    private static void b(f.f.a.k.b.b b2) {
        a a2 = a;
        if (a2 != null && a2.a(b2)) {
            return;
        }
        throw b2;
    }

    public static interface a {
        public boolean a(f.f.a.k.b.b var1);
    }

    public static final class b<C> {
        protected Class<C> a;

        public b(Class<C> class_) {
            this.a = class_;
        }

        public final /* varargs */ c a(String string, Class<?> ... arrclass) {
            return new c(this.a, string, arrclass, 0);
        }
    }

    public static final class c {
        protected final Method a;

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        c(Class<?> var1_1, String var2_4, Class<?>[] var3_3, int var4) {
            super();
            var5_5 = null;
            if (var1_1 == null) {
                this.a = null;
                return;
            }
            var5_5 = var1_1.getDeclaredMethod(var2_4, var3_3);
            if (var4 > 0 && (var4 & var5_5.getModifiers()) != var4) {
                var9_6 = new StringBuilder();
                var9_6.append((Object)var5_5);
                var9_6.append(" does not match modifiers: ");
                var9_6.append(var4);
                a.a(new f.f.a.k.b.b(var9_6.toString()));
            }
            var5_5.setAccessible(true);
lbl15: // 2 sources:
            do {
                this.a = var5_5;
                return;
                break;
            } while (true);
            {
                catch (Throwable var8_7) {
                }
                catch (NoSuchMethodException var6_8) {}
                {
                    var7_9 = new f.f.a.k.b.b((Exception)var6_8);
                    var7_9.a(var1_1);
                    var7_9.a(var2_4);
                    a.a(var7_9);
                    ** continue;
                }
            }
            this.a = var5_5;
            throw var8_7;
        }

        public final /* varargs */ Object a(Object object, Object ... arrobject) {
            try {
                Object object2 = this.a.invoke(object, arrobject);
                return object2;
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
                return null;
            }
        }

        public final Method a() {
            return this.a;
        }
    }

}

