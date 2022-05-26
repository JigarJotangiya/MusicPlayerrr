package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3274f0 implements Parcelable.Creator<zax> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v == 3) {
                i3 = C3313a.m14277B(parcel, z);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                scopeArr = (Scope[]) C3313a.m14301s(parcel, z, Scope.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zax(i, i2, i3, scopeArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zax[i];
    }
}
