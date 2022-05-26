package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.eu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5053eu implements Parcelable.Creator<zzbfi> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        String str = null;
        zzbfi[] zzbfiArr = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < F) {
            int z10 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z10)) {
                case 2:
                    str = C3313a.m14298p(parcel2, z10);
                    break;
                case 3:
                    i = C3313a.m14277B(parcel2, z10);
                    break;
                case 4:
                    i2 = C3313a.m14277B(parcel2, z10);
                    break;
                case 5:
                    z = C3313a.m14305w(parcel2, z10);
                    break;
                case 6:
                    i3 = C3313a.m14277B(parcel2, z10);
                    break;
                case 7:
                    i4 = C3313a.m14277B(parcel2, z10);
                    break;
                case 8:
                    zzbfiArr = (zzbfi[]) C3313a.m14301s(parcel2, z10, zzbfi.CREATOR);
                    break;
                case 9:
                    z2 = C3313a.m14305w(parcel2, z10);
                    break;
                case 10:
                    z3 = C3313a.m14305w(parcel2, z10);
                    break;
                case 11:
                    z4 = C3313a.m14305w(parcel2, z10);
                    break;
                case 12:
                    z5 = C3313a.m14305w(parcel2, z10);
                    break;
                case 13:
                    z6 = C3313a.m14305w(parcel2, z10);
                    break;
                case 14:
                    z7 = C3313a.m14305w(parcel2, z10);
                    break;
                case 15:
                    z8 = C3313a.m14305w(parcel2, z10);
                    break;
                case 16:
                    z9 = C3313a.m14305w(parcel2, z10);
                    break;
                default:
                    C3313a.m14280E(parcel2, z10);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzbfi(str, i, i2, z, i3, i4, zzbfiArr, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfi[i];
    }
}
