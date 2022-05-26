package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.n71;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zl2<R extends n71<AdT>, AdT extends g41> implements om2<R, yl2<R, AdT>> {

    /* renamed from: a */
    private final dr2 f26824a;

    /* renamed from: b */
    private final Executor f26825b;

    /* renamed from: c */
    private final o83<Void> f26826c = new xl2(this);

    public zl2(dr2 dr2, Executor executor) {
        this.f26824a = dr2;
        this.f26825b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ d93 mo16681a(pm2 pm2, nm2 nm2, Object obj) {
        return mo22385c(pm2, nm2, (n71) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ d93 mo22384b(n71 n71, im2 im2) throws Exception {
        mr2 mr2 = im2.f18094b;
        zzcdq zzcdq = im2.f18093a;
        lr2<?, ?> d = mr2 != null ? this.f26824a.mo16996d(mr2) : null;
        if (mr2 == null) {
            return s83.m30607i(null);
        }
        if (!(d == null || zzcdq == null)) {
            s83.m30616r(n71.mo16754a().mo18846g(zzcdq), this.f26826c, this.f26825b);
        }
        return s83.m30607i(new yl2(mr2, zzcdq, d));
    }

    /* renamed from: c */
    public final d93<yl2<R, AdT>> mo22385c(pm2 pm2, nm2<R> nm2, R r) {
        return s83.m30604f(s83.m30612n(j83.m25564E(new jm2(this.f26824a, r, this.f26825b).mo18671c()), new vl2(this, r), this.f26825b), Exception.class, new wl2(this), this.f26825b);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo16684f() {
        return null;
    }
}
