package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzn extends zzzu {
    public static final Parcelable.Creator<zzzn> CREATOR = new qb4();

    /* renamed from: h */
    public final String f27462h;

    /* renamed from: i */
    public final String f27463i;

    /* renamed from: j */
    public final String f27464j;

    zzzn(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27462h = readString;
        this.f27463i = parcel.readString();
        this.f27464j = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzn.class == obj.getClass()) {
            zzzn zzzn = (zzzn) obj;
            return wy2.m33453p(this.f27463i, zzzn.f27463i) && wy2.m33453p(this.f27462h, zzzn.f27462h) && wy2.m33453p(this.f27464j, zzzn.f27464j);
        }
    }

    public final int hashCode() {
        String str = this.f27462h;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27463i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27464j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27462h;
        String str3 = this.f27463i;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27469g);
        parcel.writeString(this.f27462h);
        parcel.writeString(this.f27464j);
    }

    public zzzn(String str, String str2, String str3) {
        super("COMM");
        this.f27462h = str;
        this.f27463i = str2;
        this.f27464j = str3;
    }
}
