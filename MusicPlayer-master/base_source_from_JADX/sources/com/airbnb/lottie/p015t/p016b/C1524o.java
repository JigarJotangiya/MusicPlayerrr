package com.airbnb.lottie.p015t.p016b;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1539d;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1592k;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.o */
/* compiled from: RectangleContent */
public class C1524o implements C1529a.C1531b, C1518k, C1521m {

    /* renamed from: a */
    private final Path f5869a = new Path();

    /* renamed from: b */
    private final RectF f5870b = new RectF();

    /* renamed from: c */
    private final String f5871c;

    /* renamed from: d */
    private final boolean f5872d;

    /* renamed from: e */
    private final C1473f f5873e;

    /* renamed from: f */
    private final C1529a<?, PointF> f5874f;

    /* renamed from: g */
    private final C1529a<?, PointF> f5875g;

    /* renamed from: h */
    private final C1529a<?, Float> f5876h;

    /* renamed from: i */
    private C1509b f5877i = new C1509b();

    /* renamed from: j */
    private boolean f5878j;

    public C1524o(C1473f fVar, C1604a aVar, C1592k kVar) {
        this.f5871c = kVar.mo7311c();
        this.f5872d = kVar.mo7314f();
        this.f5873e = fVar;
        C1529a<PointF, PointF> a = kVar.mo7312d().mo7245a();
        this.f5874f = a;
        C1529a<PointF, PointF> a2 = kVar.mo7313e().mo7245a();
        this.f5875g = a2;
        C1529a<Float, Float> a3 = kVar.mo7310b().mo7245a();
        this.f5876h = a3;
        aVar.mo7366i(a);
        aVar.mo7366i(a2);
        aVar.mo7366i(a3);
        a.mo7151a(this);
        a2.mo7151a(this);
        a3.mo7151a(this);
    }

    /* renamed from: e */
    private void m7837e() {
        this.f5878j = false;
        this.f5873e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo7132a() {
        m7837e();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1510c cVar = list.get(i);
            if (cVar instanceof C1528s) {
                C1528s sVar = (C1528s) cVar;
                if (sVar.mo7149i() == C1602r.C1603a.SIMULTANEOUSLY) {
                    this.f5877i.mo7138a(sVar);
                    sVar.mo7145c(this);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo7134c(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        C1682g.m8454m(eVar, i, list, eVar2, this);
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        if (t == C1493k.f5736l) {
            this.f5875g.mo7163n(cVar);
        } else if (t == C1493k.f5738n) {
            this.f5874f.mo7163n(cVar);
        } else if (t == C1493k.f5737m) {
            this.f5876h.mo7163n(cVar);
        }
    }

    public String getName() {
        return this.f5871c;
    }

    public Path getPath() {
        float f;
        if (this.f5878j) {
            return this.f5869a;
        }
        this.f5869a.reset();
        if (this.f5872d) {
            this.f5878j = true;
            return this.f5869a;
        }
        PointF h = this.f5875g.mo7157h();
        float f2 = h.x / 2.0f;
        float f3 = h.y / 2.0f;
        C1529a<?, Float> aVar = this.f5876h;
        if (aVar == null) {
            f = 0.0f;
        } else {
            f = ((C1539d) aVar).mo7180p();
        }
        float min = Math.min(f2, f3);
        if (f > min) {
            f = min;
        }
        PointF h2 = this.f5874f.mo7157h();
        this.f5869a.moveTo(h2.x + f2, (h2.y - f3) + f);
        this.f5869a.lineTo(h2.x + f2, (h2.y + f3) - f);
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f5870b;
            float f4 = h2.x;
            float f5 = f * 2.0f;
            float f6 = h2.y;
            rectF.set((f4 + f2) - f5, (f6 + f3) - f5, f4 + f2, f6 + f3);
            this.f5869a.arcTo(this.f5870b, 0.0f, 90.0f, false);
        }
        this.f5869a.lineTo((h2.x - f2) + f, h2.y + f3);
        if (i > 0) {
            RectF rectF2 = this.f5870b;
            float f7 = h2.x;
            float f8 = h2.y;
            float f9 = f * 2.0f;
            rectF2.set(f7 - f2, (f8 + f3) - f9, (f7 - f2) + f9, f8 + f3);
            this.f5869a.arcTo(this.f5870b, 90.0f, 90.0f, false);
        }
        this.f5869a.lineTo(h2.x - f2, (h2.y - f3) + f);
        if (i > 0) {
            RectF rectF3 = this.f5870b;
            float f10 = h2.x;
            float f11 = h2.y;
            float f12 = f * 2.0f;
            rectF3.set(f10 - f2, f11 - f3, (f10 - f2) + f12, (f11 - f3) + f12);
            this.f5869a.arcTo(this.f5870b, 180.0f, 90.0f, false);
        }
        this.f5869a.lineTo((h2.x + f2) - f, h2.y - f3);
        if (i > 0) {
            RectF rectF4 = this.f5870b;
            float f13 = h2.x;
            float f14 = f * 2.0f;
            float f15 = h2.y;
            rectF4.set((f13 + f2) - f14, f15 - f3, f13 + f2, (f15 - f3) + f14);
            this.f5869a.arcTo(this.f5870b, 270.0f, 90.0f, false);
        }
        this.f5869a.close();
        this.f5877i.mo7139b(this.f5869a);
        this.f5878j = true;
        return this.f5869a;
    }
}
