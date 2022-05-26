package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C3274f0();

    /* renamed from: g */
    final int f10688g;

    /* renamed from: h */
    private final int f10689h;

    /* renamed from: i */
    private final int f10690i;
    @Deprecated

    /* renamed from: j */
    private final Scope[] f10691j;

    zax(int i, int i2, int i3, Scope[] scopeArr) {
        this.f10688g = i;
        this.f10689h = i2;
        this.f10690i = i3;
        this.f10691j = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10688g);
        C3315b.m14316h(parcel, 2, this.f10689h);
        C3315b.m14316h(parcel, 3, this.f10690i);
        C3315b.m14325q(parcel, 4, this.f10691j, i, false);
        C3315b.m14310b(parcel, a);
    }
}
