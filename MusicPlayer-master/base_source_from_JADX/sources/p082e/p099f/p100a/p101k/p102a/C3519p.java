package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.p */
/* compiled from: VelocityMatrix */
public class C3519p {

    /* renamed from: a */
    float f11273a;

    /* renamed from: b */
    float f11274b;

    /* renamed from: c */
    float f11275c;

    /* renamed from: d */
    float f11276d;

    /* renamed from: e */
    float f11277e;

    /* renamed from: f */
    float f11278f;

    /* renamed from: a */
    public void mo12569a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f11275c;
        float f8 = f4 + this.f11276d;
        float f9 = f7 + (this.f11273a * f5);
        float f10 = f8 + (this.f11274b * f6);
        float radians = (float) Math.toRadians((double) this.f11277e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f11278f));
        double d = (double) (((float) i2) * f6);
        fArr[0] = f9 + (((float) ((((double) (((float) (-i3)) * f5)) * Math.sin(radians2)) - (Math.cos(radians2) * d))) * radians);
        fArr[1] = f10 + (radians * ((float) ((((double) (((float) i3) * f5)) * Math.cos(radians2)) - (d * Math.sin(radians2)))));
    }

    /* renamed from: b */
    public void mo12570b() {
        this.f11277e = 0.0f;
        this.f11276d = 0.0f;
        this.f11275c = 0.0f;
        this.f11274b = 0.0f;
        this.f11273a = 0.0f;
    }

    /* renamed from: c */
    public void mo12571c(C3503e eVar, float f) {
        if (eVar != null) {
            this.f11277e = eVar.mo12529b(f);
        }
    }

    /* renamed from: d */
    public void mo12572d(C3511j jVar, float f) {
        if (jVar != null) {
            this.f11277e = jVar.mo12552b(f);
            this.f11278f = jVar.mo12551a(f);
        }
    }

    /* renamed from: e */
    public void mo12573e(C3503e eVar, C3503e eVar2, float f) {
        if (eVar != null) {
            this.f11273a = eVar.mo12529b(f);
        }
        if (eVar2 != null) {
            this.f11274b = eVar2.mo12529b(f);
        }
    }

    /* renamed from: f */
    public void mo12574f(C3511j jVar, C3511j jVar2, float f) {
        if (jVar != null) {
            this.f11273a = jVar.mo12552b(f);
        }
        if (jVar2 != null) {
            this.f11274b = jVar2.mo12552b(f);
        }
    }

    /* renamed from: g */
    public void mo12575g(C3503e eVar, C3503e eVar2, float f) {
        if (eVar != null) {
            this.f11275c = eVar.mo12529b(f);
        }
        if (eVar2 != null) {
            this.f11276d = eVar2.mo12529b(f);
        }
    }

    /* renamed from: h */
    public void mo12576h(C3511j jVar, C3511j jVar2, float f) {
        if (jVar != null) {
            this.f11275c = jVar.mo12552b(f);
        }
        if (jVar2 != null) {
            this.f11276d = jVar2.mo12552b(f);
        }
    }
}
