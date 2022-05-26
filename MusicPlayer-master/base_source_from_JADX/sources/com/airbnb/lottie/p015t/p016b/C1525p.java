package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1551p;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1593l;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.p */
/* compiled from: RepeaterContent */
public class C1525p implements C1512e, C1521m, C1517j, C1529a.C1531b, C1518k {

    /* renamed from: a */
    private final Matrix f5879a = new Matrix();

    /* renamed from: b */
    private final Path f5880b = new Path();

    /* renamed from: c */
    private final C1473f f5881c;

    /* renamed from: d */
    private final C1604a f5882d;

    /* renamed from: e */
    private final String f5883e;

    /* renamed from: f */
    private final boolean f5884f;

    /* renamed from: g */
    private final C1529a<Float, Float> f5885g;

    /* renamed from: h */
    private final C1529a<Float, Float> f5886h;

    /* renamed from: i */
    private final C1551p f5887i;

    /* renamed from: j */
    private C1511d f5888j;

    public C1525p(C1473f fVar, C1604a aVar, C1593l lVar) {
        this.f5881c = fVar;
        this.f5882d = aVar;
        this.f5883e = lVar.mo7317c();
        this.f5884f = lVar.mo7320f();
        C1529a<Float, Float> a = lVar.mo7316b().mo7245a();
        this.f5885g = a;
        aVar.mo7366i(a);
        a.mo7151a(this);
        C1529a<Float, Float> a2 = lVar.mo7318d().mo7245a();
        this.f5886h = a2;
        aVar.mo7366i(a2);
        a2.mo7151a(this);
        C1551p b = lVar.mo7319e().mo7250b();
        this.f5887i = b;
        b.mo7202a(aVar);
        b.mo7203b(this);
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5881c.invalidateSelf();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        this.f5888j.mo7133b(list, list2);
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        this.f5888j.mo7135d(rectF, matrix, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7144e(java.util.ListIterator<com.airbnb.lottie.p015t.p016b.C1510c> r9) {
        /*
            r8 = this;
            com.airbnb.lottie.t.b.d r0 = r8.f5888j
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r0 = r9.previous()
            if (r0 == r8) goto L_0x0012
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0017:
            boolean r0 = r9.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r9.previous()
            r6.add(r0)
            r9.remove()
            goto L_0x0017
        L_0x0028:
            java.util.Collections.reverse(r6)
            com.airbnb.lottie.t.b.d r9 = new com.airbnb.lottie.t.b.d
            com.airbnb.lottie.f r2 = r8.f5881c
            com.airbnb.lottie.v.l.a r3 = r8.f5882d
            boolean r5 = r8.f5884f
            r7 = 0
            java.lang.String r4 = "Repeater"
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.f5888j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p015t.p016b.C1525p.mo7144e(java.util.ListIterator):void");
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f5885g.mo7157h().floatValue();
        float floatValue2 = this.f5886h.mo7157h().floatValue();
        float floatValue3 = this.f5887i.mo7209i().mo7157h().floatValue() / 100.0f;
        float floatValue4 = this.f5887i.mo7205e().mo7157h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f5879a.set(matrix);
            float f = (float) i2;
            this.f5879a.preConcat(this.f5887i.mo7207g(f + floatValue2));
            this.f5888j.mo7136f(canvas, this.f5879a, (int) (((float) i) * C1682g.m8452k(floatValue3, floatValue4, f / floatValue)));
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        if (!this.f5887i.mo7204c(t, cVar)) {
            if (t == C1493k.f5745u) {
                this.f5885g.mo7163n(cVar);
            } else if (t == C1493k.f5746v) {
                this.f5886h.mo7163n(cVar);
            }
        }
    }

    public String getName() {
        return this.f5883e;
    }

    public Path getPath() {
        Path path = this.f5888j.getPath();
        this.f5880b.reset();
        float floatValue = this.f5885g.mo7157h().floatValue();
        float floatValue2 = this.f5886h.mo7157h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f5879a.set(this.f5887i.mo7207g(((float) i) + floatValue2));
            this.f5880b.addPath(path, this.f5879a);
        }
        return this.f5880b;
    }
}
