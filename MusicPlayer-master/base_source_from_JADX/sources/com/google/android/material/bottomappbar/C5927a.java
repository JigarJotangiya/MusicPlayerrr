package com.google.android.material.bottomappbar;

import p159f.p243f.p245b.p304b.p315w.C7539f;
import p159f.p243f.p245b.p304b.p315w.C7557o;

/* renamed from: com.google.android.material.bottomappbar.a */
/* compiled from: BottomAppBarTopEdgeTreatment */
public class C5927a extends C7539f implements Cloneable {

    /* renamed from: g */
    private float f27811g;

    /* renamed from: h */
    private float f27812h;

    /* renamed from: i */
    private float f27813i;

    /* renamed from: j */
    private float f27814j;

    /* renamed from: k */
    private float f27815k;

    /* renamed from: l */
    private float f27816l = -1.0f;

    public C5927a(float f, float f2, float f3) {
        this.f27812h = f;
        this.f27811g = f2;
        mo23028j(f3);
        this.f27815k = 0.0f;
    }

    /* renamed from: b */
    public void mo23021b(float f, float f2, float f3, C7557o oVar) {
        float f4;
        float f5;
        float f6 = f;
        C7557o oVar2 = oVar;
        float f7 = this.f27813i;
        if (f7 == 0.0f) {
            oVar2.mo28549m(f6, 0.0f);
            return;
        }
        float f8 = ((this.f27812h * 2.0f) + f7) / 2.0f;
        float f9 = f3 * this.f27811g;
        float f10 = f2 + this.f27815k;
        float f11 = (this.f27814j * f3) + ((1.0f - f3) * f8);
        if (f11 / f8 >= 1.0f) {
            oVar2.mo28549m(f6, 0.0f);
            return;
        }
        float f12 = this.f27816l;
        float f13 = f12 * f3;
        boolean z = f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f;
        if (!z) {
            f5 = 1.75f;
            f4 = 0.0f;
        } else {
            f4 = f11;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f4 + f9;
        float sqrt = (float) Math.sqrt((double) ((f14 * f14) - (f15 * f15)));
        float f16 = f10 - sqrt;
        float f17 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f15)));
        float f18 = (90.0f - degrees) + f5;
        oVar2.mo28549m(f16, 0.0f);
        float f19 = f9 * 2.0f;
        float f20 = degrees;
        oVar.mo28541a(f16 - f9, 0.0f, f16 + f9, f19, 270.0f, degrees);
        if (z) {
            oVar.mo28541a(f10 - f8, (-f8) - f4, f10 + f8, f8 - f4, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f21 = this.f27812h;
            float f22 = f13 * 2.0f;
            float f23 = f10 - f8;
            oVar.mo28541a(f23, -(f13 + f21), f23 + f21 + f22, f21 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f10 + f8;
            float f25 = this.f27812h;
            oVar2.mo28549m(f24 - ((f25 / 2.0f) + f13), f25 + f13);
            float f26 = this.f27812h;
            oVar.mo28541a(f24 - (f22 + f26), -(f13 + f26), f24, f26 + f13, 90.0f, f18 - 0.049804688f);
        }
        oVar.mo28541a(f17 - f9, 0.0f, f17 + f9, f19, 270.0f - f20, f20);
        oVar2.mo28549m(f6, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo23022c() {
        return this.f27814j;
    }

    /* renamed from: e */
    public float mo23023e() {
        return this.f27816l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo23024f() {
        return this.f27812h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo23025g() {
        return this.f27811g;
    }

    /* renamed from: h */
    public float mo23026h() {
        return this.f27813i;
    }

    /* renamed from: i */
    public float mo23027i() {
        return this.f27815k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo23028j(float f) {
        if (f >= 0.0f) {
            this.f27814j = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    /* renamed from: k */
    public void mo23029k(float f) {
        this.f27816l = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo23030l(float f) {
        this.f27812h = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23031m(float f) {
        this.f27811g = f;
    }

    /* renamed from: n */
    public void mo23032n(float f) {
        this.f27813i = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo23033o(float f) {
        this.f27815k = f;
    }
}
