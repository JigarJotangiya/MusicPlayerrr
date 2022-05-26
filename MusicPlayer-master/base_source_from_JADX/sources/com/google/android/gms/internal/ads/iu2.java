package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iu2 implements yr3<gu2> {

    /* renamed from: a */
    private final ms3<nu2> f18159a;

    /* renamed from: b */
    private final ms3<vu2> f18160b;

    /* renamed from: c */
    private final ms3<ScheduledExecutorService> f18161c;

    public iu2(ms3<nu2> ms3, ms3<vu2> ms32, ms3<ScheduledExecutorService> ms33) {
        this.f18159a = ms3;
        this.f18160b = ms32;
        this.f18161c = ms33;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Object obj;
        sr3<nu2> b = xr3.m33786b(this.f18159a);
        sr3<vu2> b2 = xr3.m33786b(this.f18160b);
        ScheduledExecutorService a = this.f18161c.mo10679a();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22359J5)).booleanValue()) {
            obj = new ku2(b.mo10679a(), a);
        } else {
            obj = b2.mo10679a();
        }
        gs3.m24490b(obj);
        return obj;
    }
}
