package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.lang.ref.WeakReference;
import java.util.Map;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcco extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcco> CREATOR = new qf0();

    /* renamed from: g */
    public final View f27283g;

    /* renamed from: h */
    public final Map<String, WeakReference<View>> f27284h;

    public zzcco(IBinder iBinder, IBinder iBinder2) {
        this.f27283g = (View) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder));
        this.f27284h = (Map) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14315g(parcel, 1, C4865b.m20503f2(this.f27283g).asBinder(), false);
        C3315b.m14315g(parcel, 2, C4865b.m20503f2(this.f27284h).asBinder(), false);
        C3315b.m14310b(parcel, a);
    }
}
