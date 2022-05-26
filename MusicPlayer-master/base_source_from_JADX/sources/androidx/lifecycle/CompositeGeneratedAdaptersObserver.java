package androidx.lifecycle;

import androidx.lifecycle.C0697n;

class CompositeGeneratedAdaptersObserver implements C0715s {

    /* renamed from: g */
    private final C0691l[] f3225g;

    CompositeGeneratedAdaptersObserver(C0691l[] lVarArr) {
        this.f3225g = lVarArr;
    }

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        C0666d0 d0Var = new C0666d0();
        for (C0691l a : this.f3225g) {
            a.mo4252a(vVar, bVar, false, d0Var);
        }
        for (C0691l a2 : this.f3225g) {
            a2.mo4252a(vVar, bVar, true, d0Var);
        }
    }
}
