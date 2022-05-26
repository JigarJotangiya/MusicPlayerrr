package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcfn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcfn> CREATOR = new li0();

    /* renamed from: g */
    public final String f27362g;

    /* renamed from: h */
    public final String f27363h;

    public zzcfn(String str, String str2) {
        this.f27362g = str;
        this.f27363h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27362g, false);
        C3315b.m14322n(parcel, 2, this.f27363h, false);
        C3315b.m14310b(parcel, a);
    }
}
