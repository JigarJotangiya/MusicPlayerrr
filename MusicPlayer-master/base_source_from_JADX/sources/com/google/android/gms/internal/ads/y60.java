package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y60 implements Parcelable.Creator<zzbtc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        String str = null;
        byte[] bArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z3)) {
                case 1:
                    z = C3313a.m14305w(parcel2, z3);
                    break;
                case 2:
                    str = C3313a.m14298p(parcel2, z3);
                    break;
                case 3:
                    i = C3313a.m14277B(parcel2, z3);
                    break;
                case 4:
                    bArr = C3313a.m14289g(parcel2, z3);
                    break;
                case 5:
                    strArr = C3313a.m14299q(parcel2, z3);
                    break;
                case 6:
                    strArr2 = C3313a.m14299q(parcel2, z3);
                    break;
                case 7:
                    z2 = C3313a.m14305w(parcel2, z3);
                    break;
                case 8:
                    j = C3313a.m14278C(parcel2, z3);
                    break;
                default:
                    C3313a.m14280E(parcel2, z3);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzbtc(z, str, i, bArr, strArr, strArr2, z2, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtc[i];
    }
}
