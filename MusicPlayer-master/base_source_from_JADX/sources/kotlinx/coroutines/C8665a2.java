package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p369i.C8457t;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.a2 */
/* compiled from: Job.kt */
public interface C8665a2 extends C8513g.C8516b {

    /* renamed from: f */
    public static final C8667b f35030f = C8667b.f35031g;

    /* renamed from: kotlinx.coroutines.a2$a */
    /* compiled from: Job.kt */
    public static final class C8666a {
        /* renamed from: a */
        public static /* synthetic */ void m47072a(C8665a2 a2Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                a2Var.mo30865z0(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m47073b(C8665a2 a2Var, R r, C8574p<? super R, ? super C8513g.C8516b, ? extends R> pVar) {
            return C8513g.C8516b.C8517a.m46711a(a2Var, r, pVar);
        }

        /* renamed from: c */
        public static <E extends C8513g.C8516b> E m47074c(C8665a2 a2Var, C8513g.C8518c<E> cVar) {
            return C8513g.C8516b.C8517a.m46712b(a2Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C8774h1 m47075d(C8665a2 a2Var, boolean z, boolean z2, C8570l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return a2Var.mo30859H(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C8513g m47076e(C8665a2 a2Var, C8513g.C8518c<?> cVar) {
            return C8513g.C8516b.C8517a.m46713c(a2Var, cVar);
        }

        /* renamed from: f */
        public static C8513g m47077f(C8665a2 a2Var, C8513g gVar) {
            return C8513g.C8516b.C8517a.m46714d(a2Var, gVar);
        }
    }

    /* renamed from: kotlinx.coroutines.a2$b */
    /* compiled from: Job.kt */
    public static final class C8667b implements C8513g.C8518c<C8665a2> {

        /* renamed from: g */
        static final /* synthetic */ C8667b f35031g = new C8667b();

        private C8667b() {
        }
    }

    /* renamed from: H */
    C8774h1 mo30859H(boolean z, boolean z2, C8570l<? super Throwable, C8457t> lVar);

    /* renamed from: K */
    CancellationException mo30860K();

    /* renamed from: L0 */
    C8922w mo30861L0(C8930y yVar);

    /* renamed from: c */
    boolean mo30862c();

    /* renamed from: i0 */
    C8774h1 mo30863i0(C8570l<? super Throwable, C8457t> lVar);

    boolean start();

    /* renamed from: z0 */
    void mo30865z0(CancellationException cancellationException);
}
