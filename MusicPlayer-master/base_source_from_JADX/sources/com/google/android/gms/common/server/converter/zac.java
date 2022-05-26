package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C3345c();

    /* renamed from: g */
    final int f10715g;

    /* renamed from: h */
    final String f10716h;

    /* renamed from: i */
    final int f10717i;

    zac(int i, String str, int i2) {
        this.f10715g = i;
        this.f10716h = str;
        this.f10717i = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10715g);
        C3315b.m14322n(parcel, 2, this.f10716h, false);
        C3315b.m14316h(parcel, 3, this.f10717i);
        C3315b.m14310b(parcel, a);
    }

    zac(String str, int i) {
        this.f10715g = 1;
        this.f10716h = str;
        this.f10717i = i;
    }
}
