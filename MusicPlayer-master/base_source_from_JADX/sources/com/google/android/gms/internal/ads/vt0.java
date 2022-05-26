package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vt0 implements yr3<Set<qf1<ef1>>> {

    /* renamed from: a */
    private final ms3<i02> f24920a;

    /* renamed from: b */
    private final ms3<Executor> f24921b;

    public vt0(ms3<i02> ms3, ms3<Executor> ms32) {
        this.f24920a = ms3;
        this.f24921b = ms32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        i02 a = this.f24920a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22594p1)).booleanValue()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
                set = Collections.singleton(new qf1(a, e93));
                gs3.m24490b(set);
                return set;
            }
        }
        set = Collections.emptySet();
        gs3.m24490b(set);
        return set;
    }
}
