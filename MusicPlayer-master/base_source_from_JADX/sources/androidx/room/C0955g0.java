package androidx.room;

import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.g0 */
/* compiled from: EntityInsertionAdapter */
public abstract class C0955g0<T> extends C1025z0 {
    public C0955g0(C0994s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo5478g(C4222f fVar, T t);

    /* renamed from: h */
    public final void mo5479h(T t) {
        C4222f a = mo5690a();
        try {
            mo5478g(a, t);
            a.mo5565I0();
        } finally {
            mo5693f(a);
        }
    }
}
