package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wr1 implements yr3<Set<qf1<xt2>>> {

    /* renamed from: a */
    private final ms3<Executor> f25518a;

    /* renamed from: b */
    private final ms3<ps1> f25519b;

    public wr1(ms3<Executor> ms3, ms3<ps1> ms32) {
        this.f25518a = ms3;
        this.f25519b = ms32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        ps1 b = ((qs1) this.f25519b).mo10679a();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22476a3)).booleanValue()) {
            set = Collections.singleton(new qf1(b, e93));
        } else {
            set = Collections.emptySet();
        }
        gs3.m24490b(set);
        return set;
    }
}
