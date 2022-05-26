package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C3377y();

    /* renamed from: g */
    private final String f10780g;

    /* renamed from: h */
    private final boolean f10781h;

    /* renamed from: i */
    private final boolean f10782i;

    /* renamed from: j */
    private final Context f10783j;

    /* renamed from: k */
    private final boolean f10784k;

    zzn(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f10780g = str;
        this.f10781h = z;
        this.f10782i = z2;
        this.f10783j = (Context) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder));
        this.f10784k = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [f.f.b.a.b.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f10780g, false);
        C3315b.m14311c(parcel, 2, this.f10781h);
        C3315b.m14311c(parcel, 3, this.f10782i);
        C3315b.m14315g(parcel, 4, C4865b.m20503f2(this.f10783j), false);
        C3315b.m14311c(parcel, 5, this.f10784k);
        C3315b.m14310b(parcel, a);
    }
}
