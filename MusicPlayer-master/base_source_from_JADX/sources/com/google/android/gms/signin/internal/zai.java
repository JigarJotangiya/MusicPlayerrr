package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.internal.zat;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C5889h();

    /* renamed from: g */
    final int f27594g;

    /* renamed from: h */
    final zat f27595h;

    zai(int i, zat zat) {
        this.f27594g = i;
        this.f27595h = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27594g);
        C3315b.m14321m(parcel, 2, this.f27595h, i, false);
        C3315b.m14310b(parcel, a);
    }
}
