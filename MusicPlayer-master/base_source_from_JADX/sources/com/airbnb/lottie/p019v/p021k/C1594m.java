package com.airbnb.lottie.p019v.p021k;

import android.graphics.PointF;
import com.airbnb.lottie.p019v.C1555a;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1682g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.k.m */
/* compiled from: ShapeData */
public class C1594m {

    /* renamed from: a */
    private final List<C1555a> f6086a;

    /* renamed from: b */
    private PointF f6087b;

    /* renamed from: c */
    private boolean f6088c;

    public C1594m(PointF pointF, boolean z, List<C1555a> list) {
        this.f6087b = pointF;
        this.f6088c = z;
        this.f6086a = new ArrayList(list);
    }

    /* renamed from: e */
    private void m8096e(float f, float f2) {
        if (this.f6087b == null) {
            this.f6087b = new PointF();
        }
        this.f6087b.set(f, f2);
    }

    /* renamed from: a */
    public List<C1555a> mo7321a() {
        return this.f6086a;
    }

    /* renamed from: b */
    public PointF mo7322b() {
        return this.f6087b;
    }

    /* renamed from: c */
    public void mo7323c(C1594m mVar, C1594m mVar2, float f) {
        if (this.f6087b == null) {
            this.f6087b = new PointF();
        }
        this.f6088c = mVar.mo7324d() || mVar2.mo7324d();
        if (mVar.mo7321a().size() != mVar2.mo7321a().size()) {
            C1679d.m8416c("Curves must have the same number of control points. Shape 1: " + mVar.mo7321a().size() + "\tShape 2: " + mVar2.mo7321a().size());
        }
        int min = Math.min(mVar.mo7321a().size(), mVar2.mo7321a().size());
        if (this.f6086a.size() < min) {
            for (int size = this.f6086a.size(); size < min; size++) {
                this.f6086a.add(new C1555a());
            }
        } else if (this.f6086a.size() > min) {
            for (int size2 = this.f6086a.size() - 1; size2 >= min; size2--) {
                List<C1555a> list = this.f6086a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = mVar.mo7322b();
        PointF b2 = mVar2.mo7322b();
        m8096e(C1682g.m8452k(b.x, b2.x, f), C1682g.m8452k(b.y, b2.y, f));
        for (int size3 = this.f6086a.size() - 1; size3 >= 0; size3--) {
            C1555a aVar = mVar.mo7321a().get(size3);
            C1555a aVar2 = mVar2.mo7321a().get(size3);
            PointF a = aVar.mo7216a();
            PointF b3 = aVar.mo7217b();
            PointF c = aVar.mo7218c();
            PointF a2 = aVar2.mo7216a();
            PointF b4 = aVar2.mo7217b();
            PointF c2 = aVar2.mo7218c();
            this.f6086a.get(size3).mo7219d(C1682g.m8452k(a.x, a2.x, f), C1682g.m8452k(a.y, a2.y, f));
            this.f6086a.get(size3).mo7220e(C1682g.m8452k(b3.x, b4.x, f), C1682g.m8452k(b3.y, b4.y, f));
            this.f6086a.get(size3).mo7221f(C1682g.m8452k(c.x, c2.x, f), C1682g.m8452k(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo7324d() {
        return this.f6088c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f6086a.size() + "closed=" + this.f6088c + '}';
    }

    public C1594m() {
        this.f6086a = new ArrayList();
    }
}
