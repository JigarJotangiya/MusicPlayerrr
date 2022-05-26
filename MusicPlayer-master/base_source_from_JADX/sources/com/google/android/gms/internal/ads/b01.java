package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b01 implements yr3<a01> {

    /* renamed from: a */
    private final ms3<Context> f14228a;

    /* renamed from: b */
    private final ms3<Executor> f14229b;

    /* renamed from: c */
    private final ms3<Executor> f14230c;

    /* renamed from: d */
    private final ms3<ScheduledExecutorService> f14231d;

    /* renamed from: e */
    private final ms3<np2> f14232e;

    /* renamed from: f */
    private final ms3<bp2> f14233f;

    /* renamed from: g */
    private final ms3<iv2> f14234g;

    /* renamed from: h */
    private final ms3<dq2> f14235h;

    /* renamed from: i */
    private final ms3<View> f14236i;

    /* renamed from: j */
    private final ms3<C5737xa> f14237j;

    /* renamed from: k */
    private final ms3<q00> f14238k;

    /* renamed from: l */
    private final ms3<s00> f14239l;

    public b01(ms3<Context> ms3, ms3<Executor> ms32, ms3<Executor> ms33, ms3<ScheduledExecutorService> ms34, ms3<np2> ms35, ms3<bp2> ms36, ms3<iv2> ms37, ms3<dq2> ms38, ms3<View> ms39, ms3<C5737xa> ms310, ms3<q00> ms311, ms3<s00> ms312) {
        this.f14228a = ms3;
        this.f14229b = ms32;
        this.f14230c = ms33;
        this.f14231d = ms34;
        this.f14232e = ms35;
        this.f14233f = ms36;
        this.f14234g = ms37;
        this.f14235h = ms38;
        this.f14236i = ms39;
        this.f14237j = ms310;
        this.f14238k = ms311;
        this.f14239l = ms312;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10679a() {
        Context b = ((xq2) this.f14228a).mo22067b();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new a01(b, e93, this.f14230c.mo10679a(), this.f14231d.mo10679a(), ((a51) this.f14232e).mo15686b(), ((x41) this.f14233f).mo21974b(), this.f14234g.mo10679a(), this.f14235h.mo10679a(), this.f14236i.mo10679a(), this.f14237j.mo10679a(), this.f14238k.mo10679a(), new s00(), (byte[]) null);
    }
}
