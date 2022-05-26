package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jz2 implements Parcelable.Creator<zzfnm> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                bArr = C3313a.m14289g(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzfnm(i, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfnm[i];
    }
}
