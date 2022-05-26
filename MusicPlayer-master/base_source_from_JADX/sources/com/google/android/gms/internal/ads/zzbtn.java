package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbtn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtn> CREATOR = new i70();

    /* renamed from: g */
    public final String f27267g;

    /* renamed from: h */
    public final boolean f27268h;

    /* renamed from: i */
    public final int f27269i;

    /* renamed from: j */
    public final String f27270j;

    public zzbtn(String str, boolean z, int i, String str2) {
        this.f27267g = str;
        this.f27268h = z;
        this.f27269i = i;
        this.f27270j = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27267g, false);
        C3315b.m14311c(parcel, 2, this.f27268h);
        C3315b.m14316h(parcel, 3, this.f27269i);
        C3315b.m14322n(parcel, 4, this.f27270j, false);
        C3315b.m14310b(parcel, a);
    }
}
