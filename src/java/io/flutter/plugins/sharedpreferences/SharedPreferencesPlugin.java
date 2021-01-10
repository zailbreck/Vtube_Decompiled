/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Base64
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.lang.ClassNotFoundException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SharedPreferencesPlugin
implements MethodChannel.MethodCallHandler {
    private static final String BIG_INTEGER_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy";
    private static final String CHANNEL_NAME = "plugins.flutter.io/shared_preferences";
    private static final String LIST_IDENTIFIER = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
    private static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
    private final SharedPreferences preferences;

    private SharedPreferencesPlugin(Context context) {
        this.preferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private List<String> decodeList(String string) {
        ObjectInputStream objectInputStream;
        void var5_7;
        block7 : {
            void var4_10;
            List list;
            objectInputStream = null;
            ObjectInputStream objectInputStream2 = new ObjectInputStream((InputStream)new ByteArrayInputStream(Base64.decode((String)string, (int)0)));
            try {
                list = (List)objectInputStream2.readObject();
            }
            catch (Throwable throwable) {
                objectInputStream = objectInputStream2;
                break block7;
            }
            catch (ClassNotFoundException classNotFoundException) {
                objectInputStream = objectInputStream2;
                throw new IOException((Throwable)var4_10);
            }
            objectInputStream2.close();
            return list;
            catch (Throwable throwable) {
                break block7;
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            {
                throw new IOException((Throwable)var4_10);
            }
        }
        if (objectInputStream == null) throw var5_7;
        objectInputStream.close();
        throw var5_7;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private String encodeList(List<String> list) {
        void var5_8;
        ObjectOutputStream objectOutputStream;
        block4 : {
            String string;
            objectOutputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream((OutputStream)byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                string = Base64.encodeToString((byte[])byteArrayOutputStream.toByteArray(), (int)0);
            }
            catch (Throwable throwable) {
                objectOutputStream = objectOutputStream2;
            }
            objectOutputStream2.close();
            return string;
            break block4;
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (objectOutputStream == null) throw var5_8;
        objectOutputStream.close();
        throw var5_8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Map<String, Object> getAllPrefs() {
        Map map = this.preferences.getAll();
        HashMap hashMap = new HashMap();
        for (String string : map.keySet()) {
            ArrayList arrayList;
            block5 : {
                ArrayList arrayList2;
                block6 : {
                    block3 : {
                        String string2;
                        block4 : {
                            if (!string.startsWith("flutter.")) continue;
                            arrayList = map.get((Object)string);
                            if (!(arrayList instanceof String)) break block3;
                            string2 = (String)arrayList;
                            if (!string2.startsWith(LIST_IDENTIFIER)) break block4;
                            arrayList = this.decodeList(string2.substring(40));
                            break block5;
                        }
                        if (!string2.startsWith(BIG_INTEGER_PREFIX)) break block5;
                        arrayList2 = new BigInteger(string2.substring(44), 36);
                        break block6;
                    }
                    if (!(arrayList instanceof Set)) break block5;
                    arrayList2 = new ArrayList((Collection)((Set)arrayList));
                    SharedPreferences.Editor editor = this.preferences.edit().remove(string);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(LIST_IDENTIFIER);
                    stringBuilder.append(this.encodeList((List<String>)arrayList2));
                    if (!editor.putString(string, stringBuilder.toString()).commit()) throw new IOException("Could not migrate set to list");
                }
                arrayList = arrayList2;
            }
            hashMap.put((Object)string, (Object)arrayList);
        }
        return hashMap;
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new MethodChannel(registrar.messenger(), CHANNEL_NAME).setMethodCallHandler((MethodChannel.MethodCallHandler)new SharedPreferencesPlugin(registrar.context()));
    }

    /*
     * Exception decompiling
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[CASE]], but top level block is 1[TRYBLOCK]
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
}

