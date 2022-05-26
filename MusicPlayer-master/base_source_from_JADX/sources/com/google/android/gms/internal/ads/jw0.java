package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jw0 implements su1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f18663a;

    /* renamed from: b */
    private final s60 f18664b;

    /* renamed from: c */
    private final mx0 f18665c;

    /* renamed from: d */
    private final jw0 f18666d = this;

    /* renamed from: e */
    private final ms3<su1> f18667e;

    /* renamed from: f */
    private final ms3<s60> f18668f;

    /* renamed from: g */
    private final ms3<nu1> f18669g;

    /* renamed from: h */
    private final ms3<pu1> f18670h;

    /* synthetic */ jw0(mx0 mx0, Context context, s60 s60, iw0 iw0) {
        this.f18665c = mx0;
        this.f18663a = context;
        this.f18664b = s60;
        yr3 b = zr3.m34774b(this);
        this.f18667e = b;
        yr3 b2 = zr3.m34774b(s60);
        this.f18668f = b2;
        ou1 ou1 = new ou1(b2);
        this.f18669g = ou1;
        this.f18670h = xr3.m33787c(new qu1(b, ou1));
    }

    /* renamed from: a */
    public final hu1 mo18752a() {
        return new dw0(this.f18665c, this.f18666d, (bw0) null);
    }

    /* renamed from: f */
    public final pu1 mo18753f() {
        return this.f18670h.mo10679a();
    }
}
