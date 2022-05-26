package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.ads.internal.overlay.e */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2946e implements Parcelable.Creator<zzc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Intent intent = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z2)) {
                case 2:
                    str = C3313a.m14298p(parcel, z2);
                    break;
                case 3:
                    str2 = C3313a.m14298p(parcel, z2);
                    break;
                case 4:
                    str3 = C3313a.m14298p(parcel, z2);
                    break;
                case 5:
                    str4 = C3313a.m14298p(parcel, z2);
                    break;
                case 6:
                    str5 = C3313a.m14298p(parcel, z2);
                    break;
                case 7:
                    str6 = C3313a.m14298p(parcel, z2);
                    break;
                case 8:
                    str7 = C3313a.m14298p(parcel, z2);
                    break;
                case 9:
                    intent = (Intent) C3313a.m14297o(parcel, z2, Intent.CREATOR);
                    break;
                case 10:
                    iBinder = C3313a.m14276A(parcel, z2);
                    break;
                case 11:
                    z = C3313a.m14305w(parcel, z2);
                    break;
                default:
                    C3313a.m14280E(parcel, z2);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzc(str, str2, str3, str4, str5, str6, str7, intent, iBinder, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
