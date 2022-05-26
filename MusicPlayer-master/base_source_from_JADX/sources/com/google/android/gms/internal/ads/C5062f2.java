package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.f2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5062f2 implements y84 {

    /* renamed from: d */
    public static final f94 f16404d = C5025e2.f15833b;

    /* renamed from: a */
    private final C5100g2 f16405a = new C5100g2((String) null);

    /* renamed from: b */
    private final no2 f16406b = new no2(2786);

    /* renamed from: c */
    private boolean f16407c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0049, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r9.mo19928h();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        if ((r4 - r3) >= 8192) goto L_0x0049;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16801b(com.google.android.gms.internal.ads.z84 r9) throws java.io.IOException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.no2 r0 = new com.google.android.gms.internal.ads.no2
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo19781h()
            r5 = r9
            com.google.android.gms.internal.ads.t84 r5 = (com.google.android.gms.internal.ads.t84) r5
            r5.mo19929i(r4, r2, r1, r2)
            r0.mo19779f(r2)
            int r4 = r0.mo19794u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r6) goto L_0x0062
            r9.mo19928h()
            r5.mo21041n(r3, r2)
            r4 = r3
        L_0x0026:
            r1 = 0
        L_0x0027:
            byte[] r6 = r0.mo19781h()
            r7 = 6
            r5.mo19929i(r6, r2, r7, r2)
            r0.mo19779f(r2)
            int r6 = r0.mo19796w()
            r7 = 2935(0xb77, float:4.113E-42)
            if (r6 == r7) goto L_0x004a
            r9.mo19928h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0049
            r5.mo21041n(r4, r2)
            goto L_0x0026
        L_0x0049:
            return r2
        L_0x004a:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0050
            return r6
        L_0x0050:
            byte[] r6 = r0.mo19781h()
            int r6 = com.google.android.gms.internal.ads.d84.m22378a(r6)
            r7 = -1
            if (r6 != r7) goto L_0x005c
            return r2
        L_0x005c:
            int r6 = r6 + -6
            r5.mo21041n(r6, r2)
            goto L_0x0027
        L_0x0062:
            r4 = 3
            r0.mo19780g(r4)
            int r4 = r0.mo19791r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo21041n(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5062f2.mo16801b(com.google.android.gms.internal.ads.z84):boolean");
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        int c = z84.mo15695c(this.f16406b.mo19781h(), 0, 2786);
        if (c == -1) {
            return -1;
        }
        this.f16406b.mo19779f(0);
        this.f16406b.mo19778e(c);
        if (!this.f16407c) {
            this.f16405a.mo15671d(0, 4);
            this.f16407c = true;
        }
        this.f16405a.mo15668a(this.f16406b);
        return 0;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f16405a.mo15670c(b94, new C4953c4(Integer.MIN_VALUE, 0, 1));
        b94.mo15722I();
        b94.mo15723r(new y94(-9223372036854775807L, 0));
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f16407c = false;
        this.f16405a.zze();
    }
}
