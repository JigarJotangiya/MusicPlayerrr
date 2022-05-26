package com.airbnb.lottie.p019v.p022l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1464d;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;
import p082e.p098e.C3470d;

/* renamed from: com.airbnb.lottie.v.l.b */
/* compiled from: CompositionLayer */
public class C1607b extends C1604a {

    /* renamed from: B */
    private C1529a<Float, Float> f6153B;

    /* renamed from: C */
    private final List<C1604a> f6154C = new ArrayList();

    /* renamed from: D */
    private final RectF f6155D = new RectF();

    /* renamed from: E */
    private final RectF f6156E = new RectF();

    /* renamed from: F */
    private final Paint f6157F = new Paint();

    /* renamed from: com.airbnb.lottie.v.l.b$a */
    /* compiled from: CompositionLayer */
    static /* synthetic */ class C1608a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6158a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.v.l.d$b[] r0 = com.airbnb.lottie.p019v.p022l.C1610d.C1612b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6158a = r0
                com.airbnb.lottie.v.l.d$b r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1612b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6158a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.v.l.d$b r1 = com.airbnb.lottie.p019v.p022l.C1610d.C1612b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p019v.p022l.C1607b.C1608a.<clinit>():void");
        }
    }

    public C1607b(C1473f fVar, C1610d dVar, List<C1610d> list, C1464d dVar2) {
        super(fVar, dVar);
        int i;
        C1604a aVar;
        C1566b u = dVar.mo7394u();
        if (u != null) {
            C1529a<Float, Float> a = u.mo7245a();
            this.f6153B = a;
            mo7366i(a);
            this.f6153B.mo7151a(this);
        } else {
            this.f6153B = null;
        }
        C3470d dVar3 = new C3470d(dVar2.mo7012k().size());
        int size = list.size() - 1;
        C1604a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C1610d dVar4 = list.get(size);
            C1604a u2 = C1604a.m8151u(this, dVar4, fVar, dVar2);
            if (u2 != null) {
                dVar3.mo12309m(u2.mo7371y().mo7376d(), u2);
                if (aVar2 != null) {
                    aVar2.mo7362H(u2);
                    aVar2 = null;
                } else {
                    this.f6154C.add(0, u2);
                    int i2 = C1608a.f6158a[dVar4.mo7380h().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = u2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar3.mo12312q(); i++) {
            C1604a aVar3 = (C1604a) dVar3.mo12304h(dVar3.mo12308l(i));
            if (!(aVar3 == null || (aVar = (C1604a) dVar3.mo12304h(aVar3.mo7371y().mo7382j())) == null)) {
                aVar3.mo7364J(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo7361G(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        for (int i2 = 0; i2 < this.f6154C.size(); i2++) {
            this.f6154C.get(i2).mo7134c(eVar, i, list, eVar2);
        }
    }

    /* renamed from: I */
    public void mo7363I(boolean z) {
        super.mo7363I(z);
        for (C1604a I : this.f6154C) {
            I.mo7363I(z);
        }
    }

    /* renamed from: K */
    public void mo7365K(float f) {
        super.mo7365K(f);
        if (this.f6153B != null) {
            f = ((this.f6153B.mo7157h().floatValue() * this.f6138o.mo7374b().mo7010i()) - this.f6138o.mo7374b().mo7017p()) / (this.f6137n.mo7092q().mo7006e() + 0.01f);
        }
        if (this.f6153B == null) {
            f -= this.f6138o.mo7390r();
        }
        if (this.f6138o.mo7395v() != 0.0f && !"__container".equals(this.f6138o.mo7381i())) {
            f /= this.f6138o.mo7395v();
        }
        for (int size = this.f6154C.size() - 1; size >= 0; size--) {
            this.f6154C.get(size).mo7365K(f);
        }
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        super.mo7135d(rectF, matrix, z);
        for (int size = this.f6154C.size() - 1; size >= 0; size--) {
            this.f6155D.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f6154C.get(size).mo7135d(this.f6155D, this.f6136m, true);
            rectF.union(this.f6155D);
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t != C1493k.f5715E) {
            return;
        }
        if (cVar == null) {
            C1529a<Float, Float> aVar = this.f6153B;
            if (aVar != null) {
                aVar.mo7163n((C1690c<Float>) null);
                return;
            }
            return;
        }
        C1552q qVar = new C1552q(cVar);
        this.f6153B = qVar;
        qVar.mo7151a(this);
        mo7366i(this.f6153B);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7367t(Canvas canvas, Matrix matrix, int i) {
        C1462c.m7603a("CompositionLayer#draw");
        this.f6156E.set(0.0f, 0.0f, (float) this.f6138o.mo7384l(), (float) this.f6138o.mo7383k());
        matrix.mapRect(this.f6156E);
        boolean z = this.f6137n.mo7046J() && this.f6154C.size() > 1 && i != 255;
        if (z) {
            this.f6157F.setAlpha(i);
            C1683h.m8467m(canvas, this.f6156E, this.f6157F);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f6154C.size() - 1; size >= 0; size--) {
            if (!this.f6156E.isEmpty() ? canvas.clipRect(this.f6156E) : true) {
                this.f6154C.get(size).mo7136f(canvas, matrix, i);
            }
        }
        canvas.restore();
        C1462c.m7604b("CompositionLayer#draw");
    }
}
