package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaaa extends zzzu {
    public static final Parcelable.Creator<zzaaa> CREATOR = new yb4();

    /* renamed from: h */
    public final String f27096h;

    /* renamed from: i */
    public final byte[] f27097i;

    zzaaa(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27096h = readString;
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27097i = createByteArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaaa.class == obj.getClass()) {
            zzaaa zzaaa = (zzaaa) obj;
            return wy2.m33453p(this.f27096h, zzaaa.f27096h) && Arrays.equals(this.f27097i, zzaaa.f27097i);
        }
    }

    public final int hashCode() {
        String str = this.f27096h;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f27097i);
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27096h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27096h);
        parcel.writeByteArray(this.f27097i);
    }

    public zzaaa(String str, byte[] bArr) {
        super("PRIV");
        this.f27096h = str;
        this.f27097i = bArr;
    }
}
