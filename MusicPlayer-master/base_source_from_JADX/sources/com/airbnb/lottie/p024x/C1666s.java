package com.airbnb.lottie.p024x;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.x.s */
/* compiled from: JsonUtils */
class C1666s {

    /* renamed from: a */
    private static final C1657c.C1658a f6295a = C1657c.C1658a.m8335a("x", "y");

    /* renamed from: com.airbnb.lottie.x.s$a */
    /* compiled from: JsonUtils */
    static /* synthetic */ class C1667a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6296a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.x.n0.c$b[] r0 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6296a = r0
                com.airbnb.lottie.x.n0.c$b r1 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6296a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.x.n0.c$b r1 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6296a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.x.n0.c$b r1 = com.airbnb.lottie.p024x.p025n0.C1657c.C1659b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p024x.C1666s.C1667a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static PointF m8373a(C1657c cVar, float f) throws IOException {
        cVar.mo7433d();
        float Q = (float) cVar.mo7430Q();
        float Q2 = (float) cVar.mo7430Q();
        while (cVar.mo7436n0() != C1657c.C1659b.END_ARRAY) {
            cVar.mo7425A0();
        }
        cVar.mo7440x();
        return new PointF(Q * f, Q2 * f);
    }

    /* renamed from: b */
    private static PointF m8374b(C1657c cVar, float f) throws IOException {
        float Q = (float) cVar.mo7430Q();
        float Q2 = (float) cVar.mo7430Q();
        while (cVar.mo7427H()) {
            cVar.mo7425A0();
        }
        return new PointF(Q * f, Q2 * f);
    }

    /* renamed from: c */
    private static PointF m8375c(C1657c cVar, float f) throws IOException {
        cVar.mo7438p();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo7427H()) {
            int v0 = cVar.mo7439v0(f6295a);
            if (v0 == 0) {
                f2 = m8379g(cVar);
            } else if (v0 != 1) {
                cVar.mo7441z0();
                cVar.mo7425A0();
            } else {
                f3 = m8379g(cVar);
            }
        }
        cVar.mo7426E();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    static int m8376d(C1657c cVar) throws IOException {
        cVar.mo7433d();
        int Q = (int) (cVar.mo7430Q() * 255.0d);
        int Q2 = (int) (cVar.mo7430Q() * 255.0d);
        int Q3 = (int) (cVar.mo7430Q() * 255.0d);
        while (cVar.mo7427H()) {
            cVar.mo7425A0();
        }
        cVar.mo7440x();
        return Color.argb(255, Q, Q2, Q3);
    }

    /* renamed from: e */
    static PointF m8377e(C1657c cVar, float f) throws IOException {
        int i = C1667a.f6296a[cVar.mo7436n0().ordinal()];
        if (i == 1) {
            return m8374b(cVar, f);
        }
        if (i == 2) {
            return m8373a(cVar, f);
        }
        if (i == 3) {
            return m8375c(cVar, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.mo7436n0());
    }

    /* renamed from: f */
    static List<PointF> m8378f(C1657c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo7433d();
        while (cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY) {
            cVar.mo7433d();
            arrayList.add(m8377e(cVar, f));
            cVar.mo7440x();
        }
        cVar.mo7440x();
        return arrayList;
    }

    /* renamed from: g */
    static float m8379g(C1657c cVar) throws IOException {
        C1657c.C1659b n0 = cVar.mo7436n0();
        int i = C1667a.f6296a[n0.ordinal()];
        if (i == 1) {
            return (float) cVar.mo7430Q();
        }
        if (i == 2) {
            cVar.mo7433d();
            float Q = (float) cVar.mo7430Q();
            while (cVar.mo7427H()) {
                cVar.mo7425A0();
            }
            cVar.mo7440x();
            return Q;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + n0);
    }
}
