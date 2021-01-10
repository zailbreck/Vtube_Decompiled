/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.PrintStream
 *  java.io.PrintWriter
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 */
package h.b.p;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class a
extends RuntimeException {
    private final List<Throwable> b;
    private final String c;
    private Throwable d;

    public a(Iterable<? extends Throwable> iterable) {
        IllegalArgumentException illegalArgumentException;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable throwable : iterable) {
                if (throwable instanceof a) {
                    linkedHashSet.addAll(((a)throwable).a());
                    continue;
                }
                if (throwable == null) {
                    throwable = new NullPointerException("Throwable was null!");
                }
                linkedHashSet.add((Object)throwable);
            }
        } else {
            linkedHashSet.add((Object)new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll((Collection)linkedHashSet);
            this.b = Collections.unmodifiableList((List)arrayList);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b.size());
            stringBuilder.append(" exceptions occurred. ");
            this.c = stringBuilder.toString();
            return;
        }
        illegalArgumentException = new IllegalArgumentException("errors is empty");
        throw illegalArgumentException;
    }

    public /* varargs */ a(Throwable ... arrthrowable) {
        List list;
        if (arrthrowable == null) {
            Object[] arrobject = new NullPointerException[]{new NullPointerException("exceptions was null")};
            list = Arrays.asList((Object[])arrobject);
        } else {
            list = Arrays.asList((Object[])arrthrowable);
        }
        super((Iterable<? extends Throwable>)list);
    }

    private List<Throwable> a(Throwable throwable) {
        ArrayList arrayList = new ArrayList();
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null) {
            if (throwable2 == throwable) {
                return arrayList;
            }
            do {
                arrayList.add((Object)throwable2);
                Throwable throwable3 = throwable2.getCause();
                if (throwable3 == null) break;
                if (throwable3 == throwable2) {
                    return arrayList;
                }
                throwable2 = throwable3;
            } while (true);
        }
        return arrayList;
    }

    private void a(b b2) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append((Object)this);
        stringBuilder.append('\n');
        for (StackTraceElement stackTraceElement : this.getStackTrace()) {
            stringBuilder.append("\tat ");
            stringBuilder.append((Object)stackTraceElement);
            stringBuilder.append('\n');
        }
        Iterator iterator = this.b.iterator();
        int n2 = 1;
        while (iterator.hasNext()) {
            Throwable throwable = (Throwable)iterator.next();
            stringBuilder.append("  ComposedException ");
            stringBuilder.append(n2);
            stringBuilder.append(" :\n");
            a.super.a(stringBuilder, throwable, "\t");
            ++n2;
        }
        b2.a(stringBuilder.toString());
    }

    private void a(StringBuilder stringBuilder, Throwable throwable, String string2) {
        stringBuilder.append(string2);
        stringBuilder.append((Object)throwable);
        stringBuilder.append('\n');
        for (StackTraceElement stackTraceElement : throwable.getStackTrace()) {
            stringBuilder.append("\t\tat ");
            stringBuilder.append((Object)stackTraceElement);
            stringBuilder.append('\n');
        }
        if (throwable.getCause() != null) {
            stringBuilder.append("\tCaused by: ");
            a.super.a(stringBuilder, throwable.getCause(), "");
        }
    }

    private Throwable b(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        if (throwable2 != null) {
            Throwable throwable3;
            if (this.d == throwable2) {
                return throwable;
            }
            while ((throwable3 = throwable2.getCause()) != null) {
                if (throwable3 == throwable2) {
                    return throwable2;
                }
                throwable2 = throwable3;
            }
            return throwable2;
        }
        return throwable;
    }

    public List<Throwable> a() {
        return this.b;
    }

    /*
     * Exception decompiling
     */
    public Throwable getCause() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[CATCHBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public String getMessage() {
        return this.c;
    }

    public void printStackTrace() {
        this.printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        a.super.a(new b(printStream){
            private final PrintStream a;
            {
                this.a = printStream;
            }

            @Override
            void a(Object object) {
                this.a.println(object);
            }
        });
    }

    public void printStackTrace(PrintWriter printWriter) {
        a.super.a(new b(printWriter){
            private final PrintWriter a;
            {
                this.a = printWriter;
            }

            @Override
            void a(Object object) {
                this.a.println(object);
            }
        });
    }

    static final class a
    extends RuntimeException {
        a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    static abstract class b {
        b() {
        }

        abstract void a(Object var1);
    }

}

