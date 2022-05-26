package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C3321v0();

    /* renamed from: g */
    Bundle f10693g;

    /* renamed from: h */
    Feature[] f10694h;

    /* renamed from: i */
    int f10695i;

    /* renamed from: j */
    ConnectionTelemetryConfiguration f10696j;

    public zzi() {
    }

    zzi(Bundle bundle, Feature[] featureArr, int i, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f10693g = bundle;
        this.f10694h = featureArr;
        this.f10695i = i;
        this.f10696j = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14312d(parcel, 1, this.f10693g, false);
        C3315b.m14325q(parcel, 2, this.f10694h, i, false);
        C3315b.m14316h(parcel, 3, this.f10695i);
        C3315b.m14321m(parcel, 4, this.f10696j, i, false);
        C3315b.m14310b(parcel, a);
    }
}
