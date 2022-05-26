package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f44 extends h44 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected f44(xh0 xh0, int[] iArr, int i, l54 l54, long j, long j2, long j3, int i2, int i3, float f, float f2, List<d44> list, ht1 ht1) {
        super(xh0, iArr, 0);
        xh0 xh02 = xh0;
        int[] iArr2 = iArr;
        g43.zzm(list);
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ g43 m23470e(w44[] w44Arr) {
        int i;
        int i2;
        double d;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            w44 w44 = w44Arr[i3];
            if (w44 == null || w44.f25226b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                d43 zzi = g43.zzi();
                zzi.mo16855f(new d44(0, 0));
                arrayList.add(zzi);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            w44 w442 = w44Arr[i4];
            if (w442 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[w442.f25226b.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = w442.f25226b;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    jArr[i4][i5] = (long) w442.f25225a.mo22031b(iArr[i5]).f25129h;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0 : jArr3[0];
        }
        m23471f(arrayList, jArr2);
        w43 c2 = p53.m28888b(u53.zzc()).mo19344b(2).mo18851c();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr4.length) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d2 = Math.log((double) j);
                    }
                    dArr[i8] = d2;
                    i8++;
                }
                int i9 = length - 1;
                double d3 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    double d4 = (dArr[i10] + dArr[i11]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d4 - dArr[c]) / d3;
                    }
                    c2.zzq(Double.valueOf(d), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        g43 zzm = g43.zzm(c2.zzr());
        for (int i12 = 0; i12 < zzm.size(); i12++) {
            int intValue = ((Integer) zzm.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            m23471f(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        m23471f(arrayList, jArr2);
        d43 zzi2 = g43.zzi();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            d43 d43 = (d43) arrayList.get(i15);
            zzi2.mo16855f(d43 == null ? g43.zzo() : d43.mo16856g());
        }
        return zzi2.mo16856g();
    }

    /* renamed from: f */
    private static void m23471f(List<d43<d44>> list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            d43 d43 = list.get(i2);
            if (d43 != null) {
                d43.mo16855f(new d44(j, jArr[i2]));
            }
        }
    }
}
