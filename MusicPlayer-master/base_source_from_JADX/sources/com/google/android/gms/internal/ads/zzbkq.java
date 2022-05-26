package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkq> CREATOR = new C5761xy();

    /* renamed from: g */
    public final boolean f27245g;

    /* renamed from: h */
    public final boolean f27246h;

    /* renamed from: i */
    public final boolean f27247i;

    public zzbkq(C3116u uVar) {
        this(uVar.mo11370c(), uVar.mo11369b(), uVar.mo11368a());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 2, this.f27245g);
        C3315b.m14311c(parcel, 3, this.f27246h);
        C3315b.m14311c(parcel, 4, this.f27247i);
        C3315b.m14310b(parcel, a);
    }

    public zzbkq(boolean z, boolean z2, boolean z3) {
        this.f27245g = z;
        this.f27246h = z2;
        this.f27247i = z3;
    }
}
