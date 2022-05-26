package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xi0 implements Parcelable.Creator<zzcgc> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> arrayList2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < F) {
            int z5 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z5)) {
                case 2:
                    str = C3313a.m14298p(parcel, z5);
                    break;
                case 3:
                    str2 = C3313a.m14298p(parcel, z5);
                    break;
                case 4:
                    z = C3313a.m14305w(parcel, z5);
                    break;
                case 5:
                    z2 = C3313a.m14305w(parcel, z5);
                    break;
                case 6:
                    arrayList = C3313a.m14300r(parcel, z5);
                    break;
                case 7:
                    z3 = C3313a.m14305w(parcel, z5);
                    break;
                case 8:
                    z4 = C3313a.m14305w(parcel, z5);
                    break;
                case 9:
                    arrayList2 = C3313a.m14300r(parcel, z5);
                    break;
                default:
                    C3313a.m14280E(parcel, z5);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcgc(str, str2, z, z2, arrayList, z3, z4, arrayList2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcgc[i];
    }
}
