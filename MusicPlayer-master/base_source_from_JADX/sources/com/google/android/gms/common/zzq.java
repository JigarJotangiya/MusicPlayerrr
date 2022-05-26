package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C3146a0();

    /* renamed from: g */
    private final boolean f10785g;

    /* renamed from: h */
    private final String f10786h;

    /* renamed from: i */
    private final int f10787i;

    zzq(boolean z, String str, int i) {
        this.f10785g = z;
        this.f10786h = str;
        this.f10787i = C3378z.m14486a(i) - 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 1, this.f10785g);
        C3315b.m14322n(parcel, 2, this.f10786h, false);
        C3315b.m14316h(parcel, 3, this.f10787i);
        C3315b.m14310b(parcel, a);
    }
}
