package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzd implements zzdc {
    public static final Parcelable.Creator<zzzd> CREATOR = new lb4();

    /* renamed from: g */
    public final int f27440g;

    /* renamed from: h */
    public final String f27441h;

    /* renamed from: i */
    public final String f27442i;

    /* renamed from: j */
    public final String f27443j;

    /* renamed from: k */
    public final boolean f27444k;

    /* renamed from: l */
    public final int f27445l;

    public zzzd(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        gs1.m24486d(z2);
        this.f27440g = i;
        this.f27441h = str;
        this.f27442i = str2;
        this.f27443j = str3;
        this.f27444k = z;
        this.f27445l = i2;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo22456E(C5828zq zqVar) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzd.class == obj.getClass()) {
            zzzd zzzd = (zzzd) obj;
            return this.f27440g == zzzd.f27440g && wy2.m33453p(this.f27441h, zzzd.f27441h) && wy2.m33453p(this.f27442i, zzzd.f27442i) && wy2.m33453p(this.f27443j, zzzd.f27443j) && this.f27444k == zzzd.f27444k && this.f27445l == zzzd.f27445l;
        }
    }

    public final int hashCode() {
        int i = (this.f27440g + 527) * 31;
        String str = this.f27441h;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27442i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27443j;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f27444k ? 1 : 0)) * 31) + this.f27445l;
    }

    public final String toString() {
        String str = this.f27442i;
        String str2 = this.f27441h;
        int i = this.f27440g;
        int i2 = this.f27445l;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27440g);
        parcel.writeString(this.f27441h);
        parcel.writeString(this.f27442i);
        parcel.writeString(this.f27443j);
        wy2.m33452o(parcel, this.f27444k);
        parcel.writeInt(this.f27445l);
    }

    zzzd(Parcel parcel) {
        this.f27440g = parcel.readInt();
        this.f27441h = parcel.readString();
        this.f27442i = parcel.readString();
        this.f27443j = parcel.readString();
        this.f27444k = wy2.m33459v(parcel);
        this.f27445l = parcel.readInt();
    }
}
