package p082e.p099f.p100a.p101k.p102a;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: e.f.a.k.a.g */
/* compiled from: MonotonicCurveFit */
public class C3508g extends C3498b {

    /* renamed from: a */
    private double[] f11220a;

    /* renamed from: b */
    private double[][] f11221b;

    /* renamed from: c */
    private double[][] f11222c;

    /* renamed from: d */
    private boolean f11223d = true;

    /* renamed from: e */
    double[] f11224e;

    public C3508g(double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        double[][] dArr4 = dArr2;
        Class<double> cls = double.class;
        int length = dArr3.length;
        int length2 = dArr4[0].length;
        this.f11224e = new double[length2];
        int i = length - 1;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = i;
        double[][] dArr5 = (double[][]) Array.newInstance(cls, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        double[][] dArr6 = (double[][]) Array.newInstance(cls, iArr2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                dArr5[i3][i2] = (dArr4[i4][i2] - dArr4[i3][i2]) / (dArr3[i4] - dArr3[i3]);
                if (i3 == 0) {
                    dArr6[i3][i2] = dArr5[i3][i2];
                } else {
                    dArr6[i3][i2] = (dArr5[i3 - 1][i2] + dArr5[i3][i2]) * 0.5d;
                }
                i3 = i4;
            }
            dArr6[i][i2] = dArr5[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                if (dArr5[i5][i6] == 0.0d) {
                    dArr6[i5][i6] = 0.0d;
                    dArr6[i5 + 1][i6] = 0.0d;
                } else {
                    double d = dArr6[i5][i6] / dArr5[i5][i6];
                    int i7 = i5 + 1;
                    double d2 = dArr6[i7][i6] / dArr5[i5][i6];
                    double hypot = Math.hypot(d, d2);
                    if (hypot > 9.0d) {
                        double d3 = 3.0d / hypot;
                        dArr6[i5][i6] = d * d3 * dArr5[i5][i6];
                        dArr6[i7][i6] = d3 * d2 * dArr5[i5][i6];
                    }
                }
            }
        }
        this.f11220a = dArr3;
        this.f11221b = dArr4;
        this.f11222c = dArr6;
    }

    /* renamed from: i */
    public static C3508g m15045i(String str) {
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return m15046j(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: j */
    private static C3508g m15046j(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr4 = new double[length];
        for (int i = 0; i < dArr2.length; i++) {
            double d2 = dArr2[i];
            int i2 = i + length2;
            dArr3[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr4[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr3[i3][0] = d2 + 1.0d;
                dArr4[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr3[i4][0] = (d2 - 1.0d) - d;
                dArr4[i4] = (d3 - 4.0d) - d;
            }
        }
        return new C3508g(dArr4, dArr3);
    }

    /* renamed from: k */
    private static double m15047k(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 3.0d * d;
        return (((((((((-6.0d * d7) * d4) + (d8 * d4)) + ((6.0d * d7) * d3)) - (d8 * d3)) + ((d9 * d6) * d7)) + ((d9 * d5) * d7)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2)) + (d * d5);
    }

    /* renamed from: l */
    private static double m15048l(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d * d6;
        double d11 = d * d5;
        return ((((((((((-2.0d * d8) * d4) + (d9 * d4)) + ((d8 * 2.0d) * d3)) - (d9 * d3)) + d3) + (d10 * d8)) + (d8 * d11)) - (d10 * d7)) - (((d * 2.0d) * d5) * d7)) + (d11 * d2);
    }

    /* renamed from: c */
    public double mo12507c(double d, int i) {
        int i2 = i;
        double[] dArr = this.f11220a;
        int length = dArr.length;
        int i3 = 0;
        if (this.f11223d) {
            if (d <= dArr[0]) {
                return this.f11221b[0][i2] + ((d - dArr[0]) * mo12510f(dArr[0], i2));
            }
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f11221b[i4][i2] + ((d - dArr[i4]) * mo12510f(dArr[i4], i2));
            }
        } else if (d <= dArr[0]) {
            return this.f11221b[0][i2];
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                return this.f11221b[i5][i2];
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f11220a;
            if (d == dArr2[i3]) {
                return this.f11221b[i3][i2];
            }
            int i6 = i3 + 1;
            if (d < dArr2[i6]) {
                double d2 = dArr2[i6] - dArr2[i3];
                double d3 = (d - dArr2[i3]) / d2;
                double[][] dArr3 = this.f11221b;
                double d4 = dArr3[i3][i2];
                double d5 = dArr3[i6][i2];
                double[][] dArr4 = this.f11222c;
                return m15048l(d2, d3, d4, d5, dArr4[i3][i2], dArr4[i6][i2]);
            }
            i3 = i6;
        }
        return 0.0d;
    }

    /* renamed from: d */
    public void mo12508d(double d, double[] dArr) {
        double[] dArr2 = this.f11220a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f11221b[0].length;
        if (this.f11223d) {
            if (d <= dArr2[0]) {
                mo12511g(dArr2[0], this.f11224e);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f11221b[0][i2] + ((d - this.f11220a[0]) * this.f11224e[i2]);
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr2[i3]) {
                mo12511g(dArr2[i3], this.f11224e);
                while (i < length2) {
                    dArr[i] = this.f11221b[i3][i] + ((d - this.f11220a[i3]) * this.f11224e[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f11221b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f11221b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f11220a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f11221b[i6][i7];
                }
            }
            double[] dArr3 = this.f11220a;
            int i8 = i6 + 1;
            if (d < dArr3[i8]) {
                double d2 = dArr3[i8] - dArr3[i6];
                double d3 = (d - dArr3[i6]) / d2;
                while (i < length2) {
                    double[][] dArr4 = this.f11221b;
                    double d4 = dArr4[i6][i];
                    double d5 = dArr4[i8][i];
                    double[][] dArr5 = this.f11222c;
                    dArr[i] = m15048l(d2, d3, d4, d5, dArr5[i6][i], dArr5[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: e */
    public void mo12509e(double d, float[] fArr) {
        double[] dArr = this.f11220a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f11221b[0].length;
        if (this.f11223d) {
            if (d <= dArr[0]) {
                mo12511g(dArr[0], this.f11224e);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f11221b[0][i2] + ((d - this.f11220a[0]) * this.f11224e[i2]));
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                mo12511g(dArr[i3], this.f11224e);
                while (i < length2) {
                    fArr[i] = (float) (this.f11221b[i3][i] + ((d - this.f11220a[i3]) * this.f11224e[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f11221b[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f11221b[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f11220a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f11221b[i6][i7];
                }
            }
            double[] dArr2 = this.f11220a;
            int i8 = i6 + 1;
            if (d < dArr2[i8]) {
                double d2 = dArr2[i8] - dArr2[i6];
                double d3 = (d - dArr2[i6]) / d2;
                while (i < length2) {
                    double[][] dArr3 = this.f11221b;
                    double d4 = dArr3[i6][i];
                    double d5 = dArr3[i8][i];
                    double[][] dArr4 = this.f11222c;
                    fArr[i] = (float) m15048l(d2, d3, d4, d5, dArr4[i6][i], dArr4[i8][i]);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: f */
    public double mo12510f(double d, int i) {
        double d2;
        double[] dArr = this.f11220a;
        int length = dArr.length;
        int i2 = 0;
        if (d < dArr[0]) {
            d2 = dArr[0];
        } else {
            int i3 = length - 1;
            d2 = d >= dArr[i3] ? dArr[i3] : d;
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f11220a;
            int i4 = i2 + 1;
            if (d2 <= dArr2[i4]) {
                double d3 = dArr2[i4] - dArr2[i2];
                double[][] dArr3 = this.f11221b;
                double d4 = dArr3[i2][i];
                double d5 = dArr3[i4][i];
                double[][] dArr4 = this.f11222c;
                return m15047k(d3, (d2 - dArr2[i2]) / d3, d4, d5, dArr4[i2][i], dArr4[i4][i]) / d3;
            }
            i2 = i4;
        }
        return 0.0d;
    }

    /* renamed from: g */
    public void mo12511g(double d, double[] dArr) {
        double d2;
        double[] dArr2 = this.f11220a;
        int length = dArr2.length;
        int length2 = this.f11221b[0].length;
        if (d <= dArr2[0]) {
            d2 = dArr2[0];
        } else {
            int i = length - 1;
            d2 = d >= dArr2[i] ? dArr2[i] : d;
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f11220a;
            int i3 = i2 + 1;
            if (d2 <= dArr3[i3]) {
                double d3 = dArr3[i3] - dArr3[i2];
                double d4 = (d2 - dArr3[i2]) / d3;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f11221b;
                    double d5 = dArr4[i2][i4];
                    double d6 = dArr4[i3][i4];
                    double[][] dArr5 = this.f11222c;
                    dArr[i4] = m15047k(d3, d4, d5, d6, dArr5[i2][i4], dArr5[i3][i4]) / d3;
                }
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: h */
    public double[] mo12512h() {
        return this.f11220a;
    }
}
