package kotlinx.coroutines;

import kotlinx.coroutines.internal.C8817d0;
import kotlinx.coroutines.internal.C8857x;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;

/* renamed from: kotlinx.coroutines.b3 */
/* compiled from: CoroutineContext.kt */
public final class C8678b3<T> extends C8857x<T> {

    /* renamed from: j */
    private C8513g f35040j;

    /* renamed from: k */
    private Object f35041k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8678b3(p369i.p379w.C8513g r3, p369i.p379w.C8508d<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.c3 r0 = kotlinx.coroutines.C8683c3.f35046g
            i.w.g$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000c
            i.w.g r3 = r3.plus(r0)
        L_0x000c:
            r2.<init>(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8678b3.<init>(i.w.g, i.w.d):void");
    }

    /* renamed from: C0 */
    public final boolean mo30886C0() {
        if (this.f35040j == null) {
            return false;
        }
        this.f35040j = null;
        this.f35041k = null;
        return true;
    }

    /* renamed from: D0 */
    public final void mo30887D0(C8513g gVar, Object obj) {
        this.f35040j = gVar;
        this.f35041k = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo30888w0(Object obj) {
        C8513g gVar = this.f35040j;
        C8678b3<?> b3Var = null;
        if (gVar != null) {
            C8817d0.m47525a(gVar, this.f35041k);
            this.f35040j = b3Var;
            this.f35041k = b3Var;
        }
        Object a = C8861j0.m47658a(obj, this.f35254i);
        C8508d<T> dVar = this.f35254i;
        C8513g context = dVar.getContext();
        Object c = C8817d0.m47527c(context, b3Var);
        if (c != C8817d0.f35207a) {
            b3Var = C8869l0.m47696e(dVar, context, c);
        }
        try {
            this.f35254i.resumeWith(a);
            C8457t tVar = C8457t.f34900a;
        } finally {
            if (b3Var == null || b3Var.mo30886C0()) {
                C8817d0.m47525a(context, c);
            }
        }
    }
}
