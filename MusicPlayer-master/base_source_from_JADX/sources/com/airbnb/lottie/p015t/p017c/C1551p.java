package com.airbnb.lottie.p015t.p017c;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.p020j.C1576l;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p027z.C1688a;
import com.airbnb.lottie.p027z.C1690c;
import com.airbnb.lottie.p027z.C1691d;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.t.c.p */
/* compiled from: TransformKeyframeAnimation */
public class C1551p {

    /* renamed from: a */
    private final Matrix f5948a = new Matrix();

    /* renamed from: b */
    private final Matrix f5949b;

    /* renamed from: c */
    private final Matrix f5950c;

    /* renamed from: d */
    private final Matrix f5951d;

    /* renamed from: e */
    private final float[] f5952e;

    /* renamed from: f */
    private C1529a<PointF, PointF> f5953f;

    /* renamed from: g */
    private C1529a<?, PointF> f5954g;

    /* renamed from: h */
    private C1529a<C1691d, C1691d> f5955h;

    /* renamed from: i */
    private C1529a<Float, Float> f5956i;

    /* renamed from: j */
    private C1529a<Integer, Integer> f5957j;

    /* renamed from: k */
    private C1539d f5958k;

    /* renamed from: l */
    private C1539d f5959l;

    /* renamed from: m */
    private C1529a<?, Float> f5960m;

    /* renamed from: n */
    private C1529a<?, Float> f5961n;

    public C1551p(C1576l lVar) {
        this.f5953f = lVar.mo7251c() == null ? null : lVar.mo7251c().mo7245a();
        this.f5954g = lVar.mo7254f() == null ? null : lVar.mo7254f().mo7245a();
        this.f5955h = lVar.mo7256h() == null ? null : lVar.mo7256h().mo7245a();
        this.f5956i = lVar.mo7255g() == null ? null : lVar.mo7255g().mo7245a();
        C1539d dVar = lVar.mo7257i() == null ? null : (C1539d) lVar.mo7257i().mo7245a();
        this.f5958k = dVar;
        if (dVar != null) {
            this.f5949b = new Matrix();
            this.f5950c = new Matrix();
            this.f5951d = new Matrix();
            this.f5952e = new float[9];
        } else {
            this.f5949b = null;
            this.f5950c = null;
            this.f5951d = null;
            this.f5952e = null;
        }
        this.f5959l = lVar.mo7258j() == null ? null : (C1539d) lVar.mo7258j().mo7245a();
        if (lVar.mo7253e() != null) {
            this.f5957j = lVar.mo7253e().mo7245a();
        }
        if (lVar.mo7259k() != null) {
            this.f5960m = lVar.mo7259k().mo7245a();
        } else {
            this.f5960m = null;
        }
        if (lVar.mo7252d() != null) {
            this.f5961n = lVar.mo7252d().mo7245a();
        } else {
            this.f5961n = null;
        }
    }

    /* renamed from: d */
    private void m7946d() {
        for (int i = 0; i < 9; i++) {
            this.f5952e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo7202a(C1604a aVar) {
        aVar.mo7366i(this.f5957j);
        aVar.mo7366i(this.f5960m);
        aVar.mo7366i(this.f5961n);
        aVar.mo7366i(this.f5953f);
        aVar.mo7366i(this.f5954g);
        aVar.mo7366i(this.f5955h);
        aVar.mo7366i(this.f5956i);
        aVar.mo7366i(this.f5958k);
        aVar.mo7366i(this.f5959l);
    }

    /* renamed from: b */
    public void mo7203b(C1529a.C1531b bVar) {
        C1529a<Integer, Integer> aVar = this.f5957j;
        if (aVar != null) {
            aVar.mo7151a(bVar);
        }
        C1529a<?, Float> aVar2 = this.f5960m;
        if (aVar2 != null) {
            aVar2.mo7151a(bVar);
        }
        C1529a<?, Float> aVar3 = this.f5961n;
        if (aVar3 != null) {
            aVar3.mo7151a(bVar);
        }
        C1529a<PointF, PointF> aVar4 = this.f5953f;
        if (aVar4 != null) {
            aVar4.mo7151a(bVar);
        }
        C1529a<?, PointF> aVar5 = this.f5954g;
        if (aVar5 != null) {
            aVar5.mo7151a(bVar);
        }
        C1529a<C1691d, C1691d> aVar6 = this.f5955h;
        if (aVar6 != null) {
            aVar6.mo7151a(bVar);
        }
        C1529a<Float, Float> aVar7 = this.f5956i;
        if (aVar7 != null) {
            aVar7.mo7151a(bVar);
        }
        C1539d dVar = this.f5958k;
        if (dVar != null) {
            dVar.mo7151a(bVar);
        }
        C1539d dVar2 = this.f5959l;
        if (dVar2 != null) {
            dVar2.mo7151a(bVar);
        }
    }

    /* renamed from: c */
    public <T> boolean mo7204c(T t, C1690c<T> cVar) {
        C1539d dVar;
        C1539d dVar2;
        C1529a<?, Float> aVar;
        C1529a<?, Float> aVar2;
        if (t == C1493k.f5730f) {
            C1529a<PointF, PointF> aVar3 = this.f5953f;
            if (aVar3 == null) {
                this.f5953f = new C1552q(cVar, new PointF());
                return true;
            }
            aVar3.mo7163n(cVar);
            return true;
        } else if (t == C1493k.f5731g) {
            C1529a<?, PointF> aVar4 = this.f5954g;
            if (aVar4 == null) {
                this.f5954g = new C1552q(cVar, new PointF());
                return true;
            }
            aVar4.mo7163n(cVar);
            return true;
        } else {
            if (t == C1493k.f5732h) {
                C1529a<?, PointF> aVar5 = this.f5954g;
                if (aVar5 instanceof C1549n) {
                    ((C1549n) aVar5).mo7199r(cVar);
                    return true;
                }
            }
            if (t == C1493k.f5733i) {
                C1529a<?, PointF> aVar6 = this.f5954g;
                if (aVar6 instanceof C1549n) {
                    ((C1549n) aVar6).mo7200s(cVar);
                    return true;
                }
            }
            if (t == C1493k.f5739o) {
                C1529a<C1691d, C1691d> aVar7 = this.f5955h;
                if (aVar7 == null) {
                    this.f5955h = new C1552q(cVar, new C1691d());
                    return true;
                }
                aVar7.mo7163n(cVar);
                return true;
            } else if (t == C1493k.f5740p) {
                C1529a<Float, Float> aVar8 = this.f5956i;
                if (aVar8 == null) {
                    this.f5956i = new C1552q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar8.mo7163n(cVar);
                return true;
            } else if (t == C1493k.f5727c) {
                C1529a<Integer, Integer> aVar9 = this.f5957j;
                if (aVar9 == null) {
                    this.f5957j = new C1552q(cVar, 100);
                    return true;
                }
                aVar9.mo7163n(cVar);
                return true;
            } else if (t != C1493k.f5713C || (aVar2 = this.f5960m) == null) {
                if (t != C1493k.f5714D || (aVar = this.f5961n) == null) {
                    if (t == C1493k.f5741q && (dVar2 = this.f5958k) != null) {
                        if (dVar2 == null) {
                            this.f5958k = new C1539d(Collections.singletonList(new C1688a(Float.valueOf(0.0f))));
                        }
                        this.f5958k.mo7163n(cVar);
                        return true;
                    } else if (t != C1493k.f5742r || (dVar = this.f5959l) == null) {
                        return false;
                    } else {
                        if (dVar == null) {
                            this.f5959l = new C1539d(Collections.singletonList(new C1688a(Float.valueOf(0.0f))));
                        }
                        this.f5959l.mo7163n(cVar);
                        return true;
                    }
                } else if (aVar == null) {
                    this.f5961n = new C1552q(cVar, 100);
                    return true;
                } else {
                    aVar.mo7163n(cVar);
                    return true;
                }
            } else if (aVar2 == null) {
                this.f5960m = new C1552q(cVar, 100);
                return true;
            } else {
                aVar2.mo7163n(cVar);
                return true;
            }
        }
    }

    /* renamed from: e */
    public C1529a<?, Float> mo7205e() {
        return this.f5961n;
    }

    /* renamed from: f */
    public Matrix mo7206f() {
        float f;
        this.f5948a.reset();
        C1529a<?, PointF> aVar = this.f5954g;
        if (aVar != null) {
            PointF h = aVar.mo7157h();
            float f2 = h.x;
            if (!(f2 == 0.0f && h.y == 0.0f)) {
                this.f5948a.preTranslate(f2, h.y);
            }
        }
        C1529a<Float, Float> aVar2 = this.f5956i;
        if (aVar2 != null) {
            if (aVar2 instanceof C1552q) {
                f = aVar2.mo7157h().floatValue();
            } else {
                f = ((C1539d) aVar2).mo7180p();
            }
            if (f != 0.0f) {
                this.f5948a.preRotate(f);
            }
        }
        if (this.f5958k != null) {
            C1539d dVar = this.f5959l;
            float cos = dVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-dVar.mo7180p()) + 90.0f)));
            C1539d dVar2 = this.f5959l;
            float sin = dVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-dVar2.mo7180p()) + 90.0f)));
            m7946d();
            float[] fArr = this.f5952e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f3 = -sin;
            fArr[3] = f3;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f5949b.setValues(fArr);
            m7946d();
            float[] fArr2 = this.f5952e;
            fArr2[0] = 1.0f;
            fArr2[3] = (float) Math.tan(Math.toRadians((double) this.f5958k.mo7180p()));
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f5950c.setValues(fArr2);
            m7946d();
            float[] fArr3 = this.f5952e;
            fArr3[0] = cos;
            fArr3[1] = f3;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f5951d.setValues(fArr3);
            this.f5950c.preConcat(this.f5949b);
            this.f5951d.preConcat(this.f5950c);
            this.f5948a.preConcat(this.f5951d);
        }
        C1529a<C1691d, C1691d> aVar3 = this.f5955h;
        if (aVar3 != null) {
            C1691d h2 = aVar3.mo7157h();
            if (!(h2.mo7511b() == 1.0f && h2.mo7512c() == 1.0f)) {
                this.f5948a.preScale(h2.mo7511b(), h2.mo7512c());
            }
        }
        C1529a<PointF, PointF> aVar4 = this.f5953f;
        if (aVar4 != null) {
            PointF h3 = aVar4.mo7157h();
            float f4 = h3.x;
            if (!(f4 == 0.0f && h3.y == 0.0f)) {
                this.f5948a.preTranslate(-f4, -h3.y);
            }
        }
        return this.f5948a;
    }

    /* renamed from: g */
    public Matrix mo7207g(float f) {
        C1529a<?, PointF> aVar = this.f5954g;
        PointF pointF = null;
        PointF h = aVar == null ? null : aVar.mo7157h();
        C1529a<C1691d, C1691d> aVar2 = this.f5955h;
        C1691d h2 = aVar2 == null ? null : aVar2.mo7157h();
        this.f5948a.reset();
        if (h != null) {
            this.f5948a.preTranslate(h.x * f, h.y * f);
        }
        if (h2 != null) {
            double d = (double) f;
            this.f5948a.preScale((float) Math.pow((double) h2.mo7511b(), d), (float) Math.pow((double) h2.mo7512c(), d));
        }
        C1529a<Float, Float> aVar3 = this.f5956i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo7157h().floatValue();
            C1529a<PointF, PointF> aVar4 = this.f5953f;
            if (aVar4 != null) {
                pointF = aVar4.mo7157h();
            }
            Matrix matrix = this.f5948a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f5948a;
    }

    /* renamed from: h */
    public C1529a<?, Integer> mo7208h() {
        return this.f5957j;
    }

    /* renamed from: i */
    public C1529a<?, Float> mo7209i() {
        return this.f5960m;
    }

    /* renamed from: j */
    public void mo7210j(float f) {
        C1529a<Integer, Integer> aVar = this.f5957j;
        if (aVar != null) {
            aVar.mo7162m(f);
        }
        C1529a<?, Float> aVar2 = this.f5960m;
        if (aVar2 != null) {
            aVar2.mo7162m(f);
        }
        C1529a<?, Float> aVar3 = this.f5961n;
        if (aVar3 != null) {
            aVar3.mo7162m(f);
        }
        C1529a<PointF, PointF> aVar4 = this.f5953f;
        if (aVar4 != null) {
            aVar4.mo7162m(f);
        }
        C1529a<?, PointF> aVar5 = this.f5954g;
        if (aVar5 != null) {
            aVar5.mo7162m(f);
        }
        C1529a<C1691d, C1691d> aVar6 = this.f5955h;
        if (aVar6 != null) {
            aVar6.mo7162m(f);
        }
        C1529a<Float, Float> aVar7 = this.f5956i;
        if (aVar7 != null) {
            aVar7.mo7162m(f);
        }
        C1539d dVar = this.f5958k;
        if (dVar != null) {
            dVar.mo7162m(f);
        }
        C1539d dVar2 = this.f5959l;
        if (dVar2 != null) {
            dVar2.mo7162m(f);
        }
    }
}
