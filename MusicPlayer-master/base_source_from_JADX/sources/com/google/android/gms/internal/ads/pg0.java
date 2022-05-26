package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pg0 implements Parcelable.Creator<zzcdq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        Bundle bundle = null;
        zzcjf zzcjf = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        ArrayList<String> arrayList = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzffu zzffu = null;
        String str4 = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z)) {
                case 1:
                    bundle = C3313a.m14288f(parcel, z);
                    break;
                case 2:
                    zzcjf = (zzcjf) C3313a.m14297o(parcel, z, zzcjf.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) C3313a.m14297o(parcel, z, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = C3313a.m14298p(parcel, z);
                    break;
                case 5:
                    arrayList = C3313a.m14300r(parcel, z);
                    break;
                case 6:
                    packageInfo = (PackageInfo) C3313a.m14297o(parcel, z, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = C3313a.m14298p(parcel, z);
                    break;
                case 9:
                    str3 = C3313a.m14298p(parcel, z);
                    break;
                case 10:
                    zzffu = (zzffu) C3313a.m14297o(parcel, z, zzffu.CREATOR);
                    break;
                case 11:
                    str4 = C3313a.m14298p(parcel, z);
                    break;
                default:
                    C3313a.m14280E(parcel, z);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcdq(bundle, zzcjf, applicationInfo, str, arrayList, packageInfo, str2, str3, zzffu, str4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdq[i];
    }
}
