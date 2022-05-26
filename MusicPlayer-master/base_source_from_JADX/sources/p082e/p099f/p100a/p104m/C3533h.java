package p082e.p099f.p100a.p104m;

import java.util.HashMap;
import p082e.p099f.p100a.C3484d;
import p082e.p099f.p100a.C3493i;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;

/* renamed from: e.f.a.m.h */
/* compiled from: Guideline */
public class C3533h extends C3527e {

    /* renamed from: P0 */
    protected float f11475P0 = -1.0f;

    /* renamed from: Q0 */
    protected int f11476Q0 = -1;

    /* renamed from: R0 */
    protected int f11477R0 = -1;

    /* renamed from: S0 */
    private C3524d f11478S0 = this.f11341N;

    /* renamed from: T0 */
    private int f11479T0;

    /* renamed from: U0 */
    private boolean f11480U0;

    /* renamed from: e.f.a.m.h$a */
    /* compiled from: Guideline */
    static /* synthetic */ class C3534a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.f.a.m.d$b[] r0 = p082e.p099f.p100a.p104m.C3524d.C3526b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11481a = r0
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3533h.C3534a.<clinit>():void");
        }
    }

    public C3533h() {
        this.f11479T0 = 0;
        this.f11350V.clear();
        this.f11350V.add(this.f11478S0);
        int length = this.f11349U.length;
        for (int i = 0; i < length; i++) {
            this.f11349U[i] = this.f11478S0;
        }
    }

    /* renamed from: g */
    public void mo12577g(C3484d dVar, boolean z) {
        C3530f fVar = (C3530f) mo12639M();
        if (fVar != null) {
            C3524d q = fVar.mo12702q(C3524d.C3526b.LEFT);
            C3524d q2 = fVar.mo12702q(C3524d.C3526b.RIGHT);
            C3527e eVar = this.f11353Y;
            boolean z2 = true;
            boolean z3 = eVar != null && eVar.f11352X[0] == C3527e.C3529b.WRAP_CONTENT;
            if (this.f11479T0 == 0) {
                q = fVar.mo12702q(C3524d.C3526b.TOP);
                q2 = fVar.mo12702q(C3524d.C3526b.BOTTOM);
                C3527e eVar2 = this.f11353Y;
                if (eVar2 == null || eVar2.f11352X[1] != C3527e.C3529b.WRAP_CONTENT) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.f11480U0 && this.f11478S0.mo12606n()) {
                C3493i q3 = dVar.mo12479q(this.f11478S0);
                dVar.mo12470f(q3, this.f11478S0.mo12597e());
                if (this.f11476Q0 != -1) {
                    if (z3) {
                        dVar.mo12472h(dVar.mo12479q(q2), q3, 0, 5);
                    }
                } else if (this.f11477R0 != -1 && z3) {
                    C3493i q4 = dVar.mo12479q(q2);
                    dVar.mo12472h(q3, dVar.mo12479q(q), 0, 5);
                    dVar.mo12472h(q4, q3, 0, 5);
                }
                this.f11480U0 = false;
            } else if (this.f11476Q0 != -1) {
                C3493i q5 = dVar.mo12479q(this.f11478S0);
                dVar.mo12469e(q5, dVar.mo12479q(q), this.f11476Q0, 8);
                if (z3) {
                    dVar.mo12472h(dVar.mo12479q(q2), q5, 0, 5);
                }
            } else if (this.f11477R0 != -1) {
                C3493i q6 = dVar.mo12479q(this.f11478S0);
                C3493i q7 = dVar.mo12479q(q2);
                dVar.mo12469e(q6, q7, -this.f11477R0, 8);
                if (z3) {
                    dVar.mo12472h(q6, dVar.mo12479q(q), 0, 5);
                    dVar.mo12472h(q7, q6, 0, 5);
                }
            } else if (this.f11475P0 != -1.0f) {
                dVar.mo12468d(C3484d.m14914s(dVar, dVar.mo12479q(this.f11478S0), dVar.mo12479q(q2), this.f11475P0));
            }
        }
    }

    /* renamed from: h */
    public boolean mo12578h() {
        return true;
    }

    /* renamed from: m0 */
    public boolean mo12579m0() {
        return this.f11480U0;
    }

    /* renamed from: n */
    public void mo12580n(C3527e eVar, HashMap<C3527e, C3527e> hashMap) {
        super.mo12580n(eVar, hashMap);
        C3533h hVar = (C3533h) eVar;
        this.f11475P0 = hVar.f11475P0;
        this.f11476Q0 = hVar.f11476Q0;
        this.f11477R0 = hVar.f11477R0;
        mo12786x1(hVar.f11479T0);
    }

    /* renamed from: n0 */
    public boolean mo12581n0() {
        return this.f11480U0;
    }

    /* renamed from: n1 */
    public void mo12697n1(C3484d dVar, boolean z) {
        if (mo12639M() != null) {
            int x = dVar.mo12483x(this.f11478S0);
            if (this.f11479T0 == 1) {
                mo12688j1(x);
                mo12691k1(0);
                mo12632I0(mo12639M().mo12720z());
                mo12683h1(0);
                return;
            }
            mo12688j1(0);
            mo12691k1(x);
            mo12683h1(mo12639M().mo12657V());
            mo12632I0(0);
        }
    }

    /* renamed from: o1 */
    public C3524d mo12777o1() {
        return this.f11478S0;
    }

    /* renamed from: p1 */
    public int mo12778p1() {
        return this.f11479T0;
    }

    /* renamed from: q */
    public C3524d mo12702q(C3524d.C3526b bVar) {
        int i = C3534a.f11481a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f11479T0 == 1) {
                return this.f11478S0;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f11479T0 == 0) {
            return this.f11478S0;
        } else {
            return null;
        }
    }

    /* renamed from: q1 */
    public int mo12779q1() {
        return this.f11476Q0;
    }

    /* renamed from: r1 */
    public int mo12780r1() {
        return this.f11477R0;
    }

    /* renamed from: s1 */
    public float mo12781s1() {
        return this.f11475P0;
    }

    /* renamed from: t1 */
    public void mo12782t1(int i) {
        this.f11478S0.mo12612t(i);
        this.f11480U0 = true;
    }

    /* renamed from: u1 */
    public void mo12783u1(int i) {
        if (i > -1) {
            this.f11475P0 = -1.0f;
            this.f11476Q0 = i;
            this.f11477R0 = -1;
        }
    }

    /* renamed from: v1 */
    public void mo12784v1(int i) {
        if (i > -1) {
            this.f11475P0 = -1.0f;
            this.f11476Q0 = -1;
            this.f11477R0 = i;
        }
    }

    /* renamed from: w1 */
    public void mo12785w1(float f) {
        if (f > -1.0f) {
            this.f11475P0 = f;
            this.f11476Q0 = -1;
            this.f11477R0 = -1;
        }
    }

    /* renamed from: x1 */
    public void mo12786x1(int i) {
        if (this.f11479T0 != i) {
            this.f11479T0 = i;
            this.f11350V.clear();
            if (this.f11479T0 == 1) {
                this.f11478S0 = this.f11339M;
            } else {
                this.f11478S0 = this.f11341N;
            }
            this.f11350V.add(this.f11478S0);
            int length = this.f11349U.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f11349U[i2] = this.f11478S0;
            }
        }
    }
}
