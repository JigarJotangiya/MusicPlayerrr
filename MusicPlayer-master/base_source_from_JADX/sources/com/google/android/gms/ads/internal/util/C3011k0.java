package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.util.k0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3011k0 {

    /* renamed from: a */
    private final String[] f10030a;

    /* renamed from: b */
    private final double[] f10031b;

    /* renamed from: c */
    private final double[] f10032c;

    /* renamed from: d */
    private final int[] f10033d;

    /* renamed from: e */
    private int f10034e = 0;

    /* synthetic */ C3011k0(C3005i0 i0Var, C3008j0 j0Var) {
        int size = i0Var.f10018b.size();
        this.f10030a = (String[]) i0Var.f10017a.toArray(new String[size]);
        this.f10031b = m13371c(i0Var.f10018b);
        this.f10032c = m13371c(i0Var.f10019c);
        this.f10033d = new int[size];
    }

    /* renamed from: c */
    private static final double[] m13371c(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final List<C3001h0> mo11046a() {
        ArrayList arrayList = new ArrayList(this.f10030a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f10030a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.f10032c[i];
            double d2 = this.f10031b[i];
            int i2 = this.f10033d[i];
            arrayList.add(new C3001h0(str, d, d2, ((double) i2) / ((double) this.f10034e), i2));
            i++;
        }
    }

    /* renamed from: b */
    public final void mo11047b(double d) {
        this.f10034e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f10032c;
            if (i < dArr.length) {
                double d2 = dArr[i];
                if (d2 <= d && d < this.f10031b[i]) {
                    int[] iArr = this.f10033d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d >= d2) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
