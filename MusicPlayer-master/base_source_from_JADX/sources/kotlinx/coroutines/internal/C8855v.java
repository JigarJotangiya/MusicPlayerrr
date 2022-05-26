package kotlinx.coroutines.internal;

import kotlinx.coroutines.C8923w0;

/* renamed from: kotlinx.coroutines.internal.v */
/* compiled from: Atomic.kt */
public abstract class C8855v {
    /* renamed from: a */
    public abstract C8816d<?> mo31101a();

    /* renamed from: b */
    public final boolean mo31172b(C8855v vVar) {
        C8816d<?> a;
        C8816d<?> a2 = mo31101a();
        if (a2 == null || (a = vVar.mo31101a()) == null || a2.mo31104f() >= a.mo31104f()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public abstract Object mo31102c(Object obj);

    public String toString() {
        return C8923w0.m47833a(this) + '@' + C8923w0.m47834b(this);
    }
}
