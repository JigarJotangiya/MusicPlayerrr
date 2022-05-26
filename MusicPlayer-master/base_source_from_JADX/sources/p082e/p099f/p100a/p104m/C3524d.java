package p082e.p099f.p100a.p104m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p082e.p099f.p100a.C3483c;
import p082e.p099f.p100a.C3493i;
import p082e.p099f.p100a.p104m.p105o.C3552i;
import p082e.p099f.p100a.p104m.p105o.C3560o;

/* renamed from: e.f.a.m.d */
/* compiled from: ConstraintAnchor */
public class C3524d {

    /* renamed from: a */
    private HashSet<C3524d> f11303a = null;

    /* renamed from: b */
    private int f11304b;

    /* renamed from: c */
    private boolean f11305c;

    /* renamed from: d */
    public final C3527e f11306d;

    /* renamed from: e */
    public final C3526b f11307e;

    /* renamed from: f */
    public C3524d f11308f;

    /* renamed from: g */
    public int f11309g = 0;

    /* renamed from: h */
    int f11310h = Integer.MIN_VALUE;

    /* renamed from: i */
    C3493i f11311i;

    /* renamed from: e.f.a.m.d$a */
    /* compiled from: ConstraintAnchor */
    static /* synthetic */ class C3525a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11312a;

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
                f11312a = r0
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f11312a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.f.a.m.d$b r1 = p082e.p099f.p100a.p104m.C3524d.C3526b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p099f.p100a.p104m.C3524d.C3525a.<clinit>():void");
        }
    }

    /* renamed from: e.f.a.m.d$b */
    /* compiled from: ConstraintAnchor */
    public enum C3526b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C3524d(C3527e eVar, C3526b bVar) {
        this.f11306d = eVar;
        this.f11307e = bVar;
    }

    /* renamed from: a */
    public boolean mo12593a(C3524d dVar, int i) {
        return mo12594b(dVar, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean mo12594b(C3524d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo12609q();
            return true;
        } else if (!z && !mo12608p(dVar)) {
            return false;
        } else {
            this.f11308f = dVar;
            if (dVar.f11303a == null) {
                dVar.f11303a = new HashSet<>();
            }
            HashSet<C3524d> hashSet = this.f11308f.f11303a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f11309g = i;
            this.f11310h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public void mo12595c(int i, ArrayList<C3560o> arrayList, C3560o oVar) {
        HashSet<C3524d> hashSet = this.f11303a;
        if (hashSet != null) {
            Iterator<C3524d> it = hashSet.iterator();
            while (it.hasNext()) {
                C3552i.m15458a(it.next().f11306d, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: d */
    public HashSet<C3524d> mo12596d() {
        return this.f11303a;
    }

    /* renamed from: e */
    public int mo12597e() {
        if (!this.f11305c) {
            return 0;
        }
        return this.f11304b;
    }

    /* renamed from: f */
    public int mo12598f() {
        C3524d dVar;
        if (this.f11306d.mo12655U() == 8) {
            return 0;
        }
        if (this.f11310h == Integer.MIN_VALUE || (dVar = this.f11308f) == null || dVar.f11306d.mo12655U() != 8) {
            return this.f11309g;
        }
        return this.f11310h;
    }

    /* renamed from: g */
    public final C3524d mo12599g() {
        switch (C3525a.f11312a[this.f11307e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f11306d.f11343O;
            case 3:
                return this.f11306d.f11339M;
            case 4:
                return this.f11306d.f11344P;
            case 5:
                return this.f11306d.f11341N;
            default:
                throw new AssertionError(this.f11307e.name());
        }
    }

    /* renamed from: h */
    public C3527e mo12600h() {
        return this.f11306d;
    }

    /* renamed from: i */
    public C3493i mo12601i() {
        return this.f11311i;
    }

    /* renamed from: j */
    public C3524d mo12602j() {
        return this.f11308f;
    }

    /* renamed from: k */
    public C3526b mo12603k() {
        return this.f11307e;
    }

    /* renamed from: l */
    public boolean mo12604l() {
        HashSet<C3524d> hashSet = this.f11303a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C3524d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo12599g().mo12607o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo12605m() {
        HashSet<C3524d> hashSet = this.f11303a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo12606n() {
        return this.f11305c;
    }

    /* renamed from: o */
    public boolean mo12607o() {
        return this.f11308f != null;
    }

    /* renamed from: p */
    public boolean mo12608p(C3524d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        C3526b k = dVar.mo12603k();
        C3526b bVar = this.f11307e;
        if (k != bVar) {
            switch (C3525a.f11312a[bVar.ordinal()]) {
                case 1:
                    if (k == C3526b.BASELINE || k == C3526b.CENTER_X || k == C3526b.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    boolean z2 = k == C3526b.LEFT || k == C3526b.RIGHT;
                    if (!(dVar.mo12600h() instanceof C3533h)) {
                        return z2;
                    }
                    if (z2 || k == C3526b.CENTER_X) {
                        z = true;
                    }
                    return z;
                case 4:
                case 5:
                    boolean z3 = k == C3526b.TOP || k == C3526b.BOTTOM;
                    if (!(dVar.mo12600h() instanceof C3533h)) {
                        return z3;
                    }
                    if (z3 || k == C3526b.CENTER_Y) {
                        z = true;
                    }
                    return z;
                case 6:
                    if (k == C3526b.LEFT || k == C3526b.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f11307e.name());
            }
        } else if (bVar != C3526b.BASELINE || (dVar.mo12600h().mo12663Y() && mo12600h().mo12663Y())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public void mo12609q() {
        HashSet<C3524d> hashSet;
        C3524d dVar = this.f11308f;
        if (!(dVar == null || (hashSet = dVar.f11303a) == null)) {
            hashSet.remove(this);
            if (this.f11308f.f11303a.size() == 0) {
                this.f11308f.f11303a = null;
            }
        }
        this.f11303a = null;
        this.f11308f = null;
        this.f11309g = 0;
        this.f11310h = Integer.MIN_VALUE;
        this.f11305c = false;
        this.f11304b = 0;
    }

    /* renamed from: r */
    public void mo12610r() {
        this.f11305c = false;
        this.f11304b = 0;
    }

    /* renamed from: s */
    public void mo12611s(C3483c cVar) {
        C3493i iVar = this.f11311i;
        if (iVar == null) {
            this.f11311i = new C3493i(C3493i.C3494a.UNRESTRICTED, (String) null);
        } else {
            iVar.mo12500k();
        }
    }

    /* renamed from: t */
    public void mo12612t(int i) {
        this.f11304b = i;
        this.f11305c = true;
    }

    public String toString() {
        return this.f11306d.mo12712v() + ":" + this.f11307e.toString();
    }

    /* renamed from: u */
    public void mo12614u(int i) {
        if (mo12607o()) {
            this.f11310h = i;
        }
    }
}
