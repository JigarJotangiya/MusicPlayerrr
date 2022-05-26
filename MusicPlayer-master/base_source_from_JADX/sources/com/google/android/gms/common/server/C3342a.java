package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.server.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3342a implements Parcelable.Creator<FavaDiagnosticsEntity> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                str = C3313a.m14298p(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                i2 = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new FavaDiagnosticsEntity(i, str, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FavaDiagnosticsEntity[i];
    }
}
