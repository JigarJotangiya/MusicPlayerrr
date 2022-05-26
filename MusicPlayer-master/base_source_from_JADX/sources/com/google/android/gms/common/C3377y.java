package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.y */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3377y implements Parcelable.Creator<zzn> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < F) {
            int z4 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z4);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z4);
            } else if (v == 2) {
                z = C3313a.m14305w(parcel, z4);
            } else if (v == 3) {
                z2 = C3313a.m14305w(parcel, z4);
            } else if (v == 4) {
                iBinder = C3313a.m14276A(parcel, z4);
            } else if (v != 5) {
                C3313a.m14280E(parcel, z4);
            } else {
                z3 = C3313a.m14305w(parcel, z4);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzn(str, z, z2, iBinder, z3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
