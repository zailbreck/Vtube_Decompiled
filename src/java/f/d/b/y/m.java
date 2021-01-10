/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.ObjectInputStream
 *  java.io.ObjectStreamClass
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 */
package f.d.b.y;

import f.d.b.y.m;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class m {
    public static m a() {
        try {
            Class class_ = Class.forName((String)"sun.misc.Unsafe");
            Field field = class_.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            Object object = field.get(null);
            m m2 = new m(class_.getMethod("allocateInstance", new Class[]{Class.class}), object){
                final /* synthetic */ Method a;
                final /* synthetic */ Object b;
                {
                    this.a = method;
                    this.b = object;
                }

                public <T> T a(Class<T> class_) {
                    m.b(class_);
                    return (T)this.a.invoke(this.b, new Object[]{class_});
                }
            };
            return m2;
        }
        catch (Exception exception) {
            try {
                Method method = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                method.setAccessible(true);
                int n2 = (Integer)method.invoke(null, new Object[]{Object.class});
                Class[] arrclass = new Class[]{Class.class, Integer.TYPE};
                Method method2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", arrclass);
                method2.setAccessible(true);
                m m3 = new m(method2, n2){
                    final /* synthetic */ Method a;
                    final /* synthetic */ int b;
                    {
                        this.a = method;
                        this.b = n2;
                    }

                    public <T> T a(Class<T> class_) {
                        m.b(class_);
                        Method method = this.a;
                        Object[] arrobject = new Object[]{class_, this.b};
                        return (T)method.invoke(null, arrobject);
                    }
                };
                return m3;
            }
            catch (Exception exception2) {
                try {
                    Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    method.setAccessible(true);
                    m m4 = new m(method){
                        final /* synthetic */ Method a;
                        {
                            this.a = method;
                        }

                        public <T> T a(Class<T> class_) {
                            m.b(class_);
                            return (T)this.a.invoke(null, new Object[]{class_, Object.class});
                        }
                    };
                    return m4;
                }
                catch (Exception exception3) {
                    return new m(){

                        public <T> T a(Class<T> class_) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Cannot allocate ");
                            stringBuilder.append(class_);
                            throw new UnsupportedOperationException(stringBuilder.toString());
                        }
                    };
                }
            }
        }
    }

    static void b(Class<?> class_) {
        int n2 = class_.getModifiers();
        if (!Modifier.isInterface((int)n2)) {
            if (!Modifier.isAbstract((int)n2)) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Abstract class can't be instantiated! Class name: ");
            stringBuilder.append(class_.getName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Interface can't be instantiated! Interface name: ");
        stringBuilder.append(class_.getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public abstract <T> T a(Class<T> var1);
}

