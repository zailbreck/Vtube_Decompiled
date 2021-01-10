/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.ExifInterface
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 */
package io.flutter.plugins.imagepicker;

import android.media.ExifInterface;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;

class ExifDataCopier {
    ExifDataCopier() {
    }

    private static void setIfNotNull(ExifInterface exifInterface, ExifInterface exifInterface2, String string2) {
        if (exifInterface.getAttribute(string2) != null) {
            exifInterface2.setAttribute(string2, exifInterface.getAttribute(string2));
        }
    }

    void copyExif(String string2, String string3) {
        try {
            ExifInterface exifInterface = new ExifInterface(string2);
            ExifInterface exifInterface2 = new ExifInterface(string3);
            Iterator iterator = Arrays.asList((Object[])new String[]{"FNumber", "ExposureTime", "ISOSpeedRatings", "GPSAltitude", "GPSAltitudeRef", "FocalLength", "GPSDateStamp", "WhiteBalance", "GPSProcessingMethod", "GPSTimeStamp", "DateTime", "Flash", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "Orientation"}).iterator();
            while (iterator.hasNext()) {
                ExifDataCopier.setIfNotNull(exifInterface, exifInterface2, (String)iterator.next());
            }
            exifInterface2.saveAttributes();
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error preserving Exif data on selected image: ");
            stringBuilder.append((Object)exception);
            Log.e((String)"ExifDataCopier", (String)stringBuilder.toString());
            return;
        }
    }
}

