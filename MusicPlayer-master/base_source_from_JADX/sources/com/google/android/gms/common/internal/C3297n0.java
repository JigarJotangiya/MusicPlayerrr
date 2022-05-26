package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.n0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3297n0 implements Parcelable.Creator<zzai> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            if (C3313a.m14304v(z) != 1) {
                C3313a.m14280E(parcel, z);
            } else {
                i = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzai(i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
