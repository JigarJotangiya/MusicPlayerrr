package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fj2 implements yr3<dj2> {

    /* renamed from: a */
    private final ms3<fl0> f16647a;

    /* renamed from: b */
    private final ms3<Boolean> f16648b;

    /* renamed from: c */
    private final ms3<vk0> f16649c;

    /* renamed from: d */
    private final ms3<e93> f16650d;

    /* renamed from: e */
    private final ms3<String> f16651e;

    /* renamed from: f */
    private final ms3<ScheduledExecutorService> f16652f;

    public fj2(ms3<fl0> ms3, ms3<Boolean> ms32, ms3<vk0> ms33, ms3<e93> ms34, ms3<String> ms35, ms3<ScheduledExecutorService> ms36) {
        this.f16647a = ms3;
        this.f16648b = ms32;
        this.f16649c = ms33;
        this.f16650d = ms34;
        this.f16651e = ms35;
        this.f16652f = ms36;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        boolean booleanValue = ((wi2) this.f16648b).mo10679a().booleanValue();
        vk0 vk0 = new vk0();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new dj2(this.f16647a.mo10679a(), booleanValue, vk0, e93, ((ui2) this.f16651e).mo21273b(), this.f16652f.mo10679a(), (byte[]) null);
    }
}
