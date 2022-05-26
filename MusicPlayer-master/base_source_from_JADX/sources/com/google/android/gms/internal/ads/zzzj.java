package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzj extends zzzu {
    public static final Parcelable.Creator<zzzj> CREATOR = new ob4();

    /* renamed from: h */
    public final String f27451h;

    /* renamed from: i */
    public final int f27452i;

    /* renamed from: j */
    public final int f27453j;

    /* renamed from: k */
    public final long f27454k;

    /* renamed from: l */
    public final long f27455l;

    /* renamed from: m */
    private final zzzu[] f27456m;

    zzzj(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27451h = readString;
        this.f27452i = parcel.readInt();
        this.f27453j = parcel.readInt();
        this.f27454k = parcel.readLong();
        this.f27455l = parcel.readLong();
        int readInt = parcel.readInt();
        this.f27456m = new zzzu[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f27456m[i2] = (zzzu) parcel.readParcelable(zzzu.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzj.class == obj.getClass()) {
            zzzj zzzj = (zzzj) obj;
            return this.f27452i == zzzj.f27452i && this.f27453j == zzzj.f27453j && this.f27454k == zzzj.f27454k && this.f27455l == zzzj.f27455l && wy2.m33453p(this.f27451h, zzzj.f27451h) && Arrays.equals(this.f27456m, zzzj.f27456m);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f27452i + 527) * 31) + this.f27453j) * 31) + ((int) this.f27454k)) * 31) + ((int) this.f27455l)) * 31;
        String str = this.f27451h;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27451h);
        parcel.writeInt(this.f27452i);
        parcel.writeInt(this.f27453j);
        parcel.writeLong(this.f27454k);
        parcel.writeLong(this.f27455l);
        parcel.writeInt(this.f27456m.length);
        for (zzzu writeParcelable : this.f27456m) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzzj(String str, int i, int i2, long j, long j2, zzzu[] zzzuArr) {
        super("CHAP");
        this.f27451h = str;
        this.f27452i = i;
        this.f27453j = i2;
        this.f27454k = j;
        this.f27455l = j2;
        this.f27456m = zzzuArr;
    }
}
