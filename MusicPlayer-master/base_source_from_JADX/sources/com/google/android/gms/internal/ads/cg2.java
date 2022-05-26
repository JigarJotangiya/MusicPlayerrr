package com.google.android.gms.internal.ads;

import android.content.Context;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cg2 implements sg2<dg2> {

    /* renamed from: a */
    private final ck0 f14974a;

    /* renamed from: b */
    private final e93 f14975b;

    /* renamed from: c */
    private final Context f14976c;

    public cg2(ck0 ck0, e93 e93, Context context) {
        this.f14974a = ck0;
        this.f14975b = e93;
        this.f14976c = context;
    }

    /* renamed from: a */
    public final d93<dg2> mo15767a() {
        return this.f14975b.mo17138A0(new bg2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ dg2 mo16629b() throws Exception {
        if (!this.f14974a.mo16673z(this.f14976c)) {
            return new dg2((String) null, (String) null, (String) null, (String) null, (Long) null);
        }
        String j = this.f14974a.mo16657j(this.f14976c);
        String str = j == null ? BuildConfig.FLAVOR : j;
        String h = this.f14974a.mo16655h(this.f14976c);
        String str2 = h == null ? BuildConfig.FLAVOR : h;
        String f = this.f14974a.mo16653f(this.f14976c);
        String str3 = f == null ? BuildConfig.FLAVOR : f;
        String g = this.f14974a.mo16654g(this.f14976c);
        return new dg2(str, str2, str3, g == null ? BuildConfig.FLAVOR : g, "TIME_OUT".equals(str2) ? (Long) C5054ev.m23225c().mo20153b(C5503qz.f22451X) : null);
    }
}
