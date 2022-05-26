package p159f.p243f.p245b.p304b.p315w;

/* renamed from: f.f.b.b.w.g */
/* compiled from: MarkerEdgeTreatment */
public final class C7540g extends C7539f {

    /* renamed from: a */
    private final float f32783a;

    public C7540g(float f) {
        this.f32783a = f - 0.001f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo28444a() {
        return true;
    }

    /* renamed from: b */
    public void mo23021b(float f, float f2, float f3, C7557o oVar) {
        float sqrt = (float) ((((double) this.f32783a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f32783a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        oVar.mo28550n(f2 - sqrt, ((float) (-((((double) this.f32783a) * Math.sqrt(2.0d)) - ((double) this.f32783a)))) + sqrt2);
        oVar.mo28549m(f2, (float) (-((((double) this.f32783a) * Math.sqrt(2.0d)) - ((double) this.f32783a))));
        oVar.mo28549m(f2 + sqrt, ((float) (-((((double) this.f32783a) * Math.sqrt(2.0d)) - ((double) this.f32783a)))) + sqrt2);
    }
}
