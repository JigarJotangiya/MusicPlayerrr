package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i02 implements ef1 {

    /* renamed from: g */
    private boolean f17833g = false;

    /* renamed from: h */
    private boolean f17834h = false;

    /* renamed from: i */
    private final String f17835i;

    /* renamed from: j */
    private final gu2 f17836j;

    /* renamed from: k */
    private final C3024o1 f17837k;

    public i02(String str, gu2 gu2) {
        this.f17835i = str;
        this.f17836j = gu2;
        this.f17837k = C2971s.m13213p().mo17562h();
    }

    /* renamed from: a */
    private final fu2 m24997a(String str) {
        String str2;
        if (this.f17837k.mo11065E()) {
            str2 = BuildConfig.FLAVOR;
        } else {
            str2 = this.f17835i;
        }
        fu2 b = fu2.m23966b(str);
        b.mo17738a("tms", Long.toString(C2971s.m13198a().mo11989b(), 10));
        b.mo17738a("tid", str2);
        return b;
    }

    /* renamed from: V */
    public final void mo16616V(String str, String str2) {
        gu2 gu2 = this.f17836j;
        fu2 a = m24997a("adapter_init_finished");
        a.mo17738a("ancn", str);
        a.mo17738a("rqe", str2);
        gu2.mo18029a(a);
    }

    /* renamed from: b0 */
    public final void mo16617b0(String str) {
        gu2 gu2 = this.f17836j;
        fu2 a = m24997a("adapter_init_finished");
        a.mo17738a("ancn", str);
        gu2.mo18029a(a);
    }

    /* renamed from: f */
    public final synchronized void mo16618f() {
        if (!this.f17834h) {
            this.f17836j.mo18029a(m24997a("init_finished"));
            this.f17834h = true;
        }
    }

    /* renamed from: p */
    public final void mo16619p(String str) {
        gu2 gu2 = this.f17836j;
        fu2 a = m24997a("adapter_init_started");
        a.mo17738a("ancn", str);
        gu2.mo18029a(a);
    }

    public final synchronized void zze() {
        if (!this.f17833g) {
            this.f17836j.mo18029a(m24997a("init_started"));
            this.f17833g = true;
        }
    }
}
