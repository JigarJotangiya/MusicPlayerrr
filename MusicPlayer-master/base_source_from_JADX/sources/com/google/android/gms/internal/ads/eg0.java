package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eg0 implements Parcelable.Creator<zzcdc> {
    /* renamed from: a */
    public static final zzcdc m22985a(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        long j = 0;
        long j2 = 0;
        Bundle bundle = null;
        zzbfd zzbfd = null;
        zzbfi zzbfi = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcjf zzcjf = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzbnw zzbnw = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzbjd zzbjd = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbtz zzbtz = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < F) {
            int z10 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z10)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z10);
                    break;
                case 2:
                    bundle = C3313a.m14288f(parcel2, z10);
                    break;
                case 3:
                    zzbfd = (zzbfd) C3313a.m14297o(parcel2, z10, zzbfd.CREATOR);
                    break;
                case 4:
                    zzbfi = (zzbfi) C3313a.m14297o(parcel2, z10, zzbfi.CREATOR);
                    break;
                case 5:
                    str = C3313a.m14298p(parcel2, z10);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) C3313a.m14297o(parcel2, z10, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) C3313a.m14297o(parcel2, z10, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = C3313a.m14298p(parcel2, z10);
                    break;
                case 9:
                    str3 = C3313a.m14298p(parcel2, z10);
                    break;
                case 10:
                    str4 = C3313a.m14298p(parcel2, z10);
                    break;
                case 11:
                    zzcjf = (zzcjf) C3313a.m14297o(parcel2, z10, zzcjf.CREATOR);
                    break;
                case 12:
                    bundle2 = C3313a.m14288f(parcel2, z10);
                    break;
                case 13:
                    i2 = C3313a.m14277B(parcel2, z10);
                    break;
                case 14:
                    arrayList = C3313a.m14300r(parcel2, z10);
                    break;
                case 15:
                    bundle3 = C3313a.m14288f(parcel2, z10);
                    break;
                case 16:
                    z = C3313a.m14305w(parcel2, z10);
                    break;
                case 18:
                    i3 = C3313a.m14277B(parcel2, z10);
                    break;
                case 19:
                    i4 = C3313a.m14277B(parcel2, z10);
                    break;
                case 20:
                    f = C3313a.m14307y(parcel2, z10);
                    break;
                case 21:
                    str5 = C3313a.m14298p(parcel2, z10);
                    break;
                case 25:
                    j = C3313a.m14278C(parcel2, z10);
                    break;
                case 26:
                    str6 = C3313a.m14298p(parcel2, z10);
                    break;
                case 27:
                    arrayList2 = C3313a.m14300r(parcel2, z10);
                    break;
                case 28:
                    str7 = C3313a.m14298p(parcel2, z10);
                    break;
                case 29:
                    zzbnw = (zzbnw) C3313a.m14297o(parcel2, z10, zzbnw.CREATOR);
                    break;
                case 30:
                    arrayList3 = C3313a.m14300r(parcel2, z10);
                    break;
                case 31:
                    j2 = C3313a.m14278C(parcel2, z10);
                    break;
                case 33:
                    str8 = C3313a.m14298p(parcel2, z10);
                    break;
                case 34:
                    f2 = C3313a.m14307y(parcel2, z10);
                    break;
                case 35:
                    i5 = C3313a.m14277B(parcel2, z10);
                    break;
                case 36:
                    i6 = C3313a.m14277B(parcel2, z10);
                    break;
                case 37:
                    z3 = C3313a.m14305w(parcel2, z10);
                    break;
                case 39:
                    str9 = C3313a.m14298p(parcel2, z10);
                    break;
                case 40:
                    z2 = C3313a.m14305w(parcel2, z10);
                    break;
                case 41:
                    str10 = C3313a.m14298p(parcel2, z10);
                    break;
                case 42:
                    z4 = C3313a.m14305w(parcel2, z10);
                    break;
                case 43:
                    i7 = C3313a.m14277B(parcel2, z10);
                    break;
                case 44:
                    bundle4 = C3313a.m14288f(parcel2, z10);
                    break;
                case 45:
                    str11 = C3313a.m14298p(parcel2, z10);
                    break;
                case 46:
                    zzbjd = (zzbjd) C3313a.m14297o(parcel2, z10, zzbjd.CREATOR);
                    break;
                case 47:
                    z5 = C3313a.m14305w(parcel2, z10);
                    break;
                case 48:
                    bundle5 = C3313a.m14288f(parcel2, z10);
                    break;
                case 49:
                    str12 = C3313a.m14298p(parcel2, z10);
                    break;
                case 50:
                    str13 = C3313a.m14298p(parcel2, z10);
                    break;
                case 51:
                    str14 = C3313a.m14298p(parcel2, z10);
                    break;
                case 52:
                    z6 = C3313a.m14305w(parcel2, z10);
                    break;
                case 53:
                    arrayList4 = C3313a.m14293k(parcel2, z10);
                    break;
                case 54:
                    str15 = C3313a.m14298p(parcel2, z10);
                    break;
                case 55:
                    arrayList5 = C3313a.m14300r(parcel2, z10);
                    break;
                case 56:
                    i8 = C3313a.m14277B(parcel2, z10);
                    break;
                case 57:
                    z7 = C3313a.m14305w(parcel2, z10);
                    break;
                case 58:
                    z8 = C3313a.m14305w(parcel2, z10);
                    break;
                case 59:
                    z9 = C3313a.m14305w(parcel2, z10);
                    break;
                case 60:
                    arrayList6 = C3313a.m14300r(parcel2, z10);
                    break;
                case 61:
                    str16 = C3313a.m14298p(parcel2, z10);
                    break;
                case 63:
                    zzbtz = (zzbtz) C3313a.m14297o(parcel2, z10, zzbtz.CREATOR);
                    break;
                case 64:
                    str17 = C3313a.m14298p(parcel2, z10);
                    break;
                case 65:
                    bundle6 = C3313a.m14288f(parcel2, z10);
                    break;
                default:
                    C3313a.m14280E(parcel2, z10);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzcdc(i, bundle, zzbfd, zzbfi, str, applicationInfo, packageInfo, str2, str3, str4, zzcjf, bundle2, i2, arrayList, bundle3, z, i3, i4, f, str5, j, str6, arrayList2, str7, zzbnw, arrayList3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, zzbjd, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i8, z7, z8, z9, arrayList6, str16, zzbtz, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m22985a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdc[i];
    }
}
