package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ms1 implements yr3<Set<qf1<xt2>>> {

    /* renamed from: a */
    private final ms3<String> f20152a;

    /* renamed from: b */
    private final ms3<Context> f20153b;

    /* renamed from: c */
    private final ms3<Executor> f20154c;

    /* renamed from: d */
    private final ms3<Map<pt2, os1>> f20155d;

    public ms1(ms3<String> ms3, ms3<Context> ms32, ms3<Executor> ms33, ms3<Map<pt2, os1>> ms34) {
        this.f20152a = ms3;
        this.f20153b = ms32;
        this.f20154c = ms33;
        this.f20155d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        String b = ((xi2) this.f20152a).mo22039b();
        Context b2 = ((rt0) this.f20153b).mo20741b();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        Map d = ((cs3) this.f20155d).mo10679a();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22476a3)).booleanValue()) {
            C5790yp ypVar = new C5790yp(new C5012dq(b2));
            ypVar.mo22272b(new ns1(b));
            set = Collections.singleton(new qf1(new ps1(ypVar, d), e93));
        } else {
            set = Collections.emptySet();
        }
        gs3.m24490b(set);
        return set;
    }
}
