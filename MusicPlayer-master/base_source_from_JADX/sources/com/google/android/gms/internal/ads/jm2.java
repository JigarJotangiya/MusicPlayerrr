package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.n71;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jm2<R extends n71<? extends g41>> {

    /* renamed from: a */
    private final dr2 f18535a;

    /* renamed from: b */
    private final R f18536b;

    /* renamed from: c */
    private final Executor f18537c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public im2 f18538d;

    public jm2(dr2 dr2, R r, Executor executor) {
        this.f18535a = dr2;
        this.f18536b = r;
        this.f18537c = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    /* renamed from: e */
    public final mr2 m25782e() {
        up2 d = this.f18536b.mo16757d();
        return this.f18535a.mo16993a(d.f24395d, d.f24397f, d.f24401j);
    }

    /* renamed from: c */
    public final d93<im2> mo18671c() {
        d93<V> d93;
        im2 im2 = this.f18538d;
        if (im2 != null) {
            return s83.m30607i(im2);
        }
        if (!l10.f19143a.mo20989e().booleanValue()) {
            im2 im22 = new im2((zzcdq) null, m25782e(), (hm2) null);
            this.f18538d = im22;
            d93 = s83.m30607i(im22);
        } else {
            d93 = s83.m30604f(s83.m30611m(j83.m25564E(this.f18536b.mo16754a().mo18844e(this.f18535a.zza())), new gm2(this), this.f18537c), uy1.class, new fm2(this), this.f18537c);
        }
        return s83.m30611m(d93, em2.f16006a, this.f18537c);
    }
}
