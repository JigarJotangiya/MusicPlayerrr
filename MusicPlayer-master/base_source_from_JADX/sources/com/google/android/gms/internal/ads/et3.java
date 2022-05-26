package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class et3 extends zt3 {

    /* renamed from: A */
    private final vs3 f16087A;

    /* renamed from: B */
    private x34 f16088B;

    /* renamed from: b */
    final c54 f16089b;

    /* renamed from: c */
    final e50 f16090c;

    /* renamed from: d */
    private final lu3[] f16091d;

    /* renamed from: e */
    private final b54 f16092e;

    /* renamed from: f */
    private final r22 f16093f;

    /* renamed from: g */
    private final ot3 f16094g;

    /* renamed from: h */
    private final x82<f60> f16095h;

    /* renamed from: i */
    private final CopyOnWriteArraySet<jj3> f16096i;

    /* renamed from: j */
    private final od0 f16097j;

    /* renamed from: k */
    private final List<dt3> f16098k;

    /* renamed from: l */
    private final boolean f16099l = true;

    /* renamed from: m */
    private final r24 f16100m;

    /* renamed from: n */
    private final ex3 f16101n;

    /* renamed from: o */
    private final Looper f16102o;

    /* renamed from: p */
    private final l54 f16103p;

    /* renamed from: q */
    private final ht1 f16104q;

    /* renamed from: r */
    private int f16105r;

    /* renamed from: s */
    private int f16106s;

    /* renamed from: t */
    private boolean f16107t;

    /* renamed from: u */
    private int f16108u;

    /* renamed from: v */
    private e50 f16109v;

    /* renamed from: w */
    private C5755xs f16110w;

    /* renamed from: x */
    private fu3 f16111x;

    /* renamed from: y */
    private int f16112y;

    /* renamed from: z */
    private long f16113z;

    @SuppressLint({"HandlerLeak"})
    public et3(lu3[] lu3Arr, b54 b54, r24 r24, rt3 rt3, l54 l54, ex3 ex3, boolean z, ou3 ou3, long j, long j2, hd3 hd3, long j3, boolean z2, ht1 ht1, Looper looper, t90 t90, e50 e50, byte[] bArr) {
        lu3[] lu3Arr2 = lu3Arr;
        l54 l542 = l54;
        ex3 ex32 = ex3;
        ht1 ht12 = ht1;
        Looper looper2 = looper;
        t90 t902 = t90;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = wy2.f25583e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        int length = lu3Arr2.length;
        Objects.requireNonNull(lu3Arr);
        this.f16091d = lu3Arr2;
        Objects.requireNonNull(b54);
        this.f16092e = b54;
        this.f16100m = r24;
        this.f16103p = l542;
        this.f16101n = ex32;
        this.f16102o = looper2;
        this.f16104q = ht12;
        x82<f60> x82 = new x82<>(looper2, ht12, new us3(t902));
        this.f16095h = x82;
        this.f16096i = new CopyOnWriteArraySet<>();
        this.f16098k = new ArrayList();
        this.f16088B = new x34(0);
        c54 c54 = r16;
        c54 c542 = new c54(new nu3[2], new h44[2], au0.f14078b, (Object) null, (byte[]) null);
        this.f16089b = c542;
        this.f16097j = new od0();
        g30 g30 = new g30();
        g30.mo17823c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19, 29);
        g30.mo17824d(28, true);
        g30.mo17822b(e50);
        e50 e = g30.mo17825e();
        this.f16090c = e;
        g30 g302 = new g30();
        g302.mo17822b(e);
        g302.mo17821a(3);
        g302.mo17821a(9);
        this.f16109v = g302.mo17825e();
        this.f16110w = C5755xs.f25939s;
        this.f16112y = -1;
        this.f16093f = ht12.mo18209a(looper2, (Handler.Callback) null);
        vs3 vs3 = r5;
        vs3 vs32 = new vs3(this);
        this.f16087A = vs32;
        this.f16111x = fu3.m23976h(c542);
        ex32.mo17392R(t902, looper2);
        x82.mo21988b(ex32);
        l542.mo19074a(new Handler(looper2), ex32);
        ot3 ot3 = r1;
        ot3 ot32 = new ot3(lu3Arr, b54, c54, rt3, l54, 0, false, ex3, ou3, hd3, 500, false, looper, ht1, vs3, (byte[]) null);
        this.f16094g = ot3;
    }

    /* renamed from: A */
    private final long m23143A(bg0 bg0, f24 f24, long j) {
        bg0.mo16241n(f24.f25531a, this.f16097j);
        return j;
    }

    /* renamed from: B */
    private final Pair<Object, Long> m23144B(bg0 bg0, int i, long j) {
        if (bg0.mo16242o()) {
            this.f16112y = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f16113z = j;
            return null;
        }
        if (i == -1 || i >= bg0.mo15664c()) {
            i = bg0.mo16233g(false);
            long j2 = bg0.mo15666e(i, this.f26906a, 0).f16573k;
            j = bw3.m21570d(0);
        }
        return bg0.mo16239l(this.f26906a, this.f16097j, i, bw3.m21569c(j));
    }

    /* renamed from: C */
    private final fu3 m23145C(fu3 fu3, bg0 bg0, Pair<Object, Long> pair) {
        f24 f24;
        uj0 uj0;
        c54 c54;
        f24 f242;
        List list;
        int i;
        fu3 fu32;
        long j;
        bg0 bg02 = bg0;
        Pair<Object, Long> pair2 = pair;
        gs1.m24486d(bg0.mo16242o() || pair2 != null);
        bg0 bg03 = fu3.f16764a;
        fu3 g = fu3.mo17752g(bg0);
        if (bg0.mo16242o()) {
            f24 i2 = fu3.m23977i();
            long c = bw3.m21569c(this.f16113z);
            fu3 a = g.mo17747b(i2, c, c, c, 0, uj0.f24342d, this.f16089b, g43.zzo()).mo17746a(i2);
            a.f16780q = a.f16782s;
            return a;
        }
        Object obj = g.f16765b.f25531a;
        int i3 = wy2.f25579a;
        boolean z = !obj.equals(pair2.first);
        if (z) {
            f24 = new f24(pair2.first);
        } else {
            f24 = g.f16765b;
        }
        f24 f243 = f24;
        long longValue = ((Long) pair2.second).longValue();
        long c2 = bw3.m21569c(mo17324h());
        if (!bg03.mo16242o()) {
            bg03.mo16241n(obj, this.f16097j);
        }
        if (z || longValue < c2) {
            f24 f244 = f243;
            gs1.m24488f(!f244.mo21902b());
            if (z) {
                uj0 = uj0.f24342d;
            } else {
                uj0 = g.f16771h;
            }
            uj0 uj02 = uj0;
            if (z) {
                f242 = f244;
                c54 = this.f16089b;
            } else {
                f242 = f244;
                c54 = g.f16772i;
            }
            c54 c542 = c54;
            if (z) {
                list = g43.zzo();
            } else {
                list = g.f16773j;
            }
            fu3 a2 = g.mo17747b(f242, longValue, longValue, longValue, 0, uj02, c542, list).mo17746a(f242);
            a2.f16780q = longValue;
            return a2;
        }
        if (i == 0) {
            int a3 = bg02.mo15662a(g.f16774k.f25531a);
            if (a3 != -1 && bg02.mo15665d(a3, this.f16097j, false).f20976c == bg02.mo16241n(f243.f25531a, this.f16097j).f20976c) {
                return g;
            }
            bg02.mo16241n(f243.f25531a, this.f16097j);
            if (f243.mo21902b()) {
                j = this.f16097j.mo19970f(f243.f25532b, f243.f25533c);
            } else {
                j = this.f16097j.f20977d;
            }
            fu32 = g.mo17747b(f243, g.f16782s, g.f16782s, g.f16767d, j - g.f16782s, g.f16771h, g.f16772i, g.f16773j).mo17746a(f243);
            fu32.f16780q = j;
        } else {
            f24 f245 = f243;
            gs1.m24488f(!f245.mo21902b());
            long max = Math.max(0, g.f16781r - (longValue - c2));
            long j2 = g.f16780q;
            if (g.f16774k.equals(g.f16765b)) {
                j2 = longValue + max;
            }
            fu32 = g.mo17747b(f245, longValue, longValue, longValue, max, g.f16771h, g.f16772i, g.f16773j);
            fu32.f16780q = j2;
        }
        return fu32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0428, code lost:
        if (r4.mo15666e(mo17321d(), r0.f26906a, 0).f16569g != false) goto L_0x042a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x04a8  */
    /* JADX WARNING: Removed duplicated region for block: B:195:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0269  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23146D(com.google.android.gms.internal.ads.fu3 r41, int r42, int r43, boolean r44, boolean r45, int r46, long r47, int r49) {
        /*
            r40 = this;
            r0 = r40
            r1 = r41
            r2 = r46
            com.google.android.gms.internal.ads.fu3 r3 = r0.f16111x
            r0.f16111x = r1
            com.google.android.gms.internal.ads.bg0 r4 = r3.f16764a
            com.google.android.gms.internal.ads.bg0 r5 = r1.f16764a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.bg0 r6 = r3.f16764a
            com.google.android.gms.internal.ads.bg0 r7 = r1.f16764a
            boolean r8 = r7.mo16242o()
            r10 = 3
            r11 = 0
            r13 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r15 = 0
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.mo16242o()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.mo16242o()
            boolean r9 = r6.mo16242o()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.f24 r8 = r3.f16765b
            java.lang.Object r8 = r8.f25531a
            com.google.android.gms.internal.ads.od0 r9 = r0.f16097j
            com.google.android.gms.internal.ads.od0 r8 = r6.mo16241n(r8, r9)
            int r8 = r8.f20976c
            com.google.android.gms.internal.ads.ff0 r9 = r0.f26906a
            com.google.android.gms.internal.ads.ff0 r6 = r6.mo15666e(r8, r9, r11)
            java.lang.Object r6 = r6.f16563a
            com.google.android.gms.internal.ads.f24 r8 = r1.f16765b
            java.lang.Object r8 = r8.f25531a
            com.google.android.gms.internal.ads.od0 r9 = r0.f16097j
            com.google.android.gms.internal.ads.od0 r8 = r7.mo16241n(r8, r9)
            int r8 = r8.f20976c
            com.google.android.gms.internal.ads.ff0 r9 = r0.f26906a
            com.google.android.gms.internal.ads.ff0 r7 = r7.mo15666e(r8, r9, r11)
            java.lang.Object r7 = r7.f16563a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r45 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = 1
            goto L_0x008a
        L_0x0081:
            if (r45 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = 3
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r45 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.f24 r4 = r3.f16765b
            long r6 = r4.f25534d
            com.google.android.gms.internal.ads.f24 r4 = r1.f16765b
            long r8 = r4.f25534d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r14)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.xs r7 = r0.f16110w
            if (r6 == 0) goto L_0x0103
            com.google.android.gms.internal.ads.bg0 r7 = r1.f16764a
            boolean r7 = r7.mo16242o()
            if (r7 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.bg0 r7 = r1.f16764a
            com.google.android.gms.internal.ads.f24 r9 = r1.f16765b
            java.lang.Object r9 = r9.f25531a
            com.google.android.gms.internal.ads.od0 r14 = r0.f16097j
            com.google.android.gms.internal.ads.od0 r7 = r7.mo16241n(r9, r14)
            int r7 = r7.f20976c
            com.google.android.gms.internal.ads.bg0 r9 = r1.f16764a
            com.google.android.gms.internal.ads.ff0 r14 = r0.f26906a
            com.google.android.gms.internal.ads.ff0 r7 = r9.mo15666e(r7, r14, r11)
            com.google.android.gms.internal.ads.zn r7 = r7.f16564b
            goto L_0x00f6
        L_0x00f5:
            r7 = 0
        L_0x00f6:
            if (r7 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.xs r9 = r7.f26841d
            goto L_0x00fd
        L_0x00fb:
            com.google.android.gms.internal.ads.xs r9 = com.google.android.gms.internal.ads.C5755xs.f25939s
        L_0x00fd:
            r39 = r9
            r9 = r7
            r7 = r39
            goto L_0x0104
        L_0x0103:
            r9 = 0
        L_0x0104:
            if (r6 != 0) goto L_0x0110
            java.util.List<com.google.android.gms.internal.ads.zzdd> r14 = r3.f16773j
            java.util.List<com.google.android.gms.internal.ads.zzdd> r10 = r1.f16773j
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x013e
        L_0x0110:
            com.google.android.gms.internal.ads.zq r7 = r7.mo22068a()
            java.util.List<com.google.android.gms.internal.ads.zzdd> r10 = r1.f16773j
            r14 = 0
        L_0x0117:
            int r8 = r10.size()
            if (r14 >= r8) goto L_0x013a
            java.lang.Object r8 = r10.get(r14)
            com.google.android.gms.internal.ads.zzdd r8 = (com.google.android.gms.internal.ads.zzdd) r8
            r13 = 0
        L_0x0124:
            int r11 = r8.mo22581a()
            if (r13 >= r11) goto L_0x0134
            com.google.android.gms.internal.ads.zzdc r11 = r8.mo22582b(r13)
            r11.mo22456E(r7)
            int r13 = r13 + 1
            goto L_0x0124
        L_0x0134:
            int r14 = r14 + 1
            r11 = 0
            r13 = -1
            goto L_0x0117
        L_0x013a:
            com.google.android.gms.internal.ads.xs r7 = r7.mo22402B()
        L_0x013e:
            com.google.android.gms.internal.ads.xs r8 = r0.f16110w
            boolean r8 = r7.equals(r8)
            r8 = r8 ^ r5
            r0.f16110w = r7
            com.google.android.gms.internal.ads.bg0 r7 = r3.f16764a
            com.google.android.gms.internal.ads.bg0 r10 = r1.f16764a
            boolean r7 = r7.equals(r10)
            if (r7 != 0) goto L_0x015d
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r7 = r0.f16095h
            com.google.android.gms.internal.ads.ps3 r10 = new com.google.android.gms.internal.ads.ps3
            r11 = r42
            r10.<init>(r1, r11)
            r7.mo21990d(r15, r10)
        L_0x015d:
            r7 = 11
            if (r45 == 0) goto L_0x0289
            com.google.android.gms.internal.ads.od0 r10 = new com.google.android.gms.internal.ads.od0
            r10.<init>()
            com.google.android.gms.internal.ads.bg0 r11 = r3.f16764a
            boolean r11 = r11.mo16242o()
            if (r11 != 0) goto L_0x019c
            com.google.android.gms.internal.ads.f24 r11 = r3.f16765b
            java.lang.Object r11 = r11.f25531a
            com.google.android.gms.internal.ads.bg0 r12 = r3.f16764a
            r12.mo16241n(r11, r10)
            int r12 = r10.f20976c
            com.google.android.gms.internal.ads.bg0 r13 = r3.f16764a
            int r13 = r13.mo15662a(r11)
            com.google.android.gms.internal.ads.bg0 r14 = r3.f16764a
            com.google.android.gms.internal.ads.ff0 r15 = r0.f26906a
            r16 = r6
            r5 = 0
            com.google.android.gms.internal.ads.ff0 r14 = r14.mo15666e(r12, r15, r5)
            java.lang.Object r5 = r14.f16563a
            com.google.android.gms.internal.ads.ff0 r6 = r0.f26906a
            com.google.android.gms.internal.ads.zn r6 = r6.f16564b
            r18 = r5
            r20 = r6
            r21 = r11
            r19 = r12
            r22 = r13
            goto L_0x01a8
        L_0x019c:
            r16 = r6
            r19 = r49
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = -1
        L_0x01a8:
            if (r2 != 0) goto L_0x01db
            long r5 = r10.f20977d
            com.google.android.gms.internal.ads.f24 r11 = r3.f16765b
            boolean r11 = r11.mo21902b()
            if (r11 == 0) goto L_0x01c3
            com.google.android.gms.internal.ads.f24 r5 = r3.f16765b
            int r6 = r5.f25532b
            int r5 = r5.f25533c
            long r5 = r10.mo19970f(r6, r5)
            long r10 = m23151z(r3)
            goto L_0x01ed
        L_0x01c3:
            com.google.android.gms.internal.ads.f24 r10 = r3.f16765b
            int r10 = r10.f25535e
            r11 = -1
            if (r10 == r11) goto L_0x01ec
            com.google.android.gms.internal.ads.fu3 r10 = r0.f16111x
            com.google.android.gms.internal.ads.f24 r10 = r10.f16765b
            boolean r10 = r10.mo21902b()
            if (r10 == 0) goto L_0x01ec
            com.google.android.gms.internal.ads.fu3 r5 = r0.f16111x
            long r5 = m23151z(r5)
            goto L_0x01ec
        L_0x01db:
            com.google.android.gms.internal.ads.f24 r5 = r3.f16765b
            boolean r5 = r5.mo21902b()
            if (r5 == 0) goto L_0x01ea
            long r5 = r3.f16782s
            long r10 = m23151z(r3)
            goto L_0x01ed
        L_0x01ea:
            long r5 = r3.f16782s
        L_0x01ec:
            r10 = r5
        L_0x01ed:
            com.google.android.gms.internal.ads.s80 r12 = new com.google.android.gms.internal.ads.s80
            long r23 = com.google.android.gms.internal.ads.bw3.m21570d(r5)
            long r25 = com.google.android.gms.internal.ads.bw3.m21570d(r10)
            com.google.android.gms.internal.ads.f24 r5 = r3.f16765b
            int r6 = r5.f25532b
            int r5 = r5.f25533c
            r17 = r12
            r27 = r6
            r28 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r25, r27, r28)
            int r5 = r40.mo17321d()
            com.google.android.gms.internal.ads.fu3 r6 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r6 = r6.f16764a
            boolean r6 = r6.mo16242o()
            if (r6 != 0) goto L_0x0244
            com.google.android.gms.internal.ads.fu3 r6 = r0.f16111x
            com.google.android.gms.internal.ads.f24 r10 = r6.f16765b
            java.lang.Object r10 = r10.f25531a
            com.google.android.gms.internal.ads.bg0 r6 = r6.f16764a
            com.google.android.gms.internal.ads.od0 r11 = r0.f16097j
            r6.mo16241n(r10, r11)
            com.google.android.gms.internal.ads.fu3 r6 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r6 = r6.f16764a
            int r6 = r6.mo15662a(r10)
            com.google.android.gms.internal.ads.fu3 r11 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r11 = r11.f16764a
            com.google.android.gms.internal.ads.ff0 r13 = r0.f26906a
            r14 = 0
            com.google.android.gms.internal.ads.ff0 r11 = r11.mo15666e(r5, r13, r14)
            java.lang.Object r11 = r11.f16563a
            com.google.android.gms.internal.ads.ff0 r13 = r0.f26906a
            com.google.android.gms.internal.ads.zn r13 = r13.f16564b
            r32 = r6
            r31 = r10
            r28 = r11
            r30 = r13
            goto L_0x024c
        L_0x0244:
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = -1
        L_0x024c:
            long r33 = com.google.android.gms.internal.ads.bw3.m21570d(r47)
            com.google.android.gms.internal.ads.s80 r6 = new com.google.android.gms.internal.ads.s80
            com.google.android.gms.internal.ads.fu3 r10 = r0.f16111x
            com.google.android.gms.internal.ads.f24 r10 = r10.f16765b
            boolean r10 = r10.mo21902b()
            if (r10 == 0) goto L_0x0269
            com.google.android.gms.internal.ads.fu3 r10 = r0.f16111x
            long r10 = m23151z(r10)
            long r10 = com.google.android.gms.internal.ads.bw3.m21570d(r10)
            r35 = r10
            goto L_0x026b
        L_0x0269:
            r35 = r33
        L_0x026b:
            com.google.android.gms.internal.ads.fu3 r10 = r0.f16111x
            com.google.android.gms.internal.ads.f24 r10 = r10.f16765b
            int r11 = r10.f25532b
            int r10 = r10.f25533c
            r27 = r6
            r29 = r5
            r37 = r11
            r38 = r10
            r27.<init>(r28, r29, r30, r31, r32, r33, r35, r37, r38)
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r5 = r0.f16095h
            com.google.android.gms.internal.ads.rs3 r10 = new com.google.android.gms.internal.ads.rs3
            r10.<init>(r2, r12, r6)
            r5.mo21990d(r7, r10)
            goto L_0x028b
        L_0x0289:
            r16 = r6
        L_0x028b:
            if (r16 == 0) goto L_0x0298
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.xs3 r5 = new com.google.android.gms.internal.ads.xs3
            r5.<init>(r9, r4)
            r4 = 1
            r2.mo21990d(r4, r5)
        L_0x0298:
            com.google.android.gms.internal.ads.ji3 r2 = r3.f16769f
            com.google.android.gms.internal.ads.ji3 r4 = r1.f16769f
            r5 = 10
            if (r2 == r4) goto L_0x02b8
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.bt3 r4 = new com.google.android.gms.internal.ads.bt3
            r4.<init>(r1)
            r2.mo21990d(r5, r4)
            com.google.android.gms.internal.ads.ji3 r2 = r1.f16769f
            if (r2 == 0) goto L_0x02b8
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.ct3 r4 = new com.google.android.gms.internal.ads.ct3
            r4.<init>(r1)
            r2.mo21990d(r5, r4)
        L_0x02b8:
            com.google.android.gms.internal.ads.c54 r2 = r3.f16772i
            com.google.android.gms.internal.ads.c54 r4 = r1.f16772i
            if (r2 == r4) goto L_0x02e4
            com.google.android.gms.internal.ads.b54 r2 = r0.f16092e
            java.lang.Object r4 = r4.f14832d
            r2.mo16074b(r4)
            com.google.android.gms.internal.ads.uk0 r2 = new com.google.android.gms.internal.ads.uk0
            com.google.android.gms.internal.ads.c54 r4 = r1.f16772i
            com.google.android.gms.internal.ads.h44[] r4 = r4.f14833e
            r6 = 0
            r2.<init>(r4, r6)
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r4 = r0.f16095h
            com.google.android.gms.internal.ads.qs3 r6 = new com.google.android.gms.internal.ads.qs3
            r6.<init>(r1, r2)
            r2 = 2
            r4.mo21990d(r2, r6)
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r4 = r0.f16095h
            com.google.android.gms.internal.ads.gl3 r6 = new com.google.android.gms.internal.ads.gl3
            r6.<init>(r1)
            r4.mo21990d(r2, r6)
        L_0x02e4:
            if (r8 == 0) goto L_0x02f4
            com.google.android.gms.internal.ads.xs r2 = r0.f16110w
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r4 = r0.f16095h
            com.google.android.gms.internal.ads.zs3 r6 = new com.google.android.gms.internal.ads.zs3
            r6.<init>(r2)
            r2 = 14
            r4.mo21990d(r2, r6)
        L_0x02f4:
            boolean r2 = r3.f16770g
            boolean r4 = r1.f16770g
            if (r2 == r4) goto L_0x0305
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.fm3 r4 = new com.google.android.gms.internal.ads.fm3
            r4.<init>(r1)
            r6 = 3
            r2.mo21990d(r6, r4)
        L_0x0305:
            int r2 = r3.f16768e
            int r4 = r1.f16768e
            if (r2 != r4) goto L_0x0311
            boolean r2 = r3.f16775l
            boolean r4 = r1.f16775l
            if (r2 == r4) goto L_0x031c
        L_0x0311:
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.en3 r4 = new com.google.android.gms.internal.ads.en3
            r4.<init>(r1)
            r6 = -1
            r2.mo21990d(r6, r4)
        L_0x031c:
            int r2 = r3.f16768e
            int r4 = r1.f16768e
            r6 = 4
            if (r2 == r4) goto L_0x032d
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.eo3 r4 = new com.google.android.gms.internal.ads.eo3
            r4.<init>(r1)
            r2.mo21990d(r6, r4)
        L_0x032d:
            boolean r2 = r3.f16775l
            boolean r4 = r1.f16775l
            r8 = 5
            if (r2 == r4) goto L_0x0340
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.hs3 r4 = new com.google.android.gms.internal.ads.hs3
            r9 = r43
            r4.<init>(r1, r9)
            r2.mo21990d(r8, r4)
        L_0x0340:
            int r2 = r3.f16776m
            int r4 = r1.f16776m
            r9 = 6
            if (r2 == r4) goto L_0x0351
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.fp3 r4 = new com.google.android.gms.internal.ads.fp3
            r4.<init>(r1)
            r2.mo21990d(r9, r4)
        L_0x0351:
            boolean r2 = m23147E(r3)
            boolean r4 = m23147E(r41)
            r10 = 7
            if (r2 == r4) goto L_0x0366
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.gq3 r4 = new com.google.android.gms.internal.ads.gq3
            r4.<init>(r1)
            r2.mo21990d(r10, r4)
        L_0x0366:
            com.google.android.gms.internal.ads.i10 r2 = r3.f16777n
            com.google.android.gms.internal.ads.i10 r4 = r1.f16777n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x037c
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.gr3 r4 = new com.google.android.gms.internal.ads.gr3
            r4.<init>(r1)
            r11 = 12
            r2.mo21990d(r11, r4)
        L_0x037c:
            if (r44 == 0) goto L_0x0386
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.ts3 r4 = com.google.android.gms.internal.ads.ts3.f23982a
            r11 = -1
            r2.mo21990d(r11, r4)
        L_0x0386:
            com.google.android.gms.internal.ads.e50 r2 = r0.f16109v
            com.google.android.gms.internal.ads.e50 r4 = r0.f16090c
            com.google.android.gms.internal.ads.g30 r11 = new com.google.android.gms.internal.ads.g30
            r11.<init>()
            r11.mo17822b(r4)
            boolean r4 = r40.zzp()
            r12 = 1
            r4 = r4 ^ r12
            r12 = 3
            r11.mo17824d(r12, r4)
            boolean r4 = r40.mo22434n()
            if (r4 == 0) goto L_0x03aa
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03aa
            r4 = 1
            goto L_0x03ab
        L_0x03aa:
            r4 = 0
        L_0x03ab:
            r11.mo17824d(r6, r4)
            boolean r4 = r40.mo22432f()
            if (r4 == 0) goto L_0x03bc
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03bc
            r4 = 1
            goto L_0x03bd
        L_0x03bc:
            r4 = 0
        L_0x03bd:
            r11.mo17824d(r8, r4)
            com.google.android.gms.internal.ads.fu3 r4 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r4 = r4.f16764a
            boolean r4 = r4.mo16242o()
            if (r4 != 0) goto L_0x03e4
            boolean r4 = r40.mo22432f()
            if (r4 != 0) goto L_0x03dc
            boolean r4 = r40.mo22433k()
            if (r4 == 0) goto L_0x03dc
            boolean r4 = r40.mo22434n()
            if (r4 == 0) goto L_0x03e4
        L_0x03dc:
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03e4
            r4 = 1
            goto L_0x03e5
        L_0x03e4:
            r4 = 0
        L_0x03e5:
            r11.mo17824d(r9, r4)
            boolean r4 = r40.mo22431b()
            if (r4 == 0) goto L_0x03f6
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x03f6
            r4 = 1
            goto L_0x03f7
        L_0x03f6:
            r4 = 0
        L_0x03f7:
            r11.mo17824d(r10, r4)
            com.google.android.gms.internal.ads.fu3 r4 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r4 = r4.f16764a
            boolean r4 = r4.mo16242o()
            if (r4 != 0) goto L_0x0432
            boolean r4 = r40.mo22431b()
            if (r4 != 0) goto L_0x042a
            boolean r4 = r40.mo22433k()
            if (r4 == 0) goto L_0x0432
            com.google.android.gms.internal.ads.fu3 r4 = r0.f16111x
            com.google.android.gms.internal.ads.bg0 r4 = r4.f16764a
            boolean r6 = r4.mo16242o()
            if (r6 != 0) goto L_0x0432
            int r6 = r40.mo17321d()
            com.google.android.gms.internal.ads.ff0 r8 = r0.f26906a
            r9 = 0
            com.google.android.gms.internal.ads.ff0 r4 = r4.mo15666e(r6, r8, r9)
            boolean r4 = r4.f16569g
            if (r4 == 0) goto L_0x0432
        L_0x042a:
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0432
            r4 = 1
            goto L_0x0433
        L_0x0432:
            r4 = 0
        L_0x0433:
            r6 = 8
            r11.mo17824d(r6, r4)
            r4 = 9
            boolean r6 = r40.zzp()
            r8 = 1
            r6 = r6 ^ r8
            r11.mo17824d(r4, r6)
            boolean r4 = r40.mo22434n()
            if (r4 == 0) goto L_0x0451
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0451
            r4 = 1
            goto L_0x0452
        L_0x0451:
            r4 = 0
        L_0x0452:
            r11.mo17824d(r5, r4)
            boolean r4 = r40.mo22434n()
            if (r4 == 0) goto L_0x0463
            boolean r4 = r40.zzp()
            if (r4 != 0) goto L_0x0463
            r5 = 1
            goto L_0x0464
        L_0x0463:
            r5 = 0
        L_0x0464:
            r11.mo17824d(r7, r5)
            com.google.android.gms.internal.ads.e50 r4 = r11.mo17825e()
            r0.f16109v = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x047f
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            com.google.android.gms.internal.ads.at3 r4 = new com.google.android.gms.internal.ads.at3
            r4.<init>(r0)
            r5 = 13
            r2.mo21990d(r5, r4)
        L_0x047f:
            com.google.android.gms.internal.ads.x82<com.google.android.gms.internal.ads.f60> r2 = r0.f16095h
            r2.mo21989c()
            boolean r2 = r3.f16778o
            boolean r4 = r1.f16778o
            if (r2 == r4) goto L_0x04a2
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.jj3> r2 = r0.f16096i
            java.util.Iterator r2 = r2.iterator()
        L_0x0490:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r2.next()
            com.google.android.gms.internal.ads.jj3 r4 = (com.google.android.gms.internal.ads.jj3) r4
            boolean r5 = r1.f16778o
            r4.mo18642c(r5)
            goto L_0x0490
        L_0x04a2:
            boolean r2 = r3.f16779p
            boolean r3 = r1.f16779p
            if (r2 == r3) goto L_0x04c0
            java.util.concurrent.CopyOnWriteArraySet<com.google.android.gms.internal.ads.jj3> r2 = r0.f16096i
            java.util.Iterator r2 = r2.iterator()
        L_0x04ae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04c0
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.jj3 r3 = (com.google.android.gms.internal.ads.jj3) r3
            boolean r4 = r1.f16779p
            r3.mo18643p(r4)
            goto L_0x04ae
        L_0x04c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.et3.m23146D(com.google.android.gms.internal.ads.fu3, int, int, boolean, boolean, int, long, int):void");
    }

    /* renamed from: E */
    private static boolean m23147E(fu3 fu3) {
        return fu3.f16768e == 3 && fu3.f16775l && fu3.f16776m == 0;
    }

    /* renamed from: x */
    private final int m23149x() {
        if (this.f16111x.f16764a.mo16242o()) {
            return this.f16112y;
        }
        fu3 fu3 = this.f16111x;
        return fu3.f16764a.mo16241n(fu3.f16765b.f25531a, this.f16097j).f20976c;
    }

    /* renamed from: y */
    private final long m23150y(fu3 fu3) {
        if (fu3.f16764a.mo16242o()) {
            return bw3.m21569c(this.f16113z);
        }
        if (fu3.f16765b.mo21902b()) {
            return fu3.f16782s;
        }
        bg0 bg0 = fu3.f16764a;
        f24 f24 = fu3.f16765b;
        long j = fu3.f16782s;
        m23143A(bg0, f24, j);
        return j;
    }

    /* renamed from: z */
    private static long m23151z(fu3 fu3) {
        ff0 ff0 = new ff0();
        od0 od0 = new od0();
        fu3.f16764a.mo16241n(fu3.f16765b.f25531a, od0);
        long j = fu3.f16766c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = fu3.f16764a.mo15666e(od0.f20976c, ff0, 0).f16573k;
        return 0;
    }

    /* renamed from: F */
    public final int mo17309F() {
        return this.f16111x.f16768e;
    }

    /* renamed from: G */
    public final int mo17310G() {
        int length = this.f16091d.length;
        return 2;
    }

    /* renamed from: H */
    public final long mo17311H() {
        if (zzp()) {
            fu3 fu3 = this.f16111x;
            if (fu3.f16774k.equals(fu3.f16765b)) {
                return bw3.m21570d(this.f16111x.f16780q);
            }
            return mo17312I();
        } else if (this.f16111x.f16764a.mo16242o()) {
            return this.f16113z;
        } else {
            fu3 fu32 = this.f16111x;
            long j = 0;
            if (fu32.f16774k.f25534d != fu32.f16765b.f25534d) {
                return bw3.m21570d(fu32.f16764a.mo15666e(mo17321d(), this.f26906a, 0).f16574l);
            }
            long j2 = fu32.f16780q;
            if (this.f16111x.f16774k.mo21902b()) {
                fu3 fu33 = this.f16111x;
                fu33.f16764a.mo16241n(fu33.f16774k.f25531a, this.f16097j).mo19971g(this.f16111x.f16774k.f25532b);
            } else {
                j = j2;
            }
            fu3 fu34 = this.f16111x;
            m23143A(fu34.f16764a, fu34.f16774k, j);
            return bw3.m21570d(j);
        }
    }

    /* renamed from: I */
    public final long mo17312I() {
        if (!zzp()) {
            bg0 bg0 = this.f16111x.f16764a;
            if (bg0.mo16242o()) {
                return -9223372036854775807L;
            }
            return bw3.m21570d(bg0.mo15666e(mo17321d(), this.f26906a, 0).f16574l);
        }
        fu3 fu3 = this.f16111x;
        f24 f24 = fu3.f16765b;
        fu3.f16764a.mo16241n(f24.f25531a, this.f16097j);
        return bw3.m21570d(this.f16097j.mo19970f(f24.f25532b, f24.f25533c));
    }

    /* renamed from: J */
    public final Looper mo17313J() {
        return this.f16102o;
    }

    /* renamed from: K */
    public final iu3 mo17314K(hu3 hu3) {
        return new iu3(this.f16094g, hu3, this.f16111x.f16764a, mo17321d(), this.f16104q, this.f16094g.mo20119Q());
    }

    /* renamed from: L */
    public final void mo17315L(jj3 jj3) {
        this.f16096i.add(jj3);
    }

    /* renamed from: M */
    public final void mo17316M(f60 f60) {
        this.f16095h.mo21988b(f60);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final /* synthetic */ void mo17317N(mt3 mt3) {
        long j;
        boolean z;
        long j2;
        int i = this.f16105r - mt3.f20167c;
        this.f16105r = i;
        boolean z2 = true;
        if (mt3.f20168d) {
            this.f16106s = mt3.f20169e;
            this.f16107t = true;
        }
        if (mt3.f20170f) {
            this.f16108u = mt3.f20171g;
        }
        if (i == 0) {
            bg0 bg0 = mt3.f20166b.f16764a;
            if (!this.f16111x.f16764a.mo16242o() && bg0.mo16242o()) {
                this.f16112y = -1;
                this.f16113z = 0;
            }
            if (!bg0.mo16242o()) {
                List<bg0> y = ((ju3) bg0).mo18743y();
                gs1.m24488f(y.size() == this.f16098k.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    this.f16098k.get(i2).f15748b = y.get(i2);
                }
            }
            if (this.f16107t) {
                if (mt3.f20166b.f16765b.equals(this.f16111x.f16765b) && mt3.f20166b.f16767d == this.f16111x.f16782s) {
                    z2 = false;
                }
                if (z2) {
                    if (bg0.mo16242o() || mt3.f20166b.f16765b.mo21902b()) {
                        j2 = mt3.f20166b.f16767d;
                    } else {
                        fu3 fu3 = mt3.f20166b;
                        f24 f24 = fu3.f16765b;
                        j2 = fu3.f16767d;
                        m23143A(bg0, f24, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f16107t = false;
            m23146D(mt3.f20166b, 1, this.f16108u, false, z, this.f16106s, j, -1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo17318O(mt3 mt3) {
        this.f16093f.mo20553a(new ws3(this, mt3));
    }

    /* renamed from: a */
    public final void mo17319a(int i, long j) {
        int i2 = i;
        long j2 = j;
        bg0 bg0 = this.f16111x.f16764a;
        if (i2 < 0 || (!bg0.mo16242o() && i2 >= bg0.mo15664c())) {
            throw new C5727x0(bg0, i, j2);
        }
        int i3 = 1;
        this.f16105r++;
        if (!zzp()) {
            if (this.f16111x.f16768e != 1) {
                i3 = 2;
            }
            int d = mo17321d();
            fu3 C = m23145C(this.f16111x.mo17751f(i3), bg0, m23144B(bg0, i, j2));
            this.f16094g.mo20122W(bg0, i, bw3.m21569c(j));
            m23146D(C, 0, 1, true, true, 1, m23150y(C), d);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        mt3 mt3 = new mt3(this.f16111x);
        mt3.mo19543a(1);
        this.f16087A.f24917a.mo17318O(mt3);
    }

    /* renamed from: c */
    public final int mo17320c() {
        if (zzp()) {
            return this.f16111x.f16765b.f25533c;
        }
        return -1;
    }

    /* renamed from: d */
    public final int mo17321d() {
        int x = m23149x();
        if (x == -1) {
            return 0;
        }
        return x;
    }

    /* renamed from: e */
    public final int mo17322e() {
        if (this.f16111x.f16764a.mo16242o()) {
            return 0;
        }
        fu3 fu3 = this.f16111x;
        return fu3.f16764a.mo15662a(fu3.f16765b.f25531a);
    }

    /* renamed from: g */
    public final int mo17323g() {
        return 0;
    }

    /* renamed from: h */
    public final long mo17324h() {
        if (!zzp()) {
            return mo17325i();
        }
        fu3 fu3 = this.f16111x;
        fu3.f16764a.mo16241n(fu3.f16765b.f25531a, this.f16097j);
        fu3 fu32 = this.f16111x;
        if (fu32.f16766c != -9223372036854775807L) {
            return bw3.m21570d(0) + bw3.m21570d(this.f16111x.f16766c);
        }
        long j = fu32.f16764a.mo15666e(mo17321d(), this.f26906a, 0).f16573k;
        return bw3.m21570d(0);
    }

    /* renamed from: i */
    public final long mo17325i() {
        return bw3.m21570d(m23150y(this.f16111x));
    }

    /* renamed from: j */
    public final long mo17326j() {
        return bw3.m21570d(this.f16111x.f16781r);
    }

    /* renamed from: l */
    public final boolean mo17327l() {
        return false;
    }

    /* renamed from: m */
    public final bg0 mo17328m() {
        return this.f16111x.f16764a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo17329o(f60 f60) {
        f60.mo17398Y(this.f16109v);
    }

    /* renamed from: q */
    public final void mo17330q() {
        fu3 fu3 = this.f16111x;
        if (fu3.f16768e == 1) {
            fu3 e = fu3.mo17750e((ji3) null);
            fu3 f = e.mo17751f(true != e.f16764a.mo16242o() ? 2 : 4);
            this.f16105r++;
            this.f16094g.mo20121V();
            m23146D(f, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: r */
    public final void mo17331r() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = wy2.f25583e;
        String a = g54.m24173a();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 36 + String.valueOf(str).length() + String.valueOf(a).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.15.1] [");
        sb.append(str);
        sb.append("] [");
        sb.append(a);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        if (!this.f16094g.mo20125Z()) {
            x82<f60> x82 = this.f16095h;
            x82.mo21990d(10, ss3.f23621a);
            x82.mo21989c();
        }
        this.f16095h.mo21991e();
        this.f16093f.mo20556d((Object) null);
        ex3 ex3 = this.f16101n;
        if (ex3 != null) {
            this.f16103p.mo19075c(ex3);
        }
        fu3 f = this.f16111x.mo17751f(1);
        this.f16111x = f;
        fu3 a2 = f.mo17746a(f.f16765b);
        this.f16111x = a2;
        a2.f16780q = a2.f16782s;
        this.f16111x.f16781r = 0;
    }

    /* renamed from: s */
    public final void mo17332s(List<i24> list, boolean z) {
        m23149x();
        mo17325i();
        this.f16105r++;
        if (!this.f16098k.isEmpty()) {
            int size = this.f16098k.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f16098k.remove(i);
            }
            this.f16088B = this.f16088B.mo21973h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            cu3 cu3 = new cu3(list.get(i2), this.f16099l);
            arrayList.add(cu3);
            this.f16098k.add(i2, new dt3(cu3.f15156b, cu3.f15155a.mo16021F()));
        }
        this.f16088B = this.f16088B.mo21972g(0, arrayList.size());
        ju3 ju3 = new ju3(this.f16098k, this.f16088B, (x34) null);
        if (ju3.mo16242o() || ju3.mo15664c() >= 0) {
            int g = ju3.mo16233g(false);
            fu3 C = m23145C(this.f16111x, ju3, m23144B(ju3, g, -9223372036854775807L));
            int i3 = C.f16768e;
            if (!(g == -1 || i3 == 1)) {
                i3 = (ju3.mo16242o() || g >= ju3.mo15664c()) ? 4 : 2;
            }
            fu3 f = C.mo17751f(i3);
            this.f16094g.mo20126a0(arrayList, g, bw3.m21569c(-9223372036854775807L), this.f16088B);
            m23146D(f, 0, 1, false, !this.f16111x.f16765b.f25531a.equals(f.f16765b.f25531a) && !this.f16111x.f16764a.mo16242o(), 4, m23150y(f), -1);
            return;
        }
        throw new C5727x0(ju3, -1, -9223372036854775807L);
    }

    /* renamed from: t */
    public final void mo17333t(boolean z, int i, int i2) {
        fu3 fu3 = this.f16111x;
        if (fu3.f16775l != z || fu3.f16776m != i) {
            this.f16105r++;
            fu3 d = fu3.mo17749d(z, i);
            this.f16094g.mo20123X(z, i);
            m23146D(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: u */
    public final void mo17334u(boolean z, ji3 ji3) {
        fu3 fu3 = this.f16111x;
        fu3 a = fu3.mo17746a(fu3.f16765b);
        a.f16780q = a.f16782s;
        a.f16781r = 0;
        fu3 f = a.mo17751f(1);
        if (ji3 != null) {
            f = f.mo17750e(ji3);
        }
        fu3 fu32 = f;
        this.f16105r++;
        this.f16094g.mo20124Y();
        m23146D(fu32, 0, 1, false, fu32.f16764a.mo16242o() && !this.f16111x.f16764a.mo16242o(), 4, m23150y(fu32), -1);
    }

    /* renamed from: v */
    public final boolean mo17335v() {
        return this.f16111x.f16779p;
    }

    /* renamed from: w */
    public final boolean mo17336w() {
        return this.f16111x.f16775l;
    }

    public final int zze() {
        if (zzp()) {
            return this.f16111x.f16765b.f25532b;
        }
        return -1;
    }

    public final boolean zzp() {
        return this.f16111x.f16765b.mo21902b();
    }
}
