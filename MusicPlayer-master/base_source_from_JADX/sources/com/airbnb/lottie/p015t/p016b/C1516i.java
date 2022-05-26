package com.airbnb.lottie.p015t.p016b;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p019v.p021k.C1582d;
import com.airbnb.lottie.p019v.p021k.C1584f;
import com.airbnb.lottie.p019v.p021k.C1585g;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p027z.C1690c;
import p082e.p098e.C3470d;

/* renamed from: com.airbnb.lottie.t.b.i */
/* compiled from: GradientStrokeContent */
public class C1516i extends C1506a {

    /* renamed from: A */
    private final C1529a<PointF, PointF> f5837A;

    /* renamed from: B */
    private C1552q f5838B;

    /* renamed from: r */
    private final String f5839r;

    /* renamed from: s */
    private final boolean f5840s;

    /* renamed from: t */
    private final C3470d<LinearGradient> f5841t = new C3470d<>();

    /* renamed from: u */
    private final C3470d<RadialGradient> f5842u = new C3470d<>();

    /* renamed from: v */
    private final RectF f5843v = new RectF();

    /* renamed from: w */
    private final C1585g f5844w;

    /* renamed from: x */
    private final int f5845x;

    /* renamed from: y */
    private final C1529a<C1582d, C1582d> f5846y;

    /* renamed from: z */
    private final C1529a<PointF, PointF> f5847z;

    public C1516i(C1473f fVar, C1604a aVar, C1584f fVar2) {
        super(fVar, aVar, fVar2.mo7279b().toPaintCap(), fVar2.mo7284g().toPaintJoin(), fVar2.mo7286i(), fVar2.mo7288k(), fVar2.mo7290m(), fVar2.mo7285h(), fVar2.mo7280c());
        this.f5839r = fVar2.mo7287j();
        this.f5844w = fVar2.mo7283f();
        this.f5840s = fVar2.mo7291n();
        this.f5845x = (int) (fVar.mo7092q().mo7005d() / 32.0f);
        C1529a<C1582d, C1582d> a = fVar2.mo7282e().mo7245a();
        this.f5846y = a;
        a.mo7151a(this);
        aVar.mo7366i(a);
        C1529a<PointF, PointF> a2 = fVar2.mo7289l().mo7245a();
        this.f5847z = a2;
        a2.mo7151a(this);
        aVar.mo7366i(a2);
        C1529a<PointF, PointF> a3 = fVar2.mo7281d().mo7245a();
        this.f5837A = a3;
        a3.mo7151a(this);
        aVar.mo7366i(a3);
    }

    /* renamed from: i */
    private int[] m7819i(int[] iArr) {
        C1552q qVar = this.f5838B;
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

    /* renamed from: j */
    private int m7820j() {
        int round = Math.round(this.f5847z.mo7156f() * ((float) this.f5845x));
        int round2 = Math.round(this.f5837A.mo7156f() * ((float) this.f5845x));
        int round3 = Math.round(this.f5846y.mo7156f() * ((float) this.f5845x));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: k */
    private LinearGradient m7821k() {
        long j = (long) m7820j();
        LinearGradient h = this.f5841t.mo12304h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f5847z.mo7157h();
        PointF h3 = this.f5837A.mo7157h();
        C1582d h4 = this.f5846y.mo7157h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, m7819i(h4.mo7267a()), h4.mo7268b(), Shader.TileMode.CLAMP);
        this.f5841t.mo12309m(j, linearGradient);
        return linearGradient;
    }

    /* renamed from: l */
    private RadialGradient m7822l() {
        long j = (long) m7820j();
        RadialGradient h = this.f5842u.mo12304h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.f5847z.mo7157h();
        PointF h3 = this.f5837A.mo7157h();
        C1582d h4 = this.f5846y.mo7157h();
        int[] i = m7819i(h4.mo7267a());
        float[] b = h4.mo7268b();
        float f = h2.x;
        float f2 = h2.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (h3.x - f), (double) (h3.y - f2)), i, b, Shader.TileMode.CLAMP);
        this.f5842u.mo12309m(j, radialGradient);
        return radialGradient;
    }

    /* renamed from: f */
    public void mo7136f(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.f5840s) {
            mo7135d(this.f5843v, matrix, false);
            if (this.f5844w == C1585g.LINEAR) {
                shader = m7821k();
            } else {
                shader = m7822l();
            }
            shader.setLocalMatrix(matrix);
            this.f5772i.setShader(shader);
            super.mo7136f(canvas, matrix, i);
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t == C1493k.f5722L) {
            C1552q qVar = this.f5838B;
            if (qVar != null) {
                this.f5769f.mo7360F(qVar);
            }
            if (cVar == null) {
                this.f5838B = null;
                return;
            }
            C1552q qVar2 = new C1552q(cVar);
            this.f5838B = qVar2;
            qVar2.mo7151a(this);
            this.f5769f.mo7366i(this.f5838B);
        }
    }

    public String getName() {
        return this.f5839r;
    }
}
