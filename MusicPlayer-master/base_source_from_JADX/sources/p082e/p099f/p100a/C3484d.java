package p082e.p099f.p100a;

import java.util.Arrays;
import java.util.HashMap;
import p082e.p099f.p100a.C3493i;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.d */
/* compiled from: LinearSystem */
public class C3484d {

    /* renamed from: r */
    public static boolean f11069r = false;

    /* renamed from: s */
    public static boolean f11070s = true;

    /* renamed from: t */
    public static boolean f11071t = true;

    /* renamed from: u */
    public static boolean f11072u = true;

    /* renamed from: v */
    public static boolean f11073v = false;

    /* renamed from: w */
    private static int f11074w = 1000;

    /* renamed from: x */
    public static C3487e f11075x;

    /* renamed from: y */
    public static long f11076y;

    /* renamed from: z */
    public static long f11077z;

    /* renamed from: a */
    public boolean f11078a;

    /* renamed from: b */
    int f11079b;

    /* renamed from: c */
    private HashMap<String, C3493i> f11080c;

    /* renamed from: d */
    private C3485a f11081d;

    /* renamed from: e */
    private int f11082e;

    /* renamed from: f */
    private int f11083f;

    /* renamed from: g */
    C3481b[] f11084g;

    /* renamed from: h */
    public boolean f11085h;

    /* renamed from: i */
    public boolean f11086i;

    /* renamed from: j */
    private boolean[] f11087j;

    /* renamed from: k */
    int f11088k;

    /* renamed from: l */
    int f11089l;

    /* renamed from: m */
    private int f11090m;

    /* renamed from: n */
    final C3483c f11091n;

    /* renamed from: o */
    private C3493i[] f11092o;

    /* renamed from: p */
    private int f11093p;

    /* renamed from: q */
    private C3485a f11094q;

    /* renamed from: e.f.a.d$a */
    /* compiled from: LinearSystem */
    interface C3485a {
        /* renamed from: a */
        void mo12436a(C3485a aVar);

        /* renamed from: b */
        C3493i mo12437b(C3484d dVar, boolean[] zArr);

        /* renamed from: c */
        void mo12438c(C3493i iVar);

        void clear();

        C3493i getKey();

        boolean isEmpty();
    }

    /* renamed from: e.f.a.d$b */
    /* compiled from: LinearSystem */
    class C3486b extends C3481b {
        public C3486b(C3484d dVar, C3483c cVar) {
            this.f11063e = new C3495j(this, cVar);
        }
    }

    public C3484d() {
        this.f11078a = false;
        this.f11079b = 0;
        this.f11080c = null;
        this.f11082e = 32;
        this.f11083f = 32;
        this.f11084g = null;
        this.f11085h = false;
        this.f11086i = false;
        this.f11087j = new boolean[32];
        this.f11088k = 1;
        this.f11089l = 0;
        this.f11090m = 32;
        this.f11092o = new C3493i[f11074w];
        this.f11093p = 0;
        this.f11084g = new C3481b[32];
        m14910C();
        C3483c cVar = new C3483c();
        this.f11091n = cVar;
        this.f11081d = new C3490h(cVar);
        if (f11073v) {
            this.f11094q = new C3486b(this, cVar);
        } else {
            this.f11094q = new C3481b(cVar);
        }
    }

    /* renamed from: B */
    private final int m14909B(C3485a aVar, boolean z) {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11103h++;
        }
        for (int i = 0; i < this.f11088k; i++) {
            this.f11087j[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3487e eVar2 = f11075x;
            if (eVar2 != null) {
                eVar2.f11104i++;
            }
            i2++;
            if (i2 >= this.f11088k * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f11087j[aVar.getKey().f11134i] = true;
            }
            C3493i b = aVar.mo12437b(this, this.f11087j);
            if (b != null) {
                boolean[] zArr = this.f11087j;
                int i3 = b.f11134i;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (b != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f11089l; i5++) {
                    C3481b bVar = this.f11084g[i5];
                    if (bVar.f11059a.f11141p != C3493i.C3494a.UNRESTRICTED && !bVar.f11064f && bVar.mo12458t(b)) {
                        float j = bVar.f11063e.mo12429j(b);
                        if (j < 0.0f) {
                            float f2 = (-bVar.f11060b) / j;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C3481b bVar2 = this.f11084g[i4];
                    bVar2.f11059a.f11135j = -1;
                    C3487e eVar3 = f11075x;
                    if (eVar3 != null) {
                        eVar3.f11105j++;
                    }
                    bVar2.mo12461x(b);
                    C3493i iVar = bVar2.f11059a;
                    iVar.f11135j = i4;
                    iVar.mo12503p(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: C */
    private void m14910C() {
        int i = 0;
        if (f11073v) {
            while (i < this.f11089l) {
                C3481b bVar = this.f11084g[i];
                if (bVar != null) {
                    this.f11091n.f11065a.mo12485a(bVar);
                }
                this.f11084g[i] = null;
                i++;
            }
            return;
        }
        while (i < this.f11089l) {
            C3481b bVar2 = this.f11084g[i];
            if (bVar2 != null) {
                this.f11091n.f11066b.mo12485a(bVar2);
            }
            this.f11084g[i] = null;
            i++;
        }
    }

    /* renamed from: a */
    private C3493i m14911a(C3493i.C3494a aVar, String str) {
        C3493i b = this.f11091n.f11067c.mo12486b();
        if (b == null) {
            b = new C3493i(aVar, str);
            b.mo12502o(aVar, str);
        } else {
            b.mo12500k();
            b.mo12502o(aVar, str);
        }
        int i = this.f11093p;
        int i2 = f11074w;
        if (i >= i2) {
            int i3 = i2 * 2;
            f11074w = i3;
            this.f11092o = (C3493i[]) Arrays.copyOf(this.f11092o, i3);
        }
        C3493i[] iVarArr = this.f11092o;
        int i4 = this.f11093p;
        this.f11093p = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m14912l(C3481b bVar) {
        int i;
        if (!f11071t || !bVar.f11064f) {
            C3481b[] bVarArr = this.f11084g;
            int i2 = this.f11089l;
            bVarArr[i2] = bVar;
            C3493i iVar = bVar.f11059a;
            iVar.f11135j = i2;
            this.f11089l = i2 + 1;
            iVar.mo12503p(this, bVar);
        } else {
            bVar.f11059a.mo12501l(this, bVar.f11060b);
        }
        if (f11071t && this.f11078a) {
            int i3 = 0;
            while (i3 < this.f11089l) {
                if (this.f11084g[i3] == null) {
                    System.out.println("WTF");
                }
                C3481b[] bVarArr2 = this.f11084g;
                if (bVarArr2[i3] != null && bVarArr2[i3].f11064f) {
                    C3481b bVar2 = bVarArr2[i3];
                    bVar2.f11059a.mo12501l(this, bVar2.f11060b);
                    if (f11073v) {
                        this.f11091n.f11065a.mo12485a(bVar2);
                    } else {
                        this.f11091n.f11066b.mo12485a(bVar2);
                    }
                    this.f11084g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f11089l;
                        if (i4 >= i) {
                            break;
                        }
                        C3481b[] bVarArr3 = this.f11084g;
                        int i6 = i4 - 1;
                        bVarArr3[i6] = bVarArr3[i4];
                        if (bVarArr3[i6].f11059a.f11135j == i4) {
                            bVarArr3[i6].f11059a.f11135j = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f11084g[i5] = null;
                    }
                    this.f11089l = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f11078a = false;
        }
    }

    /* renamed from: n */
    private void m14913n() {
        for (int i = 0; i < this.f11089l; i++) {
            C3481b bVar = this.f11084g[i];
            bVar.f11059a.f11137l = bVar.f11060b;
        }
    }

    /* renamed from: s */
    public static C3481b m14914s(C3484d dVar, C3493i iVar, C3493i iVar2, float f) {
        C3481b r = dVar.mo12480r();
        r.mo12448j(iVar, iVar2, f);
        return r;
    }

    /* renamed from: u */
    private int m14915u(C3485a aVar) throws Exception {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= this.f11089l) {
                z = false;
                break;
            }
            C3481b[] bVarArr = this.f11084g;
            if (bVarArr[i].f11059a.f11141p != C3493i.C3494a.UNRESTRICTED && bVarArr[i].f11060b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C3487e eVar = f11075x;
            if (eVar != null) {
                eVar.f11106k++;
            }
            i2++;
            float f = Float.MAX_VALUE;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < this.f11089l; i6++) {
                C3481b bVar = this.f11084g[i6];
                if (bVar.f11059a.f11141p != C3493i.C3494a.UNRESTRICTED && !bVar.f11064f && bVar.f11060b < 0.0f) {
                    int i7 = 9;
                    if (f11072u) {
                        int a = bVar.f11063e.mo12419a();
                        int i8 = 0;
                        while (i8 < a) {
                            C3493i e = bVar.f11063e.mo12424e(i8);
                            float j = bVar.f11063e.mo12429j(e);
                            if (j > 0.0f) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    float f2 = e.f11139n[i9] / j;
                                    if ((f2 < f && i9 == i5) || i9 > i5) {
                                        i4 = e.f11134i;
                                        i5 = i9;
                                        i3 = i6;
                                        f = f2;
                                    }
                                    i9++;
                                    i7 = 9;
                                }
                            }
                            i8++;
                            i7 = 9;
                        }
                    } else {
                        for (int i10 = 1; i10 < this.f11088k; i10++) {
                            C3493i iVar = this.f11091n.f11068d[i10];
                            float j2 = bVar.f11063e.mo12429j(iVar);
                            if (j2 > 0.0f) {
                                for (int i11 = 0; i11 < 9; i11++) {
                                    float f3 = iVar.f11139n[i11] / j2;
                                    if ((f3 < f && i11 == i5) || i11 > i5) {
                                        i4 = i10;
                                        i5 = i11;
                                        i3 = i6;
                                        f = f3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i3 != -1) {
                C3481b bVar2 = this.f11084g[i3];
                bVar2.f11059a.f11135j = -1;
                C3487e eVar2 = f11075x;
                if (eVar2 != null) {
                    eVar2.f11105j++;
                }
                bVar2.mo12461x(this.f11091n.f11068d[i4]);
                C3493i iVar2 = bVar2.f11059a;
                iVar2.f11135j = i3;
                iVar2.mo12503p(this, bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f11088k / 2) {
                z2 = true;
            }
        }
        return i2;
    }

    /* renamed from: w */
    public static C3487e m14916w() {
        return f11075x;
    }

    /* renamed from: y */
    private void m14917y() {
        int i = this.f11082e * 2;
        this.f11082e = i;
        this.f11084g = (C3481b[]) Arrays.copyOf(this.f11084g, i);
        C3483c cVar = this.f11091n;
        cVar.f11068d = (C3493i[]) Arrays.copyOf(cVar.f11068d, this.f11082e);
        int i2 = this.f11082e;
        this.f11087j = new boolean[i2];
        this.f11083f = i2;
        this.f11090m = i2;
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11099d++;
            eVar.f11110o = Math.max(eVar.f11110o, (long) i2);
            C3487e eVar2 = f11075x;
            eVar2.f11119x = eVar2.f11110o;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo12464A(C3485a aVar) throws Exception {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11115t++;
            eVar.f11116u = Math.max(eVar.f11116u, (long) this.f11088k);
            C3487e eVar2 = f11075x;
            eVar2.f11117v = Math.max(eVar2.f11117v, (long) this.f11089l);
        }
        m14915u(aVar);
        m14909B(aVar, false);
        m14913n();
    }

    /* renamed from: D */
    public void mo12465D() {
        C3483c cVar;
        int i = 0;
        while (true) {
            cVar = this.f11091n;
            C3493i[] iVarArr = cVar.f11068d;
            if (i >= iVarArr.length) {
                break;
            }
            C3493i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo12500k();
            }
            i++;
        }
        cVar.f11067c.mo12487c(this.f11092o, this.f11093p);
        this.f11093p = 0;
        Arrays.fill(this.f11091n.f11068d, (Object) null);
        HashMap<String, C3493i> hashMap = this.f11080c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f11079b = 0;
        this.f11081d.clear();
        this.f11088k = 1;
        for (int i2 = 0; i2 < this.f11089l; i2++) {
            C3481b[] bVarArr = this.f11084g;
            if (bVarArr[i2] != null) {
                bVarArr[i2].f11061c = false;
            }
        }
        m14910C();
        this.f11089l = 0;
        if (f11073v) {
            this.f11094q = new C3486b(this, this.f11091n);
        } else {
            this.f11094q = new C3481b(this.f11091n);
        }
    }

    /* renamed from: b */
    public void mo12466b(C3527e eVar, C3527e eVar2, float f, int i) {
        C3527e eVar3 = eVar;
        C3527e eVar4 = eVar2;
        C3524d.C3526b bVar = C3524d.C3526b.LEFT;
        C3493i q = mo12479q(eVar3.mo12702q(bVar));
        C3524d.C3526b bVar2 = C3524d.C3526b.TOP;
        C3493i q2 = mo12479q(eVar3.mo12702q(bVar2));
        C3524d.C3526b bVar3 = C3524d.C3526b.RIGHT;
        C3493i q3 = mo12479q(eVar3.mo12702q(bVar3));
        C3524d.C3526b bVar4 = C3524d.C3526b.BOTTOM;
        C3493i q4 = mo12479q(eVar3.mo12702q(bVar4));
        C3493i q5 = mo12479q(eVar4.mo12702q(bVar));
        C3493i q6 = mo12479q(eVar4.mo12702q(bVar2));
        C3493i q7 = mo12479q(eVar4.mo12702q(bVar3));
        C3493i q8 = mo12479q(eVar4.mo12702q(bVar4));
        C3481b r = mo12480r();
        double d = (double) f;
        C3493i iVar = q7;
        double d2 = (double) i;
        r.mo12455q(q2, q4, q6, q8, (float) (Math.sin(d) * d2));
        mo12468d(r);
        C3481b r2 = mo12480r();
        r2.mo12455q(q, q3, q5, iVar, (float) (Math.cos(d) * d2));
        mo12468d(r2);
    }

    /* renamed from: c */
    public void mo12467c(C3493i iVar, C3493i iVar2, int i, float f, C3493i iVar3, C3493i iVar4, int i2, int i3) {
        int i4 = i3;
        C3481b r = mo12480r();
        r.mo12445h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 8) {
            r.mo12440d(this, i4);
        }
        mo12468d(r);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12468d(p082e.p099f.p100a.C3481b r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            e.f.a.e r0 = f11075x
            r1 = 1
            if (r0 == 0) goto L_0x0017
            long r3 = r0.f11101f
            long r3 = r3 + r1
            r0.f11101f = r3
            boolean r3 = r8.f11064f
            if (r3 == 0) goto L_0x0017
            long r3 = r0.f11102g
            long r3 = r3 + r1
            r0.f11102g = r3
        L_0x0017:
            int r0 = r7.f11089l
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f11090m
            if (r0 >= r4) goto L_0x0026
            int r0 = r7.f11088k
            int r0 = r0 + r3
            int r4 = r7.f11083f
            if (r0 < r4) goto L_0x0029
        L_0x0026:
            r7.m14917y()
        L_0x0029:
            r0 = 0
            boolean r4 = r8.f11064f
            if (r4 != 0) goto L_0x00a1
            r8.mo12435D(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L_0x0038
            return
        L_0x0038:
            r8.mo12456r()
            boolean r4 = r8.mo12442f(r7)
            if (r4 == 0) goto L_0x0098
            e.f.a.i r4 = r7.mo12478p()
            r8.f11059a = r4
            int r5 = r7.f11089l
            r7.m14912l(r8)
            int r6 = r7.f11089l
            int r5 = r5 + r3
            if (r6 != r5) goto L_0x0098
            e.f.a.d$a r0 = r7.f11094q
            r0.mo12436a(r8)
            e.f.a.d$a r0 = r7.f11094q
            r7.m14909B(r0, r3)
            int r0 = r4.f11135j
            r5 = -1
            if (r0 != r5) goto L_0x0099
            e.f.a.i r0 = r8.f11059a
            if (r0 != r4) goto L_0x0076
            e.f.a.i r0 = r8.mo12460v(r4)
            if (r0 == 0) goto L_0x0076
            e.f.a.e r4 = f11075x
            if (r4 == 0) goto L_0x0073
            long r5 = r4.f11105j
            long r5 = r5 + r1
            r4.f11105j = r5
        L_0x0073:
            r8.mo12461x(r0)
        L_0x0076:
            boolean r0 = r8.f11064f
            if (r0 != 0) goto L_0x007f
            e.f.a.i r0 = r8.f11059a
            r0.mo12503p(r7, r8)
        L_0x007f:
            boolean r0 = f11073v
            if (r0 == 0) goto L_0x008b
            e.f.a.c r0 = r7.f11091n
            e.f.a.f<e.f.a.b> r0 = r0.f11065a
            r0.mo12485a(r8)
            goto L_0x0092
        L_0x008b:
            e.f.a.c r0 = r7.f11091n
            e.f.a.f<e.f.a.b> r0 = r0.f11066b
            r0.mo12485a(r8)
        L_0x0092:
            int r0 = r7.f11089l
            int r0 = r0 - r3
            r7.f11089l = r0
            goto L_0x0099
        L_0x0098:
            r3 = 0
        L_0x0099:
            boolean r0 = r8.mo12457s()
            if (r0 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r0 = r3
        L_0x00a1:
            if (r0 != 0) goto L_0x00a6
            r7.m14912l(r8)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.C3484d.mo12468d(e.f.a.b):void");
    }

    /* renamed from: e */
    public C3481b mo12469e(C3493i iVar, C3493i iVar2, int i, int i2) {
        if (!f11070s || i2 != 8 || !iVar2.f11138m || iVar.f11135j != -1) {
            C3481b r = mo12480r();
            r.mo12452n(iVar, iVar2, i);
            if (i2 != 8) {
                r.mo12440d(this, i2);
            }
            mo12468d(r);
            return r;
        }
        iVar.mo12501l(this, iVar2.f11137l + ((float) i));
        return null;
    }

    /* renamed from: f */
    public void mo12470f(C3493i iVar, int i) {
        if (!f11070s || iVar.f11135j != -1) {
            int i2 = iVar.f11135j;
            if (i2 != -1) {
                C3481b bVar = this.f11084g[i2];
                if (bVar.f11064f) {
                    bVar.f11060b = (float) i;
                } else if (bVar.f11063e.mo12419a() == 0) {
                    bVar.f11064f = true;
                    bVar.f11060b = (float) i;
                } else {
                    C3481b r = mo12480r();
                    r.mo12451m(iVar, i);
                    mo12468d(r);
                }
            } else {
                C3481b r2 = mo12480r();
                r2.mo12446i(iVar, i);
                mo12468d(r2);
            }
        } else {
            float f = (float) i;
            iVar.mo12501l(this, f);
            for (int i3 = 0; i3 < this.f11079b + 1; i3++) {
                C3493i iVar2 = this.f11091n.f11068d[i3];
                if (iVar2 != null && iVar2.f11145t && iVar2.f11146u == iVar.f11134i) {
                    iVar2.mo12501l(this, iVar2.f11147v + f);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo12471g(C3493i iVar, C3493i iVar2, int i, boolean z) {
        C3481b r = mo12480r();
        C3493i t = mo12481t();
        t.f11136k = 0;
        r.mo12453o(iVar, iVar2, t, i);
        mo12468d(r);
    }

    /* renamed from: h */
    public void mo12472h(C3493i iVar, C3493i iVar2, int i, int i2) {
        C3481b r = mo12480r();
        C3493i t = mo12481t();
        t.f11136k = 0;
        r.mo12453o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo12476m(r, (int) (r.f11063e.mo12429j(t) * -1.0f), i2);
        }
        mo12468d(r);
    }

    /* renamed from: i */
    public void mo12473i(C3493i iVar, C3493i iVar2, int i, boolean z) {
        C3481b r = mo12480r();
        C3493i t = mo12481t();
        t.f11136k = 0;
        r.mo12454p(iVar, iVar2, t, i);
        mo12468d(r);
    }

    /* renamed from: j */
    public void mo12474j(C3493i iVar, C3493i iVar2, int i, int i2) {
        C3481b r = mo12480r();
        C3493i t = mo12481t();
        t.f11136k = 0;
        r.mo12454p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo12476m(r, (int) (r.f11063e.mo12429j(t) * -1.0f), i2);
        }
        mo12468d(r);
    }

    /* renamed from: k */
    public void mo12475k(C3493i iVar, C3493i iVar2, C3493i iVar3, C3493i iVar4, float f, int i) {
        C3481b r = mo12480r();
        r.mo12449k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo12440d(this, i);
        }
        mo12468d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo12476m(C3481b bVar, int i, int i2) {
        bVar.mo12441e(mo12477o(i2, (String) null), i);
    }

    /* renamed from: o */
    public C3493i mo12477o(int i, String str) {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11107l++;
        }
        if (this.f11088k + 1 >= this.f11083f) {
            m14917y();
        }
        C3493i a = m14911a(C3493i.C3494a.ERROR, str);
        int i2 = this.f11079b + 1;
        this.f11079b = i2;
        this.f11088k++;
        a.f11134i = i2;
        a.f11136k = i;
        this.f11091n.f11068d[i2] = a;
        this.f11081d.mo12438c(a);
        return a;
    }

    /* renamed from: p */
    public C3493i mo12478p() {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11109n++;
        }
        if (this.f11088k + 1 >= this.f11083f) {
            m14917y();
        }
        C3493i a = m14911a(C3493i.C3494a.SLACK, (String) null);
        int i = this.f11079b + 1;
        this.f11079b = i;
        this.f11088k++;
        a.f11134i = i;
        this.f11091n.f11068d[i] = a;
        return a;
    }

    /* renamed from: q */
    public C3493i mo12479q(Object obj) {
        C3493i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f11088k + 1 >= this.f11083f) {
            m14917y();
        }
        if (obj instanceof C3524d) {
            C3524d dVar = (C3524d) obj;
            iVar = dVar.mo12601i();
            if (iVar == null) {
                dVar.mo12611s(this.f11091n);
                iVar = dVar.mo12601i();
            }
            int i = iVar.f11134i;
            if (i == -1 || i > this.f11079b || this.f11091n.f11068d[i] == null) {
                if (i != -1) {
                    iVar.mo12500k();
                }
                int i2 = this.f11079b + 1;
                this.f11079b = i2;
                this.f11088k++;
                iVar.f11134i = i2;
                iVar.f11141p = C3493i.C3494a.UNRESTRICTED;
                this.f11091n.f11068d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C3481b mo12480r() {
        C3481b bVar;
        if (f11073v) {
            bVar = this.f11091n.f11065a.mo12486b();
            if (bVar == null) {
                bVar = new C3486b(this, this.f11091n);
                f11077z++;
            } else {
                bVar.mo12462y();
            }
        } else {
            bVar = this.f11091n.f11066b.mo12486b();
            if (bVar == null) {
                bVar = new C3481b(this.f11091n);
                f11076y++;
            } else {
                bVar.mo12462y();
            }
        }
        C3493i.m14960h();
        return bVar;
    }

    /* renamed from: t */
    public C3493i mo12481t() {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11108m++;
        }
        if (this.f11088k + 1 >= this.f11083f) {
            m14917y();
        }
        C3493i a = m14911a(C3493i.C3494a.SLACK, (String) null);
        int i = this.f11079b + 1;
        this.f11079b = i;
        this.f11088k++;
        a.f11134i = i;
        this.f11091n.f11068d[i] = a;
        return a;
    }

    /* renamed from: v */
    public C3483c mo12482v() {
        return this.f11091n;
    }

    /* renamed from: x */
    public int mo12483x(Object obj) {
        C3493i i = ((C3524d) obj).mo12601i();
        if (i != null) {
            return (int) (i.f11137l + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo12484z() throws Exception {
        C3487e eVar = f11075x;
        if (eVar != null) {
            eVar.f11100e++;
        }
        if (this.f11081d.isEmpty()) {
            m14913n();
        } else if (this.f11085h || this.f11086i) {
            C3487e eVar2 = f11075x;
            if (eVar2 != null) {
                eVar2.f11112q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f11089l) {
                    z = true;
                    break;
                } else if (!this.f11084g[i].f11064f) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo12464A(this.f11081d);
                return;
            }
            C3487e eVar3 = f11075x;
            if (eVar3 != null) {
                eVar3.f11111p++;
            }
            m14913n();
        } else {
            mo12464A(this.f11081d);
        }
    }
}
