package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s01 implements yr3<Set<qf1<a91>>> {

    /* renamed from: a */
    private final ms3<m01> f23284a;

    /* renamed from: b */
    private final ms3<Executor> f23285b;

    /* renamed from: c */
    private final ms3<JSONObject> f23286c;

    public s01(ms3<m01> ms3, ms3<Executor> ms32, ms3<JSONObject> ms33) {
        this.f23284a = ms3;
        this.f23285b = ms32;
        this.f23286c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        m01 a = this.f23284a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        if (this.f23286c.mo10679a() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new qf1(a, e93));
        }
        gs3.m24490b(set);
        return set;
    }
}
