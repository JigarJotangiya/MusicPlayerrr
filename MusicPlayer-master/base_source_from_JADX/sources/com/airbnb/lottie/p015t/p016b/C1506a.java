package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1537c;
import com.airbnb.lottie.p015t.p017c.C1539d;
import com.airbnb.lottie.p015t.p017c.C1541f;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p020j.C1566b;
import com.airbnb.lottie.p019v.p020j.C1568d;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.a */
/* compiled from: BaseStrokeContent */
public abstract class C1506a implements C1529a.C1531b, C1518k, C1512e {

    /* renamed from: a */
    private final PathMeasure f5764a = new PathMeasure();

    /* renamed from: b */
    private final Path f5765b = new Path();

    /* renamed from: c */
    private final Path f5766c = new Path();

    /* renamed from: d */
    private final RectF f5767d = new RectF();

    /* renamed from: e */
    private final C1473f f5768e;

    /* renamed from: f */
    protected final C1604a f5769f;

    /* renamed from: g */
    private final List<C1508b> f5770g = new ArrayList();

    /* renamed from: h */
    private final float[] f5771h;

    /* renamed from: i */
    final Paint f5772i;

    /* renamed from: j */
    private final C1529a<?, Float> f5773j;

    /* renamed from: k */
    private final C1529a<?, Integer> f5774k;

    /* renamed from: l */
    private final List<C1529a<?, Float>> f5775l;

    /* renamed from: m */
    private final C1529a<?, Float> f5776m;

    /* renamed from: n */
    private C1529a<ColorFilter, ColorFilter> f5777n;

    /* renamed from: o */
    private C1529a<Float, Float> f5778o;

    /* renamed from: p */
    float f5779p;

    /* renamed from: q */
    private C1537c f5780q;

    /* renamed from: com.airbnb.lottie.t.b.a$b */
    /* compiled from: BaseStrokeContent */
    private static final class C1508b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C1521m> f5781a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1528s f5782b;

        private C1508b(C1528s sVar) {
            this.f5781a = new ArrayList();
            this.f5782b = sVar;
        }
    }

    C1506a(C1473f fVar, C1604a aVar, Paint.Cap cap, Paint.Join join, float f, C1568d dVar, C1566b bVar, List<C1566b> list, C1566b bVar2) {
        C1505a aVar2 = new C1505a(1);
        this.f5772i = aVar2;
        this.f5779p = 0.0f;
        this.f5768e = fVar;
        this.f5769f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f5774k = dVar.mo7245a();
        this.f5773j = bVar.mo7245a();
        if (bVar2 == null) {
            this.f5776m = null;
        } else {
            this.f5776m = bVar2.mo7245a();
        }
        this.f5775l = new ArrayList(list.size());
        this.f5771h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f5775l.add(list.get(i).mo7245a());
        }
        aVar.mo7366i(this.f5774k);
        aVar.mo7366i(this.f5773j);
        for (int i2 = 0; i2 < this.f5775l.size(); i2++) {
            aVar.mo7366i(this.f5775l.get(i2));
        }
        C1529a<?, Float> aVar3 = this.f5776m;
        if (aVar3 != null) {
            aVar.mo7366i(aVar3);
        }
        this.f5774k.mo7151a(this);
        this.f5773j.mo7151a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f5775l.get(i3).mo7151a(this);
        }
        C1529a<?, Float> aVar4 = this.f5776m;
        if (aVar4 != null) {
            aVar4.mo7151a(this);
        }
        if (aVar.mo7368v() != null) {
            C1529a<Float, Float> a = aVar.mo7368v().mo7261a().mo7245a();
            this.f5778o = a;
            a.mo7151a(this);
            aVar.mo7366i(this.f5778o);
        }
        if (aVar.mo7370x() != null) {
            this.f5780q = new C1537c(this, aVar, aVar.mo7370x());
        }
    }

    /* renamed from: e */
    private void m7772e(Matrix matrix) {
        C1462c.m7603a("StrokeContent#applyDashPattern");
        if (this.f5775l.isEmpty()) {
            C1462c.m7604b("StrokeContent#applyDashPattern");
            return;
        }
        float g = C1683h.m8461g(matrix);
        for (int i = 0; i < this.f5775l.size(); i++) {
            this.f5771h[i] = ((Float) this.f5775l.get(i).mo7157h()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f5771h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f5771h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f5771h;
            fArr3[i] = fArr3[i] * g;
        }
        C1529a<?, Float> aVar = this.f5776m;
        this.f5772i.setPathEffect(new DashPathEffect(this.f5771h, aVar == null ? 0.0f : g * aVar.mo7157h().floatValue()));
        C1462c.m7604b("StrokeContent#applyDashPattern");
    }

    /* renamed from: h */
    private void m7773h(Canvas canvas, C1508b bVar, Matrix matrix) {
        C1462c.m7603a("StrokeContent#applyTrimPath");
        if (bVar.f5782b == null) {
            C1462c.m7604b("StrokeContent#applyTrimPath");
            return;
        }
        this.f5765b.reset();
        for (int size = bVar.f5781a.size() - 1; size >= 0; size--) {
            this.f5765b.addPath(((C1521m) bVar.f5781a.get(size)).getPath(), matrix);
        }
        this.f5764a.setPath(this.f5765b, false);
        float length = this.f5764a.getLength();
        while (this.f5764a.nextContour()) {
            length += this.f5764a.getLength();
        }
        float floatValue = (bVar.f5782b.mo7147g().mo7157h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f5782b.mo7148h().mo7157h().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f5782b.mo7146e().mo7157h().floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = bVar.f5781a.size() - 1; size2 >= 0; size2--) {
            this.f5766c.set(((C1521m) bVar.f5781a.get(size2)).getPath());
            this.f5766c.transform(matrix);
            this.f5764a.setPath(this.f5766c, false);
            float length2 = this.f5764a.getLength();
            float f2 = 1.0f;
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f + length2 && f < f3) {
                    C1683h.m8455a(this.f5766c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f5766c, this.f5772i);
                    f += length2;
                }
            }
            float f4 = f + length2;
            if (f4 >= floatValue2 && f <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f) {
                    float f5 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f4) {
                        f2 = (floatValue3 - f) / length2;
                    }
                    C1683h.m8455a(this.f5766c, f5, f2, 0.0f);
                    canvas.drawPath(this.f5766c, this.f5772i);
                } else {
                    canvas.drawPath(this.f5766c, this.f5772i);
                }
            }
            f += length2;
        }
        C1462c.m7604b("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5768e.invalidateSelf();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        C1528s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C1510c cVar = list.get(size);
            if (cVar instanceof C1528s) {
                C1528s sVar2 = (C1528s) cVar;
                if (sVar2.mo7149i() == C1602r.C1603a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.mo7145c(this);
        }
        C1508b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C1510c cVar2 = list2.get(size2);
            if (cVar2 instanceof C1528s) {
                C1528s sVar3 = (C1528s) cVar2;
                if (sVar3.mo7149i() == C1602r.C1603a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f5770g.add(bVar);
                    }
                    bVar = new C1508b(sVar3);
                    sVar3.mo7145c(this);
                }
            }
            if (cVar2 instanceof C1521m) {
                if (bVar == null) {
                    bVar = new C1508b(sVar);
                }
                bVar.f5781a.add((C1521m) cVar2);
            }
        }
        if (bVar != null) {
            this.f5770g.add(bVar);
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        C1462c.m7603a("StrokeContent#getBounds");
        this.f5765b.reset();
        for (int i = 0; i < this.f5770g.size(); i++) {
            C1508b bVar = this.f5770g.get(i);
            for (int i2 = 0; i2 < bVar.f5781a.size(); i2++) {
                this.f5765b.addPath(((C1521m) bVar.f5781a.get(i2)).getPath(), matrix);
            }
        }
        this.f5765b.computeBounds(this.f5767d, false);
        float p = ((C1539d) this.f5773j).mo7180p();
        RectF rectF2 = this.f5767d;
        float f = p / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f5767d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C1462c.m7604b("StrokeContent#getBounds");
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        C1462c.m7603a("StrokeContent#draw");
        if (C1683h.m8462h(matrix)) {
            C1462c.m7604b("StrokeContent#draw");
            return;
        }
        this.f5772i.setAlpha(C1682g.m8445d((int) ((((((float) i) / 255.0f) * ((float) ((C1541f) this.f5774k).mo7184p())) / 100.0f) * 255.0f), 0, 255));
        this.f5772i.setStrokeWidth(((C1539d) this.f5773j).mo7180p() * C1683h.m8461g(matrix));
        if (this.f5772i.getStrokeWidth() <= 0.0f) {
            C1462c.m7604b("StrokeContent#draw");
            return;
        }
        m7772e(matrix);
        C1529a<ColorFilter, ColorFilter> aVar = this.f5777n;
        if (aVar != null) {
            this.f5772i.setColorFilter(aVar.mo7157h());
        }
        C1529a<Float, Float> aVar2 = this.f5778o;
        if (aVar2 != null) {
            float floatValue = aVar2.mo7157h().floatValue();
            if (floatValue == 0.0f) {
                this.f5772i.setMaskFilter((MaskFilter) null);
            } else if (floatValue != this.f5779p) {
                this.f5772i.setMaskFilter(this.f5769f.mo7369w(floatValue));
            }
            this.f5779p = floatValue;
        }
        C1537c cVar = this.f5780q;
        if (cVar != null) {
            cVar.mo7173b(this.f5772i);
        }
        for (int i2 = 0; i2 < this.f5770g.size(); i2++) {
            C1508b bVar = this.f5770g.get(i2);
            if (bVar.f5782b != null) {
                m7773h(canvas, bVar, matrix);
            } else {
                C1462c.m7603a("StrokeContent#buildPath");
                this.f5765b.reset();
                for (int size = bVar.f5781a.size() - 1; size >= 0; size--) {
                    this.f5765b.addPath(((C1521m) bVar.f5781a.get(size)).getPath(), matrix);
                }
                C1462c.m7604b("StrokeContent#buildPath");
                C1462c.m7603a("StrokeContent#drawPath");
                canvas.drawPath(this.f5765b, this.f5772i);
                C1462c.m7604b("StrokeContent#drawPath");
            }
        }
        C1462c.m7604b("StrokeContent#draw");
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        C1537c cVar2;
        C1537c cVar3;
        C1537c cVar4;
        C1537c cVar5;
        C1537c cVar6;
        if (t == C1493k.f5728d) {
            this.f5774k.mo7163n(cVar);
        } else if (t == C1493k.f5743s) {
            this.f5773j.mo7163n(cVar);
        } else if (t == C1493k.f5721K) {
            C1529a<ColorFilter, ColorFilter> aVar = this.f5777n;
            if (aVar != null) {
                this.f5769f.mo7360F(aVar);
            }
            if (cVar == null) {
                this.f5777n = null;
                return;
            }
            C1552q qVar = new C1552q(cVar);
            this.f5777n = qVar;
            qVar.mo7151a(this);
            this.f5769f.mo7366i(this.f5777n);
        } else if (t == C1493k.f5734j) {
            C1529a<Float, Float> aVar2 = this.f5778o;
            if (aVar2 != null) {
                aVar2.mo7163n(cVar);
                return;
            }
            C1552q qVar2 = new C1552q(cVar);
            this.f5778o = qVar2;
            qVar2.mo7151a(this);
            this.f5769f.mo7366i(this.f5778o);
        } else if (t == C1493k.f5729e && (cVar6 = this.f5780q) != null) {
            cVar6.mo7174c(cVar);
        } else if (t == C1493k.f5717G && (cVar5 = this.f5780q) != null) {
            cVar5.mo7177f(cVar);
        } else if (t == C1493k.f5718H && (cVar4 = this.f5780q) != null) {
            cVar4.mo7175d(cVar);
        } else if (t == C1493k.f5719I && (cVar3 = this.f5780q) != null) {
            cVar3.mo7176e(cVar);
        } else if (t == C1493k.f5720J && (cVar2 = this.f5780q) != null) {
            cVar2.mo7178g(cVar);
        }
    }
}
