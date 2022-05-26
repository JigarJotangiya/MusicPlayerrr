package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C3297n0();

    /* renamed from: g */
    final int f10692g;

    zzai(int i) {
        this.f10692g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10692g);
        C3315b.m14310b(parcel, a);
    }
}
