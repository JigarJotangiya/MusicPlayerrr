package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.fu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5091fu implements Parcelable.Creator<zzbfk> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v == 3) {
                str = C3313a.m14298p(parcel, z);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                j = C3313a.m14278C(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbfk(i, i2, str, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfk[i];
    }
}
