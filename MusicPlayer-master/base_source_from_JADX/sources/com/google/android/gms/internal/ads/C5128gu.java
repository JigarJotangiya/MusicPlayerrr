package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.gu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5128gu implements Parcelable.Creator<zzbfm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        zzbew zzbew = null;
        Bundle bundle = null;
        long j = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 2) {
                j = C3313a.m14278C(parcel, z);
            } else if (v == 3) {
                zzbew = (zzbew) C3313a.m14297o(parcel, z, zzbew.CREATOR);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                bundle = C3313a.m14288f(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbfm(str, j, zzbew, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfm[i];
    }
}
