package com.airbnb.lottie.p015t.p016b;

import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p019v.p021k.C1602r;
import com.airbnb.lottie.p019v.p022l.C1604a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.t.b.s */
/* compiled from: TrimPathContent */
public class C1528s implements C1510c, C1529a.C1531b {

    /* renamed from: a */
    private final boolean f5900a;

    /* renamed from: b */
    private final List<C1529a.C1531b> f5901b = new ArrayList();

    /* renamed from: c */
    private final C1602r.C1603a f5902c;

    /* renamed from: d */
    private final C1529a<?, Float> f5903d;

    /* renamed from: e */
    private final C1529a<?, Float> f5904e;

    /* renamed from: f */
    private final C1529a<?, Float> f5905f;

    public C1528s(C1604a aVar, C1602r rVar) {
        rVar.mo7353c();
        this.f5900a = rVar.mo7357g();
        this.f5902c = rVar.mo7356f();
        C1529a<Float, Float> a = rVar.mo7355e().mo7245a();
        this.f5903d = a;
        C1529a<Float, Float> a2 = rVar.mo7352b().mo7245a();
        this.f5904e = a2;
        C1529a<Float, Float> a3 = rVar.mo7354d().mo7245a();
        this.f5905f = a3;
        aVar.mo7366i(a);
        aVar.mo7366i(a2);
        aVar.mo7366i(a3);
        a.mo7151a(this);
        a2.mo7151a(this);
        a3.mo7151a(this);
    }

    /* renamed from: a */
    public void mo7132a() {
        for (int i = 0; i < this.f5901b.size(); i++) {
            this.f5901b.get(i).mo7132a();
        }
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7145c(C1529a.C1531b bVar) {
        this.f5901b.add(bVar);
    }

    /* renamed from: e */
    public C1529a<?, Float> mo7146e() {
        return this.f5904e;
    }

    /* renamed from: g */
    public C1529a<?, Float> mo7147g() {
        return this.f5905f;
    }

    /* renamed from: h */
    public C1529a<?, Float> mo7148h() {
        return this.f5903d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1602r.C1603a mo7149i() {
        return this.f5902c;
    }

    /* renamed from: j */
    public boolean mo7150j() {
        return this.f5900a;
    }
}
