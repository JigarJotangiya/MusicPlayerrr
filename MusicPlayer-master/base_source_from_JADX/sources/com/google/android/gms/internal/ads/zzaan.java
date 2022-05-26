package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaan implements zzdc {
    public static final Parcelable.Creator<zzaan> CREATOR = new C5171i();

    /* renamed from: g */
    public final float f27111g;

    /* renamed from: h */
    public final int f27112h;

    public zzaan(float f, int i) {
        this.f27111g = f;
        this.f27112h = i;
    }

    /* synthetic */ zzaan(Parcel parcel, C5208j jVar) {
        this.f27111g = parcel.readFloat();
        this.f27112h = parcel.readInt();
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
        if (obj != null && zzaan.class == obj.getClass()) {
            zzaan zzaan = (zzaan) obj;
            return this.f27111g == zzaan.f27111g && this.f27112h == zzaan.f27112h;
        }
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f27111g).hashCode() + 527) * 31) + this.f27112h;
    }

    public final String toString() {
        float f = this.f27111g;
        int i = this.f27112h;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f27111g);
        parcel.writeInt(this.f27112h);
    }
}
