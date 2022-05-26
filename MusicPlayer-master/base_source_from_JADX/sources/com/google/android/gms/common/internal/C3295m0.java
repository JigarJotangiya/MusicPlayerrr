package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.m0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3295m0 implements Parcelable.Creator<RootTelemetryConfiguration> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z3);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z3);
            } else if (v == 2) {
                z = C3313a.m14305w(parcel, z3);
            } else if (v == 3) {
                z2 = C3313a.m14305w(parcel, z3);
            } else if (v == 4) {
                i2 = C3313a.m14277B(parcel, z3);
            } else if (v != 5) {
                C3313a.m14280E(parcel, z3);
            } else {
                i3 = C3313a.m14277B(parcel, z3);
            }
        }
        C3313a.m14303u(parcel, F);
        return new RootTelemetryConfiguration(i, z, z2, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RootTelemetryConfiguration[i];
    }
}
