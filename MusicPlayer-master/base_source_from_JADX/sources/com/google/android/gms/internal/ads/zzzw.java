package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzw extends zzzu {
    public static final Parcelable.Creator<zzzw> CREATOR = new wb4();

    /* renamed from: h */
    public final String f27470h;

    /* renamed from: i */
    public final String f27471i;

    /* renamed from: j */
    public final String f27472j;

    zzzw(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27470h = readString;
        this.f27471i = parcel.readString();
        this.f27472j = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzw.class == obj.getClass()) {
            zzzw zzzw = (zzzw) obj;
            return wy2.m33453p(this.f27471i, zzzw.f27471i) && wy2.m33453p(this.f27470h, zzzw.f27470h) && wy2.m33453p(this.f27472j, zzzw.f27472j);
        }
    }

    public final int hashCode() {
        String str = this.f27470h;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27471i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27472j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27470h;
        String str3 = this.f27471i;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27469g);
        parcel.writeString(this.f27470h);
        parcel.writeString(this.f27472j);
    }

    public zzzw(String str, String str2, String str3) {
        super("----");
        this.f27470h = str;
        this.f27471i = str2;
        this.f27472j = str3;
    }
}
