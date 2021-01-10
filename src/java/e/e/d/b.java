/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  android.content.res.XmlResourceParser
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Environment
 *  android.os.ParcelFileDescriptor
 *  android.text.TextUtils
 *  android.webkit.MimeTypeMap
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.HashMap
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;

public class b
extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String[] COLUMNS = new String[]{"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private static HashMap<String, a> sCache = new HashMap();
    private a mStrategy;

    private static /* varargs */ File buildPath(File file, String ... arrstring) {
        for (String string : arrstring) {
            if (string == null) continue;
            file = new File(file, string);
        }
        return file;
    }

    private static Object[] copyOf(Object[] arrobject, int n2) {
        Object[] arrobject2 = new Object[n2];
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n2);
        return arrobject2;
    }

    private static String[] copyOf(String[] arrstring, int n2) {
        String[] arrstring2 = new String[n2];
        System.arraycopy((Object)arrstring, (int)0, (Object)arrstring2, (int)0, (int)n2);
        return arrstring2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static a getPathStrategy(Context context, String string) {
        HashMap<String, a> hashMap;
        HashMap<String, a> hashMap2 = hashMap = sCache;
        synchronized (hashMap2) {
            a a2;
            a2 = (a)sCache.get((Object)string);
            if (a2 == null) {
                try {
                    a2 = b.parsePathStrategy(context, string);
                }
                catch (XmlPullParserException xmlPullParserException) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)xmlPullParserException);
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", (Throwable)iOException);
                }
                sCache.put((Object)string, (Object)a2);
            }
            return a2;
        }
    }

    public static Uri getUriForFile(Context context, String string, File file) {
        return b.getPathStrategy(context, string).a(file);
    }

    private static int modeToMode(String string) {
        if ("r".equals((Object)string)) {
            return 268435456;
        }
        if (!"w".equals((Object)string) && !"wt".equals((Object)string)) {
            if ("wa".equals((Object)string)) {
                return 704643072;
            }
            if ("rw".equals((Object)string)) {
                return 939524096;
            }
            if ("rwt".equals((Object)string)) {
                return 1006632960;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid mode: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return 738197504;
    }

    private static a parsePathStrategy(Context context, String string) {
        IllegalArgumentException illegalArgumentException;
        a a2 = new a(string){
            private final String a;
            private final HashMap<String, File> b = new HashMap();
            {
                this.a = string;
            }

            @Override
            public Uri a(File file) {
                Map.Entry entry;
                String string;
                try {
                    string = file.getCanonicalPath();
                    entry = null;
                }
                catch (IOException iOException) {
                    IllegalArgumentException illegalArgumentException;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to resolve canonical path for ");
                    stringBuilder.append((Object)file);
                    illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                    throw illegalArgumentException;
                }
                for (Map.Entry entry2 : this.b.entrySet()) {
                    String string2 = ((File)entry2.getValue()).getPath();
                    if (!string.startsWith(string2) || entry != null && string2.length() <= ((File)entry.getValue()).getPath().length()) continue;
                    entry = entry2;
                }
                if (entry != null) {
                    String string3 = ((File)entry.getValue()).getPath();
                    boolean bl = string3.endsWith("/");
                    int n2 = string3.length();
                    if (!bl) {
                        ++n2;
                    }
                    String string4 = string.substring(n2);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(Uri.encode((String)((String)entry.getKey())));
                    stringBuilder.append('/');
                    stringBuilder.append(Uri.encode((String)string4, (String)"/"));
                    String string5 = stringBuilder.toString();
                    return new Uri.Builder().scheme("content").authority(this.a).encodedPath(string5).build();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to find configured root that contains ");
                stringBuilder.append(string);
                throw new IllegalArgumentException(stringBuilder.toString());
            }

            @Override
            public File a(Uri uri) {
                String string = uri.getEncodedPath();
                int n2 = string.indexOf(47, 1);
                String string2 = Uri.decode((String)string.substring(1, n2));
                String string3 = Uri.decode((String)string.substring(n2 + 1));
                File file = (File)this.b.get((Object)string2);
                if (file != null) {
                    File file2;
                    File file3 = new File(file, string3);
                    try {
                        file2 = file3.getCanonicalFile();
                    }
                    catch (IOException iOException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to resolve canonical path for ");
                        stringBuilder.append((Object)file3);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    if (file2.getPath().startsWith(file.getPath())) {
                        return file2;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to find configured root for ");
                stringBuilder.append((Object)uri);
                throw new IllegalArgumentException(stringBuilder.toString());
            }

            void a(String string, File file) {
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    File file2;
                    try {
                        file2 = file.getCanonicalFile();
                    }
                    catch (IOException iOException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to resolve canonical path for ");
                        stringBuilder.append((Object)file);
                        throw new IllegalArgumentException(stringBuilder.toString(), (Throwable)iOException);
                    }
                    this.b.put((Object)string, (Object)file2);
                    return;
                }
                throw new IllegalArgumentException("Name must not be empty");
            }
        };
        ProviderInfo providerInfo = context.getPackageManager().resolveContentProvider(string, 128);
        if (providerInfo != null) {
            XmlResourceParser xmlResourceParser = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
            if (xmlResourceParser != null) {
                int n2;
                while ((n2 = xmlResourceParser.next()) != 1) {
                    File file;
                    if (n2 != 2) continue;
                    String string2 = xmlResourceParser.getName();
                    String string3 = xmlResourceParser.getAttributeValue(null, ATTR_NAME);
                    String string4 = xmlResourceParser.getAttributeValue(null, ATTR_PATH);
                    if (TAG_ROOT_PATH.equals((Object)string2)) {
                        file = DEVICE_ROOT;
                    } else if (TAG_FILES_PATH.equals((Object)string2)) {
                        file = context.getFilesDir();
                    } else if (TAG_CACHE_PATH.equals((Object)string2)) {
                        file = context.getCacheDir();
                    } else if (TAG_EXTERNAL.equals((Object)string2)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if (TAG_EXTERNAL_FILES.equals((Object)string2)) {
                        File[] arrfile = e.e.d.a.b(context, null);
                        int n3 = arrfile.length;
                        file = null;
                        if (n3 > 0) {
                            file = arrfile[0];
                        }
                    } else if (TAG_EXTERNAL_CACHE.equals((Object)string2)) {
                        File[] arrfile = e.e.d.a.a(context);
                        int n4 = arrfile.length;
                        file = null;
                        if (n4 > 0) {
                            file = arrfile[0];
                        }
                    } else {
                        int n5 = Build.VERSION.SDK_INT;
                        file = null;
                        if (n5 >= 21) {
                            boolean bl = TAG_EXTERNAL_MEDIA.equals((Object)string2);
                            file = null;
                            if (bl) {
                                File[] arrfile = context.getExternalMediaDirs();
                                int n6 = arrfile.length;
                                file = null;
                                if (n6 > 0) {
                                    file = arrfile[0];
                                }
                            }
                        }
                    }
                    if (file == null) continue;
                    a2.a(string3, b.buildPath(file, string4));
                }
                return a2;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Couldn't find meta-data for provider with authority ");
        stringBuilder.append(string);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                this.mStrategy = b.getPathStrategy(context, providerInfo.authority);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public int delete(Uri uri, String string, String[] arrstring) {
        return (int)this.mStrategy.a(uri).delete();
    }

    public String getType(Uri uri) {
        File file = this.mStrategy.a(uri);
        int n2 = file.getName().lastIndexOf(46);
        if (n2 >= 0) {
            String string = file.getName().substring(n2 + 1);
            String string2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(string);
            if (string2 != null) {
                return string2;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String string) {
        return ParcelFileDescriptor.open((File)this.mStrategy.a(uri), (int)b.modeToMode(string));
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cursor query(Uri uri, String[] arrstring, String string, String[] arrstring2, String string2) {
        File file = this.mStrategy.a(uri);
        if (arrstring == null) {
            arrstring = COLUMNS;
        }
        String[] arrstring3 = new String[arrstring.length];
        Object[] arrobject = new Object[arrstring.length];
        int n2 = arrstring.length;
        int n3 = 0;
        int n4 = 0;
        do {
            block8 : {
                int n5;
                block7 : {
                    String string3;
                    block6 : {
                        if (n3 >= n2) {
                            String[] arrstring4 = b.copyOf(arrstring3, n4);
                            Object[] arrobject2 = b.copyOf(arrobject, n4);
                            MatrixCursor matrixCursor = new MatrixCursor(arrstring4, 1);
                            matrixCursor.addRow(arrobject2);
                            return matrixCursor;
                        }
                        string3 = arrstring[n3];
                        if (!"_display_name".equals((Object)string3)) break block6;
                        arrstring3[n4] = "_display_name";
                        n5 = n4 + 1;
                        arrobject[n4] = file.getName();
                        break block7;
                    }
                    if (!"_size".equals((Object)string3)) break block8;
                    arrstring3[n4] = "_size";
                    n5 = n4 + 1;
                    arrobject[n4] = file.length();
                }
                n4 = n5;
            }
            ++n3;
        } while (true);
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] arrstring) {
        throw new UnsupportedOperationException("No external updates");
    }

    static interface a {
        public Uri a(File var1);

        public File a(Uri var1);
    }

}

