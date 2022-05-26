package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.b */
/* compiled from: CurveFit */
public abstract class C3498b {

    /* renamed from: e.f.a.k.a.b$a */
    /* compiled from: CurveFit */
    static class C3499a extends C3498b {

        /* renamed from: a */
        double f11184a;

        /* renamed from: b */
        double[] f11185b;

        C3499a(double d, double[] dArr) {
            this.f11184a = d;
            this.f11185b = dArr;
        }

        /* renamed from: c */
        public double mo12507c(double d, int i) {
            return this.f11185b[i];
        }

        /* renamed from: d */
        public void mo12508d(double d, double[] dArr) {
            double[] dArr2 = this.f11185b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: e */
        public void mo12509e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f11185b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public double mo12510f(double d, int i) {
            return 0.0d;
        }

        /* renamed from: g */
        public void mo12511g(double d, double[] dArr) {
            for (int i = 0; i < this.f11185b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: h */
        public double[] mo12512h() {
            return new double[]{this.f11184a};
        }
    }

    /* renamed from: a */
    public static C3498b m15003a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C3508g(dArr, dArr2);
        }
        if (i != 2) {
            return new C3507f(dArr, dArr2);
        }
        return new C3499a(dArr[0], dArr2[0]);
    }

    /* renamed from: b */
    public static C3498b m15004b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3496a(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo12507c(double d, int i);

    /* renamed from: d */
    public abstract void mo12508d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo12509e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo12510f(double d, int i);

    /* renamed from: g */
    public abstract void mo12511g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo12512h();
}
