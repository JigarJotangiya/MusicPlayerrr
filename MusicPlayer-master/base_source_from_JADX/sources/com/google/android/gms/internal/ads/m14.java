package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m14 implements e24, d24 {

    /* renamed from: g */
    public final e24 f19701g;

    /* renamed from: h */
    private d24 f19702h;

    /* renamed from: i */
    private l14[] f19703i = new l14[0];

    /* renamed from: j */
    private long f19704j = 0;

    /* renamed from: k */
    long f19705k;

    public m14(e24 e24, boolean z, long j, long j2) {
        this.f19701g = e24;
        this.f19705k = j2;
    }

    /* renamed from: a */
    public final long mo17092a() {
        long a = this.f19701g.mo17092a();
        if (a != Long.MIN_VALUE) {
            long j = this.f19705k;
            if (j == Long.MIN_VALUE || a < j) {
                return a;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final long mo17093b() {
        long b = this.f19701g.mo17093b();
        if (b != Long.MIN_VALUE) {
            long j = this.f19705k;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final uj0 mo17094c() {
        return this.f19701g.mo17094c();
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        return this.f19701g.mo17095d(j);
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
        this.f19701g.mo17096e(j);
    }

    /* renamed from: f */
    public final long mo17097f() {
        if (mo19325p()) {
            long j = this.f19704j;
            this.f19704j = -9223372036854775807L;
            long f = mo17097f();
            return f != -9223372036854775807L ? f : j;
        }
        long f2 = this.f19701g.mo17097f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = false;
        gs1.m24488f(f2 >= 0);
        long j2 = this.f19705k;
        if (j2 == Long.MIN_VALUE || f2 <= j2) {
            z = true;
        }
        gs1.m24488f(z);
        return f2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r0 > r8) goto L_0x0036;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo17098g(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f19704j = r0
            com.google.android.gms.internal.ads.l14[] r0 = r7.f19703i
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.mo19047c()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            com.google.android.gms.internal.ads.e24 r0 = r7.f19701g
            long r0 = r0.mo17098g(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0035
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0036
            long r8 = r7.f19705k
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0035
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            com.google.android.gms.internal.ads.gs1.m24488f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m14.mo17098g(long):long");
    }

    /* renamed from: h */
    public final void mo17099h() throws IOException {
        this.f19701g.mo17099h();
    }

    /* renamed from: i */
    public final void mo16828i(e24 e24) {
        d24 d24 = this.f19702h;
        Objects.requireNonNull(d24);
        d24.mo16828i(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r4 > r7) goto L_0x004d;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo17100j(com.google.android.gms.internal.ads.h44[] r14, boolean[] r15, com.google.android.gms.internal.ads.u34[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r16
            int r2 = r1.length
            com.google.android.gms.internal.ads.l14[] r3 = new com.google.android.gms.internal.ads.l14[r2]
            r0.f19703i = r3
            com.google.android.gms.internal.ads.u34[] r2 = new com.google.android.gms.internal.ads.u34[r2]
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L_0x0021
            com.google.android.gms.internal.ads.l14[] r5 = r0.f19703i
            r6 = r1[r4]
            com.google.android.gms.internal.ads.l14 r6 = (com.google.android.gms.internal.ads.l14) r6
            r5[r4] = r6
            if (r6 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.u34 r11 = r6.f19149a
        L_0x001c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto L_0x000c
        L_0x0021:
            com.google.android.gms.internal.ads.e24 r4 = r0.f19701g
            r5 = r14
            r6 = r15
            r7 = r2
            r8 = r17
            r9 = r18
            long r4 = r4.mo17100j(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f19704j = r6
            r6 = 1
            int r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r7 == 0) goto L_0x004e
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x004d
            long r7 = r0.f19705k
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x004e
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            com.google.android.gms.internal.ads.gs1.m24488f(r6)
        L_0x0051:
            int r6 = r1.length
            if (r3 >= r6) goto L_0x0077
            r6 = r2[r3]
            if (r6 != 0) goto L_0x005d
            com.google.android.gms.internal.ads.l14[] r6 = r0.f19703i
            r6[r3] = r11
            goto L_0x006e
        L_0x005d:
            com.google.android.gms.internal.ads.l14[] r7 = r0.f19703i
            r8 = r7[r3]
            if (r8 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.u34 r8 = r8.f19149a
            if (r8 == r6) goto L_0x006e
        L_0x0067:
            com.google.android.gms.internal.ads.l14 r8 = new com.google.android.gms.internal.ads.l14
            r8.<init>(r13, r6)
            r7[r3] = r8
        L_0x006e:
            com.google.android.gms.internal.ads.l14[] r6 = r0.f19703i
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m14.mo17100j(com.google.android.gms.internal.ads.h44[], boolean[], com.google.android.gms.internal.ads.u34[], boolean[], long):long");
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo19323k(w34 w34) {
        e24 e24 = (e24) w34;
        d24 d24 = this.f19702h;
        Objects.requireNonNull(d24);
        d24.mo19323k(this);
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        return this.f19701g.mo17101l();
    }

    /* renamed from: m */
    public final long mo17102m(long j, ou3 ou3) {
        if (j == 0) {
            return 0;
        }
        long U = wy2.m33426U(ou3.f21195a, 0, j);
        long j2 = ou3.f21196b;
        long j3 = this.f19705k;
        long U2 = wy2.m33426U(j2, 0, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (!(U == ou3.f21195a && U2 == ou3.f21196b)) {
            ou3 = new ou3(U, U2);
        }
        return this.f19701g.mo17102m(j, ou3);
    }

    /* renamed from: n */
    public final void mo19324n(long j, long j2) {
        this.f19705k = j2;
    }

    /* renamed from: o */
    public final void mo17103o(long j, boolean z) {
        this.f19701g.mo17103o(j, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final boolean mo19325p() {
        return this.f19704j != -9223372036854775807L;
    }

    /* renamed from: q */
    public final void mo17104q(d24 d24, long j) {
        this.f19702h = d24;
        this.f19701g.mo17104q(this, j);
    }
}
