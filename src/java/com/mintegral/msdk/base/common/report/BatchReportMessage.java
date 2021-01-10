/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.common.report;

import android.os.Parcel;
import android.os.Parcelable;

public class BatchReportMessage
implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };
    private String b;
    private String c;
    private long d;

    protected BatchReportMessage(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readLong();
    }

    public BatchReportMessage(String string, String string2, long l2) {
        this.b = string;
        this.c = string2;
        this.d = l2;
    }

    public String c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
    }

}

