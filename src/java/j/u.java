/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package j;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class u {
    private static final Pattern c = Pattern.compile((String)"([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile((String)";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String a;
    private final String b;

    private u(String string2, String string3, String string4, String string5) {
        this.a = string2;
        this.b = string5;
    }

    public static u a(String string2) {
        IllegalArgumentException illegalArgumentException;
        Matcher matcher = c.matcher((CharSequence)string2);
        if (matcher.lookingAt()) {
            String string3 = matcher.group(1).toLowerCase(Locale.US);
            String string4 = matcher.group(2).toLowerCase(Locale.US);
            String string5 = null;
            Matcher matcher2 = d.matcher((CharSequence)string2);
            int n2 = matcher.end();
            while (n2 < string2.length()) {
                matcher2.region(n2, string2.length());
                if (matcher2.lookingAt()) {
                    String string6 = matcher2.group(1);
                    if (string6 != null && string6.equalsIgnoreCase("charset")) {
                        String string7 = matcher2.group(2);
                        if (string7 != null) {
                            if (string7.startsWith("'") && string7.endsWith("'") && string7.length() > 2) {
                                string7 = string7.substring(1, string7.length() - 1);
                            }
                        } else {
                            string7 = matcher2.group(3);
                        }
                        if (string5 != null && !string7.equalsIgnoreCase(string5)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Multiple charsets defined: \"");
                            stringBuilder.append(string5);
                            stringBuilder.append("\" and: \"");
                            stringBuilder.append(string7);
                            stringBuilder.append("\" for: \"");
                            stringBuilder.append(string2);
                            stringBuilder.append('\"');
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                        string5 = string7;
                    }
                    n2 = matcher2.end();
                    continue;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Parameter is not formatted correctly: \"");
                stringBuilder.append(string2.substring(n2));
                stringBuilder.append("\" for: \"");
                stringBuilder.append(string2);
                stringBuilder.append('\"');
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return new u(string2, string3, string4, string5);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No subtype found for: \"");
        stringBuilder.append(string2);
        stringBuilder.append('\"');
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public static u b(String string2) {
        try {
            u u2 = u.a(string2);
            return u2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    /*
     * Exception decompiling
     */
    public Charset a(Charset var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public boolean equals(Object object) {
        return object instanceof u && ((u)object).a.equals((Object)this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }
}

