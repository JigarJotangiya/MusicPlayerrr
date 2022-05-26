package p394k.p395c0;

import p369i.p387z.p389d.C8594l;
import p394k.C8621b;
import p394k.C8633e;
import p394k.C8648q;
import p394k.C8656v;

/* renamed from: k.c0.a */
/* compiled from: Buffer.kt */
public final class C8625a {

    /* renamed from: a */
    private static final byte[] f34958a = C8621b.m46811a("0123456789abcdef");

    /* renamed from: a */
    public static final byte[] m46828a() {
        return f34958a;
    }

    /* renamed from: b */
    public static final boolean m46829b(C8656v vVar, int i, byte[] bArr, int i2, int i3) {
        C8594l.m46771e(vVar, "segment");
        C8594l.m46771e(bArr, "bytes");
        int i4 = vVar.f35014c;
        byte[] bArr2 = vVar.f35012a;
        while (i2 < i3) {
            if (i == i4) {
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                byte[] bArr3 = vVar.f35012a;
                int i5 = vVar.f35013b;
                bArr2 = bArr3;
                i = i5;
                i4 = vVar.f35014c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: c */
    public static final String m46830c(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "$this$readUtf8Line");
        if (j > 0) {
            long j2 = j - 1;
            if (eVar.mo30718n0(j2) == ((byte) 13)) {
                String R0 = eVar.mo30683R0(j2);
                eVar.mo30715j(2);
                return R0;
            }
        }
        String R02 = eVar.mo30683R0(j);
        eVar.mo30715j(1);
        return R02;
    }

    /* renamed from: d */
    public static final int m46831d(C8633e eVar, C8648q qVar, boolean z) {
        int i;
        int i2;
        int i3;
        C8656v vVar;
        int i4;
        C8633e eVar2 = eVar;
        C8594l.m46771e(eVar2, "$this$selectPrefix");
        C8594l.m46771e(qVar, "options");
        C8656v vVar2 = eVar2.f34971g;
        if (vVar2 != null) {
            byte[] bArr = vVar2.f35012a;
            int i5 = vVar2.f35013b;
            int i6 = vVar2.f35014c;
            int[] u = qVar.mo30818u();
            C8656v vVar3 = vVar2;
            int i7 = 0;
            int i8 = -1;
            loop0:
            while (true) {
                int i9 = i7 + 1;
                int i10 = u[i7];
                int i11 = i9 + 1;
                int i12 = u[i9];
                if (i12 != -1) {
                    i8 = i12;
                }
                if (vVar3 == null) {
                    break;
                }
                if (i10 < 0) {
                    int i13 = i11 + (i10 * -1);
                    while (true) {
                        int i14 = i5 + 1;
                        int i15 = i11 + 1;
                        if ((bArr[i5] & 255) != u[i11]) {
                            return i8;
                        }
                        boolean z2 = i15 == i13;
                        if (i14 == i6) {
                            C8594l.m46769c(vVar3);
                            C8656v vVar4 = vVar3.f35017f;
                            C8594l.m46769c(vVar4);
                            i4 = vVar4.f35013b;
                            byte[] bArr2 = vVar4.f35012a;
                            i3 = vVar4.f35014c;
                            if (vVar4 != vVar2) {
                                byte[] bArr3 = bArr2;
                                vVar = vVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                vVar = null;
                            }
                        } else {
                            C8656v vVar5 = vVar3;
                            i3 = i6;
                            i4 = i14;
                            vVar = vVar5;
                        }
                        if (z2) {
                            i2 = u[i15];
                            i = i4;
                            i6 = i3;
                            vVar3 = vVar;
                            break;
                        }
                        i5 = i4;
                        i6 = i3;
                        i11 = i15;
                        vVar3 = vVar;
                    }
                } else {
                    i = i5 + 1;
                    byte b = bArr[i5] & 255;
                    int i16 = i11 + i10;
                    while (i11 != i16) {
                        if (b == u[i11]) {
                            i2 = u[i11 + i10];
                            if (i == i6) {
                                vVar3 = vVar3.f35017f;
                                C8594l.m46769c(vVar3);
                                i = vVar3.f35013b;
                                bArr = vVar3.f35012a;
                                i6 = vVar3.f35014c;
                                if (vVar3 == vVar2) {
                                    vVar3 = null;
                                }
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i8;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i7 = -i2;
                i5 = i;
            }
            if (z) {
                return -2;
            }
            return i8;
        } else if (z) {
            return -2;
        } else {
            return -1;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ int m46832e(C8633e eVar, C8648q qVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m46831d(eVar, qVar, z);
    }
}
