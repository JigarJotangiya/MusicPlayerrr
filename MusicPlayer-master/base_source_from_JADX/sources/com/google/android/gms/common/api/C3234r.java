package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.api.r */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3234r implements Parcelable.Creator<Status> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 3) {
                pendingIntent = (PendingIntent) C3313a.m14297o(parcel, z, PendingIntent.CREATOR);
            } else if (v == 4) {
                connectionResult = (ConnectionResult) C3313a.m14297o(parcel, z, ConnectionResult.CREATOR);
            } else if (v != 1000) {
                C3313a.m14280E(parcel, z);
            } else {
                i = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new Status(i, i2, str, pendingIntent, connectionResult);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
