package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xz1 implements yr3<wz1> {

    /* renamed from: a */
    private final ms3<Context> f26133a;

    /* renamed from: b */
    private final ms3<Executor> f26134b;

    /* renamed from: c */
    private final ms3<bh0> f26135c;

    /* renamed from: d */
    private final ms3<ty0> f26136d;

    /* renamed from: e */
    private final ms3<ah0> f26137e;

    /* renamed from: f */
    private final ms3<ArrayDeque<tz1>> f26138f;

    /* renamed from: g */
    private final ms3<b02> f26139g;

    public xz1(ms3<Context> ms3, ms3<Executor> ms32, ms3<bh0> ms33, ms3<ty0> ms34, ms3<ah0> ms35, ms3<ArrayDeque<tz1>> ms36, ms3<b02> ms37) {
        this.f26133a = ms3;
        this.f26134b = ms32;
        this.f26135c = ms33;
        this.f26136d = ms34;
        this.f26137e = ms35;
        this.f26138f = ms36;
        this.f26139g = ms37;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10679a() {
        return new wz1(((rt0) this.f26133a).mo20741b(), this.f26134b.mo10679a(), new bh0(), ((yt0) this.f26136d).mo10679a(), ((ku0) this.f26137e).mo10679a(), this.f26138f.mo10679a(), new b02(), (b02) null);
    }
}
