package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.b0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3236b0 implements Parcelable.Creator<zzs> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z3);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z3);
            } else if (v == 2) {
                iBinder = C3313a.m14276A(parcel, z3);
            } else if (v == 3) {
                z = C3313a.m14305w(parcel, z3);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z3);
            } else {
                z2 = C3313a.m14305w(parcel, z3);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzs(str, iBinder, z, z2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
