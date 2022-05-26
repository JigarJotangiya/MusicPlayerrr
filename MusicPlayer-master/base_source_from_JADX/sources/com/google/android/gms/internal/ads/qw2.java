package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qw2 {

    /* renamed from: d */
    private static qw2 f22268d;

    /* renamed from: a */
    private float f22269a = 0.0f;

    /* renamed from: b */
    private hw2 f22270b;

    /* renamed from: c */
    private jw2 f22271c;

    public qw2(iw2 iw2, gw2 gw2) {
    }

    /* renamed from: b */
    public static qw2 m29759b() {
        if (f22268d == null) {
            f22268d = new qw2(new iw2(), new gw2());
        }
        return f22268d;
    }

    /* renamed from: a */
    public final float mo20516a() {
        return this.f22269a;
    }

    /* renamed from: c */
    public final void mo20517c(Context context) {
        this.f22270b = new hw2(new Handler(), context, new fw2(), this, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo20518d(float f) {
        this.f22269a = f;
        if (this.f22271c == null) {
            this.f22271c = jw2.m26008a();
        }
        for (yv2 g : this.f22271c.mo18754b()) {
            g.mo22299g().mo22088h(f);
        }
    }

    /* renamed from: e */
    public final void mo20519e() {
        lw2.m26991a().mo19295g(this);
        lw2.m26991a().mo19292d();
        if (lw2.m26991a().mo19294f()) {
            nx2.m28132d().mo19862i();
        }
        this.f22270b.mo18219a();
    }

    /* renamed from: f */
    public final void mo20520f() {
        nx2.m28132d().mo19863j();
        lw2.m26991a().mo19293e();
        this.f22270b.mo18220b();
    }
}
