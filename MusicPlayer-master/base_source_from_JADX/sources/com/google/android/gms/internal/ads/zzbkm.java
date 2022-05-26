package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.search.C3113a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbkm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkm> CREATOR = new C5687vy();

    /* renamed from: g */
    public final String f27244g;

    public zzbkm(C3113a aVar) {
        aVar.mo11358a();
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 15, this.f27244g, false);
        C3315b.m14310b(parcel, a);
    }

    zzbkm(String str) {
        this.f27244g = str;
    }
}
