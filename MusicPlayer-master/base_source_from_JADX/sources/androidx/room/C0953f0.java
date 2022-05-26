package androidx.room;

import p082e.p149u.p150a.C4222f;

/* renamed from: androidx.room.f0 */
/* compiled from: EntityDeletionOrUpdateAdapter */
public abstract class C0953f0<T> extends C1025z0 {
    public C0953f0(C0994s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo5475g(C4222f fVar, T t);

    /* renamed from: h */
    public final int mo5476h(T t) {
        C4222f a = mo5690a();
        try {
            mo5475g(a, t);
            return a.mo5568u();
        } finally {
            mo5693f(a);
        }
    }

    /* renamed from: i */
    public final int mo5477i(Iterable<? extends T> iterable) {
        C4222f a = mo5690a();
        int i = 0;
        try {
            for (Object g : iterable) {
                mo5475g(a, g);
                i += a.mo5568u();
            }
            return i;
        } finally {
            mo5693f(a);
        }
    }
}
