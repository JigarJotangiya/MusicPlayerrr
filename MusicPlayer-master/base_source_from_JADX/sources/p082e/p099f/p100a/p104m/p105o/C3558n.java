package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3535i;
import p082e.p099f.p100a.p104m.p105o.C3548f;
import p082e.p099f.p100a.p104m.p105o.C3562p;

/* renamed from: e.f.a.m.o.n */
/* compiled from: VerticalWidgetRun */
public class C3558n extends C3562p {

    /* renamed from: k */
    public C3548f f11546k;

    /* renamed from: l */
    C3550g f11547l = null;

    /* renamed from: e.f.a.m.o.n$a */
    /* compiled from: VerticalWidgetRun */
    static /* synthetic */ class C3559a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11548a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.f.a.m.o.p$b[] r0 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11548a = r0
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11548a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11548a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.o.p$b r1 = p082e.p099f.p100a.p104m.p105o.C3562p.C3564b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3558n.C3559a.<clinit>():void");
        }
    }

    public C3558n(C3527e eVar) {
        super(eVar);
        C3548f fVar = new C3548f(this);
        this.f11546k = fVar;
        this.f11562h.f11527e = C3548f.C3549a.TOP;
        this.f11563i.f11527e = C3548f.C3549a.BOTTOM;
        fVar.f11527e = C3548f.C3549a.BASELINE;
        this.f11560f = 1;
    }

    /* renamed from: a */
    public void mo12819a(C3546d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C3559a.f11548a[this.f11564j.ordinal()];
        if (i2 == 1) {
            mo12862p(dVar);
        } else if (i2 == 2) {
            mo12861o(dVar);
        } else if (i2 == 3) {
            C3527e eVar = this.f11556b;
            mo12860n(dVar, eVar.f11341N, eVar.f11344P, 1);
            return;
        }
        C3550g gVar = this.f11559e;
        if (gVar.f11525c && !gVar.f11532j && this.f11558d == C3527e.C3529b.MATCH_CONSTRAINT) {
            C3527e eVar2 = this.f11556b;
            int i3 = eVar2.f11393t;
            if (i3 == 2) {
                C3527e M = eVar2.mo12639M();
                if (M != null) {
                    C3550g gVar2 = M.f11363e.f11559e;
                    if (gVar2.f11532j) {
                        float f4 = this.f11556b.f11315A;
                        this.f11559e.mo12837d((int) ((((float) gVar2.f11529g) * f4) + 0.5f));
                    }
                }
            } else if (i3 == 3 && eVar2.f11361d.f11559e.f11532j) {
                int y = eVar2.mo12718y();
                if (y == -1) {
                    C3527e eVar3 = this.f11556b;
                    f3 = (float) eVar3.f11361d.f11559e.f11529g;
                    f2 = eVar3.mo12716x();
                } else if (y == 0) {
                    C3527e eVar4 = this.f11556b;
                    f = ((float) eVar4.f11361d.f11559e.f11529g) * eVar4.mo12716x();
                    i = (int) (f + 0.5f);
                    this.f11559e.mo12837d(i);
                } else if (y != 1) {
                    i = 0;
                    this.f11559e.mo12837d(i);
                } else {
                    C3527e eVar5 = this.f11556b;
                    f3 = (float) eVar5.f11361d.f11559e.f11529g;
                    f2 = eVar5.mo12716x();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f11559e.mo12837d(i);
            }
        }
        C3548f fVar = this.f11562h;
        if (fVar.f11525c) {
            C3548f fVar2 = this.f11563i;
            if (fVar2.f11525c) {
                if (!fVar.f11532j || !fVar2.f11532j || !this.f11559e.f11532j) {
                    if (!this.f11559e.f11532j && this.f11558d == C3527e.C3529b.MATCH_CONSTRAINT) {
                        C3527e eVar6 = this.f11556b;
                        if (eVar6.f11391s == 0 && !eVar6.mo12687j0()) {
                            int i4 = this.f11562h.f11534l.get(0).f11529g;
                            C3548f fVar3 = this.f11562h;
                            int i5 = i4 + fVar3.f11528f;
                            int i6 = this.f11563i.f11534l.get(0).f11529g + this.f11563i.f11528f;
                            fVar3.mo12837d(i5);
                            this.f11563i.mo12837d(i6);
                            this.f11559e.mo12837d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f11559e.f11532j && this.f11558d == C3527e.C3529b.MATCH_CONSTRAINT && this.f11555a == 1 && this.f11562h.f11534l.size() > 0 && this.f11563i.f11534l.size() > 0) {
                        int i7 = (this.f11563i.f11534l.get(0).f11529g + this.f11563i.f11528f) - (this.f11562h.f11534l.get(0).f11529g + this.f11562h.f11528f);
                        C3550g gVar3 = this.f11559e;
                        int i8 = gVar3.f11536m;
                        if (i7 < i8) {
                            gVar3.mo12837d(i7);
                        } else {
                            gVar3.mo12837d(i8);
                        }
                    }
                    if (this.f11559e.f11532j && this.f11562h.f11534l.size() > 0 && this.f11563i.f11534l.size() > 0) {
                        C3548f fVar4 = this.f11562h.f11534l.get(0);
                        C3548f fVar5 = this.f11563i.f11534l.get(0);
                        int i9 = fVar4.f11529g + this.f11562h.f11528f;
                        int i10 = fVar5.f11529g + this.f11563i.f11528f;
                        float Q = this.f11556b.mo12647Q();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f11529g;
                            i10 = fVar5.f11529g;
                            Q = 0.5f;
                        }
                        this.f11562h.mo12837d((int) (((float) i9) + 0.5f + (((float) ((i10 - i9) - this.f11559e.f11529g)) * Q)));
                        this.f11563i.mo12837d(this.f11562h.f11529g + this.f11559e.f11529g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo12820d() {
        C3527e M;
        C3527e M2;
        C3527e eVar = this.f11556b;
        if (eVar.f11355a) {
            this.f11559e.mo12837d(eVar.mo12720z());
        }
        if (!this.f11559e.f11532j) {
            this.f11558d = this.f11556b.mo12651S();
            if (this.f11556b.mo12663Y()) {
                this.f11547l = new C3541a(this);
            }
            C3527e.C3529b bVar = this.f11558d;
            if (bVar != C3527e.C3529b.MATCH_CONSTRAINT) {
                if (bVar == C3527e.C3529b.MATCH_PARENT && (M2 = this.f11556b.mo12639M()) != null && M2.mo12651S() == C3527e.C3529b.FIXED) {
                    int z = (M2.mo12720z() - this.f11556b.f11341N.mo12598f()) - this.f11556b.f11344P.mo12598f();
                    mo12854b(this.f11562h, M2.f11363e.f11562h, this.f11556b.f11341N.mo12598f());
                    mo12854b(this.f11563i, M2.f11363e.f11563i, -this.f11556b.f11344P.mo12598f());
                    this.f11559e.mo12837d(z);
                    return;
                } else if (this.f11558d == C3527e.C3529b.FIXED) {
                    this.f11559e.mo12837d(this.f11556b.mo12720z());
                }
            }
        } else if (this.f11558d == C3527e.C3529b.MATCH_PARENT && (M = this.f11556b.mo12639M()) != null && M.mo12651S() == C3527e.C3529b.FIXED) {
            mo12854b(this.f11562h, M.f11363e.f11562h, this.f11556b.f11341N.mo12598f());
            mo12854b(this.f11563i, M.f11363e.f11563i, -this.f11556b.f11344P.mo12598f());
            return;
        }
        C3550g gVar = this.f11559e;
        boolean z2 = gVar.f11532j;
        if (z2) {
            C3527e eVar2 = this.f11556b;
            if (eVar2.f11355a) {
                C3524d[] dVarArr = eVar2.f11349U;
                if (dVarArr[2].f11308f != null && dVarArr[3].f11308f != null) {
                    if (eVar2.mo12687j0()) {
                        this.f11562h.f11528f = this.f11556b.f11349U[2].mo12598f();
                        this.f11563i.f11528f = -this.f11556b.f11349U[3].mo12598f();
                    } else {
                        C3548f h = mo12857h(this.f11556b.f11349U[2]);
                        if (h != null) {
                            mo12854b(this.f11562h, h, this.f11556b.f11349U[2].mo12598f());
                        }
                        C3548f h2 = mo12857h(this.f11556b.f11349U[3]);
                        if (h2 != null) {
                            mo12854b(this.f11563i, h2, -this.f11556b.f11349U[3].mo12598f());
                        }
                        this.f11562h.f11524b = true;
                        this.f11563i.f11524b = true;
                    }
                    if (this.f11556b.mo12663Y()) {
                        mo12854b(this.f11546k, this.f11562h, this.f11556b.mo12704r());
                        return;
                    }
                    return;
                } else if (dVarArr[2].f11308f != null) {
                    C3548f h3 = mo12857h(dVarArr[2]);
                    if (h3 != null) {
                        mo12854b(this.f11562h, h3, this.f11556b.f11349U[2].mo12598f());
                        mo12854b(this.f11563i, this.f11562h, this.f11559e.f11529g);
                        if (this.f11556b.mo12663Y()) {
                            mo12854b(this.f11546k, this.f11562h, this.f11556b.mo12704r());
                            return;
                        }
                        return;
                    }
                    return;
                } else if (dVarArr[3].f11308f != null) {
                    C3548f h4 = mo12857h(dVarArr[3]);
                    if (h4 != null) {
                        mo12854b(this.f11563i, h4, -this.f11556b.f11349U[3].mo12598f());
                        mo12854b(this.f11562h, this.f11563i, -this.f11559e.f11529g);
                    }
                    if (this.f11556b.mo12663Y()) {
                        mo12854b(this.f11546k, this.f11562h, this.f11556b.mo12704r());
                        return;
                    }
                    return;
                } else if (dVarArr[4].f11308f != null) {
                    C3548f h5 = mo12857h(dVarArr[4]);
                    if (h5 != null) {
                        mo12854b(this.f11546k, h5, 0);
                        mo12854b(this.f11562h, this.f11546k, -this.f11556b.mo12704r());
                        mo12854b(this.f11563i, this.f11562h, this.f11559e.f11529g);
                        return;
                    }
                    return;
                } else if (!(eVar2 instanceof C3535i) && eVar2.mo12639M() != null && this.f11556b.mo12702q(C3524d.C3526b.CENTER).f11308f == null) {
                    mo12854b(this.f11562h, this.f11556b.mo12639M().f11363e.f11562h, this.f11556b.mo12661X());
                    mo12854b(this.f11563i, this.f11562h, this.f11559e.f11529g);
                    if (this.f11556b.mo12663Y()) {
                        mo12854b(this.f11546k, this.f11562h, this.f11556b.mo12704r());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z2 || this.f11558d != C3527e.C3529b.MATCH_CONSTRAINT) {
            gVar.mo12835b(this);
        } else {
            C3527e eVar3 = this.f11556b;
            int i = eVar3.f11393t;
            if (i == 2) {
                C3527e M3 = eVar3.mo12639M();
                if (M3 != null) {
                    C3550g gVar2 = M3.f11363e.f11559e;
                    this.f11559e.f11534l.add(gVar2);
                    gVar2.f11533k.add(this.f11559e);
                    C3550g gVar3 = this.f11559e;
                    gVar3.f11524b = true;
                    gVar3.f11533k.add(this.f11562h);
                    this.f11559e.f11533k.add(this.f11563i);
                }
            } else if (i == 3 && !eVar3.mo12687j0()) {
                C3527e eVar4 = this.f11556b;
                if (eVar4.f11391s != 3) {
                    C3550g gVar4 = eVar4.f11361d.f11559e;
                    this.f11559e.f11534l.add(gVar4);
                    gVar4.f11533k.add(this.f11559e);
                    C3550g gVar5 = this.f11559e;
                    gVar5.f11524b = true;
                    gVar5.f11533k.add(this.f11562h);
                    this.f11559e.f11533k.add(this.f11563i);
                }
            }
        }
        C3527e eVar5 = this.f11556b;
        C3524d[] dVarArr2 = eVar5.f11349U;
        if (dVarArr2[2].f11308f != null && dVarArr2[3].f11308f != null) {
            if (eVar5.mo12687j0()) {
                this.f11562h.f11528f = this.f11556b.f11349U[2].mo12598f();
                this.f11563i.f11528f = -this.f11556b.f11349U[3].mo12598f();
            } else {
                C3548f h6 = mo12857h(this.f11556b.f11349U[2]);
                C3548f h7 = mo12857h(this.f11556b.f11349U[3]);
                if (h6 != null) {
                    h6.mo12835b(this);
                }
                if (h7 != null) {
                    h7.mo12835b(this);
                }
                this.f11564j = C3562p.C3564b.CENTER;
            }
            if (this.f11556b.mo12663Y()) {
                mo12855c(this.f11546k, this.f11562h, 1, this.f11547l);
            }
        } else if (dVarArr2[2].f11308f != null) {
            C3548f h8 = mo12857h(dVarArr2[2]);
            if (h8 != null) {
                mo12854b(this.f11562h, h8, this.f11556b.f11349U[2].mo12598f());
                mo12855c(this.f11563i, this.f11562h, 1, this.f11559e);
                if (this.f11556b.mo12663Y()) {
                    mo12855c(this.f11546k, this.f11562h, 1, this.f11547l);
                }
                C3527e.C3529b bVar2 = this.f11558d;
                C3527e.C3529b bVar3 = C3527e.C3529b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f11556b.mo12716x() > 0.0f) {
                    C3555l lVar = this.f11556b.f11361d;
                    if (lVar.f11558d == bVar3) {
                        lVar.f11559e.f11533k.add(this.f11559e);
                        this.f11559e.f11534l.add(this.f11556b.f11361d.f11559e);
                        this.f11559e.f11523a = this;
                    }
                }
            }
        } else if (dVarArr2[3].f11308f != null) {
            C3548f h9 = mo12857h(dVarArr2[3]);
            if (h9 != null) {
                mo12854b(this.f11563i, h9, -this.f11556b.f11349U[3].mo12598f());
                mo12855c(this.f11562h, this.f11563i, -1, this.f11559e);
                if (this.f11556b.mo12663Y()) {
                    mo12855c(this.f11546k, this.f11562h, 1, this.f11547l);
                }
            }
        } else if (dVarArr2[4].f11308f != null) {
            C3548f h10 = mo12857h(dVarArr2[4]);
            if (h10 != null) {
                mo12854b(this.f11546k, h10, 0);
                mo12855c(this.f11562h, this.f11546k, -1, this.f11547l);
                mo12855c(this.f11563i, this.f11562h, 1, this.f11559e);
            }
        } else if (!(eVar5 instanceof C3535i) && eVar5.mo12639M() != null) {
            mo12854b(this.f11562h, this.f11556b.mo12639M().f11363e.f11562h, this.f11556b.mo12661X());
            mo12855c(this.f11563i, this.f11562h, 1, this.f11559e);
            if (this.f11556b.mo12663Y()) {
                mo12855c(this.f11546k, this.f11562h, 1, this.f11547l);
            }
            C3527e.C3529b bVar4 = this.f11558d;
            C3527e.C3529b bVar5 = C3527e.C3529b.MATCH_CONSTRAINT;
            if (bVar4 == bVar5 && this.f11556b.mo12716x() > 0.0f) {
                C3555l lVar2 = this.f11556b.f11361d;
                if (lVar2.f11558d == bVar5) {
                    lVar2.f11559e.f11533k.add(this.f11559e);
                    this.f11559e.f11534l.add(this.f11556b.f11361d.f11559e);
                    this.f11559e.f11523a = this;
                }
            }
        }
        if (this.f11559e.f11534l.size() == 0) {
            this.f11559e.f11525c = true;
        }
    }

    /* renamed from: e */
    public void mo12821e() {
        C3548f fVar = this.f11562h;
        if (fVar.f11532j) {
            this.f11556b.mo12691k1(fVar.f11529g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo12822f() {
        this.f11557c = null;
        this.f11562h.mo12836c();
        this.f11563i.mo12836c();
        this.f11546k.mo12836c();
        this.f11559e.mo12836c();
        this.f11561g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12824m() {
        if (this.f11558d != C3527e.C3529b.MATCH_CONSTRAINT || this.f11556b.f11393t == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo12843q() {
        this.f11561g = false;
        this.f11562h.mo12836c();
        this.f11562h.f11532j = false;
        this.f11563i.mo12836c();
        this.f11563i.f11532j = false;
        this.f11546k.mo12836c();
        this.f11546k.f11532j = false;
        this.f11559e.f11532j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f11556b.mo12712v();
    }
}
