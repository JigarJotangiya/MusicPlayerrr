package p082e.p099f.p100a.p104m.p105o;

import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.o.p */
/* compiled from: WidgetRun */
public abstract class C3562p implements C3546d {

    /* renamed from: a */
    public int f11555a;

    /* renamed from: b */
    C3527e f11556b;

    /* renamed from: c */
    C3557m f11557c;

    /* renamed from: d */
    protected C3527e.C3529b f11558d;

    /* renamed from: e */
    C3550g f11559e = new C3550g(this);

    /* renamed from: f */
    public int f11560f = 0;

    /* renamed from: g */
    boolean f11561g = false;

    /* renamed from: h */
    public C3548f f11562h = new C3548f(this);

    /* renamed from: i */
    public C3548f f11563i = new C3548f(this);

    /* renamed from: j */
    protected C3564b f11564j = C3564b.NONE;

    /* renamed from: e.f.a.m.o.p$a */
    /* compiled from: WidgetRun */
    static /* synthetic */ class C3563a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11565a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.f.a.m.d$b[] r0 = p082e.p099f.p100a.p104m.C3524d.C3526b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11565a = r0
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11565a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.p105o.C3562p.C3563a.<clinit>():void");
        }
    }

    /* renamed from: e.f.a.m.o.p$b */
    /* compiled from: WidgetRun */
    enum C3564b {
        NONE,
        START,
        END,
        CENTER
    }

    public C3562p(C3527e eVar) {
        this.f11556b = eVar;
    }

    /* renamed from: l */
    private void m15501l(int i, int i2) {
        int i3;
        int i4 = this.f11555a;
        if (i4 == 0) {
            this.f11559e.mo12837d(mo12856g(i2, i));
        } else if (i4 == 1) {
            this.f11559e.mo12837d(Math.min(mo12856g(this.f11559e.f11536m, i), i2));
        } else if (i4 == 2) {
            C3527e M = this.f11556b.mo12639M();
            if (M != null) {
                C3550g gVar = (i == 0 ? M.f11361d : M.f11363e).f11559e;
                if (gVar.f11532j) {
                    C3527e eVar = this.f11556b;
                    this.f11559e.mo12837d(mo12856g((int) ((((float) gVar.f11529g) * (i == 0 ? eVar.f11401x : eVar.f11315A)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C3527e eVar2 = this.f11556b;
            C3562p pVar = eVar2.f11361d;
            C3527e.C3529b bVar = pVar.f11558d;
            C3527e.C3529b bVar2 = C3527e.C3529b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f11555a == 3) {
                C3558n nVar = eVar2.f11363e;
                if (nVar.f11558d == bVar2 && nVar.f11555a == 3) {
                    return;
                }
            }
            if (i == 0) {
                pVar = eVar2.f11363e;
            }
            if (pVar.f11559e.f11532j) {
                float x = eVar2.mo12716x();
                if (i == 1) {
                    i3 = (int) ((((float) pVar.f11559e.f11529g) / x) + 0.5f);
                } else {
                    i3 = (int) ((x * ((float) pVar.f11559e.f11529g)) + 0.5f);
                }
                this.f11559e.mo12837d(i3);
            }
        }
    }

    /* renamed from: a */
    public void mo12819a(C3546d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12854b(C3548f fVar, C3548f fVar2, int i) {
        fVar.f11534l.add(fVar2);
        fVar.f11528f = i;
        fVar2.f11533k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo12855c(C3548f fVar, C3548f fVar2, int i, C3550g gVar) {
        fVar.f11534l.add(fVar2);
        fVar.f11534l.add(this.f11559e);
        fVar.f11530h = i;
        fVar.f11531i = gVar;
        fVar2.f11533k.add(fVar);
        gVar.f11533k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo12820d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo12821e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo12822f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo12856g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C3527e eVar = this.f11556b;
            int i4 = eVar.f11399w;
            i3 = Math.max(eVar.f11397v, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C3527e eVar2 = this.f11556b;
            int i5 = eVar2.f11405z;
            int max = Math.max(eVar2.f11403y, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C3548f mo12857h(C3524d dVar) {
        C3524d dVar2 = dVar.f11308f;
        if (dVar2 == null) {
            return null;
        }
        C3527e eVar = dVar2.f11306d;
        int i = C3563a.f11565a[dVar2.f11307e.ordinal()];
        if (i == 1) {
            return eVar.f11361d.f11562h;
        }
        if (i == 2) {
            return eVar.f11361d.f11563i;
        }
        if (i == 3) {
            return eVar.f11363e.f11562h;
        }
        if (i == 4) {
            return eVar.f11363e.f11546k;
        }
        if (i != 5) {
            return null;
        }
        return eVar.f11363e.f11563i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C3548f mo12858i(C3524d dVar, int i) {
        C3524d dVar2 = dVar.f11308f;
        if (dVar2 == null) {
            return null;
        }
        C3527e eVar = dVar2.f11306d;
        C3562p pVar = i == 0 ? eVar.f11361d : eVar.f11363e;
        int i2 = C3563a.f11565a[dVar2.f11307e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f11563i;
        }
        return pVar.f11562h;
    }

    /* renamed from: j */
    public long mo12823j() {
        C3550g gVar = this.f11559e;
        if (gVar.f11532j) {
            return (long) gVar.f11529g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo12859k() {
        return this.f11561g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo12824m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo12860n(C3546d dVar, C3524d dVar2, C3524d dVar3, int i) {
        float f;
        C3548f h = mo12857h(dVar2);
        C3548f h2 = mo12857h(dVar3);
        if (h.f11532j && h2.f11532j) {
            int f2 = h.f11529g + dVar2.mo12598f();
            int f3 = h2.f11529g - dVar3.mo12598f();
            int i2 = f3 - f2;
            if (!this.f11559e.f11532j && this.f11558d == C3527e.C3529b.MATCH_CONSTRAINT) {
                m15501l(i, i2);
            }
            C3550g gVar = this.f11559e;
            if (gVar.f11532j) {
                if (gVar.f11529g == i2) {
                    this.f11562h.mo12837d(f2);
                    this.f11563i.mo12837d(f3);
                    return;
                }
                C3527e eVar = this.f11556b;
                if (i == 0) {
                    f = eVar.mo12615A();
                } else {
                    f = eVar.mo12647Q();
                }
                if (h == h2) {
                    f2 = h.f11529g;
                    f3 = h2.f11529g;
                    f = 0.5f;
                }
                this.f11562h.mo12837d((int) (((float) f2) + 0.5f + (((float) ((f3 - f2) - this.f11559e.f11529g)) * f)));
                this.f11563i.mo12837d(this.f11562h.f11529g + this.f11559e.f11529g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo12861o(C3546d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo12862p(C3546d dVar) {
    }
}
