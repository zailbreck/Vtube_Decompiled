/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.a.a.a.a;

import f.a.a.a.a.h.d;

public class b
extends Exception {
    private Boolean b;

    public b() {
        this.b = false;
    }

    public b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ErrorMessage]: ");
        stringBuilder.append(string);
        super(stringBuilder.toString());
        this.b = false;
    }

    public b(String string, Throwable throwable) {
        super(string, throwable, false);
    }

    public b(String string, Throwable throwable, Boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ErrorMessage]: ");
        stringBuilder.append(string);
        super(stringBuilder.toString(), throwable);
        this.b = false;
        this.b = bl;
        d.a((Throwable)this);
    }

    public b(Throwable throwable) {
        super(throwable);
        this.b = false;
    }

    public Boolean a() {
        return this.b;
    }

    public String getMessage() {
        String string = super.getMessage();
        if (this.getCause() == null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getCause().getMessage());
        stringBuilder.append("\n");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

