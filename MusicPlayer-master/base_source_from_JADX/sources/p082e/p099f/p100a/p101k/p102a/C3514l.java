package p082e.p099f.p100a.p101k.p102a;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: e.f.a.k.a.l */
/* compiled from: StepCurve */
public class C3514l extends C3500c {

    /* renamed from: d */
    C3508g f11248d;

    C3514l(String str) {
        this.f11188a = str;
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
        this.f11248d = m15078d(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    private static C3508g m15078d(double[] dArr) {
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
        C3508g gVar = new C3508g(dArr4, dArr3);
        System.out.println(" 0 " + gVar.mo12507c(0.0d, 0));
        System.out.println(" 1 " + gVar.mo12507c(1.0d, 0));
        return gVar;
    }

    /* renamed from: a */
    public double mo12523a(double d) {
        return this.f11248d.mo12507c(d, 0);
    }

    /* renamed from: b */
    public double mo12524b(double d) {
        return this.f11248d.mo12510f(d, 0);
    }
}
