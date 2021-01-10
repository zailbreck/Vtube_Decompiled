/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package org.chromium.support_lib_boundary;

public interface ServiceWorkerWebSettingsBoundaryInterface {
    public boolean getAllowContentAccess();

    public boolean getAllowFileAccess();

    public boolean getBlockNetworkLoads();

    public int getCacheMode();

    public void setAllowContentAccess(boolean var1);

    public void setAllowFileAccess(boolean var1);

    public void setBlockNetworkLoads(boolean var1);

    public void setCacheMode(int var1);
}

