package com.airbnb.lottie.p015t.p016b;

import android.graphics.Path;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.p021k.C1594m;
import com.airbnb.lottie.p019v.p021k.C1597p;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.q */
/* compiled from: ShapeContent */
public class C1526q implements C1521m, C1529a.C1531b {

    /* renamed from: a */
    private final Path f5889a = new Path();

    /* renamed from: b */
    private final boolean f5890b;

    /* renamed from: c */
    private final C1473f f5891c;

    /* renamed from: d */
    private final C1529a<?, Path> f5892d;

    /* renamed from: e */
    private boolean f5893e;

    /* renamed from: f */
    private C1509b f5894f = new C1509b();

    public C1526q(C1473f fVar, C1604a aVar, C1597p pVar) {
        pVar.mo7336b();
        this.f5890b = pVar.mo7338d();
        this.f5891c = fVar;
        C1529a<C1594m, Path> a = pVar.mo7337c().mo7245a();
        this.f5892d = a;
        aVar.mo7366i(a);
        a.mo7151a(this);
    }

    /* renamed from: c */
    private void m7849c() {
        this.f5893e = false;
        this.f5891c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo7132a() {
        m7849c();
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < list.size(); i++) {
            C1510c cVar = list.get(i);
            if (cVar instanceof C1528s) {
                C1528s sVar = (C1528s) cVar;
                if (sVar.mo7149i() == C1602r.C1603a.SIMULTANEOUSLY) {
                    this.f5894f.mo7138a(sVar);
                    sVar.mo7145c(this);
                }
            }
        }
    }

    public Path getPath() {
        if (this.f5893e) {
            return this.f5889a;
        }
        this.f5889a.reset();
        if (this.f5890b) {
            this.f5893e = true;
            return this.f5889a;
        }
        this.f5889a.set(this.f5892d.mo7157h());
        this.f5889a.setFillType(Path.FillType.EVEN_ODD);
        this.f5894f.mo7139b(this.f5889a);
        this.f5893e = true;
        return this.f5889a;
    }
}
