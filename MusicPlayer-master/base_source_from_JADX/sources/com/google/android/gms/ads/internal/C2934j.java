package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.ads.internal.j */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2934j implements Parcelable.Creator<zzj> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f = 0.0f;
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < F) {
            int z7 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z7)) {
                case 2:
                    z = C3313a.m14305w(parcel, z7);
                    break;
                case 3:
                    z2 = C3313a.m14305w(parcel, z7);
                    break;
                case 4:
                    str = C3313a.m14298p(parcel, z7);
                    break;
                case 5:
                    z3 = C3313a.m14305w(parcel, z7);
                    break;
                case 6:
                    f = C3313a.m14307y(parcel, z7);
                    break;
                case 7:
                    i = C3313a.m14277B(parcel, z7);
                    break;
                case 8:
                    z4 = C3313a.m14305w(parcel, z7);
                    break;
                case 9:
                    z5 = C3313a.m14305w(parcel, z7);
                    break;
                case 10:
                    z6 = C3313a.m14305w(parcel, z7);
                    break;
                default:
                    C3313a.m14280E(parcel, z7);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzj(z, z2, str, z3, f, i, z4, z5, z6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
