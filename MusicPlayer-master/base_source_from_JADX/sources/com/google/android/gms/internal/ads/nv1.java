package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nv1 implements yr3<mv1> {

    /* renamed from: a */
    private final ms3<Executor> f20734a;

    /* renamed from: b */
    private final ms3<Context> f20735b;

    /* renamed from: c */
    private final ms3<WeakReference<Context>> f20736c;

    /* renamed from: d */
    private final ms3<Executor> f20737d;

    /* renamed from: e */
    private final ms3<br1> f20738e;

    /* renamed from: f */
    private final ms3<ScheduledExecutorService> f20739f;

    /* renamed from: g */
    private final ms3<qt1> f20740g;

    /* renamed from: h */
    private final ms3<zzcjf> f20741h;

    /* renamed from: i */
    private final ms3<cf1> f20742i;

    public nv1(ms3<Executor> ms3, ms3<Context> ms32, ms3<WeakReference<Context>> ms33, ms3<Executor> ms34, ms3<br1> ms35, ms3<ScheduledExecutorService> ms36, ms3<qt1> ms37, ms3<zzcjf> ms38, ms3<cf1> ms39) {
        this.f20734a = ms3;
        this.f20735b = ms32;
        this.f20736c = ms33;
        this.f20737d = ms34;
        this.f20738e = ms35;
        this.f20739f = ms36;
        this.f20740g = ms37;
        this.f20741h = ms38;
        this.f20742i = ms39;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        Context b = ((rt0) this.f20735b).mo20741b();
        WeakReference<Context> b2 = ((st0) this.f20736c).mo20961b();
        e93 e93 = hm0.f17708a;
        gs3.m24490b(e93);
        return new mv1(this.f20734a.mo10679a(), b, b2, e93, this.f20738e.mo10679a(), this.f20739f.mo10679a(), this.f20740g.mo10679a(), ((cu0) this.f20741h).mo16749b(), ((df1) this.f20742i).mo10679a());
    }
}
