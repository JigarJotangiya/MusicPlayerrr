package p082e.p099f.p100a;

import java.util.Arrays;
import p082e.p099f.p100a.C3481b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.f.a.a */
/* compiled from: ArrayLinkedVariables */
public class C3480a implements C3481b.C3482a {

    /* renamed from: l */
    private static float f11047l = 0.001f;

    /* renamed from: a */
    int f11048a = 0;

    /* renamed from: b */
    private final C3481b f11049b;

    /* renamed from: c */
    protected final C3483c f11050c;

    /* renamed from: d */
    private int f11051d = 8;

    /* renamed from: e */
    private C3493i f11052e = null;

    /* renamed from: f */
    private int[] f11053f = new int[8];

    /* renamed from: g */
    private int[] f11054g = new int[8];

    /* renamed from: h */
    private float[] f11055h = new float[8];

    /* renamed from: i */
    private int f11056i = -1;

    /* renamed from: j */
    private int f11057j = -1;

    /* renamed from: k */
    private boolean f11058k = false;

    C3480a(C3481b bVar, C3483c cVar) {
        this.f11049b = bVar;
        this.f11050c = cVar;
    }

    /* renamed from: a */
    public int mo12419a() {
        return this.f11048a;
    }

    /* renamed from: b */
    public boolean mo12420b(C3493i iVar) {
        int i = this.f11056i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            if (this.f11053f[i] == iVar.f11134i) {
                return true;
            }
            i = this.f11054g[i];
            i2++;
        }
        return false;
    }

    /* renamed from: c */
    public float mo12421c(C3481b bVar, boolean z) {
        float j = mo12429j(bVar.f11059a);
        mo12428i(bVar.f11059a, z);
        C3481b.C3482a aVar = bVar.f11063e;
        int a = aVar.mo12419a();
        for (int i = 0; i < a; i++) {
            C3493i e = aVar.mo12424e(i);
            mo12425f(e, aVar.mo12429j(e) * j, z);
        }
        return j;
    }

    public final void clear() {
        int i = this.f11056i;
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            C3493i iVar = this.f11050c.f11068d[this.f11053f[i]];
            if (iVar != null) {
                iVar.mo12499j(this.f11049b);
            }
            i = this.f11054g[i];
            i2++;
        }
        this.f11056i = -1;
        this.f11057j = -1;
        this.f11058k = false;
        this.f11048a = 0;
    }

    /* renamed from: d */
    public final void mo12423d(C3493i iVar, float f) {
        if (f == 0.0f) {
            mo12428i(iVar, true);
            return;
        }
        int i = this.f11056i;
        if (i == -1) {
            this.f11056i = 0;
            this.f11055h[0] = f;
            this.f11053f[0] = iVar.f11134i;
            this.f11054g[0] = -1;
            iVar.f11144s++;
            iVar.mo12496c(this.f11049b);
            this.f11048a++;
            if (!this.f11058k) {
                int i2 = this.f11057j + 1;
                this.f11057j = i2;
                int[] iArr = this.f11053f;
                if (i2 >= iArr.length) {
                    this.f11058k = true;
                    this.f11057j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f11048a) {
            int[] iArr2 = this.f11053f;
            int i5 = iArr2[i];
            int i6 = iVar.f11134i;
            if (i5 == i6) {
                this.f11055h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f11054g[i];
            i3++;
        }
        int i7 = this.f11057j;
        int i8 = i7 + 1;
        if (this.f11058k) {
            int[] iArr3 = this.f11053f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f11053f;
        if (i7 >= iArr4.length && this.f11048a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f11053f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f11053f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f11051d * 2;
            this.f11051d = i10;
            this.f11058k = false;
            this.f11057j = i7 - 1;
            this.f11055h = Arrays.copyOf(this.f11055h, i10);
            this.f11053f = Arrays.copyOf(this.f11053f, this.f11051d);
            this.f11054g = Arrays.copyOf(this.f11054g, this.f11051d);
        }
        this.f11053f[i7] = iVar.f11134i;
        this.f11055h[i7] = f;
        if (i4 != -1) {
            int[] iArr7 = this.f11054g;
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            this.f11054g[i7] = this.f11056i;
            this.f11056i = i7;
        }
        iVar.f11144s++;
        iVar.mo12496c(this.f11049b);
        int i11 = this.f11048a + 1;
        this.f11048a = i11;
        if (!this.f11058k) {
            this.f11057j++;
        }
        int[] iArr8 = this.f11053f;
        if (i11 >= iArr8.length) {
            this.f11058k = true;
        }
        if (this.f11057j >= iArr8.length) {
            this.f11058k = true;
            this.f11057j = iArr8.length - 1;
        }
    }

    /* renamed from: e */
    public C3493i mo12424e(int i) {
        int i2 = this.f11056i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f11048a) {
            if (i3 == i) {
                return this.f11050c.f11068d[this.f11053f[i2]];
            }
            i2 = this.f11054g[i2];
            i3++;
        }
        return null;
    }

    /* renamed from: f */
    public void mo12425f(C3493i iVar, float f, boolean z) {
        float f2 = f11047l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f11056i;
            if (i == -1) {
                this.f11056i = 0;
                this.f11055h[0] = f;
                this.f11053f[0] = iVar.f11134i;
                this.f11054g[0] = -1;
                iVar.f11144s++;
                iVar.mo12496c(this.f11049b);
                this.f11048a++;
                if (!this.f11058k) {
                    int i2 = this.f11057j + 1;
                    this.f11057j = i2;
                    int[] iArr = this.f11053f;
                    if (i2 >= iArr.length) {
                        this.f11058k = true;
                        this.f11057j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f11048a) {
                int[] iArr2 = this.f11053f;
                int i5 = iArr2[i];
                int i6 = iVar.f11134i;
                if (i5 == i6) {
                    float[] fArr = this.f11055h;
                    float f3 = fArr[i] + f;
                    float f4 = f11047l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f11056i) {
                            this.f11056i = this.f11054g[i];
                        } else {
                            int[] iArr3 = this.f11054g;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo12499j(this.f11049b);
                        }
                        if (this.f11058k) {
                            this.f11057j = i;
                        }
                        iVar.f11144s--;
                        this.f11048a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f11054g[i];
                i3++;
            }
            int i7 = this.f11057j;
            int i8 = i7 + 1;
            if (this.f11058k) {
                int[] iArr4 = this.f11053f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f11053f;
            if (i7 >= iArr5.length && this.f11048a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f11053f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f11053f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f11051d * 2;
                this.f11051d = i10;
                this.f11058k = false;
                this.f11057j = i7 - 1;
                this.f11055h = Arrays.copyOf(this.f11055h, i10);
                this.f11053f = Arrays.copyOf(this.f11053f, this.f11051d);
                this.f11054g = Arrays.copyOf(this.f11054g, this.f11051d);
            }
            this.f11053f[i7] = iVar.f11134i;
            this.f11055h[i7] = f;
            if (i4 != -1) {
                int[] iArr8 = this.f11054g;
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                this.f11054g[i7] = this.f11056i;
                this.f11056i = i7;
            }
            iVar.f11144s++;
            iVar.mo12496c(this.f11049b);
            this.f11048a++;
            if (!this.f11058k) {
                this.f11057j++;
            }
            int i11 = this.f11057j;
            int[] iArr9 = this.f11053f;
            if (i11 >= iArr9.length) {
                this.f11058k = true;
                this.f11057j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: g */
    public void mo12426g() {
        int i = this.f11056i;
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            float[] fArr = this.f11055h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f11054g[i];
            i2++;
        }
    }

    /* renamed from: h */
    public float mo12427h(int i) {
        int i2 = this.f11056i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f11048a) {
            if (i3 == i) {
                return this.f11055h[i2];
            }
            i2 = this.f11054g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final float mo12428i(C3493i iVar, boolean z) {
        if (this.f11052e == iVar) {
            this.f11052e = null;
        }
        int i = this.f11056i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f11048a) {
            if (this.f11053f[i] == iVar.f11134i) {
                if (i == this.f11056i) {
                    this.f11056i = this.f11054g[i];
                } else {
                    int[] iArr = this.f11054g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo12499j(this.f11049b);
                }
                iVar.f11144s--;
                this.f11048a--;
                this.f11053f[i] = -1;
                if (this.f11058k) {
                    this.f11057j = i;
                }
                return this.f11055h[i];
            }
            i2++;
            i3 = i;
            i = this.f11054g[i];
        }
        return 0.0f;
    }

    /* renamed from: j */
    public final float mo12429j(C3493i iVar) {
        int i = this.f11056i;
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            if (this.f11053f[i] == iVar.f11134i) {
                return this.f11055h[i];
            }
            i = this.f11054g[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: k */
    public void mo12430k(float f) {
        int i = this.f11056i;
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            float[] fArr = this.f11055h;
            fArr[i] = fArr[i] / f;
            i = this.f11054g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f11056i;
        String str = BuildConfig.FLAVOR;
        int i2 = 0;
        while (i != -1 && i2 < this.f11048a) {
            str = ((str + " -> ") + this.f11055h[i] + " : ") + this.f11050c.f11068d[this.f11053f[i]];
            i = this.f11054g[i];
            i2++;
        }
        return str;
    }
}
