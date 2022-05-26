package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzchx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzchx> CREATOR = new sk0();
    @Deprecated

    /* renamed from: g */
    public final String f27372g;

    /* renamed from: h */
    public final String f27373h;
    @Deprecated

    /* renamed from: i */
    public final zzbfi f27374i;

    /* renamed from: j */
    public final zzbfd f27375j;

    public zzchx(String str, String str2, zzbfi zzbfi, zzbfd zzbfd) {
        this.f27372g = str;
        this.f27373h = str2;
        this.f27374i = zzbfi;
        this.f27375j = zzbfd;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27372g, false);
        C3315b.m14322n(parcel, 2, this.f27373h, false);
        C3315b.m14321m(parcel, 3, this.f27374i, i, false);
        C3315b.m14321m(parcel, 4, this.f27375j, i, false);
        C3315b.m14310b(parcel, a);
    }
}
