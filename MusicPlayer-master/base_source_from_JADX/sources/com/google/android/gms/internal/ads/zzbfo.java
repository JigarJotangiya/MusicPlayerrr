package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfo> CREATOR = new C5165hu();

    /* renamed from: g */
    public final int f27238g;

    public zzbfo(int i) {
        this.f27238g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 2, this.f27238g);
        C3315b.m14310b(parcel, a);
    }
}
