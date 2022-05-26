package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfny extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfny> CREATOR = new sz2();

    /* renamed from: g */
    public final int f27403g;

    /* renamed from: h */
    public final int f27404h;

    /* renamed from: i */
    public final String f27405i;

    /* renamed from: j */
    public final String f27406j;

    /* renamed from: k */
    public final int f27407k;

    zzfny(int i, int i2, int i3, String str, String str2) {
        this.f27403g = i;
        this.f27404h = i2;
        this.f27405i = str;
        this.f27406j = str2;
        this.f27407k = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27403g);
        C3315b.m14316h(parcel, 2, this.f27404h);
        C3315b.m14322n(parcel, 3, this.f27405i, false);
        C3315b.m14322n(parcel, 4, this.f27406j, false);
        C3315b.m14316h(parcel, 5, this.f27407k);
        C3315b.m14310b(parcel, a);
    }

    public zzfny(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
