package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.k */
/* compiled from: SpringStopEngine */
public class C3513k implements C3515m {

    /* renamed from: a */
    double f11239a = 0.5d;

    /* renamed from: b */
    private double f11240b;

    /* renamed from: c */
    private double f11241c;

    /* renamed from: d */
    private float f11242d;

    /* renamed from: e */
    private float f11243e;

    /* renamed from: f */
    private float f11244f;

    /* renamed from: g */
    private float f11245g;

    /* renamed from: h */
    private float f11246h;

    /* renamed from: i */
    private int f11247i = 0;

    /* renamed from: c */
    private void m15074c(double d) {
        double d2 = this.f11240b;
        double d3 = this.f11239a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / ((double) this.f11245g)) * d) * 4.0d)) + 1.0d);
        double d4 = d / ((double) sqrt);
        int i = 0;
        while (i < sqrt) {
            float f = this.f11243e;
            double d5 = this.f11241c;
            float f2 = this.f11244f;
            double d6 = d2;
            float f3 = this.f11245g;
            double d7 = d3;
            double d8 = ((double) f2) + ((((((-d2) * (((double) f) - d5)) - (((double) f2) * d3)) / ((double) f3)) * d4) / 2.0d);
            double d9 = ((((-((((double) f) + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / ((double) f3)) * d4;
            float f4 = (float) (((double) f2) + d9);
            this.f11244f = f4;
            float f5 = (float) (((double) f) + ((((double) f2) + (d9 / 2.0d)) * d4));
            this.f11243e = f5;
            int i2 = this.f11247i;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f11243e = -f5;
                    this.f11244f = -f4;
                }
                float f6 = this.f11243e;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f11243e = 2.0f - f6;
                    this.f11244f = -this.f11244f;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    /* renamed from: a */
    public boolean mo12557a() {
        double d = ((double) this.f11243e) - this.f11241c;
        double d2 = this.f11240b;
        double d3 = (double) this.f11244f;
        return Math.sqrt((((d3 * d3) * ((double) this.f11245g)) + ((d2 * d) * d)) / d2) <= ((double) this.f11246h);
    }

    /* renamed from: b */
    public float mo12558b() {
        return 0.0f;
    }

    /* renamed from: d */
    public void mo12559d(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f11241c = (double) f2;
        this.f11239a = (double) f6;
        this.f11243e = f;
        this.f11240b = (double) f5;
        this.f11245g = f4;
        this.f11246h = f7;
        this.f11247i = i;
        this.f11242d = 0.0f;
    }

    public float getInterpolation(float f) {
        m15074c((double) (f - this.f11242d));
        this.f11242d = f;
        return this.f11243e;
    }
}
