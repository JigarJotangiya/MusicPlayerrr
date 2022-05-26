package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.ik */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5192ik extends C5340mk {

    /* renamed from: d */
    private final AtomicReference<C5155hk> f18059d = new AtomicReference<>(new C5155hk());

    public C5192ik(C5377nk nkVar) {
    }

    /* renamed from: g */
    protected static boolean m25245g(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    /* renamed from: h */
    private static int m25246h(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C5118gk[] mo18387e(C5556se[] seVarArr, C4969ck[] ckVarArr, int[][][] iArr) throws C5778yd {
        C5229jk jkVar;
        C5229jk jkVar2;
        int[] iArr2;
        ArrayList arrayList;
        C4932bk bkVar;
        boolean z;
        int i;
        int i2;
        int i3 = 2;
        C5118gk[] gkVarArr = new C5118gk[2];
        C5155hk hkVar = this.f18059d.get();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (seVarArr[i4].mo20835b() == i3) {
                if (!z2) {
                    C5556se seVar = seVarArr[i4];
                    C4969ck ckVar = ckVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = hkVar.f17680d;
                    int i7 = hkVar.f17681e;
                    int i8 = hkVar.f17682f;
                    boolean z3 = hkVar.f17679c;
                    boolean z4 = hkVar.f17678b;
                    int i9 = hkVar.f17685i;
                    int i10 = hkVar.f17686j;
                    boolean z5 = hkVar.f17687k;
                    boolean z6 = hkVar.f17683g;
                    boolean z7 = hkVar.f17684h;
                    int i11 = 0;
                    C4932bk bkVar2 = null;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = -1;
                    int i15 = -1;
                    while (i11 < ckVar.f14995a) {
                        C4932bk b = ckVar.mo16650b(i11);
                        int i16 = b.f14501a;
                        ArrayList arrayList2 = new ArrayList(i5);
                        int i17 = 0;
                        while (true) {
                            int i18 = b.f14501a;
                            if (i17 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i17));
                            i17++;
                        }
                        int[] iArr4 = iArr3[i11];
                        int i19 = i15;
                        int i20 = 0;
                        while (true) {
                            int i21 = b.f14501a;
                            if (i20 > 0) {
                                break;
                            }
                            C4969ck ckVar2 = ckVar;
                            if (m25245g(iArr4[i20], true)) {
                                zzapg b2 = b.mo16252b(i20);
                                if (arrayList2.contains(Integer.valueOf(i20))) {
                                    int i22 = b2.f27130p;
                                    int i23 = b2.f27131q;
                                    int i24 = b2.f27122h;
                                    bkVar = b;
                                    z = true;
                                } else {
                                    bkVar = b;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean g = m25245g(iArr4[i20], false);
                                if (g) {
                                    i += 1000;
                                }
                                boolean z8 = i > i13;
                                if (i == i13) {
                                    if (b2.mo22480a() != i19) {
                                        i2 = m25246h(b2.mo22480a(), i19);
                                    } else {
                                        i2 = m25246h(b2.f27122h, i14);
                                    }
                                    z8 = !g || !z ? i2 < 0 : i2 > 0;
                                }
                                if (z8) {
                                    i14 = b2.f27122h;
                                    i19 = b2.mo22480a();
                                    i13 = i;
                                    i12 = i20;
                                    bkVar2 = bkVar;
                                }
                            } else {
                                bkVar = b;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i20++;
                            ckVar = ckVar2;
                            b = bkVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        C4969ck ckVar3 = ckVar;
                        i11++;
                        i15 = i19;
                        i5 = 1;
                    }
                    if (bkVar2 == null) {
                        jkVar2 = null;
                    } else {
                        jkVar2 = new C5229jk(bkVar2, i12, 0, (Object) null);
                    }
                    gkVarArr[i4] = jkVar2;
                    z2 = jkVar2 != null;
                }
                int i25 = ckVarArr[i4].f14995a;
            }
            i4++;
            i3 = 2;
        }
        int i26 = 0;
        boolean z9 = false;
        while (i26 < i3) {
            if (seVarArr[i26].mo20835b() == 1 && !z9) {
                C4969ck ckVar4 = ckVarArr[i26];
                int[][] iArr5 = iArr[i26];
                String str = hkVar.f17677a;
                boolean z10 = hkVar.f17684h;
                boolean z11 = hkVar.f17678b;
                int i27 = -1;
                int i28 = -1;
                int i29 = 0;
                int i30 = 0;
                while (i29 < ckVar4.f14995a) {
                    C4932bk b3 = ckVar4.mo16650b(i29);
                    int[] iArr6 = iArr5[i29];
                    int i31 = i30;
                    int i32 = i28;
                    int i33 = i27;
                    int i34 = 0;
                    while (true) {
                        int i35 = b3.f14501a;
                        if (i34 > 0) {
                            break;
                        }
                        if (m25245g(iArr6[i34], true)) {
                            zzapg b4 = b3.mo16252b(i34);
                            int i36 = iArr6[i34];
                            int i37 = 1 != (b4.f27117D & 1) ? 1 : 2;
                            if (m25245g(i36, false)) {
                                i37 += 1000;
                            }
                            if (i37 > i31) {
                                i32 = i34;
                                i33 = i29;
                                i31 = i37;
                            }
                        }
                        i34++;
                    }
                    i29++;
                    i27 = i33;
                    i28 = i32;
                    i30 = i31;
                }
                if (i27 == -1) {
                    jkVar = null;
                } else {
                    jkVar = new C5229jk(ckVar4.mo16650b(i27), i28, 0, (Object) null);
                }
                gkVarArr[i26] = jkVar;
                z9 = jkVar != null;
            }
            i26++;
            i3 = 2;
        }
        return gkVarArr;
    }
}
