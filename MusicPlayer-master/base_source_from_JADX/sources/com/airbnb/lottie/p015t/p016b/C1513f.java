package com.airbnb.lottie.p015t.p016b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1580b;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import com.airbnb.lottie.p026y.C1682g;
import com.airbnb.lottie.p027z.C1690c;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.f */
/* compiled from: EllipseContent */
public class C1513f implements C1521m, C1529a.C1531b, C1518k {

    /* renamed from: a */
    private final Path f5795a = new Path();

    /* renamed from: b */
    private final String f5796b;

    /* renamed from: c */
    private final C1473f f5797c;

    /* renamed from: d */
    private final C1529a<?, PointF> f5798d;

    /* renamed from: e */
    private final C1529a<?, PointF> f5799e;

    /* renamed from: f */
    private final C1580b f5800f;

    /* renamed from: g */
    private C1509b f5801g = new C1509b();

    /* renamed from: h */
    private boolean f5802h;

    public C1513f(C1473f fVar, C1604a aVar, C1580b bVar) {
        this.f5796b = bVar.mo7262b();
        this.f5797c = fVar;
        C1529a<PointF, PointF> a = bVar.mo7264d().mo7245a();
        this.f5798d = a;
        C1529a<PointF, PointF> a2 = bVar.mo7263c().mo7245a();
        this.f5799e = a2;
        this.f5800f = bVar;
        aVar.mo7366i(a);
        aVar.mo7366i(a2);
        a.mo7151a(this);
        a2.mo7151a(this);
    }

    /* renamed from: e */
    private void m7798e() {
        this.f5802h = false;
        this.f5797c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo7132a() {
        m7798e();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1510c cVar = list.get(i);
            if (cVar instanceof C1528s) {
                C1528s sVar = (C1528s) cVar;
                if (sVar.mo7149i() == C1602r.C1603a.SIMULTANEOUSLY) {
                    this.f5801g.mo7138a(sVar);
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
        if (t == C1493k.f5735k) {
            this.f5798d.mo7163n(cVar);
        } else if (t == C1493k.f5738n) {
            this.f5799e.mo7163n(cVar);
        }
    }

    public String getName() {
        return this.f5796b;
    }

    public Path getPath() {
        if (this.f5802h) {
            return this.f5795a;
        }
        this.f5795a.reset();
        if (this.f5800f.mo7265e()) {
            this.f5802h = true;
            return this.f5795a;
        }
        PointF h = this.f5798d.mo7157h();
        float f = h.x / 2.0f;
        float f2 = h.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f5795a.reset();
        if (this.f5800f.mo7266f()) {
            float f5 = -f2;
            this.f5795a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f5795a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f5795a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f5795a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f5795a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f5795a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f5795a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f5795a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f5795a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f5795a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF h2 = this.f5799e.mo7157h();
        this.f5795a.offset(h2.x, h2.y);
        this.f5795a.close();
        this.f5801g.mo7139b(this.f5795a);
        this.f5802h = true;
        return this.f5795a;
    }
}
