package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ae2 implements yr3<yd2> {

    /* renamed from: a */
    private final ms3<e93> f13858a;

    /* renamed from: b */
    private final ms3<ViewGroup> f13859b;

    /* renamed from: c */
    private final ms3<Context> f13860c;

    /* renamed from: d */
    private final ms3<Set<String>> f13861d;

    public ae2(ms3<e93> ms3, ms3<ViewGroup> ms32, ms3<Context> ms33, ms3<Set<String>> ms34) {
        this.f13858a = ms3;
        this.f13859b = ms32;
        this.f13860c = ms33;
        this.f13861d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new yd2(e93, ((c21) this.f13859b).mo16459b(), this.f13860c.mo10679a(), ((ks3) this.f13861d).mo10679a());
    }
}
