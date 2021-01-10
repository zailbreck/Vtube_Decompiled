/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Appendable
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.Type
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicLongArray
 */
package f.d.b;

import f.d.b.f;
import f.d.b.h;
import f.d.b.l;
import f.d.b.m;
import f.d.b.t;
import f.d.b.u;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.k;
import f.d.b.y.n.g;
import f.d.b.y.n.i;
import f.d.b.y.n.j;
import f.d.b.y.n.n;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/*
 * Exception performing whole class analysis.
 */
public final class f {
    private static final f.d.b.z.a<?> k;
    private final ThreadLocal<Map<f.d.b.z.a<?>, f<?>>> a;
    private final Map<f.d.b.z.a<?>, v<?>> b;
    private final f.d.b.y.c c;
    private final f.d.b.y.n.d d;
    final List<w> e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final boolean j;

    static {
        k = f.d.b.z.a.a(Object.class);
    }

    f(f.d.b.y.d d2, f.d.b.e e2, Map<Type, h<?>> map, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, u u2, String string, int n2, int n3, List<w> list, List<w> list2, List<w> list3) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.c = new f.d.b.y.c(map);
        this.f = bl;
        this.g = bl3;
        this.h = bl4;
        this.i = bl5;
        this.j = bl6;
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)n.Y);
        arrayList.add((Object)f.d.b.y.n.h.b);
        arrayList.add((Object)d2);
        arrayList.addAll(list3);
        arrayList.add((Object)n.D);
        arrayList.add((Object)n.m);
        arrayList.add((Object)n.g);
        arrayList.add((Object)n.i);
        arrayList.add((Object)n.k);
        v<Number> v2 = f.a(u2);
        arrayList.add((Object)n.a(Long.TYPE, Long.class, v2));
        arrayList.add((Object)n.a(Double.TYPE, Double.class, f.super.a(bl7)));
        arrayList.add((Object)n.a(Float.TYPE, Float.class, f.super.b(bl7)));
        arrayList.add((Object)n.x);
        arrayList.add((Object)n.o);
        arrayList.add((Object)n.q);
        arrayList.add((Object)n.a(AtomicLong.class, f.a(v2)));
        arrayList.add((Object)n.a(AtomicLongArray.class, f.b(v2)));
        arrayList.add((Object)n.s);
        arrayList.add((Object)n.z);
        arrayList.add((Object)n.F);
        arrayList.add((Object)n.H);
        arrayList.add((Object)n.a(BigDecimal.class, n.B));
        arrayList.add((Object)n.a(BigInteger.class, n.C));
        arrayList.add((Object)n.J);
        arrayList.add((Object)n.L);
        arrayList.add((Object)n.P);
        arrayList.add((Object)n.R);
        arrayList.add((Object)n.W);
        arrayList.add((Object)n.N);
        arrayList.add((Object)n.d);
        arrayList.add((Object)f.d.b.y.n.c.b);
        arrayList.add((Object)n.U);
        arrayList.add((Object)f.d.b.y.n.k.b);
        arrayList.add((Object)j.b);
        arrayList.add((Object)n.S);
        arrayList.add((Object)f.d.b.y.n.a.c);
        arrayList.add((Object)n.b);
        arrayList.add((Object)new f.d.b.y.n.b(this.c));
        arrayList.add((Object)new g(this.c, bl2));
        this.d = new f.d.b.y.n.d(this.c);
        arrayList.add((Object)this.d);
        arrayList.add((Object)n.Z);
        arrayList.add((Object)new i(this.c, e2, d2, this.d));
        this.e = Collections.unmodifiableList((List)arrayList);
    }

    private static v<Number> a(u u2) {
        if (u2 == u.b) {
            return n.t;
        }
        return new v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                if (number == null) {
                    c2.r();
                    return;
                }
                c2.d(number.toString());
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return a2.w();
            }
        };
    }

    private static v<AtomicLong> a(v<Number> v2) {
        return new v<AtomicLong>(v2){
            final /* synthetic */ v a;
            {
                this.a = v2;
            }

            public void a(f.d.b.a0.c c2, AtomicLong atomicLong) {
                this.a.write(c2, atomicLong.get());
            }

            public AtomicLong read(f.d.b.a0.a a2) {
                return new AtomicLong(((Number)this.a.read(a2)).longValue());
            }
        }.nullSafe();
    }

    private v<Number> a(boolean bl) {
        if (bl) {
            return n.v;
        }
        return new v<Number>((f)this){

            public void a(f.d.b.a0.c c2, Number number) {
                if (number == null) {
                    c2.r();
                    return;
                }
                f.a(number.doubleValue());
                c2.a(number);
            }

            public Double read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return a2.u();
            }
        };
    }

    static void a(double d2) {
        if (!Double.isNaN((double)d2) && !Double.isInfinite((double)d2)) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d2);
        stringBuilder.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static void a(Object object, f.d.b.a0.a a2) {
        if (object != null) {
            try {
                if (a2.A() == f.d.b.a0.b.k) {
                    return;
                }
                throw new m("JSON document was not fully consumed.");
            }
            catch (IOException iOException) {
                throw new m(iOException);
            }
            catch (f.d.b.a0.d d2) {
                throw new t((Throwable)d2);
            }
        }
    }

    private static v<AtomicLongArray> b(v<Number> v2) {
        return new v<AtomicLongArray>(v2){
            final /* synthetic */ v a;
            {
                this.a = v2;
            }

            public void a(f.d.b.a0.c c2, AtomicLongArray atomicLongArray) {
                c2.a();
                int n2 = atomicLongArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.a.write(c2, atomicLongArray.get(i2));
                }
                c2.m();
            }

            public AtomicLongArray read(f.d.b.a0.a a2) {
                ArrayList arrayList = new ArrayList();
                a2.a();
                while (a2.q()) {
                    arrayList.add((Object)((Number)this.a.read(a2)).longValue());
                }
                a2.n();
                int n2 = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(n2);
                for (int i2 = 0; i2 < n2; ++i2) {
                    atomicLongArray.set(i2, ((Long)arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }
        }.nullSafe();
    }

    private v<Number> b(boolean bl) {
        if (bl) {
            return n.u;
        }
        return new v<Number>((f)this){

            public void a(f.d.b.a0.c c2, Number number) {
                if (number == null) {
                    c2.r();
                    return;
                }
                f.a(number.floatValue());
                c2.a(number);
            }

            public Float read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return Float.valueOf((float)((float)a2.u()));
            }
        };
    }

    public f.d.b.a0.a a(Reader reader) {
        f.d.b.a0.a a2 = new f.d.b.a0.a(reader);
        a2.a(this.j);
        return a2;
    }

    public f.d.b.a0.c a(Writer writer) {
        if (this.g) {
            writer.write(")]}'\n");
        }
        f.d.b.a0.c c2 = new f.d.b.a0.c(writer);
        if (this.i) {
            c2.c("  ");
        }
        c2.c(this.f);
        return c2;
    }

    public <T> v<T> a(w w2, f.d.b.z.a<T> a2) {
        IllegalArgumentException illegalArgumentException;
        if (!this.e.contains((Object)w2)) {
            w2 = this.d;
        }
        boolean bl = false;
        for (w w3 : this.e) {
            if (!bl) {
                if (w3 != w2) continue;
                bl = true;
                continue;
            }
            v<T> v2 = w3.create((f)this, a2);
            if (v2 == null) continue;
            return v2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GSON cannot serialize ");
        stringBuilder.append(a2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public <T> v<T> a(f.d.b.z.a<T> a2) {
        v<T> v2;
        v v3;
        f f2;
        Map<f.d.b.z.a<?>, v<?>> map = this.b;
        f.d.b.z.a<Object> a3 = a2 == null ? k : a2;
        v v4 = (v)map.get(a3);
        if (v4 != null) {
            return v4;
        }
        Map map2 = (Map)this.a.get();
        boolean bl = false;
        if (map2 == null) {
            map2 = new HashMap();
            this.a.set((Object)map2);
            bl = true;
        }
        if ((f2 = map2.get(a2)) != null) {
            return f2;
        }
        try {
            v3 = }
    }
    java.lang.IllegalStateException: Inner class got unexpected class file - revert this change
    
    