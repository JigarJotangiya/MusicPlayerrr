package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.internal.zav;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C5890i();

    /* renamed from: g */
    final int f27596g;

    /* renamed from: h */
    private final ConnectionResult f27597h;

    /* renamed from: i */
    private final zav f27598i;

    zak(int i, ConnectionResult connectionResult, zav zav) {
        this.f27596g = i;
        this.f27597h = connectionResult;
        this.f27598i = zav;
    }

    /* renamed from: Y */
    public final ConnectionResult mo22739Y() {
        return this.f27597h;
    }

    /* renamed from: m0 */
    public final zav mo22740m0() {
        return this.f27598i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27596g);
        C3315b.m14321m(parcel, 2, this.f27597h, i, false);
        C3315b.m14321m(parcel, 3, this.f27598i, i, false);
        C3315b.m14310b(parcel, a);
    }
}
