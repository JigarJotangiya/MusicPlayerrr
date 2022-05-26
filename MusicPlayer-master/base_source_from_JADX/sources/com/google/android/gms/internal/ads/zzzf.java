package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzf extends zzzu {
    public static final Parcelable.Creator<zzzf> CREATOR = new mb4();

    /* renamed from: h */
    public final String f27446h;

    /* renamed from: i */
    public final String f27447i;

    /* renamed from: j */
    public final int f27448j;

    /* renamed from: k */
    public final byte[] f27449k;

    zzzf(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27446h = readString;
        this.f27447i = parcel.readString();
        this.f27448j = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27449k = createByteArray;
    }

    /* renamed from: E */
    public final void mo22456E(C5828zq zqVar) {
        zqVar.mo22403k(this.f27449k, this.f27448j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzf.class == obj.getClass()) {
            zzzf zzzf = (zzzf) obj;
            return this.f27448j == zzzf.f27448j && wy2.m33453p(this.f27446h, zzzf.f27446h) && wy2.m33453p(this.f27447i, zzzf.f27447i) && Arrays.equals(this.f27449k, zzzf.f27449k);
        }
    }

    public final int hashCode() {
        int i = (this.f27448j + 527) * 31;
        String str = this.f27446h;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27447i;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f27449k);
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27446h;
        String str3 = this.f27447i;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27446h);
        parcel.writeString(this.f27447i);
        parcel.writeInt(this.f27448j);
        parcel.writeByteArray(this.f27449k);
    }

    public zzzf(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f27446h = str;
        this.f27447i = str2;
        this.f27448j = i;
        this.f27449k = bArr;
    }
}
