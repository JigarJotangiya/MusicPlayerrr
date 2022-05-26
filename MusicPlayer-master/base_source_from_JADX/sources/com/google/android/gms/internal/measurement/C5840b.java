package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.measurement.b */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class C5840b implements Parcelable.Creator<zzz> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z2)) {
                case 1:
                    j = C3313a.m14278C(parcel2, z2);
                    break;
                case 2:
                    j2 = C3313a.m14278C(parcel2, z2);
                    break;
                case 3:
                    z = C3313a.m14305w(parcel2, z2);
                    break;
                case 4:
                    str = C3313a.m14298p(parcel2, z2);
                    break;
                case 5:
                    str2 = C3313a.m14298p(parcel2, z2);
                    break;
                case 6:
                    str3 = C3313a.m14298p(parcel2, z2);
                    break;
                case 7:
                    bundle = C3313a.m14288f(parcel2, z2);
                    break;
                case 8:
                    str4 = C3313a.m14298p(parcel2, z2);
                    break;
                default:
                    C3313a.m14280E(parcel2, z2);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new zzz(j, j2, z, str, str2, str3, bundle, str4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzz[i];
    }
}
