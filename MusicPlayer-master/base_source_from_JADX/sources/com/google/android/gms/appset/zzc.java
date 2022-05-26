package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C3136e();

    /* renamed from: g */
    private final String f10247g;

    /* renamed from: h */
    private final int f10248h;

    public zzc(String str, int i) {
        this.f10247g = str;
        this.f10248h = i;
    }

    /* renamed from: Y */
    public final int mo11399Y() {
        return this.f10248h;
    }

    /* renamed from: m0 */
    public final String mo11400m0() {
        return this.f10247g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f10247g, false);
        C3315b.m14316h(parcel, 2, this.f10248h);
        C3315b.m14310b(parcel, a);
    }
}
