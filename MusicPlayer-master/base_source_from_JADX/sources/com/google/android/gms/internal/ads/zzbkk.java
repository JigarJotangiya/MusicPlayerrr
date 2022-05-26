package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C3110r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkk> CREATOR = new C5650uy();

    /* renamed from: g */
    public final int f27242g;

    /* renamed from: h */
    public final int f27243h;

    public zzbkk(int i, int i2) {
        this.f27242g = i;
        this.f27243h = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27242g);
        C3315b.m14316h(parcel, 2, this.f27243h);
        C3315b.m14310b(parcel, a);
    }

    public zzbkk(C3110r rVar) {
        this.f27242g = rVar.mo11341b();
        this.f27243h = rVar.mo11342c();
    }
}
