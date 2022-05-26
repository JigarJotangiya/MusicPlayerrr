package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8817d0;
import kotlinx.coroutines.internal.C8825g;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.e1 */
/* compiled from: DispatchedTask.kt */
public final class C8692e1 {
    /* renamed from: a */
    public static final <T> void m47136a(C8686d1<? super T> d1Var, int i) {
        boolean z = true;
        if (C8919v0.m47824a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        C8508d<? super T> c = d1Var.mo30900c();
        if (i != 4) {
            z = false;
        }
        if (z || !(c instanceof C8825g) || m47137b(i) != m47137b(d1Var.f35048i)) {
            m47139d(d1Var, c, z);
            return;
        }
        C8876m0 m0Var = ((C8825g) c).f35215j;
        C8513g context = c.getContext();
        if (m0Var.mo30867O0(context)) {
            m0Var.mo30866N0(context, d1Var);
        } else {
            m47140e(d1Var);
        }
    }

    /* renamed from: b */
    public static final boolean m47137b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m47138c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m47139d(C8686d1<? super T> d1Var, C8508d<? super T> dVar, boolean z) {
        Object obj;
        Object k = d1Var.mo30904k();
        Throwable d = d1Var.mo30901d(k);
        if (d != null) {
            C8447l.C8448a aVar = C8447l.Companion;
            obj = C8450m.m46574a(d);
        } else {
            C8447l.C8448a aVar2 = C8447l.Companion;
            obj = d1Var.mo30902i(k);
        }
        Object r3 = C8447l.m50326constructorimpl(obj);
        if (z) {
            C8825g gVar = (C8825g) dVar;
            C8508d<T> dVar2 = gVar.f35216k;
            Object obj2 = gVar.f35218m;
            C8513g context = dVar2.getContext();
            Object c = C8817d0.m47527c(context, obj2);
            C8678b3<?> e = c != C8817d0.f35207a ? C8869l0.m47696e(dVar2, context, c) : null;
            try {
                gVar.f35216k.resumeWith(r3);
                C8457t tVar = C8457t.f34900a;
            } finally {
                if (e == null || e.mo30886C0()) {
                    C8817d0.m47525a(context, c);
                }
            }
        } else {
            dVar.resumeWith(r3);
        }
    }

    /* renamed from: e */
    private static final void m47140e(C8686d1<?> d1Var) {
        C8866k1 b = C8929x2.f35315a.mo31251b();
        if (b.mo31183W0()) {
            b.mo31180S0(d1Var);
            return;
        }
        b.mo31182U0(true);
        try {
            m47139d(d1Var, d1Var.mo30900c(), true);
            do {
            } while (b.mo31186Z0());
        } catch (Throwable th) {
            b.mo31179P0(true);
            throw th;
        }
        b.mo31179P0(true);
    }
}
