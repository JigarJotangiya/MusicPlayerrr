package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y34 extends bg0 {

    /* renamed from: g */
    private static final Object f26250g = new Object();

    /* renamed from: b */
    private final long f26251b;

    /* renamed from: c */
    private final long f26252c;

    /* renamed from: d */
    private final boolean f26253d;

    /* renamed from: e */
    private final C5825zn f26254e;

    /* renamed from: f */
    private final C5040eh f26255f;

    static {
        C5767y3 y3Var = new C5767y3();
        y3Var.mo22158a("SinglePeriodTimeline");
        y3Var.mo22159b(Uri.EMPTY);
        y3Var.mo22160c();
    }

    public y34(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C5825zn znVar, C5040eh ehVar) {
        this.f26251b = j4;
        this.f26252c = j5;
        this.f26253d = z;
        this.f26254e = znVar;
        this.f26255f = ehVar;
    }

    /* renamed from: a */
    public final int mo15662a(Object obj) {
        return f26250g.equals(obj) ? 0 : -1;
    }

    /* renamed from: b */
    public final int mo15663b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo15664c() {
        return 1;
    }

    /* renamed from: d */
    public final od0 mo15665d(int i, od0 od0, boolean z) {
        gs1.m24483a(i, 0, 1);
        od0.mo19975j((Object) null, z ? f26250g : null, 0, this.f26251b, 0, j31.f18339c, false);
        return od0;
    }

    /* renamed from: e */
    public final ff0 mo15666e(int i, ff0 ff0, long j) {
        gs1.m24483a(i, 0, 1);
        ff0.mo17524a(ff0.f16561o, this.f26254e, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f26253d, false, this.f26255f, 0, this.f26252c, 0, 0, 0);
        return ff0;
    }

    /* renamed from: f */
    public final Object mo15667f(int i) {
        gs1.m24483a(i, 0, 1);
        return f26250g;
    }
}
