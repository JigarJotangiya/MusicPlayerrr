package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.C0885l;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ua4 implements y84 {

    /* renamed from: q */
    public static final f94 f24267q = ta4.f23814b;

    /* renamed from: a */
    private final no2 f24268a = new no2(4);

    /* renamed from: b */
    private final no2 f24269b = new no2(9);

    /* renamed from: c */
    private final no2 f24270c = new no2(11);

    /* renamed from: d */
    private final no2 f24271d = new no2();

    /* renamed from: e */
    private final va4 f24272e = new va4();

    /* renamed from: f */
    private b94 f24273f;

    /* renamed from: g */
    private int f24274g = 1;

    /* renamed from: h */
    private boolean f24275h;

    /* renamed from: i */
    private long f24276i;

    /* renamed from: j */
    private int f24277j;

    /* renamed from: k */
    private int f24278k;

    /* renamed from: l */
    private int f24279l;

    /* renamed from: m */
    private long f24280m;

    /* renamed from: n */
    private boolean f24281n;

    /* renamed from: o */
    private sa4 f24282o;

    /* renamed from: p */
    private ya4 f24283p;

    /* renamed from: a */
    private final no2 m31736a(z84 z84) throws IOException {
        if (this.f24279l > this.f24271d.mo19783j()) {
            no2 no2 = this.f24271d;
            int j = no2.mo19783j();
            no2.mo19777d(new byte[Math.max(j + j, this.f24279l)], 0);
        } else {
            this.f24271d.mo19779f(0);
        }
        this.f24271d.mo19778e(this.f24279l);
        ((t84) z84).mo19927e(this.f24271d.mo19781h(), 0, this.f24279l, false);
        return this.f24271d;
    }

    /* renamed from: c */
    private final void m31737c() {
        if (!this.f24281n) {
            this.f24273f.mo15723r(new y94(-9223372036854775807L, 0));
            this.f24281n = true;
        }
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        t84 t84 = (t84) z84;
        t84.mo19929i(this.f24268a.mo19781h(), 0, 3, false);
        this.f24268a.mo19779f(0);
        if (this.f24268a.mo19794u() != 4607062) {
            return false;
        }
        t84.mo19929i(this.f24268a.mo19781h(), 0, 2, false);
        this.f24268a.mo19779f(0);
        if ((this.f24268a.mo19796w() & C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        t84.mo19929i(this.f24268a.mo19781h(), 0, 4, false);
        this.f24268a.mo19779f(0);
        int m = this.f24268a.mo19786m();
        z84.mo19928h();
        t84.mo21041n(m, false);
        t84.mo19929i(this.f24268a.mo19781h(), 0, 4, false);
        this.f24268a.mo19779f(0);
        if (this.f24268a.mo19786m() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0009 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r17, com.google.android.gms.internal.ads.w94 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.b94 r2 = r0.f24273f
            com.google.android.gms.internal.ads.gs1.m24484b(r2)
        L_0x0009:
            int r2 = r0.f24274g
            r3 = -1
            r4 = 8
            r5 = 9
            r6 = 2
            r7 = 4
            r8 = 0
            r9 = 1
            if (r2 == r9) goto L_0x0123
            r10 = 3
            if (r2 == r6) goto L_0x0115
            if (r2 == r10) goto L_0x00cd
            if (r2 != r7) goto L_0x00c7
            boolean r2 = r0.f24275h
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x002c
            long r2 = r0.f24276i
            long r14 = r0.f24280m
            long r2 = r2 + r14
            goto L_0x003b
        L_0x002c:
            com.google.android.gms.internal.ads.va4 r2 = r0.f24272e
            long r2 = r2.mo21458d()
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0039
            r2 = 0
            goto L_0x003b
        L_0x0039:
            long r2 = r0.f24280m
        L_0x003b:
            int r14 = r0.f24278k
            if (r14 != r4) goto L_0x0052
            com.google.android.gms.internal.ads.sa4 r14 = r0.f24282o
            if (r14 == 0) goto L_0x0053
            r16.m31737c()
            com.google.android.gms.internal.ads.sa4 r4 = r0.f24282o
            com.google.android.gms.internal.ads.no2 r5 = r16.m31736a(r17)
            boolean r2 = r4.mo22003c(r5, r2)
        L_0x0050:
            r3 = 1
            goto L_0x00a6
        L_0x0052:
            r4 = r14
        L_0x0053:
            if (r4 != r5) goto L_0x0067
            com.google.android.gms.internal.ads.ya4 r4 = r0.f24283p
            if (r4 == 0) goto L_0x009c
            r16.m31737c()
            com.google.android.gms.internal.ads.ya4 r4 = r0.f24283p
            com.google.android.gms.internal.ads.no2 r5 = r16.m31736a(r17)
            boolean r2 = r4.mo22003c(r5, r2)
            goto L_0x0050
        L_0x0067:
            r5 = 18
            if (r4 != r5) goto L_0x009c
            boolean r4 = r0.f24281n
            if (r4 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.va4 r4 = r0.f24272e
            com.google.android.gms.internal.ads.no2 r5 = r16.m31736a(r17)
            boolean r2 = r4.mo22003c(r5, r2)
            com.google.android.gms.internal.ads.va4 r3 = r0.f24272e
            long r3 = r3.mo21458d()
            int r5 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0050
            com.google.android.gms.internal.ads.b94 r5 = r0.f24273f
            com.google.android.gms.internal.ads.s94 r14 = new com.google.android.gms.internal.ads.s94
            com.google.android.gms.internal.ads.va4 r15 = r0.f24272e
            long[] r15 = r15.mo21459e()
            com.google.android.gms.internal.ads.va4 r10 = r0.f24272e
            long[] r10 = r10.mo21460f()
            r14.<init>(r15, r10, r3)
            r5.mo15723r(r14)
            r0.f24281n = r9
            goto L_0x0050
        L_0x009c:
            int r2 = r0.f24279l
            r3 = r1
            com.google.android.gms.internal.ads.t84 r3 = (com.google.android.gms.internal.ads.t84) r3
            r3.mo21042o(r2, r8)
            r2 = 0
            r3 = 0
        L_0x00a6:
            boolean r4 = r0.f24275h
            if (r4 != 0) goto L_0x00c0
            if (r2 == 0) goto L_0x00c0
            r0.f24275h = r9
            com.google.android.gms.internal.ads.va4 r2 = r0.f24272e
            long r4 = r2.mo21458d()
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x00bc
            long r4 = r0.f24280m
            long r10 = -r4
            goto L_0x00be
        L_0x00bc:
            r10 = 0
        L_0x00be:
            r0.f24276i = r10
        L_0x00c0:
            r0.f24277j = r7
            r0.f24274g = r6
            if (r3 == 0) goto L_0x0009
            return r8
        L_0x00c7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00cd:
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            byte[] r2 = r2.mo19781h()
            r4 = 11
            boolean r2 = r1.mo19927e(r2, r8, r4, r9)
            if (r2 != 0) goto L_0x00dc
            return r3
        L_0x00dc:
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            r2.mo19779f(r8)
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            int r2 = r2.mo19792s()
            r0.f24278k = r2
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            int r2 = r2.mo19794u()
            r0.f24279l = r2
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            int r2 = r2.mo19794u()
            long r2 = (long) r2
            r0.f24280m = r2
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            int r2 = r2.mo19792s()
            int r2 = r2 << 24
            long r2 = (long) r2
            long r4 = r0.f24280m
            long r2 = r2 | r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.f24280m = r2
            com.google.android.gms.internal.ads.no2 r2 = r0.f24270c
            r2.mo19780g(r10)
            r0.f24274g = r7
            goto L_0x0009
        L_0x0115:
            int r2 = r0.f24277j
            r3 = r1
            com.google.android.gms.internal.ads.t84 r3 = (com.google.android.gms.internal.ads.t84) r3
            r3.mo21042o(r2, r8)
            r0.f24277j = r8
            r0.f24274g = r10
            goto L_0x0009
        L_0x0123:
            com.google.android.gms.internal.ads.no2 r2 = r0.f24269b
            byte[] r2 = r2.mo19781h()
            boolean r2 = r1.mo19927e(r2, r8, r5, r9)
            if (r2 != 0) goto L_0x0130
            return r3
        L_0x0130:
            com.google.android.gms.internal.ads.no2 r2 = r0.f24269b
            r2.mo19779f(r8)
            com.google.android.gms.internal.ads.no2 r2 = r0.f24269b
            r2.mo19780g(r7)
            com.google.android.gms.internal.ads.no2 r2 = r0.f24269b
            int r2 = r2.mo19792s()
            r3 = r2 & 1
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0156
            com.google.android.gms.internal.ads.sa4 r2 = r0.f24282o
            if (r2 != 0) goto L_0x0156
            com.google.android.gms.internal.ads.sa4 r2 = new com.google.android.gms.internal.ads.sa4
            com.google.android.gms.internal.ads.b94 r7 = r0.f24273f
            com.google.android.gms.internal.ads.da4 r4 = r7.mo15724s(r4, r9)
            r2.<init>(r4)
            r0.f24282o = r2
        L_0x0156:
            if (r3 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.ya4 r2 = r0.f24283p
            if (r2 != 0) goto L_0x0169
            com.google.android.gms.internal.ads.ya4 r2 = new com.google.android.gms.internal.ads.ya4
            com.google.android.gms.internal.ads.b94 r3 = r0.f24273f
            com.google.android.gms.internal.ads.da4 r3 = r3.mo15724s(r5, r6)
            r2.<init>(r3)
            r0.f24283p = r2
        L_0x0169:
            com.google.android.gms.internal.ads.b94 r2 = r0.f24273f
            r2.mo15722I()
            com.google.android.gms.internal.ads.no2 r2 = r0.f24269b
            int r2 = r2.mo19786m()
            int r2 = r2 + -5
            r0.f24277j = r2
            r0.f24274g = r6
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ua4.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f24273f = b94;
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        if (j == 0) {
            this.f24274g = 1;
            this.f24275h = false;
        } else {
            this.f24274g = 3;
        }
        this.f24277j = 0;
    }
}
