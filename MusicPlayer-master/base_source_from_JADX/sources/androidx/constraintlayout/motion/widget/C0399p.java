package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.C0424a;
import androidx.constraintlayout.widget.C0430c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p082e.p099f.p100a.p101k.p102a.C3500c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
/* compiled from: MotionPaths */
class C0399p implements Comparable<C0399p> {

    /* renamed from: x */
    static String[] f1896x = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: g */
    C3500c f1897g;

    /* renamed from: h */
    int f1898h = 0;

    /* renamed from: i */
    float f1899i;

    /* renamed from: j */
    float f1900j;

    /* renamed from: k */
    float f1901k;

    /* renamed from: l */
    float f1902l;

    /* renamed from: m */
    float f1903m;

    /* renamed from: n */
    float f1904n;

    /* renamed from: o */
    float f1905o = Float.NaN;

    /* renamed from: p */
    int f1906p;

    /* renamed from: q */
    int f1907q;

    /* renamed from: r */
    float f1908r;

    /* renamed from: s */
    C0396n f1909s;

    /* renamed from: t */
    LinkedHashMap<String, C0424a> f1910t;

    /* renamed from: u */
    int f1911u;

    /* renamed from: v */
    double[] f1912v;

    /* renamed from: w */
    double[] f1913w;

    public C0399p() {
        int i = C0382e.f1738f;
        this.f1906p = i;
        this.f1907q = i;
        this.f1908r = Float.NaN;
        this.f1909s = null;
        this.f1910t = new LinkedHashMap<>();
        this.f1911u = 0;
        this.f1912v = new double[18];
        this.f1913w = new double[18];
    }

    /* renamed from: h */
    private boolean m2469h(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: A */
    public void mo2606A(C0396n nVar, C0399p pVar) {
        double d = (double) (((this.f1901k + (this.f1903m / 2.0f)) - pVar.f1901k) - (pVar.f1903m / 2.0f));
        double d2 = (double) (((this.f1902l + (this.f1904n / 2.0f)) - pVar.f1902l) - (pVar.f1904n / 2.0f));
        this.f1909s = nVar;
        this.f1901k = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f1908r)) {
            this.f1902l = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f1902l = (float) Math.toRadians((double) this.f1908r);
        }
    }

    /* renamed from: c */
    public void mo2607c(C0430c.C0431a aVar) {
        this.f1897g = C3500c.m15017c(aVar.f2328d.f2417d);
        C0430c.C0434c cVar = aVar.f2328d;
        this.f1906p = cVar.f2418e;
        this.f1907q = cVar.f2415b;
        this.f1905o = cVar.f2422i;
        this.f1898h = cVar.f2419f;
        int i = cVar.f2416c;
        float f = aVar.f2327c.f2432e;
        this.f1908r = aVar.f2329e.f2347B;
        for (String next : aVar.f2331g.keySet()) {
            C0424a aVar2 = aVar.f2331g.get(next);
            if (aVar2 != null && aVar2.mo2935g()) {
                this.f1910t.put(next, aVar2);
            }
        }
    }

    /* renamed from: d */
    public int compareTo(C0399p pVar) {
        return Float.compare(this.f1900j, pVar.f1900j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2610j(C0399p pVar, boolean[] zArr, String[] strArr, boolean z) {
        boolean h = m2469h(this.f1901k, pVar.f1901k);
        boolean h2 = m2469h(this.f1902l, pVar.f1902l);
        zArr[0] = zArr[0] | m2469h(this.f1900j, pVar.f1900j);
        boolean z2 = h | h2 | z;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | m2469h(this.f1903m, pVar.f1903m);
        zArr[4] = m2469h(this.f1904n, pVar.f1904n) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2611k(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1900j, this.f1901k, this.f1902l, this.f1903m, this.f1904n, this.f1905o};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < 6) {
                dArr[i] = (double) fArr[iArr[i2]];
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2612l(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f1901k;
        float f2 = this.f1902l;
        float f3 = this.f1903m;
        float f4 = this.f1904n;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C0396n nVar = this.f1909s;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.mo2590i(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) ((d2 + (Math.sin(d4) * d3)) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (d3 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2613o(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        int[] iArr2 = iArr;
        float f2 = this.f1901k;
        float f3 = this.f1902l;
        float f4 = this.f1903m;
        float f5 = this.f1904n;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f2 = f10;
                f6 = f11;
            } else if (i2 == 2) {
                f3 = f10;
                f8 = f11;
            } else if (i2 == 3) {
                f4 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f5 = f10;
                f9 = f11;
            }
        }
        float f12 = 2.0f;
        float f13 = (f7 / 2.0f) + f6;
        float f14 = (f9 / 2.0f) + f8;
        C0396n nVar = this.f1909s;
        if (nVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            nVar.mo2590i(d, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            double d2 = (double) f2;
            float f18 = fArr4[1];
            double d3 = (double) f3;
            f = f4;
            double d4 = (double) f6;
            double d5 = (double) f8;
            float sin = (float) (((double) f17) + (Math.sin(d3) * d4) + (Math.cos(d3) * d5));
            f14 = (float) ((((double) f18) - (d4 * Math.cos(d3))) + (Math.sin(d3) * d5));
            f13 = sin;
            f2 = (float) ((((double) f15) + (Math.sin(d3) * d2)) - ((double) (f4 / 2.0f)));
            f3 = (float) ((((double) f16) - (d2 * Math.cos(d3))) - ((double) (f5 / 2.0f)));
            f12 = 2.0f;
        } else {
            f = f4;
        }
        fArr[0] = f2 + (f / f12) + 0.0f;
        fArr[1] = f3 + (f5 / f12) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = f14;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo2614p(String str, double[] dArr, int i) {
        C0424a aVar = this.f1910t.get(str);
        int i2 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.mo2936h() == 1) {
            dArr[i] = (double) aVar.mo2933e();
            return 1;
        }
        int h = aVar.mo2936h();
        float[] fArr = new float[h];
        aVar.mo2934f(fArr);
        while (i2 < h) {
            dArr[i] = (double) fArr[i2];
            i2++;
            i++;
        }
        return h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo2615q(String str) {
        C0424a aVar = this.f1910t.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.mo2936h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2616r(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1901k;
        float f2 = this.f1902l;
        float f3 = this.f1903m;
        float f4 = this.f1904n;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C0396n nVar = this.f1909s;
        if (nVar != null) {
            float j = nVar.mo2591j();
            double d = (double) f;
            double d2 = (double) f2;
            f2 = (float) ((((double) this.f1909s.mo2592k()) - (d * Math.cos(d2))) - ((double) (f4 / 2.0f)));
            f = (float) ((((double) j) + (Math.sin(d2) * d)) - ((double) (f3 / 2.0f)));
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo2617s(String str) {
        return this.f1910t.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2618t(C0388i iVar, C0399p pVar, C0399p pVar2) {
        C0388i iVar2 = iVar;
        C0399p pVar3 = pVar;
        C0399p pVar4 = pVar2;
        float f = ((float) iVar2.f1739a) / 100.0f;
        this.f1899i = f;
        this.f1898h = iVar2.f1787j;
        float f2 = Float.isNaN(iVar2.f1788k) ? f : iVar2.f1788k;
        float f3 = Float.isNaN(iVar2.f1789l) ? f : iVar2.f1789l;
        float f4 = pVar4.f1903m;
        float f5 = pVar3.f1903m;
        float f6 = pVar4.f1904n;
        float f7 = pVar3.f1904n;
        this.f1900j = this.f1899i;
        float f8 = pVar3.f1901k;
        float f9 = pVar3.f1902l;
        float f10 = (pVar4.f1901k + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (pVar4.f1902l + (f6 / 2.0f)) - (f9 + (f7 / 2.0f));
        float f12 = (f4 - f5) * f2;
        float f13 = f12 / 2.0f;
        this.f1901k = (float) ((int) ((f8 + (f10 * f)) - f13));
        float f14 = (f6 - f7) * f3;
        float f15 = f14 / 2.0f;
        this.f1902l = (float) ((int) ((f9 + (f11 * f)) - f15));
        this.f1903m = (float) ((int) (f5 + f12));
        this.f1904n = (float) ((int) (f7 + f14));
        C0388i iVar3 = iVar;
        float f16 = Float.isNaN(iVar3.f1790m) ? f : iVar3.f1790m;
        float f17 = 0.0f;
        float f18 = Float.isNaN(iVar3.f1793p) ? 0.0f : iVar3.f1793p;
        if (!Float.isNaN(iVar3.f1791n)) {
            f = iVar3.f1791n;
        }
        if (!Float.isNaN(iVar3.f1792o)) {
            f17 = iVar3.f1792o;
        }
        this.f1911u = 0;
        C0399p pVar5 = pVar;
        this.f1901k = (float) ((int) (((pVar5.f1901k + (f16 * f10)) + (f17 * f11)) - f13));
        this.f1902l = (float) ((int) (((pVar5.f1902l + (f10 * f18)) + (f11 * f)) - f15));
        this.f1897g = C3500c.m15017c(iVar3.f1785h);
        this.f1906p = iVar3.f1786i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2619u(C0388i iVar, C0399p pVar, C0399p pVar2) {
        C0388i iVar2 = iVar;
        C0399p pVar3 = pVar;
        C0399p pVar4 = pVar2;
        float f = ((float) iVar2.f1739a) / 100.0f;
        this.f1899i = f;
        this.f1898h = iVar2.f1787j;
        float f2 = Float.isNaN(iVar2.f1788k) ? f : iVar2.f1788k;
        float f3 = Float.isNaN(iVar2.f1789l) ? f : iVar2.f1789l;
        float f4 = pVar4.f1903m - pVar3.f1903m;
        float f5 = pVar4.f1904n - pVar3.f1904n;
        this.f1900j = this.f1899i;
        if (!Float.isNaN(iVar2.f1790m)) {
            f = iVar2.f1790m;
        }
        float f6 = pVar3.f1901k;
        float f7 = pVar3.f1903m;
        float f8 = pVar3.f1902l;
        float f9 = pVar3.f1904n;
        float f10 = (pVar4.f1901k + (pVar4.f1903m / 2.0f)) - ((f7 / 2.0f) + f6);
        float f11 = (pVar4.f1902l + (pVar4.f1904n / 2.0f)) - ((f9 / 2.0f) + f8);
        float f12 = f10 * f;
        float f13 = f4 * f2;
        float f14 = f13 / 2.0f;
        this.f1901k = (float) ((int) ((f6 + f12) - f14));
        float f15 = f * f11;
        float f16 = f5 * f3;
        float f17 = f16 / 2.0f;
        this.f1902l = (float) ((int) ((f8 + f15) - f17));
        this.f1903m = (float) ((int) (f7 + f13));
        this.f1904n = (float) ((int) (f9 + f16));
        C0388i iVar3 = iVar;
        float f18 = Float.isNaN(iVar3.f1791n) ? 0.0f : iVar3.f1791n;
        float f19 = (-f11) * f18;
        float f20 = f10 * f18;
        this.f1911u = 1;
        C0399p pVar5 = pVar;
        float f21 = (float) ((int) ((pVar5.f1901k + f12) - f14));
        this.f1901k = f21;
        float f22 = (float) ((int) ((pVar5.f1902l + f15) - f17));
        this.f1902l = f22;
        this.f1901k = f21 + f19;
        this.f1902l = f22 + f20;
        this.f1907q = this.f1907q;
        this.f1897g = C3500c.m15017c(iVar3.f1785h);
        this.f1906p = iVar3.f1786i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2620v(int i, int i2, C0388i iVar, C0399p pVar, C0399p pVar2) {
        float f;
        float f2;
        float f3 = ((float) iVar.f1739a) / 100.0f;
        this.f1899i = f3;
        this.f1898h = iVar.f1787j;
        this.f1911u = iVar.f1794q;
        float f4 = Float.isNaN(iVar.f1788k) ? f3 : iVar.f1788k;
        float f5 = Float.isNaN(iVar.f1789l) ? f3 : iVar.f1789l;
        float f6 = pVar2.f1903m;
        float f7 = pVar.f1903m;
        float f8 = pVar2.f1904n;
        float f9 = pVar.f1904n;
        this.f1900j = this.f1899i;
        this.f1903m = (float) ((int) (f7 + ((f6 - f7) * f4)));
        this.f1904n = (float) ((int) (f9 + ((f8 - f9) * f5)));
        int i3 = iVar.f1794q;
        if (i3 == 1) {
            float f10 = Float.isNaN(iVar.f1790m) ? f3 : iVar.f1790m;
            float f11 = pVar2.f1901k;
            float f12 = pVar.f1901k;
            this.f1901k = (f10 * (f11 - f12)) + f12;
            if (!Float.isNaN(iVar.f1791n)) {
                f3 = iVar.f1791n;
            }
            float f13 = pVar2.f1902l;
            float f14 = pVar.f1902l;
            this.f1902l = (f3 * (f13 - f14)) + f14;
        } else if (i3 != 2) {
            float f15 = Float.isNaN(iVar.f1790m) ? f3 : iVar.f1790m;
            float f16 = pVar2.f1901k;
            float f17 = pVar.f1901k;
            this.f1901k = (f15 * (f16 - f17)) + f17;
            if (!Float.isNaN(iVar.f1791n)) {
                f3 = iVar.f1791n;
            }
            float f18 = pVar2.f1902l;
            float f19 = pVar.f1902l;
            this.f1902l = (f3 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(iVar.f1790m)) {
                float f20 = pVar2.f1901k;
                float f21 = pVar.f1901k;
                f = ((f20 - f21) * f3) + f21;
            } else {
                f = Math.min(f5, f4) * iVar.f1790m;
            }
            this.f1901k = f;
            if (Float.isNaN(iVar.f1791n)) {
                float f22 = pVar2.f1902l;
                float f23 = pVar.f1902l;
                f2 = (f3 * (f22 - f23)) + f23;
            } else {
                f2 = iVar.f1791n;
            }
            this.f1902l = f2;
        }
        this.f1907q = pVar.f1907q;
        this.f1897g = C3500c.m15017c(iVar.f1785h);
        this.f1906p = iVar.f1786i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2621w(int i, int i2, C0388i iVar, C0399p pVar, C0399p pVar2) {
        C0388i iVar2 = iVar;
        C0399p pVar3 = pVar;
        C0399p pVar4 = pVar2;
        float f = ((float) iVar2.f1739a) / 100.0f;
        this.f1899i = f;
        this.f1898h = iVar2.f1787j;
        float f2 = Float.isNaN(iVar2.f1788k) ? f : iVar2.f1788k;
        float f3 = Float.isNaN(iVar2.f1789l) ? f : iVar2.f1789l;
        float f4 = pVar4.f1903m;
        float f5 = pVar3.f1903m;
        float f6 = pVar4.f1904n;
        float f7 = pVar3.f1904n;
        this.f1900j = this.f1899i;
        float f8 = pVar3.f1901k;
        float f9 = pVar3.f1902l;
        float f10 = pVar4.f1901k + (f4 / 2.0f);
        float f11 = pVar4.f1902l + (f6 / 2.0f);
        float f12 = (f4 - f5) * f2;
        this.f1901k = (float) ((int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f)) - (f12 / 2.0f)));
        float f13 = (f6 - f7) * f3;
        this.f1902l = (float) ((int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f)) - (f13 / 2.0f)));
        this.f1903m = (float) ((int) (f5 + f12));
        this.f1904n = (float) ((int) (f7 + f13));
        this.f1911u = 2;
        C0388i iVar3 = iVar;
        if (!Float.isNaN(iVar3.f1790m)) {
            this.f1901k = (float) ((int) (iVar3.f1790m * ((float) ((int) (((float) i) - this.f1903m)))));
        }
        if (!Float.isNaN(iVar3.f1791n)) {
            this.f1902l = (float) ((int) (iVar3.f1791n * ((float) ((int) (((float) i2) - this.f1904n)))));
        }
        this.f1907q = this.f1907q;
        this.f1897g = C3500c.m15017c(iVar3.f1785h);
        this.f1906p = iVar3.f1786i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2622x(float f, float f2, float f3, float f4) {
        this.f1901k = f;
        this.f1902l = f2;
        this.f1903m = f3;
        this.f1904n = f4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo2623y(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo2624z(float f, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f2;
        boolean z2;
        float f3;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f4 = this.f1901k;
        float f5 = this.f1902l;
        float f6 = this.f1903m;
        float f7 = this.f1904n;
        if (iArr2.length != 0 && this.f1912v.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f1912v = new double[i];
            this.f1913w = new double[i];
        }
        Arrays.fill(this.f1912v, Double.NaN);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            this.f1912v[iArr2[i2]] = dArr[i2];
            this.f1913w[iArr2[i2]] = dArr4[i2];
        }
        float f8 = Float.NaN;
        int i3 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr5 = this.f1912v;
            if (i3 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (!Double.isNaN(dArr5[i3]) || !(dArr3 == null || dArr3[i3] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i3];
                }
                if (!Double.isNaN(this.f1912v[i3])) {
                    d = this.f1912v[i3] + d;
                }
                f3 = f8;
                float f13 = (float) d;
                float f14 = (float) this.f1913w[i3];
                if (i3 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i3 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i3 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i3 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i3 == 5) {
                    f8 = f13;
                }
                i3++;
                double[] dArr6 = dArr2;
            } else {
                f3 = f8;
            }
            f8 = f3;
            i3++;
            double[] dArr62 = dArr2;
        }
        float f15 = f8;
        C0396n nVar = this.f1909s;
        if (nVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            nVar.mo2590i((double) f, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d2 = (double) f4;
            double d3 = (double) f5;
            double sin = ((double) f16) + (Math.sin(d3) * d2);
            f2 = f7;
            float f20 = (float) (sin - ((double) (f6 / 2.0f)));
            float cos = (float) ((((double) f17) - (Math.cos(d3) * d2)) - ((double) (f7 / 2.0f)));
            double d4 = (double) f9;
            double d5 = (double) f10;
            float sin2 = (float) (((double) f18) + (Math.sin(d3) * d4) + (Math.cos(d3) * d2 * d5));
            float f21 = f20;
            float cos2 = (float) ((((double) f19) - (d4 * Math.cos(d3))) + (d2 * Math.sin(d3) * d5));
            double[] dArr7 = dArr2;
            if (dArr7.length >= 2) {
                z2 = false;
                dArr7[0] = (double) sin2;
                dArr7[1] = (double) cos2;
            } else {
                z2 = false;
            }
            if (!Float.isNaN(f15)) {
                view2.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f4 = f21;
            f5 = cos;
        } else {
            float f22 = f15;
            f2 = f7;
            z2 = false;
            if (!Float.isNaN(f22)) {
                view2.setRotation((float) (((double) 0.0f) + ((double) f22) + Math.toDegrees(Math.atan2((double) (f10 + (f12 / 2.0f)), (double) (f9 + (f11 / 2.0f))))));
            }
        }
        if (view2 instanceof C0381d) {
            ((C0381d) view2).mo2538a(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f23 = f4 + 0.5f;
        int i4 = (int) f23;
        float f24 = f5 + 0.5f;
        int i5 = (int) f24;
        int i6 = (int) (f23 + f6);
        int i7 = (int) (f24 + f2);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (!(i8 == view.getMeasuredWidth() && i9 == view.getMeasuredHeight())) {
            z2 = true;
        }
        if (z2 || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    public C0399p(int i, int i2, C0388i iVar, C0399p pVar, C0399p pVar2) {
        int i3 = C0382e.f1738f;
        this.f1906p = i3;
        this.f1907q = i3;
        this.f1908r = Float.NaN;
        this.f1909s = null;
        this.f1910t = new LinkedHashMap<>();
        this.f1911u = 0;
        this.f1912v = new double[18];
        this.f1913w = new double[18];
        if (pVar.f1907q != C0382e.f1738f) {
            mo2620v(i, i2, iVar, pVar, pVar2);
            return;
        }
        int i4 = iVar.f1794q;
        if (i4 == 1) {
            mo2619u(iVar, pVar, pVar2);
        } else if (i4 != 2) {
            mo2618t(iVar, pVar, pVar2);
        } else {
            mo2621w(i, i2, iVar, pVar, pVar2);
        }
    }
}
