package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class co3<T> implements to3<T> {

    /* renamed from: p */
    private static final int[] f15092p = new int[0];

    /* renamed from: q */
    private static final Unsafe f15093q = vp3.m32649q();

    /* renamed from: a */
    private final int[] f15094a;

    /* renamed from: b */
    private final Object[] f15095b;

    /* renamed from: c */
    private final int f15096c;

    /* renamed from: d */
    private final int f15097d;

    /* renamed from: e */
    private final zn3 f15098e;

    /* renamed from: f */
    private final boolean f15099f;

    /* renamed from: g */
    private final boolean f15100g;

    /* renamed from: h */
    private final boolean f15101h;

    /* renamed from: i */
    private final int[] f15102i;

    /* renamed from: j */
    private final int f15103j;

    /* renamed from: k */
    private final int f15104k;

    /* renamed from: l */
    private final nn3 f15105l;

    /* renamed from: m */
    private final lp3<?, ?> f15106m;

    /* renamed from: n */
    private final dm3<?> f15107n;

    /* renamed from: o */
    private final un3 f15108o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.ads.zn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.ads.un3} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.dm3, com.google.android.gms.internal.ads.dm3<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v9, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.nn3] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.ads.lp3<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private co3(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.ads.zn3 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.ads.fo3 r17, com.google.android.gms.internal.ads.nn3 r18, com.google.android.gms.internal.ads.lp3<?, ?> r19, com.google.android.gms.internal.ads.dm3<?> r20, com.google.android.gms.internal.ads.un3 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f15094a = r3
            r3 = r7
            r0.f15095b = r3
            r3 = r8
            r0.f15096c = r3
            r3 = r9
            r0.f15097d = r3
            boolean r3 = r1 instanceof com.google.android.gms.internal.ads.qm3
            r0.f15100g = r3
            r3 = r11
            r0.f15101h = r3
            r3 = 0
            if (r2 == 0) goto L_0x0024
            boolean r4 = r2.mo16960h(r10)
            if (r4 == 0) goto L_0x0024
            r3 = 1
        L_0x0024:
            r0.f15099f = r3
            r3 = r13
            r0.f15102i = r3
            r3 = r14
            r0.f15103j = r3
            r3 = r15
            r0.f15104k = r3
            r3 = r17
            r0.f15105l = r3
            r3 = r18
            r0.f15106m = r3
            r0.f15107n = r2
            r0.f15098e = r1
            r1 = r20
            r0.f15108o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.ads.zn3, boolean, boolean, int[], int, int, com.google.android.gms.internal.ads.fo3, com.google.android.gms.internal.ads.nn3, com.google.android.gms.internal.ads.lp3, com.google.android.gms.internal.ads.dm3, com.google.android.gms.internal.ads.un3, byte[]):void");
    }

    /* renamed from: A */
    private final boolean m22013A(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m22051z(t, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: B */
    private static boolean m22014B(Object obj, int i, to3 to3) {
        return to3.mo16708g(vp3.m32648p(obj, (long) (i & 1048575)));
    }

    /* renamed from: C */
    private final boolean m22015C(T t, int i, int i2) {
        return vp3.m32644l(t, (long) (m22034W(i2) & 1048575)) == i;
    }

    /* renamed from: D */
    private static <T> boolean m22016D(T t, long j) {
        return ((Boolean) vp3.m32648p(t, j)).booleanValue();
    }

    /* renamed from: E */
    private final void m22017E(T t, yl3 yl3) throws IOException {
        int i;
        T t2 = t;
        yl3 yl32 = yl3;
        if (!this.f15099f) {
            int length = this.f15094a.length;
            Unsafe unsafe = f15093q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int l = m22037l(i3);
                int i6 = this.f15094a[i3];
                int k = m22036k(l);
                if (k <= 17) {
                    int i7 = this.f15094a[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(t2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (l & i2);
                switch (k) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            yl32.mo22243q(i6, vp3.m32642j(t2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            yl32.mo22252z(i6, vp3.m32643k(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            yl32.mo22221E(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            yl32.mo22237j(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            yl32.mo22219C(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            yl32.mo22250x(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            yl32.mo22248v(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            yl32.mo22239m(i6, vp3.m32632H(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m22019G(i6, unsafe.getObject(t2, j), yl32);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            yl32.mo22223G(i6, unsafe.getObject(t2, j), m22040o(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            yl32.mo22241o(i6, (kl3) unsafe.getObject(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            yl32.mo22235h(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            yl32.mo22246t(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            yl32.mo22224H(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            yl32.mo22226J(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            yl32.mo22228a(i6, unsafe.getInt(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            yl32.mo22230c(i6, unsafe.getLong(t2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            yl32.mo22218B(i6, unsafe.getObject(t2, j), m22040o(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        vo3.m32602l(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 19:
                        vo3.m32606p(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 20:
                        vo3.m32609s(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 21:
                        vo3.m32564B(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 22:
                        vo3.m32608r(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 23:
                        vo3.m32605o(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 24:
                        vo3.m32604n(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 25:
                        vo3.m32600j(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        continue;
                    case 26:
                        vo3.m32615y(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32);
                        break;
                    case 27:
                        vo3.m32610t(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, m22040o(i3));
                        break;
                    case 28:
                        vo3.m32601k(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32);
                        break;
                    case 29:
                        vo3.m32616z(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 30:
                        vo3.m32603m(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 31:
                        vo3.m32611u(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 32:
                        vo3.m32612v(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 33:
                        vo3.m32613w(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 34:
                        vo3.m32614x(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, false);
                        break;
                    case 35:
                        vo3.m32602l(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 36:
                        vo3.m32606p(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 37:
                        vo3.m32609s(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 38:
                        vo3.m32564B(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 39:
                        vo3.m32608r(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 40:
                        vo3.m32605o(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 41:
                        vo3.m32604n(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 42:
                        vo3.m32600j(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 43:
                        vo3.m32616z(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 44:
                        vo3.m32603m(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 45:
                        vo3.m32611u(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 46:
                        vo3.m32612v(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 47:
                        vo3.m32613w(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 48:
                        vo3.m32614x(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, true);
                        break;
                    case 49:
                        vo3.m32607q(this.f15094a[i3], (List) unsafe.getObject(t2, j), yl32, m22040o(i3));
                        break;
                    case 50:
                        m22018F(yl32, i6, unsafe.getObject(t2, j), i3);
                        break;
                    case 51:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22243q(i6, m22023L(t2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22252z(i6, m22024M(t2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22221E(i6, m22038m(t2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22237j(i6, m22038m(t2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22219C(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22250x(i6, m22038m(t2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22248v(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22239m(i6, m22016D(t2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m22015C(t2, i6, i3)) {
                            m22019G(i6, unsafe.getObject(t2, j), yl32);
                            break;
                        }
                        break;
                    case 60:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22223G(i6, unsafe.getObject(t2, j), m22040o(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22241o(i6, (kl3) unsafe.getObject(t2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22235h(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22246t(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22224H(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22226J(i6, m22038m(t2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22228a(i6, m22027P(t2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22230c(i6, m22038m(t2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m22015C(t2, i6, i3)) {
                            yl32.mo22218B(i6, unsafe.getObject(t2, j), m22040o(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            lp3<?, ?> lp3 = this.f15106m;
            lp3.mo19268r(lp3.mo19254d(t2), yl32);
            return;
        }
        this.f15107n.mo16953a(t2);
        throw null;
    }

    /* renamed from: F */
    private final <K, V> void m22018F(yl3 yl3, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            sn3 sn3 = (sn3) m22042q(i2);
            throw null;
        }
    }

    /* renamed from: G */
    private static final void m22019G(int i, Object obj, yl3 yl3) throws IOException {
        if (obj instanceof String) {
            yl3.mo22233f(i, (String) obj);
        } else {
            yl3.mo22241o(i, (kl3) obj);
        }
    }

    /* renamed from: I */
    static mp3 m22020I(Object obj) {
        qm3 qm3 = (qm3) obj;
        mp3 mp3 = qm3.zzc;
        if (mp3 != mp3.m27385c()) {
            return mp3;
        }
        mp3 e = mp3.m27387e();
        qm3.zzc = e;
        return e;
    }

    /* renamed from: J */
    static <T> co3<T> m22021J(Class<T> cls, wn3 wn3, fo3 fo3, nn3 nn3, lp3<?, ?> lp3, dm3<?> dm3, un3 un3) {
        if (wn3 instanceof ko3) {
            return m22022K((ko3) wn3, fo3, nn3, lp3, dm3, un3);
        }
        ip3 ip3 = (ip3) wn3;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.ads.co3<T> m22022K(com.google.android.gms.internal.ads.ko3 r34, com.google.android.gms.internal.ads.fo3 r35, com.google.android.gms.internal.ads.nn3 r36, com.google.android.gms.internal.ads.lp3<?, ?> r37, com.google.android.gms.internal.ads.dm3<?> r38, com.google.android.gms.internal.ads.un3 r39) {
        /*
            int r0 = r34.mo18475b()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo18952c()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f15092p
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f15093q
            java.lang.Object[] r17 = r34.mo18953d()
            com.google.android.gms.internal.ads.zn3 r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m22043r(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m22043r(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m22043r(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m22043r(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.ads.co3 r0 = new com.google.android.gms.internal.ads.co3
            r4 = r0
            com.google.android.gms.internal.ads.zn3 r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.m22022K(com.google.android.gms.internal.ads.ko3, com.google.android.gms.internal.ads.fo3, com.google.android.gms.internal.ads.nn3, com.google.android.gms.internal.ads.lp3, com.google.android.gms.internal.ads.dm3, com.google.android.gms.internal.ads.un3):com.google.android.gms.internal.ads.co3");
    }

    /* renamed from: L */
    private static <T> double m22023L(T t, long j) {
        return ((Double) vp3.m32648p(t, j)).doubleValue();
    }

    /* renamed from: M */
    private static <T> float m22024M(T t, long j) {
        return ((Float) vp3.m32648p(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0304, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x046b, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b5, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04e0, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e1, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0508, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0515, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0523, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0527, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22025N(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f15093q
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000c:
            int[] r7 = r14.f15094a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x052b
            int r7 = r14.m22037l(r3)
            int[] r8 = r14.f15094a
            r8 = r8[r3]
            int r9 = m22036k(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0037
            int[] r10 = r14.f15094a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r1
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0038
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0038
        L_0x0037:
            r10 = 0
        L_0x0038:
            r7 = r7 & r1
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0519;
                case 1: goto L_0x050b;
                case 2: goto L_0x04f6;
                case 3: goto L_0x04e3;
                case 4: goto L_0x04ce;
                case 5: goto L_0x04c3;
                case 6: goto L_0x04b8;
                case 7: goto L_0x04ab;
                case 8: goto L_0x0481;
                case 9: goto L_0x046f;
                case 10: goto L_0x0453;
                case 11: goto L_0x043f;
                case 12: goto L_0x042b;
                case 13: goto L_0x041f;
                case 14: goto L_0x0413;
                case 15: goto L_0x03fa;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cf;
                case 18: goto L_0x03c2;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03ac;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0396;
                case 23: goto L_0x038b;
                case 24: goto L_0x0380;
                case 25: goto L_0x0375;
                case 26: goto L_0x036a;
                case 27: goto L_0x035b;
                case 28: goto L_0x034f;
                case 29: goto L_0x0343;
                case 30: goto L_0x0337;
                case 31: goto L_0x032b;
                case 32: goto L_0x031f;
                case 33: goto L_0x0313;
                case 34: goto L_0x0307;
                case 35: goto L_0x02f0;
                case 36: goto L_0x02db;
                case 37: goto L_0x02c6;
                case 38: goto L_0x02b1;
                case 39: goto L_0x029c;
                case 40: goto L_0x0287;
                case 41: goto L_0x0271;
                case 42: goto L_0x025b;
                case 43: goto L_0x0245;
                case 44: goto L_0x022f;
                case 45: goto L_0x0219;
                case 46: goto L_0x0203;
                case 47: goto L_0x01ed;
                case 48: goto L_0x01d7;
                case 49: goto L_0x01c7;
                case 50: goto L_0x01ba;
                case 51: goto L_0x01ac;
                case 52: goto L_0x019e;
                case 53: goto L_0x0188;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0132;
                case 59: goto L_0x0104;
                case 60: goto L_0x00f0;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0057;
                case 68: goto L_0x0041;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x0527
        L_0x0041:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zn3 r7 = (com.google.android.gms.internal.ads.zn3) r7
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.xl3.m33738y(r8, r7, r9)
            goto L_0x03cc
        L_0x0057:
            boolean r9 = r14.m22015C(r15, r8, r3)
            if (r9 == 0) goto L_0x0527
            long r9 = m22038m(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
            goto L_0x04e0
        L_0x0071:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m22027P(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x04e0
        L_0x008c:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0523
        L_0x009a:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0515
        L_0x00a8:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m22027P(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33739z(r7)
            goto L_0x04e0
        L_0x00be:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m22027P(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x04e0
        L_0x00d4:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.kl3 r7 = (com.google.android.gms.internal.ads.kl3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x046b
        L_0x00f0:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.vo3.m32579Q(r8, r7, r9)
            goto L_0x03cc
        L_0x0104:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.kl3
            if (r9 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.kl3 r7 = (com.google.android.gms.internal.ads.kl3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x046b
        L_0x0124:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33731C(r7)
            goto L_0x04e0
        L_0x0132:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x04b5
        L_0x0140:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0515
        L_0x014e:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0523
        L_0x015c:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = m22027P(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33739z(r7)
            goto L_0x04e0
        L_0x0172:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m22038m(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            int r8 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
            goto L_0x0508
        L_0x0188:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            long r9 = m22038m(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            int r8 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
            goto L_0x0508
        L_0x019e:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0515
        L_0x01ac:
            boolean r7 = r14.m22015C(r15, r8, r3)
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0523
        L_0x01ba:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m22042q(r3)
            com.google.android.gms.internal.ads.un3.m31933a(r8, r7, r9)
            goto L_0x0527
        L_0x01c7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.vo3.m32574L(r8, r7, r9)
            goto L_0x03cc
        L_0x01d7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32584V(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x01ed:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32582T(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x0203:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32573K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x0219:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32571I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x022f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32569G(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x0245:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32587Y(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x025b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32566D(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x0271:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32571I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x0287:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32573K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x029c:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32576N(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x02b1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32590a0(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x02c6:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32578P(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x02db:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32571I(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0304
        L_0x02f0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32573K(r7)
            if (r7 <= 0) goto L_0x0527
            int r8 = com.google.android.gms.internal.ads.xl3.m33732D(r8)
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
        L_0x0304:
            int r8 = r8 + r9
            goto L_0x04e0
        L_0x0307:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32583U(r8, r7, r2)
            goto L_0x03cc
        L_0x0313:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32581S(r8, r7, r2)
            goto L_0x03cc
        L_0x031f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32572J(r8, r7, r2)
            goto L_0x03cc
        L_0x032b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32570H(r8, r7, r2)
            goto L_0x03cc
        L_0x0337:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32568F(r8, r7, r2)
            goto L_0x03cc
        L_0x0343:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32586X(r8, r7, r2)
            goto L_0x03cc
        L_0x034f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32567E(r8, r7)
            goto L_0x03cc
        L_0x035b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.vo3.m32580R(r8, r7, r9)
            goto L_0x03cc
        L_0x036a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32585W(r8, r7)
            goto L_0x03cc
        L_0x0375:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32563A(r8, r7, r2)
            goto L_0x03cc
        L_0x0380:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32570H(r8, r7, r2)
            goto L_0x03cc
        L_0x038b:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32572J(r8, r7, r2)
            goto L_0x03cc
        L_0x0396:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32575M(r8, r7, r2)
            goto L_0x03cc
        L_0x03a1:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32588Z(r8, r7, r2)
            goto L_0x03cc
        L_0x03ac:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32577O(r8, r7, r2)
            goto L_0x03cc
        L_0x03b7:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32570H(r8, r7, r2)
            goto L_0x03cc
        L_0x03c2:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.ads.vo3.m32572J(r8, r7, r2)
        L_0x03cc:
            int r4 = r4 + r7
            goto L_0x0527
        L_0x03cf:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.zn3 r7 = (com.google.android.gms.internal.ads.zn3) r7
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.xl3.m33738y(r8, r7, r9)
            goto L_0x03cc
        L_0x03e2:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
            goto L_0x04e0
        L_0x03fa:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x04e0
        L_0x0413:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0523
        L_0x041f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0515
        L_0x042b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33739z(r7)
            goto L_0x04e0
        L_0x043f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x04e0
        L_0x0453:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.kl3 r7 = (com.google.android.gms.internal.ads.kl3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
        L_0x046b:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04e1
        L_0x046f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.to3 r9 = r14.m22040o(r3)
            int r7 = com.google.android.gms.internal.ads.vo3.m32579Q(r8, r7, r9)
            goto L_0x03cc
        L_0x0481:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.ads.kl3
            if (r9 == 0) goto L_0x049e
            com.google.android.gms.internal.ads.kl3 r7 = (com.google.android.gms.internal.ads.kl3) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = r7.zzd()
            int r9 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x046b
        L_0x049e:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33731C(r7)
            goto L_0x04e0
        L_0x04ab:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
        L_0x04b5:
            int r7 = r7 + r11
            goto L_0x03cc
        L_0x04b8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0515
        L_0x04c3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            goto L_0x0523
        L_0x04ce:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.ads.xl3.m33733a(r8)
            int r7 = com.google.android.gms.internal.ads.xl3.m33739z(r7)
        L_0x04e0:
            int r8 = r8 + r7
        L_0x04e1:
            int r4 = r4 + r8
            goto L_0x0527
        L_0x04e3:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            int r8 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
            goto L_0x0508
        L_0x04f6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
            int r8 = com.google.android.gms.internal.ads.xl3.m33734b(r9)
        L_0x0508:
            int r7 = r7 + r8
            goto L_0x03cc
        L_0x050b:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
        L_0x0515:
            int r7 = r7 + 4
            goto L_0x03cc
        L_0x0519:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0527
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.ads.xl3.m33733a(r7)
        L_0x0523:
            int r7 = r7 + 8
            goto L_0x03cc
        L_0x0527:
            int r3 = r3 + 3
            goto L_0x000c
        L_0x052b:
            com.google.android.gms.internal.ads.lp3<?, ?> r0 = r14.f15106m
            java.lang.Object r1 = r0.mo19254d(r15)
            int r0 = r0.mo19251a(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f15099f
            if (r0 != 0) goto L_0x053b
            return r4
        L_0x053b:
            com.google.android.gms.internal.ads.dm3<?> r0 = r14.f15107n
            r0.mo16953a(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.m22025N(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22026O(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f15093q
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f15094a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m22037l(r2)
            int r5 = m22036k(r4)
            int[] r6 = r11.f15094a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.ads.jm3 r4 = com.google.android.gms.internal.ads.jm3.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.ads.jm3 r4 = com.google.android.gms.internal.ads.jm3.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f15094a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.zn3 r4 = (com.google.android.gms.internal.ads.zn3) r4
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.xl3.m33738y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m22015C(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m22038m(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m22027P(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m22027P(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33739z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m22027P(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.kl3 r4 = (com.google.android.gms.internal.ads.kl3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.vo3.m32579Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.kl3
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.kl3 r4 = (com.google.android.gms.internal.ads.kl3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33731C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m22027P(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33739z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m22038m(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r6)
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m22038m(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r6)
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m22015C(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.lang.Object r5 = r11.m22042q(r2)
            com.google.android.gms.internal.ads.un3.m31933a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.vo3.m32574L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32584V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32582T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32569G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32587Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32566D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32576N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32590a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32578P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.xl3.m33732D(r6)
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32583U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32581S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32572J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32570H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32568F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32586X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32567E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.vo3.m32580R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32585W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32563A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32570H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32572J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32575M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32588Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32577O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32570H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.vo3.m32572J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.zn3 r4 = (com.google.android.gms.internal.ads.zn3) r4
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.xl3.m33738y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m22051z(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.ads.vp3.m32646n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.vp3.m32644l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.vp3.m32644l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33739z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.vp3.m32644l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.kl3 r4 = (com.google.android.gms.internal.ads.kl3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            com.google.android.gms.internal.ads.to3 r5 = r11.m22040o(r2)
            int r4 = com.google.android.gms.internal.ads.vo3.m32579Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.kl3
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.ads.kl3 r4 = (com.google.android.gms.internal.ads.kl3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = r4.zzd()
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33731C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.vp3.m32644l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.xl3.m33733a(r5)
            int r4 = com.google.android.gms.internal.ads.xl3.m33739z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.vp3.m32646n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r6)
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.vp3.m32646n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.xl3.m33733a(r6)
            int r4 = com.google.android.gms.internal.ads.xl3.m33734b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m22051z(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.xl3.m33733a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.ads.lp3<?, ?> r0 = r11.f15106m
            java.lang.Object r12 = r0.mo19254d(r12)
            int r12 = r0.mo19251a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.m22026O(java.lang.Object):int");
    }

    /* renamed from: P */
    private static <T> int m22027P(T t, long j) {
        return ((Integer) vp3.m32648p(t, j)).intValue();
    }

    /* renamed from: Q */
    private final <K, V> int m22028Q(T t, byte[] bArr, int i, int i2, int i3, long j, yk3 yk3) throws IOException {
        Unsafe unsafe = f15093q;
        Object q = m22042q(i3);
        Object object = unsafe.getObject(t, j);
        if (un3.m31934b(object)) {
            tn3 zzb = tn3.zza().zzb();
            un3.m31935c(zzb, object);
            unsafe.putObject(t, j, zzb);
        }
        sn3 sn3 = (sn3) q;
        throw null;
    }

    /* renamed from: R */
    private final int m22029R(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, yk3 yk3) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        yk3 yk32 = yk3;
        Unsafe unsafe = f15093q;
        long j3 = (long) (this.f15094a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(zk3.m34657n(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(zk3.m34645b(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = zk3.m34656m(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, Long.valueOf(yk32.f26395b));
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = zk3.m34653j(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, Integer.valueOf(yk32.f26394a));
                    unsafe.putInt(t2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(zk3.m34657n(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(zk3.m34645b(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = zk3.m34656m(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, Boolean.valueOf(yk32.f26395b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = zk3.m34653j(bArr2, i9, yk32);
                    int i14 = yk32.f26394a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, BuildConfig.FLAVOR);
                    } else if ((i6 & 536870912) == 0 || aq3.m20922j(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, j5, i14, zm3.f26835a));
                        j5 += i14;
                    } else {
                        throw bn3.zzd();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = zk3.m34647d(m22040o(i13), bArr2, i9, i2, yk32);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, yk32.f26396c);
                    } else {
                        unsafe.putObject(t2, j2, zm3.m34702g(object, yk32.f26396c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = zk3.m34644a(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, yk32.f26396c);
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = zk3.m34653j(bArr2, i9, yk32);
                    int i15 = yk32.f26394a;
                    tm3 n = m22039n(i13);
                    if (n == null || n.mo15938c(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m22020I(t).mo19491h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = zk3.m34653j(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, Integer.valueOf(sl3.m30774e(yk32.f26394a)));
                    unsafe.putInt(t2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = zk3.m34656m(bArr2, i9, yk32);
                    unsafe.putObject(t2, j2, Long.valueOf(sl3.m30775f(yk32.f26395b)));
                    unsafe.putInt(t2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = zk3.m34646c(m22040o(i13), bArr, i, i2, (i10 & -8) | 4, yk3);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, yk32.f26396c);
                    } else {
                        unsafe.putObject(t2, j2, zm3.m34702g(object2, yk32.f26396c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02a8, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0312, code lost:
        if (r0 != r15) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r1 = r20;
        r8 = 1048575;
        r10 = -1;
        r29 = r13;
        r13 = r2;
        r2 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d2, code lost:
        r6 = r6 | r21;
        r9 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0207, code lost:
        r6 = r6 | r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020a, code lost:
        r2 = r4;
        r28 = r10;
        r19 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m22030S(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.yk3 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f15093q
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x033b
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.ads.zk3.m34654k(r0, r12, r3, r11)
            int r3 = r11.f26394a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m22033V(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m22032U(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r18 = -1
            r19 = 0
            goto L_0x0315
        L_0x004e:
            int[] r0 = r15.f15094a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m22036k(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x0213
            int[] r10 = r15.f15094a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            if (r10 == r7) goto L_0x0090
            r23 = r1
            r20 = r2
            if (r7 == r13) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r10 == r13) goto L_0x008a
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x0096
        L_0x0090:
            r23 = r1
            r20 = r2
            r10 = r19
        L_0x0096:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01f1;
                case 1: goto L_0x01da;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01bc;
                case 4: goto L_0x01a9;
                case 5: goto L_0x018d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014c;
                case 8: goto L_0x012b;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e7;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00d6;
                case 13: goto L_0x0169;
                case 14: goto L_0x018d;
                case 15: goto L_0x00c1;
                case 16: goto L_0x00a3;
                default: goto L_0x009a;
            }
        L_0x009a:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            goto L_0x020a
        L_0x00a3:
            if (r3 != 0) goto L_0x00bc
            int r17 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r4, r11)
            long r0 = r11.f26395b
            long r4 = com.google.android.gms.internal.ads.sl3.m30775f(r0)
            r0 = r10
            r1 = r31
            r13 = r20
            r2 = r8
            r20 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x01d2
        L_0x00bc:
            r13 = r20
            r20 = r33
            goto L_0x0126
        L_0x00c1:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r4, r11)
            int r1 = r11.f26394a
            int r1 = com.google.android.gms.internal.ads.sl3.m30774e(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00d6:
            r13 = r20
            r20 = r33
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r4, r11)
            int r1 = r11.f26394a
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x00e7:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0126
            int r0 = com.google.android.gms.internal.ads.zk3.m34644a(r12, r4, r11)
            java.lang.Object r1 = r11.f26396c
            r10.putObject(r14, r8, r1)
            goto L_0x0207
        L_0x00f9:
            r13 = r20
            r0 = 2
            r20 = r33
            if (r3 != r0) goto L_0x0124
            com.google.android.gms.internal.ads.to3 r0 = r15.m22040o(r13)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.ads.zk3.m34647d(r0, r12, r4, r2, r11)
            java.lang.Object r1 = r10.getObject(r14, r8)
            if (r1 != 0) goto L_0x011a
            java.lang.Object r1 = r11.f26396c
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x011a:
            java.lang.Object r3 = r11.f26396c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zm3.m34702g(r1, r3)
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x0124:
            r2 = r34
        L_0x0126:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020a
        L_0x012b:
            r2 = r34
            r13 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r0) goto L_0x020a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0142
            int r0 = com.google.android.gms.internal.ads.zk3.m34650g(r12, r4, r11)
            goto L_0x0146
        L_0x0142:
            int r0 = com.google.android.gms.internal.ads.zk3.m34651h(r12, r4, r11)
        L_0x0146:
            java.lang.Object r1 = r11.f26396c
            r10.putObject(r14, r8, r1)
            goto L_0x017d
        L_0x014c:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r4, r11)
            long r3 = r11.f26395b
            r22 = 0
            int r1 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r5 = 0
        L_0x0165:
            com.google.android.gms.internal.ads.vp3.m32656x(r14, r8, r5)
            goto L_0x017d
        L_0x0169:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.zk3.m34645b(r12, r4)
            r10.putInt(r14, r8, r0)
            int r0 = r4 + 4
        L_0x017d:
            r6 = r6 | r21
            r9 = r10
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r29 = r13
            r13 = r2
            r2 = r29
            goto L_0x001a
        L_0x018d:
            r2 = r34
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r22 = com.google.android.gms.internal.ads.zk3.m34657n(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0207
        L_0x01a9:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r4, r11)
            int r1 = r11.f26394a
            r10.putInt(r14, r8, r1)
            goto L_0x0207
        L_0x01bc:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != 0) goto L_0x020a
            int r17 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r4, r11)
            long r4 = r11.f26395b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
        L_0x01d2:
            r6 = r6 | r21
            r9 = r10
            r2 = r13
            r0 = r17
            goto L_0x0257
        L_0x01da:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r1) goto L_0x020a
            int r0 = com.google.android.gms.internal.ads.zk3.m34645b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.vp3.m32625A(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0207
        L_0x01f1:
            r13 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            if (r3 != r5) goto L_0x020a
            long r0 = com.google.android.gms.internal.ads.zk3.m34657n(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.vp3.m32658z(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0207:
            r6 = r6 | r21
            goto L_0x0255
        L_0x020a:
            r2 = r4
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x0315
        L_0x0213:
            r20 = r33
            r23 = r1
            r13 = r2
            r10 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x026e
            r1 = 2
            if (r3 != r1) goto L_0x0261
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.google.android.gms.internal.ads.ym3 r0 = (com.google.android.gms.internal.ads.ym3) r0
            boolean r1 = r0.mo21839b()
            if (r1 != 0) goto L_0x0241
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0239
            r1 = 10
            goto L_0x023a
        L_0x0239:
            int r1 = r1 + r1
        L_0x023a:
            com.google.android.gms.internal.ads.ym3 r0 = r0.mo15868f(r1)
            r10.putObject(r14, r8, r0)
        L_0x0241:
            r5 = r0
            com.google.android.gms.internal.ads.to3 r0 = r15.m22040o(r13)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.zk3.m34648e(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0255:
            r9 = r10
            r2 = r13
        L_0x0257:
            r1 = r20
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r13 = r34
            goto L_0x001a
        L_0x0261:
            r15 = r4
            r24 = r6
            r25 = r7
            r28 = r10
            r19 = r13
            r18 = -1
            goto L_0x02de
        L_0x026e:
            r1 = 49
            if (r0 > r1) goto L_0x02c0
            r1 = r23
            long r1 = (long) r1
            r5 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r4
            r15 = r4
            r4 = r34
            r23 = r5
            r5 = r17
            r24 = r6
            r6 = r20
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r19 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.m22031T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02be
        L_0x02aa:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
            r6 = r24
            r7 = r25
            goto L_0x0333
        L_0x02be:
            r2 = r0
            goto L_0x02df
        L_0x02c0:
            r33 = r3
            r15 = r4
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r19 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02f8
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x02e4
        L_0x02de:
            r2 = r15
        L_0x02df:
            r6 = r24
            r7 = r25
            goto L_0x0315
        L_0x02e4:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r26
            r8 = r35
            r0.m22028Q(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x02f8:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r26
            r12 = r19
            r13 = r35
            int r0 = r0.m22029R(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02be
            goto L_0x02aa
        L_0x0315:
            com.google.android.gms.internal.ads.mp3 r4 = m22020I(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.zk3.m34652i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r19
            r1 = r20
        L_0x0333:
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x033b:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x034e
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x034e:
            r1 = r34
            if (r0 != r1) goto L_0x0353
            return r0
        L_0x0353:
            com.google.android.gms.internal.ads.bn3 r0 = com.google.android.gms.internal.ads.bn3.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.m22030S(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.yk3):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: T */
    private final int m22031T(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.yk3 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f15093q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.ym3 r12 = (com.google.android.gms.internal.ads.ym3) r12
            boolean r13 = r12.mo21839b()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.ym3 r12 = r12.mo15868f(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.ads.to3 r1 = r15.m22040o(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.zk3.m34646c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f26396c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r1, r7)
            long r4 = r7.f26395b
            long r4 = com.google.android.gms.internal.ads.sl3.m30775f(r4)
            r12.mo20060t(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r4, r7)
            long r8 = r7.f26395b
            long r8 = com.google.android.gms.internal.ads.sl3.m30775f(r8)
            r12.mo20060t(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r4, r7)
            long r8 = r7.f26395b
            long r8 = com.google.android.gms.internal.ads.sl3.m30775f(r8)
            r12.mo20060t(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.ads.rm3 r12 = (com.google.android.gms.internal.ads.rm3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r4 = r7.f26394a
            int r4 = com.google.android.gms.internal.ads.sl3.m30774e(r4)
            r12.mo20677L(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.rm3 r12 = (com.google.android.gms.internal.ads.rm3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r4 = r7.f26394a
            int r4 = com.google.android.gms.internal.ads.sl3.m30774e(r4)
            r12.mo20677L(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r4 = r7.f26394a
            int r4 = com.google.android.gms.internal.ads.sl3.m30774e(r4)
            r12.mo20677L(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.zk3.m34649f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.zk3.m34655l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.ads.qm3 r1 = (com.google.android.gms.internal.ads.qm3) r1
            com.google.android.gms.internal.ads.mp3 r3 = r1.zzc
            com.google.android.gms.internal.ads.mp3 r4 = com.google.android.gms.internal.ads.mp3.m27385c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.ads.tm3 r4 = r15.m22039n(r8)
            com.google.android.gms.internal.ads.lp3<?, ?> r5 = r0.f15106m
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.ads.vo3.m32593c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.ads.mp3 r3 = (com.google.android.gms.internal.ads.mp3) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r4 = r7.f26394a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.ads.kl3 r4 = com.google.android.gms.internal.ads.kl3.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.ads.kl3 r6 = com.google.android.gms.internal.ads.kl3.zzw(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r4 = r7.f26394a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.ads.kl3 r4 = com.google.android.gms.internal.ads.kl3.zzb
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.ads.kl3 r6 = com.google.android.gms.internal.ads.kl3.zzw(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.ads.to3 r1 = r15.m22040o(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.zk3.m34648e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r6 = r7.f26394a
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zm3.f26835a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r8 = r7.f26394a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r6, r7)
            int r6 = r7.f26394a
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.zm3.f26835a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r6 = r7.f26394a
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.aq3.m20922j(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zm3.f26835a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r8 = r7.f26394a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r6, r7)
            int r6 = r7.f26394a
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.aq3.m20922j(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.zm3.f26835a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzd()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzd()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzf()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.ads.al3 r12 = (com.google.android.gms.internal.ads.al3) r12
            int r2 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r4 = r7.f26394a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r2, r7)
            long r5 = r7.f26395b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.mo15872p(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.al3 r12 = (com.google.android.gms.internal.ads.al3) r12
            int r4 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r4, r7)
            long r8 = r7.f26395b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.mo15872p(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r8 = r7.f26394a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r6, r7)
            long r8 = r7.f26395b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.mo15872p(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.ads.rm3 r12 = (com.google.android.gms.internal.ads.rm3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.ads.zk3.m34645b(r3, r1)
            r12.mo20677L(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.rm3 r12 = (com.google.android.gms.internal.ads.rm3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34645b(r17, r18)
            r12.mo20677L(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.ads.zk3.m34645b(r3, r4)
            r12.mo20677L(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.ads.zk3.m34657n(r3, r1)
            r12.mo20060t(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            long r8 = com.google.android.gms.internal.ads.zk3.m34657n(r17, r18)
            r12.mo20060t(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.ads.zk3.m34657n(r3, r4)
            r12.mo20060t(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.ads.zk3.m34649f(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.ads.zk3.m34655l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r1, r7)
            long r4 = r7.f26395b
            r12.mo20060t(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.on3 r12 = (com.google.android.gms.internal.ads.on3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r4, r7)
            long r8 = r7.f26395b
            r12.mo20060t(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.ads.zk3.m34656m(r3, r4, r7)
            long r8 = r7.f26395b
            r12.mo20060t(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.ads.km3 r12 = (com.google.android.gms.internal.ads.km3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.ads.zk3.m34645b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo18925p(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.km3 r12 = (com.google.android.gms.internal.ads.km3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34645b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo18925p(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.ads.zk3.m34645b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo18925p(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.ads.zl3 r12 = (com.google.android.gms.internal.ads.zl3) r12
            int r1 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r2 = r7.f26394a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.ads.zk3.m34657n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo22390p(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.ads.bn3 r1 = com.google.android.gms.internal.ads.bn3.zzj()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.zl3 r12 = (com.google.android.gms.internal.ads.zl3) r12
            long r8 = com.google.android.gms.internal.ads.zk3.m34657n(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo22390p(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r1, r7)
            int r6 = r7.f26394a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.ads.zk3.m34657n(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo22390p(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.ads.zk3.m34653j(r3, r4, r7)
            int r9 = r7.f26394a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.zk3.m34646c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f26396c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.m22031T(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.yk3):int");
    }

    /* renamed from: U */
    private final int m22032U(int i) {
        if (i < this.f15096c || i > this.f15097d) {
            return -1;
        }
        return m22035j(i, 0);
    }

    /* renamed from: V */
    private final int m22033V(int i, int i2) {
        if (i < this.f15096c || i > this.f15097d) {
            return -1;
        }
        return m22035j(i, i2);
    }

    /* renamed from: W */
    private final int m22034W(int i) {
        return this.f15094a[i + 2];
    }

    /* renamed from: j */
    private final int m22035j(int i, int i2) {
        int length = (this.f15094a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f15094a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: k */
    private static int m22036k(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: l */
    private final int m22037l(int i) {
        return this.f15094a[i + 1];
    }

    /* renamed from: m */
    private static <T> long m22038m(T t, long j) {
        return ((Long) vp3.m32648p(t, j)).longValue();
    }

    /* renamed from: n */
    private final tm3 m22039n(int i) {
        int i2 = i / 3;
        return (tm3) this.f15095b[i2 + i2 + 1];
    }

    /* renamed from: o */
    private final to3 m22040o(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        to3 to3 = (to3) this.f15095b[i3];
        if (to3 != null) {
            return to3;
        }
        to3 b = io3.m25345a().mo18467b((Class) this.f15095b[i3 + 1]);
        this.f15095b[i3] = b;
        return b;
    }

    /* renamed from: p */
    private final <UT, UB> UB m22041p(Object obj, int i, UB ub, lp3<UT, UB> lp3) {
        int i2 = this.f15094a[i];
        Object p = vp3.m32648p(obj, (long) (m22037l(i) & 1048575));
        if (p == null || m22039n(i) == null) {
            return ub;
        }
        tn3 tn3 = (tn3) p;
        sn3 sn3 = (sn3) m22042q(i);
        throw null;
    }

    /* renamed from: q */
    private final Object m22042q(int i) {
        int i2 = i / 3;
        return this.f15095b[i2 + i2];
    }

    /* renamed from: r */
    private static Field m22043r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: s */
    private final void m22044s(T t, T t2, int i) {
        long l = (long) (m22037l(i) & 1048575);
        if (m22051z(t2, i)) {
            Object p = vp3.m32648p(t, l);
            Object p2 = vp3.m32648p(t2, l);
            if (p != null && p2 != null) {
                vp3.m32628D(t, l, zm3.m34702g(p, p2));
                m22047v(t, i);
            } else if (p2 != null) {
                vp3.m32628D(t, l, p2);
                m22047v(t, i);
            }
        }
    }

    /* renamed from: t */
    private final void m22045t(T t, T t2, int i) {
        int l = m22037l(i);
        int i2 = this.f15094a[i];
        long j = (long) (l & 1048575);
        if (m22015C(t2, i2, i)) {
            Object p = m22015C(t, i2, i) ? vp3.m32648p(t, j) : null;
            Object p2 = vp3.m32648p(t2, j);
            if (p != null && p2 != null) {
                vp3.m32628D(t, j, zm3.m34702g(p, p2));
                m22048w(t, i2, i);
            } else if (p2 != null) {
                vp3.m32628D(t, j, p2);
                m22048w(t, i2, i);
            }
        }
    }

    /* renamed from: u */
    private final void m22046u(Object obj, int i, lo3 lo3) throws IOException {
        if (m22050y(i)) {
            vp3.m32628D(obj, (long) (i & 1048575), lo3.mo19221u());
        } else if (this.f15100g) {
            vp3.m32628D(obj, (long) (i & 1048575), lo3.mo19214n());
        } else {
            vp3.m32628D(obj, (long) (i & 1048575), lo3.zzp());
        }
    }

    /* renamed from: v */
    private final void m22047v(T t, int i) {
        int W = m22034W(i);
        long j = (long) (1048575 & W);
        if (j != 1048575) {
            vp3.m32626B(t, j, (1 << (W >>> 20)) | vp3.m32644l(t, j));
        }
    }

    /* renamed from: w */
    private final void m22048w(T t, int i, int i2) {
        vp3.m32626B(t, (long) (m22034W(i2) & 1048575), i);
    }

    /* renamed from: x */
    private final boolean m22049x(T t, T t2, int i) {
        return m22051z(t, i) == m22051z(t2, i);
    }

    /* renamed from: y */
    private static boolean m22050y(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: z */
    private final boolean m22051z(T t, int i) {
        int W = m22034W(i);
        long j = (long) (W & 1048575);
        if (j != 1048575) {
            return (vp3.m32644l(t, j) & (1 << (W >>> 20))) != 0;
        }
        int l = m22037l(i);
        long j2 = (long) (l & 1048575);
        switch (m22036k(l)) {
            case 0:
                return Double.doubleToRawLongBits(vp3.m32642j(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(vp3.m32643k(t, j2)) != 0;
            case 2:
                return vp3.m32646n(t, j2) != 0;
            case 3:
                return vp3.m32646n(t, j2) != 0;
            case 4:
                return vp3.m32644l(t, j2) != 0;
            case 5:
                return vp3.m32646n(t, j2) != 0;
            case 6:
                return vp3.m32644l(t, j2) != 0;
            case 7:
                return vp3.m32632H(t, j2);
            case 8:
                Object p = vp3.m32648p(t, j2);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                }
                if (p instanceof kl3) {
                    return !kl3.zzb.equals(p);
                }
                throw new IllegalArgumentException();
            case 9:
                return vp3.m32648p(t, j2) != null;
            case 10:
                return !kl3.zzb.equals(vp3.m32648p(t, j2));
            case 11:
                return vp3.m32644l(t, j2) != 0;
            case 12:
                return vp3.m32644l(t, j2) != 0;
            case 13:
                return vp3.m32644l(t, j2) != 0;
            case 14:
                return vp3.m32646n(t, j2) != 0;
            case 15:
                return vp3.m32644l(t, j2) != 0;
            case 16:
                return vp3.m32646n(t, j2) != 0;
            case 17:
                return vp3.m32648p(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020c, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0247, code lost:
        r5 = r6 | r24;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0284, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0286, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0287, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029e, code lost:
        r18 = r6;
        r19 = r7;
        r26 = r10;
        r8 = r11;
        r24 = r20;
        r6 = r25;
        r14 = null;
        r7 = r33;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16701H(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.yk3 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f15093q
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0425
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.zk3.m34654k(r0, r12, r1, r9)
            int r1 = r9.f26394a
            goto L_0x002d
        L_0x0028:
            r27 = r1
            r1 = r0
            r0 = r27
        L_0x002d:
            int r7 = r1 >>> 3
            r8 = r1 & 7
            r4 = 3
            if (r7 <= r2) goto L_0x003a
            int r3 = r3 / r4
            int r2 = r15.m22033V(r7, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m22032U(r7)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0051
            r2 = r0
            r8 = r1
            r18 = r5
            r24 = r7
            r26 = r10
            r7 = r11
            r14 = 0
            r17 = -1
            r19 = 0
            goto L_0x03b7
        L_0x0051:
            int[] r3 = r15.f15094a
            int r19 = r2 + 1
            r3 = r3[r19]
            int r4 = m22036k(r3)
            r20 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r3 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r4 > r0) goto L_0x02ae
            int[] r0 = r15.f15094a
            int r24 = r2 + 2
            r0 = r0[r24]
            int r24 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r24
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x008c
            r17 = r2
            if (r6 == r11) goto L_0x0084
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0084:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x0090
        L_0x008c:
            r17 = r2
            r25 = r6
        L_0x0090:
            r6 = r5
            r0 = 5
            switch(r4) {
                case 0: goto L_0x0268;
                case 1: goto L_0x024c;
                case 2: goto L_0x0228;
                case 3: goto L_0x0228;
                case 4: goto L_0x020f;
                case 5: goto L_0x01eb;
                case 6: goto L_0x01d2;
                case 7: goto L_0x01b0;
                case 8: goto L_0x018c;
                case 9: goto L_0x015b;
                case 10: goto L_0x0141;
                case 11: goto L_0x020f;
                case 12: goto L_0x010c;
                case 13: goto L_0x01d2;
                case 14: goto L_0x01eb;
                case 15: goto L_0x00ef;
                case 16: goto L_0x00c3;
                default: goto L_0x0095;
            }
        L_0x0095:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 3
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029e
            com.google.android.gms.internal.ads.to3 r0 = r15.m22040o(r7)
            int r1 = r20 << 3
            r8 = r1 | 4
            r1 = r30
            r3 = r32
            r12 = r4
            r4 = r8
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zk3.m34646c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x028a
            java.lang.Object r1 = r9.f26396c
            r10.putObject(r14, r12, r1)
            goto L_0x0297
        L_0x00c3:
            if (r8 != 0) goto L_0x00e3
            r1 = r21
            int r8 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r1, r9)
            long r0 = r9.f26395b
            long r4 = com.google.android.gms.internal.ads.sl3.m30775f(r0)
            r2 = r22
            r0 = r10
            r11 = r20
            r1 = r29
            r20 = r7
            r7 = r17
            r17 = -1
            r0.putLong(r1, r2, r4)
            goto L_0x0247
        L_0x00e3:
            r11 = r20
            r20 = r7
            r7 = r17
            r17 = -1
            r2 = r21
            goto L_0x029e
        L_0x00ef:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020c
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r1, r9)
            int r1 = r9.f26394a
            int r1 = com.google.android.gms.internal.ads.sl3.m30774e(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0284
        L_0x010c:
            r11 = r20
            r1 = r21
            r2 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020c
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r1, r9)
            int r1 = r9.f26394a
            com.google.android.gms.internal.ads.tm3 r4 = r15.m22039n(r7)
            if (r4 == 0) goto L_0x013c
            boolean r4 = r4.mo15938c(r1)
            if (r4 == 0) goto L_0x012d
            goto L_0x013c
        L_0x012d:
            com.google.android.gms.internal.ads.mp3 r2 = m22020I(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo19491h(r11, r1)
            r5 = r6
            goto L_0x0286
        L_0x013c:
            r10.putInt(r14, r2, r1)
            goto L_0x0284
        L_0x0141:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020c
            int r0 = com.google.android.gms.internal.ads.zk3.m34644a(r12, r1, r9)
            java.lang.Object r1 = r9.f26396c
            r10.putObject(r14, r2, r1)
            goto L_0x0284
        L_0x015b:
            r11 = r20
            r1 = r21
            r2 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020c
            com.google.android.gms.internal.ads.to3 r0 = r15.m22040o(r7)
            int r0 = com.google.android.gms.internal.ads.zk3.m34647d(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x017d
            java.lang.Object r1 = r9.f26396c
            r10.putObject(r14, r2, r1)
            goto L_0x0284
        L_0x017d:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f26396c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zm3.m34702g(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0284
        L_0x018c:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 2
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020c
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r3
            if (r0 != 0) goto L_0x01a5
            int r0 = com.google.android.gms.internal.ads.zk3.m34650g(r12, r1, r9)
            goto L_0x01a9
        L_0x01a5:
            int r0 = com.google.android.gms.internal.ads.zk3.m34651h(r12, r1, r9)
        L_0x01a9:
            java.lang.Object r1 = r9.f26396c
            r10.putObject(r14, r4, r1)
            goto L_0x0284
        L_0x01b0:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x020c
            int r0 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r1, r9)
            long r1 = r9.f26395b
            r21 = 0
            int r3 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01cc
            r1 = 1
            goto L_0x01cd
        L_0x01cc:
            r1 = 0
        L_0x01cd:
            com.google.android.gms.internal.ads.vp3.m32656x(r14, r4, r1)
            goto L_0x0284
        L_0x01d2:
            r11 = r20
            r1 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020c
            int r0 = com.google.android.gms.internal.ads.zk3.m34645b(r12, r1)
            r10.putInt(r14, r4, r0)
            int r0 = r1 + 4
            goto L_0x0284
        L_0x01eb:
            r11 = r20
            r1 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x020c
            long r21 = com.google.android.gms.internal.ads.zk3.m34657n(r12, r1)
            r8 = r1
            r0 = r10
            r1 = r29
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0284
        L_0x020c:
            r2 = r1
            goto L_0x029e
        L_0x020f:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x029e
            int r0 = com.google.android.gms.internal.ads.zk3.m34653j(r12, r2, r9)
            int r1 = r9.f26394a
            r10.putInt(r14, r4, r1)
            goto L_0x0284
        L_0x0228:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x029e
            int r8 = com.google.android.gms.internal.ads.zk3.m34656m(r12, r2, r9)
            long r2 = r9.f26395b
            r0 = r10
            r1 = r29
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
        L_0x0247:
            r5 = r6 | r24
            r3 = r7
            r0 = r8
            goto L_0x0287
        L_0x024c:
            r11 = r20
            r2 = r21
            r4 = r22
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029e
            int r0 = com.google.android.gms.internal.ads.zk3.m34645b(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.vp3.m32625A(r14, r4, r0)
            int r0 = r2 + 4
            goto L_0x0284
        L_0x0268:
            r11 = r20
            r2 = r21
            r4 = r22
            r0 = 1
            r20 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x029e
            long r0 = com.google.android.gms.internal.ads.zk3.m34657n(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.vp3.m32658z(r14, r4, r0)
            int r0 = r2 + 8
        L_0x0284:
            r5 = r6 | r24
        L_0x0286:
            r3 = r7
        L_0x0287:
            r1 = r11
            goto L_0x02fa
        L_0x028a:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f26396c
            java.lang.Object r1 = com.google.android.gms.internal.ads.zm3.m34702g(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x0297:
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x0286
        L_0x029e:
            r18 = r6
            r19 = r7
            r26 = r10
            r8 = r11
            r24 = r20
            r6 = r25
            r14 = 0
            r7 = r33
            goto L_0x03b7
        L_0x02ae:
            r11 = r20
            r12 = r22
            r17 = -1
            r20 = r7
            r7 = r2
            r2 = r21
            r0 = 27
            if (r4 != r0) goto L_0x0311
            r0 = 2
            if (r8 != r0) goto L_0x0302
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.ads.ym3 r0 = (com.google.android.gms.internal.ads.ym3) r0
            boolean r1 = r0.mo21839b()
            if (r1 != 0) goto L_0x02dd
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02d5
            r1 = 10
            goto L_0x02d6
        L_0x02d5:
            int r1 = r1 + r1
        L_0x02d6:
            com.google.android.gms.internal.ads.ym3 r0 = r0.mo15868f(r1)
            r10.putObject(r14, r12, r0)
        L_0x02dd:
            r8 = r0
            com.google.android.gms.internal.ads.to3 r0 = r15.m22040o(r7)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r18 = r5
            r5 = r8
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.zk3.m34648e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r5 = r18
        L_0x02fa:
            r2 = r20
            r6 = r25
            r11 = r33
            goto L_0x0019
        L_0x0302:
            r18 = r5
            r25 = r6
            r15 = r2
            r19 = r7
            r26 = r10
            r24 = r20
            r20 = r11
            goto L_0x0377
        L_0x0311:
            r18 = r5
            r25 = r6
            r6 = r2
            r0 = 49
            if (r4 > r0) goto L_0x0363
            long r2 = (long) r3
            r0 = r28
            r1 = r29
            r21 = r2
            r2 = r30
            r3 = r6
            r5 = r4
            r15 = 0
            r4 = r32
            r31 = r5
            r5 = r11
            r15 = r6
            r6 = r20
            r19 = r7
            r24 = r20
            r7 = r8
            r8 = r19
            r26 = r10
            r9 = r21
            r20 = r11
            r11 = r31
            r14 = r34
            int r0 = r0.m22031T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x035f
        L_0x0345:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r18
            r3 = r19
            r1 = r20
            r2 = r24
            r6 = r25
            r10 = r26
            goto L_0x0019
        L_0x035f:
            r7 = r33
            r2 = r0
            goto L_0x037a
        L_0x0363:
            r31 = r4
            r15 = r6
            r19 = r7
            r26 = r10
            r24 = r20
            r20 = r11
            r0 = 50
            r9 = r31
            if (r9 != r0) goto L_0x0393
            r0 = 2
            if (r8 == r0) goto L_0x0380
        L_0x0377:
            r7 = r33
            r2 = r15
        L_0x037a:
            r8 = r20
            r6 = r25
            r14 = 0
            goto L_0x03b7
        L_0x0380:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            r0.m22028Q(r1, r2, r3, r4, r5, r6, r8)
            r14 = 0
            throw r14
        L_0x0393:
            r14 = 0
            r0 = r28
            r1 = r29
            r2 = r30
            r10 = r3
            r3 = r15
            r4 = r32
            r5 = r20
            r6 = r24
            r7 = r8
            r8 = r10
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.m22029R(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03b0
            goto L_0x0345
        L_0x03b0:
            r7 = r33
            r2 = r0
            r8 = r20
            r6 = r25
        L_0x03b7:
            if (r8 != r7) goto L_0x03c6
            if (r7 == 0) goto L_0x03c6
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r3 = r14
            r5 = r18
            goto L_0x042f
        L_0x03c6:
            r9 = r28
            r3 = r14
            boolean r0 = r9.f15099f
            if (r0 == 0) goto L_0x03fe
            r10 = r34
            com.google.android.gms.internal.ads.cm3 r0 = r10.f26397d
            com.google.android.gms.internal.ads.cm3 r1 = com.google.android.gms.internal.ads.cm3.m21985a()
            if (r0 == r1) goto L_0x03fb
            com.google.android.gms.internal.ads.zn3 r0 = r9.f15098e
            com.google.android.gms.internal.ads.cm3 r1 = r10.f26397d
            r11 = r24
            com.google.android.gms.internal.ads.pm3 r0 = r1.mo16685c(r0, r11)
            if (r0 != 0) goto L_0x03f5
            com.google.android.gms.internal.ads.mp3 r4 = m22020I(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zk3.m34652i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x0413
        L_0x03f5:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.ads.om3 r0 = (com.google.android.gms.internal.ads.om3) r0
            throw r3
        L_0x03fb:
            r12 = r29
            goto L_0x0402
        L_0x03fe:
            r12 = r29
            r10 = r34
        L_0x0402:
            r11 = r24
            com.google.android.gms.internal.ads.mp3 r4 = m22020I(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.zk3.m34652i(r0, r1, r2, r3, r4, r5)
        L_0x0413:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r19
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x0425:
            r18 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r3 = 0
        L_0x042f:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x043a
            long r10 = (long) r6
            r2 = r26
            r2.putInt(r12, r10, r5)
        L_0x043a:
            int r2 = r9.f15103j
        L_0x043c:
            int r4 = r9.f15104k
            if (r2 >= r4) goto L_0x044c
            int[] r4 = r9.f15102i
            r4 = r4[r2]
            com.google.android.gms.internal.ads.lp3<?, ?> r5 = r9.f15106m
            r9.m22041p(r12, r4, r3, r5)
            int r2 = r2 + 1
            goto L_0x043c
        L_0x044c:
            if (r7 != 0) goto L_0x0458
            r2 = r32
            if (r0 != r2) goto L_0x0453
            goto L_0x045e
        L_0x0453:
            com.google.android.gms.internal.ads.bn3 r0 = com.google.android.gms.internal.ads.bn3.zzg()
            throw r0
        L_0x0458:
            r2 = r32
            if (r0 > r2) goto L_0x045f
            if (r1 != r7) goto L_0x045f
        L_0x045e:
            return r0
        L_0x045f:
            com.google.android.gms.internal.ads.bn3 r0 = com.google.android.gms.internal.ads.bn3.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.mo16701H(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.yk3):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16702a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f15094a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m22037l(r1)
            int[] r4 = r8.f15094a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m22036k(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m22038m(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m22038m(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m22016D(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34696a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m22038m(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m22027P(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m22038m(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m22038m(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m22024M(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m22015C(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m22023L(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.vp3.m32646n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.vp3.m32646n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.vp3.m32648p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.vp3.m32632H(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34696a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.vp3.m32646n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.vp3.m32644l(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.vp3.m32646n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.vp3.m32646n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.vp3.m32643k(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.vp3.m32642j(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.zm3.m34698c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.lp3<?, ?> r0 = r8.f15106m
            java.lang.Object r0 = r0.mo19254d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f15099f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.ads.dm3<?> r0 = r8.f15107n
            r0.mo16953a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.mo16702a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final int mo16703b(T t) {
        return this.f15101h ? m22026O(t) : m22025N(t);
    }

    /* renamed from: c */
    public final void mo16704c(T t) {
        int i;
        int i2 = this.f15103j;
        while (true) {
            i = this.f15104k;
            if (i2 >= i) {
                break;
            }
            long l = (long) (m22037l(this.f15102i[i2]) & 1048575);
            Object p = vp3.m32648p(t, l);
            if (p != null) {
                ((tn3) p).zzc();
                vp3.m32628D(t, l, p);
            }
            i2++;
        }
        int length = this.f15102i.length;
        while (i < length) {
            this.f15105l.mo18687b(t, (long) this.f15102i[i]);
            i++;
        }
        this.f15106m.mo19263m(t);
        if (this.f15099f) {
            this.f15107n.mo16957e(t);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: d */
    public final void mo16705d(T r13, com.google.android.gms.internal.ads.lo3 r14, com.google.android.gms.internal.ads.cm3 r15) throws java.io.IOException {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r15)
            com.google.android.gms.internal.ads.lp3<?, ?> r7 = r12.f15106m
            com.google.android.gms.internal.ads.dm3<?> r8 = r12.f15107n
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.mo19202b()     // Catch:{ all -> 0x0076 }
            int r2 = r12.m22032U(r1)     // Catch:{ all -> 0x0076 }
            if (r2 >= 0) goto L_0x0079
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f15103j
        L_0x001b:
            int r15 = r12.f15104k
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f15102i
            r15 = r15[r14]
            r12.m22041p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x0029:
            if (r10 == 0) goto L_0x05be
            r7.mo19264n(r13, r10)
            return
        L_0x002f:
            boolean r2 = r12.f15099f     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.zn3 r2 = r12.f15098e     // Catch:{ all -> 0x0076 }
            java.lang.Object r1 = r8.mo16955c(r15, r2, r1)     // Catch:{ all -> 0x0076 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.ads.im3 r0 = r8.mo16954b(r13)     // Catch:{ all -> 0x0076 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo16956d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0076 }
            r0 = r11
            goto L_0x000a
        L_0x0051:
            r7.mo19267q(r14)     // Catch:{ all -> 0x0076 }
            if (r10 != 0) goto L_0x005a
            java.lang.Object r10 = r7.mo19253c(r13)     // Catch:{ all -> 0x0076 }
        L_0x005a:
            boolean r1 = r7.mo19266p(r10, r14)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f15103j
        L_0x0062:
            int r15 = r12.f15104k
            if (r14 >= r15) goto L_0x0070
            int[] r15 = r12.f15102i
            r15 = r15[r14]
            r12.m22041p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0062
        L_0x0070:
            if (r10 == 0) goto L_0x05be
            r7.mo19264n(r13, r10)
            return
        L_0x0076:
            r14 = move-exception
            goto L_0x05bf
        L_0x0079:
            int r3 = r12.m22037l(r2)     // Catch:{ all -> 0x0076 }
            int r4 = m22036k(r3)     // Catch:{ an3 -> 0x0599 }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x056e;
                case 1: goto L_0x055f;
                case 2: goto L_0x0550;
                case 3: goto L_0x0541;
                case 4: goto L_0x0532;
                case 5: goto L_0x0523;
                case 6: goto L_0x0514;
                case 7: goto L_0x0505;
                case 8: goto L_0x04fd;
                case 9: goto L_0x04cc;
                case 10: goto L_0x04bd;
                case 11: goto L_0x04ae;
                case 12: goto L_0x048c;
                case 13: goto L_0x047d;
                case 14: goto L_0x046e;
                case 15: goto L_0x045f;
                case 16: goto L_0x0450;
                case 17: goto L_0x041f;
                case 18: goto L_0x0411;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e7;
                case 22: goto L_0x03d9;
                case 23: goto L_0x03cb;
                case 24: goto L_0x03bd;
                case 25: goto L_0x03af;
                case 26: goto L_0x0385;
                case 27: goto L_0x0373;
                case 28: goto L_0x0365;
                case 29: goto L_0x0357;
                case 30: goto L_0x0342;
                case 31: goto L_0x0334;
                case 32: goto L_0x0326;
                case 33: goto L_0x0318;
                case 34: goto L_0x030a;
                case 35: goto L_0x02fc;
                case 36: goto L_0x02ee;
                case 37: goto L_0x02e0;
                case 38: goto L_0x02d2;
                case 39: goto L_0x02c4;
                case 40: goto L_0x02b6;
                case 41: goto L_0x02a8;
                case 42: goto L_0x029a;
                case 43: goto L_0x028c;
                case 44: goto L_0x0277;
                case 45: goto L_0x0269;
                case 46: goto L_0x025b;
                case 47: goto L_0x024d;
                case 48: goto L_0x023f;
                case 49: goto L_0x022d;
                case 50: goto L_0x01f7;
                case 51: goto L_0x01e5;
                case 52: goto L_0x01d3;
                case 53: goto L_0x01c1;
                case 54: goto L_0x01af;
                case 55: goto L_0x019d;
                case 56: goto L_0x018b;
                case 57: goto L_0x0179;
                case 58: goto L_0x0167;
                case 59: goto L_0x015f;
                case 60: goto L_0x012e;
                case 61: goto L_0x0120;
                case 62: goto L_0x010e;
                case 63: goto L_0x00e9;
                case 64: goto L_0x00d7;
                case 65: goto L_0x00c5;
                case 66: goto L_0x00b3;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x0087;
            }     // Catch:{ an3 -> 0x0599 }
        L_0x0087:
            if (r10 != 0) goto L_0x057d
            java.lang.Object r10 = r7.mo19256f()     // Catch:{ an3 -> 0x0599 }
            goto L_0x057d
        L_0x008f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r5 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r5 = r14.mo19191A(r5, r15)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x00a1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19211k()     // Catch:{ an3 -> 0x0599 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x00b3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            int r5 = r14.mo19207g()     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x00c5:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19213m()     // Catch:{ an3 -> 0x0599 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x00d7:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            int r5 = r14.mo19205e()     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x00e9:
            int r4 = r14.zze()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tm3 r6 = r12.m22039n(r2)     // Catch:{ an3 -> 0x0599 }
            if (r6 == 0) goto L_0x0100
            boolean r6 = r6.mo15938c(r4)     // Catch:{ an3 -> 0x0599 }
            if (r6 == 0) goto L_0x00fa
            goto L_0x0100
        L_0x00fa:
            java.lang.Object r10 = com.google.android.gms.internal.ads.vo3.m32594d(r1, r4, r10, r7)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0100:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r5, r3)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x010e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            int r5 = r14.mo19208h()     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0120:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.kl3 r5 = r14.zzp()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x012e:
            boolean r4 = r12.m22015C(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            if (r4 == 0) goto L_0x014a
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.vp3.m32648p(r13, r3)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r6 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r6 = r14.mo19224x(r6, r15)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.zm3.m34702g(r5, r6)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            goto L_0x015a
        L_0x014a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r5 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r5 = r14.mo19224x(r5, r15)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
        L_0x015a:
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x015f:
            r12.m22046u(r13, r3, r14)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0167:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            boolean r5 = r14.mo19200M()     // Catch:{ an3 -> 0x0599 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0179:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            int r5 = r14.mo19203c()     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x018b:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19209i()     // Catch:{ an3 -> 0x0599 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x019d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            int r5 = r14.mo19204d()     // Catch:{ an3 -> 0x0599 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x01af:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19212l()     // Catch:{ an3 -> 0x0599 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x01c1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19210j()     // Catch:{ an3 -> 0x0599 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x01d3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            float r5 = r14.mo19201a()     // Catch:{ an3 -> 0x0599 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x01e5:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ an3 -> 0x0599 }
            double r5 = r14.zza()     // Catch:{ an3 -> 0x0599 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22048w(r13, r1, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x01f7:
            java.lang.Object r1 = r12.m22042q(r2)     // Catch:{ an3 -> 0x0599 }
            int r2 = r12.m22037l(r2)     // Catch:{ an3 -> 0x0599 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.vp3.m32648p(r13, r2)     // Catch:{ an3 -> 0x0599 }
            if (r4 == 0) goto L_0x021d
            boolean r5 = com.google.android.gms.internal.ads.un3.m31934b(r4)     // Catch:{ an3 -> 0x0599 }
            if (r5 == 0) goto L_0x0228
            com.google.android.gms.internal.ads.tn3 r5 = com.google.android.gms.internal.ads.tn3.zza()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tn3 r5 = r5.zzb()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.un3.m31935c(r5, r4)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r2, r5)     // Catch:{ an3 -> 0x0599 }
            r4 = r5
            goto L_0x0228
        L_0x021d:
            com.google.android.gms.internal.ads.tn3 r4 = com.google.android.gms.internal.ads.tn3.zza()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tn3 r4 = r4.zzb()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r2, r4)     // Catch:{ an3 -> 0x0599 }
        L_0x0228:
            com.google.android.gms.internal.ads.tn3 r4 = (com.google.android.gms.internal.ads.tn3) r4     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.sn3 r1 = (com.google.android.gms.internal.ads.sn3) r1     // Catch:{ an3 -> 0x0599 }
            throw r9     // Catch:{ an3 -> 0x0599 }
        L_0x022d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r1 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.nn3 r2 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            java.util.List r2 = r2.mo18686a(r13, r3)     // Catch:{ an3 -> 0x0599 }
            r14.mo19223w(r2, r1, r15)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x023f:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19193C(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x024d:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19196F(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x025b:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19225y(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0269:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19226z(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0277:
            com.google.android.gms.internal.ads.nn3 r4 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ an3 -> 0x0599 }
            java.util.List r3 = r4.mo18686a(r13, r5)     // Catch:{ an3 -> 0x0599 }
            r14.mo19215o(r3)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tm3 r2 = r12.m22039n(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.vo3.m32593c(r1, r3, r2, r10, r7)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x028c:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19197G(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x029a:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19198H(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02a8:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19192B(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02b6:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19195E(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02c4:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19222v(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02d2:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19218r(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02e0:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19216p(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02ee:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19199I(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x02fc:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19219s(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x030a:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19193C(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0318:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19196F(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0326:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19225y(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0334:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19226z(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0342:
            com.google.android.gms.internal.ads.nn3 r4 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ an3 -> 0x0599 }
            java.util.List r3 = r4.mo18686a(r13, r5)     // Catch:{ an3 -> 0x0599 }
            r14.mo19215o(r3)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tm3 r2 = r12.m22039n(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.vo3.m32593c(r1, r3, r2, r10, r7)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0357:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19197G(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0365:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19220t(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0373:
            com.google.android.gms.internal.ads.to3 r1 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.nn3 r4 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            java.util.List r2 = r4.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19194D(r2, r1, r15)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0385:
            boolean r1 = m22050y(r3)     // Catch:{ an3 -> 0x0599 }
            if (r1 == 0) goto L_0x039d
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r2 = r14
            com.google.android.gms.internal.ads.tl3 r2 = (com.google.android.gms.internal.ads.tl3) r2     // Catch:{ an3 -> 0x0599 }
            r3 = 1
            r2.mo21115J(r1, r3)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x039d:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r2 = r14
            com.google.android.gms.internal.ads.tl3 r2 = (com.google.android.gms.internal.ads.tl3) r2     // Catch:{ an3 -> 0x0599 }
            r3 = 0
            r2.mo21115J(r1, r3)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03af:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19198H(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03bd:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19192B(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03cb:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19195E(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03d9:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19222v(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03e7:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19218r(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x03f5:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19216p(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0403:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19199I(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0411:
            com.google.android.gms.internal.ads.nn3 r1 = r12.f15105l     // Catch:{ an3 -> 0x0599 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ an3 -> 0x0599 }
            java.util.List r1 = r1.mo18686a(r13, r2)     // Catch:{ an3 -> 0x0599 }
            r14.mo19219s(r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x041f:
            boolean r1 = r12.m22051z(r13, r2)     // Catch:{ an3 -> 0x0599 }
            if (r1 == 0) goto L_0x043d
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.vp3.m32648p(r13, r3)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r2 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r2 = r14.mo19191A(r2, r15)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zm3.m34702g(r1, r2)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x043d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r1 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = r14.mo19191A(r1, r15)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0450:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19211k()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32627C(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x045f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            int r1 = r14.mo19207g()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x046e:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19213m()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32627C(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x047d:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            int r1 = r14.mo19205e()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x048c:
            int r4 = r14.zze()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.tm3 r6 = r12.m22039n(r2)     // Catch:{ an3 -> 0x0599 }
            if (r6 == 0) goto L_0x04a3
            boolean r6 = r6.mo15938c(r4)     // Catch:{ an3 -> 0x0599 }
            if (r6 == 0) goto L_0x049d
            goto L_0x04a3
        L_0x049d:
            java.lang.Object r10 = com.google.android.gms.internal.ads.vo3.m32594d(r1, r4, r10, r7)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04a3:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r5, r4)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04ae:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            int r1 = r14.mo19208h()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04bd:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.kl3 r1 = r14.zzp()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04cc:
            boolean r1 = r12.m22051z(r13, r2)     // Catch:{ an3 -> 0x0599 }
            if (r1 == 0) goto L_0x04ea
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.vp3.m32648p(r13, r3)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r2 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r2 = r14.mo19224x(r2, r15)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.zm3.m34702g(r1, r2)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04ea:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.to3 r1 = r12.m22040o(r2)     // Catch:{ an3 -> 0x0599 }
            java.lang.Object r1 = r14.mo19224x(r1, r15)     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32628D(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x04fd:
            r12.m22046u(r13, r3, r14)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0505:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            boolean r1 = r14.mo19200M()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32656x(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0514:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            int r1 = r14.mo19203c()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0523:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19209i()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32627C(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0532:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            int r1 = r14.mo19204d()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32626B(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0541:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19212l()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32627C(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x0550:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            long r5 = r14.mo19210j()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32627C(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x055f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            float r1 = r14.mo19201a()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32625A(r13, r3, r1)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x056e:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ an3 -> 0x0599 }
            double r5 = r14.zza()     // Catch:{ an3 -> 0x0599 }
            com.google.android.gms.internal.ads.vp3.m32658z(r13, r3, r5)     // Catch:{ an3 -> 0x0599 }
            r12.m22047v(r13, r2)     // Catch:{ an3 -> 0x0599 }
            goto L_0x000a
        L_0x057d:
            boolean r1 = r7.mo19266p(r10, r14)     // Catch:{ an3 -> 0x0599 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f15103j
        L_0x0585:
            int r15 = r12.f15104k
            if (r14 >= r15) goto L_0x0593
            int[] r15 = r12.f15102i
            r15 = r15[r14]
            r12.m22041p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0585
        L_0x0593:
            if (r10 == 0) goto L_0x05be
            r7.mo19264n(r13, r10)
            return
        L_0x0599:
            r7.mo19267q(r14)     // Catch:{ all -> 0x0076 }
            if (r10 != 0) goto L_0x05a3
            java.lang.Object r1 = r7.mo19253c(r13)     // Catch:{ all -> 0x0076 }
            r10 = r1
        L_0x05a3:
            boolean r1 = r7.mo19266p(r10, r14)     // Catch:{ all -> 0x0076 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f15103j
        L_0x05ab:
            int r15 = r12.f15104k
            if (r14 >= r15) goto L_0x05b9
            int[] r15 = r12.f15102i
            r15 = r15[r14]
            r12.m22041p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05ab
        L_0x05b9:
            if (r10 == 0) goto L_0x05be
            r7.mo19264n(r13, r10)
        L_0x05be:
            return
        L_0x05bf:
            int r15 = r12.f15103j
        L_0x05c1:
            int r0 = r12.f15104k
            if (r15 >= r0) goto L_0x05cf
            int[] r0 = r12.f15102i
            r0 = r0[r15]
            r12.m22041p(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05c1
        L_0x05cf:
            if (r10 == 0) goto L_0x05d4
            r7.mo19264n(r13, r10)
        L_0x05d4:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.co3.mo16705d(java.lang.Object, com.google.android.gms.internal.ads.lo3, com.google.android.gms.internal.ads.cm3):void");
    }

    /* renamed from: e */
    public final void mo16706e(T t, yl3 yl3) throws IOException {
        if (!this.f15101h) {
            m22017E(t, yl3);
        } else if (!this.f15099f) {
            int length = this.f15094a.length;
            for (int i = 0; i < length; i += 3) {
                int l = m22037l(i);
                int i2 = this.f15094a[i];
                switch (m22036k(l)) {
                    case 0:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22243q(i2, vp3.m32642j(t, (long) (l & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22252z(i2, vp3.m32643k(t, (long) (l & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22221E(i2, vp3.m32646n(t, (long) (l & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22237j(i2, vp3.m32646n(t, (long) (l & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22219C(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22250x(i2, vp3.m32646n(t, (long) (l & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22248v(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22239m(i2, vp3.m32632H(t, (long) (l & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            m22019G(i2, vp3.m32648p(t, (long) (l & 1048575)), yl3);
                            break;
                        }
                    case 9:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22223G(i2, vp3.m32648p(t, (long) (l & 1048575)), m22040o(i));
                            break;
                        }
                    case 10:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22241o(i2, (kl3) vp3.m32648p(t, (long) (l & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22235h(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22246t(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22224H(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22226J(i2, vp3.m32646n(t, (long) (l & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22228a(i2, vp3.m32644l(t, (long) (l & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22230c(i2, vp3.m32646n(t, (long) (l & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m22051z(t, i)) {
                            break;
                        } else {
                            yl3.mo22218B(i2, vp3.m32648p(t, (long) (l & 1048575)), m22040o(i));
                            break;
                        }
                    case 18:
                        vo3.m32602l(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 19:
                        vo3.m32606p(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 20:
                        vo3.m32609s(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 21:
                        vo3.m32564B(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 22:
                        vo3.m32608r(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 23:
                        vo3.m32605o(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 24:
                        vo3.m32604n(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 25:
                        vo3.m32600j(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 26:
                        vo3.m32615y(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3);
                        break;
                    case 27:
                        vo3.m32610t(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, m22040o(i));
                        break;
                    case 28:
                        vo3.m32601k(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3);
                        break;
                    case 29:
                        vo3.m32616z(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 30:
                        vo3.m32603m(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 31:
                        vo3.m32611u(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 32:
                        vo3.m32612v(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 33:
                        vo3.m32613w(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 34:
                        vo3.m32614x(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, false);
                        break;
                    case 35:
                        vo3.m32602l(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 36:
                        vo3.m32606p(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 37:
                        vo3.m32609s(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 38:
                        vo3.m32564B(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 39:
                        vo3.m32608r(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 40:
                        vo3.m32605o(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 41:
                        vo3.m32604n(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 42:
                        vo3.m32600j(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 43:
                        vo3.m32616z(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 44:
                        vo3.m32603m(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 45:
                        vo3.m32611u(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 46:
                        vo3.m32612v(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 47:
                        vo3.m32613w(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 48:
                        vo3.m32614x(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, true);
                        break;
                    case 49:
                        vo3.m32607q(this.f15094a[i], (List) vp3.m32648p(t, (long) (l & 1048575)), yl3, m22040o(i));
                        break;
                    case 50:
                        m22018F(yl3, i2, vp3.m32648p(t, (long) (l & 1048575)), i);
                        break;
                    case 51:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22243q(i2, m22023L(t, (long) (l & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22252z(i2, m22024M(t, (long) (l & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22221E(i2, m22038m(t, (long) (l & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22237j(i2, m22038m(t, (long) (l & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22219C(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22250x(i2, m22038m(t, (long) (l & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22248v(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22239m(i2, m22016D(t, (long) (l & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            m22019G(i2, vp3.m32648p(t, (long) (l & 1048575)), yl3);
                            break;
                        }
                    case 60:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22223G(i2, vp3.m32648p(t, (long) (l & 1048575)), m22040o(i));
                            break;
                        }
                    case 61:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22241o(i2, (kl3) vp3.m32648p(t, (long) (l & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22235h(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22246t(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22224H(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22226J(i2, m22038m(t, (long) (l & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22228a(i2, m22027P(t, (long) (l & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22230c(i2, m22038m(t, (long) (l & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m22015C(t, i2, i)) {
                            break;
                        } else {
                            yl3.mo22218B(i2, vp3.m32648p(t, (long) (l & 1048575)), m22040o(i));
                            break;
                        }
                }
            }
            lp3<?, ?> lp3 = this.f15106m;
            lp3.mo19268r(lp3.mo19254d(t), yl3);
        } else {
            this.f15107n.mo16953a(t);
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo16707f(T t, byte[] bArr, int i, int i2, yk3 yk3) throws IOException {
        if (this.f15101h) {
            m22030S(t, bArr, i, i2, yk3);
        } else {
            mo16701H(t, bArr, i, i2, 0, yk3);
        }
    }

    /* renamed from: g */
    public final boolean mo16708g(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f15103j) {
            int i6 = this.f15102i[i5];
            int i7 = this.f15094a[i6];
            int l = m22037l(i6);
            int i8 = this.f15094a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f15093q.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & l) != 0 && !m22013A(t, i6, i2, i, i10)) {
                return false;
            }
            int k = m22036k(l);
            if (k != 9 && k != 17) {
                if (k != 27) {
                    if (k == 60 || k == 68) {
                        if (m22015C(t2, i7, i6) && !m22014B(t2, l, m22040o(i6))) {
                            return false;
                        }
                    } else if (k != 49) {
                        if (k == 50 && !((tn3) vp3.m32648p(t2, (long) (l & 1048575))).isEmpty()) {
                            sn3 sn3 = (sn3) m22042q(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) vp3.m32648p(t2, (long) (l & 1048575));
                if (!list.isEmpty()) {
                    to3 o = m22040o(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!o.mo16708g(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m22013A(t, i6, i2, i, i10) && !m22014B(t2, l, m22040o(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f15099f) {
            return true;
        }
        this.f15107n.mo16953a(t2);
        throw null;
    }

    /* renamed from: h */
    public final void mo16709h(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f15094a.length; i += 3) {
            int l = m22037l(i);
            long j = (long) (1048575 & l);
            int i2 = this.f15094a[i];
            switch (m22036k(l)) {
                case 0:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32658z(t, j, vp3.m32642j(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 1:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32625A(t, j, vp3.m32643k(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 2:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32627C(t, j, vp3.m32646n(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 3:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32627C(t, j, vp3.m32646n(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 4:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 5:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32627C(t, j, vp3.m32646n(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 6:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 7:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32656x(t, j, vp3.m32632H(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 8:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32628D(t, j, vp3.m32648p(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 9:
                    m22044s(t, t2, i);
                    break;
                case 10:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32628D(t, j, vp3.m32648p(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 11:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 12:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 13:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 14:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32627C(t, j, vp3.m32646n(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 15:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32626B(t, j, vp3.m32644l(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 16:
                    if (!m22051z(t2, i)) {
                        break;
                    } else {
                        vp3.m32627C(t, j, vp3.m32646n(t2, j));
                        m22047v(t, i);
                        break;
                    }
                case 17:
                    m22044s(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f15105l.mo18688c(t, t2, j);
                    break;
                case 50:
                    vo3.m32599i(this.f15108o, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m22015C(t2, i2, i)) {
                        break;
                    } else {
                        vp3.m32628D(t, j, vp3.m32648p(t2, j));
                        m22048w(t, i2, i);
                        break;
                    }
                case 60:
                    m22045t(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m22015C(t2, i2, i)) {
                        break;
                    } else {
                        vp3.m32628D(t, j, vp3.m32648p(t2, j));
                        m22048w(t, i2, i);
                        break;
                    }
                case 68:
                    m22045t(t, t2, i);
                    break;
            }
        }
        vo3.m32596f(this.f15106m, t, t2);
        if (this.f15099f) {
            vo3.m32595e(this.f15107n, t, t2);
            throw null;
        }
    }

    /* renamed from: i */
    public final boolean mo16710i(T t, T t2) {
        boolean z;
        int length = this.f15094a.length;
        for (int i = 0; i < length; i += 3) {
            int l = m22037l(i);
            long j = (long) (l & 1048575);
            switch (m22036k(l)) {
                case 0:
                    if (m22049x(t, t2, i) && Double.doubleToLongBits(vp3.m32642j(t, j)) == Double.doubleToLongBits(vp3.m32642j(t2, j))) {
                        continue;
                    }
                case 1:
                    if (m22049x(t, t2, i) && Float.floatToIntBits(vp3.m32643k(t, j)) == Float.floatToIntBits(vp3.m32643k(t2, j))) {
                        continue;
                    }
                case 2:
                    if (m22049x(t, t2, i) && vp3.m32646n(t, j) == vp3.m32646n(t2, j)) {
                        continue;
                    }
                case 3:
                    if (m22049x(t, t2, i) && vp3.m32646n(t, j) == vp3.m32646n(t2, j)) {
                        continue;
                    }
                case 4:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 5:
                    if (m22049x(t, t2, i) && vp3.m32646n(t, j) == vp3.m32646n(t2, j)) {
                        continue;
                    }
                case 6:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 7:
                    if (m22049x(t, t2, i) && vp3.m32632H(t, j) == vp3.m32632H(t2, j)) {
                        continue;
                    }
                case 8:
                    if (m22049x(t, t2, i) && vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j))) {
                        continue;
                    }
                case 9:
                    if (m22049x(t, t2, i) && vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j))) {
                        continue;
                    }
                case 10:
                    if (m22049x(t, t2, i) && vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j))) {
                        continue;
                    }
                case 11:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 12:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 13:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 14:
                    if (m22049x(t, t2, i) && vp3.m32646n(t, j) == vp3.m32646n(t2, j)) {
                        continue;
                    }
                case 15:
                    if (m22049x(t, t2, i) && vp3.m32644l(t, j) == vp3.m32644l(t2, j)) {
                        continue;
                    }
                case 16:
                    if (m22049x(t, t2, i) && vp3.m32646n(t, j) == vp3.m32646n(t2, j)) {
                        continue;
                    }
                case 17:
                    if (m22049x(t, t2, i) && vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j));
                    break;
                case 50:
                    z = vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long W = (long) (m22034W(i) & 1048575);
                    if (vp3.m32644l(t, W) == vp3.m32644l(t2, W) && vo3.m32598h(vp3.m32648p(t, j), vp3.m32648p(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f15106m.mo19254d(t).equals(this.f15106m.mo19254d(t2))) {
            return false;
        }
        if (!this.f15099f) {
            return true;
        }
        this.f15107n.mo16953a(t);
        this.f15107n.mo16953a(t2);
        throw null;
    }

    public final T zze() {
        return ((qm3) this.f15098e).mo15709C(4, (Object) null, (Object) null);
    }
}
