package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3349c implements Parcelable.Creator<zan> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        ArrayList<zal> arrayList = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                arrayList = C3313a.m14302t(parcel, z, zal.CREATOR);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                str = C3313a.m14298p(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zan(i, arrayList, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zan[i];
    }
}
