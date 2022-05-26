package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1536b;
import com.airbnb.lottie.p015t.p017c.C1537c;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1595n;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.g */
/* compiled from: FillContent */
public class C1514g implements C1512e, C1529a.C1531b, C1518k {

    /* renamed from: a */
    private final Path f5803a;

    /* renamed from: b */
    private final Paint f5804b = new C1505a(1);

    /* renamed from: c */
    private final C1604a f5805c;

    /* renamed from: d */
    private final String f5806d;

    /* renamed from: e */
    private final boolean f5807e;

    /* renamed from: f */
    private final List<C1521m> f5808f = new ArrayList();

    /* renamed from: g */
    private final C1529a<Integer, Integer> f5809g;

    /* renamed from: h */
    private final C1529a<Integer, Integer> f5810h;

    /* renamed from: i */
    private C1529a<ColorFilter, ColorFilter> f5811i;

    /* renamed from: j */
    private final C1473f f5812j;

    /* renamed from: k */
    private C1529a<Float, Float> f5813k;

    /* renamed from: l */
    float f5814l;

    /* renamed from: m */
    private C1537c f5815m;

    public C1514g(C1473f fVar, C1604a aVar, C1595n nVar) {
        Path path = new Path();
        this.f5803a = path;
        this.f5805c = aVar;
        this.f5806d = nVar.mo7328d();
        this.f5807e = nVar.mo7330f();
        this.f5812j = fVar;
        if (aVar.mo7368v() != null) {
            C1529a<Float, Float> a = aVar.mo7368v().mo7261a().mo7245a();
            this.f5813k = a;
            a.mo7151a(this);
            aVar.mo7366i(this.f5813k);
        }
        if (aVar.mo7370x() != null) {
            this.f5815m = new C1537c(this, aVar, aVar.mo7370x());
        }
        if (nVar.mo7326b() == null || nVar.mo7329e() == null) {
            this.f5809g = null;
            this.f5810h = null;
            return;
        }
        path.setFillType(nVar.mo7327c());
        C1529a<Integer, Integer> a2 = nVar.mo7326b().mo7245a();
        this.f5809g = a2;
        a2.mo7151a(this);
        aVar.mo7366i(a2);
        C1529a<Integer, Integer> a3 = nVar.mo7329e().mo7245a();
        this.f5810h = a3;
        a3.mo7151a(this);
        aVar.mo7366i(a3);
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5812j.invalidateSelf();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1510c cVar = list2.get(i);
            if (cVar instanceof C1521m) {
                this.f5808f.add((C1521m) cVar);
            }
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        this.f5803a.reset();
        for (int i = 0; i < this.f5808f.size(); i++) {
            this.f5803a.addPath(this.f5808f.get(i).getPath(), matrix);
        }
        this.f5803a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f5807e) {
            C1462c.m7603a("FillContent#draw");
            this.f5804b.setColor(((C1536b) this.f5809g).mo7170p());
            this.f5804b.setAlpha(C1682g.m8445d((int) ((((((float) i) / 255.0f) * ((float) this.f5810h.mo7157h().intValue())) / 100.0f) * 255.0f), 0, 255));
            C1529a<ColorFilter, ColorFilter> aVar = this.f5811i;
            if (aVar != null) {
                this.f5804b.setColorFilter(aVar.mo7157h());
            }
            C1529a<Float, Float> aVar2 = this.f5813k;
            if (aVar2 != null) {
                float floatValue = aVar2.mo7157h().floatValue();
                if (floatValue == 0.0f) {
                    this.f5804b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f5814l) {
                    this.f5804b.setMaskFilter(this.f5805c.mo7369w(floatValue));
                }
                this.f5814l = floatValue;
            }
            C1537c cVar = this.f5815m;
            if (cVar != null) {
                cVar.mo7173b(this.f5804b);
            }
            this.f5803a.reset();
            for (int i2 = 0; i2 < this.f5808f.size(); i2++) {
                this.f5803a.addPath(this.f5808f.get(i2).getPath(), matrix);
            }
            canvas.drawPath(this.f5803a, this.f5804b);
            C1462c.m7604b("FillContent#draw");
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        C1537c cVar2;
        C1537c cVar3;
        C1537c cVar4;
        C1537c cVar5;
        C1537c cVar6;
        if (t == C1493k.f5725a) {
            this.f5809g.mo7163n(cVar);
        } else if (t == C1493k.f5728d) {
            this.f5810h.mo7163n(cVar);
        } else if (t == C1493k.f5721K) {
            C1529a<ColorFilter, ColorFilter> aVar = this.f5811i;
            if (aVar != null) {
                this.f5805c.mo7360F(aVar);
            }
            if (cVar == null) {
                this.f5811i = null;
                return;
            }
            C1552q qVar = new C1552q(cVar);
            this.f5811i = qVar;
            qVar.mo7151a(this);
            this.f5805c.mo7366i(this.f5811i);
        } else if (t == C1493k.f5734j) {
            C1529a<Float, Float> aVar2 = this.f5813k;
            if (aVar2 != null) {
                aVar2.mo7163n(cVar);
                return;
            }
            C1552q qVar2 = new C1552q(cVar);
            this.f5813k = qVar2;
            qVar2.mo7151a(this);
            this.f5805c.mo7366i(this.f5813k);
        } else if (t == C1493k.f5729e && (cVar6 = this.f5815m) != null) {
            cVar6.mo7174c(cVar);
        } else if (t == C1493k.f5717G && (cVar5 = this.f5815m) != null) {
            cVar5.mo7177f(cVar);
        } else if (t == C1493k.f5718H && (cVar4 = this.f5815m) != null) {
            cVar4.mo7175d(cVar);
        } else if (t == C1493k.f5719I && (cVar3 = this.f5815m) != null) {
            cVar3.mo7176e(cVar);
        } else if (t == C1493k.f5720J && (cVar2 = this.f5815m) != null) {
            cVar2.mo7178g(cVar);
        }
    }

    public String getName() {
        return this.f5806d;
    }
}
