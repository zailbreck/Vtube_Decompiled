/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchFieldException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 *  java.math.BigDecimal
 *  java.math.BigInteger
 *  java.net.InetAddress
 *  java.net.URI
 *  java.net.URL
 *  java.util.BitSet
 *  java.util.Calendar
 *  java.util.Currency
 *  java.util.GregorianCalendar
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.UUID
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicInteger
 *  java.util.concurrent.atomic.AtomicIntegerArray
 */
package f.d.b.y.n;

import f.d.b.y.n.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class n {
    public static final f.d.b.v<String> A;
    public static final f.d.b.v<BigDecimal> B;
    public static final f.d.b.v<BigInteger> C;
    public static final f.d.b.w D;
    public static final f.d.b.v<StringBuilder> E;
    public static final f.d.b.w F;
    public static final f.d.b.v<StringBuffer> G;
    public static final f.d.b.w H;
    public static final f.d.b.v<URL> I;
    public static final f.d.b.w J;
    public static final f.d.b.v<URI> K;
    public static final f.d.b.w L;
    public static final f.d.b.v<InetAddress> M;
    public static final f.d.b.w N;
    public static final f.d.b.v<UUID> O;
    public static final f.d.b.w P;
    public static final f.d.b.v<Currency> Q;
    public static final f.d.b.w R;
    public static final f.d.b.w S;
    public static final f.d.b.v<Calendar> T;
    public static final f.d.b.w U;
    public static final f.d.b.v<Locale> V;
    public static final f.d.b.w W;
    public static final f.d.b.v<f.d.b.l> X;
    public static final f.d.b.w Y;
    public static final f.d.b.w Z;
    public static final f.d.b.v<Class> a;
    public static final f.d.b.w b;
    public static final f.d.b.v<BitSet> c;
    public static final f.d.b.w d;
    public static final f.d.b.v<Boolean> e;
    public static final f.d.b.v<Boolean> f;
    public static final f.d.b.w g;
    public static final f.d.b.v<Number> h;
    public static final f.d.b.w i;
    public static final f.d.b.v<Number> j;
    public static final f.d.b.w k;
    public static final f.d.b.v<Number> l;
    public static final f.d.b.w m;
    public static final f.d.b.v<AtomicInteger> n;
    public static final f.d.b.w o;
    public static final f.d.b.v<AtomicBoolean> p;
    public static final f.d.b.w q;
    public static final f.d.b.v<AtomicIntegerArray> r;
    public static final f.d.b.w s;
    public static final f.d.b.v<Number> t;
    public static final f.d.b.v<Number> u;
    public static final f.d.b.v<Number> v;
    public static final f.d.b.v<Number> w;
    public static final f.d.b.w x;
    public static final f.d.b.v<Character> y;
    public static final f.d.b.w z;

    static {
        a = new f.d.b.v<Class>(){

            public Class read(f.d.b.a0.a a2) {
                throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void write(f.d.b.a0.c c2, Class class_) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Attempted to serialize java.lang.Class: ");
                stringBuilder.append(class_.getName());
                stringBuilder.append(". Forgot to register a type adapter?");
                throw new java.lang.UnsupportedOperationException(stringBuilder.toString());
            }
        }.nullSafe();
        b = n.a(Class.class, a);
        c = new f.d.b.v<BitSet>(){

            public void a(f.d.b.a0.c c2, BitSet bitSet) {
                c2.a();
                int n2 = bitSet.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    c2.f((long)bitSet.get(i2));
                }
                c2.m();
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public BitSet read(f.d.b.a0.a a2) {
                BitSet bitSet = new BitSet();
                a2.a();
                f.d.b.a0.b b2 = a2.A();
                int n2 = 0;
                do {
                    int n3;
                    block15 : {
                        block13 : {
                            block14 : {
                                if (b2 == f.d.b.a0.b.c) {
                                    a2.n();
                                    return bitSet;
                                }
                                int n4 = b0.a[b2.ordinal()];
                                if (n4 == (n3 = 1)) break block14;
                                if (n4 != 2) {
                                    if (n4 != 3) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("Invalid bitset value type: ");
                                        stringBuilder.append((Object)((Object)b2));
                                        throw new f.d.b.t(stringBuilder.toString());
                                    }
                                    String string = a2.z();
                                    try {
                                        int n5 = Integer.parseInt((String)string);
                                        if (n5 != 0) {
                                        }
                                        break block13;
                                    }
                                    catch (java.lang.NumberFormatException numberFormatException) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("Error: Expecting: bitset number value (1, 0), Found: ");
                                        stringBuilder.append(string);
                                        throw new f.d.b.t(stringBuilder.toString());
                                    }
                                }
                                n3 = a2.t() ? 1 : 0;
                                break block15;
                            }
                            if (a2.v() != 0) break block15;
                        }
                        n3 = 0;
                    }
                    if (n3 != 0) {
                        bitSet.set(n2);
                    }
                    ++n2;
                    b2 = a2.A();
                } while (true);
            }
        }.nullSafe();
        d = n.a(BitSet.class, c);
        e = new f.d.b.v<Boolean>(){

            public void a(f.d.b.a0.c c2, Boolean bl) {
                c2.a(bl);
            }

            public Boolean read(f.d.b.a0.a a2) {
                f.d.b.a0.b b2 = a2.A();
                if (b2 == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                if (b2 == f.d.b.a0.b.g) {
                    return Boolean.parseBoolean((String)a2.z());
                }
                return a2.t();
            }
        };
        f = new f.d.b.v<Boolean>(){

            public void a(f.d.b.a0.c c2, Boolean bl) {
                String string = bl == null ? "null" : bl.toString();
                c2.d(string);
            }

            public Boolean read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return Boolean.valueOf((String)a2.z());
            }
        };
        g = n.a(Boolean.TYPE, Boolean.class, e);
        h = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    Byte by = (byte)a2.v();
                    return by;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        i = n.a(Byte.TYPE, Byte.class, h);
        j = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    Short s2 = (short)a2.v();
                    return s2;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        k = n.a(Short.TYPE, Short.class, j);
        l = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    Integer n2 = a2.v();
                    return n2;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        m = n.a(Integer.TYPE, Integer.class, l);
        n = new f.d.b.v<AtomicInteger>(){

            public void a(f.d.b.a0.c c2, AtomicInteger atomicInteger) {
                c2.f(atomicInteger.get());
            }

            public AtomicInteger read(f.d.b.a0.a a2) {
                try {
                    AtomicInteger atomicInteger = new AtomicInteger(a2.v());
                    return atomicInteger;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        }.nullSafe();
        o = n.a(AtomicInteger.class, n);
        p = new f.d.b.v<AtomicBoolean>(){

            public void a(f.d.b.a0.c c2, AtomicBoolean atomicBoolean) {
                c2.d(atomicBoolean.get());
            }

            public AtomicBoolean read(f.d.b.a0.a a2) {
                return new AtomicBoolean(a2.t());
            }
        }.nullSafe();
        q = n.a(AtomicBoolean.class, p);
        r = new f.d.b.v<AtomicIntegerArray>(){

            public void a(f.d.b.a0.c c2, AtomicIntegerArray atomicIntegerArray) {
                c2.a();
                int n2 = atomicIntegerArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    c2.f(atomicIntegerArray.get(i2));
                }
                c2.m();
            }

            public AtomicIntegerArray read(f.d.b.a0.a a2) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                a2.a();
                while (a2.q()) {
                    try {
                        arrayList.add((Object)a2.v());
                    }
                    catch (java.lang.NumberFormatException numberFormatException) {
                        throw new f.d.b.t(numberFormatException);
                    }
                }
                a2.n();
                int n2 = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(n2);
                for (int i2 = 0; i2 < n2; ++i2) {
                    atomicIntegerArray.set(i2, ((Integer)arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }
        }.nullSafe();
        s = n.a(AtomicIntegerArray.class, r);
        t = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    java.lang.Long l2 = a2.w();
                    return l2;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        u = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return java.lang.Float.valueOf((float)((float)a2.u()));
            }
        };
        v = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return a2.u();
            }
        };
        w = new f.d.b.v<Number>(){

            public void a(f.d.b.a0.c c2, Number number) {
                c2.a(number);
            }

            public Number read(f.d.b.a0.a a2) {
                f.d.b.a0.b b2 = a2.A();
                int n2 = b0.a[b2.ordinal()];
                if (n2 != 1 && n2 != 3) {
                    if (n2 == 4) {
                        a2.y();
                        return null;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expecting number, got: ");
                    stringBuilder.append((Object)((Object)b2));
                    throw new f.d.b.t(stringBuilder.toString());
                }
                return new f.d.b.y.g(a2.z());
            }
        };
        x = n.a(Number.class, w);
        y = new f.d.b.v<Character>(){

            public void a(f.d.b.a0.c c2, Character c3) {
                String string = c3 == null ? null : String.valueOf((Object)c3);
                c2.d(string);
            }

            public Character read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                String string = a2.z();
                if (string.length() == 1) {
                    return Character.valueOf((char)string.charAt(0));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Expecting character, got: ");
                stringBuilder.append(string);
                throw new f.d.b.t(stringBuilder.toString());
            }
        };
        z = n.a(Character.TYPE, Character.class, y);
        A = new f.d.b.v<String>(){

            public void a(f.d.b.a0.c c2, String string) {
                c2.d(string);
            }

            public String read(f.d.b.a0.a a2) {
                f.d.b.a0.b b2 = a2.A();
                if (b2 == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                if (b2 == f.d.b.a0.b.i) {
                    return Boolean.toString((boolean)a2.t());
                }
                return a2.z();
            }
        };
        B = new f.d.b.v<BigDecimal>(){

            public void a(f.d.b.a0.c c2, BigDecimal bigDecimal) {
                c2.a((Number)bigDecimal);
            }

            public BigDecimal read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    BigDecimal bigDecimal = new BigDecimal(a2.z());
                    return bigDecimal;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        C = new f.d.b.v<BigInteger>(){

            public void a(f.d.b.a0.c c2, BigInteger bigInteger) {
                c2.a((Number)bigInteger);
            }

            public BigInteger read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                try {
                    BigInteger bigInteger = new BigInteger(a2.z());
                    return bigInteger;
                }
                catch (java.lang.NumberFormatException numberFormatException) {
                    throw new f.d.b.t(numberFormatException);
                }
            }
        };
        D = n.a(String.class, A);
        E = new f.d.b.v<StringBuilder>(){

            public void a(f.d.b.a0.c c2, StringBuilder stringBuilder) {
                String string = stringBuilder == null ? null : stringBuilder.toString();
                c2.d(string);
            }

            public StringBuilder read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return new StringBuilder(a2.z());
            }
        };
        F = n.a(StringBuilder.class, E);
        G = new f.d.b.v<StringBuffer>(){

            public void a(f.d.b.a0.c c2, StringBuffer stringBuffer) {
                String string = stringBuffer == null ? null : stringBuffer.toString();
                c2.d(string);
            }

            public StringBuffer read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return new StringBuffer(a2.z());
            }
        };
        H = n.a(StringBuffer.class, G);
        I = new f.d.b.v<URL>(){

            public void a(f.d.b.a0.c c2, URL uRL) {
                String string = uRL == null ? null : uRL.toExternalForm();
                c2.d(string);
            }

            public URL read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                String string = a2.z();
                if ("null".equals((Object)string)) {
                    return null;
                }
                return new URL(string);
            }
        };
        J = n.a(URL.class, I);
        K = new f.d.b.v<URI>(){

            public void a(f.d.b.a0.c c2, URI uRI) {
                String string = uRI == null ? null : uRI.toASCIIString();
                c2.d(string);
            }

            public URI read(f.d.b.a0.a a2) {
                String string;
                block4 : {
                    if (a2.A() == f.d.b.a0.b.j) {
                        a2.y();
                        return null;
                    }
                    try {
                        string = a2.z();
                        if (!"null".equals((Object)string)) break block4;
                        return null;
                    }
                    catch (java.net.URISyntaxException uRISyntaxException) {
                        throw new f.d.b.m(uRISyntaxException);
                    }
                }
                URI uRI = new URI(string);
                return uRI;
            }
        };
        L = n.a(URI.class, K);
        M = new f.d.b.v<InetAddress>(){

            public void a(f.d.b.a0.c c2, InetAddress inetAddress) {
                String string = inetAddress == null ? null : inetAddress.getHostAddress();
                c2.d(string);
            }

            public InetAddress read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return InetAddress.getByName((String)a2.z());
            }
        };
        N = n.b(InetAddress.class, M);
        O = new f.d.b.v<UUID>(){

            public void a(f.d.b.a0.c c2, UUID uUID) {
                String string = uUID == null ? null : uUID.toString();
                c2.d(string);
            }

            public UUID read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return UUID.fromString((String)a2.z());
            }
        };
        P = n.a(UUID.class, O);
        Q = new f.d.b.v<Currency>(){

            public void a(f.d.b.a0.c c2, Currency currency) {
                c2.d(currency.getCurrencyCode());
            }

            public Currency read(f.d.b.a0.a a2) {
                return Currency.getInstance((String)a2.z());
            }
        }.nullSafe();
        R = n.a(Currency.class, Q);
        S = new f.d.b.w(){

            public <T> f.d.b.v<T> create(f.d.b.f f2, f.d.b.z.a<T> a2) {
                if (a2.a() != java.sql.Timestamp.class) {
                    return null;
                }
                return new f.d.b.v<java.sql.Timestamp>(this, f2.a(java.util.Date.class)){
                    final /* synthetic */ f.d.b.v a;
                    {
                        this.a = v2;
                    }

                    public void a(f.d.b.a0.c c2, java.sql.Timestamp timestamp) {
                        this.a.write(c2, timestamp);
                    }

                    public java.sql.Timestamp read(f.d.b.a0.a a2) {
                        java.util.Date date = (java.util.Date)this.a.read(a2);
                        if (date != null) {
                            return new java.sql.Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
        };
        T = new f.d.b.v<Calendar>(){

            public void a(f.d.b.a0.c c2, Calendar calendar) {
                if (calendar == null) {
                    c2.r();
                    return;
                }
                c2.b();
                c2.b("year");
                c2.f(calendar.get(1));
                c2.b("month");
                c2.f(calendar.get(2));
                c2.b("dayOfMonth");
                c2.f(calendar.get(5));
                c2.b("hourOfDay");
                c2.f(calendar.get(11));
                c2.b("minute");
                c2.f(calendar.get(12));
                c2.b("second");
                c2.f(calendar.get(13));
                c2.n();
            }

            public Calendar read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                a2.b();
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                while (a2.A() != f.d.b.a0.b.e) {
                    String string = a2.x();
                    int n8 = a2.v();
                    if ("year".equals((Object)string)) {
                        n2 = n8;
                        continue;
                    }
                    if ("month".equals((Object)string)) {
                        n3 = n8;
                        continue;
                    }
                    if ("dayOfMonth".equals((Object)string)) {
                        n4 = n8;
                        continue;
                    }
                    if ("hourOfDay".equals((Object)string)) {
                        n5 = n8;
                        continue;
                    }
                    if ("minute".equals((Object)string)) {
                        n6 = n8;
                        continue;
                    }
                    if (!"second".equals((Object)string)) continue;
                    n7 = n8;
                }
                a2.o();
                GregorianCalendar gregorianCalendar = new GregorianCalendar(n2, n3, n4, n5, n6, n7);
                return gregorianCalendar;
            }
        };
        U = n.b(Calendar.class, GregorianCalendar.class, T);
        V = new f.d.b.v<Locale>(){

            public void a(f.d.b.a0.c c2, Locale locale) {
                String string = locale == null ? null : locale.toString();
                c2.d(string);
            }

            /*
             * Exception decompiling
             */
            public Locale read(}
        java.lang.IllegalStateException: Parameters not created
        
        