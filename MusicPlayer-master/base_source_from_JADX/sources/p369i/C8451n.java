package p369i;

import java.io.Serializable;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: i.n */
/* compiled from: LazyJVM.kt */
final class C8451n<T> implements C8418f<T>, Serializable {
    private volatile Object _value;
    private C8559a<? extends T> initializer;
    private final Object lock;

    public C8451n(C8559a<? extends T> aVar, Object obj) {
        C8594l.m46771e(aVar, "initializer");
        this.initializer = aVar;
        this._value = C8455r.f34899a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C8393d(getValue());
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        T t3 = C8455r.f34899a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                C8559a aVar = this.initializer;
                C8594l.m46769c(aVar);
                t = aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public boolean isInitialized() {
        return this._value != C8455r.f34899a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8451n(C8559a aVar, Object obj, int i, C8589g gVar) {
        this(aVar, (i & 2) != 0 ? null : obj);
    }
}
