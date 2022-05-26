package com.airbnb.lottie.p024x;

import android.graphics.Color;
import com.airbnb.lottie.p019v.p021k.C1582d;
import com.airbnb.lottie.p024x.p025n0.C1657c;
import com.airbnb.lottie.p026y.C1682g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.x.o */
/* compiled from: GradientColorParser */
public class C1662o implements C1653m0<C1582d> {

    /* renamed from: a */
    private int f6288a;

    public C1662o(int i) {
        this.f6288a = i;
    }

    /* renamed from: b */
    private void m8365b(C1582d dVar, List<Float> list) {
        int i = this.f6288a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < dVar.mo7269c(); i3++) {
                int i4 = dVar.mo7267a()[i3];
                dVar.mo7267a()[i3] = Color.argb(m8366c((double) dVar.mo7268b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: c */
    private int m8366c(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C1682g.m8451j(dArr4[i2], dArr4[i], C1682g.m8443b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }

    /* renamed from: d */
    public C1582d mo7411a(C1657c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = cVar.mo7436n0() == C1657c.C1659b.BEGIN_ARRAY;
        if (z) {
            cVar.mo7433d();
        }
        while (cVar.mo7427H()) {
            arrayList.add(Float.valueOf((float) cVar.mo7430Q()));
        }
        if (z) {
            cVar.mo7440x();
        }
        if (this.f6288a == -1) {
            this.f6288a = arrayList.size() / 4;
        }
        int i = this.f6288a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6288a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C1582d dVar = new C1582d(fArr, iArr);
        m8365b(dVar, arrayList);
        return dVar;
    }
}
