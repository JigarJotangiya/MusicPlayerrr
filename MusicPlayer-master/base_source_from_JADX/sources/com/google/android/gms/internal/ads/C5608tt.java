package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.tt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5608tt implements Parcelable.Creator<zzbew> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        zzbew zzbew = null;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 3) {
                str2 = C3313a.m14298p(parcel, z);
            } else if (v == 4) {
                zzbew = (zzbew) C3313a.m14297o(parcel, z, zzbew.CREATOR);
            } else if (v != 5) {
                C3313a.m14280E(parcel, z);
            } else {
                iBinder = C3313a.m14276A(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbew(i, str, str2, zzbew, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbew[i];
    }
}
