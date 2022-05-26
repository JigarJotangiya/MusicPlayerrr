package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3279h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C3271e0();

    /* renamed from: g */
    final int f10683g;

    /* renamed from: h */
    final IBinder f10684h;

    /* renamed from: i */
    private final ConnectionResult f10685i;

    /* renamed from: j */
    private final boolean f10686j;

    /* renamed from: k */
    private final boolean f10687k;

    zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f10683g = i;
        this.f10684h = iBinder;
        this.f10685i = connectionResult;
        this.f10686j = z;
        this.f10687k = z2;
    }

    /* renamed from: Y */
    public final C3279h mo11900Y() {
        IBinder iBinder = this.f10684h;
        if (iBinder == null) {
            return null;
        }
        return C3279h.C3280a.m14212C0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        return this.f10685i.equals(zav.f10685i) && C3289k.m14227a(mo11900Y(), zav.mo11900Y());
    }

    /* renamed from: m0 */
    public final ConnectionResult mo11902m0() {
        return this.f10685i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10683g);
        C3315b.m14315g(parcel, 2, this.f10684h, false);
        C3315b.m14321m(parcel, 3, this.f10685i, i, false);
        C3315b.m14311c(parcel, 4, this.f10686j);
        C3315b.m14311c(parcel, 5, this.f10687k);
        C3315b.m14310b(parcel, a);
    }
}
