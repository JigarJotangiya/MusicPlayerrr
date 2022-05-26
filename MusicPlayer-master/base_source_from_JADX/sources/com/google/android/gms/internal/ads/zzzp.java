package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzp extends zzzu {
    public static final Parcelable.Creator<zzzp> CREATOR = new rb4();

    /* renamed from: h */
    public final String f27465h;

    /* renamed from: i */
    public final String f27466i;

    /* renamed from: j */
    public final String f27467j;

    /* renamed from: k */
    public final byte[] f27468k;

    zzzp(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27465h = readString;
        this.f27466i = parcel.readString();
        this.f27467j = parcel.readString();
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27468k = createByteArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzp.class == obj.getClass()) {
            zzzp zzzp = (zzzp) obj;
            return wy2.m33453p(this.f27465h, zzzp.f27465h) && wy2.m33453p(this.f27466i, zzzp.f27466i) && wy2.m33453p(this.f27467j, zzzp.f27467j) && Arrays.equals(this.f27468k, zzzp.f27468k);
        }
    }

    public final int hashCode() {
        String str = this.f27465h;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27466i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27467j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f27468k);
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27465h;
        String str3 = this.f27466i;
        String str4 = this.f27467j;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27465h);
        parcel.writeString(this.f27466i);
        parcel.writeString(this.f27467j);
        parcel.writeByteArray(this.f27468k);
    }

    public zzzp(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f27465h = str;
        this.f27466i = str2;
        this.f27467j = str3;
        this.f27468k = bArr;
    }
}
