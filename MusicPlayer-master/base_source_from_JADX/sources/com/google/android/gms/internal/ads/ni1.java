package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ni1 implements yr3<Set<String>> {

    /* renamed from: a */
    private final ms3<mk1> f20628a;

    public ni1(ms3<mk1> ms3) {
        this.f20628a = ms3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        if (((ki1) this.f20628a).mo18892b().mo19405e() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        gs3.m24490b(set);
        return set;
    }
}
