package p082e.p099f.p100a.p101k.p102a;

import java.util.Arrays;

/* renamed from: e.f.a.k.a.h */
/* compiled from: Oscillator */
public class C3509h {

    /* renamed from: a */
    float[] f11225a = new float[0];

    /* renamed from: b */
    double[] f11226b = new double[0];

    /* renamed from: c */
    double[] f11227c;

    /* renamed from: d */
    String f11228d;

    /* renamed from: e */
    C3508g f11229e;

    /* renamed from: f */
    int f11230f;

    /* renamed from: g */
    double f11231g = 6.283185307179586d;

    /* renamed from: a */
    public void mo12543a(double d, float f) {
        int length = this.f11225a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f11226b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f11226b = Arrays.copyOf(this.f11226b, length);
        this.f11225a = Arrays.copyOf(this.f11225a, length);
        this.f11227c = new double[length];
        double[] dArr = this.f11226b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f11226b[binarySearch] = d;
        this.f11225a[binarySearch] = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public double mo12544b(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f11226b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f11225a;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f11226b;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return (((double) fArr[i2]) - (d3 * dArr[i2])) + (d * d3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public double mo12545c(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f11226b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f11225a;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f11226b;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.f11227c[i2] + ((((double) fArr[i2]) - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    /* renamed from: d */
    public double mo12546d(double d, double d2, double d3) {
        double c = d2 + mo12545c(d);
        double b = mo12544b(d) + d3;
        switch (this.f11230f) {
            case 1:
                return 0.0d;
            case 2:
                return b * 4.0d * Math.signum((((c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b * 2.0d;
            case 4:
                return (-b) * 2.0d;
            case 5:
                double d4 = this.f11231g;
                return (-d4) * b * Math.sin(d4 * c);
            case 6:
                return b * 4.0d * ((((c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f11229e.mo12510f(c % 1.0d, 0);
            default:
                double d5 = this.f11231g;
                return b * d5 * Math.cos(d5 * c);
        }
    }

    /* renamed from: e */
    public double mo12547e(double d, double d2) {
        double abs;
        double c = mo12545c(d) + d2;
        switch (this.f11230f) {
            case 1:
                return Math.signum(0.5d - (c % 1.0d));
            case 2:
                abs = Math.abs((((c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f11231g * (d2 + c));
            case 6:
                double abs2 = 1.0d - Math.abs(((c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f11229e.mo12507c(c % 1.0d, 0);
            default:
                return Math.sin(this.f11231g * c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void mo12548f() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f11225a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        int i2 = 1;
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.f11225a;
            if (i3 >= fArr2.length) {
                break;
            }
            int i4 = i3 - 1;
            double[] dArr = this.f11226b;
            d2 += (dArr[i3] - dArr[i4]) * ((double) ((fArr2[i4] + fArr2[i3]) / 2.0f));
            i3++;
        }
        int i5 = 0;
        while (true) {
            float[] fArr3 = this.f11225a;
            if (i5 >= fArr3.length) {
                break;
            }
            fArr3[i5] = (float) (((double) fArr3[i5]) * (d / d2));
            i5++;
        }
        this.f11227c[0] = 0.0d;
        while (true) {
            float[] fArr4 = this.f11225a;
            if (i2 < fArr4.length) {
                int i6 = i2 - 1;
                double[] dArr2 = this.f11226b;
                double d3 = dArr2[i2] - dArr2[i6];
                double[] dArr3 = this.f11227c;
                dArr3[i2] = dArr3[i6] + (d3 * ((double) ((fArr4[i6] + fArr4[i2]) / 2.0f)));
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo12549g(int i, String str) {
        this.f11230f = i;
        this.f11228d = str;
        if (str != null) {
            this.f11229e = C3508g.m15045i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f11226b) + " period=" + Arrays.toString(this.f11225a);
    }
}
