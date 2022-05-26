package p082e.p099f.p100a.p101k.p102a;

/* renamed from: e.f.a.k.a.f */
/* compiled from: LinearCurveFit */
public class C3507f extends C3498b {

    /* renamed from: a */
    private double[] f11216a;

    /* renamed from: b */
    private double[][] f11217b;

    /* renamed from: c */
    private boolean f11218c = true;

    /* renamed from: d */
    double[] f11219d;

    public C3507f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f11219d = new double[length2];
        this.f11216a = dArr;
        this.f11217b = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                double d4 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d, d4 - d2);
                }
                i++;
                d = d3;
                d2 = d4;
            }
        }
    }

    /* renamed from: c */
    public double mo12507c(double d, int i) {
        double[] dArr = this.f11216a;
        int length = dArr.length;
        int i2 = 0;
        if (this.f11218c) {
            if (d <= dArr[0]) {
                return this.f11217b[0][i] + ((d - dArr[0]) * mo12510f(dArr[0], i));
            }
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                return this.f11217b[i3][i] + ((d - dArr[i3]) * mo12510f(dArr[i3], i));
            }
        } else if (d <= dArr[0]) {
            return this.f11217b[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f11217b[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f11216a;
            if (d == dArr2[i2]) {
                return this.f11217b[i2][i];
            }
            int i5 = i2 + 1;
            if (d < dArr2[i5]) {
                double d2 = (d - dArr2[i2]) / (dArr2[i5] - dArr2[i2]);
                double[][] dArr3 = this.f11217b;
                return (dArr3[i2][i] * (1.0d - d2)) + (dArr3[i5][i] * d2);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    /* renamed from: d */
    public void mo12508d(double d, double[] dArr) {
        double[] dArr2 = this.f11216a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f11217b[0].length;
        if (this.f11218c) {
            if (d <= dArr2[0]) {
                mo12511g(dArr2[0], this.f11219d);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f11217b[0][i2] + ((d - this.f11216a[0]) * this.f11219d[i2]);
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr2[i3]) {
                mo12511g(dArr2[i3], this.f11219d);
                while (i < length2) {
                    dArr[i] = this.f11217b[i3][i] + ((d - this.f11216a[i3]) * this.f11219d[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f11217b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f11217b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f11216a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f11217b[i6][i7];
                }
            }
            double[] dArr3 = this.f11216a;
            int i8 = i6 + 1;
            if (d < dArr3[i8]) {
                double d2 = (d - dArr3[i6]) / (dArr3[i8] - dArr3[i6]);
                while (i < length2) {
                    double[][] dArr4 = this.f11217b;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d2)) + (dArr4[i8][i] * d2);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: e */
    public void mo12509e(double d, float[] fArr) {
        double[] dArr = this.f11216a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f11217b[0].length;
        if (this.f11218c) {
            if (d <= dArr[0]) {
                mo12511g(dArr[0], this.f11219d);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f11217b[0][i2] + ((d - this.f11216a[0]) * this.f11219d[i2]));
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                mo12511g(dArr[i3], this.f11219d);
                while (i < length2) {
                    fArr[i] = (float) (this.f11217b[i3][i] + ((d - this.f11216a[i3]) * this.f11219d[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f11217b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f11217b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f11216a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f11217b[i6][i7];
                }
            }
            double[] dArr2 = this.f11216a;
            int i8 = i6 + 1;
            if (d < dArr2[i8]) {
                double d2 = (d - dArr2[i6]) / (dArr2[i8] - dArr2[i6]);
                while (i < length2) {
                    double[][] dArr3 = this.f11217b;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d2)) + (dArr3[i8][i] * d2));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: f */
    public double mo12510f(double d, int i) {
        double[] dArr = this.f11216a;
        int length = dArr.length;
        int i2 = 0;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                d = dArr[i3];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f11216a;
            int i4 = i2 + 1;
            if (d <= dArr2[i4]) {
                double d2 = dArr2[i4] - dArr2[i2];
                double d3 = dArr2[i2];
                double[][] dArr3 = this.f11217b;
                return (dArr3[i4][i] - dArr3[i2][i]) / d2;
            }
            i2 = i4;
        }
        return 0.0d;
    }

    /* renamed from: g */
    public void mo12511g(double d, double[] dArr) {
        double[] dArr2 = this.f11216a;
        int length = dArr2.length;
        int length2 = this.f11217b[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i = length - 1;
            if (d >= dArr2[i]) {
                d = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f11216a;
            int i3 = i2 + 1;
            if (d <= dArr3[i3]) {
                double d2 = dArr3[i3] - dArr3[i2];
                double d3 = dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f11217b;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d2;
                }
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: h */
    public double[] mo12512h() {
        return this.f11216a;
    }
}