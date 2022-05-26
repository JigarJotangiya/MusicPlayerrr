package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaak implements zzdc {
    public static final Parcelable.Creator<zzaak> CREATOR = new C5097g();

    /* renamed from: g */
    public final long f27106g;

    /* renamed from: h */
    public final long f27107h;

    /* renamed from: i */
    public final long f27108i;

    /* renamed from: j */
    public final long f27109j;

    /* renamed from: k */
    public final long f27110k;

    public zzaak(long j, long j2, long j3, long j4, long j5) {
        this.f27106g = j;
        this.f27107h = j2;
        this.f27108i = j3;
        this.f27109j = j4;
        this.f27110k = j5;
    }

    /* synthetic */ zzaak(Parcel parcel, C5134h hVar) {
        this.f27106g = parcel.readLong();
        this.f27107h = parcel.readLong();
        this.f27108i = parcel.readLong();
        this.f27109j = parcel.readLong();
        this.f27110k = parcel.readLong();
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
        if (obj != null && zzaak.class == obj.getClass()) {
            zzaak zzaak = (zzaak) obj;
            return this.f27106g == zzaak.f27106g && this.f27107h == zzaak.f27107h && this.f27108i == zzaak.f27108i && this.f27109j == zzaak.f27109j && this.f27110k == zzaak.f27110k;
        }
    }

    public final int hashCode() {
        long j = this.f27106g;
        long j2 = this.f27107h;
        long j3 = this.f27108i;
        long j4 = this.f27109j;
        long j5 = this.f27110k;
        return ((((((((((int) (j ^ (j >>> 32))) + 527) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f27106g;
        long j2 = this.f27107h;
        long j3 = this.f27108i;
        long j4 = this.f27109j;
        long j5 = this.f27110k;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f27106g);
        parcel.writeLong(this.f27107h);
        parcel.writeLong(this.f27108i);
        parcel.writeLong(this.f27109j);
        parcel.writeLong(this.f27110k);
    }
}
