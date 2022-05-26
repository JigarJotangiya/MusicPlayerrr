package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfm> CREATOR = new C5128gu();

    /* renamed from: g */
    public final String f27234g;

    /* renamed from: h */
    public long f27235h;

    /* renamed from: i */
    public zzbew f27236i;

    /* renamed from: j */
    public final Bundle f27237j;

    public zzbfm(String str, long j, zzbew zzbew, Bundle bundle) {
        this.f27234g = str;
        this.f27235h = j;
        this.f27236i = zzbew;
        this.f27237j = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27234g, false);
        C3315b.m14319k(parcel, 2, this.f27235h);
        C3315b.m14321m(parcel, 3, this.f27236i, i, false);
        C3315b.m14312d(parcel, 4, this.f27237j, false);
        C3315b.m14310b(parcel, a);
    }
}
