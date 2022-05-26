package p369i.p373c0;

import p369i.p387z.p389d.C8589g;

/* renamed from: i.c0.c */
/* compiled from: Ranges.kt */
public final class C8388c extends C8385a {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C8388c f34878k = new C8388c(1, 0);

    /* renamed from: l */
    public static final C8389a f34879l = new C8389a((C8589g) null);

    /* renamed from: i.c0.c$a */
    /* compiled from: Ranges.kt */
    public static final class C8389a {
        private C8389a() {
        }

        /* renamed from: a */
        public final C8388c mo30369a() {
            return C8388c.f34878k;
        }

        public /* synthetic */ C8389a(C8589g gVar) {
            this();
        }
    }

    public C8388c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8388c) {
            if (!isEmpty() || !((C8388c) obj).isEmpty()) {
                C8388c cVar = (C8388c) obj;
                if (!(mo30355d() == cVar.mo30355d() && mo30360p() == cVar.mo30360p())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo30355d() * 31) + mo30360p();
    }

    public boolean isEmpty() {
        return mo30355d() > mo30360p();
    }

    public String toString() {
        return mo30355d() + ".." + mo30360p();
    }

    /* renamed from: v */
    public Integer mo30367v() {
        return Integer.valueOf(mo30360p());
    }

    /* renamed from: x */
    public Integer mo30368x() {
        return Integer.valueOf(mo30355d());
    }
}
