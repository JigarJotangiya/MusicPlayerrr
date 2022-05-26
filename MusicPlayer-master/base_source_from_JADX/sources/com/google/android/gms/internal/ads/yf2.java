package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.C2890b;
import com.google.android.gms.ads.p068a0.p069a.C2867h0;
import com.google.android.gms.ads.p068a0.p069a.C2877p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yf2 implements sg2<zf2> {

    /* renamed from: a */
    private final String f26353a;

    /* renamed from: b */
    private final e93 f26354b;

    /* renamed from: c */
    private final ScheduledExecutorService f26355c;

    /* renamed from: d */
    private final Context f26356d;

    /* renamed from: e */
    private final up2 f26357e;

    /* renamed from: f */
    private final mt0 f26358f;

    yf2(e93 e93, ScheduledExecutorService scheduledExecutorService, String str, Context context, up2 up2, mt0 mt0) {
        this.f26354b = e93;
        this.f26355c = scheduledExecutorService;
        this.f26353a = str;
        this.f26356d = context;
        this.f26357e = up2;
        this.f26358f = mt0;
    }

    /* renamed from: b */
    public static /* synthetic */ d93 m34103b(yf2 yf2) {
        String str = yf2.f26353a;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22400P4)).booleanValue()) {
            str = C2890b.UNKNOWN.name();
        }
        C2877p v = yf2.f26358f.mo19528v();
        o71 o71 = new o71();
        o71.mo19907c(yf2.f26356d);
        sp2 sp2 = new sp2();
        sp2.mo20915H("adUnitId");
        sp2.mo20926d(yf2.f26357e.f24395d);
        sp2.mo20914G(new zzbfi());
        o71.mo19910f(sp2.mo20928f());
        v.mo10706c(o71.mo19911g());
        C2867h0 h0Var = new C2867h0();
        h0Var.mo10693a(str);
        v.mo10704a(h0Var.mo10694b());
        new vd1();
        return s83.m30604f(s83.m30611m((j83) s83.m30613o(j83.m25564E(v.mo10705b().mo10707a()), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22407Q4)).longValue(), TimeUnit.MILLISECONDS, yf2.f26355c), uf2.f24329a, yf2.f26354b), Exception.class, vf2.f24757a, yf2.f26354b);
    }

    /* renamed from: a */
    public final d93<zf2> mo15767a() {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22393O4)).booleanValue() || "adUnitId".equals(this.f26357e.f24397f)) {
            return this.f26354b.mo17138A0(xf2.f25781a);
        }
        return s83.m30610l(new wf2(this), this.f26354b);
    }
}
