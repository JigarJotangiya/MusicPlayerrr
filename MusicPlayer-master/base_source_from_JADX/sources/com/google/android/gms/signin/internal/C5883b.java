package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.signin.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C5883b implements Parcelable.Creator<zaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                intent = (Intent) C3313a.m14297o(parcel, z, Intent.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zaa(i, i2, intent);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
