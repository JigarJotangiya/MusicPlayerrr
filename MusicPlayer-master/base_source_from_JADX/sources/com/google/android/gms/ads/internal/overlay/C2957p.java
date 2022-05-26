package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.internal.ads.zzcjf;

/* renamed from: com.google.android.gms.ads.internal.overlay.p */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2957p implements Parcelable.Creator<AdOverlayInfoParcel> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        zzc zzc = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        String str2 = null;
        IBinder iBinder5 = null;
        String str3 = null;
        zzcjf zzcjf = null;
        String str4 = null;
        zzj zzj = null;
        IBinder iBinder6 = null;
        String str5 = null;
        IBinder iBinder7 = null;
        IBinder iBinder8 = null;
        IBinder iBinder9 = null;
        IBinder iBinder10 = null;
        String str6 = null;
        String str7 = null;
        IBinder iBinder11 = null;
        IBinder iBinder12 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z2)) {
                case 2:
                    zzc = (zzc) C3313a.m14297o(parcel2, z2, zzc.CREATOR);
                    break;
                case 3:
                    iBinder = C3313a.m14276A(parcel2, z2);
                    break;
                case 4:
                    iBinder2 = C3313a.m14276A(parcel2, z2);
                    break;
                case 5:
                    iBinder3 = C3313a.m14276A(parcel2, z2);
                    break;
                case 6:
                    iBinder4 = C3313a.m14276A(parcel2, z2);
                    break;
                case 7:
                    str = C3313a.m14298p(parcel2, z2);
                    break;
                case 8:
                    z = C3313a.m14305w(parcel2, z2);
                    break;
                case 9:
                    str2 = C3313a.m14298p(parcel2, z2);
                    break;
                case 10:
                    iBinder5 = C3313a.m14276A(parcel2, z2);
                    break;
                case 11:
                    i = C3313a.m14277B(parcel2, z2);
                    break;
                case 12:
                    i2 = C3313a.m14277B(parcel2, z2);
                    break;
                case 13:
                    str3 = C3313a.m14298p(parcel2, z2);
                    break;
                case 14:
                    zzcjf = (zzcjf) C3313a.m14297o(parcel2, z2, zzcjf.CREATOR);
                    break;
                case 16:
                    str4 = C3313a.m14298p(parcel2, z2);
                    break;
                case 17:
                    zzj = (zzj) C3313a.m14297o(parcel2, z2, zzj.CREATOR);
                    break;
                case 18:
                    iBinder6 = C3313a.m14276A(parcel2, z2);
                    break;
                case 19:
                    str5 = C3313a.m14298p(parcel2, z2);
                    break;
                case 20:
                    iBinder7 = C3313a.m14276A(parcel2, z2);
                    break;
                case 21:
                    iBinder8 = C3313a.m14276A(parcel2, z2);
                    break;
                case 22:
                    iBinder9 = C3313a.m14276A(parcel2, z2);
                    break;
                case 23:
                    iBinder10 = C3313a.m14276A(parcel2, z2);
                    break;
                case 24:
                    str6 = C3313a.m14298p(parcel2, z2);
                    break;
                case 25:
                    str7 = C3313a.m14298p(parcel2, z2);
                    break;
                case 26:
                    iBinder11 = C3313a.m14276A(parcel2, z2);
                    break;
                case 27:
                    iBinder12 = C3313a.m14276A(parcel2, z2);
                    break;
                default:
                    C3313a.m14280E(parcel2, z2);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new AdOverlayInfoParcel(zzc, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i, i2, str3, zzcjf, str4, zzj, iBinder6, str5, iBinder7, iBinder8, iBinder9, iBinder10, str6, str7, iBinder11, iBinder12);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
