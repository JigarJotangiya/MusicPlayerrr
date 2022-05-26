package androidx.fragment.app;

import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0718v;
import androidx.lifecycle.C0720x;

/* renamed from: androidx.fragment.app.t */
/* compiled from: FragmentViewLifecycleOwner */
class C0641t implements C0718v {

    /* renamed from: g */
    private C0720x f3224g = null;

    C0641t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4128a(C0697n.C0699b bVar) {
        this.f3224g.mo4268h(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4129b() {
        if (this.f3224g == null) {
            this.f3224g = new C0720x(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4130c() {
        return this.f3224g != null;
    }

    /* renamed from: v */
    public C0697n mo390v() {
        mo4129b();
        return this.f3224g;
    }
}
