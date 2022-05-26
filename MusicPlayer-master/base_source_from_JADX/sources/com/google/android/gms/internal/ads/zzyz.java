package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzyz implements zzdc {
    public static final Parcelable.Creator<zzyz> CREATOR = new ib4();

    /* renamed from: g */
    public final int f27430g;

    /* renamed from: h */
    public final String f27431h;

    /* renamed from: i */
    public final String f27432i;

    /* renamed from: j */
    public final int f27433j;

    /* renamed from: k */
    public final int f27434k;

    /* renamed from: l */
    public final int f27435l;

    /* renamed from: m */
    public final int f27436m;

    /* renamed from: n */
    public final byte[] f27437n;

    public zzyz(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f27430g = i;
        this.f27431h = str;
        this.f27432i = str2;
        this.f27433j = i2;
        this.f27434k = i3;
        this.f27435l = i4;
        this.f27436m = i5;
        this.f27437n = bArr;
    }

    zzyz(Parcel parcel) {
        this.f27430g = parcel.readInt();
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27431h = readString;
        this.f27432i = parcel.readString();
        this.f27433j = parcel.readInt();
        this.f27434k = parcel.readInt();
        this.f27435l = parcel.readInt();
        this.f27436m = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27437n = createByteArray;
    }

    /* renamed from: E */
    public final void mo22456E(C5828zq zqVar) {
        zqVar.mo22403k(this.f27437n, this.f27430g);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyz.class == obj.getClass()) {
            zzyz zzyz = (zzyz) obj;
            return this.f27430g == zzyz.f27430g && this.f27431h.equals(zzyz.f27431h) && this.f27432i.equals(zzyz.f27432i) && this.f27433j == zzyz.f27433j && this.f27434k == zzyz.f27434k && this.f27435l == zzyz.f27435l && this.f27436m == zzyz.f27436m && Arrays.equals(this.f27437n, zzyz.f27437n);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f27430g + 527) * 31) + this.f27431h.hashCode()) * 31) + this.f27432i.hashCode()) * 31) + this.f27433j) * 31) + this.f27434k) * 31) + this.f27435l) * 31) + this.f27436m) * 31) + Arrays.hashCode(this.f27437n);
    }

    public final String toString() {
        String str = this.f27431h;
        String str2 = this.f27432i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27430g);
        parcel.writeString(this.f27431h);
        parcel.writeString(this.f27432i);
        parcel.writeInt(this.f27433j);
        parcel.writeInt(this.f27434k);
        parcel.writeInt(this.f27435l);
        parcel.writeInt(this.f27436m);
        parcel.writeByteArray(this.f27437n);
    }
}
