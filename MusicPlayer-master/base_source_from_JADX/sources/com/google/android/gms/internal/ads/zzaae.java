package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaae extends zzzu {
    public static final Parcelable.Creator<zzaae> CREATOR = new C4985d();

    /* renamed from: h */
    public final String f27100h;

    /* renamed from: i */
    public final String f27101i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaae(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.wy2.f25579a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f27100h = r0
            java.lang.String r3 = r3.readString()
            r2.f27101i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaae.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaae.class == obj.getClass()) {
            zzaae zzaae = (zzaae) obj;
            return this.f27469g.equals(zzaae.f27469g) && wy2.m33453p(this.f27100h, zzaae.f27100h) && wy2.m33453p(this.f27101i, zzaae.f27101i);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f27469g.hashCode() + 527) * 31;
        String str = this.f27100h;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27101i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f27469g;
        String str2 = this.f27101i;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27469g);
        parcel.writeString(this.f27100h);
        parcel.writeString(this.f27101i);
    }

    public zzaae(String str, String str2, String str3) {
        super(str);
        this.f27100h = str2;
        this.f27101i = str3;
    }
}
