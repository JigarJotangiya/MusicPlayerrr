package com.airbnb.lottie.p024x;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1688a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p082e.p098e.C3479h;
import p082e.p109h.p119p.p121f0.C3758b;

/* renamed from: com.airbnb.lottie.x.t */
/* compiled from: KeyframeParser */
class C1668t {

    /* renamed from: a */
    private static final Interpolator f6297a = new LinearInterpolator();

    /* renamed from: b */
    private static C3479h<WeakReference<Interpolator>> f6298b;

    /* renamed from: c */
    static C1657c.C1658a f6299c = C1657c.C1658a.m8335a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static C1657c.C1658a f6300d = C1657c.C1658a.m8335a("x", "y");

    C1668t() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m8380a(int i) {
        WeakReference<Interpolator> f;
        synchronized (C1668t.class) {
            f = m8386g().mo12409f(i);
        }
        return f;
    }

    /* renamed from: b */
    private static Interpolator m8381b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        pointF.x = C1682g.m8444c(pointF.x, -1.0f, 1.0f);
        pointF.y = C1682g.m8444c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C1682g.m8444c(pointF2.x, -1.0f, 1.0f);
        float c = C1682g.m8444c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c;
        int i = C1683h.m8463i(pointF.x, pointF.y, pointF2.x, c);
        WeakReference<Interpolator> a = m8380a(i);
        Interpolator interpolator2 = a != null ? (Interpolator) a.get() : null;
        if (a == null || interpolator2 == null) {
            try {
                interpolator = C3758b.m16089a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator = C3758b.m16089a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator = new LinearInterpolator();
                }
            }
            interpolator2 = interpolator;
            try {
                m8387h(i, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    /* renamed from: c */
    static <T> C1688a<T> m8382c(C1657c cVar, C1464d dVar, float f, C1653m0<T> m0Var, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return m8384e(dVar, cVar, f, m0Var);
        }
        if (z) {
            return m8383d(dVar, cVar, f, m0Var);
        }
        return m8385f(cVar, f, m0Var);
    }

    /* renamed from: d */
    private static <T> C1688a<T> m8383d(C1464d dVar, C1657c cVar, float f, C1653m0<T> m0Var) throws IOException {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        cVar.mo7438p();
        PointF pointF = null;
        PointF pointF2 = null;
        T t2 = null;
        T t3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (cVar.mo7427H()) {
            switch (cVar.mo7439v0(f6299c)) {
                case 0:
                    f2 = (float) cVar.mo7430Q();
                    break;
                case 1:
                    t3 = m0Var.mo7411a(cVar, f);
                    break;
                case 2:
                    t2 = m0Var.mo7411a(cVar, f);
                    break;
                case 3:
                    pointF = C1666s.m8377e(cVar, 1.0f);
                    break;
                case 4:
                    pointF2 = C1666s.m8377e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.mo7431T() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = C1666s.m8377e(cVar, f);
                    break;
                case 7:
                    pointF4 = C1666s.m8377e(cVar, f);
                    break;
                default:
                    cVar.mo7425A0();
                    break;
            }
        }
        cVar.mo7426E();
        if (z) {
            interpolator = f6297a;
            t = t3;
        } else {
            if (pointF == null || pointF2 == null) {
                interpolator2 = f6297a;
            } else {
                interpolator2 = m8381b(pointF, pointF2);
            }
            interpolator = interpolator2;
            t = t2;
        }
        C1688a aVar = new C1688a(dVar, t3, t, interpolator, f2, (Float) null);
        aVar.f6347o = pointF3;
        aVar.f6348p = pointF4;
        return aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r14 = r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> com.airbnb.lottie.p027z.C1688a<T> m8384e(com.airbnb.lottie.C1464d r21, com.airbnb.lottie.p024x.p025n0.C1657c r22, float r23, com.airbnb.lottie.p024x.C1653m0<T> r24) throws java.io.IOException {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r22.mo7438p()
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0016:
            boolean r17 = r22.mo7427H()
            if (r17 == 0) goto L_0x01a8
            com.airbnb.lottie.x.n0.c$a r4 = f6299c
            int r4 = r0.mo7439v0(r4)
            r5 = 1
            switch(r4) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0191;
                case 2: goto L_0x0187;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0044;
                case 5: goto L_0x003a;
                case 6: goto L_0x0035;
                case 7: goto L_0x0030;
                default: goto L_0x0026;
            }
        L_0x0026:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo7425A0()
            goto L_0x01a4
        L_0x0030:
            android.graphics.PointF r3 = com.airbnb.lottie.p024x.C1666s.m8377e(r22, r23)
            goto L_0x0016
        L_0x0035:
            android.graphics.PointF r15 = com.airbnb.lottie.p024x.C1666s.m8377e(r22, r23)
            goto L_0x0016
        L_0x003a:
            int r4 = r22.mo7431T()
            if (r4 != r5) goto L_0x0042
            r6 = 1
            goto L_0x0016
        L_0x0042:
            r6 = 0
            goto L_0x0016
        L_0x0044:
            com.airbnb.lottie.x.n0.c$b r4 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r5 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x00e8
            r22.mo7438p()
            r4 = 0
            r5 = 0
            r12 = 0
            r13 = 0
        L_0x0053:
            boolean r18 = r22.mo7427H()
            if (r18 == 0) goto L_0x00d2
            r18 = r15
            com.airbnb.lottie.x.n0.c$a r15 = f6300d
            int r15 = r0.mo7439v0(r15)
            if (r15 == 0) goto L_0x00a5
            r19 = r3
            r3 = 1
            if (r15 == r3) goto L_0x0070
            r22.mo7425A0()
        L_0x006b:
            r15 = r18
            r3 = r19
            goto L_0x0053
        L_0x0070:
            com.airbnb.lottie.x.n0.c$b r3 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r5 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.NUMBER
            if (r3 != r5) goto L_0x0081
            r3 = r14
            double r13 = r22.mo7430Q()
            float r13 = (float) r13
            r14 = r3
            r5 = r13
            goto L_0x006b
        L_0x0081:
            r3 = r14
            r22.mo7433d()
            double r13 = r22.mo7430Q()
            float r13 = (float) r13
            com.airbnb.lottie.x.n0.c$b r14 = r22.mo7436n0()
            if (r14 != r5) goto L_0x0096
            double r14 = r22.mo7430Q()
            float r5 = (float) r14
            goto L_0x0097
        L_0x0096:
            r5 = r13
        L_0x0097:
            r22.mo7440x()
            r14 = r3
            r15 = r18
            r3 = r19
            r20 = r13
            r13 = r5
            r5 = r20
            goto L_0x0053
        L_0x00a5:
            r19 = r3
            r3 = r14
            com.airbnb.lottie.x.n0.c$b r4 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r12 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.NUMBER
            if (r4 != r12) goto L_0x00b8
            double r14 = r22.mo7430Q()
            float r12 = (float) r14
            r14 = r3
            r4 = r12
            goto L_0x006b
        L_0x00b8:
            r22.mo7433d()
            double r14 = r22.mo7430Q()
            float r4 = (float) r14
            com.airbnb.lottie.x.n0.c$b r14 = r22.mo7436n0()
            if (r14 != r12) goto L_0x00cc
            double r14 = r22.mo7430Q()
            float r12 = (float) r14
            goto L_0x00cd
        L_0x00cc:
            r12 = r4
        L_0x00cd:
            r22.mo7440x()
            r14 = r3
            goto L_0x006b
        L_0x00d2:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r12, r13)
            r22.mo7426E()
            r13 = r4
            r12 = r14
            goto L_0x017d
        L_0x00e8:
            r19 = r3
            r3 = r14
            r18 = r15
            android.graphics.PointF r8 = com.airbnb.lottie.p024x.C1666s.m8377e(r22, r23)
            goto L_0x01a4
        L_0x00f3:
            r19 = r3
            r3 = r14
            r18 = r15
            com.airbnb.lottie.x.n0.c$b r4 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r5 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.BEGIN_OBJECT
            if (r4 != r5) goto L_0x017f
            r22.mo7438p()
            r4 = 0
            r5 = 0
            r9 = 0
            r11 = 0
        L_0x0107:
            boolean r14 = r22.mo7427H()
            if (r14 == 0) goto L_0x016c
            com.airbnb.lottie.x.n0.c$a r14 = f6300d
            int r14 = r0.mo7439v0(r14)
            if (r14 == 0) goto L_0x0144
            r15 = 1
            if (r14 == r15) goto L_0x011c
            r22.mo7425A0()
            goto L_0x0107
        L_0x011c:
            com.airbnb.lottie.x.n0.c$b r5 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r11 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.NUMBER
            if (r5 != r11) goto L_0x012b
            double r14 = r22.mo7430Q()
            float r11 = (float) r14
            r5 = r11
            goto L_0x0107
        L_0x012b:
            r22.mo7433d()
            double r14 = r22.mo7430Q()
            float r5 = (float) r14
            com.airbnb.lottie.x.n0.c$b r14 = r22.mo7436n0()
            if (r14 != r11) goto L_0x013f
            double r14 = r22.mo7430Q()
            float r11 = (float) r14
            goto L_0x0140
        L_0x013f:
            r11 = r5
        L_0x0140:
            r22.mo7440x()
            goto L_0x0107
        L_0x0144:
            com.airbnb.lottie.x.n0.c$b r4 = r22.mo7436n0()
            com.airbnb.lottie.x.n0.c$b r9 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.NUMBER
            if (r4 != r9) goto L_0x0153
            double r14 = r22.mo7430Q()
            float r9 = (float) r14
            r4 = r9
            goto L_0x0107
        L_0x0153:
            r22.mo7433d()
            double r14 = r22.mo7430Q()
            float r4 = (float) r14
            com.airbnb.lottie.x.n0.c$b r14 = r22.mo7436n0()
            if (r14 != r9) goto L_0x0167
            double r14 = r22.mo7430Q()
            float r9 = (float) r14
            goto L_0x0168
        L_0x0167:
            r9 = r4
        L_0x0168:
            r22.mo7440x()
            goto L_0x0107
        L_0x016c:
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r9, r11)
            r22.mo7426E()
            r11 = r4
            r9 = r14
            r15 = r18
        L_0x017d:
            r14 = r3
            goto L_0x01a4
        L_0x017f:
            android.graphics.PointF r7 = com.airbnb.lottie.p024x.C1666s.m8377e(r22, r23)
            r14 = r3
            r15 = r18
            goto L_0x01a4
        L_0x0187:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r16 = r2.mo7411a(r0, r1)
            goto L_0x01a4
        L_0x0191:
            r19 = r3
            r3 = r14
            r18 = r15
            java.lang.Object r10 = r2.mo7411a(r0, r1)
            goto L_0x01a4
        L_0x019b:
            r19 = r3
            r18 = r15
            double r3 = r22.mo7430Q()
            float r14 = (float) r3
        L_0x01a4:
            r3 = r19
            goto L_0x0016
        L_0x01a8:
            r19 = r3
            r3 = r14
            r18 = r15
            r22.mo7426E()
            if (r6 == 0) goto L_0x01b8
            android.view.animation.Interpolator r0 = f6297a
            r11 = r10
        L_0x01b5:
            r12 = 0
            r13 = 0
            goto L_0x01dc
        L_0x01b8:
            if (r7 == 0) goto L_0x01c1
            if (r8 == 0) goto L_0x01c1
            android.view.animation.Interpolator r0 = m8381b(r7, r8)
            goto L_0x01d9
        L_0x01c1:
            if (r9 == 0) goto L_0x01d7
            if (r11 == 0) goto L_0x01d7
            if (r12 == 0) goto L_0x01d7
            if (r13 == 0) goto L_0x01d7
            android.view.animation.Interpolator r0 = m8381b(r9, r12)
            android.view.animation.Interpolator r1 = m8381b(r11, r13)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01dc
        L_0x01d7:
            android.view.animation.Interpolator r0 = f6297a
        L_0x01d9:
            r11 = r16
            goto L_0x01b5
        L_0x01dc:
            if (r12 == 0) goto L_0x01ed
            if (r13 == 0) goto L_0x01ed
            com.airbnb.lottie.z.a r0 = new com.airbnb.lottie.z.a
            r15 = 0
            r8 = r0
            r9 = r21
            r14 = r3
            r5 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01fb
        L_0x01ed:
            r5 = r18
            com.airbnb.lottie.z.a r1 = new com.airbnb.lottie.z.a
            r14 = 0
            r8 = r1
            r9 = r21
            r12 = r0
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r0 = r1
        L_0x01fb:
            r0.f6347o = r5
            r3 = r19
            r0.f6348p = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p024x.C1668t.m8384e(com.airbnb.lottie.d, com.airbnb.lottie.x.n0.c, float, com.airbnb.lottie.x.m0):com.airbnb.lottie.z.a");
    }

    /* renamed from: f */
    private static <T> C1688a<T> m8385f(C1657c cVar, float f, C1653m0<T> m0Var) throws IOException {
        return new C1688a<>(m0Var.mo7411a(cVar, f));
    }

    /* renamed from: g */
    private static C3479h<WeakReference<Interpolator>> m8386g() {
        if (f6298b == null) {
            f6298b = new C3479h<>();
        }
        return f6298b;
    }

    /* renamed from: h */
    private static void m8387h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C1668t.class) {
            f6298b.mo12414k(i, weakReference);
        }
    }
}
