package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C3049x;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n32 implements yr3<m32> {

    /* renamed from: a */
    private final ms3<c31> f20491a;

    /* renamed from: b */
    private final ms3<Context> f20492b;

    /* renamed from: c */
    private final ms3<Executor> f20493c;

    /* renamed from: d */
    private final ms3<oq1> f20494d;

    /* renamed from: e */
    private final ms3<up2> f20495e;

    /* renamed from: f */
    private final ms3<i13<bp2, C3049x>> f20496f;

    public n32(ms3<c31> ms3, ms3<Context> ms32, ms3<Executor> ms33, ms3<oq1> ms34, ms3<up2> ms35, ms3<i13<bp2, C3049x>> ms36) {
        this.f20491a = ms3;
        this.f20492b = ms32;
        this.f20493c = ms33;
        this.f20494d = ms34;
        this.f20495e = ms35;
        this.f20496f = ms36;
    }

    /* renamed from: b */
    public final m32 mo10679a() {
        return new m32(this.f20491a.mo10679a(), this.f20492b.mo10679a(), this.f20493c.mo10679a(), this.f20494d.mo10679a(), ((v71) this.f20495e).mo21435b(), this.f20496f.mo10679a());
    }
}
