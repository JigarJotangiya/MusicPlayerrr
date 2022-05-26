package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.n */
/* compiled from: StopLogicEngine */
public class C3516n implements C3515m {

    /* renamed from: a */
    private float f11249a;

    /* renamed from: b */
    private float f11250b;

    /* renamed from: c */
    private float f11251c;

    /* renamed from: d */
    private float f11252d;

    /* renamed from: e */
    private float f11253e;

    /* renamed from: f */
    private float f11254f;

    /* renamed from: g */
    private float f11255g;

    /* renamed from: h */
    private float f11256h;

    /* renamed from: i */
    private float f11257i;

    /* renamed from: j */
    private int f11258j;

    /* renamed from: k */
    private boolean f11259k = false;

    /* renamed from: l */
    private float f11260l;

    /* renamed from: m */
    private float f11261m;

    /* renamed from: c */
    private float m15083c(float f) {
        float f2 = this.f11252d;
        if (f <= f2) {
            float f3 = this.f11249a;
            return (f3 * f) + ((((this.f11250b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f11258j;
        if (i == 1) {
            return this.f11255g;
        }
        float f4 = f - f2;
        float f5 = this.f11253e;
        if (f4 < f5) {
            float f6 = this.f11255g;
            float f7 = this.f11250b;
            return f6 + (f7 * f4) + ((((this.f11251c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f11256h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f11254f;
            if (f8 > f9) {
                return this.f11257i;
            }
            float f10 = this.f11256h;
            float f11 = this.f11251c;
            return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
        }
    }

    /* renamed from: f */
    private void m15084f(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f11249a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f11258j = 2;
                this.f11249a = f;
                this.f11250b = sqrt;
                this.f11251c = 0.0f;
                float f8 = (sqrt - f) / f3;
                this.f11252d = f8;
                this.f11253e = sqrt / f3;
                this.f11255g = ((f + sqrt) * f8) / 2.0f;
                this.f11256h = f2;
                this.f11257i = f2;
                return;
            }
            this.f11258j = 3;
            this.f11249a = f;
            this.f11250b = f4;
            this.f11251c = f4;
            float f9 = (f4 - f) / f3;
            this.f11252d = f9;
            float f10 = f4 / f3;
            this.f11254f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f11253e = ((f2 - f11) - f12) / f4;
            this.f11255g = f11;
            this.f11256h = f2 - f12;
            this.f11257i = f2;
        } else if (f7 >= f2) {
            this.f11258j = 1;
            this.f11249a = f;
            this.f11250b = 0.0f;
            this.f11255g = f2;
            this.f11252d = (2.0f * f2) / f;
        } else {
            float f13 = f2 - f7;
            float f14 = f13 / f;
            if (f14 + f6 < f5) {
                this.f11258j = 2;
                this.f11249a = f;
                this.f11250b = f;
                this.f11251c = 0.0f;
                this.f11255g = f13;
                this.f11256h = f2;
                this.f11252d = f14;
                this.f11253e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f15 = (sqrt2 - f) / f3;
            this.f11252d = f15;
            float f16 = sqrt2 / f3;
            this.f11253e = f16;
            if (sqrt2 < f4) {
                this.f11258j = 2;
                this.f11249a = f;
                this.f11250b = sqrt2;
                this.f11251c = 0.0f;
                this.f11252d = f15;
                this.f11253e = f16;
                this.f11255g = ((f + sqrt2) * f15) / 2.0f;
                this.f11256h = f2;
                return;
            }
            this.f11258j = 3;
            this.f11249a = f;
            this.f11250b = f4;
            this.f11251c = f4;
            float f17 = (f4 - f) / f3;
            this.f11252d = f17;
            float f18 = f4 / f3;
            this.f11254f = f18;
            float f19 = ((f + f4) * f17) / 2.0f;
            float f20 = (f18 * f4) / 2.0f;
            this.f11253e = ((f2 - f19) - f20) / f4;
            this.f11255g = f19;
            this.f11256h = f2 - f20;
            this.f11257i = f2;
        }
    }

    /* renamed from: a */
    public boolean mo12557a() {
        return mo12558b() < 1.0E-5f && Math.abs(this.f11257i - this.f11261m) < 1.0E-5f;
    }

    /* renamed from: b */
    public float mo12558b() {
        return this.f11259k ? -mo12562e(this.f11261m) : mo12562e(this.f11261m);
    }

    /* renamed from: d */
    public void mo12561d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f11260l = f;
        boolean z = f > f2;
        this.f11259k = z;
        if (z) {
            m15084f(-f3, f - f2, f5, f6, f4);
        } else {
            m15084f(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: e */
    public float mo12562e(float f) {
        float f2 = this.f11252d;
        if (f <= f2) {
            float f3 = this.f11249a;
            return f3 + (((this.f11250b - f3) * f) / f2);
        }
        int i = this.f11258j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f11253e;
        if (f4 < f5) {
            float f6 = this.f11250b;
            return f6 + (((this.f11251c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f11256h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f11254f;
            if (f7 >= f8) {
                return this.f11257i;
            }
            float f9 = this.f11251c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    public float getInterpolation(float f) {
        float c = m15083c(f);
        this.f11261m = f;
        return this.f11259k ? this.f11260l - c : this.f11260l + c;
    }
}
