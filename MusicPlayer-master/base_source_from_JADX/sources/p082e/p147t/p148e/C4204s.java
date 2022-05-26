package p082e.p147t.p148e;

import android.view.MotionEvent;

/* renamed from: e.t.e.s */
/* compiled from: ItemDetailsLookup */
public abstract class C4204s<K> {

    /* renamed from: e.t.e.s$a */
    /* compiled from: ItemDetailsLookup */
    public static abstract class C4205a<K> {
        /* renamed from: f */
        private boolean m18511f(C4205a<?> aVar) {
            boolean z;
            Object b = mo10107b();
            if (b == null) {
                z = aVar.mo10107b() == null;
            } else {
                z = b.equals(aVar.mo10107b());
            }
            if (!z || mo10106a() != aVar.mo10106a()) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public abstract int mo10106a();

        /* renamed from: b */
        public abstract K mo10107b();

        /* renamed from: c */
        public boolean mo14389c() {
            return mo10107b() != null;
        }

        /* renamed from: d */
        public boolean mo14390d(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public boolean mo14391e(MotionEvent motionEvent) {
            return false;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4205a) && m18511f((C4205a) obj);
        }

        public int hashCode() {
            return mo10106a() >>> 8;
        }
    }

    /* renamed from: c */
    private static boolean m18505c(C4205a<?> aVar) {
        return (aVar == null || aVar.mo10107b() == null) ? false : true;
    }

    /* renamed from: a */
    public abstract C4205a<K> mo10098a(MotionEvent motionEvent);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo14385b(MotionEvent motionEvent) {
        C4205a a = mo10098a(motionEvent);
        if (a != null) {
            return a.mo10106a();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo14386d(MotionEvent motionEvent) {
        return mo14387e(motionEvent) && mo10098a(motionEvent).mo14390d(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo14387e(MotionEvent motionEvent) {
        return mo14385b(motionEvent) != -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo14388f(MotionEvent motionEvent) {
        return mo14387e(motionEvent) && m18505c(mo10098a(motionEvent));
    }
}
