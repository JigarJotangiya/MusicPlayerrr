package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lv1 extends k70 {

    /* renamed from: g */
    final /* synthetic */ Object f19532g;

    /* renamed from: h */
    final /* synthetic */ String f19533h;

    /* renamed from: i */
    final /* synthetic */ long f19534i;

    /* renamed from: j */
    final /* synthetic */ mm0 f19535j;

    /* renamed from: k */
    final /* synthetic */ mv1 f19536k;

    lv1(mv1 mv1, Object obj, String str, long j, mm0 mm0) {
        this.f19536k = mv1;
        this.f19532g = obj;
        this.f19533h = str;
        this.f19534i = j;
        this.f19535j = mm0;
    }

    /* renamed from: c */
    public final void mo19088c() {
        synchronized (this.f19532g) {
            this.f19536k.m27503u(this.f19533h, true, BuildConfig.FLAVOR, (int) (C2971s.m13198a().mo11989b() - this.f19534i));
            this.f19536k.f20304l.mo20507c(this.f19533h);
            this.f19536k.f20307o.mo16617b0(this.f19533h);
            this.f19535j.mo19449c(Boolean.TRUE);
        }
    }

    /* renamed from: q */
    public final void mo18553q(String str) {
        synchronized (this.f19532g) {
            this.f19536k.m27503u(this.f19533h, false, str, (int) (C2971s.m13198a().mo11989b() - this.f19534i));
            this.f19536k.f20304l.mo20505a(this.f19533h, "error");
            this.f19536k.f20307o.mo16616V(this.f19533h, "error");
            this.f19535j.mo19449c(Boolean.FALSE);
        }
    }
}
