package p082e.p099f.p100a.p101k.p102a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: e.f.a.k.a.j */
/* compiled from: SplineSet */
public abstract class C3511j {

    /* renamed from: a */
    protected C3498b f11234a;

    /* renamed from: b */
    protected int[] f11235b = new int[10];

    /* renamed from: c */
    protected float[] f11236c = new float[10];

    /* renamed from: d */
    private int f11237d;

    /* renamed from: e */
    private String f11238e;

    /* renamed from: e.f.a.k.a.j$a */
    /* compiled from: SplineSet */
    private static class C3512a {
        /* renamed from: a */
        static void m15071a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m15072b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m15072b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m15073c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m15073c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m15073c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: a */
    public float mo12551a(float f) {
        return (float) this.f11234a.mo12507c((double) f, 0);
    }

    /* renamed from: b */
    public float mo12552b(float f) {
        return (float) this.f11234a.mo12510f((double) f, 0);
    }

    /* renamed from: c */
    public void mo12553c(int i, float f) {
        int[] iArr = this.f11235b;
        if (iArr.length < this.f11237d + 1) {
            this.f11235b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f11236c;
            this.f11236c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f11235b;
        int i2 = this.f11237d;
        iArr2[i2] = i;
        this.f11236c[i2] = f;
        this.f11237d = i2 + 1;
    }

    /* renamed from: d */
    public void mo12554d(String str) {
        this.f11238e = str;
    }

    /* renamed from: e */
    public void mo12555e(int i) {
        int i2 = this.f11237d;
        if (i2 != 0) {
            C3512a.m15071a(this.f11235b, this.f11236c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f11237d; i4++) {
                int[] iArr = this.f11235b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f11237d; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f11235b;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f11235b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f11236c[i6];
                i5++;
            }
            this.f11234a = C3498b.m15003a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f11238e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f11237d; i++) {
            str = str + "[" + this.f11235b[i] + " , " + decimalFormat.format((double) this.f11236c[i]) + "] ";
        }
        return str;
    }
}
