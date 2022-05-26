package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbtc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtc> CREATOR = new y60();

    /* renamed from: g */
    public final boolean f27259g;

    /* renamed from: h */
    public final String f27260h;

    /* renamed from: i */
    public final int f27261i;

    /* renamed from: j */
    public final byte[] f27262j;

    /* renamed from: k */
    public final String[] f27263k;

    /* renamed from: l */
    public final String[] f27264l;

    /* renamed from: m */
    public final boolean f27265m;

    /* renamed from: n */
    public final long f27266n;

    zzbtc(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f27259g = z;
        this.f27260h = str;
        this.f27261i = i;
        this.f27262j = bArr;
        this.f27263k = strArr;
        this.f27264l = strArr2;
        this.f27265m = z2;
        this.f27266n = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 1, this.f27259g);
        C3315b.m14322n(parcel, 2, this.f27260h, false);
        C3315b.m14316h(parcel, 3, this.f27261i);
        C3315b.m14313e(parcel, 4, this.f27262j, false);
        C3315b.m14323o(parcel, 5, this.f27263k, false);
        C3315b.m14323o(parcel, 6, this.f27264l, false);
        C3315b.m14311c(parcel, 7, this.f27265m);
        C3315b.m14319k(parcel, 8, this.f27266n);
        C3315b.m14310b(parcel, a);
    }
}
