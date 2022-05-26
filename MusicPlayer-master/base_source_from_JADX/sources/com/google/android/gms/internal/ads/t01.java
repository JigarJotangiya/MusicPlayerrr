package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class t01 implements yr3<Set<qf1<C5824zm>>> {

    /* renamed from: a */
    private final ms3<m01> f23672a;

    /* renamed from: b */
    private final ms3<Executor> f23673b;

    /* renamed from: c */
    private final ms3<JSONObject> f23674c;

    public t01(ms3<m01> ms3, ms3<Executor> ms32, ms3<JSONObject> ms33) {
        this.f23672a = ms3;
        this.f23673b = ms32;
        this.f23674c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Set set;
        m01 a = this.f23672a.mo10679a();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        if (this.f23674c.mo10679a() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new qf1(a, e93));
        }
        gs3.m24490b(set);
        return set;
    }
}
