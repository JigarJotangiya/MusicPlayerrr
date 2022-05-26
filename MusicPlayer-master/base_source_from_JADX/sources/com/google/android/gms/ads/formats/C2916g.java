package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.ads.formats.g */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C2916g implements Parcelable.Creator<AdManagerAdViewOptions> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z2);
            if (v == 1) {
                z = C3313a.m14305w(parcel, z2);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z2);
            } else {
                iBinder = C3313a.m14276A(parcel, z2);
            }
        }
        C3313a.m14303u(parcel, F);
        return new AdManagerAdViewOptions(z, iBinder);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdManagerAdViewOptions[i];
    }
}
