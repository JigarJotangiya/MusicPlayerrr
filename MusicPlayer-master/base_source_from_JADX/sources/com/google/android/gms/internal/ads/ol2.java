package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.n71;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ol2<R extends n71<AdT>, AdT extends g41> implements om2<R, lr2<R, AdT>> {

    /* renamed from: a */
    private R f21036a;

    /* renamed from: b */
    private final Executor f21037b = k93.m26167b();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ d93 mo16681a(pm2 pm2, nm2 nm2, Object obj) {
        return mo20022c(pm2, nm2, (n71) null);
    }

    /* renamed from: b */
    public final R mo20021b() {
        return this.f21036a;
    }

    /* renamed from: c */
    public final d93<lr2<R, AdT>> mo20022c(pm2 pm2, nm2<R> nm2, R r) {
        l71<R> a = nm2.mo18001a(pm2.f21429b);
        a.mo16420k(new um2(true));
        R r2 = (n71) a.mo16419e();
        this.f21036a = r2;
        k51 a2 = r2.mo16754a();
        lr2 lr2 = new lr2();
        return s83.m30611m(s83.m30612n(j83.m25564E(a2.mo18848i()), new nl2(this, lr2, a2), this.f21037b), new ml2(lr2), this.f21037b);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo16684f() {
        return this.f21036a;
    }
}
