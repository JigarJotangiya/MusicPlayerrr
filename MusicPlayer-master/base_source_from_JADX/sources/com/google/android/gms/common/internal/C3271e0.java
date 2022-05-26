package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.e0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3271e0 implements Parcelable.Creator<zav> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z3);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z3);
            } else if (v == 2) {
                iBinder = C3313a.m14276A(parcel, z3);
            } else if (v == 3) {
                connectionResult = (ConnectionResult) C3313a.m14297o(parcel, z3, ConnectionResult.CREATOR);
            } else if (v == 4) {
                z = C3313a.m14305w(parcel, z3);
            } else if (v != 5) {
                C3313a.m14280E(parcel, z3);
            } else {
                z2 = C3313a.m14305w(parcel, z3);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zav(i, iBinder, connectionResult, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
