package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q01 implements yr3<C5638um> {

    /* renamed from: a */
    private final ms3<bp2> f21781a;

    /* renamed from: b */
    private final ms3<zzcjf> f21782b;

    /* renamed from: c */
    private final ms3<JSONObject> f21783c;

    /* renamed from: d */
    private final ms3<String> f21784d;

    public q01(ms3<bp2> ms3, ms3<zzcjf> ms32, ms3<JSONObject> ms33, ms3<String> ms34) {
        this.f21781a = ms3;
        this.f21782b = ms32;
        this.f21783c = ms33;
        this.f21784d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        ((x41) this.f21781a).mo21974b();
        String a = this.f21784d.mo10679a();
        boolean equals = "native".equals(a);
        C2971s.m13214q();
        return new C5638um(UUID.randomUUID().toString(), ((cu0) this.f21782b).mo16749b(), a, this.f21783c.mo10679a(), false, equals);
    }
}
