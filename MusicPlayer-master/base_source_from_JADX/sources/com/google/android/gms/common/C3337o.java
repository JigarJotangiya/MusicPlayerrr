package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.o */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3337o implements Parcelable.Creator<Feature> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 2) {
                i = C3313a.m14277B(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                j = C3313a.m14278C(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new Feature(str, i, j);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
