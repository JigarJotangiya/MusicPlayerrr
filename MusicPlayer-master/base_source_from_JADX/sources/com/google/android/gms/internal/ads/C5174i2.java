package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.i2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5174i2 implements y84 {

    /* renamed from: d */
    public static final f94 f17872d = C5137h2.f17489b;

    /* renamed from: a */
    private final C5211j2 f17873a = new C5211j2((String) null);

    /* renamed from: b */
    private final no2 f17874b = new no2(16384);

    /* renamed from: c */
    private boolean f17875c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r16.mo19928h();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        if ((r4 - r3) >= 8192) goto L_0x0051;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16801b(com.google.android.gms.internal.ads.z84 r16) throws java.io.IOException {
        /*
            r15 = this;
            com.google.android.gms.internal.ads.no2 r0 = new com.google.android.gms.internal.ads.no2
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo19781h()
            r5 = r16
            com.google.android.gms.internal.ads.t84 r5 = (com.google.android.gms.internal.ads.t84) r5
            r5.mo19929i(r4, r2, r1, r2)
            r0.mo19779f(r2)
            int r4 = r0.mo19794u()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L_0x009a
            r16.mo19928h()
            r5.mo21041n(r3, r2)
            r4 = r3
        L_0x0028:
            r1 = 0
        L_0x0029:
            byte[] r6 = r0.mo19781h()
            r8 = 7
            r5.mo19929i(r6, r2, r8, r2)
            r0.mo19779f(r2)
            int r6 = r0.mo19796w()
            r9 = 44096(0xac40, float:6.1792E-41)
            r10 = 44097(0xac41, float:6.1793E-41)
            if (r6 == r9) goto L_0x0052
            if (r6 == r10) goto L_0x0052
            r16.mo19928h()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r6) goto L_0x0051
            r5.mo21041n(r4, r2)
            goto L_0x0028
        L_0x0051:
            return r2
        L_0x0052:
            r9 = 1
            int r1 = r1 + r9
            r11 = 4
            if (r1 < r11) goto L_0x0058
            return r9
        L_0x0058:
            byte[] r9 = r0.mo19781h()
            int r12 = com.google.android.gms.internal.ads.g84.f16992b
            int r12 = r9.length
            r13 = -1
            if (r12 >= r8) goto L_0x0064
            r12 = -1
            goto L_0x0091
        L_0x0064:
            r12 = 2
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r14 = r9[r7]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r12 = r12 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 != r14) goto L_0x008b
            byte r11 = r9[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 16
            r12 = 5
            byte r12 = r9[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            r11 = r11 | r12
            r12 = 6
            byte r9 = r9[r12]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r12 = r11 | r9
            goto L_0x008c
        L_0x008b:
            r8 = 4
        L_0x008c:
            if (r6 != r10) goto L_0x0090
            int r8 = r8 + 2
        L_0x0090:
            int r12 = r12 + r8
        L_0x0091:
            if (r12 != r13) goto L_0x0094
            return r2
        L_0x0094:
            int r12 = r12 + -7
            r5.mo21041n(r12, r2)
            goto L_0x0029
        L_0x009a:
            r0.mo19780g(r7)
            int r4 = r0.mo19791r()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mo21041n(r4, r2)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5174i2.mo16801b(com.google.android.gms.internal.ads.z84):boolean");
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        int c = z84.mo15695c(this.f17874b.mo19781h(), 0, 16384);
        if (c == -1) {
            return -1;
        }
        this.f17874b.mo19779f(0);
        this.f17874b.mo19778e(c);
        if (!this.f17875c) {
            this.f17873a.mo15671d(0, 4);
            this.f17875c = true;
        }
        this.f17873a.mo15668a(this.f17874b);
        return 0;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f17873a.mo15670c(b94, new C4953c4(Integer.MIN_VALUE, 0, 1));
        b94.mo15722I();
        b94.mo15723r(new y94(-9223372036854775807L, 0));
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f17875c = false;
        this.f17873a.zze();
    }
}
