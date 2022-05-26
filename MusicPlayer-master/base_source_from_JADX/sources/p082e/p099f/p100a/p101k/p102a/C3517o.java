package p082e.p099f.p100a.p101k.p102a;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* renamed from: e.f.a.k.a.o */
/* compiled from: TimeCycleSplineSet */
public abstract class C3517o {

    /* renamed from: k */
    protected static float f11262k = 6.2831855f;

    /* renamed from: a */
    protected C3498b f11263a;

    /* renamed from: b */
    protected int f11264b = 0;

    /* renamed from: c */
    protected int[] f11265c = new int[10];

    /* renamed from: d */
    protected float[][] f11266d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e */
    protected int f11267e;

    /* renamed from: f */
    protected String f11268f;

    /* renamed from: g */
    protected float[] f11269g = new float[3];

    /* renamed from: h */
    protected boolean f11270h = false;

    /* renamed from: i */
    protected long f11271i;

    /* renamed from: j */
    protected float f11272j = Float.NaN;

    /* renamed from: e.f.a.k.a.o$a */
    /* compiled from: TimeCycleSplineSet */
    protected static class C3518a {
        /* renamed from: a */
        static void m15094a(int[] iArr, float[][] fArr, int i, int i2) {
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
                    int b = m15095b(iArr, fArr, i5, i6);
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
        private static int m15095b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m15096c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m15096c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m15096c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo12563a(float f) {
        float abs;
        switch (this.f11264b) {
            case 1:
                return Math.signum(f * f11262k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f11262k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f11262k));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public void mo12564b(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f11265c;
        int i3 = this.f11267e;
        iArr[i3] = i;
        float[][] fArr = this.f11266d;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f11264b = Math.max(this.f11264b, i2);
        this.f11267e++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12565c(long j) {
        this.f11271i = j;
    }

    /* renamed from: d */
    public void mo12566d(String str) {
        this.f11268f = str;
    }

    /* renamed from: e */
    public void mo12567e(int i) {
        int i2 = this.f11267e;
        if (i2 == 0) {
            PrintStream printStream = System.err;
            printStream.println("Error no points added to " + this.f11268f);
            return;
        }
        C3518a.m15094a(this.f11265c, this.f11266d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f11265c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f11267e; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f11265c;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f11265c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f11266d;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f11263a = C3498b.m15003a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f11268f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f11267e; i++) {
            str = str + "[" + this.f11265c[i] + " , " + decimalFormat.format(this.f11266d[i]) + "] ";
        }
        return str;
    }
}
