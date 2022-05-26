package kotlinx.coroutines;

import kotlinx.coroutines.p399g3.C8770a;
import kotlinx.coroutines.p399g3.C8771b;
import p369i.C8445j;
import p369i.p379w.C8508d;
import p369i.p379w.C8512f;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.t0 */
/* compiled from: CoroutineStart.kt */
public enum C8910t0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: kotlinx.coroutines.t0$a */
    /* compiled from: CoroutineStart.kt */
    public /* synthetic */ class C8911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35301a = null;

        static {
            int[] iArr = new int[C8910t0.values().length];
            iArr[C8910t0.DEFAULT.ordinal()] = 1;
            iArr[C8910t0.ATOMIC.ordinal()] = 2;
            iArr[C8910t0.UNDISPATCHED.ordinal()] = 3;
            iArr[C8910t0.LAZY.ordinal()] = 4;
            f35301a = iArr;
        }
    }

    public final <T> void invoke(C8570l<? super C8508d<? super T>, ? extends Object> lVar, C8508d<? super T> dVar) {
        int i = C8911a.f35301a[ordinal()];
        if (i == 1) {
            C8770a.m47313d(lVar, dVar);
        } else if (i == 2) {
            C8512f.m46708a(lVar, dVar);
        } else if (i == 3) {
            C8771b.m47316a(lVar, dVar);
        } else if (i != 4) {
            throw new C8445j();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    public final <R, T> void invoke(C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar, R r, C8508d<? super T> dVar) {
        int i = C8911a.f35301a[ordinal()];
        if (i == 1) {
            C8770a.m47315f(pVar, r, dVar, (C8570l) null, 4, (Object) null);
        } else if (i == 2) {
            C8512f.m46709b(pVar, r, dVar);
        } else if (i == 3) {
            C8771b.m47317b(pVar, r, dVar);
        } else if (i != 4) {
            throw new C8445j();
        }
    }
}
