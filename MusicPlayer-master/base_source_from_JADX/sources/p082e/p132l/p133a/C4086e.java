package p082e.p132l.p133a;

import p082e.p132l.p133a.C4072b;

/* renamed from: e.l.a.e */
/* compiled from: SpringForce */
public final class C4086e {

    /* renamed from: a */
    double f12285a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f12286b = 0.5d;

    /* renamed from: c */
    private boolean f12287c = false;

    /* renamed from: d */
    private double f12288d;

    /* renamed from: e */
    private double f12289e;

    /* renamed from: f */
    private double f12290f;

    /* renamed from: g */
    private double f12291g;

    /* renamed from: h */
    private double f12292h;

    /* renamed from: i */
    private double f12293i = Double.MAX_VALUE;

    /* renamed from: j */
    private final C4072b.C4080h f12294j = new C4072b.C4080h();

    public C4086e() {
    }

    /* renamed from: b */
    private void m18081b() {
        if (!this.f12287c) {
            if (this.f12293i != Double.MAX_VALUE) {
                double d = this.f12286b;
                if (d > 1.0d) {
                    double d2 = this.f12285a;
                    this.f12290f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.f12286b;
                    double d4 = this.f12285a;
                    this.f12291g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f12292h = this.f12285a * Math.sqrt(1.0d - (d * d));
                }
                this.f12287c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float mo14148a() {
        return (float) this.f12293i;
    }

    /* renamed from: c */
    public boolean mo14149c(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f12289e && ((double) Math.abs(f - mo14148a())) < this.f12288d;
    }

    /* renamed from: d */
    public C4086e mo14150d(float f) {
        if (f >= 0.0f) {
            this.f12286b = (double) f;
            this.f12287c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: e */
    public C4086e mo14151e(float f) {
        this.f12293i = (double) f;
        return this;
    }

    /* renamed from: f */
    public C4086e mo14152f(float f) {
        if (f > 0.0f) {
            this.f12285a = Math.sqrt((double) f);
            this.f12287c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo14153g(double d) {
        double abs = Math.abs(d);
        this.f12288d = abs;
        this.f12289e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4072b.C4080h mo14154h(double d, double d2, long j) {
        double d3;
        double d4;
        m18081b();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f12293i;
        double d7 = this.f12286b;
        if (d7 > 1.0d) {
            double d8 = this.f12291g;
            double d9 = this.f12290f;
            double d10 = d6 - (((d8 * d6) - d2) / (d8 - d9));
            double d11 = ((d6 * d8) - d2) / (d8 - d9);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f12290f * d5) * d11);
            double d12 = this.f12291g;
            double pow = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f12290f;
            d3 = pow + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f12285a;
            double d15 = d2 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            d4 = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow2 = d16 * Math.pow(2.718281828459045d, (-this.f12285a) * d5);
            double d17 = this.f12285a;
            d3 = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow2 * (-d17));
        } else {
            double d18 = 1.0d / this.f12292h;
            double d19 = this.f12285a;
            double d20 = d18 * ((d7 * d19 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f12292h * d5) * d6) + (Math.sin(this.f12292h * d5) * d20));
            double d21 = this.f12285a;
            double d22 = this.f12286b;
            double d23 = (-d21) * pow3 * d22;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d24 = this.f12292h;
            double d25 = pow3;
            double sin = (-d24) * d6 * Math.sin(d24 * d5);
            double d26 = this.f12292h;
            d3 = d23 + (pow4 * (sin + (d20 * d26 * Math.cos(d26 * d5))));
            d4 = d25;
        }
        C4072b.C4080h hVar = this.f12294j;
        hVar.f12280a = (float) (d4 + this.f12293i);
        hVar.f12281b = (float) d3;
        return hVar;
    }

    public C4086e(float f) {
        this.f12293i = (double) f;
    }
}
