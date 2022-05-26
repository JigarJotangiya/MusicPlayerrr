package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C2946e();

    /* renamed from: g */
    public final String f9913g;

    /* renamed from: h */
    public final String f9914h;

    /* renamed from: i */
    public final String f9915i;

    /* renamed from: j */
    public final String f9916j;

    /* renamed from: k */
    public final String f9917k;

    /* renamed from: l */
    public final String f9918l;

    /* renamed from: m */
    public final String f9919m;

    /* renamed from: n */
    public final Intent f9920n;

    /* renamed from: o */
    public final C2964w f9921o;

    /* renamed from: p */
    public final boolean f9922p;

    public zzc(Intent intent, C2964w wVar) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent, C4865b.m20503f2(wVar).asBinder(), false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f9913g, false);
        C3315b.m14322n(parcel, 3, this.f9914h, false);
        C3315b.m14322n(parcel, 4, this.f9915i, false);
        C3315b.m14322n(parcel, 5, this.f9916j, false);
        C3315b.m14322n(parcel, 6, this.f9917k, false);
        C3315b.m14322n(parcel, 7, this.f9918l, false);
        C3315b.m14322n(parcel, 8, this.f9919m, false);
        C3315b.m14321m(parcel, 9, this.f9920n, i, false);
        C3315b.m14315g(parcel, 10, C4865b.m20503f2(this.f9921o).asBinder(), false);
        C3315b.m14311c(parcel, 11, this.f9922p);
        C3315b.m14310b(parcel, a);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z) {
        this.f9913g = str;
        this.f9914h = str2;
        this.f9915i = str3;
        this.f9916j = str4;
        this.f9917k = str5;
        this.f9918l = str6;
        this.f9919m = str7;
        this.f9920n = intent;
        this.f9921o = (C2964w) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder));
        this.f9922p = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, C2964w wVar) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null, C4865b.m20503f2(wVar).asBinder(), false);
    }
}
