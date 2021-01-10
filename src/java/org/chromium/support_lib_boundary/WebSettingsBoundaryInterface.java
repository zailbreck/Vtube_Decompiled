/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 */
package org.chromium.support_lib_boundary;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface WebSettingsBoundaryInterface {
    public int getDisabledActionModeMenuItems();

    public int getForceDark();

    public int getForceDarkBehavior();

    public boolean getOffscreenPreRaster();

    public boolean getSafeBrowsingEnabled();

    public boolean getWillSuppressErrorPage();

    public void setDisabledActionModeMenuItems(int var1);

    public void setForceDark(int var1);

    public void setForceDarkBehavior(int var1);

    public void setOffscreenPreRaster(boolean var1);

    public void setSafeBrowsingEnabled(boolean var1);

    public void setWillSuppressErrorPage(boolean var1);

    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

}

