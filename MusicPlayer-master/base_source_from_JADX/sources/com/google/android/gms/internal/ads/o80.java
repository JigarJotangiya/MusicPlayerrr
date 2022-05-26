package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.Map;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class o80 implements g80, f80 {

    /* renamed from: g */
    private final pr0 f20950g;

    public o80(Context context, zzcjf zzcjf, C5737xa xaVar, C2925a aVar) throws bs0 {
        C2971s.m13197A();
        pr0 a = cs0.m22106a(context, gt0.m24492a(), BuildConfig.FLAVOR, false, false, (C5737xa) null, (q00) null, zzcjf, (f00) null, (C2935k) null, (C2925a) null, C5790yp.m34259a(), (bp2) null, (ep2) null);
        this.f20950g = a;
        ((View) a).setWillNotDraw(true);
    }

    /* renamed from: T */
    private static final void m28341T(Runnable runnable) {
        C4980cv.m22123b();
        if (nl0.m27924p()) {
            runnable.run();
        } else {
            C2979b2.f9980i.post(runnable);
        }
    }

    /* renamed from: C0 */
    public final void mo17874C0(String str) {
        m28341T(new l80(this, str));
    }

    /* renamed from: D0 */
    public final void mo17875D0(q80 q80) {
        this.f20950g.mo17673Q0().mo17299a1(new h80(q80, (byte[]) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo19918O(String str) {
        this.f20950g.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: V */
    public final void mo17876V(String str) {
        m28341T(new m80(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: Y0 */
    public final void mo19655Y0(String str, y50<? super n90> y50) {
        this.f20950g.mo17703p0(str, new i80(y50));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17508a(String str, String str2) {
        e80.m22859c(this, str, str2);
    }

    /* renamed from: b */
    public final void mo17877b() {
        this.f20950g.destroy();
    }

    /* renamed from: c1 */
    public final /* synthetic */ void mo17684c1(String str, JSONObject jSONObject) {
        e80.m22860d(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo19919f(String str) {
        this.f20950g.mo17509p(str);
    }

    /* renamed from: g */
    public final boolean mo17878g() {
        return this.f20950g.mo17666L0();
    }

    /* renamed from: h */
    public final o90 mo17879h() {
        return new o90(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo19920j(String str) {
        this.f20950g.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: n0 */
    public final /* synthetic */ void mo16880n0(String str, Map map) {
        e80.m22857a(this, str, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo19921o(String str) {
        this.f20950g.loadUrl(str);
    }

    /* renamed from: p */
    public final void mo17509p(String str) {
        m28341T(new j80(this, str));
    }

    /* renamed from: r */
    public final /* synthetic */ void mo16881r(String str, JSONObject jSONObject) {
        e80.m22858b(this, str, jSONObject);
    }

    /* renamed from: v */
    public final void mo17880v(String str) {
        m28341T(new k80(this, str));
    }

    /* renamed from: z */
    public final void mo19656z(String str, y50<? super n90> y50) {
        this.f20950g.mo17686d0(str, new n80(this, y50));
    }
}
