package kotlinx.coroutines;

import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.d */
/* compiled from: AbstractCoroutine.kt */
public abstract class C8684d<T> extends C8795i2 implements C8665a2, C8508d<T>, C8902r0 {

    /* renamed from: h */
    private final C8513g f35047h;

    public C8684d(C8513g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            mo31055N((C8665a2) gVar.get(C8665a2.f35030f));
        }
        this.f35047h = gVar.plus(this);
    }

    /* renamed from: A0 */
    public final <R> void mo30892A0(C8910t0 t0Var, R r, C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar) {
        t0Var.invoke(pVar, r, this);
    }

    /* renamed from: M */
    public final void mo30893M(Throwable th) {
        C8886o0.m47742a(this.f35047h, th);
    }

    /* renamed from: W */
    public String mo30894W() {
        String b = C8869l0.m47693b(this.f35047h);
        if (b == null) {
            return super.mo30894W();
        }
        return '\"' + b + "\":" + super.mo30894W();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void mo30895b0(Object obj) {
        if (obj instanceof C8724f0) {
            C8724f0 f0Var = (C8724f0) obj;
            mo30897x0(f0Var.f35091a, f0Var.mo30971a());
            return;
        }
        mo30898y0(obj);
    }

    /* renamed from: c */
    public boolean mo30862c() {
        return super.mo30862c();
    }

    public final C8513g getContext() {
        return this.f35047h;
    }

    public final void resumeWith(Object obj) {
        Object U = mo31059U(C8861j0.m47661d(obj, (C8570l) null, 1, (Object) null));
        if (U != C8863j2.f35260b) {
            mo30888w0(U);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo30896u() {
        return C8594l.m46777k(C8923w0.m47833a(this), " was cancelled");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public void mo30888w0(Object obj) {
        mo30891l(obj);
    }

    /* renamed from: x */
    public C8513g mo4135x() {
        return this.f35047h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public void mo30897x0(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo30898y0(T t) {
    }
}
