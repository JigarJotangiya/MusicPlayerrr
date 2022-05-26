package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.common.internal.zav;

/* renamed from: com.google.android.gms.signin.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C5890i implements Parcelable.Creator<zak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        ConnectionResult connectionResult = null;
        zav zav = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                connectionResult = (ConnectionResult) C3313a.m14297o(parcel, z, ConnectionResult.CREATOR);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                zav = (zav) C3313a.m14297o(parcel, z, zav.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zak(i, connectionResult, zav);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
