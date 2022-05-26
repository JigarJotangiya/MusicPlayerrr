package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wg2<T> implements yr3<vg2<T>> {

    /* renamed from: a */
    private final ms3<Executor> f25388a;

    /* renamed from: b */
    private final ms3<Set<sg2<? extends rg2<T>>>> f25389b;

    public wg2(ms3<Executor> ms3, ms3<Set<sg2<? extends rg2<T>>>> ms32) {
        this.f25388a = ms3;
        this.f25389b = ms32;
    }

    /* renamed from: b */
    public final vg2<T> mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new vg2<>(e93, ((ks3) this.f25389b).mo10679a());
    }
}
