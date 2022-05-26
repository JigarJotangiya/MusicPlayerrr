package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.y0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5764y0 implements y84 {

    /* renamed from: E */
    public static final f94 f26145E = C5579t0.f23668b;

    /* renamed from: F */
    private static final byte[] f26146F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final C5689w f26147G;

    /* renamed from: A */
    private b94 f26148A;

    /* renamed from: B */
    private da4[] f26149B;

    /* renamed from: C */
    private da4[] f26150C;

    /* renamed from: D */
    private boolean f26151D;

    /* renamed from: a */
    private final List<C5689w> f26152a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: b */
    private final SparseArray<C5690w0> f26153b;

    /* renamed from: c */
    private final no2 f26154c = new no2(df2.f15600a);

    /* renamed from: d */
    private final no2 f26155d = new no2(5);

    /* renamed from: e */
    private final no2 f26156e = new no2();

    /* renamed from: f */
    private final byte[] f26157f;

    /* renamed from: g */
    private final no2 f26158g;

    /* renamed from: h */
    private final hb4 f26159h = new hb4();

    /* renamed from: i */
    private final no2 f26160i = new no2(16);

    /* renamed from: j */
    private final ArrayDeque<C5172i0> f26161j;

    /* renamed from: k */
    private final ArrayDeque<C5653v0> f26162k;

    /* renamed from: l */
    private int f26163l;

    /* renamed from: m */
    private int f26164m;

    /* renamed from: n */
    private long f26165n;

    /* renamed from: o */
    private int f26166o;

    /* renamed from: p */
    private no2 f26167p;

    /* renamed from: q */
    private long f26168q;

    /* renamed from: r */
    private int f26169r;

    /* renamed from: s */
    private long f26170s;

    /* renamed from: t */
    private long f26171t;

    /* renamed from: u */
    private long f26172u;

    /* renamed from: v */
    private C5690w0 f26173v;

    /* renamed from: w */
    private int f26174w;

    /* renamed from: x */
    private int f26175x;

    /* renamed from: y */
    private int f26176y;

    /* renamed from: z */
    private boolean f26177z;

    static {
        jb4 jb4 = new jb4();
        jb4.mo18599s("application/x-emsg");
        f26147G = jb4.mo18605y();
    }

    public C5764y0(int i, tv2 tv2) {
        byte[] bArr = new byte[16];
        this.f26157f = bArr;
        this.f26158g = new no2(bArr);
        this.f26161j = new ArrayDeque<>();
        this.f26162k = new ArrayDeque<>();
        this.f26153b = new SparseArray<>();
        this.f26171t = -9223372036854775807L;
        this.f26170s = -9223372036854775807L;
        this.f26172u = -9223372036854775807L;
        this.f26148A = b94.f14380c;
        this.f26149B = new da4[0];
        this.f26150C = new da4[0];
    }

    /* renamed from: a */
    private static int m33931a(int i) throws C5464px {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw C5464px.zza(sb.toString(), (Throwable) null);
    }

    /* renamed from: c */
    private static zzs m33932c(List<C5209j0> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C5209j0 j0Var = list.get(i);
            if (j0Var.f18688a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = j0Var.f18291b.mo19781h();
                UUID a = C5061f1.m23416a(h);
                if (a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzr(a, (String) null, "video/mp4", h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzs((List<zzr>) arrayList);
    }

    /* renamed from: e */
    private final void m33933e() {
        this.f26163l = 0;
        this.f26166o = 0;
    }

    /* renamed from: g */
    private static void m33934g(no2 no2, int i, C5247k1 k1Var) throws C5464px {
        no2.mo19779f(i + 8);
        int m = no2.mo19786m() & 16777215;
        if ((m & 1) == 0) {
            boolean z = (m & 2) != 0;
            int v = no2.mo19795v();
            if (v == 0) {
                Arrays.fill(k1Var.f18705m, 0, k1Var.f18697e, false);
                return;
            }
            int i2 = k1Var.f18697e;
            if (v == i2) {
                Arrays.fill(k1Var.f18705m, 0, v, z);
                k1Var.mo18779b(no2.mo19782i());
                no2.mo19775b(k1Var.f18707o.mo19781h(), 0, k1Var.f18707o.mo19785l());
                k1Var.f18707o.mo19779f(0);
                k1Var.f18708p = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(v);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw C5464px.zza(sb.toString(), (Throwable) null);
        }
        throw C5464px.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x032b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m33935i(long r48) throws com.google.android.gms.internal.ads.C5464px {
        /*
            r47 = this;
            r0 = r47
        L_0x0002:
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f26161j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0703
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f26161j
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.i0 r1 = (com.google.android.gms.internal.ads.C5172i0) r1
            long r1 = r1.f17827b
            int r3 = (r1 > r48 ? 1 : (r1 == r48 ? 0 : -1))
            if (r3 != 0) goto L_0x0703
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r1 = r0.f26161j
            java.lang.Object r1 = r1.pop()
            r2 = r1
            com.google.android.gms.internal.ads.i0 r2 = (com.google.android.gms.internal.ads.C5172i0) r2
            int r1 = r2.f18688a
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r6 = 12
            r7 = 8
            if (r1 != r3) goto L_0x013d
            java.util.List<com.google.android.gms.internal.ads.j0> r1 = r2.f17828c
            com.google.android.gms.internal.ads.zzs r1 = m33932c(r1)
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            com.google.android.gms.internal.ads.i0 r3 = r2.mo18244c(r3)
            java.util.Objects.requireNonNull(r3)
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            java.util.List<com.google.android.gms.internal.ads.j0> r8 = r3.f17828c
            int r8 = r8.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
        L_0x004d:
            if (r9 >= r8) goto L_0x00b8
            java.util.List<com.google.android.gms.internal.ads.j0> r13 = r3.f17828c
            java.lang.Object r13 = r13.get(r9)
            com.google.android.gms.internal.ads.j0 r13 = (com.google.android.gms.internal.ads.C5209j0) r13
            int r14 = r13.f18688a
            r15 = 1953654136(0x74726578, float:7.6818474E31)
            if (r14 != r15) goto L_0x0096
            com.google.android.gms.internal.ads.no2 r13 = r13.f18291b
            r13.mo19779f(r6)
            int r14 = r13.mo19786m()
            int r15 = r13.mo19786m()
            int r10 = r13.mo19786m()
            int r6 = r13.mo19786m()
            int r13 = r13.mo19786m()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            com.google.android.gms.internal.ads.s0 r11 = new com.google.android.gms.internal.ads.s0
            int r15 = r15 + -1
            r11.<init>(r15, r10, r6, r13)
            android.util.Pair r6 = android.util.Pair.create(r14, r11)
            java.lang.Object r10 = r6.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r6 = r6.second
            com.google.android.gms.internal.ads.s0 r6 = (com.google.android.gms.internal.ads.C5542s0) r6
            r12.put(r10, r6)
            goto L_0x00b3
        L_0x0096:
            r6 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r14 != r6) goto L_0x00b3
            com.google.android.gms.internal.ads.no2 r4 = r13.f18291b
            r4.mo19779f(r7)
            int r5 = r4.mo19786m()
            int r5 = com.google.android.gms.internal.ads.C5246k0.m26039a(r5)
            if (r5 != 0) goto L_0x00af
            long r4 = r4.mo19766A()
            goto L_0x00b3
        L_0x00af:
            long r4 = r4.mo19767B()
        L_0x00b3:
            int r9 = r9 + 1
            r6 = 12
            goto L_0x004d
        L_0x00b8:
            com.google.android.gms.internal.ads.p94 r3 = new com.google.android.gms.internal.ads.p94
            r3.<init>()
            com.google.android.gms.internal.ads.u0 r9 = new com.google.android.gms.internal.ads.u0
            r9.<init>(r0)
            r7 = 0
            r8 = 0
            r6 = r1
            java.util.List r1 = com.google.android.gms.internal.ads.C5505r0.m29802c(r2, r3, r4, r6, r7, r8, r9)
            int r2 = r1.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f26153b
            int r3 = r3.size()
            if (r3 != 0) goto L_0x010e
            r10 = 0
        L_0x00d6:
            if (r10 >= r2) goto L_0x0107
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.l1 r3 = (com.google.android.gms.internal.ads.C5284l1) r3
            com.google.android.gms.internal.ads.i1 r4 = r3.f19135a
            com.google.android.gms.internal.ads.w0 r5 = new com.google.android.gms.internal.ads.w0
            com.google.android.gms.internal.ads.b94 r6 = r0.f26148A
            int r7 = r4.f17843b
            com.google.android.gms.internal.ads.da4 r6 = r6.mo15724s(r10, r7)
            int r7 = r4.f17842a
            com.google.android.gms.internal.ads.s0 r7 = m33936j(r12, r7)
            r5.<init>(r6, r3, r7)
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f26153b
            int r6 = r4.f17842a
            r3.put(r6, r5)
            long r5 = r0.f26171t
            long r3 = r4.f17846e
            long r3 = java.lang.Math.max(r5, r3)
            r0.f26171t = r3
            int r10 = r10 + 1
            goto L_0x00d6
        L_0x0107:
            com.google.android.gms.internal.ads.b94 r1 = r0.f26148A
            r1.mo15722I()
            goto L_0x0002
        L_0x010e:
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r3 = r0.f26153b
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0118
            r11 = 1
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            com.google.android.gms.internal.ads.gs1.m24488f(r11)
            r10 = 0
        L_0x011d:
            if (r10 >= r2) goto L_0x0002
            java.lang.Object r3 = r1.get(r10)
            com.google.android.gms.internal.ads.l1 r3 = (com.google.android.gms.internal.ads.C5284l1) r3
            com.google.android.gms.internal.ads.i1 r4 = r3.f19135a
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r5 = r0.f26153b
            int r6 = r4.f17842a
            java.lang.Object r5 = r5.get(r6)
            com.google.android.gms.internal.ads.w0 r5 = (com.google.android.gms.internal.ads.C5690w0) r5
            int r4 = r4.f17842a
            com.google.android.gms.internal.ads.s0 r4 = m33936j(r12, r4)
            r5.mo21669h(r3, r4)
            int r10 = r10 + 1
            goto L_0x011d
        L_0x013d:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 != r3) goto L_0x06eb
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r0.f26153b
            byte[] r3 = r0.f26157f
            java.util.List<com.google.android.gms.internal.ads.i0> r6 = r2.f17829d
            int r6 = r6.size()
            r8 = 0
        L_0x014d:
            if (r8 >= r6) goto L_0x0654
            java.util.List<com.google.android.gms.internal.ads.i0> r10 = r2.f17829d
            java.lang.Object r10 = r10.get(r8)
            com.google.android.gms.internal.ads.i0 r10 = (com.google.android.gms.internal.ads.C5172i0) r10
            int r11 = r10.f18688a
            r12 = 1953653094(0x74726166, float:7.6813435E31)
            if (r11 != r12) goto L_0x0635
            r11 = 1952868452(0x74666864, float:7.301914E31)
            com.google.android.gms.internal.ads.j0 r11 = r10.mo18245d(r11)
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.ads.no2 r11 = r11.f18291b
            r11.mo19779f(r7)
            int r12 = r11.mo19786m()
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            int r14 = r11.mo19786m()
            java.lang.Object r14 = r1.get(r14)
            com.google.android.gms.internal.ads.w0 r14 = (com.google.android.gms.internal.ads.C5690w0) r14
            if (r14 != 0) goto L_0x0183
            r14 = 0
            goto L_0x01cc
        L_0x0183:
            r15 = r12 & 1
            if (r15 == 0) goto L_0x0191
            long r4 = r11.mo19767B()
            com.google.android.gms.internal.ads.k1 r15 = r14.f25149b
            r15.f18694b = r4
            r15.f18695c = r4
        L_0x0191:
            com.google.android.gms.internal.ads.s0 r4 = r14.f25152e
            r5 = r12 & 2
            if (r5 == 0) goto L_0x019e
            int r5 = r11.mo19786m()
            int r5 = r5 + -1
            goto L_0x01a0
        L_0x019e:
            int r5 = r4.f23280a
        L_0x01a0:
            r15 = r12 & 8
            if (r15 == 0) goto L_0x01a9
            int r15 = r11.mo19786m()
            goto L_0x01ab
        L_0x01a9:
            int r15 = r4.f23281b
        L_0x01ab:
            r16 = r12 & 16
            if (r16 == 0) goto L_0x01b6
            int r16 = r11.mo19786m()
            r9 = r16
            goto L_0x01b8
        L_0x01b6:
            int r9 = r4.f23282c
        L_0x01b8:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x01c1
            int r4 = r11.mo19786m()
            goto L_0x01c3
        L_0x01c1:
            int r4 = r4.f23283d
        L_0x01c3:
            com.google.android.gms.internal.ads.k1 r11 = r14.f25149b
            com.google.android.gms.internal.ads.s0 r12 = new com.google.android.gms.internal.ads.s0
            r12.<init>(r5, r15, r9, r4)
            r11.f18693a = r12
        L_0x01cc:
            if (r14 != 0) goto L_0x01d0
            goto L_0x0635
        L_0x01d0:
            com.google.android.gms.internal.ads.k1 r4 = r14.f25149b
            long r11 = r4.f18709q
            boolean r5 = r4.f18710r
            r14.mo21670i()
            r9 = 1
            r14.f25159l = true
            r15 = 1952867444(0x74666474, float:7.3014264E31)
            com.google.android.gms.internal.ads.j0 r15 = r10.mo18245d(r15)
            if (r15 == 0) goto L_0x0203
            com.google.android.gms.internal.ads.no2 r5 = r15.f18291b
            r5.mo19779f(r7)
            int r11 = r5.mo19786m()
            int r11 = com.google.android.gms.internal.ads.C5246k0.m26039a(r11)
            if (r11 != r9) goto L_0x01fa
            long r11 = r5.mo19767B()
            goto L_0x01fe
        L_0x01fa:
            long r11 = r5.mo19766A()
        L_0x01fe:
            r4.f18709q = r11
            r4.f18710r = r9
            goto L_0x0207
        L_0x0203:
            r4.f18709q = r11
            r4.f18710r = r5
        L_0x0207:
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f17828c
            int r9 = r5.size()
            r11 = 0
            r12 = 0
            r15 = 0
        L_0x0210:
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            if (r11 >= r9) goto L_0x023a
            java.lang.Object r18 = r5.get(r11)
            r7 = r18
            com.google.android.gms.internal.ads.j0 r7 = (com.google.android.gms.internal.ads.C5209j0) r7
            r18 = r1
            int r1 = r7.f18688a
            if (r1 != r13) goto L_0x0233
            com.google.android.gms.internal.ads.no2 r1 = r7.f18291b
            r7 = 12
            r1.mo19779f(r7)
            int r1 = r1.mo19795v()
            if (r1 <= 0) goto L_0x0233
            int r15 = r15 + r1
            int r12 = r12 + 1
        L_0x0233:
            int r11 = r11 + 1
            r1 = r18
            r7 = 8
            goto L_0x0210
        L_0x023a:
            r18 = r1
            r1 = 0
            r14.f25155h = r1
            r14.f25154g = r1
            r14.f25153f = r1
            com.google.android.gms.internal.ads.k1 r1 = r14.f25149b
            r1.f18696d = r12
            r1.f18697e = r15
            int[] r7 = r1.f18699g
            int r7 = r7.length
            if (r7 >= r12) goto L_0x0256
            long[] r7 = new long[r12]
            r1.f18698f = r7
            int[] r7 = new int[r12]
            r1.f18699g = r7
        L_0x0256:
            int[] r7 = r1.f18700h
            int r7 = r7.length
            if (r7 >= r15) goto L_0x0273
            int r15 = r15 * 125
            int r15 = r15 / 100
            int[] r7 = new int[r15]
            r1.f18700h = r7
            int[] r7 = new int[r15]
            r1.f18701i = r7
            long[] r7 = new long[r15]
            r1.f18702j = r7
            boolean[] r7 = new boolean[r15]
            r1.f18703k = r7
            boolean[] r7 = new boolean[r15]
            r1.f18705m = r7
        L_0x0273:
            r1 = 0
            r7 = 0
            r11 = 0
        L_0x0276:
            r19 = 0
            if (r1 >= r9) goto L_0x0403
            java.lang.Object r15 = r5.get(r1)
            com.google.android.gms.internal.ads.j0 r15 = (com.google.android.gms.internal.ads.C5209j0) r15
            int r12 = r15.f18688a
            if (r12 != r13) goto L_0x03d2
            int r12 = r11 + 1
            com.google.android.gms.internal.ads.no2 r15 = r15.f18291b
            r13 = 8
            r15.mo19779f(r13)
            int r13 = r15.mo19786m()
            r17 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r17
            r21 = r5
            com.google.android.gms.internal.ads.l1 r5 = r14.f25151d
            com.google.android.gms.internal.ads.i1 r5 = r5.f19135a
            r22 = r6
            com.google.android.gms.internal.ads.k1 r6 = r14.f25149b
            r23 = r9
            com.google.android.gms.internal.ads.s0 r9 = r6.f18693a
            int r24 = com.google.android.gms.internal.ads.wy2.f25579a
            r25 = r12
            int[] r12 = r6.f18699g
            int r24 = r15.mo19795v()
            r12[r11] = r24
            long[] r12 = r6.f18698f
            r24 = r2
            r26 = r3
            long r2 = r6.f18694b
            r12[r11] = r2
            r27 = r13 & 1
            if (r27 == 0) goto L_0x02c9
            int r0 = r15.mo19786m()
            r27 = r1
            long r0 = (long) r0
            long r2 = r2 + r0
            r12[r11] = r2
            goto L_0x02cb
        L_0x02c9:
            r27 = r1
        L_0x02cb:
            r0 = r13 & 4
            int r1 = r9.f23283d
            if (r0 == 0) goto L_0x02d5
            int r1 = r15.mo19786m()
        L_0x02d5:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r3 = r13 & 512(0x200, float:7.175E-43)
            r12 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            r28 = r1
            long[] r1 = r5.f17849h
            if (r1 == 0) goto L_0x0309
            r29 = r8
            int r8 = r1.length
            r30 = r10
            r10 = 1
            if (r8 != r10) goto L_0x030d
            r8 = 0
            r31 = r1[r8]
            int r1 = (r31 > r19 ? 1 : (r31 == r19 ? 0 : -1))
            if (r1 != 0) goto L_0x030d
            long[] r1 = r5.f17850i
            com.google.android.gms.internal.ads.wy2.m33436c(r1)
            long[] r1 = (long[]) r1
            r31 = r1[r8]
            r33 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r13
            r1 = r14
            long r13 = r5.f17844c
            r35 = r13
            long r19 = com.google.android.gms.internal.ads.wy2.m33431Z(r31, r33, r35)
            goto L_0x030f
        L_0x0309:
            r29 = r8
            r30 = r10
        L_0x030d:
            r8 = r13
            r1 = r14
        L_0x030f:
            int[] r10 = r6.f18700h
            int[] r13 = r6.f18701i
            long[] r14 = r6.f18702j
            r31 = r4
            boolean[] r4 = r6.f18703k
            r32 = r4
            int[] r4 = r6.f18699g
            r4 = r4[r11]
            int r4 = r4 + r7
            r39 = r10
            long r10 = r5.f17844c
            r5 = r13
            r40 = r14
            long r13 = r6.f18709q
        L_0x0329:
            if (r7 >= r4) goto L_0x03c9
            if (r2 == 0) goto L_0x0336
            int r33 = r15.mo19786m()
            r41 = r2
            r2 = r33
            goto L_0x033a
        L_0x0336:
            r41 = r2
            int r2 = r9.f23281b
        L_0x033a:
            m33931a(r2)
            if (r3 == 0) goto L_0x0348
            int r33 = r15.mo19786m()
            r42 = r3
            r3 = r33
            goto L_0x034c
        L_0x0348:
            r42 = r3
            int r3 = r9.f23282c
        L_0x034c:
            m33931a(r3)
            if (r12 == 0) goto L_0x035a
            int r33 = r15.mo19786m()
            r43 = r0
            r0 = r33
            goto L_0x0367
        L_0x035a:
            r43 = r0
            if (r7 != 0) goto L_0x0365
            if (r0 == 0) goto L_0x0364
            r0 = r28
            r7 = 0
            goto L_0x0367
        L_0x0364:
            r7 = 0
        L_0x0365:
            int r0 = r9.f23283d
        L_0x0367:
            if (r8 == 0) goto L_0x037e
            r44 = r4
            int r4 = r15.mo19786m()
            r46 = r8
            r45 = r9
            long r8 = (long) r4
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r33
            long r8 = r8 / r10
            int r4 = (int) r8
            r5[r7] = r4
            goto L_0x0387
        L_0x037e:
            r44 = r4
            r46 = r8
            r45 = r9
            r4 = 0
            r5[r7] = r4
        L_0x0387:
            r35 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r13
            r37 = r10
            long r8 = com.google.android.gms.internal.ads.wy2.m33431Z(r33, r35, r37)
            long r8 = r8 - r19
            r40[r7] = r8
            boolean r4 = r6.f18710r
            if (r4 != 0) goto L_0x03a4
            com.google.android.gms.internal.ads.l1 r4 = r1.f25151d
            r33 = r5
            long r4 = r4.f19142h
            long r8 = r8 + r4
            r40[r7] = r8
            goto L_0x03a6
        L_0x03a4:
            r33 = r5
        L_0x03a6:
            r39[r7] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03b2
            r0 = 0
            goto L_0x03b3
        L_0x03b2:
            r0 = 1
        L_0x03b3:
            r32[r7] = r0
            long r2 = (long) r2
            long r13 = r13 + r2
            int r7 = r7 + 1
            r5 = r33
            r2 = r41
            r3 = r42
            r0 = r43
            r4 = r44
            r9 = r45
            r8 = r46
            goto L_0x0329
        L_0x03c9:
            r44 = r4
            r6.f18709q = r13
            r11 = r25
            r7 = r44
            goto L_0x03e8
        L_0x03d2:
            r27 = r1
            r24 = r2
            r26 = r3
            r31 = r4
            r21 = r5
            r22 = r6
            r29 = r8
            r23 = r9
            r30 = r10
            r1 = r14
            r17 = 16777215(0xffffff, float:2.3509886E-38)
        L_0x03e8:
            int r0 = r27 + 1
            r14 = r1
            r5 = r21
            r6 = r22
            r9 = r23
            r2 = r24
            r3 = r26
            r8 = r29
            r10 = r30
            r4 = r31
            r13 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r0
            r0 = r47
            goto L_0x0276
        L_0x0403:
            r24 = r2
            r26 = r3
            r31 = r4
            r22 = r6
            r29 = r8
            r30 = r10
            r1 = r14
            com.google.android.gms.internal.ads.l1 r0 = r1.f25151d
            com.google.android.gms.internal.ads.i1 r0 = r0.f19135a
            r1 = r31
            com.google.android.gms.internal.ads.s0 r2 = r1.f18693a
            java.util.Objects.requireNonNull(r2)
            int r2 = r2.f23280a
            com.google.android.gms.internal.ads.j1 r0 = r0.mo18251a(r2)
            r2 = 1935763834(0x7361697a, float:1.785898E31)
            r10 = r30
            com.google.android.gms.internal.ads.j0 r2 = r10.mo18245d(r2)
            if (r2 == 0) goto L_0x04a3
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.no2 r2 = r2.f18291b
            int r3 = r0.f18300d
            r4 = 8
            r2.mo19779f(r4)
            int r5 = r2.mo19786m()
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0443
            r2.mo19780g(r4)
        L_0x0443:
            int r4 = r2.mo19792s()
            int r5 = r2.mo19795v()
            int r6 = r1.f18697e
            if (r5 > r6) goto L_0x0482
            if (r4 != 0) goto L_0x0468
            boolean[] r4 = r1.f18705m
            r6 = 0
            r7 = 0
        L_0x0455:
            if (r6 >= r5) goto L_0x0466
            int r8 = r2.mo19792s()
            int r7 = r7 + r8
            if (r8 <= r3) goto L_0x0460
            r8 = 1
            goto L_0x0461
        L_0x0460:
            r8 = 0
        L_0x0461:
            r4[r6] = r8
            int r6 = r6 + 1
            goto L_0x0455
        L_0x0466:
            r4 = 0
            goto L_0x0475
        L_0x0468:
            if (r4 <= r3) goto L_0x046c
            r2 = 1
            goto L_0x046d
        L_0x046c:
            r2 = 0
        L_0x046d:
            int r7 = r4 * r5
            boolean[] r3 = r1.f18705m
            r4 = 0
            java.util.Arrays.fill(r3, r4, r5, r2)
        L_0x0475:
            boolean[] r2 = r1.f18705m
            int r3 = r1.f18697e
            java.util.Arrays.fill(r2, r5, r3, r4)
            if (r7 <= 0) goto L_0x04a3
            r1.mo18779b(r7)
            goto L_0x04a3
        L_0x0482:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 78
            r0.<init>(r1)
            java.lang.String r1 = "Saiz sample count "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = " is greater than fragment sample count"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r1)
            throw r0
        L_0x04a3:
            r2 = 1935763823(0x7361696f, float:1.7858967E31)
            com.google.android.gms.internal.ads.j0 r2 = r10.mo18245d(r2)
            if (r2 == 0) goto L_0x04f3
            com.google.android.gms.internal.ads.no2 r2 = r2.f18291b
            r3 = 8
            r2.mo19779f(r3)
            int r4 = r2.mo19786m()
            r5 = r4 & 1
            r6 = 1
            if (r5 != r6) goto L_0x04bf
            r2.mo19780g(r3)
        L_0x04bf:
            int r3 = r2.mo19795v()
            if (r3 != r6) goto L_0x04da
            long r5 = r1.f18695c
            int r3 = com.google.android.gms.internal.ads.C5246k0.m26039a(r4)
            if (r3 != 0) goto L_0x04d2
            long r2 = r2.mo19766A()
            goto L_0x04d6
        L_0x04d2:
            long r2 = r2.mo19767B()
        L_0x04d6:
            long r5 = r5 + r2
            r1.f18695c = r5
            goto L_0x04f3
        L_0x04da:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 40
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected saio entry count: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2 = 0
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zza(r0, r2)
            throw r0
        L_0x04f3:
            r2 = 0
            r3 = 1936027235(0x73656e63, float:1.8177412E31)
            com.google.android.gms.internal.ads.j0 r3 = r10.mo18245d(r3)
            if (r3 == 0) goto L_0x0503
            com.google.android.gms.internal.ads.no2 r3 = r3.f18291b
            r4 = 0
            m33934g(r3, r4, r1)
        L_0x0503:
            if (r0 == 0) goto L_0x050a
            java.lang.String r0 = r0.f18298b
            r32 = r0
            goto L_0x050c
        L_0x050a:
            r32 = r2
        L_0x050c:
            r0 = r2
            r3 = r0
            r4 = 0
        L_0x050f:
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f17828c
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x054c
            java.util.List<com.google.android.gms.internal.ads.j0> r5 = r10.f17828c
            java.lang.Object r5 = r5.get(r4)
            com.google.android.gms.internal.ads.j0 r5 = (com.google.android.gms.internal.ads.C5209j0) r5
            com.google.android.gms.internal.ads.no2 r6 = r5.f18291b
            int r5 = r5.f18688a
            r7 = 1935828848(0x73626770, float:1.7937577E31)
            r8 = 1936025959(0x73656967, float:1.817587E31)
            if (r5 != r7) goto L_0x0538
            r7 = 12
            r6.mo19779f(r7)
            int r5 = r6.mo19786m()
            if (r5 != r8) goto L_0x0549
            r0 = r6
            goto L_0x0549
        L_0x0538:
            r7 = 12
            r9 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 != r9) goto L_0x0549
            r6.mo19779f(r7)
            int r5 = r6.mo19786m()
            if (r5 != r8) goto L_0x0549
            r3 = r6
        L_0x0549:
            int r4 = r4 + 1
            goto L_0x050f
        L_0x054c:
            r7 = 12
            if (r0 == 0) goto L_0x05ef
            if (r3 != 0) goto L_0x0554
            goto L_0x05ef
        L_0x0554:
            r4 = 8
            r0.mo19779f(r4)
            int r5 = r0.mo19786m()
            r6 = 4
            r0.mo19780g(r6)
            int r5 = com.google.android.gms.internal.ads.C5246k0.m26039a(r5)
            r8 = 1
            if (r5 != r8) goto L_0x056b
            r0.mo19780g(r6)
        L_0x056b:
            int r0 = r0.mo19786m()
            if (r0 != r8) goto L_0x05e8
            r3.mo19779f(r4)
            int r0 = r3.mo19786m()
            int r0 = com.google.android.gms.internal.ads.C5246k0.m26039a(r0)
            r3.mo19780g(r6)
            if (r0 != r8) goto L_0x0591
            long r4 = r3.mo19766A()
            int r0 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x058a
            goto L_0x0597
        L_0x058a:
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zzc(r0)
            throw r0
        L_0x0591:
            r4 = 2
            if (r0 < r4) goto L_0x0597
            r3.mo19780g(r6)
        L_0x0597:
            long r4 = r3.mo19766A()
            r8 = 1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x05e1
            r0 = 1
            r3.mo19780g(r0)
            int r4 = r3.mo19792s()
            r5 = r4 & 240(0xf0, float:3.36E-43)
            int r35 = r5 >> 4
            r36 = r4 & 15
            int r4 = r3.mo19792s()
            if (r4 != r0) goto L_0x05f0
            int r33 = r3.mo19792s()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r3.mo19775b(r5, r6, r4)
            if (r33 != 0) goto L_0x05cf
            int r2 = r3.mo19792s()
            byte[] r9 = new byte[r2]
            r3.mo19775b(r9, r6, r2)
            r37 = r9
            goto L_0x05d1
        L_0x05cf:
            r37 = r2
        L_0x05d1:
            r1.f18704l = r0
            com.google.android.gms.internal.ads.j1 r2 = new com.google.android.gms.internal.ads.j1
            r31 = 1
            r30 = r2
            r34 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)
            r1.f18706n = r2
            goto L_0x05f0
        L_0x05e1:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zzc(r0)
            throw r0
        L_0x05e8:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            com.google.android.gms.internal.ads.px r0 = com.google.android.gms.internal.ads.C5464px.zzc(r0)
            throw r0
        L_0x05ef:
            r0 = 1
        L_0x05f0:
            java.util.List<com.google.android.gms.internal.ads.j0> r2 = r10.f17828c
            int r2 = r2.size()
            r3 = 0
        L_0x05f7:
            if (r3 >= r2) goto L_0x062f
            java.util.List<com.google.android.gms.internal.ads.j0> r4 = r10.f17828c
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.j0 r4 = (com.google.android.gms.internal.ads.C5209j0) r4
            int r5 = r4.f18688a
            r6 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 != r6) goto L_0x0623
            com.google.android.gms.internal.ads.no2 r4 = r4.f18291b
            r5 = 8
            r4.mo19779f(r5)
            r8 = r26
            r6 = 0
            r9 = 16
            r4.mo19775b(r8, r6, r9)
            byte[] r11 = f26146F
            boolean r11 = java.util.Arrays.equals(r8, r11)
            if (r11 == 0) goto L_0x062a
            m33934g(r4, r9, r1)
            goto L_0x062a
        L_0x0623:
            r8 = r26
            r5 = 8
            r6 = 0
            r9 = 16
        L_0x062a:
            int r3 = r3 + 1
            r26 = r8
            goto L_0x05f7
        L_0x062f:
            r8 = r26
            r5 = 8
            r6 = 0
            goto L_0x0644
        L_0x0635:
            r18 = r1
            r24 = r2
            r22 = r6
            r29 = r8
            r0 = 1
            r5 = 8
            r6 = 0
            r7 = 12
            r8 = r3
        L_0x0644:
            int r1 = r29 + 1
            r0 = r47
            r3 = r8
            r6 = r22
            r2 = r24
            r7 = 8
            r8 = r1
            r1 = r18
            goto L_0x014d
        L_0x0654:
            r1 = r2
            r2 = 0
            r6 = 0
            java.util.List<com.google.android.gms.internal.ads.j0> r0 = r1.f17828c
            com.google.android.gms.internal.ads.zzs r0 = m33932c(r0)
            r3 = r47
            if (r0 == 0) goto L_0x06a5
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r3.f26153b
            int r1 = r1.size()
            r4 = 0
        L_0x0668:
            if (r4 >= r1) goto L_0x06a5
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r5 = r3.f26153b
            java.lang.Object r5 = r5.valueAt(r4)
            com.google.android.gms.internal.ads.w0 r5 = (com.google.android.gms.internal.ads.C5690w0) r5
            com.google.android.gms.internal.ads.l1 r7 = r5.f25151d
            com.google.android.gms.internal.ads.i1 r7 = r7.f19135a
            com.google.android.gms.internal.ads.k1 r8 = r5.f25149b
            com.google.android.gms.internal.ads.s0 r8 = r8.f18693a
            int r9 = com.google.android.gms.internal.ads.wy2.f25579a
            int r8 = r8.f23280a
            com.google.android.gms.internal.ads.j1 r7 = r7.mo18251a(r8)
            if (r7 == 0) goto L_0x0687
            java.lang.String r7 = r7.f18298b
            goto L_0x0688
        L_0x0687:
            r7 = r2
        L_0x0688:
            com.google.android.gms.internal.ads.zzs r7 = r0.mo22601a(r7)
            com.google.android.gms.internal.ads.l1 r8 = r5.f25151d
            com.google.android.gms.internal.ads.i1 r8 = r8.f19135a
            com.google.android.gms.internal.ads.w r8 = r8.f17847f
            com.google.android.gms.internal.ads.jb4 r8 = r8.mo21657b()
            r8.mo18576b(r7)
            com.google.android.gms.internal.ads.w r7 = r8.mo18605y()
            com.google.android.gms.internal.ads.da4 r5 = r5.f25148a
            r5.mo16885a(r7)
            int r4 = r4 + 1
            goto L_0x0668
        L_0x06a5:
            long r0 = r3.f26170s
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0700
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r0 = r3.f26153b
            int r0 = r0.size()
            r10 = 0
        L_0x06b7:
            if (r10 >= r0) goto L_0x06e3
            android.util.SparseArray<com.google.android.gms.internal.ads.w0> r1 = r3.f26153b
            java.lang.Object r1 = r1.valueAt(r10)
            com.google.android.gms.internal.ads.w0 r1 = (com.google.android.gms.internal.ads.C5690w0) r1
            long r4 = r3.f26170s
            int r2 = r1.f25153f
        L_0x06c5:
            com.google.android.gms.internal.ads.k1 r6 = r1.f25149b
            int r7 = r6.f18697e
            if (r2 >= r7) goto L_0x06e0
            long r6 = r6.mo18778a(r2)
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x06e0
            com.google.android.gms.internal.ads.k1 r6 = r1.f25149b
            boolean[] r6 = r6.f18703k
            boolean r6 = r6[r2]
            if (r6 == 0) goto L_0x06dd
            r1.f25156i = r2
        L_0x06dd:
            int r2 = r2 + 1
            goto L_0x06c5
        L_0x06e0:
            int r10 = r10 + 1
            goto L_0x06b7
        L_0x06e3:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f26170s = r1
            goto L_0x0700
        L_0x06eb:
            r3 = r0
            r1 = r2
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r0 = r3.f26161j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0700
            java.util.ArrayDeque<com.google.android.gms.internal.ads.i0> r0 = r3.f26161j
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.i0 r0 = (com.google.android.gms.internal.ads.C5172i0) r0
            r0.mo18246e(r1)
        L_0x0700:
            r0 = r3
            goto L_0x0002
        L_0x0703:
            r3 = r0
            r47.m33933e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5764y0.m33935i(long):void");
    }

    /* renamed from: j */
    private static final C5542s0 m33936j(SparseArray<C5542s0> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C5542s0 s0Var = sparseArray.get(i);
        Objects.requireNonNull(s0Var);
        return s0Var;
    }

    /* renamed from: b */
    public final boolean mo16801b(z84 z84) throws IOException {
        return C5136h1.m24621a(z84);
    }

    /* renamed from: d */
    public final int mo16802d(z84 z84, w94 w94) throws IOException {
        byte b;
        boolean z;
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        long j5;
        long j6;
        C5690w0 w0Var;
        int i;
        boolean z2;
        int i2;
        z84 z842 = z84;
        while (true) {
            int i3 = this.f26163l;
            b = 1;
            z = false;
            if (i3 == 0) {
                if (this.f26166o == 0) {
                    if (!z842.mo19927e(this.f26160i.mo19781h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f26166o = 8;
                    this.f26160i.mo19779f(0);
                    this.f26165n = this.f26160i.mo19766A();
                    this.f26164m = this.f26160i.mo19786m();
                }
                long j7 = this.f26165n;
                if (j7 == 1) {
                    ((t84) z842).mo19927e(this.f26160i.mo19781h(), 8, 8, false);
                    this.f26166o += 8;
                    this.f26165n = this.f26160i.mo19767B();
                } else if (j7 == 0) {
                    long b2 = z84.mo16584b();
                    if (b2 == -1 && !this.f26161j.isEmpty()) {
                        b2 = this.f26161j.peek().f17827b;
                    }
                    if (b2 != -1) {
                        this.f26165n = (b2 - z84.zze()) + ((long) this.f26166o);
                    }
                }
                if (this.f26165n >= ((long) this.f26166o)) {
                    long zze = z84.zze() - ((long) this.f26166o);
                    int i4 = this.f26164m;
                    if ((i4 == 1836019558 || i4 == 1835295092) && !this.f26151D) {
                        this.f26148A.mo15723r(new y94(this.f26171t, zze));
                        this.f26151D = true;
                    }
                    if (this.f26164m == 1836019558) {
                        int size = this.f26153b.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            C5247k1 k1Var = this.f26153b.valueAt(i5).f25149b;
                            k1Var.f18695c = zze;
                            k1Var.f18694b = zze;
                        }
                    }
                    int i6 = this.f26164m;
                    if (i6 == 1835295092) {
                        this.f26173v = null;
                        this.f26168q = zze + this.f26165n;
                        this.f26163l = 2;
                    } else if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1836019558 || i6 == 1953653094 || i6 == 1836475768 || i6 == 1701082227) {
                        long zze2 = (z84.zze() + this.f26165n) - 8;
                        this.f26161j.push(new C5172i0(this.f26164m, zze2));
                        if (this.f26165n == ((long) this.f26166o)) {
                            m33935i(zze2);
                        } else {
                            m33933e();
                        }
                    } else if (i6 == 1751411826 || i6 == 1835296868 || i6 == 1836476516 || i6 == 1936286840 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1668576371 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1937011571 || i6 == 1952867444 || i6 == 1952868452 || i6 == 1953196132 || i6 == 1953654136 || i6 == 1953658222 || i6 == 1886614376 || i6 == 1935763834 || i6 == 1935763823 || i6 == 1936027235 || i6 == 1970628964 || i6 == 1935828848 || i6 == 1936158820 || i6 == 1701606260 || i6 == 1835362404 || i6 == 1701671783) {
                        if (this.f26166o == 8) {
                            long j8 = this.f26165n;
                            if (j8 <= 2147483647L) {
                                no2 no2 = new no2((int) j8);
                                System.arraycopy(this.f26160i.mo19781h(), 0, no2.mo19781h(), 0, 8);
                                this.f26167p = no2;
                                this.f26163l = 1;
                            } else {
                                throw C5464px.zzc("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw C5464px.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f26165n <= 2147483647L) {
                        this.f26167p = null;
                        this.f26163l = 1;
                    } else {
                        throw C5464px.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw C5464px.zzc("Atom size less than header length (unsupported).");
                }
            } else if (i3 != 1) {
                long j9 = Long.MAX_VALUE;
                if (i3 != 2) {
                    w0Var = this.f26173v;
                    if (w0Var != null) {
                        break;
                    }
                    SparseArray<C5690w0> sparseArray = this.f26153b;
                    int size2 = sparseArray.size();
                    long j10 = Long.MAX_VALUE;
                    C5690w0 w0Var2 = null;
                    for (int i7 = 0; i7 < size2; i7++) {
                        C5690w0 valueAt = sparseArray.valueAt(i7);
                        if ((valueAt.f25159l || valueAt.f25153f != valueAt.f25151d.f19136b) && (!valueAt.f25159l || valueAt.f25155h != valueAt.f25149b.f18696d)) {
                            long d = valueAt.mo21666d();
                            if (d < j10) {
                                w0Var2 = valueAt;
                                j10 = d;
                            }
                        }
                    }
                    if (w0Var2 == null) {
                        int zze3 = (int) (this.f26168q - z84.zze());
                        if (zze3 >= 0) {
                            ((t84) z842).mo21042o(zze3, false);
                            m33933e();
                        } else {
                            throw C5464px.zza("Offset to end of mdat was negative.", (Throwable) null);
                        }
                    } else {
                        int d2 = (int) (w0Var2.mo21666d() - z84.zze());
                        if (d2 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            d2 = 0;
                        }
                        ((t84) z842).mo21042o(d2, false);
                        this.f26173v = w0Var2;
                        w0Var = w0Var2;
                    }
                } else {
                    int size3 = this.f26153b.size();
                    C5690w0 w0Var3 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        C5247k1 k1Var2 = this.f26153b.valueAt(i8).f25149b;
                        if (k1Var2.f18708p) {
                            long j11 = k1Var2.f18695c;
                            if (j11 < j9) {
                                w0Var3 = this.f26153b.valueAt(i8);
                                j9 = j11;
                            }
                        }
                    }
                    if (w0Var3 == null) {
                        this.f26163l = 3;
                    } else {
                        int zze4 = (int) (j9 - z84.zze());
                        if (zze4 >= 0) {
                            t84 t84 = (t84) z842;
                            t84.mo21042o(zze4, false);
                            C5247k1 k1Var3 = w0Var3.f25149b;
                            t84.mo19927e(k1Var3.f18707o.mo19781h(), 0, k1Var3.f18707o.mo19785l(), false);
                            k1Var3.f18707o.mo19779f(0);
                            k1Var3.f18708p = false;
                        } else {
                            throw C5464px.zza("Offset to encryption data was negative.", (Throwable) null);
                        }
                    }
                }
            } else {
                int i9 = ((int) this.f26165n) - this.f26166o;
                no2 no22 = this.f26167p;
                if (no22 != null) {
                    ((t84) z842).mo19927e(no22.mo19781h(), 8, i9, false);
                    C5209j0 j0Var = new C5209j0(this.f26164m, no22);
                    long zze5 = z84.zze();
                    if (!this.f26161j.isEmpty()) {
                        this.f26161j.peek().mo18247f(j0Var);
                    } else {
                        int i10 = j0Var.f18688a;
                        if (i10 == 1936286840) {
                            no2 no23 = j0Var.f18291b;
                            no23.mo19779f(8);
                            int m = no23.mo19786m();
                            no23.mo19780g(4);
                            long A = no23.mo19766A();
                            if (C5246k0.m26039a(m) == 0) {
                                j6 = no23.mo19766A();
                                j5 = no23.mo19766A();
                            } else {
                                j6 = no23.mo19767B();
                                j5 = no23.mo19767B();
                            }
                            long j12 = zze5 + j5;
                            long Z = wy2.m33431Z(j6, 1000000, A);
                            no23.mo19780g(2);
                            int w = no23.mo19796w();
                            int[] iArr = new int[w];
                            long[] jArr = new long[w];
                            long[] jArr2 = new long[w];
                            long[] jArr3 = new long[w];
                            long j13 = Z;
                            int i11 = 0;
                            while (i11 < w) {
                                int m2 = no23.mo19786m();
                                if ((m2 & Integer.MIN_VALUE) == 0) {
                                    long A2 = no23.mo19766A();
                                    iArr[i11] = m2 & Integer.MAX_VALUE;
                                    jArr[i11] = j12;
                                    jArr3[i11] = j13;
                                    long j14 = j6 + A2;
                                    long[] jArr4 = jArr3;
                                    int i12 = i11;
                                    long[] jArr5 = jArr2;
                                    int[] iArr2 = iArr;
                                    j13 = wy2.m33431Z(j14, 1000000, A);
                                    jArr5[i12] = j13 - jArr4[i12];
                                    no23.mo19780g(4);
                                    j12 += (long) iArr2[i12];
                                    i11 = i12 + 1;
                                    iArr = iArr2;
                                    jArr = jArr;
                                    jArr2 = jArr5;
                                    jArr3 = jArr4;
                                    w = w;
                                    j6 = j14;
                                    z84 z843 = z84;
                                } else {
                                    throw C5464px.zza("Unhandled indirect reference", (Throwable) null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(Z), new r84(iArr, jArr, jArr2, jArr3));
                            this.f26172u = ((Long) create.first).longValue();
                            this.f26148A.mo15723r((z94) create.second);
                            this.f26151D = true;
                        } else if (i10 == 1701671783) {
                            no2 no24 = j0Var.f18291b;
                            if (this.f26149B.length != 0) {
                                no24.mo19779f(8);
                                int a = C5246k0.m26039a(no24.mo19786m());
                                if (a == 0) {
                                    String D = no24.mo19769D(0);
                                    Objects.requireNonNull(D);
                                    String D2 = no24.mo19769D(0);
                                    Objects.requireNonNull(D2);
                                    long A3 = no24.mo19766A();
                                    long Z2 = wy2.m33431Z(no24.mo19766A(), 1000000, A3);
                                    long j15 = this.f26172u;
                                    j3 = j15 != -9223372036854775807L ? j15 + Z2 : -9223372036854775807L;
                                    j2 = wy2.m33431Z(no24.mo19766A(), 1000, A3);
                                    j = no24.mo19766A();
                                    str2 = D;
                                    str = D2;
                                    j4 = Z2;
                                } else if (a != 1) {
                                    StringBuilder sb = new StringBuilder(46);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(a);
                                    Log.w("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long A4 = no24.mo19766A();
                                    long Z3 = wy2.m33431Z(no24.mo19767B(), 1000000, A4);
                                    long Z4 = wy2.m33431Z(no24.mo19766A(), 1000, A4);
                                    long A5 = no24.mo19766A();
                                    String D3 = no24.mo19769D(0);
                                    Objects.requireNonNull(D3);
                                    String D4 = no24.mo19769D(0);
                                    Objects.requireNonNull(D4);
                                    j2 = Z4;
                                    j3 = Z3;
                                    j = A5;
                                    str2 = D3;
                                    str = D4;
                                    j4 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[no24.mo19782i()];
                                no24.mo19775b(bArr, 0, no24.mo19782i());
                                no2 no25 = new no2(this.f26159h.mo18121a(new zzyw(str2, str, j2, j, bArr)));
                                int i13 = no25.mo19782i();
                                for (da4 d3 : this.f26149B) {
                                    no25.mo19779f(0);
                                    d3.mo16888d(no25, i13);
                                }
                                if (j3 == -9223372036854775807L) {
                                    this.f26162k.addLast(new C5653v0(j4, i13));
                                    this.f26169r += i13;
                                } else {
                                    for (da4 e : this.f26149B) {
                                        e.mo16889e(j3, 1, i13, 0, (ca4) null);
                                    }
                                }
                            }
                        }
                        z842 = z84;
                    }
                } else {
                    ((t84) z842).mo21042o(i9, false);
                }
                m33935i(z84.zze());
            }
        }
        byte b3 = 6;
        if (this.f26163l == 3) {
            int b4 = w0Var.mo21664b();
            this.f26174w = b4;
            if (w0Var.f25153f < w0Var.f25156i) {
                ((t84) z842).mo21042o(b4, false);
                C5210j1 f = w0Var.mo21668f();
                if (f != null) {
                    no2 no26 = w0Var.f25149b.f18707o;
                    int i14 = f.f18300d;
                    if (i14 != 0) {
                        no26.mo19780g(i14);
                    }
                    if (w0Var.f25149b.mo18780c(w0Var.f25153f)) {
                        no26.mo19780g(no26.mo19796w() * 6);
                    }
                }
                if (!w0Var.mo21671k()) {
                    this.f26173v = null;
                }
                this.f26163l = 3;
                return 0;
            }
            if (w0Var.f25151d.f19135a.f17848g == 1) {
                this.f26174w = b4 - 8;
                ((t84) z842).mo21042o(8, false);
            }
            if ("audio/ac4".equals(w0Var.f25151d.f19135a.f17847f.f25133l)) {
                this.f26175x = w0Var.mo21665c(this.f26174w, 7);
                g84.m24212b(this.f26174w, this.f26158g);
                ba4.m21199b(w0Var.f25148a, this.f26158g, 7);
                i2 = this.f26175x + 7;
                this.f26175x = i2;
            } else {
                i2 = w0Var.mo21665c(this.f26174w, 0);
                this.f26175x = i2;
            }
            this.f26174w += i2;
            this.f26163l = 4;
            this.f26176y = 0;
        }
        C5173i1 i1Var = w0Var.f25151d.f19135a;
        da4 da4 = w0Var.f25148a;
        long e2 = w0Var.mo21667e();
        if (i1Var.f17851j == 0) {
            while (true) {
                int i15 = this.f26175x;
                int i16 = this.f26174w;
                if (i15 >= i16) {
                    break;
                }
                this.f26175x += ba4.m21198a(da4, z842, i16 - i15, false);
            }
        } else {
            byte[] h = this.f26155d.mo19781h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i17 = i1Var.f17851j;
            int i18 = i17 + 1;
            int i19 = 4 - i17;
            while (this.f26175x < this.f26174w) {
                int i20 = this.f26176y;
                if (i20 == 0) {
                    ((t84) z842).mo19927e(h, i19, i18, z);
                    this.f26155d.mo19779f(z ? 1 : 0);
                    int m3 = this.f26155d.mo19786m();
                    if (m3 > 0) {
                        this.f26176y = m3 - 1;
                        this.f26154c.mo19779f(z);
                        ba4.m21199b(da4, this.f26154c, 4);
                        ba4.m21199b(da4, this.f26155d, b);
                        if (this.f26150C.length > 0) {
                            String str3 = i1Var.f17847f.f25133l;
                            byte b5 = h[4];
                            byte[] bArr2 = df2.f15600a;
                            if (("video/avc".equals(str3) && (b5 & 31) == b3) || ("video/hevc".equals(str3) && ((b5 & 126) >> b) == 39)) {
                                z2 = true;
                                this.f26177z = z2;
                                this.f26175x += 5;
                                this.f26174w += i19;
                            }
                        }
                        z2 = false;
                        this.f26177z = z2;
                        this.f26175x += 5;
                        this.f26174w += i19;
                    } else {
                        throw C5464px.zza("Invalid NAL length", (Throwable) null);
                    }
                } else {
                    if (this.f26177z) {
                        this.f26156e.mo19776c(i20);
                        ((t84) z842).mo19927e(this.f26156e.mo19781h(), 0, this.f26176y, false);
                        ba4.m21199b(da4, this.f26156e, this.f26176y);
                        i = this.f26176y;
                        int b6 = df2.m22489b(this.f26156e.mo19781h(), this.f26156e.mo19785l());
                        this.f26156e.mo19779f("video/hevc".equals(i1Var.f17847f.f25133l) ? 1 : 0);
                        this.f26156e.mo19778e(b6);
                        q84.m29409a(e2, this.f26156e, this.f26150C);
                    } else {
                        i = ba4.m21198a(da4, z842, i20, false);
                    }
                    this.f26175x += i;
                    this.f26176y -= i;
                    b3 = 6;
                    b = 1;
                }
                z = false;
            }
        }
        int a2 = w0Var.mo21663a();
        C5210j1 f2 = w0Var.mo21668f();
        da4.mo16889e(e2, a2, this.f26174w, 0, f2 != null ? f2.f18299c : null);
        while (!this.f26162k.isEmpty()) {
            C5653v0 removeFirst = this.f26162k.removeFirst();
            this.f26169r -= removeFirst.f24526b;
            long j16 = removeFirst.f24525a + e2;
            for (da4 e3 : this.f26149B) {
                e3.mo16889e(j16, 1, removeFirst.f24526b, this.f26169r, (ca4) null);
            }
        }
        if (!w0Var.mo21671k()) {
            this.f26173v = null;
        }
        this.f26163l = 3;
        return 0;
    }

    /* renamed from: f */
    public final void mo16803f(b94 b94) {
        this.f26148A = b94;
        m33933e();
        da4[] da4Arr = new da4[2];
        this.f26149B = da4Arr;
        int i = 0;
        da4[] da4Arr2 = (da4[]) wy2.m33407B(da4Arr, 0);
        this.f26149B = da4Arr2;
        for (da4 a : da4Arr2) {
            a.mo16885a(f26147G);
        }
        this.f26150C = new da4[this.f26152a.size()];
        int i2 = 100;
        while (i < this.f26150C.length) {
            int i3 = i2 + 1;
            da4 s = this.f26148A.mo15724s(i2, 3);
            s.mo16885a(this.f26152a.get(i));
            this.f26150C[i] = s;
            i++;
            i2 = i3;
        }
    }

    /* renamed from: h */
    public final void mo16804h(long j, long j2) {
        int size = this.f26153b.size();
        for (int i = 0; i < size; i++) {
            this.f26153b.valueAt(i).mo21670i();
        }
        this.f26162k.clear();
        this.f26169r = 0;
        this.f26170s = j2;
        this.f26161j.clear();
        m33933e();
    }
}
