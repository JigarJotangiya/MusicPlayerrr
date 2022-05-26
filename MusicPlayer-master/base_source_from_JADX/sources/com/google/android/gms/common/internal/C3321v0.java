package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3321v0 implements Parcelable.Creator<zzi> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                bundle = C3313a.m14288f(parcel, z);
            } else if (v == 2) {
                featureArr = (Feature[]) C3313a.m14301s(parcel, z, Feature.CREATOR);
            } else if (v == 3) {
                i = C3313a.m14277B(parcel, z);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C3313a.m14297o(parcel, z, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzi(bundle, featureArr, i, connectionTelemetryConfiguration);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
