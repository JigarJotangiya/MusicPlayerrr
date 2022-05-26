package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtz> CREATOR = new t70();

    /* renamed from: g */
    public final int f27273g;

    /* renamed from: h */
    public final int f27274h;

    /* renamed from: i */
    public final String f27275i;

    /* renamed from: j */
    public final int f27276j;

    public zzbtz(int i, int i2, String str, int i3) {
        this.f27273g = i;
        this.f27274h = i2;
        this.f27275i = str;
        this.f27276j = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27274h);
        C3315b.m14322n(parcel, 2, this.f27275i, false);
        C3315b.m14316h(parcel, 3, this.f27276j);
        C3315b.m14316h(parcel, 1000, this.f27273g);
        C3315b.m14310b(parcel, a);
    }
}
