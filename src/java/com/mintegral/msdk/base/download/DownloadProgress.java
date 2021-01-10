/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package com.mintegral.msdk.base.download;

import android.os.Parcel;
import android.os.Parcelable;

public class DownloadProgress
implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new Parcelable.Creator<DownloadProgress>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }
    };
    private long b;
    private long c;
    private int d;

    public DownloadProgress(long l2, long l3, int n2) {
        this.b = l2;
        this.c = l3;
        this.d = n2;
    }

    protected DownloadProgress(Parcel parcel) {
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }

}

