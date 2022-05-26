package p082e.p099f.p100a.p101k.p102a;

import java.util.Arrays;

/* renamed from: e.f.a.k.a.a */
/* compiled from: ArcCurveFit */
public class C3496a extends C3498b {

    /* renamed from: a */
    private final double[] f11162a;

    /* renamed from: b */
    C3497a[] f11163b;

    /* renamed from: c */
    private boolean f11164c = true;

    /* renamed from: e.f.a.k.a.a$a */
    /* compiled from: ArcCurveFit */
    private static class C3497a {

        /* renamed from: s */
        private static double[] f11165s = new double[91];

        /* renamed from: a */
        double[] f11166a;

        /* renamed from: b */
        double f11167b;

        /* renamed from: c */
        double f11168c;

        /* renamed from: d */
        double f11169d;

        /* renamed from: e */
        double f11170e;

        /* renamed from: f */
        double f11171f;

        /* renamed from: g */
        double f11172g;

        /* renamed from: h */
        double f11173h;

        /* renamed from: i */
        double f11174i;

        /* renamed from: j */
        double f11175j;

        /* renamed from: k */
        double f11176k;

        /* renamed from: l */
        double f11177l;

        /* renamed from: m */
        double f11178m;

        /* renamed from: n */
        double f11179n;

        /* renamed from: o */
        double f11180o;

        /* renamed from: p */
        double f11181p;

        /* renamed from: q */
        boolean f11182q;

        /* renamed from: r */
        boolean f11183r = false;

        C3497a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            boolean z = false;
            int i3 = 1;
            this.f11182q = i2 == 1 ? true : z;
            this.f11168c = d7;
            this.f11169d = d8;
            this.f11174i = 1.0d / (d8 - d7);
            if (3 == i2) {
                this.f11183r = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (this.f11183r || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                this.f11183r = true;
                this.f11170e = d9;
                this.f11171f = d11;
                this.f11172g = d10;
                this.f11173h = d6;
                double hypot = Math.hypot(d14, d13);
                this.f11167b = hypot;
                this.f11179n = hypot * this.f11174i;
                double d15 = this.f11169d;
                double d16 = this.f11168c;
                this.f11177l = d13 / (d15 - d16);
                this.f11178m = d14 / (d15 - d16);
                return;
            }
            this.f11166a = new double[101];
            boolean z2 = this.f11182q;
            this.f11175j = d13 * ((double) (z2 ? -1 : 1));
            this.f11176k = d14 * ((double) (!z2 ? -1 : i3));
            this.f11177l = z2 ? d11 : d9;
            this.f11178m = z2 ? d10 : d6;
            m14992a(d3, d4, d5, d6);
            this.f11179n = this.f11167b * this.f11174i;
        }

        /* renamed from: a */
        private void m14992a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f11165s;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f11165s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f11167b = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f11165s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f11166a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f11165s, length);
                    if (binarySearch >= 0) {
                        this.f11166a[i3] = ((double) binarySearch) / ((double) (f11165s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f11166a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f11165s;
                        this.f11166a[i3] = (((double) i5) + ((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public double mo12513b() {
            double d = this.f11175j * this.f11181p;
            double hypot = this.f11179n / Math.hypot(d, (-this.f11176k) * this.f11180o);
            if (this.f11182q) {
                d = -d;
            }
            return d * hypot;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public double mo12514c() {
            double d = this.f11175j * this.f11181p;
            double d2 = (-this.f11176k) * this.f11180o;
            double hypot = this.f11179n / Math.hypot(d, d2);
            return this.f11182q ? (-d2) * hypot : d2 * hypot;
        }

        /* renamed from: d */
        public double mo12515d(double d) {
            return this.f11177l;
        }

        /* renamed from: e */
        public double mo12516e(double d) {
            return this.f11178m;
        }

        /* renamed from: f */
        public double mo12517f(double d) {
            double d2 = (d - this.f11168c) * this.f11174i;
            double d3 = this.f11170e;
            return d3 + (d2 * (this.f11171f - d3));
        }

        /* renamed from: g */
        public double mo12518g(double d) {
            double d2 = (d - this.f11168c) * this.f11174i;
            double d3 = this.f11172g;
            return d3 + (d2 * (this.f11173h - d3));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public double mo12519h() {
            return this.f11177l + (this.f11175j * this.f11180o);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public double mo12520i() {
            return this.f11178m + (this.f11176k * this.f11181p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public double mo12521j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f11166a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo12522k(double d) {
            double j = mo12521j((this.f11182q ? this.f11169d - d : d - this.f11168c) * this.f11174i) * 1.5707963267948966d;
            this.f11180o = Math.sin(j);
            this.f11181p = Math.cos(j);
        }
    }

    public C3496a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f11162a = dArr3;
        this.f11163b = new C3497a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C3497a[] aVarArr = this.f11163b;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    i2 = i2 == 1 ? 2 : 1;
                    i3 = i2;
                }
                int i5 = i + 1;
                aVarArr[i] = new C3497a(i3, dArr3[i], dArr3[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public double mo12507c(double d, int i) {
        double d2;
        double g;
        double e;
        double i2;
        double c;
        int i3 = 0;
        if (this.f11164c) {
            C3497a[] aVarArr = this.f11163b;
            if (d < aVarArr[0].f11168c) {
                double d3 = aVarArr[0].f11168c;
                d2 = d - aVarArr[0].f11168c;
                if (!aVarArr[0].f11183r) {
                    aVarArr[0].mo12522k(d3);
                    if (i == 0) {
                        i2 = this.f11163b[0].mo12519h();
                        c = this.f11163b[0].mo12513b();
                    } else {
                        i2 = this.f11163b[0].mo12520i();
                        c = this.f11163b[0].mo12514c();
                    }
                    return i2 + (d2 * c);
                } else if (i == 0) {
                    g = aVarArr[0].mo12517f(d3);
                    e = this.f11163b[0].mo12515d(d3);
                } else {
                    g = aVarArr[0].mo12518g(d3);
                    e = this.f11163b[0].mo12516e(d3);
                }
            } else if (d > aVarArr[aVarArr.length - 1].f11169d) {
                double d4 = aVarArr[aVarArr.length - 1].f11169d;
                d2 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    g = aVarArr[length].mo12517f(d4);
                    e = this.f11163b[length].mo12515d(d4);
                } else {
                    g = aVarArr[length].mo12518g(d4);
                    e = this.f11163b[length].mo12516e(d4);
                }
            }
            return g + (d2 * e);
        }
        C3497a[] aVarArr2 = this.f11163b;
        if (d < aVarArr2[0].f11168c) {
            d = aVarArr2[0].f11168c;
        } else if (d > aVarArr2[aVarArr2.length - 1].f11169d) {
            d = aVarArr2[aVarArr2.length - 1].f11169d;
        }
        while (true) {
            C3497a[] aVarArr3 = this.f11163b;
            if (i3 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d > aVarArr3[i3].f11169d) {
                i3++;
            } else if (!aVarArr3[i3].f11183r) {
                aVarArr3[i3].mo12522k(d);
                if (i == 0) {
                    return this.f11163b[i3].mo12519h();
                }
                return this.f11163b[i3].mo12520i();
            } else if (i == 0) {
                return aVarArr3[i3].mo12517f(d);
            } else {
                return aVarArr3[i3].mo12518g(d);
            }
        }
    }

    /* renamed from: d */
    public void mo12508d(double d, double[] dArr) {
        if (this.f11164c) {
            C3497a[] aVarArr = this.f11163b;
            if (d < aVarArr[0].f11168c) {
                double d2 = aVarArr[0].f11168c;
                double d3 = d - aVarArr[0].f11168c;
                if (aVarArr[0].f11183r) {
                    dArr[0] = aVarArr[0].mo12517f(d2) + (this.f11163b[0].mo12515d(d2) * d3);
                    dArr[1] = this.f11163b[0].mo12518g(d2) + (d3 * this.f11163b[0].mo12516e(d2));
                    return;
                }
                aVarArr[0].mo12522k(d2);
                dArr[0] = this.f11163b[0].mo12519h() + (this.f11163b[0].mo12513b() * d3);
                dArr[1] = this.f11163b[0].mo12520i() + (d3 * this.f11163b[0].mo12514c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f11169d) {
                double d4 = aVarArr[aVarArr.length - 1].f11169d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f11183r) {
                    dArr[0] = aVarArr[length].mo12517f(d4) + (this.f11163b[length].mo12515d(d4) * d5);
                    dArr[1] = this.f11163b[length].mo12518g(d4) + (d5 * this.f11163b[length].mo12516e(d4));
                    return;
                }
                aVarArr[length].mo12522k(d);
                dArr[0] = this.f11163b[length].mo12519h() + (this.f11163b[length].mo12513b() * d5);
                dArr[1] = this.f11163b[length].mo12520i() + (d5 * this.f11163b[length].mo12514c());
                return;
            }
        } else {
            C3497a[] aVarArr2 = this.f11163b;
            if (d < aVarArr2[0].f11168c) {
                d = aVarArr2[0].f11168c;
            }
            if (d > aVarArr2[aVarArr2.length - 1].f11169d) {
                d = aVarArr2[aVarArr2.length - 1].f11169d;
            }
        }
        int i = 0;
        while (true) {
            C3497a[] aVarArr3 = this.f11163b;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f11169d) {
                i++;
            } else if (aVarArr3[i].f11183r) {
                dArr[0] = aVarArr3[i].mo12517f(d);
                dArr[1] = this.f11163b[i].mo12518g(d);
                return;
            } else {
                aVarArr3[i].mo12522k(d);
                dArr[0] = this.f11163b[i].mo12519h();
                dArr[1] = this.f11163b[i].mo12520i();
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo12509e(double d, float[] fArr) {
        if (this.f11164c) {
            C3497a[] aVarArr = this.f11163b;
            if (d < aVarArr[0].f11168c) {
                double d2 = aVarArr[0].f11168c;
                double d3 = d - aVarArr[0].f11168c;
                if (aVarArr[0].f11183r) {
                    fArr[0] = (float) (aVarArr[0].mo12517f(d2) + (this.f11163b[0].mo12515d(d2) * d3));
                    fArr[1] = (float) (this.f11163b[0].mo12518g(d2) + (d3 * this.f11163b[0].mo12516e(d2)));
                    return;
                }
                aVarArr[0].mo12522k(d2);
                fArr[0] = (float) (this.f11163b[0].mo12519h() + (this.f11163b[0].mo12513b() * d3));
                fArr[1] = (float) (this.f11163b[0].mo12520i() + (d3 * this.f11163b[0].mo12514c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f11169d) {
                double d4 = aVarArr[aVarArr.length - 1].f11169d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f11183r) {
                    fArr[0] = (float) (aVarArr[length].mo12517f(d4) + (this.f11163b[length].mo12515d(d4) * d5));
                    fArr[1] = (float) (this.f11163b[length].mo12518g(d4) + (d5 * this.f11163b[length].mo12516e(d4)));
                    return;
                }
                aVarArr[length].mo12522k(d);
                fArr[0] = (float) this.f11163b[length].mo12519h();
                fArr[1] = (float) this.f11163b[length].mo12520i();
                return;
            }
        } else {
            C3497a[] aVarArr2 = this.f11163b;
            if (d < aVarArr2[0].f11168c) {
                d = aVarArr2[0].f11168c;
            } else if (d > aVarArr2[aVarArr2.length - 1].f11169d) {
                d = aVarArr2[aVarArr2.length - 1].f11169d;
            }
        }
        int i = 0;
        while (true) {
            C3497a[] aVarArr3 = this.f11163b;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f11169d) {
                i++;
            } else if (aVarArr3[i].f11183r) {
                fArr[0] = (float) aVarArr3[i].mo12517f(d);
                fArr[1] = (float) this.f11163b[i].mo12518g(d);
                return;
            } else {
                aVarArr3[i].mo12522k(d);
                fArr[0] = (float) this.f11163b[i].mo12519h();
                fArr[1] = (float) this.f11163b[i].mo12520i();
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo12510f(double d, int i) {
        C3497a[] aVarArr = this.f11163b;
        int i2 = 0;
        if (d < aVarArr[0].f11168c) {
            d = aVarArr[0].f11168c;
        }
        if (d > aVarArr[aVarArr.length - 1].f11169d) {
            d = aVarArr[aVarArr.length - 1].f11169d;
        }
        while (true) {
            C3497a[] aVarArr2 = this.f11163b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f11169d) {
                i2++;
            } else if (!aVarArr2[i2].f11183r) {
                aVarArr2[i2].mo12522k(d);
                if (i == 0) {
                    return this.f11163b[i2].mo12513b();
                }
                return this.f11163b[i2].mo12514c();
            } else if (i == 0) {
                return aVarArr2[i2].mo12515d(d);
            } else {
                return aVarArr2[i2].mo12516e(d);
            }
        }
    }

    /* renamed from: g */
    public void mo12511g(double d, double[] dArr) {
        C3497a[] aVarArr = this.f11163b;
        if (d < aVarArr[0].f11168c) {
            d = aVarArr[0].f11168c;
        } else if (d > aVarArr[aVarArr.length - 1].f11169d) {
            d = aVarArr[aVarArr.length - 1].f11169d;
        }
        int i = 0;
        while (true) {
            C3497a[] aVarArr2 = this.f11163b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f11169d) {
                i++;
            } else if (aVarArr2[i].f11183r) {
                dArr[0] = aVarArr2[i].mo12515d(d);
                dArr[1] = this.f11163b[i].mo12516e(d);
                return;
            } else {
                aVarArr2[i].mo12522k(d);
                dArr[0] = this.f11163b[i].mo12513b();
                dArr[1] = this.f11163b[i].mo12514c();
                return;
            }
        }
    }

    /* renamed from: h */
    public double[] mo12512h() {
        return this.f11162a;
    }
}
