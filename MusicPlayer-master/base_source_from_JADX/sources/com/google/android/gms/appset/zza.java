package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new C3135d();

    /* renamed from: g */
    private final String f10245g;

    /* renamed from: h */
    private final String f10246h;

    public zza(String str, String str2) {
        this.f10245g = str;
        this.f10246h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f10245g, false);
        C3315b.m14322n(parcel, 2, this.f10246h, false);
        C3315b.m14310b(parcel, a);
    }
}
