package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfnm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnm> CREATOR = new jz2();

    /* renamed from: g */
    public final int f27395g;

    /* renamed from: h */
    public final byte[] f27396h;

    zzfnm(int i, byte[] bArr) {
        this.f27395g = i;
        this.f27396h = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27395g);
        C3315b.m14313e(parcel, 2, this.f27396h, false);
        C3315b.m14310b(parcel, a);
    }

    public zzfnm(byte[] bArr) {
        this(1, bArr);
    }
}
