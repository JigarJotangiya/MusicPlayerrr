package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2926b;
import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vn1 {

    /* renamed from: a */
    private final up2 f24850a;

    /* renamed from: b */
    private final Executor f24851b;

    /* renamed from: c */
    private final oq1 f24852c;

    /* renamed from: d */
    private final ip1 f24853d;

    /* renamed from: e */
    private final Context f24854e;

    /* renamed from: f */
    private final gt1 f24855f;

    /* renamed from: g */
    private final gu2 f24856g;

    /* renamed from: h */
    private final lv2 f24857h;

    /* renamed from: i */
    private final y12 f24858i;

    public vn1(up2 up2, Executor executor, oq1 oq1, Context context, gt1 gt1, gu2 gu2, lv2 lv2, y12 y12, ip1 ip1) {
        this.f24850a = up2;
        this.f24851b = executor;
        this.f24852c = oq1;
        this.f24854e = context;
        this.f24855f = gt1;
        this.f24856g = gu2;
        this.f24857h = lv2;
        this.f24858i = y12;
        this.f24853d = ip1;
    }

    /* renamed from: h */
    private final void m32482h(pr0 pr0) {
        m32483i(pr0);
        pr0.mo17686d0("/video", x50.f25672l);
        pr0.mo17686d0("/videoMeta", x50.f25673m);
        pr0.mo17686d0("/precache", new fq0());
        pr0.mo17686d0("/delayPageLoaded", x50.f25676p);
        pr0.mo17686d0("/instrument", x50.f25674n);
        pr0.mo17686d0("/log", x50.f25667g);
        pr0.mo17686d0("/click", x50.m33571a((yf1) null));
        if (this.f24850a.f24393b != null) {
            pr0.mo17673Q0().mo17295X(true);
            pr0.mo17686d0("/open", new k60((C2926b) null, (wd0) null, (y12) null, (gt1) null, (gu2) null));
        } else {
            pr0.mo17673Q0().mo17295X(false);
        }
        if (C2971s.m13212o().mo16673z(pr0.getContext())) {
            pr0.mo17686d0("/logScionEvent", new e60(pr0.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m32483i(pr0 pr0) {
        pr0.mo17686d0("/videoClicked", x50.f25668h);
        pr0.mo17673Q0().mo17296X0(true);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22499d2)).booleanValue()) {
            pr0.mo17686d0("/getNativeAdViewSignals", x50.f25679s);
        }
        pr0.mo17686d0("/getNativeClickMeta", x50.f25680t);
    }

    /* renamed from: a */
    public final d93<pr0> mo21566a(JSONObject jSONObject) {
        return s83.m30612n(s83.m30612n(s83.m30607i(null), new nn1(this), this.f24851b), new pn1(this, jSONObject), this.f24851b);
    }

    /* renamed from: b */
    public final d93<pr0> mo21567b(String str, String str2, bp2 bp2, ep2 ep2, zzbfi zzbfi) {
        return s83.m30612n(s83.m30607i(null), new on1(this, zzbfi, bp2, ep2, str, str2), this.f24851b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo21568c(JSONObject jSONObject, pr0 pr0) throws Exception {
        lm0 f = lm0.m26780f(pr0);
        if (this.f24850a.f24393b != null) {
            pr0.mo17656E0(gt0.m24495d());
        } else {
            pr0.mo17656E0(gt0.m24496e());
        }
        pr0.mo17673Q0().mo17300d1(new kn1(this, pr0, f));
        pr0.mo17684c1("google.afma.nativeAds.renderVideo", jSONObject);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ d93 mo21569d(zzbfi zzbfi, bp2 bp2, ep2 ep2, String str, String str2, Object obj) throws Exception {
        pr0 a = this.f24852c.mo20090a(zzbfi, bp2, ep2);
        lm0 f = lm0.m26780f(a);
        if (this.f24850a.f24393b != null) {
            m32482h(a);
            a.mo17656E0(gt0.m24495d());
        } else {
            fp1 b = this.f24853d.mo18473b();
            fp1 fp1 = b;
            et0 Q0 = a.mo17673Q0();
            C2926b bVar = r3;
            C2926b bVar2 = new C2926b(this.f24854e, (zi0) null, (zzcde) null);
            Q0.mo17293O(b, fp1, b, b, b, false, (b60) null, bVar, (de0) null, (zi0) null, this.f24858i, this.f24857h, this.f24855f, this.f24856g, (z50) null, b);
            m32483i(a);
        }
        a.mo17673Q0().mo17300d1(new ln1(this, a, f));
        a.mo17715w0(str, str2, (String) null);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ d93 mo21570e(Object obj) throws Exception {
        pr0 a = this.f24852c.mo20090a(zzbfi.m34950n0(), (bp2) null, (ep2) null);
        lm0 f = lm0.m26780f(a);
        m32482h(a);
        a.mo17673Q0().mo17299a1(new mn1(f));
        a.loadUrl((String) C5054ev.m23225c().mo20153b(C5503qz.f22491c2));
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo21571f(pr0 pr0, lm0 lm0, boolean z) {
        if (!(this.f24850a.f24392a == null || pr0.zzs() == null)) {
            pr0.zzs().mo19502i7(this.f24850a.f24392a);
        }
        lm0.mo19184g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo21572g(pr0 pr0, lm0 lm0, boolean z) {
        if (z) {
            if (!(this.f24850a.f24392a == null || pr0.zzs() == null)) {
                pr0.zzs().mo19502i7(this.f24850a.f24392a);
            }
            lm0.mo19184g();
            return;
        }
        lm0.mo19451e(new e62(1, "Html video Web View failed to load."));
    }
}
