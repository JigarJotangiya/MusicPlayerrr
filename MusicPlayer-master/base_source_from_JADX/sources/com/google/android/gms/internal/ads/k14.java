package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class k14 implements x24 {

    /* renamed from: a */
    private final f94 f18716a;

    /* renamed from: b */
    private y84 f18717b;

    /* renamed from: c */
    private z84 f18718c;

    public k14(f94 f94) {
        this.f18716a = f94;
    }

    /* renamed from: a */
    public final long mo18781a() {
        z84 z84 = this.f18718c;
        if (z84 != null) {
            return z84.zze();
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo18782b() {
        y84 y84 = this.f18717b;
        if (y84 instanceof C4986d0) {
            ((C4986d0) y84).mo16800a();
        }
    }

    /* renamed from: c */
    public final void mo18783c(long j, long j2) {
        y84 y84 = this.f18717b;
        Objects.requireNonNull(y84);
        y84.mo16804h(j, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r0.zze() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r0.zze() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r1 = false;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18784d(com.google.android.gms.internal.ads.o91 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.gms.internal.ads.b94 r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.t84 r6 = new com.google.android.gms.internal.ads.t84
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f18718c = r6
            com.google.android.gms.internal.ads.y84 r8 = r7.f18717b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.f94 r8 = r7.f18716a
            com.google.android.gms.internal.ads.y84[] r8 = r8.mo15631a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0020
            r8 = r8[r13]
            r7.f18717b = r8
            goto L_0x007f
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 >= r10) goto L_0x007b
            r1 = r8[r0]
            boolean r2 = r1.mo16801b(r6)     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r2 == 0) goto L_0x003f
            r7.f18717b = r1     // Catch:{ EOFException -> 0x0061, all -> 0x004c }
            if (r1 != 0) goto L_0x0037
            long r0 = r6.zze()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0038
        L_0x0037:
            r13 = 1
        L_0x0038:
            com.google.android.gms.internal.ads.gs1.m24488f(r13)
            r6.mo19928h()
            goto L_0x007b
        L_0x003f:
            com.google.android.gms.internal.ads.y84 r1 = r7.f18717b
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zze()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x004c:
            r8 = move-exception
            com.google.android.gms.internal.ads.y84 r9 = r7.f18717b
            if (r9 != 0) goto L_0x0059
            long r9 = r6.zze()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x005a
        L_0x0059:
            r13 = 1
        L_0x005a:
            com.google.android.gms.internal.ads.gs1.m24488f(r13)
            r6.mo19928h()
            throw r8
        L_0x0061:
            com.google.android.gms.internal.ads.y84 r1 = r7.f18717b
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zze()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = 0
            goto L_0x0072
        L_0x0071:
            r1 = 1
        L_0x0072:
            com.google.android.gms.internal.ads.gs1.m24488f(r1)
            r6.mo19928h()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x007b:
            com.google.android.gms.internal.ads.y84 r10 = r7.f18717b
            if (r10 == 0) goto L_0x0085
        L_0x007f:
            com.google.android.gms.internal.ads.y84 r8 = r7.f18717b
            r8.mo16803f(r15)
            return
        L_0x0085:
            com.google.android.gms.internal.ads.a44 r10 = new com.google.android.gms.internal.ads.a44
            java.lang.String r8 = com.google.android.gms.internal.ads.wy2.m33442f(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r12 = r8.length()
            int r12 = r12 + 58
            r11.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k14.mo18784d(com.google.android.gms.internal.ads.o91, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.b94):void");
    }

    /* renamed from: e */
    public final int mo18785e(w94 w94) throws IOException {
        y84 y84 = this.f18717b;
        Objects.requireNonNull(y84);
        z84 z84 = this.f18718c;
        Objects.requireNonNull(z84);
        return y84.mo16802d(z84, w94);
    }

    public final void zze() {
        if (this.f18717b != null) {
            this.f18717b = null;
        }
        this.f18718c = null;
    }
}
