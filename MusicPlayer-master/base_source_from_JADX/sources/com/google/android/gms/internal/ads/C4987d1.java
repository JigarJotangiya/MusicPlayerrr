package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.d1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4987d1 implements y84, z94 {

    /* renamed from: v */
    public static final f94 f15420v = C4876a1.f13716b;

    /* renamed from: a */
    private final no2 f15421a;

    /* renamed from: b */
    private final no2 f15422b;

    /* renamed from: c */
    private final no2 f15423c;

    /* renamed from: d */
    private final no2 f15424d;

    /* renamed from: e */
    private final ArrayDeque<C5172i0> f15425e;

    /* renamed from: f */
    private final List<zzdc> f15426f;

    /* renamed from: g */
    private int f15427g = 0;

    /* renamed from: h */
    private int f15428h;

    /* renamed from: i */
    private long f15429i;

    /* renamed from: j */
    private int f15430j;

    /* renamed from: k */
    private no2 f15431k;

    /* renamed from: l */
    private int f15432l;

    /* renamed from: m */
    private int f15433m;

    /* renamed from: n */
    private int f15434n;

    /* renamed from: o */
    private int f15435o;

    /* renamed from: p */
    private b94 f15436p;

    /* renamed from: q */
    private C4950c1[] f15437q;

    /* renamed from: r */
    private long[][] f15438r;

    /* renamed from: s */
    private int f15439s;

    /* renamed from: t */
    private long f15440t;

    /* renamed from: u */
    private int f15441u;

    public C4987d1(int i) {
        new C5099g1();
        this.f15426f = new ArrayList();
        this.f15424d = new no2(16);
        this.f15425e = new ArrayDeque<>();
        this.f15421a = new no2(df2.f15600a);
        this.f15422b = new no2(4);
        this.f15423c = new no2();
        this.f15432l = -1;
    }

    /* renamed from: i */
    private static int m22280i(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: j */
    private static int m22281j(C5284l1 l1Var, long j) {
        int a = l1Var.mo19045a(j);
        return a == -1 ? l1Var.mo19046b(j) : a;
    }

    /* renamed from: k */
    private static long m22282k(C5284l1 l1Var, long j, long j2) {
        int j3 = m22281j(l1Var, j);
        if (j3 == -1) {
            return j2;
        }
        return Math.min(l1Var.f19137c[j3], j2);
    }

    /* renamed from: l */
    private final void m22283l() {
        this.f15427g = 0;
        this.f15430j = 0;
    }

    /* renamed from: m */
    private final void m22284m(long j) throws C5464px {
        C4987d1 d1Var;
        zzdd zzdd;
        zzdd zzdd2;
        long j2;
        int i;
        List<C5284l1> list;
        C4987d1 d1Var2;
        zzdd zzdd3;
        char c;
        int i2;
        C4987d1 d1Var3 = this;
        while (!d1Var3.f15425e.isEmpty() && d1Var3.f15425e.peek().f17827b == j) {
            C5172i0 pop = d1Var3.f15425e.pop();
            if (pop.f18688a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = d1Var3.f15441u == 1;
                p94 p94 = new p94();
                C5209j0 d = pop.mo18245d(1969517665);
                if (d != null) {
                    Pair<zzdd, zzdd> a = C5505r0.m29800a(d);
                    zzdd zzdd4 = (zzdd) a.first;
                    zzdd zzdd5 = (zzdd) a.second;
                    if (zzdd4 != null) {
                        p94.mo20243b(zzdd4);
                    }
                    zzdd2 = zzdd5;
                    zzdd = zzdd4;
                } else {
                    zzdd2 = null;
                    zzdd = null;
                }
                C5172i0 c2 = pop.mo18244c(1835365473);
                zzdd b = c2 != null ? C5505r0.m29801b(c2) : null;
                List<C5284l1> c3 = C5505r0.m29802c(pop, p94, -9223372036854775807L, (zzs) null, false, z, C4913b1.f14246a);
                b94 b94 = d1Var3.f15436p;
                Objects.requireNonNull(b94);
                int size = c3.size();
                long j3 = -9223372036854775807L;
                long j4 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    C5284l1 l1Var = c3.get(i3);
                    if (l1Var.f19136b == 0) {
                        d1Var2 = d1Var3;
                        list = c3;
                        i = size;
                    } else {
                        C5173i1 i1Var = l1Var.f19135a;
                        ArrayList arrayList2 = arrayList;
                        long j5 = i1Var.f17846e;
                        if (j5 == j3) {
                            j5 = l1Var.f19142h;
                        }
                        long max = Math.max(j4, j5);
                        C4950c1 c1Var = new C4950c1(i1Var, l1Var, b94.mo15724s(i3, i1Var.f17843b));
                        int i5 = l1Var.f19139e;
                        list = c3;
                        jb4 b2 = i1Var.f17847f.mo21657b();
                        b2.mo18592l(i5 + 30);
                        i = size;
                        if (i1Var.f17843b == 2 && j5 > 0 && (i2 = l1Var.f19136b) > 1) {
                            b2.mo18581e(((float) i2) / (((float) j5) / 1000000.0f));
                        }
                        int i6 = i1Var.f17843b;
                        int i7 = C5802z0.f26609b;
                        if (i6 == 1 && p94.mo20242a()) {
                            b2.mo18577c(p94.f21377a);
                            b2.mo18579d(p94.f21378b);
                        }
                        int i8 = i1Var.f17843b;
                        zzdd[] zzddArr = new zzdd[2];
                        zzddArr[0] = zzdd2;
                        d1Var2 = this;
                        if (d1Var2.f15426f.isEmpty()) {
                            c = 1;
                            zzdd3 = null;
                        } else {
                            zzdd3 = new zzdd((List<? extends zzdc>) d1Var2.f15426f);
                            c = 1;
                        }
                        zzddArr[c] = zzdd3;
                        long j6 = max;
                        zzdd zzdd6 = new zzdd(new zzdc[0]);
                        if (i8 == 1) {
                            if (zzdd != null) {
                                zzdd6 = zzdd;
                            }
                        } else if (i8 == 2 && b != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= b.mo22581a()) {
                                    break;
                                }
                                zzdc b3 = b.mo22582b(i9);
                                if (b3 instanceof zzaah) {
                                    zzaah zzaah = (zzaah) b3;
                                    if ("com.android.capture.fps".equals(zzaah.f27102g)) {
                                        zzdd6 = new zzdd(zzaah);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzdd6 = zzdd6.mo22585e(zzddArr[i10]);
                        }
                        if (zzdd6.mo22581a() > 0) {
                            b2.mo18593m(zzdd6);
                        }
                        c1Var.f14771c.mo16885a(b2.mo18605y());
                        if (i1Var.f17843b == 2) {
                            if (i4 == -1) {
                                i4 = arrayList2.size();
                            }
                        }
                        arrayList = arrayList2;
                        arrayList.add(c1Var);
                        j4 = j6;
                    }
                    i3++;
                    d1Var3 = d1Var2;
                    c3 = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                d1Var = d1Var3;
                d1Var.f15439s = i4;
                d1Var.f15440t = j4;
                C4950c1[] c1VarArr = (C4950c1[]) arrayList.toArray(new C4950c1[0]);
                d1Var.f15437q = c1VarArr;
                int length = c1VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < c1VarArr.length; i11++) {
                    jArr[i11] = new long[c1VarArr[i11].f14770b.f19136b];
                    jArr2[i11] = c1VarArr[i11].f14770b.f19140f[0];
                }
                int i12 = 0;
                while (i12 < c1VarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < c1VarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    C5284l1 l1Var2 = c1VarArr[i13].f14770b;
                    j2 += (long) l1Var2.f19138d[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = l1Var2.f19140f[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                d1Var.f15438r = jArr;
                b94.mo15722I();
                b94.mo15723r(d1Var);
                d1Var.f15425e.clear();
                d1Var.f15427g = 2;
            } else {
                d1Var = d1Var3;
                if (!d1Var.f15425e.isEmpty()) {
                    d1Var.f15425e.peek().mo18246e(pop);
                }
            }
            d1Var3 = d1Var;
        }
        if (d1Var3.f15427g != 2) {
            m22283l();
        }
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return C5136h1.m24622b(z84, false);
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        long j2;
        long j3;
        int b;
        C4950c1[] c1VarArr = this.f15437q;
        Objects.requireNonNull(c1VarArr);
        if (c1VarArr.length == 0) {
            aa4 aa4 = aa4.f13831c;
            return new x94(aa4, aa4);
        }
        int i = this.f15439s;
        long j4 = -1;
        if (i != -1) {
            C5284l1 l1Var = c1VarArr[i].f14770b;
            int j5 = m22281j(l1Var, j);
            if (j5 == -1) {
                aa4 aa42 = aa4.f13831c;
                return new x94(aa42, aa42);
            }
            long j6 = l1Var.f19140f[j5];
            j2 = l1Var.f19137c[j5];
            if (j6 >= j || j5 >= l1Var.f19136b - 1 || (b = l1Var.mo19046b(j)) == -1 || b == j5) {
                j3 = -9223372036854775807L;
            } else {
                j3 = l1Var.f19140f[b];
                j4 = l1Var.f19137c[b];
            }
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C4950c1[] c1VarArr2 = this.f15437q;
            if (i2 >= c1VarArr2.length) {
                break;
            }
            if (i2 != this.f15439s) {
                C5284l1 l1Var2 = c1VarArr2[i2].f14770b;
                long k = m22282k(l1Var2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m22282k(l1Var2, j3, j4);
                }
                j2 = k;
            }
            i2++;
        }
        aa4 aa43 = new aa4(j, j2);
        if (j3 == -9223372036854775807L) {
            return new x94(aa43, aa43);
        }
        return new x94(aa43, new aa4(j3, j4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x0087 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16802d(com.google.android.gms.internal.ads.z84 r33, com.google.android.gms.internal.ads.w94 r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.f15427g
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x0231
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01b5
            long r16 = r33.zze()
            int r3 = r0.f15432l
            if (r3 != r8) goto L_0x00a2
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r20 = r18
            r22 = r20
            r25 = r22
            r3 = 0
            r5 = -1
            r9 = 1
            r24 = 1
            r27 = -1
        L_0x0032:
            com.google.android.gms.internal.ads.c1[] r4 = r0.f15437q
            com.google.android.gms.internal.ads.wy2.m33436c(r4)
            com.google.android.gms.internal.ads.c1[] r4 = (com.google.android.gms.internal.ads.C4950c1[]) r4
            int r4 = r4.length
            if (r3 >= r4) goto L_0x008a
            com.google.android.gms.internal.ads.c1[] r4 = r0.f15437q
            r4 = r4[r3]
            int r15 = r4.f14772d
            com.google.android.gms.internal.ads.l1 r4 = r4.f14770b
            int r12 = r4.f19136b
            if (r15 != r12) goto L_0x0049
            goto L_0x0087
        L_0x0049:
            long[] r4 = r4.f19137c
            r28 = r4[r15]
            long[][] r4 = r0.f15438r
            com.google.android.gms.internal.ads.wy2.m33436c(r4)
            long[][] r4 = (long[][]) r4
            r4 = r4[r3]
            r30 = r4[r15]
            long r28 = r28 - r16
            int r4 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0065
            int r4 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r4 = 0
            goto L_0x0066
        L_0x0065:
            r4 = 1
        L_0x0066:
            if (r4 != 0) goto L_0x006c
            if (r24 != 0) goto L_0x0074
            r12 = 0
            goto L_0x006e
        L_0x006c:
            r12 = r24
        L_0x006e:
            if (r4 != r12) goto L_0x007c
            int r15 = (r28 > r22 ? 1 : (r28 == r22 ? 0 : -1))
            if (r15 >= 0) goto L_0x007c
        L_0x0074:
            r5 = r3
            r24 = r4
            r22 = r28
            r25 = r30
            goto L_0x007e
        L_0x007c:
            r24 = r12
        L_0x007e:
            int r12 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r27 = r3
            r9 = r4
            r20 = r30
        L_0x0087:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x008a:
            int r3 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r3 == 0) goto L_0x009c
            if (r9 == 0) goto L_0x009c
            r3 = 10485760(0xa00000, double:5.180654E-317)
            long r20 = r20 + r3
            int r3 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r3 >= 0) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            r5 = r27
        L_0x009c:
            r0.f15432l = r5
            if (r5 != r8) goto L_0x00a2
            goto L_0x01b4
        L_0x00a2:
            com.google.android.gms.internal.ads.c1[] r3 = r0.f15437q
            com.google.android.gms.internal.ads.wy2.m33436c(r3)
            com.google.android.gms.internal.ads.c1[] r3 = (com.google.android.gms.internal.ads.C4950c1[]) r3
            int r4 = r0.f15432l
            r3 = r3[r4]
            com.google.android.gms.internal.ads.da4 r4 = r3.f14771c
            int r5 = r3.f14772d
            com.google.android.gms.internal.ads.l1 r9 = r3.f14770b
            long[] r12 = r9.f19137c
            r11 = r12[r5]
            int[] r9 = r9.f19138d
            r9 = r9[r5]
            long r16 = r11 - r16
            int r15 = r0.f15433m
            r19 = r9
            long r8 = (long) r15
            long r16 = r16 + r8
            int r8 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x01b1
            int r6 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x00ce
            goto L_0x01b1
        L_0x00ce:
            com.google.android.gms.internal.ads.i1 r2 = r3.f14769a
            int r2 = r2.f17848g
            if (r2 != r10) goto L_0x00dd
            r6 = 8
            long r16 = r16 + r6
            int r9 = r19 + -8
            r6 = r16
            goto L_0x00e1
        L_0x00dd:
            r6 = r16
            r9 = r19
        L_0x00e1:
            int r2 = (int) r6
            r1.mo19926d(r2)
            com.google.android.gms.internal.ads.i1 r2 = r3.f14769a
            int r6 = r2.f17851j
            if (r6 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.no2 r2 = r0.f15422b
            byte[] r2 = r2.mo19781h()
            r6 = 0
            r2[r6] = r6
            r2[r10] = r6
            r7 = 2
            r2[r7] = r6
            com.google.android.gms.internal.ads.i1 r6 = r3.f14769a
            int r6 = r6.f17851j
            int r7 = 4 - r6
        L_0x00ff:
            int r8 = r0.f15434n
            if (r8 >= r9) goto L_0x018b
            int r8 = r0.f15435o
            if (r8 != 0) goto L_0x0139
            r1.mo19930j(r2, r7, r6)
            int r8 = r0.f15433m
            int r8 = r8 + r6
            r0.f15433m = r8
            com.google.android.gms.internal.ads.no2 r8 = r0.f15422b
            r11 = 0
            r8.mo19779f(r11)
            com.google.android.gms.internal.ads.no2 r8 = r0.f15422b
            int r8 = r8.mo19786m()
            if (r8 < 0) goto L_0x0131
            r0.f15435o = r8
            com.google.android.gms.internal.ads.no2 r8 = r0.f15421a
            r8.mo19779f(r11)
            com.google.android.gms.internal.ads.no2 r8 = r0.f15421a
            r12 = 4
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r8, r12)
            int r8 = r0.f15434n
            int r8 = r8 + r12
            r0.f15434n = r8
            int r9 = r9 + r7
            goto L_0x00ff
        L_0x0131:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zza(r1, r2)
            throw r1
        L_0x0139:
            r11 = 0
            int r8 = com.google.android.gms.internal.ads.ba4.m21198a(r4, r1, r8, r11)
            int r11 = r0.f15433m
            int r11 = r11 + r8
            r0.f15433m = r11
            int r11 = r0.f15434n
            int r11 = r11 + r8
            r0.f15434n = r11
            int r11 = r0.f15435o
            int r11 = r11 - r8
            r0.f15435o = r11
            goto L_0x00ff
        L_0x014e:
            com.google.android.gms.internal.ads.w r2 = r2.f17847f
            java.lang.String r2 = r2.f25133l
            java.lang.String r6 = "audio/ac4"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0170
            int r2 = r0.f15434n
            if (r2 != 0) goto L_0x016e
            com.google.android.gms.internal.ads.no2 r2 = r0.f15423c
            com.google.android.gms.internal.ads.g84.m24212b(r9, r2)
            com.google.android.gms.internal.ads.no2 r2 = r0.f15423c
            r6 = 7
            com.google.android.gms.internal.ads.ba4.m21199b(r4, r2, r6)
            int r2 = r0.f15434n
            int r2 = r2 + r6
            r0.f15434n = r2
        L_0x016e:
            int r9 = r9 + 7
        L_0x0170:
            int r2 = r0.f15434n
            if (r2 >= r9) goto L_0x018b
            int r2 = r9 - r2
            r6 = 0
            int r2 = com.google.android.gms.internal.ads.ba4.m21198a(r4, r1, r2, r6)
            int r6 = r0.f15433m
            int r6 = r6 + r2
            r0.f15433m = r6
            int r6 = r0.f15434n
            int r6 = r6 + r2
            r0.f15434n = r6
            int r6 = r0.f15435o
            int r6 = r6 - r2
            r0.f15435o = r6
            goto L_0x0170
        L_0x018b:
            r22 = r9
            com.google.android.gms.internal.ads.l1 r1 = r3.f14770b
            long[] r2 = r1.f19140f
            r19 = r2[r5]
            int[] r1 = r1.f19141g
            r21 = r1[r5]
            r23 = 0
            r24 = 0
            r18 = r4
            r18.mo16889e(r19, r21, r22, r23, r24)
            int r1 = r3.f14772d
            int r1 = r1 + r10
            r3.f14772d = r1
            r1 = -1
            r0.f15432l = r1
            r1 = 0
            r0.f15433m = r1
            r0.f15434n = r1
            r0.f15435o = r1
            r8 = 0
            goto L_0x01b4
        L_0x01b1:
            r2.f25288a = r11
            r8 = 1
        L_0x01b4:
            return r8
        L_0x01b5:
            long r3 = r0.f15429i
            int r6 = r0.f15430j
            long r6 = (long) r6
            long r3 = r3 - r6
            long r6 = r33.zze()
            long r6 = r6 + r3
            com.google.android.gms.internal.ads.no2 r8 = r0.f15431k
            if (r8 == 0) goto L_0x0214
            byte[] r11 = r8.mo19781h()
            int r12 = r0.f15430j
            int r4 = (int) r3
            r1.mo19930j(r11, r12, r4)
            int r3 = r0.f15428h
            if (r3 != r5) goto L_0x01f9
            r8.mo19779f(r9)
            int r3 = r8.mo19786m()
            int r3 = m22280i(r3)
            if (r3 == 0) goto L_0x01e0
            goto L_0x01f6
        L_0x01e0:
            r3 = 4
            r8.mo19780g(r3)
        L_0x01e4:
            int r3 = r8.mo19782i()
            if (r3 <= 0) goto L_0x01f5
            int r3 = r8.mo19786m()
            int r3 = m22280i(r3)
            if (r3 == 0) goto L_0x01e4
            goto L_0x01f6
        L_0x01f5:
            r3 = 0
        L_0x01f6:
            r0.f15441u = r3
            goto L_0x021c
        L_0x01f9:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r3 = r0.f15425e
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x021c
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r3 = r0.f15425e
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.i0 r3 = (com.google.android.gms.internal.ads.C5172i0) r3
            com.google.android.gms.internal.ads.j0 r4 = new com.google.android.gms.internal.ads.j0
            int r5 = r0.f15428h
            r4.<init>(r5, r8)
            r3.mo18247f(r4)
            goto L_0x021c
        L_0x0214:
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x021e
            int r4 = (int) r3
            r1.mo19926d(r4)
        L_0x021c:
            r11 = 0
            goto L_0x0226
        L_0x021e:
            long r8 = r33.zze()
            long r8 = r8 + r3
            r2.f25288a = r8
            r11 = 1
        L_0x0226:
            r0.m22284m(r6)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.f15427g
            r4 = 2
            if (r3 == r4) goto L_0x0006
            return r10
        L_0x0231:
            int r3 = r0.f15430j
            if (r3 != 0) goto L_0x025b
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            byte[] r3 = r3.mo19781h()
            r4 = 0
            boolean r3 = r1.mo19927e(r3, r4, r9, r10)
            if (r3 != 0) goto L_0x0244
            r3 = -1
            return r3
        L_0x0244:
            r0.f15430j = r9
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            r3.mo19779f(r4)
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            long r3 = r3.mo19766A()
            r0.f15429i = r3
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            int r3 = r3.mo19786m()
            r0.f15428h = r3
        L_0x025b:
            long r3 = r0.f15429i
            r11 = 1
            int r8 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r8 != 0) goto L_0x027a
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            byte[] r3 = r3.mo19781h()
            r1.mo19930j(r3, r9, r9)
            int r3 = r0.f15430j
            int r3 = r3 + r9
            r0.f15430j = r3
            com.google.android.gms.internal.ads.no2 r3 = r0.f15424d
            long r3 = r3.mo19767B()
            r0.f15429i = r3
            goto L_0x02a3
        L_0x027a:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x02a3
            long r3 = r33.mo16584b()
            r6 = -1
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0294
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r8 = r0.f15425e
            java.lang.Object r8 = r8.peek()
            com.google.android.gms.internal.ads.i0 r8 = (com.google.android.gms.internal.ads.C5172i0) r8
            if (r8 == 0) goto L_0x0294
            long r3 = r8.f17827b
        L_0x0294:
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x02a3
            long r6 = r33.zze()
            long r3 = r3 - r6
            int r6 = r0.f15430j
            long r6 = (long) r6
            long r3 = r3 + r6
            r0.f15429i = r3
        L_0x02a3:
            long r3 = r0.f15429i
            int r6 = r0.f15430j
            long r7 = (long) r6
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x03c3
            int r3 = r0.f15428h
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r3 == r4) goto L_0x0371
            r4 = 1953653099(0x7472616b, float:7.681346E31)
            if (r3 == r4) goto L_0x0371
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r3 == r4) goto L_0x0371
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r3 == r4) goto L_0x0371
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r3 == r4) goto L_0x0371
            r4 = 1701082227(0x65647473, float:6.742798E22)
            if (r3 == r4) goto L_0x0371
            if (r3 != r7) goto L_0x02d3
            goto L_0x0371
        L_0x02d3:
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            if (r3 == r4) goto L_0x033e
            r4 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r3 == r4) goto L_0x033e
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 == r4) goto L_0x033e
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r3 == r4) goto L_0x033e
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r3 == r4) goto L_0x033e
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r3 == r4) goto L_0x033e
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r3 == r4) goto L_0x033e
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r3 == r4) goto L_0x033e
            if (r3 == r5) goto L_0x033e
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r3 == r4) goto L_0x033e
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r3 == r4) goto L_0x033e
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r3 != r4) goto L_0x032b
            goto L_0x033e
        L_0x032b:
            r33.zze()
            int r3 = r0.f15428h
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0337
            com.google.android.gms.internal.ads.zzaak r3 = new com.google.android.gms.internal.ads.zzaak
        L_0x0337:
            r3 = 0
            r0.f15431k = r3
            r0.f15427g = r10
            goto L_0x0006
        L_0x033e:
            if (r6 != r9) goto L_0x0342
            r3 = 1
            goto L_0x0343
        L_0x0342:
            r3 = 0
        L_0x0343:
            com.google.android.gms.internal.ads.gs1.m24488f(r3)
            long r3 = r0.f15429i
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0351
            r3 = 1
            goto L_0x0352
        L_0x0351:
            r3 = 0
        L_0x0352:
            com.google.android.gms.internal.ads.gs1.m24488f(r3)
            com.google.android.gms.internal.ads.no2 r3 = new com.google.android.gms.internal.ads.no2
            long r4 = r0.f15429i
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.no2 r4 = r0.f15424d
            byte[] r4 = r4.mo19781h()
            byte[] r5 = r3.mo19781h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.f15431k = r3
            r0.f15427g = r10
            goto L_0x0006
        L_0x0371:
            long r3 = r33.zze()
            long r5 = r0.f15429i
            int r8 = r0.f15430j
            long r10 = (long) r8
            long r3 = r3 + r5
            long r3 = r3 - r10
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03a4
            int r5 = r0.f15428h
            if (r5 != r7) goto L_0x03a4
            com.google.android.gms.internal.ads.no2 r5 = r0.f15423c
            r5.mo19776c(r9)
            com.google.android.gms.internal.ads.no2 r5 = r0.f15423c
            byte[] r5 = r5.mo19781h()
            r6 = 0
            r1.mo19931k(r5, r6, r9)
            com.google.android.gms.internal.ads.no2 r5 = r0.f15423c
            com.google.android.gms.internal.ads.C5505r0.m29803d(r5)
            com.google.android.gms.internal.ads.no2 r5 = r0.f15423c
            int r5 = r5.mo19784k()
            r1.mo19926d(r5)
            r33.mo19928h()
        L_0x03a4:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r5 = r0.f15425e
            com.google.android.gms.internal.ads.i0 r6 = new com.google.android.gms.internal.ads.i0
            int r7 = r0.f15428h
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.f15429i
            int r7 = r0.f15430j
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03be
            r0.m22284m(r3)
            goto L_0x0006
        L_0x03be:
            r32.m22283l()
            goto L_0x0006
        L_0x03c3:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.px r1 = com.google.android.gms.internal.ads.C5464px.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4987d1.mo16802d(com.google.android.gms.internal.ads.z84, com.google.android.gms.internal.ads.w94):int");
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f15436p = b94;
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        this.f15425e.clear();
        this.f15430j = 0;
        this.f15432l = -1;
        this.f15433m = 0;
        this.f15434n = 0;
        this.f15435o = 0;
        if (j == 0) {
            m22283l();
            return;
        }
        C4950c1[] c1VarArr = this.f15437q;
        if (c1VarArr != null) {
            for (C4950c1 c1Var : c1VarArr) {
                C5284l1 l1Var = c1Var.f14770b;
                int a = l1Var.mo19045a(j2);
                if (a == -1) {
                    a = l1Var.mo19046b(j2);
                }
                c1Var.f14772d = a;
            }
        }
    }

    public final long zze() {
        return this.f15440t;
    }
}
