package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class C5340mk extends C5488qk {

    /* renamed from: b */
    private final SparseArray<Map<C4969ck, C5303lk>> f20060b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f20061c = new SparseBooleanArray();

    /* renamed from: a */
    public final C5525rk mo19398a(C5556se[] seVarArr, C4969ck ckVar) throws C5778yd {
        C5303lk lkVar;
        int[] iArr;
        C5556se[] seVarArr2 = seVarArr;
        C4969ck ckVar2 = ckVar;
        int[] iArr2 = new int[3];
        C4932bk[][] bkVarArr = new C4932bk[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = ckVar2.f14995a;
            bkVarArr[i] = new C4932bk[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            seVarArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < ckVar2.f14995a) {
            C4932bk b = ckVar2.mo16650b(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                C5556se seVar = seVarArr2[i6];
                int i9 = 0;
                while (true) {
                    int i10 = b.f14501a;
                    if (i9 > 0) {
                        break;
                    }
                    int f = seVar.mo18371f(b.mo16252b(i9)) & 3;
                    if (f > i7) {
                        if (f == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = f;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = b.f14501a;
                iArr = new int[1];
            } else {
                C5556se seVar2 = seVarArr2[i6];
                int i12 = b.f14501a;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = b.f14501a;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = seVar2.mo18371f(b.mo16252b(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i6];
            bkVarArr[i6][i15] = b;
            iArr3[i6][i15] = iArr;
            iArr2[i6] = i15 + 1;
            i5++;
            i3 = 2;
        }
        C4969ck[] ckVarArr = new C4969ck[2];
        int[] iArr6 = new int[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = iArr2[i16];
            ckVarArr[i16] = new C4969ck((C4932bk[]) Arrays.copyOf(bkVarArr[i16], i18));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i18);
            iArr6[i16] = seVarArr2[i16].mo20835b();
            i16++;
        }
        C4969ck ckVar3 = new C4969ck((C4932bk[]) Arrays.copyOf(bkVarArr[2], iArr2[2]));
        C5118gk[] e = mo18387e(seVarArr2, ckVarArr, iArr3);
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            if (this.f20061c.get(i19)) {
                e[i19] = null;
            } else {
                C4969ck ckVar4 = ckVarArr[i19];
                Map map = this.f20060b.get(i19);
                if (map == null) {
                    lkVar = null;
                } else {
                    lkVar = (C5303lk) map.get(ckVar4);
                }
                if (lkVar != null) {
                    throw null;
                }
            }
            i19++;
        }
        C5266kk kkVar = new C5266kk(iArr6, ckVarArr, iArr4, iArr3, ckVar3);
        C5593te[] teVarArr = new C5593te[2];
        for (int i21 = 0; i21 < 2; i21++) {
            teVarArr[i21] = e[i21] != null ? C5593te.f23832b : null;
        }
        return new C5525rk(ckVar2, new C5414ok(e, (byte[]) null), kkVar, teVarArr);
    }

    /* renamed from: b */
    public final void mo19399b(Object obj) {
        C5266kk kkVar = (C5266kk) obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C5118gk[] mo18387e(C5556se[] seVarArr, C4969ck[] ckVarArr, int[][][] iArr) throws C5778yd;

    /* renamed from: f */
    public final void mo19400f(int i, boolean z) {
        if (this.f20061c.get(i) != z) {
            this.f20061c.put(i, z);
            mo20457d();
        }
    }
}
