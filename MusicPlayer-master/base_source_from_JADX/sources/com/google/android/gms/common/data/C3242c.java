package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.data.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3242c implements Parcelable.Creator<DataHolder> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                strArr = C3313a.m14299q(parcel, z);
            } else if (v == 2) {
                cursorWindowArr = (CursorWindow[]) C3313a.m14301s(parcel, z, CursorWindow.CREATOR);
            } else if (v == 3) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v == 4) {
                bundle = C3313a.m14288f(parcel, z);
            } else if (v != 1000) {
                C3313a.m14280E(parcel, z);
            } else {
                i = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo11701n0();
        return dataHolder;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
