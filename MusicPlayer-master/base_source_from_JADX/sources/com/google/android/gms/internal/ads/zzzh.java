package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzh extends zzzu {
    public static final Parcelable.Creator<zzzh> CREATOR = new nb4();

    /* renamed from: h */
    public final byte[] f27450h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzzh(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.wy2.f25579a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            com.google.android.gms.internal.ads.wy2.m33436c(r3)
            byte[] r3 = (byte[]) r3
            r2.f27450h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzh.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzh.class == obj.getClass()) {
            zzzh zzzh = (zzzh) obj;
            return this.f27469g.equals(zzzh.f27469g) && Arrays.equals(this.f27450h, zzzh.f27450h);
        }
    }

    public final int hashCode() {
        return ((this.f27469g.hashCode() + 527) * 31) + Arrays.hashCode(this.f27450h);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27469g);
        parcel.writeByteArray(this.f27450h);
    }

    public zzzh(String str, byte[] bArr) {
        super(str);
        this.f27450h = bArr;
    }
}
