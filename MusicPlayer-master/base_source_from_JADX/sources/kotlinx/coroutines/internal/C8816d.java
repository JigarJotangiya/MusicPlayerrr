package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8919v0;

/* renamed from: kotlinx.coroutines.internal.d */
/* compiled from: Atomic.kt */
public abstract class C8816d<T> extends C8855v {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35206a = AtomicReferenceFieldUpdater.newUpdater(C8816d.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C8814c.f35205a;

    /* renamed from: a */
    public C8816d<?> mo31101a() {
        return this;
    }

    /* renamed from: c */
    public final Object mo31102c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C8814c.f35205a) {
            obj2 = mo31103e(mo30938g(obj));
        }
        mo31094d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo31094d(T t, Object obj);

    /* renamed from: e */
    public final Object mo31103e(Object obj) {
        if (C8919v0.m47824a()) {
            if (!(obj != C8814c.f35205a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C8814c.f35205a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (f35206a.compareAndSet(this, obj3, obj)) {
            return obj;
        }
        return this._consensus;
    }

    /* renamed from: f */
    public long mo31104f() {
        return 0;
    }

    /* renamed from: g */
    public abstract Object mo30938g(T t);
}
