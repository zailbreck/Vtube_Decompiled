/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipInputStream
 */
package com.mintegral.msdk.base.download.g;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class c {
    private void a(ZipInputStream zipInputStream, String string) {
        int n2;
        File file = new File(string);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)new FileOutputStream(file));
        byte[] arrby = new byte[4096];
        while ((n2 = zipInputStream.read(arrby)) != -1) {
            bufferedOutputStream.write(arrby, 0, n2);
        }
        bufferedOutputStream.close();
    }

    public final void a(String string, String string2) {
        ZipEntry zipEntry;
        File file = new File(string2);
        if (!file.exists()) {
            file.mkdir();
        }
        ZipInputStream zipInputStream = new ZipInputStream((InputStream)new FileInputStream(string));
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(File.separator);
            stringBuilder.append(zipEntry.getName());
            String string3 = stringBuilder.toString();
            if (!zipEntry.isDirectory()) {
                c.super.a(zipInputStream, string3);
            } else {
                new File(string3).mkdirs();
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
    }
}

