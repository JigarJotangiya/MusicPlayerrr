package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtx> CREATOR = new r70();

    /* renamed from: g */
    public final String f27271g;

    /* renamed from: h */
    public final Bundle f27272h;

    public zzbtx(String str, Bundle bundle) {
        this.f27271g = str;
        this.f27272h = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27271g, false);
        C3315b.m14312d(parcel, 2, this.f27272h, false);
        C3315b.m14310b(parcel, a);
    }
}
