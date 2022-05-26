package p082e.p099f.p100a;

import java.util.ArrayList;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.C3493i;

/* renamed from: e.f.a.b */
/* compiled from: ArrayRow */
public class C3481b implements C3484d.C3485a {

    /* renamed from: a */
    C3493i f11059a = null;

    /* renamed from: b */
    float f11060b = 0.0f;

    /* renamed from: c */
    boolean f11061c;

    /* renamed from: d */
    ArrayList<C3493i> f11062d = new ArrayList<>();

    /* renamed from: e */
    public C3482a f11063e;

    /* renamed from: f */
    boolean f11064f = false;

    /* renamed from: e.f.a.b$a */
    /* compiled from: ArrayRow */
    public interface C3482a {
        /* renamed from: a */
        int mo12419a();

        /* renamed from: b */
        boolean mo12420b(C3493i iVar);

        /* renamed from: c */
        float mo12421c(C3481b bVar, boolean z);

        void clear();

        /* renamed from: d */
        void mo12423d(C3493i iVar, float f);

        /* renamed from: e */
        C3493i mo12424e(int i);

        /* renamed from: f */
        void mo12425f(C3493i iVar, float f, boolean z);

        /* renamed from: g */
        void mo12426g();

        /* renamed from: h */
        float mo12427h(int i);

        /* renamed from: i */
        float mo12428i(C3493i iVar, boolean z);

        /* renamed from: j */
        float mo12429j(C3493i iVar);

        /* renamed from: k */
        void mo12430k(float f);
    }

    public C3481b() {
    }

    /* renamed from: u */
    private boolean m14868u(C3493i iVar, C3484d dVar) {
        return iVar.f11144s <= 1;
    }

    /* renamed from: w */
    private C3493i m14869w(boolean[] zArr, C3493i iVar) {
        C3493i.C3494a aVar;
        int a = this.f11063e.mo12419a();
        C3493i iVar2 = null;
        float f = 0.0f;
        for (int i = 0; i < a; i++) {
            float h = this.f11063e.mo12427h(i);
            if (h < 0.0f) {
                C3493i e = this.f11063e.mo12424e(i);
                if ((zArr == null || !zArr[e.f11134i]) && e != iVar && (((aVar = e.f11141p) == C3493i.C3494a.SLACK || aVar == C3493i.C3494a.ERROR) && h < f)) {
                    f = h;
                    iVar2 = e;
                }
            }
        }
        return iVar2;
    }

    /* renamed from: A */
    public void mo12432A(C3484d dVar, C3493i iVar, boolean z) {
        if (iVar != null && iVar.f11138m) {
            this.f11060b += iVar.f11137l * this.f11063e.mo12429j(iVar);
            this.f11063e.mo12428i(iVar, z);
            if (z) {
                iVar.mo12499j(this);
            }
            if (C3484d.f11071t && this.f11063e.mo12419a() == 0) {
                this.f11064f = true;
                dVar.f11078a = true;
            }
        }
    }

    /* renamed from: B */
    public void mo12433B(C3484d dVar, C3481b bVar, boolean z) {
        this.f11060b += bVar.f11060b * this.f11063e.mo12421c(bVar, z);
        if (z) {
            bVar.f11059a.mo12499j(this);
        }
        if (C3484d.f11071t && this.f11059a != null && this.f11063e.mo12419a() == 0) {
            this.f11064f = true;
            dVar.f11078a = true;
        }
    }

    /* renamed from: C */
    public void mo12434C(C3484d dVar, C3493i iVar, boolean z) {
        if (iVar != null && iVar.f11145t) {
            float j = this.f11063e.mo12429j(iVar);
            this.f11060b += iVar.f11147v * j;
            this.f11063e.mo12428i(iVar, z);
            if (z) {
                iVar.mo12499j(this);
            }
            this.f11063e.mo12425f(dVar.f11091n.f11068d[iVar.f11146u], j, z);
            if (C3484d.f11071t && this.f11063e.mo12419a() == 0) {
                this.f11064f = true;
                dVar.f11078a = true;
            }
        }
    }

    /* renamed from: D */
    public void mo12435D(C3484d dVar) {
        if (dVar.f11084g.length != 0) {
            boolean z = false;
            while (!z) {
                int a = this.f11063e.mo12419a();
                for (int i = 0; i < a; i++) {
                    C3493i e = this.f11063e.mo12424e(i);
                    if (e.f11135j != -1 || e.f11138m || e.f11145t) {
                        this.f11062d.add(e);
                    }
                }
                int size = this.f11062d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        C3493i iVar = this.f11062d.get(i2);
                        if (iVar.f11138m) {
                            mo12432A(dVar, iVar, true);
                        } else if (iVar.f11145t) {
                            mo12434C(dVar, iVar, true);
                        } else {
                            mo12433B(dVar, dVar.f11084g[iVar.f11135j], true);
                        }
                    }
                    this.f11062d.clear();
                } else {
                    z = true;
                }
            }
            if (C3484d.f11071t && this.f11059a != null && this.f11063e.mo12419a() == 0) {
                this.f11064f = true;
                dVar.f11078a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo12436a(C3484d.C3485a aVar) {
        if (aVar instanceof C3481b) {
            C3481b bVar = (C3481b) aVar;
            this.f11059a = null;
            this.f11063e.clear();
            for (int i = 0; i < bVar.f11063e.mo12419a(); i++) {
                this.f11063e.mo12425f(bVar.f11063e.mo12424e(i), bVar.f11063e.mo12427h(i), true);
            }
        }
    }

    /* renamed from: b */
    public C3493i mo12437b(C3484d dVar, boolean[] zArr) {
        return m14869w(zArr, (C3493i) null);
    }

    /* renamed from: c */
    public void mo12438c(C3493i iVar) {
        int i = iVar.f11136k;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f11063e.mo12423d(iVar, f);
    }

    public void clear() {
        this.f11063e.clear();
        this.f11059a = null;
        this.f11060b = 0.0f;
    }

    /* renamed from: d */
    public C3481b mo12440d(C3484d dVar, int i) {
        this.f11063e.mo12423d(dVar.mo12477o(i, "ep"), 1.0f);
        this.f11063e.mo12423d(dVar.mo12477o(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C3481b mo12441e(C3493i iVar, int i) {
        this.f11063e.mo12423d(iVar, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo12442f(C3484d dVar) {
        boolean z;
        C3493i g = mo12443g(dVar);
        if (g == null) {
            z = true;
        } else {
            mo12461x(g);
            z = false;
        }
        if (this.f11063e.mo12419a() == 0) {
            this.f11064f = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C3493i mo12443g(C3484d dVar) {
        boolean u;
        boolean u2;
        int a = this.f11063e.mo12419a();
        C3493i iVar = null;
        C3493i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < a; i++) {
            float h = this.f11063e.mo12427h(i);
            C3493i e = this.f11063e.mo12424e(i);
            if (e.f11141p == C3493i.C3494a.UNRESTRICTED) {
                if (iVar == null) {
                    u2 = m14868u(e, dVar);
                } else if (f > h) {
                    u2 = m14868u(e, dVar);
                } else if (!z && m14868u(e, dVar)) {
                    f = h;
                    iVar = e;
                    z = true;
                }
                z = u2;
                f = h;
                iVar = e;
            } else if (iVar == null && h < 0.0f) {
                if (iVar2 == null) {
                    u = m14868u(e, dVar);
                } else if (f2 > h) {
                    u = m14868u(e, dVar);
                } else if (!z2 && m14868u(e, dVar)) {
                    f2 = h;
                    iVar2 = e;
                    z2 = true;
                }
                z2 = u;
                f2 = h;
                iVar2 = e;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C3493i getKey() {
        return this.f11059a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3481b mo12445h(C3493i iVar, C3493i iVar2, int i, float f, C3493i iVar3, C3493i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar4, 1.0f);
            this.f11063e.mo12423d(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11063e.mo12423d(iVar3, -1.0f);
            this.f11063e.mo12423d(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f11060b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f11063e.mo12423d(iVar, -1.0f);
            this.f11063e.mo12423d(iVar2, 1.0f);
            this.f11060b = (float) i;
        } else if (f >= 1.0f) {
            this.f11063e.mo12423d(iVar4, -1.0f);
            this.f11063e.mo12423d(iVar3, 1.0f);
            this.f11060b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f11063e.mo12423d(iVar, f2 * 1.0f);
            this.f11063e.mo12423d(iVar2, f2 * -1.0f);
            this.f11063e.mo12423d(iVar3, -1.0f * f);
            this.f11063e.mo12423d(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f11060b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C3481b mo12446i(C3493i iVar, int i) {
        this.f11059a = iVar;
        float f = (float) i;
        iVar.f11137l = f;
        this.f11060b = f;
        this.f11064f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f11059a == null && this.f11060b == 0.0f && this.f11063e.mo12419a() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3481b mo12448j(C3493i iVar, C3493i iVar2, float f) {
        this.f11063e.mo12423d(iVar, -1.0f);
        this.f11063e.mo12423d(iVar2, f);
        return this;
    }

    /* renamed from: k */
    public C3481b mo12449k(C3493i iVar, C3493i iVar2, C3493i iVar3, C3493i iVar4, float f) {
        this.f11063e.mo12423d(iVar, -1.0f);
        this.f11063e.mo12423d(iVar2, 1.0f);
        this.f11063e.mo12423d(iVar3, f);
        this.f11063e.mo12423d(iVar4, -f);
        return this;
    }

    /* renamed from: l */
    public C3481b mo12450l(float f, float f2, float f3, C3493i iVar, C3493i iVar2, C3493i iVar3, C3493i iVar4) {
        this.f11060b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11063e.mo12423d(iVar4, 1.0f);
            this.f11063e.mo12423d(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f11063e.mo12423d(iVar3, 1.0f);
            this.f11063e.mo12423d(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11063e.mo12423d(iVar4, f4);
            this.f11063e.mo12423d(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: m */
    public C3481b mo12451m(C3493i iVar, int i) {
        if (i < 0) {
            this.f11060b = (float) (i * -1);
            this.f11063e.mo12423d(iVar, 1.0f);
        } else {
            this.f11060b = (float) i;
            this.f11063e.mo12423d(iVar, -1.0f);
        }
        return this;
    }

    /* renamed from: n */
    public C3481b mo12452n(C3493i iVar, C3493i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f11060b = (float) i;
        }
        if (!z) {
            this.f11063e.mo12423d(iVar, -1.0f);
            this.f11063e.mo12423d(iVar2, 1.0f);
        } else {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
        }
        return this;
    }

    /* renamed from: o */
    public C3481b mo12453o(C3493i iVar, C3493i iVar2, C3493i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f11060b = (float) i;
        }
        if (!z) {
            this.f11063e.mo12423d(iVar, -1.0f);
            this.f11063e.mo12423d(iVar2, 1.0f);
            this.f11063e.mo12423d(iVar3, 1.0f);
        } else {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11063e.mo12423d(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: p */
    public C3481b mo12454p(C3493i iVar, C3493i iVar2, C3493i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f11060b = (float) i;
        }
        if (!z) {
            this.f11063e.mo12423d(iVar, -1.0f);
            this.f11063e.mo12423d(iVar2, 1.0f);
            this.f11063e.mo12423d(iVar3, -1.0f);
        } else {
            this.f11063e.mo12423d(iVar, 1.0f);
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11063e.mo12423d(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: q */
    public C3481b mo12455q(C3493i iVar, C3493i iVar2, C3493i iVar3, C3493i iVar4, float f) {
        this.f11063e.mo12423d(iVar3, 0.5f);
        this.f11063e.mo12423d(iVar4, 0.5f);
        this.f11063e.mo12423d(iVar, -0.5f);
        this.f11063e.mo12423d(iVar2, -0.5f);
        this.f11060b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo12456r() {
        float f = this.f11060b;
        if (f < 0.0f) {
            this.f11060b = f * -1.0f;
            this.f11063e.mo12426g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo12457s() {
        C3493i iVar = this.f11059a;
        return iVar != null && (iVar.f11141p == C3493i.C3494a.UNRESTRICTED || this.f11060b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo12458t(C3493i iVar) {
        return this.f11063e.mo12420b(iVar);
    }

    public String toString() {
        return mo12463z();
    }

    /* renamed from: v */
    public C3493i mo12460v(C3493i iVar) {
        return m14869w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo12461x(C3493i iVar) {
        C3493i iVar2 = this.f11059a;
        if (iVar2 != null) {
            this.f11063e.mo12423d(iVar2, -1.0f);
            this.f11059a.f11135j = -1;
            this.f11059a = null;
        }
        float i = this.f11063e.mo12428i(iVar, true) * -1.0f;
        this.f11059a = iVar;
        if (i != 1.0f) {
            this.f11060b /= i;
            this.f11063e.mo12430k(i);
        }
    }

    /* renamed from: y */
    public void mo12462y() {
        this.f11059a = null;
        this.f11063e.clear();
        this.f11060b = 0.0f;
        this.f11064f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo12463z() {
        /*
            r10 = this;
            e.f.a.i r0 = r10.f11059a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.f.a.i r1 = r10.f11059a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f11060b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f11060b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            e.f.a.b$a r5 = r10.f11063e
            int r5 = r5.mo12419a()
        L_0x005d:
            if (r2 >= r5) goto L_0x00ec
            e.f.a.b$a r6 = r10.f11063e
            e.f.a.i r6 = r6.mo12424e(r2)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            e.f.a.b$a r7 = r10.f11063e
            float r7 = r7.mo12427h(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0093
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x0093:
            if (r8 <= 0) goto L_0x00a7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b8:
            float r7 = r7 * r9
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = 1
        L_0x00e8:
            int r2 = r2 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.C3481b.mo12463z():java.lang.String");
    }

    public C3481b(C3483c cVar) {
        this.f11063e = new C3480a(this, cVar);
    }
}
