/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package i.n;

import i.d;
import i.e;
import i.i.g;
import i.n.c;
import i.n.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class n
extends m {
    public static final int a(CharSequence charSequence) {
        i.k.b.d.c((Object)charSequence, "$this$lastIndex");
        return -1 + charSequence.length();
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2) {
        i.l.b b2 = !bl2 ? new i.l.d(i.l.e.a(n2, 0), i.l.e.b(n3, charSequence.length())) : i.l.e.c(i.l.e.b(n2, n.a(charSequence)), i.l.e.a(n3, 0));
        if (charSequence instanceof String && charSequence2 instanceof String) {
            int n4 = b2.a();
            int n5 = b2.b();
            int n6 = b2.c();
            if (n6 >= 0 ? n4 <= n5 : n4 >= n5) {
                do {
                    String string;
                    String string2;
                    int n7;
                    if (m.a(string = (String)charSequence2, 0, string2 = (String)charSequence, n4, n7 = charSequence2.length(), bl)) {
                        return n4;
                    }
                    if (n4 != n5) {
                        n4 += n6;
                        continue;
                    }
                    break;
                } while (true);
            }
        } else {
            int n8 = b2.a();
            int n9 = b2.b();
            int n10 = b2.c();
            if (n10 >= 0 ? n8 <= n9 : n8 >= n9) {
                do {
                    int n11;
                    if (n.a(charSequence2, 0, charSequence, n8, n11 = charSequence2.length(), bl)) {
                        return n8;
                    }
                    if (n8 == n9) break;
                    n8 += n10;
                } while (true);
            }
        }
        return -1;
    }

    static /* synthetic */ int a(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2, int n4, Object object) {
        boolean bl3 = (n4 & 16) != 0 ? false : bl2;
        return n.a(charSequence, charSequence2, n2, n3, bl, bl3);
    }

    public static final int a(CharSequence charSequence, String string, int n2, boolean bl) {
        i.k.b.d.c((Object)charSequence, "$this$indexOf");
        i.k.b.d.c(string, "string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).indexOf(string, n2);
        }
        return n.a(charSequence, string, n2, charSequence.length(), bl, false, 16, null);
    }

    public static /* synthetic */ int a(CharSequence charSequence, String string, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return n.a(charSequence, string, n2, bl);
    }

    private static final i.m.a<i.l.d> a(CharSequence charSequence, String[] arrstring, int n2, boolean bl, int n3) {
        boolean bl2 = n3 >= 0;
        if (bl2) {
            return new c(charSequence, n2, n3, (i.k.a.b<? super CharSequence, ? super Integer, d<Integer, Integer>>)new i.k.a.b<CharSequence, Integer, d<? extends Integer, ? extends Integer>>(i.i.a.a(arrstring), bl){
                final /* synthetic */ List b;
                final /* synthetic */ boolean c;
                {
                    this.b = list;
                    this.c = bl;
                    super(2);
                }

                @Override
                public final d<Integer, Integer> a(CharSequence charSequence, int n2) {
                    i.k.b.d.c((Object)charSequence, "$receiver");
                    d d2 = n.b(charSequence, (Collection<String>)((Collection)this.b), n2, this.c, false);
                    if (d2 != null) {
                        return e.a(d2.c(), ((String)d2.d()).length());
                    }
                    return null;
                }
            });
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n3);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    static /* synthetic */ i.m.a a(CharSequence charSequence, String[] arrstring, int n2, boolean bl, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        if ((n4 & 8) != 0) {
            n3 = 0;
        }
        return n.a(charSequence, arrstring, n2, bl, n3);
    }

    public static final String a(CharSequence charSequence, i.l.d d2) {
        i.k.b.d.c((Object)charSequence, "$this$substring");
        i.k.b.d.c(d2, "range");
        return charSequence.subSequence(d2.e().intValue(), 1 + d2.d()).toString();
    }

    private static final List<String> a(CharSequence charSequence, String string, boolean bl, int n2) {
        IllegalArgumentException illegalArgumentException;
        int n3 = 0;
        boolean bl2 = n2 >= 0;
        if (bl2) {
            int n4 = n.a(charSequence, string, 0, bl);
            if (n4 != -1 && n2 != 1) {
                boolean bl3 = n2 > 0;
                int n5 = 10;
                if (bl3) {
                    n5 = i.l.e.b(n2, n5);
                }
                ArrayList arrayList = new ArrayList(n5);
                do {
                    arrayList.add((Object)charSequence.subSequence(n3, n4).toString());
                    n3 = n4 + string.length();
                } while ((!bl3 || arrayList.size() != n2 - 1) && (n4 = n.a(charSequence, string, n3, bl)) != -1);
                arrayList.add((Object)charSequence.subSequence(n3, charSequence.length()).toString());
                return arrayList;
            }
            return g.a(charSequence.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Limit must be non-negative, but was ");
        stringBuilder.append(n2);
        stringBuilder.append('.');
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString().toString());
        throw illegalArgumentException;
    }

    public static final List<String> a(CharSequence charSequence, String[] arrstring, boolean bl, int n2) {
        i.k.b.d.c((Object)charSequence, "$this$split");
        i.k.b.d.c(arrstring, "delimiters");
        if (arrstring.length == 1) {
            String string = arrstring[0];
            int n3 = string.length();
            boolean bl2 = false;
            if (n3 == 0) {
                bl2 = true;
            }
            if (!bl2) {
                return n.a(charSequence, string, bl, n2);
            }
        }
        Iterable iterable = i.m.b.a(n.a(charSequence, arrstring, 0, bl, n2, 2, null));
        ArrayList arrayList = new ArrayList(g.a(iterable, 10));
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)n.a(charSequence, (i.l.d)iterator.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List a(CharSequence charSequence, String[] arrstring, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return n.a(charSequence, arrstring, bl, n2);
    }

    public static final boolean a(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4, boolean bl) {
        i.k.b.d.c((Object)charSequence, "$this$regionMatchesImpl");
        i.k.b.d.c((Object)charSequence2, "other");
        if (n3 >= 0 && n2 >= 0 && n2 <= charSequence.length() - n4) {
            if (n3 > charSequence2.length() - n4) {
                return false;
            }
            for (int i2 = 0; i2 < n4; ++i2) {
                if (i.n.b.a(charSequence.charAt(n2 + i2), charSequence2.charAt(n3 + i2), bl)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static final int b(CharSequence charSequence, String string, int n2, boolean bl) {
        i.k.b.d.c((Object)charSequence, "$this$lastIndexOf");
        i.k.b.d.c(string, "string");
        if (!bl && charSequence instanceof String) {
            return ((String)charSequence).lastIndexOf(string, n2);
        }
        return n.a(charSequence, (CharSequence)string, n2, 0, bl, true);
    }

    public static /* synthetic */ int b(CharSequence charSequence, String string, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = n.a(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return n.b(charSequence, string, n2, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final d<Integer, String> b(CharSequence charSequence, Collection<String> collection, int n2, boolean bl, boolean bl2) {
        String string;
        int n3;
        int n4;
        int n5;
        if (!bl && collection.size() == 1) {
            String string2 = g.b(collection);
            int n6 = !bl2 ? n.a(charSequence, string2, n2, false, 4, null) : n.b(charSequence, string2, n2, false, 4, null);
            if (n6 >= 0) return e.a(n6, string2);
            return null;
        }
        i.l.b b2 = !bl2 ? new i.l.d(i.l.e.a(n2, 0), charSequence.length()) : i.l.e.c(i.l.e.b(n2, n.a(charSequence)), 0);
        if (!(charSequence instanceof String)) {
            n3 = b2.a();
            n4 = b2.b();
            n5 = b2.c();
            if (n5 >= 0) {
                if (n3 > n4) return null;
            } else if (n3 < n4) return null;
        } else {
            n3 = b2.a();
            int n7 = b2.b();
            int n8 = b2.c();
            if (n8 >= 0) {
                if (n3 > n7) return null;
            } else if (n3 < n7) return null;
            do {
                Object object2;
                block13 : {
                    for (Object object2 : collection) {
                        int n9;
                        String string3;
                        String string4 = (String)object2;
                        if (!m.a(string4, 0, string3 = (String)charSequence, n3, n9 = string4.length(), bl)) continue;
                        break block13;
                    }
                    object2 = null;
                }
                string = (String)object2;
                if (string != null) {
                    return e.a(n3, string);
                }
                if (n3 == n7) return null;
                n3 += n8;
            } while (true);
        }
        do {
            Object object3;
            block14 : {
                for (Object object3 : collection) {
                    int n10;
                    String string5 = (String)object3;
                    if (!n.a((CharSequence)string5, 0, charSequence, n3, n10 = string5.length(), bl)) continue;
                    break block14;
                }
                object3 = null;
            }
            string = (String)object3;
            if (string != null) {
                return e.a(n3, string);
            }
            if (n3 == n4) return null;
            n3 += n5;
        } while (true);
    }

    public static final i.m.a<String> b(final CharSequence charSequence, String[] arrstring, boolean bl, int n2) {
        i.k.b.d.c((Object)charSequence, "$this$splitToSequence");
        i.k.b.d.c(arrstring, "delimiters");
        return i.m.b.a(n.a(charSequence, arrstring, 0, bl, n2, 2, null), new i.k.a.a<i.l.d, String>(){

            @Override
            public final String a(i.l.d d2) {
                i.k.b.d.c(d2, "it");
                return n.a(charSequence, d2);
            }
        });
    }

    public static /* synthetic */ i.m.a b(CharSequence charSequence, String[] arrstring, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return n.b(charSequence, arrstring, bl, n2);
    }

}

