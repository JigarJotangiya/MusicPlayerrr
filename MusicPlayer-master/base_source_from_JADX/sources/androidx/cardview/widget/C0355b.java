package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
/* compiled from: CardViewApi21Impl */
class C0355b implements C0359e {
    C0355b() {
    }

    /* renamed from: p */
    private C0360f m1979p(C0358d dVar) {
        return (C0360f) dVar.mo2312f();
    }

    /* renamed from: a */
    public void mo2316a(C0358d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2309c(new C0360f(colorStateList, f));
        View g = dVar.mo2313g();
        g.setClipToOutline(true);
        g.setElevation(f2);
        mo2329o(dVar, f3);
    }

    /* renamed from: b */
    public void mo2317b(C0358d dVar, float f) {
        m1979p(dVar).mo2338h(f);
    }

    /* renamed from: c */
    public float mo2318c(C0358d dVar) {
        return dVar.mo2313g().getElevation();
    }

    /* renamed from: d */
    public float mo2319d(C0358d dVar) {
        return m1979p(dVar).mo2332d();
    }

    /* renamed from: e */
    public void mo2320e(C0358d dVar) {
        mo2329o(dVar, mo2322g(dVar));
    }

    /* renamed from: f */
    public void mo2321f(C0358d dVar, float f) {
        dVar.mo2313g().setElevation(f);
    }

    /* renamed from: g */
    public float mo2322g(C0358d dVar) {
        return m1979p(dVar).mo2331c();
    }

    /* renamed from: h */
    public ColorStateList mo2323h(C0358d dVar) {
        return m1979p(dVar).mo2330b();
    }

    /* renamed from: i */
    public void mo2324i(C0358d dVar) {
        if (!dVar.mo2311e()) {
            dVar.mo2307a(0, 0, 0, 0);
            return;
        }
        float g = mo2322g(dVar);
        float d = mo2319d(dVar);
        int ceil = (int) Math.ceil((double) C0361g.m2046c(g, d, dVar.mo2310d()));
        int ceil2 = (int) Math.ceil((double) C0361g.m2047d(g, d, dVar.mo2310d()));
        dVar.mo2307a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: j */
    public void mo2314j() {
    }

    /* renamed from: k */
    public float mo2325k(C0358d dVar) {
        return mo2319d(dVar) * 2.0f;
    }

    /* renamed from: l */
    public float mo2326l(C0358d dVar) {
        return mo2319d(dVar) * 2.0f;
    }

    /* renamed from: m */
    public void mo2327m(C0358d dVar) {
        mo2329o(dVar, mo2322g(dVar));
    }

    /* renamed from: n */
    public void mo2328n(C0358d dVar, ColorStateList colorStateList) {
        m1979p(dVar).mo2334f(colorStateList);
    }

    /* renamed from: o */
    public void mo2329o(C0358d dVar, float f) {
        m1979p(dVar).mo2335g(f, dVar.mo2311e(), dVar.mo2310d());
        mo2324i(dVar);
    }
}
