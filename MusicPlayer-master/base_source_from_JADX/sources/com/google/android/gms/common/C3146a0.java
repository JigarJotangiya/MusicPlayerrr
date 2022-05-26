package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.a0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3146a0 implements Parcelable.Creator<zzq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z2);
            if (v == 1) {
                z = C3313a.m14305w(parcel, z2);
            } else if (v == 2) {
                str = C3313a.m14298p(parcel, z2);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z2);
            } else {
                i = C3313a.m14277B(parcel, z2);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzq(z, str, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
