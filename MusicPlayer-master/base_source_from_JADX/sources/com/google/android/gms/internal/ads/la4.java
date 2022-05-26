package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class la4 implements y84 {

    /* renamed from: m */
    public static final f94 f19274m = ja4.f18412b;

    /* renamed from: n */
    private static final int[] f19275n = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: o */
    private static final int[] f19276o;

    /* renamed from: p */
    private static final byte[] f19277p = wy2.m33460w("#!AMR\n");

    /* renamed from: q */
    private static final byte[] f19278q = wy2.m33460w("#!AMR-WB\n");

    /* renamed from: r */
    private static final int f19279r;

    /* renamed from: a */
    private final byte[] f19280a = new byte[1];

    /* renamed from: b */
    private boolean f19281b;

    /* renamed from: c */
    private long f19282c;

    /* renamed from: d */
    private int f19283d;

    /* renamed from: e */
    private int f19284e;

    /* renamed from: f */
    private boolean f19285f;

    /* renamed from: g */
    private int f19286g = -1;

    /* renamed from: h */
    private int f19287h;

    /* renamed from: i */
    private b94 f19288i;

    /* renamed from: j */
    private da4 f19289j;

    /* renamed from: k */
    private z94 f19290k;

    /* renamed from: l */
    private boolean f19291l;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f19276o = iArr;
        f19279r = iArr[8];
    }

    public la4(int i) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e A[Catch:{ EOFException -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m26613a(com.google.android.gms.internal.ads.z84 r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f19284e
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0099
            r12.mo19928h()     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f19280a     // Catch:{ EOFException -> 0x0098 }
            r4 = r12
            com.google.android.gms.internal.ads.t84 r4 = (com.google.android.gms.internal.ads.t84) r4     // Catch:{ EOFException -> 0x0098 }
            r4.mo19929i(r0, r3, r2, r3)     // Catch:{ EOFException -> 0x0098 }
            byte[] r0 = r11.f19280a     // Catch:{ EOFException -> 0x0098 }
            byte r0 = r0[r3]     // Catch:{ EOFException -> 0x0098 }
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L_0x0080
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f19281b     // Catch:{ EOFException -> 0x0098 }
            if (r4 == 0) goto L_0x002c
            r6 = 10
            if (r0 < r6) goto L_0x0037
            r6 = 13
            if (r0 <= r6) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r4 != 0) goto L_0x0055
            r6 = 12
            if (r0 < r6) goto L_0x0037
            r6 = 14
            if (r0 > r6) goto L_0x0037
            goto L_0x0055
        L_0x0037:
            if (r4 == 0) goto L_0x003e
            int[] r4 = f19276o     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
            goto L_0x0042
        L_0x003e:
            int[] r4 = f19275n     // Catch:{ EOFException -> 0x0098 }
            r0 = r4[r0]     // Catch:{ EOFException -> 0x0098 }
        L_0x0042:
            r11.f19283d = r0     // Catch:{ EOFException -> 0x0098 }
            r11.f19284e = r0
            int r4 = r11.f19286g
            if (r4 != r1) goto L_0x004d
            r11.f19286g = r0
            r4 = r0
        L_0x004d:
            if (r4 != r0) goto L_0x0099
            int r4 = r11.f19287h
            int r4 = r4 + r2
            r11.f19287h = r4
            goto L_0x0099
        L_0x0055:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L_0x005c
            r12 = r3
        L_0x005c:
            int r2 = r12.length()     // Catch:{ EOFException -> 0x0098 }
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r3.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = " frame type "
            r3.append(r12)     // Catch:{ EOFException -> 0x0098 }
            r3.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r3.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.px r12 = com.google.android.gms.internal.ads.C5464px.zza(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0080:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0098 }
            r2 = 42
            r12.<init>(r2)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch:{ EOFException -> 0x0098 }
            r12.append(r0)     // Catch:{ EOFException -> 0x0098 }
            java.lang.String r12 = r12.toString()     // Catch:{ EOFException -> 0x0098 }
            com.google.android.gms.internal.ads.px r12 = com.google.android.gms.internal.ads.C5464px.zza(r12, r5)     // Catch:{ EOFException -> 0x0098 }
            throw r12     // Catch:{ EOFException -> 0x0098 }
        L_0x0098:
            return r1
        L_0x0099:
            com.google.android.gms.internal.ads.da4 r4 = r11.f19289j
            int r12 = com.google.android.gms.internal.ads.ba4.m21198a(r4, r12, r0, r2)
            if (r12 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            int r0 = r11.f19284e
            int r0 = r0 - r12
            r11.f19284e = r0
            if (r0 <= 0) goto L_0x00aa
            return r3
        L_0x00aa:
            com.google.android.gms.internal.ads.da4 r4 = r11.f19289j
            long r5 = r11.f19282c
            r7 = 1
            int r8 = r11.f19283d
            r9 = 0
            r10 = 0
            r4.mo16889e(r5, r7, r8, r9, r10)
            long r0 = r11.f19282c
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f19282c = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.la4.m26613a(com.google.android.gms.internal.ads.z84):int");
    }

    /* renamed from: c */
    private static boolean m26614c(z84 z84, byte[] bArr) throws IOException {
        z84.mo19928h();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((t84) z84).mo19929i(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: e */
    private final boolean m26615e(z84 z84) throws IOException {
        byte[] bArr = f19277p;
        if (m26614c(z84, bArr)) {
            this.f19281b = false;
            ((t84) z84).mo21042o(bArr.length, false);
            return true;
        }
        byte[] bArr2 = f19278q;
        if (!m26614c(z84, bArr2)) {
            return false;
        }
        this.f19281b = true;
        ((t84) z84).mo21042o(bArr2.length, false);
        return true;
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return m26615e(z84);
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        gs1.m24484b(this.f19289j);
        int i = wy2.f25579a;
        if (z84.zze() != 0 || m26615e(z84)) {
            if (!this.f19291l) {
                this.f19291l = true;
                boolean z = this.f19281b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                da4 da4 = this.f19289j;
                jb4 jb4 = new jb4();
                jb4.mo18599s(str);
                jb4.mo18592l(f19279r);
                jb4.mo18582e0(1);
                jb4.mo18600t(i2);
                da4.mo16885a(jb4.mo18605y());
            }
            int a = m26613a(z84);
            if (this.f19285f) {
                return a;
            }
            y94 y94 = new y94(-9223372036854775807L, 0);
            this.f19290k = y94;
            this.f19288i.mo15723r(y94);
            this.f19285f = true;
            return a;
        }
        throw C5464px.zza("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f19288i = b94;
        this.f19289j = b94.mo15724s(0, 1);
        b94.mo15722I();
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f19282c = 0;
        this.f19283d = 0;
        this.f19284e = 0;
    }
}
