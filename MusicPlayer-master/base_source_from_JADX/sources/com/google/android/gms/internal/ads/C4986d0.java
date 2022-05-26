package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.d0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4986d0 implements y84 {

    /* renamed from: q */
    public static final f94 f15396q = C4912b0.f14224b;

    /* renamed from: a */
    private final no2 f15397a;

    /* renamed from: b */
    private final t94 f15398b;

    /* renamed from: c */
    private final p94 f15399c;

    /* renamed from: d */
    private final r94 f15400d;

    /* renamed from: e */
    private final da4 f15401e;

    /* renamed from: f */
    private b94 f15402f;

    /* renamed from: g */
    private da4 f15403g;

    /* renamed from: h */
    private da4 f15404h;

    /* renamed from: i */
    private int f15405i;

    /* renamed from: j */
    private zzdd f15406j;

    /* renamed from: k */
    private long f15407k;

    /* renamed from: l */
    private long f15408l;

    /* renamed from: m */
    private long f15409m;

    /* renamed from: n */
    private int f15410n;

    /* renamed from: o */
    private C5060f0 f15411o;

    /* renamed from: p */
    private boolean f15412p;

    static {
        C4949c0 c0Var = C4949c0.f14747a;
    }

    public C4986d0() {
        this(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0159  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22252c(com.google.android.gms.internal.ads.z84 r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f15405i
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.m22257k(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.f0 r2 = r0.f15411o
            r8 = 1
            if (r2 != 0) goto L_0x01b3
            com.google.android.gms.internal.ads.no2 r14 = new com.google.android.gms.internal.ads.no2
            com.google.android.gms.internal.ads.t94 r2 = r0.f15398b
            int r2 = r2.f23800c
            r14.<init>((int) r2)
            byte[] r2 = r14.mo19781h()
            com.google.android.gms.internal.ads.t94 r9 = r0.f15398b
            int r9 = r9.f23800c
            r15 = r1
            com.google.android.gms.internal.ads.t84 r15 = (com.google.android.gms.internal.ads.t84) r15
            r15.mo19929i(r2, r4, r9, r4)
            com.google.android.gms.internal.ads.t94 r2 = r0.f15398b
            int r9 = r2.f23798a
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x003d
            int r2 = r2.f23802e
            if (r2 == r8) goto L_0x0041
            r2 = 36
            goto L_0x0048
        L_0x003d:
            int r2 = r2.f23802e
            if (r2 == r8) goto L_0x0044
        L_0x0041:
            r2 = 21
            goto L_0x0048
        L_0x0044:
            r11 = 13
            r2 = 13
        L_0x0048:
            int r9 = r14.mo19785l()
            int r11 = r2 + 4
            r12 = 1483304551(0x58696e67, float:1.02664153E15)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r8 = 1231971951(0x496e666f, float:976486.94)
            if (r9 < r11) goto L_0x006a
            r14.mo19779f(r2)
            int r9 = r14.mo19786m()
            if (r9 == r12) goto L_0x0068
            if (r9 != r8) goto L_0x006a
            r11 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x0080
        L_0x0068:
            r11 = r9
            goto L_0x0080
        L_0x006a:
            int r9 = r14.mo19785l()
            r11 = 40
            if (r9 < r11) goto L_0x007f
            r14.mo19779f(r10)
            int r9 = r14.mo19786m()
            if (r9 != r13) goto L_0x007f
            r11 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0080
        L_0x007f:
            r11 = 0
        L_0x0080:
            if (r11 == r12) goto L_0x00a2
            if (r11 != r8) goto L_0x0085
            goto L_0x00a2
        L_0x0085:
            if (r11 != r13) goto L_0x009d
            long r9 = r17.mo16584b()
            long r11 = r17.zze()
            com.google.android.gms.internal.ads.t94 r13 = r0.f15398b
            com.google.android.gms.internal.ads.g0 r2 = com.google.android.gms.internal.ads.C5098g0.m24038b(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.t94 r8 = r0.f15398b
            int r8 = r8.f23800c
            r15.mo21042o(r8, r4)
            goto L_0x00ff
        L_0x009d:
            r17.mo19928h()
            r2 = 0
            goto L_0x00ff
        L_0x00a2:
            long r9 = r17.mo16584b()
            long r12 = r17.zze()
            com.google.android.gms.internal.ads.t94 r7 = r0.f15398b
            r5 = r11
            r11 = r12
            r13 = r7
            com.google.android.gms.internal.ads.h0 r6 = com.google.android.gms.internal.ads.C5135h0.m24603b(r9, r11, r13, r14)
            if (r6 == 0) goto L_0x00e8
            com.google.android.gms.internal.ads.p94 r7 = r0.f15399c
            boolean r7 = r7.mo20242a()
            if (r7 != 0) goto L_0x00e8
            r17.mo19928h()
            int r2 = r2 + 141
            r15.mo21041n(r2, r4)
            com.google.android.gms.internal.ads.no2 r2 = r0.f15397a
            byte[] r2 = r2.mo19781h()
            r7 = 3
            r15.mo19929i(r2, r4, r7, r4)
            com.google.android.gms.internal.ads.no2 r2 = r0.f15397a
            r2.mo19779f(r4)
            com.google.android.gms.internal.ads.p94 r2 = r0.f15399c
            com.google.android.gms.internal.ads.no2 r7 = r0.f15397a
            int r7 = r7.mo19794u()
            int r9 = r7 >> 12
            r7 = r7 & 4095(0xfff, float:5.738E-42)
            if (r9 > 0) goto L_0x00e4
            if (r7 <= 0) goto L_0x00e8
        L_0x00e4:
            r2.f21377a = r9
            r2.f21378b = r7
        L_0x00e8:
            com.google.android.gms.internal.ads.t94 r2 = r0.f15398b
            int r2 = r2.f23800c
            r15.mo21042o(r2, r4)
            if (r6 == 0) goto L_0x00fe
            boolean r2 = r6.mo15608e()
            if (r2 != 0) goto L_0x00fe
            if (r5 != r8) goto L_0x00fe
            com.google.android.gms.internal.ads.f0 r2 = r0.m22254g(r1, r4)
            goto L_0x00ff
        L_0x00fe:
            r2 = r6
        L_0x00ff:
            com.google.android.gms.internal.ads.zzdd r5 = r0.f15406j
            long r6 = r17.zze()
            if (r5 == 0) goto L_0x014e
            int r8 = r5.mo22581a()
            r9 = 0
        L_0x010c:
            if (r9 >= r8) goto L_0x014e
            com.google.android.gms.internal.ads.zzdc r10 = r5.mo22582b(r9)
            boolean r11 = r10 instanceof com.google.android.gms.internal.ads.zzzy
            if (r11 == 0) goto L_0x014b
            com.google.android.gms.internal.ads.zzzy r10 = (com.google.android.gms.internal.ads.zzzy) r10
            int r8 = r5.mo22581a()
            r9 = 0
        L_0x011d:
            if (r9 >= r8) goto L_0x0141
            com.google.android.gms.internal.ads.zzdc r11 = r5.mo22582b(r9)
            boolean r12 = r11 instanceof com.google.android.gms.internal.ads.zzaac
            if (r12 == 0) goto L_0x013e
            com.google.android.gms.internal.ads.zzaac r11 = (com.google.android.gms.internal.ads.zzaac) r11
            java.lang.String r12 = r11.f27469g
            java.lang.String r13 = "TLEN"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x013e
            java.lang.String r5 = r11.f27099i
            long r8 = java.lang.Long.parseLong(r5)
            long r8 = com.google.android.gms.internal.ads.bw3.m21569c(r8)
            goto L_0x0146
        L_0x013e:
            int r9 = r9 + 1
            goto L_0x011d
        L_0x0141:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0146:
            com.google.android.gms.internal.ads.a0 r5 = com.google.android.gms.internal.ads.C4875a0.m20506b(r6, r10, r8)
            goto L_0x014f
        L_0x014b:
            int r9 = r9 + 1
            goto L_0x010c
        L_0x014e:
            r5 = 0
        L_0x014f:
            boolean r6 = r0.f15412p
            if (r6 == 0) goto L_0x0159
            com.google.android.gms.internal.ads.e0 r2 = new com.google.android.gms.internal.ads.e0
            r2.<init>()
            goto L_0x016a
        L_0x0159:
            if (r5 == 0) goto L_0x015d
            r2 = r5
            goto L_0x0160
        L_0x015d:
            if (r2 != 0) goto L_0x0160
            r2 = 0
        L_0x0160:
            if (r2 == 0) goto L_0x0166
            r2.mo15608e()
            goto L_0x016a
        L_0x0166:
            com.google.android.gms.internal.ads.f0 r2 = r0.m22254g(r1, r4)
        L_0x016a:
            r0.f15411o = r2
            com.google.android.gms.internal.ads.b94 r5 = r0.f15402f
            r5.mo15723r(r2)
            com.google.android.gms.internal.ads.da4 r2 = r0.f15404h
            com.google.android.gms.internal.ads.jb4 r5 = new com.google.android.gms.internal.ads.jb4
            r5.<init>()
            com.google.android.gms.internal.ads.t94 r6 = r0.f15398b
            java.lang.String r6 = r6.f23799b
            r5.mo18599s(r6)
            r6 = 4096(0x1000, float:5.74E-42)
            r5.mo18592l(r6)
            com.google.android.gms.internal.ads.t94 r6 = r0.f15398b
            int r6 = r6.f23802e
            r5.mo18582e0(r6)
            com.google.android.gms.internal.ads.t94 r6 = r0.f15398b
            int r6 = r6.f23801d
            r5.mo18600t(r6)
            com.google.android.gms.internal.ads.p94 r6 = r0.f15399c
            int r6 = r6.f21377a
            r5.mo18577c(r6)
            com.google.android.gms.internal.ads.p94 r6 = r0.f15399c
            int r6 = r6.f21378b
            r5.mo18579d(r6)
            com.google.android.gms.internal.ads.zzdd r6 = r0.f15406j
            r5.mo18593m(r6)
            com.google.android.gms.internal.ads.w r5 = r5.mo18605y()
            r2.mo16885a(r5)
            long r5 = r17.zze()
            r0.f15409m = r5
            goto L_0x01cd
        L_0x01b3:
            long r5 = r0.f15409m
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x01cd
            long r5 = r17.zze()
            long r7 = r0.f15409m
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x01cd
            r2 = r1
            com.google.android.gms.internal.ads.t84 r2 = (com.google.android.gms.internal.ads.t84) r2
            long r7 = r7 - r5
            int r5 = (int) r7
            r2.mo21042o(r5, r4)
        L_0x01cd:
            int r2 = r0.f15410n
            if (r2 != 0) goto L_0x0237
            r17.mo19928h()
            boolean r2 = r16.m22256j(r17)
            if (r2 == 0) goto L_0x01dc
            goto L_0x0249
        L_0x01dc:
            com.google.android.gms.internal.ads.no2 r2 = r0.f15397a
            r2.mo19779f(r4)
            com.google.android.gms.internal.ads.no2 r2 = r0.f15397a
            int r2 = r2.mo19786m()
            int r5 = r0.f15405i
            long r5 = (long) r5
            boolean r5 = m22255i(r2, r5)
            if (r5 == 0) goto L_0x022e
            int r5 = com.google.android.gms.internal.ads.u94.m31711b(r2)
            if (r5 != r3) goto L_0x01f7
            goto L_0x022e
        L_0x01f7:
            com.google.android.gms.internal.ads.t94 r5 = r0.f15398b
            r5.mo21043a(r2)
            long r5 = r0.f15407k
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0213
            com.google.android.gms.internal.ads.f0 r2 = r0.f15411o
            long r5 = r17.zze()
            long r5 = r2.mo15609g(r5)
            r0.f15407k = r5
        L_0x0213:
            com.google.android.gms.internal.ads.t94 r2 = r0.f15398b
            int r5 = r2.f23800c
            r0.f15410n = r5
            com.google.android.gms.internal.ads.f0 r6 = r0.f15411o
            boolean r7 = r6 instanceof com.google.android.gms.internal.ads.C5801z
            if (r7 != 0) goto L_0x0221
            r2 = r5
            goto L_0x0237
        L_0x0221:
            com.google.android.gms.internal.ads.z r6 = (com.google.android.gms.internal.ads.C5801z) r6
            long r3 = r0.f15408l
            int r1 = r2.f23804g
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.m22253e(r3)
            r1 = 0
            throw r1
        L_0x022e:
            com.google.android.gms.internal.ads.t84 r1 = (com.google.android.gms.internal.ads.t84) r1
            r5 = 1
            r1.mo21042o(r5, r4)
            r0.f15405i = r4
            goto L_0x0248
        L_0x0237:
            r5 = 1
            com.google.android.gms.internal.ads.da4 r6 = r0.f15404h
            int r1 = r6.mo16886b(r1, r2, r5)
            if (r1 != r3) goto L_0x0241
            goto L_0x0249
        L_0x0241:
            int r2 = r0.f15410n
            int r2 = r2 - r1
            r0.f15410n = r2
            if (r2 <= 0) goto L_0x024a
        L_0x0248:
            r3 = 0
        L_0x0249:
            return r3
        L_0x024a:
            com.google.android.gms.internal.ads.da4 r5 = r0.f15404h
            long r1 = r0.f15408l
            long r6 = r0.m22253e(r1)
            r8 = 1
            com.google.android.gms.internal.ads.t94 r1 = r0.f15398b
            int r9 = r1.f23800c
            r10 = 0
            r11 = 0
            r5.mo16889e(r6, r8, r9, r10, r11)
            long r1 = r0.f15408l
            com.google.android.gms.internal.ads.t94 r3 = r0.f15398b
            int r3 = r3.f23804g
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.f15408l = r1
            r0.f15410n = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4986d0.m22252c(com.google.android.gms.internal.ads.z84):int");
    }

    /* renamed from: e */
    private final long m22253e(long j) {
        return this.f15407k + ((j * 1000000) / ((long) this.f15398b.f23801d));
    }

    /* renamed from: g */
    private final C5060f0 m22254g(z84 z84, boolean z) throws IOException {
        ((t84) z84).mo19929i(this.f15397a.mo19781h(), 0, 4, false);
        this.f15397a.mo19779f(0);
        this.f15398b.mo21043a(this.f15397a.mo19786m());
        return new C5763y(z84.mo16584b(), z84.zze(), this.f15398b, false);
    }

    /* renamed from: i */
    private static boolean m22255i(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: j */
    private final boolean m22256j(z84 z84) throws IOException {
        C5060f0 f0Var = this.f15411o;
        if (f0Var != null) {
            long a = f0Var.mo15606a();
            if (a != -1 && z84.mo16585f() > a - 4) {
                return true;
            }
        }
        try {
            return !z84.mo19929i(this.f15397a.mo19781h(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* renamed from: k */
    private final boolean m22257k(z84 z84, boolean z) throws IOException {
        int i;
        int i2;
        int b;
        int i3 = true != z ? 131072 : 32768;
        z84.mo19928h();
        if (z84.zze() == 0) {
            zzdd a = this.f15400d.mo20617a(z84, (tb4) null);
            this.f15406j = a;
            if (a != null) {
                this.f15399c.mo20243b(a);
            }
            i = (int) z84.mo16585f();
            if (!z) {
                ((t84) z84).mo21042o(i, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!m22256j(z84)) {
                this.f15397a.mo19779f(0);
                int m = this.f15397a.mo19786m();
                if ((i2 == 0 || m22255i(m, (long) i2)) && (b = u94.m31711b(m)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.f15398b.mo21043a(m);
                        i2 = m;
                    }
                    ((t84) z84).mo21041n(b - 4, false);
                } else {
                    int i6 = i5 + 1;
                    if (i5 != i3) {
                        if (z) {
                            z84.mo19928h();
                            ((t84) z84).mo21041n(i + i6, false);
                        } else {
                            ((t84) z84).mo21042o(1, false);
                        }
                        i5 = i6;
                        i2 = 0;
                        i4 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C5464px.zza("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((t84) z84).mo21042o(i + i5, false);
        } else {
            z84.mo19928h();
        }
        this.f15405i = i2;
        return true;
    }

    /* renamed from: a */
    public final void mo16800a() {
        this.f15412p = true;
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return m22257k(z84, true);
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        gs1.m24484b(this.f15403g);
        int i = wy2.f25579a;
        int c = m22252c(z84);
        if (c == -1 && (this.f15411o instanceof C5801z)) {
            if (this.f15411o.zze() != m22253e(this.f15408l)) {
                C5801z zVar = (C5801z) this.f15411o;
                throw null;
            }
        }
        return c;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f15402f = b94;
        da4 s = b94.mo15724s(0, 1);
        this.f15403g = s;
        this.f15404h = s;
        this.f15402f.mo15722I();
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f15405i = 0;
        this.f15407k = -9223372036854775807L;
        this.f15408l = 0;
        this.f15410n = 0;
        C5060f0 f0Var = this.f15411o;
        if (f0Var instanceof C5801z) {
            C5801z zVar = (C5801z) f0Var;
            throw null;
        }
    }

    public C4986d0(int i) {
        this.f15397a = new no2(10);
        this.f15398b = new t94();
        this.f15399c = new p94();
        this.f15407k = -9223372036854775807L;
        this.f15400d = new r94();
        x84 x84 = new x84();
        this.f15401e = x84;
        this.f15404h = x84;
    }
}
