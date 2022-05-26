package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.w0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3323w0 implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z3)) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) C3313a.m14297o(parcel, z3, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = C3313a.m14305w(parcel, z3);
                    break;
                case 3:
                    z2 = C3313a.m14305w(parcel, z3);
                    break;
                case 4:
                    iArr = C3313a.m14292j(parcel, z3);
                    break;
                case 5:
                    i = C3313a.m14277B(parcel, z3);
                    break;
                case 6:
                    iArr2 = C3313a.m14292j(parcel, z3);
                    break;
                default:
                    C3313a.m14280E(parcel, z3);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i, iArr2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionTelemetryConfiguration[i];
    }
}
