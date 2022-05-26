package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcen> CREATOR = new mh0();

    /* renamed from: g */
    public final zzbfd f27358g;

    /* renamed from: h */
    public final String f27359h;

    public zzcen(zzbfd zzbfd, String str) {
        this.f27358g = zzbfd;
        this.f27359h = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14321m(parcel, 2, this.f27358g, i, false);
        C3315b.m14322n(parcel, 3, this.f27359h, false);
        C3315b.m14310b(parcel, a);
    }
}
