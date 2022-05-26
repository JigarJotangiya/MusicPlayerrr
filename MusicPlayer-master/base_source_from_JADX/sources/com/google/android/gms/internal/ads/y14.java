package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y14 implements e24, d24 {

    /* renamed from: g */
    public final f24 f26205g;

    /* renamed from: h */
    private final long f26206h;

    /* renamed from: i */
    private i24 f26207i;

    /* renamed from: j */
    private e24 f26208j;

    /* renamed from: k */
    private d24 f26209k;

    /* renamed from: l */
    private long f26210l = -9223372036854775807L;

    /* renamed from: m */
    private final r54 f26211m;

    public y14(f24 f24, r54 r54, long j, byte[] bArr) {
        this.f26205g = f24;
        this.f26211m = r54;
        this.f26206h = j;
    }

    /* renamed from: v */
    private final long m33968v(long j) {
        long j2 = this.f26210l;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    /* renamed from: a */
    public final long mo17092a() {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17092a();
    }

    /* renamed from: b */
    public final long mo17093b() {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17093b();
    }

    /* renamed from: c */
    public final uj0 mo17094c() {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17094c();
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        e24 e24 = this.f26208j;
        return e24 != null && e24.mo17095d(j);
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        e24.mo17096e(j);
    }

    /* renamed from: f */
    public final long mo17097f() {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17097f();
    }

    /* renamed from: g */
    public final long mo17098g(long j) {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17098g(j);
    }

    /* renamed from: h */
    public final void mo17099h() throws IOException {
        try {
            e24 e24 = this.f26208j;
            if (e24 != null) {
                e24.mo17099h();
                return;
            }
            i24 i24 = this.f26207i;
            if (i24 != null) {
                i24.mo16025t();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    /* renamed from: i */
    public final void mo16828i(e24 e24) {
        d24 d24 = this.f26209k;
        int i = wy2.f25579a;
        d24.mo16828i(this);
    }

    /* renamed from: j */
    public final long mo17100j(h44[] h44Arr, boolean[] zArr, u34[] u34Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f26210l;
        if (j3 == -9223372036854775807L || j != this.f26206h) {
            j2 = j;
        } else {
            this.f26210l = -9223372036854775807L;
            j2 = j3;
        }
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17100j(h44Arr, zArr, u34Arr, zArr2, j2);
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo19323k(w34 w34) {
        e24 e24 = (e24) w34;
        d24 d24 = this.f26209k;
        int i = wy2.f25579a;
        d24.mo19323k(this);
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        e24 e24 = this.f26208j;
        return e24 != null && e24.mo17101l();
    }

    /* renamed from: m */
    public final long mo17102m(long j, ou3 ou3) {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        return e24.mo17102m(j, ou3);
    }

    /* renamed from: n */
    public final long mo22140n() {
        return this.f26210l;
    }

    /* renamed from: o */
    public final void mo17103o(long j, boolean z) {
        e24 e24 = this.f26208j;
        int i = wy2.f25579a;
        e24.mo17103o(j, false);
    }

    /* renamed from: p */
    public final long mo22141p() {
        return this.f26206h;
    }

    /* renamed from: q */
    public final void mo17104q(d24 d24, long j) {
        this.f26209k = d24;
        e24 e24 = this.f26208j;
        if (e24 != null) {
            e24.mo17104q(this, m33968v(this.f26206h));
        }
    }

    /* renamed from: r */
    public final void mo22142r(f24 f24) {
        long v = m33968v(this.f26206h);
        i24 i24 = this.f26207i;
        Objects.requireNonNull(i24);
        e24 i = i24.mo16023i(f24, this.f26211m, v);
        this.f26208j = i;
        if (this.f26209k != null) {
            i.mo17104q(this, v);
        }
    }

    /* renamed from: s */
    public final void mo22143s(long j) {
        this.f26210l = j;
    }

    /* renamed from: t */
    public final void mo22144t() {
        e24 e24 = this.f26208j;
        if (e24 != null) {
            i24 i24 = this.f26207i;
            Objects.requireNonNull(i24);
            i24.mo16022e(e24);
        }
    }

    /* renamed from: u */
    public final void mo22145u(i24 i24) {
        gs1.m24488f(this.f26207i == null);
        this.f26207i = i24;
    }
}
