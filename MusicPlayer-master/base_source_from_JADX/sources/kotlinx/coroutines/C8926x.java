package kotlinx.coroutines;

import p369i.C8457t;

/* renamed from: kotlinx.coroutines.x */
/* compiled from: JobSupport.kt */
public final class C8926x extends C8682c2 implements C8922w {

    /* renamed from: k */
    public final C8930y f35311k;

    public C8926x(C8930y yVar) {
        this.f35311k = yVar;
    }

    /* renamed from: d */
    public boolean mo31205d(Throwable th) {
        return mo31009A().mo31071v(th);
    }

    public C8665a2 getParent() {
        return mo31009A();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo31007z((Throwable) obj);
        return C8457t.f34900a;
    }

    /* renamed from: z */
    public void mo31007z(Throwable th) {
        this.f35311k.mo31058T(mo31009A());
    }
}
