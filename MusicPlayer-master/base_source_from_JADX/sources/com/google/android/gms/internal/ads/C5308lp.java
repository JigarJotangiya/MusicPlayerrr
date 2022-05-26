package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.lp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5308lp implements Parcelable.Creator<zzbak> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Bundle bundle = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z2)) {
                case 2:
                    str = C3313a.m14298p(parcel2, z2);
                    break;
                case 3:
                    j = C3313a.m14278C(parcel2, z2);
                    break;
                case 4:
                    str2 = C3313a.m14298p(parcel2, z2);
                    break;
                case 5:
                    str3 = C3313a.m14298p(parcel2, z2);
                    break;
                case 6:
                    str4 = C3313a.m14298p(parcel2, z2);
                    break;
                case 7:
                    bundle = C3313a.m14288f(parcel2, z2);
                    break;
                case 8:
                    z = C3313a.m14305w(parcel2, z2);
                    break;
                case 9:
                    j2 = C3313a.m14278C(parcel2, z2);
                    break;
                case 10:
                    str5 = C3313a.m14298p(parcel2, z2);
                    break;
                case 11:
                    i = C3313a.m14277B(parcel2, z2);
                    break;
                default:
                    C3313a.m14280E(parcel2, z2);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzbak(str, j, str2, str3, str4, bundle, z, j2, str5, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbak[i];
    }
}
