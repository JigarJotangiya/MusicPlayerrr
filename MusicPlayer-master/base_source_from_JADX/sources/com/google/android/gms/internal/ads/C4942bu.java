package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.bu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4942bu implements Parcelable.Creator<zzbfd> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzbkm zzbkm = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzbeu zzbeu = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < F) {
            int z4 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z4)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z4);
                    break;
                case 2:
                    j = C3313a.m14278C(parcel2, z4);
                    break;
                case 3:
                    bundle = C3313a.m14288f(parcel2, z4);
                    break;
                case 4:
                    i2 = C3313a.m14277B(parcel2, z4);
                    break;
                case 5:
                    arrayList = C3313a.m14300r(parcel2, z4);
                    break;
                case 6:
                    z = C3313a.m14305w(parcel2, z4);
                    break;
                case 7:
                    i3 = C3313a.m14277B(parcel2, z4);
                    break;
                case 8:
                    z2 = C3313a.m14305w(parcel2, z4);
                    break;
                case 9:
                    str = C3313a.m14298p(parcel2, z4);
                    break;
                case 10:
                    zzbkm = (zzbkm) C3313a.m14297o(parcel2, z4, zzbkm.CREATOR);
                    break;
                case 11:
                    location = (Location) C3313a.m14297o(parcel2, z4, Location.CREATOR);
                    break;
                case 12:
                    str2 = C3313a.m14298p(parcel2, z4);
                    break;
                case 13:
                    bundle2 = C3313a.m14288f(parcel2, z4);
                    break;
                case 14:
                    bundle3 = C3313a.m14288f(parcel2, z4);
                    break;
                case 15:
                    arrayList2 = C3313a.m14300r(parcel2, z4);
                    break;
                case 16:
                    str3 = C3313a.m14298p(parcel2, z4);
                    break;
                case 17:
                    str4 = C3313a.m14298p(parcel2, z4);
                    break;
                case 18:
                    z3 = C3313a.m14305w(parcel2, z4);
                    break;
                case 19:
                    zzbeu = (zzbeu) C3313a.m14297o(parcel2, z4, zzbeu.CREATOR);
                    break;
                case 20:
                    i4 = C3313a.m14277B(parcel2, z4);
                    break;
                case 21:
                    str5 = C3313a.m14298p(parcel2, z4);
                    break;
                case 22:
                    arrayList3 = C3313a.m14300r(parcel2, z4);
                    break;
                case 23:
                    i5 = C3313a.m14277B(parcel2, z4);
                    break;
                case 24:
                    str6 = C3313a.m14298p(parcel2, z4);
                    break;
                default:
                    C3313a.m14280E(parcel2, z4);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzbfd(i, j, bundle, i2, arrayList, z, i3, z2, str, zzbkm, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzbeu, i4, str5, arrayList3, i5, str6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfd[i];
    }
}
