package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3144c implements Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                bundle = C3313a.m14288f(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new GoogleSignInOptionsExtensionParcelable(i, i2, bundle);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptionsExtensionParcelable[i];
    }
}
