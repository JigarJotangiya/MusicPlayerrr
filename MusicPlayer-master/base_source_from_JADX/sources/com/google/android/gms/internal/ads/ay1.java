package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ay1 implements yr3<zx1> {

    /* renamed from: a */
    private final ms3<mt0> f14210a;

    /* renamed from: b */
    private final ms3<Context> f14211b;

    /* renamed from: c */
    private final ms3<zzcjf> f14212c;

    /* renamed from: d */
    private final ms3<up2> f14213d;

    /* renamed from: e */
    private final ms3<Executor> f14214e;

    /* renamed from: f */
    private final ms3<String> f14215f;

    /* renamed from: g */
    private final ms3<ab1> f14216g;

    /* renamed from: h */
    private final ms3<eb1> f14217h;

    public ay1(ms3<mt0> ms3, ms3<Context> ms32, ms3<zzcjf> ms33, ms3<up2> ms34, ms3<Executor> ms35, ms3<String> ms36, ms3<ab1> ms37, ms3<eb1> ms38) {
        this.f14210a = ms3;
        this.f14211b = ms32;
        this.f14212c = ms33;
        this.f14213d = ms34;
        this.f14214e = ms35;
        this.f14215f = ms36;
        this.f14216g = ms37;
        this.f14217h = ms38;
    }

    /* renamed from: b */
    public final zx1 mo10679a() {
        Context b = ((xq2) this.f14211b).mo22067b();
        zzcjf b2 = ((cu0) this.f14212c).mo16749b();
        up2 b3 = ((v71) this.f14213d).mo21435b();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new zx1(this.f14210a.mo10679a(), b, b2, b3, e93, this.f14215f.mo10679a(), ((bb1) this.f14216g).mo10679a(), ((fb1) this.f14217h).mo10679a());
    }
}
