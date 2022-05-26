package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.google.android.gms.internal.ads.wh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5707wh implements C5447pg {

    /* renamed from: v */
    private static final int f25390v = C4934bm.m21437g("seig");

    /* renamed from: w */
    private static final byte[] f25391w = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: a */
    private final SparseArray<C5670vh> f25392a = new SparseArray<>();

    /* renamed from: b */
    private final C5600tl f25393b = new C5600tl(C5526rl.f22891a);

    /* renamed from: c */
    private final C5600tl f25394c = new C5600tl(5);

    /* renamed from: d */
    private final C5600tl f25395d = new C5600tl(1);

    /* renamed from: e */
    private final C5600tl f25396e = new C5600tl(16);

    /* renamed from: f */
    private final byte[] f25397f = new byte[16];

    /* renamed from: g */
    private final Stack<C5226jh> f25398g = new Stack<>();

    /* renamed from: h */
    private final LinkedList<C5633uh> f25399h = new LinkedList<>();

    /* renamed from: i */
    private int f25400i;

    /* renamed from: j */
    private int f25401j;

    /* renamed from: k */
    private long f25402k;

    /* renamed from: l */
    private int f25403l;

    /* renamed from: m */
    private C5600tl f25404m;

    /* renamed from: n */
    private long f25405n;

    /* renamed from: o */
    private long f25406o = -9223372036854775807L;

    /* renamed from: p */
    private C5670vh f25407p;

    /* renamed from: q */
    private int f25408q;

    /* renamed from: r */
    private int f25409r;

    /* renamed from: s */
    private int f25410s;

    /* renamed from: t */
    private C5484qg f25411t;

    /* renamed from: u */
    private boolean f25412u;

    public C5707wh(int i, C5748xl xlVar, C4930bi biVar) {
        m33158b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzarf m33157a(java.util.List<com.google.android.gms.internal.ads.C5263kh> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0008:
            if (r3 >= r0) goto L_0x00b7
            java.lang.Object r5 = r14.get(r3)
            com.google.android.gms.internal.ads.kh r5 = (com.google.android.gms.internal.ads.C5263kh) r5
            int r6 = r5.f19437a
            int r7 = com.google.android.gms.internal.ads.C5300lh.f19381V
            if (r6 != r7) goto L_0x00b3
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.google.android.gms.internal.ads.tl r5 = r5.f18875P0
            byte[] r5 = r5.f23918a
            com.google.android.gms.internal.ads.tl r6 = new com.google.android.gms.internal.ads.tl
            r6.<init>((byte[]) r5)
            int r8 = r6.mo21085d()
            r9 = 32
            if (r8 >= r9) goto L_0x0030
        L_0x002e:
            r6 = r2
            goto L_0x0097
        L_0x0030:
            r6.mo21103v(r1)
            int r8 = r6.mo21086e()
            int r9 = r6.mo21082a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x0040
            goto L_0x002e
        L_0x0040:
            int r8 = r6.mo21086e()
            if (r8 == r7) goto L_0x0047
            goto L_0x002e
        L_0x0047:
            int r7 = r6.mo21086e()
            int r7 = com.google.android.gms.internal.ads.C5300lh.m26727b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x006b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r8 = 37
            r6.<init>(r8)
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x002e
        L_0x006b:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo21093l()
            long r12 = r6.mo21093l()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x0083
            int r7 = r6.mo21090i()
            int r7 = r7 * 16
            r6.mo21104w(r7)
        L_0x0083:
            int r7 = r6.mo21090i()
            int r8 = r6.mo21082a()
            if (r7 == r8) goto L_0x008e
            goto L_0x002e
        L_0x008e:
            byte[] r8 = new byte[r7]
            r6.mo21098q(r8, r1, r7)
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x0097:
            if (r6 != 0) goto L_0x009b
            r6 = r2
            goto L_0x009f
        L_0x009b:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x009f:
            if (r6 != 0) goto L_0x00a9
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b3
        L_0x00a9:
            com.google.android.gms.internal.ads.zzare r7 = new com.google.android.gms.internal.ads.zzare
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b3:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00b7:
            if (r4 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            com.google.android.gms.internal.ads.zzarf r14 = new com.google.android.gms.internal.ads.zzarf
            r14.<init>((java.util.List<com.google.android.gms.internal.ads.zzare>) r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5707wh.m33157a(java.util.List):com.google.android.gms.internal.ads.zzarf");
    }

    /* renamed from: b */
    private final void m33158b() {
        this.f25400i = 0;
        this.f25403l = 0;
    }

    /* renamed from: g */
    private static void m33159g(C5600tl tlVar, int i, C5041ei eiVar) throws C5445pe {
        tlVar.mo21103v(i + 8);
        int a = C5300lh.m26726a(tlVar.mo21086e());
        if ((a & 1) == 0) {
            boolean z = (a & 2) != 0;
            int i2 = tlVar.mo21090i();
            int i3 = eiVar.f15958e;
            if (i2 == i3) {
                Arrays.fill(eiVar.f15966m, 0, i2, z);
                eiVar.mo17193a(tlVar.mo21082a());
                tlVar.mo21098q(eiVar.f15969p.f23918a, 0, eiVar.f15968o);
                eiVar.f15969p.mo21103v(0);
                eiVar.f15970q = false;
                return;
            }
            StringBuilder sb = new StringBuilder(41);
            sb.append("Length mismatch: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            throw new C5445pe(sb.toString());
        }
        throw new C5445pe("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x059b  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m33160h(long r50) throws com.google.android.gms.internal.ads.C5445pe {
        /*
            r49 = this;
        L_0x0000:
            r0 = r49
        L_0x0002:
            java.util.Stack<com.google.android.gms.internal.ads.jh> r1 = r0.f25398g
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0633
            java.util.Stack<com.google.android.gms.internal.ads.jh> r1 = r0.f25398g
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.jh r1 = (com.google.android.gms.internal.ads.C5226jh) r1
            long r1 = r1.f18485P0
            int r3 = (r1 > r50 ? 1 : (r1 == r50 ? 0 : -1))
            if (r3 != 0) goto L_0x0633
            java.util.Stack<com.google.android.gms.internal.ads.jh> r1 = r0.f25398g
            java.lang.Object r1 = r1.pop()
            com.google.android.gms.internal.ads.jh r1 = (com.google.android.gms.internal.ads.C5226jh) r1
            int r2 = r1.f19437a
            int r3 = com.google.android.gms.internal.ads.C5300lh.f19349C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List<com.google.android.gms.internal.ads.kh> r2 = r1.f18486Q0
            com.google.android.gms.internal.ads.zzarf r2 = m33157a(r2)
            int r3 = com.google.android.gms.internal.ads.C5300lh.f19371N
            com.google.android.gms.internal.ads.jh r3 = r1.mo18626d(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            java.util.List<com.google.android.gms.internal.ads.kh> r8 = r3.f18486Q0
            int r8 = r8.size()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = r9
            r9 = 0
        L_0x0049:
            if (r9 >= r8) goto L_0x00b3
            java.util.List<com.google.android.gms.internal.ads.kh> r10 = r3.f18486Q0
            java.lang.Object r10 = r10.get(r9)
            com.google.android.gms.internal.ads.kh r10 = (com.google.android.gms.internal.ads.C5263kh) r10
            int r11 = r10.f19437a
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19435z
            if (r11 != r12) goto L_0x0091
            com.google.android.gms.internal.ads.tl r10 = r10.f18875P0
            r10.mo21103v(r4)
            int r11 = r10.mo21086e()
            int r12 = r10.mo21090i()
            int r13 = r10.mo21090i()
            int r6 = r10.mo21090i()
            int r10 = r10.mo21086e()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.google.android.gms.internal.ads.th r4 = new com.google.android.gms.internal.ads.th
            int r12 = r12 + -1
            r4.<init>(r12, r13, r6, r10)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.th r4 = (com.google.android.gms.internal.ads.C5596th) r4
            r14.put(r6, r4)
            goto L_0x00ae
        L_0x0091:
            int r4 = com.google.android.gms.internal.ads.C5300lh.f19373O
            if (r11 != r4) goto L_0x00ae
            com.google.android.gms.internal.ads.tl r4 = r10.f18875P0
            r4.mo21103v(r5)
            int r6 = r4.mo21086e()
            int r6 = com.google.android.gms.internal.ads.C5300lh.m26727b(r6)
            if (r6 != 0) goto L_0x00a9
            long r10 = r4.mo21094m()
            goto L_0x00ad
        L_0x00a9:
            long r10 = r4.mo21095n()
        L_0x00ad:
            r15 = r10
        L_0x00ae:
            int r9 = r9 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b3:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.google.android.gms.internal.ads.jh> r4 = r1.f18487R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bf:
            if (r5 >= r4) goto L_0x00e7
            java.util.List<com.google.android.gms.internal.ads.jh> r6 = r1.f18487R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.google.android.gms.internal.ads.jh r8 = (com.google.android.gms.internal.ads.C5226jh) r8
            int r6 = r8.f19437a
            int r9 = com.google.android.gms.internal.ads.C5300lh.f19353E
            if (r6 != r9) goto L_0x00e4
            int r6 = com.google.android.gms.internal.ads.C5300lh.f19351D
            com.google.android.gms.internal.ads.kh r9 = r1.mo18627e(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.google.android.gms.internal.ads.bi r6 = com.google.android.gms.internal.ads.C5559sh.m30712a(r8, r9, r10, r12, r13)
            if (r6 == 0) goto L_0x00e4
            int r8 = r6.f14465a
            r3.put(r8, r6)
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00bf
        L_0x00e7:
            int r1 = r3.size()
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r2 = r0.f25392a
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f4:
            if (r6 >= r1) goto L_0x0128
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.bi r2 = (com.google.android.gms.internal.ads.C4930bi) r2
            com.google.android.gms.internal.ads.vh r4 = new com.google.android.gms.internal.ads.vh
            com.google.android.gms.internal.ads.qg r5 = r0.f25411t
            int r7 = r2.f14466b
            com.google.android.gms.internal.ads.xg r5 = r5.mo17943l(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f14465a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.th r5 = (com.google.android.gms.internal.ads.C5596th) r5
            r4.mo21506a(r2, r5)
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r5 = r0.f25392a
            int r7 = r2.f14465a
            r5.put(r7, r4)
            long r4 = r0.f25406o
            long r7 = r2.f14469e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f25406o = r4
            int r6 = r6 + 1
            goto L_0x00f4
        L_0x0128:
            com.google.android.gms.internal.ads.qg r1 = r0.f25411t
            r1.mo17935a()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r2 = r0.f25392a
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.C5304ll.m26776e(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.bi r2 = (com.google.android.gms.internal.ads.C4930bi) r2
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r4 = r0.f25392a
            int r5 = r2.f14465a
            java.lang.Object r4 = r4.get(r5)
            com.google.android.gms.internal.ads.vh r4 = (com.google.android.gms.internal.ads.C5670vh) r4
            int r5 = r2.f14465a
            java.lang.Object r5 = r14.get(r5)
            com.google.android.gms.internal.ads.th r5 = (com.google.android.gms.internal.ads.C5596th) r5
            r4.mo21506a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.google.android.gms.internal.ads.C5300lh.f19367L
            if (r2 != r3) goto L_0x061c
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r2 = r0.f25392a
            byte[] r3 = r0.f25397f
            java.util.List<com.google.android.gms.internal.ads.jh> r4 = r1.f18487R0
            int r4 = r4.size()
            r6 = 0
        L_0x016c:
            if (r6 >= r4) goto L_0x05f0
            java.util.List<com.google.android.gms.internal.ads.jh> r8 = r1.f18487R0
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.jh r8 = (com.google.android.gms.internal.ads.C5226jh) r8
            int r9 = r8.f19437a
            int r10 = com.google.android.gms.internal.ads.C5300lh.f19369M
            if (r9 != r10) goto L_0x05d6
            int r9 = com.google.android.gms.internal.ads.C5300lh.f19433y
            com.google.android.gms.internal.ads.kh r9 = r8.mo18627e(r9)
            com.google.android.gms.internal.ads.tl r9 = r9.f18875P0
            r9.mo21103v(r5)
            int r10 = r9.mo21086e()
            int r10 = com.google.android.gms.internal.ads.C5300lh.m26726a(r10)
            int r11 = r9.mo21086e()
            java.lang.Object r11 = r2.get(r11)
            com.google.android.gms.internal.ads.vh r11 = (com.google.android.gms.internal.ads.C5670vh) r11
            if (r11 != 0) goto L_0x019d
            r11 = 0
            goto L_0x01e4
        L_0x019d:
            r12 = r10 & 1
            if (r12 == 0) goto L_0x01ab
            long r12 = r9.mo21095n()
            com.google.android.gms.internal.ads.ei r14 = r11.f24768a
            r14.f15955b = r12
            r14.f15956c = r12
        L_0x01ab:
            com.google.android.gms.internal.ads.th r12 = r11.f24771d
            r13 = r10 & 2
            if (r13 == 0) goto L_0x01b8
            int r13 = r9.mo21090i()
            int r13 = r13 + -1
            goto L_0x01ba
        L_0x01b8:
            int r13 = r12.f23872a
        L_0x01ba:
            r14 = r10 & 8
            if (r14 == 0) goto L_0x01c3
            int r14 = r9.mo21090i()
            goto L_0x01c5
        L_0x01c3:
            int r14 = r12.f23873b
        L_0x01c5:
            r15 = r10 & 16
            if (r15 == 0) goto L_0x01ce
            int r15 = r9.mo21090i()
            goto L_0x01d0
        L_0x01ce:
            int r15 = r12.f23874c
        L_0x01d0:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x01d9
            int r9 = r9.mo21090i()
            goto L_0x01db
        L_0x01d9:
            int r9 = r12.f23875d
        L_0x01db:
            com.google.android.gms.internal.ads.ei r10 = r11.f24768a
            com.google.android.gms.internal.ads.th r12 = new com.google.android.gms.internal.ads.th
            r12.<init>(r13, r14, r15, r9)
            r10.f15954a = r12
        L_0x01e4:
            if (r11 != 0) goto L_0x01e8
            goto L_0x05d6
        L_0x01e8:
            com.google.android.gms.internal.ads.ei r9 = r11.f24768a
            long r12 = r9.f15971r
            r11.mo21507b()
            int r10 = com.google.android.gms.internal.ads.C5300lh.f19431x
            com.google.android.gms.internal.ads.kh r14 = r8.mo18627e(r10)
            if (r14 == 0) goto L_0x0213
            com.google.android.gms.internal.ads.kh r10 = r8.mo18627e(r10)
            com.google.android.gms.internal.ads.tl r10 = r10.f18875P0
            r10.mo21103v(r5)
            int r12 = r10.mo21086e()
            int r12 = com.google.android.gms.internal.ads.C5300lh.m26727b(r12)
            if (r12 != r7) goto L_0x020f
            long r12 = r10.mo21095n()
            goto L_0x0213
        L_0x020f:
            long r12 = r10.mo21094m()
        L_0x0213:
            java.util.List<com.google.android.gms.internal.ads.kh> r10 = r8.f18486Q0
            int r14 = r10.size()
            r5 = 0
            r7 = 0
            r15 = 0
        L_0x021c:
            if (r15 >= r14) goto L_0x024e
            java.lang.Object r18 = r10.get(r15)
            r19 = r2
            r2 = r18
            com.google.android.gms.internal.ads.kh r2 = (com.google.android.gms.internal.ads.C5263kh) r2
            r18 = r4
            int r4 = r2.f19437a
            r20 = r12
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19345A
            if (r4 != r12) goto L_0x0243
            com.google.android.gms.internal.ads.tl r2 = r2.f18875P0
            r4 = 12
            r2.mo21103v(r4)
            int r2 = r2.mo21090i()
            if (r2 <= 0) goto L_0x0245
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L_0x0245
        L_0x0243:
            r4 = 12
        L_0x0245:
            int r15 = r15 + 1
            r4 = r18
            r2 = r19
            r12 = r20
            goto L_0x021c
        L_0x024e:
            r19 = r2
            r18 = r4
            r20 = r12
            r2 = 0
            r4 = 12
            r11.f24774g = r2
            r11.f24773f = r2
            r11.f24772e = r2
            com.google.android.gms.internal.ads.ei r2 = r11.f24768a
            r2.f15957d = r7
            r2.f15958e = r5
            int[] r12 = r2.f15960g
            if (r12 == 0) goto L_0x026a
            int r12 = r12.length
            if (r12 >= r7) goto L_0x0272
        L_0x026a:
            long[] r12 = new long[r7]
            r2.f15959f = r12
            int[] r7 = new int[r7]
            r2.f15960g = r7
        L_0x0272:
            int[] r7 = r2.f15961h
            if (r7 == 0) goto L_0x0279
            int r7 = r7.length
            if (r7 >= r5) goto L_0x0291
        L_0x0279:
            int r5 = r5 * 125
            int r5 = r5 / 100
            int[] r7 = new int[r5]
            r2.f15961h = r7
            int[] r7 = new int[r5]
            r2.f15962i = r7
            long[] r7 = new long[r5]
            r2.f15963j = r7
            boolean[] r7 = new boolean[r5]
            r2.f15964k = r7
            boolean[] r5 = new boolean[r5]
            r2.f15966m = r5
        L_0x0291:
            r2 = 0
            r5 = 0
            r7 = 0
        L_0x0294:
            if (r2 >= r14) goto L_0x0400
            java.lang.Object r17 = r10.get(r2)
            r4 = r17
            com.google.android.gms.internal.ads.kh r4 = (com.google.android.gms.internal.ads.C5263kh) r4
            int r15 = r4.f19437a
            int r12 = com.google.android.gms.internal.ads.C5300lh.f19345A
            if (r15 != r12) goto L_0x03d6
            int r12 = r7 + 1
            com.google.android.gms.internal.ads.tl r4 = r4.f18875P0
            r13 = 8
            r4.mo21103v(r13)
            int r13 = r4.mo21086e()
            int r13 = com.google.android.gms.internal.ads.C5300lh.m26726a(r13)
            com.google.android.gms.internal.ads.bi r15 = r11.f24770c
            r24 = r10
            com.google.android.gms.internal.ads.ei r10 = r11.f24768a
            r25 = r12
            com.google.android.gms.internal.ads.th r12 = r10.f15954a
            r26 = r14
            int[] r14 = r10.f15960g
            int r27 = r4.mo21090i()
            r14[r7] = r27
            long[] r14 = r10.f15959f
            r27 = r1
            long r0 = r10.f15955b
            r14[r7] = r0
            r28 = r13 & 1
            if (r28 == 0) goto L_0x02e4
            r28 = r6
            int r6 = r4.mo21086e()
            r29 = r8
            r30 = r9
            long r8 = (long) r6
            long r0 = r0 + r8
            r14[r7] = r0
            goto L_0x02ea
        L_0x02e4:
            r28 = r6
            r29 = r8
            r30 = r9
        L_0x02ea:
            r0 = r13 & 4
            int r1 = r12.f23875d
            if (r0 == 0) goto L_0x02f4
            int r1 = r4.mo21090i()
        L_0x02f4:
            r6 = r13 & 256(0x100, float:3.59E-43)
            r8 = r13 & 512(0x200, float:7.175E-43)
            r9 = r13 & 1024(0x400, float:1.435E-42)
            r13 = r13 & 2048(0x800, float:2.87E-42)
            long[] r14 = r15.f14473i
            if (r14 == 0) goto L_0x0323
            r31 = r1
            int r1 = r14.length
            r32 = r3
            r3 = 1
            if (r1 != r3) goto L_0x0327
            r1 = 0
            r33 = r14[r1]
            r22 = 0
            int r3 = (r33 > r22 ? 1 : (r33 == r22 ? 0 : -1))
            if (r3 != 0) goto L_0x0327
            long[] r3 = r15.f14474j
            r33 = r3[r1]
            r35 = 1000(0x3e8, double:4.94E-321)
            r3 = r2
            long r1 = r15.f14467c
            r37 = r1
            long r1 = com.google.android.gms.internal.ads.C4934bm.m21440j(r33, r35, r37)
            r22 = r1
            goto L_0x032a
        L_0x0323:
            r31 = r1
            r32 = r3
        L_0x0327:
            r3 = r2
            r22 = 0
        L_0x032a:
            int[] r1 = r10.f15961h
            int[] r2 = r10.f15962i
            long[] r14 = r10.f15963j
            r33 = r11
            boolean[] r11 = r10.f15964k
            r34 = r3
            int r3 = r15.f14466b
            int[] r3 = r10.f15960g
            r3 = r3[r7]
            int r3 = r3 + r5
            r41 = r14
            long r14 = r15.f14467c
            if (r7 <= 0) goto L_0x034a
            r42 = r1
            r43 = r2
            long r1 = r10.f15971r
            goto L_0x0350
        L_0x034a:
            r42 = r1
            r43 = r2
            r1 = r20
        L_0x0350:
            if (r5 >= r3) goto L_0x03cd
            if (r6 == 0) goto L_0x0359
            int r7 = r4.mo21090i()
            goto L_0x035b
        L_0x0359:
            int r7 = r12.f23873b
        L_0x035b:
            if (r8 == 0) goto L_0x0366
            int r35 = r4.mo21090i()
            r44 = r3
            r3 = r35
            goto L_0x036a
        L_0x0366:
            r44 = r3
            int r3 = r12.f23874c
        L_0x036a:
            if (r5 != 0) goto L_0x0375
            if (r0 == 0) goto L_0x0374
            r45 = r0
            r0 = r31
            r5 = 0
            goto L_0x0384
        L_0x0374:
            r5 = 0
        L_0x0375:
            if (r9 == 0) goto L_0x0380
            int r35 = r4.mo21086e()
            r45 = r0
            r0 = r35
            goto L_0x0384
        L_0x0380:
            r45 = r0
            int r0 = r12.f23875d
        L_0x0384:
            if (r13 == 0) goto L_0x0398
            r46 = r6
            int r6 = r4.mo21086e()
            int r6 = r6 * 1000
            r47 = r8
            r48 = r9
            long r8 = (long) r6
            long r8 = r8 / r14
            int r6 = (int) r8
            r43[r5] = r6
            goto L_0x03a1
        L_0x0398:
            r46 = r6
            r47 = r8
            r48 = r9
            r6 = 0
            r43[r5] = r6
        L_0x03a1:
            r37 = 1000(0x3e8, double:4.94E-321)
            r35 = r1
            r39 = r14
            long r8 = com.google.android.gms.internal.ads.C4934bm.m21440j(r35, r37, r39)
            long r8 = r8 - r22
            r41[r5] = r8
            r42[r5] = r3
            r3 = 16
            int r0 = r0 >> r3
            r3 = 1
            r0 = r0 & r3
            r0 = r0 ^ r3
            if (r3 == r0) goto L_0x03bb
            r0 = 0
            goto L_0x03bc
        L_0x03bb:
            r0 = 1
        L_0x03bc:
            r11[r5] = r0
            long r6 = (long) r7
            long r1 = r1 + r6
            int r5 = r5 + 1
            r3 = r44
            r0 = r45
            r6 = r46
            r8 = r47
            r9 = r48
            goto L_0x0350
        L_0x03cd:
            r44 = r3
            r10.f15971r = r1
            r7 = r25
            r5 = r44
            goto L_0x03e8
        L_0x03d6:
            r27 = r1
            r34 = r2
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r24 = r10
            r33 = r11
            r26 = r14
        L_0x03e8:
            int r2 = r34 + 1
            r0 = r49
            r10 = r24
            r14 = r26
            r1 = r27
            r6 = r28
            r8 = r29
            r9 = r30
            r3 = r32
            r11 = r33
            r4 = 12
            goto L_0x0294
        L_0x0400:
            r27 = r1
            r32 = r3
            r28 = r6
            r29 = r8
            r30 = r9
            r33 = r11
            int r0 = com.google.android.gms.internal.ads.C5300lh.f19392d0
            com.google.android.gms.internal.ads.kh r0 = r8.mo18627e(r0)
            if (r0 == 0) goto L_0x048f
            r11 = r33
            com.google.android.gms.internal.ads.bi r1 = r11.f24770c
            com.google.android.gms.internal.ads.ci[] r1 = r1.f14472h
            r2 = r30
            com.google.android.gms.internal.ads.th r3 = r2.f15954a
            int r3 = r3.f23872a
            r1 = r1[r3]
            com.google.android.gms.internal.ads.tl r0 = r0.f18875P0
            int r1 = r1.f14982a
            r3 = 8
            r0.mo21103v(r3)
            int r4 = r0.mo21086e()
            int r4 = com.google.android.gms.internal.ads.C5300lh.m26726a(r4)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x043a
            r0.mo21104w(r3)
        L_0x043a:
            int r3 = r0.mo21088g()
            int r4 = r0.mo21090i()
            int r5 = r2.f15958e
            if (r4 != r5) goto L_0x046e
            if (r3 != 0) goto L_0x045d
            boolean[] r3 = r2.f15966m
            r5 = 0
            r6 = 0
        L_0x044c:
            if (r5 >= r4) goto L_0x046a
            int r7 = r0.mo21088g()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x0457
            r7 = 1
            goto L_0x0458
        L_0x0457:
            r7 = 0
        L_0x0458:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x044c
        L_0x045d:
            if (r3 <= r1) goto L_0x0461
            r0 = 1
            goto L_0x0462
        L_0x0461:
            r0 = 0
        L_0x0462:
            int r6 = r3 * r4
            boolean[] r1 = r2.f15966m
            r3 = 0
            java.util.Arrays.fill(r1, r3, r4, r0)
        L_0x046a:
            r2.mo17193a(r6)
            goto L_0x0491
        L_0x046e:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 41
            r1.<init>(r2)
            java.lang.String r2 = "Length mismatch: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x048f:
            r2 = r30
        L_0x0491:
            int r0 = com.google.android.gms.internal.ads.C5300lh.f19394e0
            com.google.android.gms.internal.ads.kh r0 = r8.mo18627e(r0)
            if (r0 == 0) goto L_0x04e3
            com.google.android.gms.internal.ads.tl r0 = r0.f18875P0
            r1 = 8
            r0.mo21103v(r1)
            int r3 = r0.mo21086e()
            int r4 = com.google.android.gms.internal.ads.C5300lh.m26726a(r3)
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x04af
            r0.mo21104w(r1)
        L_0x04af:
            int r1 = r0.mo21090i()
            if (r1 != r5) goto L_0x04ca
            long r4 = r2.f15956c
            int r1 = com.google.android.gms.internal.ads.C5300lh.m26727b(r3)
            if (r1 != 0) goto L_0x04c2
            long r0 = r0.mo21094m()
            goto L_0x04c6
        L_0x04c2:
            long r0 = r0.mo21095n()
        L_0x04c6:
            long r4 = r4 + r0
            r2.f15956c = r4
            goto L_0x04e3
        L_0x04ca:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 40
            r2.<init>(r3)
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x04e3:
            int r0 = com.google.android.gms.internal.ads.C5300lh.f19402i0
            com.google.android.gms.internal.ads.kh r0 = r8.mo18627e(r0)
            if (r0 == 0) goto L_0x04f1
            com.google.android.gms.internal.ads.tl r0 = r0.f18875P0
            r1 = 0
            m33159g(r0, r1, r2)
        L_0x04f1:
            int r0 = com.google.android.gms.internal.ads.C5300lh.f19396f0
            com.google.android.gms.internal.ads.kh r0 = r8.mo18627e(r0)
            int r1 = com.google.android.gms.internal.ads.C5300lh.f19398g0
            com.google.android.gms.internal.ads.kh r1 = r8.mo18627e(r1)
            if (r0 == 0) goto L_0x0591
            if (r1 == 0) goto L_0x0591
            com.google.android.gms.internal.ads.tl r0 = r0.f18875P0
            com.google.android.gms.internal.ads.tl r1 = r1.f18875P0
            r3 = 8
            r0.mo21103v(r3)
            int r3 = r0.mo21086e()
            int r4 = r0.mo21086e()
            int r5 = f25390v
            if (r4 == r5) goto L_0x0518
            goto L_0x0591
        L_0x0518:
            int r3 = com.google.android.gms.internal.ads.C5300lh.m26727b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0523
            r0.mo21104w(r4)
        L_0x0523:
            int r0 = r0.mo21086e()
            if (r0 != r6) goto L_0x0589
            r0 = 8
            r1.mo21103v(r0)
            int r0 = r1.mo21086e()
            int r3 = r1.mo21086e()
            if (r3 != r5) goto L_0x0591
            int r0 = com.google.android.gms.internal.ads.C5300lh.m26727b(r0)
            r3 = 2
            if (r0 != r6) goto L_0x0552
            long r4 = r1.mo21094m()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x054a
            goto L_0x0557
        L_0x054a:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>(r1)
            throw r0
        L_0x0552:
            if (r0 < r3) goto L_0x0557
            r1.mo21104w(r4)
        L_0x0557:
            long r4 = r1.mo21094m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0581
            r1.mo21104w(r3)
            int r0 = r1.mo21088g()
            r3 = 1
            if (r0 != r3) goto L_0x0592
            int r0 = r1.mo21088g()
            r4 = 16
            byte[] r5 = new byte[r4]
            r6 = 0
            r1.mo21098q(r5, r6, r4)
            r2.f15965l = r3
            com.google.android.gms.internal.ads.ci r1 = new com.google.android.gms.internal.ads.ci
            r1.<init>(r3, r0, r5)
            r2.f15967n = r1
            goto L_0x0592
        L_0x0581:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0589:
            com.google.android.gms.internal.ads.pe r0 = new com.google.android.gms.internal.ads.pe
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>(r1)
            throw r0
        L_0x0591:
            r3 = 1
        L_0x0592:
            java.util.List<com.google.android.gms.internal.ads.kh> r0 = r8.f18486Q0
            int r0 = r0.size()
            r1 = 0
        L_0x0599:
            if (r1 >= r0) goto L_0x05d0
            java.util.List<com.google.android.gms.internal.ads.kh> r4 = r8.f18486Q0
            java.lang.Object r4 = r4.get(r1)
            com.google.android.gms.internal.ads.kh r4 = (com.google.android.gms.internal.ads.C5263kh) r4
            int r5 = r4.f19437a
            int r6 = com.google.android.gms.internal.ads.C5300lh.f19400h0
            if (r5 != r6) goto L_0x05c4
            com.google.android.gms.internal.ads.tl r4 = r4.f18875P0
            r5 = 8
            r4.mo21103v(r5)
            r6 = r32
            r7 = 16
            r9 = 0
            r4.mo21098q(r6, r9, r7)
            byte[] r10 = f25391w
            boolean r10 = java.util.Arrays.equals(r6, r10)
            if (r10 == 0) goto L_0x05cb
            m33159g(r4, r7, r2)
            goto L_0x05cb
        L_0x05c4:
            r6 = r32
            r5 = 8
            r7 = 16
            r9 = 0
        L_0x05cb:
            int r1 = r1 + 1
            r32 = r6
            goto L_0x0599
        L_0x05d0:
            r6 = r32
            r5 = 8
            r9 = 0
            goto L_0x05e1
        L_0x05d6:
            r27 = r1
            r19 = r2
            r18 = r4
            r28 = r6
            r9 = 0
            r6 = r3
            r3 = 1
        L_0x05e1:
            int r0 = r28 + 1
            r3 = r6
            r4 = r18
            r2 = r19
            r1 = r27
            r7 = 1
            r6 = r0
            r0 = r49
            goto L_0x016c
        L_0x05f0:
            r9 = 0
            java.util.List<com.google.android.gms.internal.ads.kh> r0 = r1.f18486Q0
            com.google.android.gms.internal.ads.zzarf r0 = m33157a(r0)
            if (r0 == 0) goto L_0x0000
            r2 = r49
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r1 = r2.f25392a
            int r1 = r1.size()
            r6 = 0
        L_0x0602:
            if (r6 >= r1) goto L_0x0630
            android.util.SparseArray<com.google.android.gms.internal.ads.vh> r3 = r2.f25392a
            java.lang.Object r3 = r3.valueAt(r6)
            com.google.android.gms.internal.ads.vh r3 = (com.google.android.gms.internal.ads.C5670vh) r3
            com.google.android.gms.internal.ads.xg r4 = r3.f24769b
            com.google.android.gms.internal.ads.bi r3 = r3.f24770c
            com.google.android.gms.internal.ads.zzapg r3 = r3.f14470f
            com.google.android.gms.internal.ads.zzapg r3 = r3.mo22482d(r0)
            r4.mo21512a(r3)
            int r6 = r6 + 1
            goto L_0x0602
        L_0x061c:
            r2 = r0
            java.util.Stack<com.google.android.gms.internal.ads.jh> r0 = r2.f25398g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0630
            java.util.Stack<com.google.android.gms.internal.ads.jh> r0 = r2.f25398g
            java.lang.Object r0 = r0.peek()
            com.google.android.gms.internal.ads.jh r0 = (com.google.android.gms.internal.ads.C5226jh) r0
            r0.mo18628f(r1)
        L_0x0630:
            r0 = r2
            goto L_0x0002
        L_0x0633:
            r2 = r0
            r49.m33158b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5707wh.m33160h(long):void");
    }

    /* renamed from: c */
    public final boolean mo17912c(C5410og ogVar) throws IOException, InterruptedException {
        return C4893ai.m20728a(ogVar);
    }

    /* renamed from: d */
    public final void mo17913d(C5484qg qgVar) {
        this.f25411t = qgVar;
    }

    /* renamed from: e */
    public final void mo17914e(long j, long j2) {
        int size = this.f25392a.size();
        for (int i = 0; i < size; i++) {
            this.f25392a.valueAt(i).mo21507b();
        }
        this.f25399h.clear();
        this.f25398g.clear();
        m33158b();
    }

    /* renamed from: f */
    public final int mo17915f(C5410og ogVar, C5595tg tgVar) throws IOException, InterruptedException {
        long j;
        long j2;
        C5706wg wgVar;
        C4967ci ciVar;
        C5706wg wgVar2;
        int i;
        C5410og ogVar2 = ogVar;
        while (true) {
            int i2 = this.f25400i;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f25403l == 0) {
                    if (!ogVar2.mo19988h(this.f25396e.f23918a, 0, 8, true)) {
                        return -1;
                    }
                    this.f25403l = 8;
                    this.f25396e.mo21103v(0);
                    this.f25402k = this.f25396e.mo21094m();
                    this.f25401j = this.f25396e.mo21086e();
                }
                long j3 = this.f25402k;
                if (j3 == 1) {
                    ogVar2.mo19988h(this.f25396e.f23918a, 8, 8, false);
                    this.f25403l += 8;
                    j3 = this.f25396e.mo21095n();
                    this.f25402k = j3;
                }
                if (j3 >= ((long) this.f25403l)) {
                    long d = ogVar.mo19984d() - ((long) this.f25403l);
                    if (this.f25401j == C5300lh.f19367L) {
                        int size = this.f25392a.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            C5041ei eiVar = this.f25392a.valueAt(i4).f24768a;
                            eiVar.f15956c = d;
                            eiVar.f15955b = d;
                        }
                    }
                    int i5 = this.f25401j;
                    if (i5 == C5300lh.f19401i) {
                        this.f25407p = null;
                        this.f25405n = d + this.f25402k;
                        if (!this.f25412u) {
                            this.f25411t.mo17941j(new C5632ug(this.f25406o));
                            this.f25412u = true;
                        }
                        this.f25400i = 2;
                    } else if (i5 == C5300lh.f19349C || i5 == C5300lh.f19353E || i5 == C5300lh.f19355F || i5 == C5300lh.f19357G || i5 == C5300lh.f19359H || i5 == C5300lh.f19367L || i5 == C5300lh.f19369M || i5 == C5300lh.f19371N || i5 == C5300lh.f19376Q) {
                        long d2 = (ogVar.mo19984d() + this.f25402k) - 8;
                        this.f25398g.add(new C5226jh(this.f25401j, d2));
                        if (this.f25402k == ((long) this.f25403l)) {
                            m33160h(d2);
                        } else {
                            m33158b();
                        }
                    } else if (i5 == C5300lh.f19379T || i5 == C5300lh.f19378S || i5 == C5300lh.f19351D || i5 == C5300lh.f19347B || i5 == C5300lh.f19380U || i5 == C5300lh.f19431x || i5 == C5300lh.f19433y || i5 == C5300lh.f19375P || i5 == C5300lh.f19435z || i5 == C5300lh.f19345A || i5 == C5300lh.f19381V || i5 == C5300lh.f19392d0 || i5 == C5300lh.f19394e0 || i5 == C5300lh.f19402i0 || i5 == C5300lh.f19400h0 || i5 == C5300lh.f19396f0 || i5 == C5300lh.f19398g0 || i5 == C5300lh.f19377R || i5 == C5300lh.f19373O || i5 == C5300lh.f19358G0) {
                        if (this.f25403l == 8) {
                            long j4 = this.f25402k;
                            if (j4 <= 2147483647L) {
                                C5600tl tlVar = new C5600tl((int) j4);
                                this.f25404m = tlVar;
                                System.arraycopy(this.f25396e.f23918a, 0, tlVar.f23918a, 0, 8);
                                this.f25400i = 1;
                            } else {
                                throw new C5445pe("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw new C5445pe("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else if (this.f25402k <= 2147483647L) {
                        this.f25404m = null;
                        this.f25400i = 1;
                    } else {
                        throw new C5445pe("Skipping atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C5445pe("Atom size less than header length (unsupported).");
                }
            } else if (i2 != 1) {
                long j5 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f25407p != null) {
                            break;
                        }
                        SparseArray<C5670vh> sparseArray = this.f25392a;
                        int size2 = sparseArray.size();
                        C5670vh vhVar = null;
                        for (int i6 = 0; i6 < size2; i6++) {
                            C5670vh valueAt = sparseArray.valueAt(i6);
                            int i7 = valueAt.f24774g;
                            C5041ei eiVar2 = valueAt.f24768a;
                            if (i7 != eiVar2.f15957d) {
                                long j6 = eiVar2.f15959f[i7];
                                if (j6 < j5) {
                                    vhVar = valueAt;
                                    j5 = j6;
                                }
                            }
                        }
                        if (vhVar == null) {
                            int d3 = (int) (this.f25405n - ogVar.mo19984d());
                            if (d3 >= 0) {
                                ogVar2.mo19989i(d3, false);
                                m33158b();
                            } else {
                                throw new C5445pe("Offset to end of mdat was negative.");
                            }
                        } else {
                            int d4 = (int) (vhVar.f24768a.f15959f[vhVar.f24774g] - ogVar.mo19984d());
                            if (d4 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                d4 = 0;
                            }
                            ogVar2.mo19989i(d4, false);
                            this.f25407p = vhVar;
                        }
                    } else {
                        break;
                    }
                } else {
                    int size3 = this.f25392a.size();
                    C5670vh vhVar2 = null;
                    for (int i8 = 0; i8 < size3; i8++) {
                        C5041ei eiVar3 = this.f25392a.valueAt(i8).f24768a;
                        if (eiVar3.f15970q) {
                            long j7 = eiVar3.f15956c;
                            if (j7 < j5) {
                                vhVar2 = this.f25392a.valueAt(i8);
                                j5 = j7;
                            }
                        }
                    }
                    if (vhVar2 == null) {
                        this.f25400i = 3;
                    } else {
                        int d5 = (int) (j5 - ogVar.mo19984d());
                        if (d5 >= 0) {
                            ogVar2.mo19989i(d5, false);
                            C5041ei eiVar4 = vhVar2.f24768a;
                            ogVar2.mo19988h(eiVar4.f15969p.f23918a, 0, eiVar4.f15968o, false);
                            eiVar4.f15969p.mo21103v(0);
                            eiVar4.f15970q = false;
                        } else {
                            throw new C5445pe("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i9 = ((int) this.f25402k) - this.f25403l;
                C5600tl tlVar2 = this.f25404m;
                if (tlVar2 != null) {
                    ogVar2.mo19988h(tlVar2.f23918a, 8, i9, false);
                    C5263kh khVar = new C5263kh(this.f25401j, this.f25404m);
                    long d6 = ogVar.mo19984d();
                    if (!this.f25398g.isEmpty()) {
                        this.f25398g.peek().mo18629g(khVar);
                    } else {
                        if (khVar.f19437a == C5300lh.f19347B) {
                            C5600tl tlVar3 = khVar.f18875P0;
                            tlVar3.mo21103v(8);
                            int e = tlVar3.mo21086e();
                            tlVar3.mo21104w(4);
                            long m = tlVar3.mo21094m();
                            if (C5300lh.m26727b(e) == 0) {
                                j2 = tlVar3.mo21094m();
                                j = tlVar3.mo21094m();
                            } else {
                                j2 = tlVar3.mo21095n();
                                j = tlVar3.mo21095n();
                            }
                            long j8 = d6 + j;
                            long j9 = j2;
                            long j10 = C4934bm.m21440j(j9, 1000000, m);
                            tlVar3.mo21104w(2);
                            int j11 = tlVar3.mo21091j();
                            int[] iArr = new int[j11];
                            long[] jArr = new long[j11];
                            long[] jArr2 = new long[j11];
                            long[] jArr3 = new long[j11];
                            long j12 = j10;
                            while (i3 < j11) {
                                int e2 = tlVar3.mo21086e();
                                if ((e2 & Integer.MIN_VALUE) == 0) {
                                    long m2 = tlVar3.mo21094m();
                                    iArr[i3] = e2 & Integer.MAX_VALUE;
                                    jArr[i3] = j8;
                                    jArr3[i3] = j12;
                                    j9 += m2;
                                    int i10 = j11;
                                    long[] jArr4 = jArr2;
                                    long[] jArr5 = jArr3;
                                    j12 = C4934bm.m21440j(j9, 1000000, m);
                                    jArr4[i3] = j12 - jArr5[i3];
                                    tlVar3.mo21104w(4);
                                    j8 += (long) iArr[i3];
                                    i3++;
                                    jArr = jArr;
                                    jArr3 = jArr5;
                                    jArr2 = jArr4;
                                    j11 = i10;
                                    C5410og ogVar3 = ogVar;
                                } else {
                                    throw new C5445pe("Unhandled indirect reference");
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(j10), new C5373ng(iArr, jArr, jArr2, jArr3));
                            ((Long) create.first).longValue();
                            this.f25411t.mo17941j((C5669vg) create.second);
                            this.f25412u = true;
                        }
                        ogVar2 = ogVar;
                    }
                } else {
                    ogVar2.mo19989i(i9, false);
                }
                m33160h(ogVar.mo19984d());
            }
        }
        C5670vh vhVar3 = this.f25407p;
        C5041ei eiVar5 = vhVar3.f24768a;
        int[] iArr2 = eiVar5.f15961h;
        int i11 = vhVar3.f24772e;
        int i12 = iArr2[i11];
        this.f25408q = i12;
        if (eiVar5.f15965l) {
            C5600tl tlVar4 = eiVar5.f15969p;
            int i13 = eiVar5.f15954a.f23872a;
            C4967ci ciVar2 = eiVar5.f15967n;
            if (ciVar2 == null) {
                ciVar2 = vhVar3.f24770c.f14472h[i13];
            }
            int i14 = ciVar2.f14982a;
            boolean z = eiVar5.f15966m[i11];
            C5600tl tlVar5 = this.f25395d;
            tlVar5.f23918a[0] = (byte) ((true != z ? 0 : 128) | i14);
            tlVar5.mo21103v(0);
            C5743xg xgVar = vhVar3.f24769b;
            xgVar.mo21513b(this.f25395d, 1);
            xgVar.mo21513b(tlVar4, i14);
            if (!z) {
                i = i14 + 1;
            } else {
                int j13 = tlVar4.mo21091j();
                tlVar4.mo21104w(-2);
                int i15 = (j13 * 6) + 2;
                xgVar.mo21513b(tlVar4, i15);
                i = i14 + 1 + i15;
            }
            this.f25409r = i;
            i12 = this.f25408q + i;
            this.f25408q = i12;
        } else {
            this.f25409r = 0;
        }
        if (this.f25407p.f24770c.f14471g == 1) {
            this.f25408q = i12 - 8;
            ogVar2.mo19989i(8, false);
        }
        this.f25400i = 4;
        this.f25410s = 0;
        C5670vh vhVar4 = this.f25407p;
        C5041ei eiVar6 = vhVar4.f24768a;
        C4930bi biVar = vhVar4.f24770c;
        C5743xg xgVar2 = vhVar4.f24769b;
        int i16 = vhVar4.f24772e;
        int i17 = biVar.f14475k;
        if (i17 == 0) {
            while (true) {
                int i18 = this.f25409r;
                int i19 = this.f25408q;
                if (i18 >= i19) {
                    break;
                }
                this.f25409r += xgVar2.mo21515d(ogVar2, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.f25394c.f23918a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.f25409r < this.f25408q) {
                int i22 = this.f25410s;
                if (i22 == 0) {
                    ogVar2.mo19988h(bArr, i21, i20, false);
                    this.f25394c.mo21103v(0);
                    this.f25410s = this.f25394c.mo21090i() - 1;
                    this.f25393b.mo21103v(0);
                    xgVar2.mo21513b(this.f25393b, 4);
                    xgVar2.mo21513b(this.f25394c, 1);
                    this.f25409r += 5;
                    this.f25408q += i21;
                } else {
                    int d7 = xgVar2.mo21515d(ogVar2, i22, false);
                    this.f25409r += d7;
                    this.f25410s -= d7;
                }
            }
        }
        long j14 = (eiVar6.f15963j[i16] + ((long) eiVar6.f15962i[i16])) * 1000;
        boolean z2 = eiVar6.f15965l;
        boolean z3 = (true != z2 ? (char) 0 : 0) | eiVar6.f15964k[i16];
        if (z2) {
            ciVar = eiVar6.f15967n;
            if (ciVar == null) {
                ciVar = biVar.f14472h[eiVar6.f15954a.f23872a];
            }
            C5670vh vhVar5 = this.f25407p;
            if (ciVar != vhVar5.f24776i) {
                wgVar2 = new C5706wg(1, ciVar.f14983b);
            } else {
                wgVar2 = vhVar5.f24775h;
            }
            wgVar = wgVar2;
        } else {
            ciVar = null;
            wgVar = null;
        }
        C5670vh vhVar6 = this.f25407p;
        vhVar6.f24775h = wgVar;
        vhVar6.f24776i = ciVar;
        xgVar2.mo21514c(j14, z3 ? 1 : 0, this.f25408q, 0, wgVar);
        if (this.f25399h.isEmpty()) {
            C5670vh vhVar7 = this.f25407p;
            vhVar7.f24772e++;
            int i23 = vhVar7.f24773f + 1;
            vhVar7.f24773f = i23;
            int[] iArr3 = eiVar6.f15960g;
            int i24 = vhVar7.f24774g;
            if (i23 == iArr3[i24]) {
                vhVar7.f24774g = i24 + 1;
                vhVar7.f24773f = 0;
                this.f25407p = null;
            }
            this.f25400i = 3;
            return 0;
        }
        C5633uh removeFirst = this.f25399h.removeFirst();
        int i25 = removeFirst.f24337b;
        long j15 = removeFirst.f24336a;
        throw null;
    }
}
