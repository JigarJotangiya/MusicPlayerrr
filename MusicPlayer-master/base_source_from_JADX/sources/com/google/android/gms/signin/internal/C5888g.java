package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.signin.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C5888g implements Parcelable.Creator<zag> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                arrayList = C3313a.m14300r(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                str = C3313a.m14298p(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zag(arrayList, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
