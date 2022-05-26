package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C3359d;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lj1 implements yr3<w01> {

    /* renamed from: a */
    private final ms3<C5638um> f19444a;

    /* renamed from: b */
    private final ms3<Executor> f19445b;

    /* renamed from: c */
    private final ms3<Context> f19446c;

    /* renamed from: d */
    private final ms3<C3359d> f19447d;

    public lj1(ms3<C5638um> ms3, ms3<Executor> ms32, ms3<Context> ms33, ms3<C3359d> ms34) {
        this.f19444a = ms3;
        this.f19445b = ms32;
        this.f19446c = ms33;
        this.f19447d = ms34;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        return new w01(this.f19445b.mo10679a(), new i01(this.f19446c.mo10679a(), this.f19444a.mo10679a()), this.f19447d.mo10679a());
    }
}
