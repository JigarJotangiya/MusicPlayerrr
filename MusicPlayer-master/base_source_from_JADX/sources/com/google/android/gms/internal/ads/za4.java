package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class za4 implements y84 {

    /* renamed from: a */
    private final no2 f26720a = new no2(6);

    /* renamed from: b */
    private b94 f26721b;

    /* renamed from: c */
    private int f26722c;

    /* renamed from: d */
    private int f26723d;

    /* renamed from: e */
    private int f26724e;

    /* renamed from: f */
    private long f26725f = -1;

    /* renamed from: g */
    private zzaak f26726g;

    /* renamed from: h */
    private z84 f26727h;

    /* renamed from: i */
    private cb4 f26728i;

    /* renamed from: j */
    private C4987d1 f26729j;

    /* renamed from: a */
    private final int m34491a(z84 z84) throws IOException {
        this.f26720a.mo19776c(2);
        ((t84) z84).mo19929i(this.f26720a.mo19781h(), 0, 2, false);
        return this.f26720a.mo19796w();
    }

    /* renamed from: c */
    private final void m34492c() {
        m34493e(new zzdc[0]);
        b94 b94 = this.f26721b;
        Objects.requireNonNull(b94);
        b94.mo15722I();
        this.f26721b.mo15723r(new y94(-9223372036854775807L, 0));
        this.f26722c = 6;
    }

    /* renamed from: e */
    private final void m34493e(zzdc... zzdcArr) {
        b94 b94 = this.f26721b;
        Objects.requireNonNull(b94);
        da4 s = b94.mo15724s(1024, 4);
        jb4 jb4 = new jb4();
        jb4.mo18588h0("image/jpeg");
        jb4.mo18593m(new zzdd(zzdcArr));
        s.mo16885a(jb4.mo18605y());
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        if (m34491a(z84) != 65496) {
            return false;
        }
        int a = m34491a(z84);
        this.f26723d = a;
        if (a == 65504) {
            this.f26720a.mo19776c(2);
            t84 t84 = (t84) z84;
            t84.mo19929i(this.f26720a.mo19781h(), 0, 2, false);
            t84.mo21041n(this.f26720a.mo19796w() - 2, false);
            a = m34491a(z84);
            this.f26723d = a;
        }
        if (a == 65505) {
            t84 t842 = (t84) z84;
            t842.mo21041n(2, false);
            this.f26720a.mo19776c(6);
            t842.mo19929i(this.f26720a.mo19781h(), 0, 6, false);
            if (this.f26720a.mo19766A() == 1165519206 && this.f26720a.mo19796w() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r24, com.google.android.gms.internal.ads.w94 r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f26722c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x016f
            r10 = -1
            if (r3 == r5) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.cb4 r3 = r0.f26728i
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.z84 r3 = r0.f26727h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f26727h = r1
            com.google.android.gms.internal.ads.cb4 r3 = new com.google.android.gms.internal.ads.cb4
            long r4 = r0.f26725f
            r3.<init>(r1, r4)
            r0.f26728i = r3
        L_0x0037:
            com.google.android.gms.internal.ads.d1 r1 = r0.f26729j
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.cb4 r3 = r0.f26728i
            int r1 = r1.mo16802d(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f25288a
            long r5 = r0.f26725f
            long r3 = r3 + r5
            r2.f25288a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.zze()
            long r7 = r0.f26725f
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.no2 r2 = r0.f26720a
            byte[] r2 = r2.mo19781h()
            boolean r2 = r1.mo19929i(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.m34492c()
            goto L_0x00a8
        L_0x0066:
            r24.mo19928h()
            com.google.android.gms.internal.ads.d1 r2 = r0.f26729j
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.d1 r2 = new com.google.android.gms.internal.ads.d1
            r2.<init>(r9)
            r0.f26729j = r2
        L_0x0074:
            com.google.android.gms.internal.ads.cb4 r2 = new com.google.android.gms.internal.ads.cb4
            long r3 = r0.f26725f
            r2.<init>(r1, r3)
            r0.f26728i = r2
            com.google.android.gms.internal.ads.d1 r1 = r0.f26729j
            boolean r1 = r1.mo16801b(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.d1 r1 = r0.f26729j
            com.google.android.gms.internal.ads.eb4 r2 = new com.google.android.gms.internal.ads.eb4
            long r3 = r0.f26725f
            com.google.android.gms.internal.ads.b94 r7 = r0.f26721b
            java.util.Objects.requireNonNull(r7)
            r2.<init>(r3, r7)
            r1.mo16803f(r2)
            com.google.android.gms.internal.ads.zzdc[] r1 = new com.google.android.gms.internal.ads.zzdc[r6]
            com.google.android.gms.internal.ads.zzaak r2 = r0.f26726g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m34493e(r1)
            r0.f26722c = r5
            goto L_0x00a8
        L_0x00a5:
            r23.m34492c()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.f25288a = r7
            return r6
        L_0x00ac:
            int r2 = r0.f26723d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.no2 r2 = new com.google.android.gms.internal.ads.no2
            int r3 = r0.f26724e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo19781h()
            int r4 = r0.f26724e
            r6 = r1
            com.google.android.gms.internal.ads.t84 r6 = (com.google.android.gms.internal.ads.t84) r6
            r6.mo19927e(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzaak r3 = r0.f26726g
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.mo19769D(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.mo19769D(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.mo16584b()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.bb4 r2 = com.google.android.gms.internal.ads.fb4.m23617a(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List<com.google.android.gms.internal.ads.ab4> r6 = r2.f14392b
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List<com.google.android.gms.internal.ads.ab4> r5 = r2.f14392b
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0105:
            if (r5 < 0) goto L_0x0140
            java.util.List<com.google.android.gms.internal.ads.ab4> r10 = r2.f14392b
            java.lang.Object r10 = r10.get(r5)
            com.google.android.gms.internal.ads.ab4 r10 = (com.google.android.gms.internal.ads.ab4) r10
            java.lang.String r15 = r10.f13838a
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x0120
            long r9 = r10.f13840c
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0124
        L_0x0120:
            long r9 = r10.f13839b
            long r9 = r3 - r9
        L_0x0124:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0135
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0135
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0136
        L_0x0135:
            r6 = r1
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r13 = r9
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            r11 = r3
        L_0x013c:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0105
        L_0x0140:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            goto L_0x00e4
        L_0x0151:
            com.google.android.gms.internal.ads.zzaak r1 = new com.google.android.gms.internal.ads.zzaak
            long r2 = r2.f14391a
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x015a:
            r0.f26726g = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.f27109j
            r0.f26725f = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.f26724e
            com.google.android.gms.internal.ads.t84 r1 = (com.google.android.gms.internal.ads.t84) r1
            r3 = 0
            r1.mo21042o(r2, r3)
        L_0x016c:
            r0.f26722c = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.no2 r2 = r0.f26720a
            r2.mo19776c(r5)
            com.google.android.gms.internal.ads.no2 r2 = r0.f26720a
            byte[] r2 = r2.mo19781h()
            com.google.android.gms.internal.ads.t84 r1 = (com.google.android.gms.internal.ads.t84) r1
            r1.mo19927e(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.no2 r1 = r0.f26720a
            int r1 = r1.mo19796w()
            int r1 = r1 + -2
            r0.f26724e = r1
            r0.f26722c = r5
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.no2 r2 = r0.f26720a
            r2.mo19776c(r5)
            com.google.android.gms.internal.ads.no2 r2 = r0.f26720a
            byte[] r2 = r2.mo19781h()
            com.google.android.gms.internal.ads.t84 r1 = (com.google.android.gms.internal.ads.t84) r1
            r1.mo19927e(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.no2 r1 = r0.f26720a
            int r1 = r1.mo19796w()
            r0.f26723d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.f26725f
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.f26722c = r4
            goto L_0x01c9
        L_0x01b4:
            r23.m34492c()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.f26722c = r6
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.za4.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f26721b = b94;
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        if (j == 0) {
            this.f26722c = 0;
            this.f26729j = null;
        } else if (this.f26722c == 5) {
            C4987d1 d1Var = this.f26729j;
            Objects.requireNonNull(d1Var);
            d1Var.mo16804h(j, j2);
        }
    }
}
