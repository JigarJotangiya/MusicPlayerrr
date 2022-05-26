package p082e.p109h.p117n;

import java.util.Locale;

/* renamed from: e.h.n.e */
/* compiled from: TextDirectionHeuristicsCompat */
public final class C3687e {

    /* renamed from: a */
    public static final C3686d f11700a = new C3692e((C3690c) null, false);

    /* renamed from: b */
    public static final C3686d f11701b = new C3692e((C3690c) null, true);

    /* renamed from: c */
    public static final C3686d f11702c;

    /* renamed from: d */
    public static final C3686d f11703d;

    /* renamed from: e.h.n.e$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C3688a implements C3690c {

        /* renamed from: b */
        static final C3688a f11704b = new C3688a(true);

        /* renamed from: a */
        private final boolean f11705a;

        private C3688a(boolean z) {
            this.f11705a = z;
        }

        /* renamed from: a */
        public int mo12992a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C3687e.m15800a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f11705a) {
                        return 1;
                    }
                } else if (this.f11705a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f11705a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: e.h.n.e$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C3689b implements C3690c {

        /* renamed from: a */
        static final C3689b f11706a = new C3689b();

        private C3689b() {
        }

        /* renamed from: a */
        public int mo12992a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C3687e.m15801b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: e.h.n.e$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    private interface C3690c {
        /* renamed from: a */
        int mo12992a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: e.h.n.e$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class C3691d implements C3686d {

        /* renamed from: a */
        private final C3690c f11707a;

        C3691d(C3690c cVar) {
            this.f11707a = cVar;
        }

        /* renamed from: c */
        private boolean m15805c(CharSequence charSequence, int i, int i2) {
            int a = this.f11707a.mo12992a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo12993b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo12991a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.f11707a == null) {
                return mo12993b();
            } else {
                return m15805c(charSequence, i, i2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo12993b();
    }

    /* renamed from: e.h.n.e$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C3692e extends C3691d {

        /* renamed from: b */
        private final boolean f11708b;

        C3692e(C3690c cVar, boolean z) {
            super(cVar);
            this.f11708b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo12993b() {
            return this.f11708b;
        }
    }

    /* renamed from: e.h.n.e$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class C3693f extends C3691d {

        /* renamed from: b */
        static final C3693f f11709b = new C3693f();

        C3693f() {
            super((C3690c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo12993b() {
            return C3694f.m15811b(Locale.getDefault()) == 1;
        }
    }

    static {
        C3689b bVar = C3689b.f11706a;
        f11702c = new C3692e(bVar, false);
        f11703d = new C3692e(bVar, true);
        C3688a aVar = C3688a.f11704b;
        C3693f fVar = C3693f.f11709b;
    }

    /* renamed from: a */
    static int m15800a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m15801b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
