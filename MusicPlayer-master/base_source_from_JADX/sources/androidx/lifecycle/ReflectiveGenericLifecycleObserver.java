package androidx.lifecycle;

import androidx.lifecycle.C0660c;
import androidx.lifecycle.C0697n;

class ReflectiveGenericLifecycleObserver implements C0715s {

    /* renamed from: g */
    private final Object f3253g;

    /* renamed from: h */
    private final C0660c.C0661a f3254h;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3253g = obj;
        this.f3254h = C0660c.f3275c.mo4199c(obj.getClass());
    }

    /* renamed from: c */
    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
        this.f3254h.mo4201a(vVar, bVar, this.f3253g);
    }
}
