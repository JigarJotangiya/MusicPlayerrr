package p082e.p099f.p100a;

import java.util.Arrays;
import p082e.p099f.p100a.C3481b;

/* renamed from: e.f.a.j */
/* compiled from: SolverVariableValues */
public class C3495j implements C3481b.C3482a {

    /* renamed from: m */
    private static float f11149m = 0.001f;

    /* renamed from: a */
    private int f11150a = 16;

    /* renamed from: b */
    private int f11151b = 16;

    /* renamed from: c */
    int[] f11152c = new int[16];

    /* renamed from: d */
    int[] f11153d = new int[16];

    /* renamed from: e */
    int[] f11154e = new int[16];

    /* renamed from: f */
    float[] f11155f = new float[16];

    /* renamed from: g */
    int[] f11156g = new int[16];

    /* renamed from: h */
    int[] f11157h = new int[16];

    /* renamed from: i */
    int f11158i = 0;

    /* renamed from: j */
    int f11159j = -1;

    /* renamed from: k */
    private final C3481b f11160k;

    /* renamed from: l */
    protected final C3483c f11161l;

    C3495j(C3481b bVar, C3483c cVar) {
        this.f11160k = bVar;
        this.f11161l = cVar;
        clear();
    }

    /* renamed from: l */
    private void m14968l(C3493i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f11134i % this.f11151b;
        int[] iArr2 = this.f11152c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f11153d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f11153d[i] = -1;
    }

    /* renamed from: m */
    private void m14969m(int i, C3493i iVar, float f) {
        this.f11154e[i] = iVar.f11134i;
        this.f11155f[i] = f;
        this.f11156g[i] = -1;
        this.f11157h[i] = -1;
        iVar.mo12496c(this.f11160k);
        iVar.f11144s++;
        this.f11158i++;
    }

    /* renamed from: n */
    private int m14970n() {
        for (int i = 0; i < this.f11150a; i++) {
            if (this.f11154e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m14971o() {
        int i = this.f11150a * 2;
        this.f11154e = Arrays.copyOf(this.f11154e, i);
        this.f11155f = Arrays.copyOf(this.f11155f, i);
        this.f11156g = Arrays.copyOf(this.f11156g, i);
        this.f11157h = Arrays.copyOf(this.f11157h, i);
        this.f11153d = Arrays.copyOf(this.f11153d, i);
        for (int i2 = this.f11150a; i2 < i; i2++) {
            this.f11154e[i2] = -1;
            this.f11153d[i2] = -1;
        }
        this.f11150a = i;
    }

    /* renamed from: q */
    private void m14972q(int i, C3493i iVar, float f) {
        int n = m14970n();
        m14969m(n, iVar, f);
        if (i != -1) {
            this.f11156g[n] = i;
            int[] iArr = this.f11157h;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f11156g[n] = -1;
            if (this.f11158i > 0) {
                this.f11157h[n] = this.f11159j;
                this.f11159j = n;
            } else {
                this.f11157h[n] = -1;
            }
        }
        int[] iArr2 = this.f11157h;
        if (iArr2[n] != -1) {
            this.f11156g[iArr2[n]] = n;
        }
        m14968l(iVar, n);
    }

    /* renamed from: r */
    private void m14973r(C3493i iVar) {
        int[] iArr;
        int i = iVar.f11134i;
        int i2 = i % this.f11151b;
        int[] iArr2 = this.f11152c;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f11154e[i3] == i) {
                int[] iArr3 = this.f11153d;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f11153d;
                if (iArr[i3] == -1 || this.f11154e[iArr[i3]] == i) {
                    int i4 = iArr[i3];
                } else {
                    i3 = iArr[i3];
                }
            }
            int i42 = iArr[i3];
            if (i42 != -1 && this.f11154e[i42] == i) {
                iArr[i3] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }

    /* renamed from: a */
    public int mo12419a() {
        return this.f11158i;
    }

    /* renamed from: b */
    public boolean mo12420b(C3493i iVar) {
        return mo12505p(iVar) != -1;
    }

    /* renamed from: c */
    public float mo12421c(C3481b bVar, boolean z) {
        float j = mo12429j(bVar.f11059a);
        mo12428i(bVar.f11059a, z);
        C3495j jVar = (C3495j) bVar.f11063e;
        int a = jVar.mo12419a();
        int i = jVar.f11159j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < a) {
            int[] iArr = jVar.f11154e;
            if (iArr[i3] != -1) {
                mo12425f(this.f11161l.f11068d[iArr[i3]], jVar.f11155f[i3] * j, z);
                i2++;
            }
            i3++;
        }
        return j;
    }

    public void clear() {
        int i = this.f11158i;
        for (int i2 = 0; i2 < i; i2++) {
            C3493i e = mo12424e(i2);
            if (e != null) {
                e.mo12499j(this.f11160k);
            }
        }
        for (int i3 = 0; i3 < this.f11150a; i3++) {
            this.f11154e[i3] = -1;
            this.f11153d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f11151b; i4++) {
            this.f11152c[i4] = -1;
        }
        this.f11158i = 0;
        this.f11159j = -1;
    }

    /* renamed from: d */
    public void mo12423d(C3493i iVar, float f) {
        float f2 = f11149m;
        if (f <= (-f2) || f >= f2) {
            if (this.f11158i == 0) {
                m14969m(0, iVar, f);
                m14968l(iVar, 0);
                this.f11159j = 0;
                return;
            }
            int p = mo12505p(iVar);
            if (p != -1) {
                this.f11155f[p] = f;
                return;
            }
            if (this.f11158i + 1 >= this.f11150a) {
                m14971o();
            }
            int i = this.f11158i;
            int i2 = this.f11159j;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f11154e;
                int i5 = iArr[i2];
                int i6 = iVar.f11134i;
                if (i5 == i6) {
                    this.f11155f[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f11157h[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m14972q(i3, iVar, f);
            return;
        }
        mo12428i(iVar, true);
    }

    /* renamed from: e */
    public C3493i mo12424e(int i) {
        int i2 = this.f11158i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f11159j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f11161l.f11068d[this.f11154e[i3]];
            }
            i3 = this.f11157h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void mo12425f(C3493i iVar, float f, boolean z) {
        float f2 = f11149m;
        if (f <= (-f2) || f >= f2) {
            int p = mo12505p(iVar);
            if (p == -1) {
                mo12423d(iVar, f);
                return;
            }
            float[] fArr = this.f11155f;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = f11149m;
            if (f3 > (-f4) && fArr[p] < f4) {
                fArr[p] = 0.0f;
                mo12428i(iVar, z);
            }
        }
    }

    /* renamed from: g */
    public void mo12426g() {
        int i = this.f11158i;
        int i2 = this.f11159j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f11155f;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f11157h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public float mo12427h(int i) {
        int i2 = this.f11158i;
        int i3 = this.f11159j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f11155f[i3];
            }
            i3 = this.f11157h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    /* renamed from: i */
    public float mo12428i(C3493i iVar, boolean z) {
        int p = mo12505p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m14973r(iVar);
        float f = this.f11155f[p];
        if (this.f11159j == p) {
            this.f11159j = this.f11157h[p];
        }
        this.f11154e[p] = -1;
        int[] iArr = this.f11156g;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f11157h;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f11157h;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f11158i--;
        iVar.f11144s--;
        if (z) {
            iVar.mo12499j(this.f11160k);
        }
        return f;
    }

    /* renamed from: j */
    public float mo12429j(C3493i iVar) {
        int p = mo12505p(iVar);
        if (p != -1) {
            return this.f11155f[p];
        }
        return 0.0f;
    }

    /* renamed from: k */
    public void mo12430k(float f) {
        int i = this.f11158i;
        int i2 = this.f11159j;
        int i3 = 0;
        while (i3 < i) {
            float[] fArr = this.f11155f;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f11157h[i2];
            if (i2 != -1) {
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public int mo12505p(C3493i iVar) {
        int[] iArr;
        if (!(this.f11158i == 0 || iVar == null)) {
            int i = iVar.f11134i;
            int i2 = this.f11152c[i % this.f11151b];
            if (i2 == -1) {
                return -1;
            }
            if (this.f11154e[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f11153d;
                if (iArr[i2] != -1 && this.f11154e[iArr[i2]] != i) {
                    i2 = iArr[i2];
                }
            }
            if (iArr[i2] != -1 && this.f11154e[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.f11158i;
        for (int i2 = 0; i2 < i; i2++) {
            C3493i e = mo12424e(i2);
            if (e != null) {
                String str4 = str3 + e + " = " + mo12427h(i2) + " ";
                int p = mo12505p(e);
                String str5 = str4 + "[p: ";
                if (this.f11156g[p] != -1) {
                    str = str5 + this.f11161l.f11068d[this.f11154e[this.f11156g[p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f11157h[p] != -1) {
                    str2 = str6 + this.f11161l.f11068d[this.f11154e[this.f11157h[p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
