package com.airbnb.lottie.p015t.p016b;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C1462c;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1537c;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1582d;
import com.airbnb.lottie.p019v.p021k.C1583e;
import com.airbnb.lottie.p019v.p021k.C1585g;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.ArrayList;
import java.util.List;
import p082e.p098e.C3470d;

/* renamed from: com.airbnb.lottie.t.b.h */
/* compiled from: GradientFillContent */
public class C1515h implements C1512e, C1529a.C1531b, C1518k {

    /* renamed from: a */
    private final String f5816a;

    /* renamed from: b */
    private final boolean f5817b;

    /* renamed from: c */
    private final C1604a f5818c;

    /* renamed from: d */
    private final C3470d<LinearGradient> f5819d = new C3470d<>();

    /* renamed from: e */
    private final C3470d<RadialGradient> f5820e = new C3470d<>();

    /* renamed from: f */
    private final Path f5821f;

    /* renamed from: g */
    private final Paint f5822g;

    /* renamed from: h */
    private final RectF f5823h;

    /* renamed from: i */
    private final List<C1521m> f5824i;

    /* renamed from: j */
    private final C1585g f5825j;

    /* renamed from: k */
    private final C1529a<C1582d, C1582d> f5826k;

    /* renamed from: l */
    private final C1529a<Integer, Integer> f5827l;

    /* renamed from: m */
    private final C1529a<PointF, PointF> f5828m;

    /* renamed from: n */
    private final C1529a<PointF, PointF> f5829n;

    /* renamed from: o */
    private C1529a<ColorFilter, ColorFilter> f5830o;

    /* renamed from: p */
    private C1552q f5831p;

    /* renamed from: q */
    private final C1473f f5832q;

    /* renamed from: r */
    private final int f5833r;

    /* renamed from: s */
    private C1529a<Float, Float> f5834s;

    /* renamed from: t */
    float f5835t;

    /* renamed from: u */
    private C1537c f5836u;

    public C1515h(C1473f fVar, C1604a aVar, C1583e eVar) {
        Path path = new Path();
        this.f5821f = path;
        this.f5822g = new C1505a(1);
        this.f5823h = new RectF();
        this.f5824i = new ArrayList();
        this.f5835t = 0.0f;
        this.f5818c = aVar;
        this.f5816a = eVar.mo7275f();
        this.f5817b = eVar.mo7278i();
        this.f5832q = fVar;
        this.f5825j = eVar.mo7274e();
        path.setFillType(eVar.mo7272c());
        this.f5833r = (int) (fVar.mo7092q().mo7005d() / 32.0f);
        C1529a<C1582d, C1582d> a = eVar.mo7273d().mo7245a();
        this.f5826k = a;
        a.mo7151a(this);
        aVar.mo7366i(a);
        C1529a<Integer, Integer> a2 = eVar.mo7276g().mo7245a();
        this.f5827l = a2;
        a2.mo7151a(this);
        aVar.mo7366i(a2);
        C1529a<PointF, PointF> a3 = eVar.mo7277h().mo7245a();
        this.f5828m = a3;
        a3.mo7151a(this);
        aVar.mo7366i(a3);
        C1529a<PointF, PointF> a4 = eVar.mo7271b().mo7245a();
        this.f5829n = a4;
        a4.mo7151a(this);
        aVar.mo7366i(a4);
        if (aVar.mo7368v() != null) {
            C1529a<Float, Float> a5 = aVar.mo7368v().mo7261a().mo7245a();
            this.f5834s = a5;
            a5.mo7151a(this);
            aVar.mo7366i(this.f5834s);
        }
        if (aVar.mo7370x() != null) {
            this.f5836u = new C1537c(this, aVar, aVar.mo7370x());
        }
    }

    /* renamed from: e */
    private int[] m7809e(int[] iArr) {
        C1552q qVar = this.f5831p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.mo7157h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private int m7810h() {
        int round = Math.round(this.f5828m.mo7156f() * ((float) this.f5833r));
        int round2 = Math.round(this.f5829n.mo7156f() * ((float) this.f5833r));
        int round3 = Math.round(this.f5826k.mo7156f() * ((float) this.f5833r));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: i */
    private LinearGradient m7811i() {
        long h = (long) m7810h();
        LinearGradient h2 = this.f5819d.mo12304h(h);
        if (h2 != null) {
            return h2;
        }
        PointF h3 = this.f5828m.mo7157h();
        PointF h4 = this.f5829n.mo7157h();
        C1582d h5 = this.f5826k.mo7157h();
        LinearGradient linearGradient = new LinearGradient(h3.x, h3.y, h4.x, h4.y, m7809e(h5.mo7267a()), h5.mo7268b(), Shader.TileMode.CLAMP);
        this.f5819d.mo12309m(h, linearGradient);
        return linearGradient;
    }

    /* renamed from: j */
    private RadialGradient m7812j() {
        long h = (long) m7810h();
        RadialGradient h2 = this.f5820e.mo12304h(h);
        if (h2 != null) {
            return h2;
        }
        PointF h3 = this.f5828m.mo7157h();
        PointF h4 = this.f5829n.mo7157h();
        C1582d h5 = this.f5826k.mo7157h();
        int[] e = m7809e(h5.mo7267a());
        float[] b = h5.mo7268b();
        float f = h3.x;
        float f2 = h3.y;
        float hypot = (float) Math.hypot((double) (h4.x - f), (double) (h4.y - f2));
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, e, b, Shader.TileMode.CLAMP);
        this.f5820e.mo12309m(h, radialGradient);
        return radialGradient;
    }

    /* renamed from: a */
    public void mo7132a() {
        this.f5832q.invalidateSelf();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C1510c cVar = list2.get(i);
            if (cVar instanceof C1521m) {
                this.f5824i.add((C1521m) cVar);
            }
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        this.f5821f.reset();
        for (int i = 0; i < this.f5824i.size(); i++) {
            this.f5821f.addPath(this.f5824i.get(i).getPath(), matrix);
        }
        this.f5821f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f5817b) {
            C1462c.m7603a("GradientFillContent#draw");
            this.f5821f.reset();
            for (int i2 = 0; i2 < this.f5824i.size(); i2++) {
                this.f5821f.addPath(this.f5824i.get(i2).getPath(), matrix);
            }
            this.f5821f.computeBounds(this.f5823h, false);
            if (this.f5825j == C1585g.LINEAR) {
                shader = m7811i();
            } else {
                shader = m7812j();
            }
            shader.setLocalMatrix(matrix);
            this.f5822g.setShader(shader);
            C1529a<ColorFilter, ColorFilter> aVar = this.f5830o;
            if (aVar != null) {
                this.f5822g.setColorFilter(aVar.mo7157h());
            }
            C1529a<Float, Float> aVar2 = this.f5834s;
            if (aVar2 != null) {
                float floatValue = aVar2.mo7157h().floatValue();
                if (floatValue == 0.0f) {
                    this.f5822g.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f5835t) {
                    this.f5822g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f5835t = floatValue;
            }
            C1537c cVar = this.f5836u;
            if (cVar != null) {
                cVar.mo7173b(this.f5822g);
            }
            this.f5822g.setAlpha(C1682g.m8445d((int) ((((((float) i) / 255.0f) * ((float) this.f5827l.mo7157h().intValue())) / 100.0f) * 255.0f), 0, 255));
            canvas.drawPath(this.f5821f, this.f5822g);
            C1462c.m7604b("GradientFillContent#draw");
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        C1537c cVar2;
        C1537c cVar3;
        C1537c cVar4;
        C1537c cVar5;
        C1537c cVar6;
        if (t == C1493k.f5728d) {
            this.f5827l.mo7163n(cVar);
        } else if (t == C1493k.f5721K) {
            C1529a<ColorFilter, ColorFilter> aVar = this.f5830o;
            if (aVar != null) {
                this.f5818c.mo7360F(aVar);
            }
            if (cVar == null) {
                this.f5830o = null;
                return;
            }
            C1552q qVar = new C1552q(cVar);
            this.f5830o = qVar;
            qVar.mo7151a(this);
            this.f5818c.mo7366i(this.f5830o);
        } else if (t == C1493k.f5722L) {
            C1552q qVar2 = this.f5831p;
            if (qVar2 != null) {
                this.f5818c.mo7360F(qVar2);
            }
            if (cVar == null) {
                this.f5831p = null;
                return;
            }
            this.f5819d.mo12299b();
            this.f5820e.mo12299b();
            C1552q qVar3 = new C1552q(cVar);
            this.f5831p = qVar3;
            qVar3.mo7151a(this);
            this.f5818c.mo7366i(this.f5831p);
        } else if (t == C1493k.f5734j) {
            C1529a<Float, Float> aVar2 = this.f5834s;
            if (aVar2 != null) {
                aVar2.mo7163n(cVar);
                return;
            }
            C1552q qVar4 = new C1552q(cVar);
            this.f5834s = qVar4;
            qVar4.mo7151a(this);
            this.f5818c.mo7366i(this.f5834s);
        } else if (t == C1493k.f5729e && (cVar6 = this.f5836u) != null) {
            cVar6.mo7174c(cVar);
        } else if (t == C1493k.f5717G && (cVar5 = this.f5836u) != null) {
            cVar5.mo7177f(cVar);
        } else if (t == C1493k.f5718H && (cVar4 = this.f5836u) != null) {
            cVar4.mo7175d(cVar);
        } else if (t == C1493k.f5719I && (cVar3 = this.f5836u) != null) {
            cVar3.mo7176e(cVar);
        } else if (t == C1493k.f5720J && (cVar2 = this.f5836u) != null) {
            cVar2.mo7178g(cVar);
        }
    }

    public String getName() {
        return this.f5816a;
    }
}
