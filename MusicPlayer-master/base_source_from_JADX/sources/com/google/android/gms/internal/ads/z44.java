package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class z44 extends b54 {
    /* renamed from: a */
    public final c54 mo16073a(mu3[] mu3Arr, uj0 uj0, f24 f24, bg0 bg0) throws ji3 {
        boolean z;
        char c;
        int[] iArr;
        uj0 uj02 = uj0;
        int[] iArr2 = new int[3];
        xh0[][] xh0Arr = new xh0[3][];
        int[][][] iArr3 = new int[3][][];
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = uj02.f24343a;
            xh0Arr[i2] = new xh0[i3];
            iArr3[i2] = new int[i3][];
        }
        int i4 = 2;
        int[] iArr4 = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr4[i5] = mu3Arr[i5].zze();
        }
        int i6 = 0;
        while (i6 < uj02.f24343a) {
            xh0 b = uj02.mo21275b(i6);
            int a = C5463pw.m29197a(b.mo22031b(i).f25133l);
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i4) {
                mu3 mu3 = mu3Arr[i7];
                int i10 = 0;
                while (true) {
                    int i11 = b.f25828a;
                    if (i > 0) {
                        break;
                    }
                    i10 = Math.max(i10, mu3.mo16492l(b.mo22031b(i)) & 7);
                    i++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && a == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i4 = 2;
                i = 0;
            }
            if (i8 == i4) {
                int i12 = b.f25828a;
                iArr = new int[1];
            } else {
                mu3 mu32 = mu3Arr[i8];
                int i13 = b.f25828a;
                int[] iArr5 = new int[1];
                int i14 = 0;
                while (true) {
                    int i15 = b.f25828a;
                    if (i14 > 0) {
                        break;
                    }
                    iArr5[i14] = mu32.mo16492l(b.mo22031b(i14));
                    i14++;
                }
                iArr = iArr5;
            }
            int i16 = iArr2[i8];
            xh0Arr[i8][i16] = b;
            iArr3[i8][i16] = iArr;
            iArr2[i8] = i16 + 1;
            i6++;
            i4 = 2;
            i = 0;
        }
        uj0[] uj0Arr = new uj0[i4];
        String[] strArr = new String[i4];
        int[] iArr6 = new int[i4];
        int i17 = 0;
        while (i17 < i4) {
            int i18 = iArr2[i17];
            uj0Arr[i17] = new uj0((xh0[]) wy2.m33407B(xh0Arr[i17], i18));
            iArr3[i17] = (int[][]) wy2.m33407B(iArr3[i17], i18);
            strArr[i17] = mu3Arr[i17].mo16493s();
            iArr6[i17] = mu3Arr[i17].mo16557a();
            i17++;
            i4 = 2;
        }
        y44 y44 = new y44(strArr, iArr6, uj0Arr, iArr4, iArr3, new uj0((xh0[]) wy2.m33407B(xh0Arr[2], iArr2[2])));
        Pair<nu3[], h44[]> f = mo21424f(y44, iArr3, iArr4, f24, bg0);
        h44[] h44Arr = (h44[]) f.second;
        d43 d43 = new d43();
        for (int i19 = 0; i19 < 2; i19++) {
            uj0 c2 = y44.mo22168c(i19);
            h44 h44 = h44Arr[i19];
            for (int i20 = 0; i20 < c2.f24343a; i20++) {
                xh0 b2 = c2.mo21275b(i20);
                int i21 = b2.f25828a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                char c3 = 0;
                while (true) {
                    int i22 = b2.f25828a;
                    if (c3 > 0) {
                        break;
                    }
                    iArr7[0] = y44.mo22167b(i19, i20, 0);
                    if (h44 != null && h44.f17527a == b2) {
                        int i23 = 0;
                        while (true) {
                            if (i23 >= h44.f17528b) {
                                break;
                            } else if (h44.f17529c[i23] != 0) {
                                i23++;
                            } else if (i23 != -1) {
                                c = 0;
                                z = true;
                            }
                        }
                        zArr[c] = z;
                        c3 = 1;
                    }
                    c = 0;
                    z = false;
                    zArr[c] = z;
                    c3 = 1;
                }
                d43.mo16855f(new bt0(b2, iArr7, y44.mo22166a(i19), zArr));
            }
        }
        uj0 d = y44.mo22169d();
        for (int i24 = 0; i24 < d.f24343a; i24++) {
            xh0 b3 = d.mo21275b(i24);
            int i25 = b3.f25828a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int a2 = C5463pw.m29197a(b3.mo22031b(0).f25133l);
            int i26 = b3.f25828a;
            d43.mo16855f(new bt0(b3, iArr8, a2, new boolean[1]));
        }
        return new c54((nu3[]) f.first, (h44[]) f.second, new au0(d43.mo16856g()), y44, (byte[]) null);
    }

    /* renamed from: b */
    public final void mo16074b(Object obj) {
        y44 y44 = (y44) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Pair<nu3[], h44[]> mo21424f(y44 y44, int[][][] iArr, int[] iArr2, f24 f24, bg0 bg0) throws ji3;
}
