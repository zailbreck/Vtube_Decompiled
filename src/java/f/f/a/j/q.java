/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.j;

public class q
extends Exception {
    public q(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(". Version: 1.0");
        super(stringBuilder.toString());
    }

    public q(String string, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(". Version: 1.0");
        super(stringBuilder.toString(), throwable);
    }
}

