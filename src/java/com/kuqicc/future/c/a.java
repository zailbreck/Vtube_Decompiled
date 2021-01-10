/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 */
package com.kuqicc.future.c;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    public static String a(String string) {
        byte[] arrby = MessageDigest.getInstance((String)"md5").digest(string.getBytes());
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = Integer.toHexString((int)(255 & arrby[i2]));
            if (string2.length() == 1) {
                stringBuffer.append("0");
            }
            stringBuffer.append(string2);
        }
        try {
            String string3 = stringBuffer.toString();
            return string3;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }
}

