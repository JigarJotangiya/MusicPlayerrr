package kotlinx.coroutines.p401i3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8774h1;
import kotlinx.coroutines.C8894q;
import kotlinx.coroutines.C8901r;
import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8909t;
import kotlinx.coroutines.internal.C8816d;
import kotlinx.coroutines.internal.C8840m;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8855v;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8535h;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: kotlinx.coroutines.i3.c */
/* compiled from: Mutex.kt */
public final class C8802c implements C8801b {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35189a = AtomicReferenceFieldUpdater.newUpdater(C8802c.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* renamed from: kotlinx.coroutines.i3.c$a */
    /* compiled from: Mutex.kt */
    private final class C8803a extends C8805b {

        /* renamed from: l */
        private final C8894q<C8457t> f35190l;

        /* renamed from: kotlinx.coroutines.i3.c$a$a */
        /* compiled from: Mutex.kt */
        static final class C8804a extends C8595m implements C8570l<Throwable, C8457t> {
            final /* synthetic */ C8802c this$0;
            final /* synthetic */ C8803a this$1;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8804a(C8802c cVar, C8803a aVar) {
                super(1);
                this.this$0 = cVar;
                this.this$1 = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C8457t.f34900a;
            }

            public final void invoke(Throwable th) {
                this.this$0.mo31087b(this.this$1.f35193j);
            }
        }

        public C8803a(Object obj, C8894q<? super C8457t> qVar) {
            super(C8802c.this, obj);
            this.f35190l = qVar;
        }

        /* renamed from: B */
        public boolean mo31090B() {
            if (mo31093A() && this.f35190l.mo31217e(C8457t.f34900a, (Object) null, new C8804a(C8802c.this, this)) != null) {
                return true;
            }
            return false;
        }

        public String toString() {
            return "LockCont[" + this.f35193j + ", " + this.f35190l + "] for " + C8802c.this;
        }

        /* renamed from: z */
        public void mo31091z() {
            this.f35190l.mo31220h(C8905s.f35297a);
        }
    }

    /* renamed from: kotlinx.coroutines.i3.c$b */
    /* compiled from: Mutex.kt */
    private abstract class C8805b extends C8842o implements C8774h1 {

        /* renamed from: k */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f35192k = AtomicReferenceFieldUpdater.newUpdater(C8805b.class, Object.class, "isTaken");
        private volatile /* synthetic */ Object isTaken = Boolean.FALSE;

        /* renamed from: j */
        public final Object f35193j;

        public C8805b(C8802c cVar, Object obj) {
            this.f35193j = obj;
        }

        /* renamed from: A */
        public final boolean mo31093A() {
            return f35192k.compareAndSet(this, Boolean.FALSE, Boolean.TRUE);
        }

        /* renamed from: B */
        public abstract boolean mo31090B();

        /* renamed from: k */
        public final void mo31008k() {
            mo31140u();
        }

        /* renamed from: z */
        public abstract void mo31091z();
    }

    /* renamed from: kotlinx.coroutines.i3.c$c */
    /* compiled from: Mutex.kt */
    private static final class C8806c extends C8840m {

        /* renamed from: j */
        public Object f35194j;

        public C8806c(Object obj) {
            this.f35194j = obj;
        }

        public String toString() {
            return "LockedQueue[" + this.f35194j + ']';
        }
    }

    /* renamed from: kotlinx.coroutines.i3.c$d */
    /* compiled from: Mutex.kt */
    private static final class C8807d extends C8816d<C8802c> {

        /* renamed from: b */
        public final C8806c f35195b;

        public C8807d(C8806c cVar) {
            this.f35195b = cVar;
        }

        /* renamed from: h */
        public void mo31094d(C8802c cVar, Object obj) {
            C8802c.f35189a.compareAndSet(cVar, this, obj == null ? C8809d.f35200e : this.f35195b);
        }

        /* renamed from: i */
        public Object mo30938g(C8802c cVar) {
            if (this.f35195b.mo31141z()) {
                return null;
            }
            return C8809d.f35196a;
        }
    }

    /* renamed from: kotlinx.coroutines.i3.c$e */
    /* compiled from: Mutex.kt */
    static final class C8808e extends C8595m implements C8570l<Throwable, C8457t> {
        final /* synthetic */ Object $owner;
        final /* synthetic */ C8802c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8808e(C8802c cVar, Object obj) {
            super(1);
            this.this$0 = cVar;
            this.$owner = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C8457t.f34900a;
        }

        public final void invoke(Throwable th) {
            this.this$0.mo31087b(this.$owner);
        }
    }

    public C8802c(boolean z) {
        this._state = z ? C8809d.f35199d : C8809d.f35200e;
    }

    /* renamed from: c */
    private final Object m47480c(Object obj, C8508d<? super C8457t> dVar) {
        C8901r<? super C8457t> b = C8909t.m47814b(C8522c.m46721c(dVar));
        C8803a aVar = new C8803a(obj, b);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C8800a) {
                C8800a aVar2 = (C8800a) obj2;
                if (aVar2.f35188a != C8809d.f35198c) {
                    f35189a.compareAndSet(this, obj2, new C8806c(aVar2.f35188a));
                } else {
                    if (f35189a.compareAndSet(this, obj2, obj == null ? C8809d.f35199d : new C8800a(obj))) {
                        b.mo31219g(C8457t.f34900a, new C8808e(this, obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C8806c) {
                C8806c cVar = (C8806c) obj2;
                if (cVar.f35194j != obj) {
                    cVar.mo31142h(aVar);
                    if (this._state == obj2 || !aVar.mo31093A()) {
                        C8909t.m47815c(b, aVar);
                    } else {
                        aVar = new C8803a(obj, b);
                    }
                } else {
                    throw new IllegalStateException(C8594l.m46777k("Already locked by ", obj).toString());
                }
            } else if (obj2 instanceof C8855v) {
                ((C8855v) obj2).mo31102c(this);
            } else {
                throw new IllegalStateException(C8594l.m46777k("Illegal state ", obj2).toString());
            }
        }
        Object v = b.mo31235v();
        if (v == C8527d.m46722d()) {
            C8535h.m46737c(dVar);
        }
        return v == C8527d.m46722d() ? v : C8457t.f34900a;
    }

    /* renamed from: a */
    public Object mo31086a(Object obj, C8508d<? super C8457t> dVar) {
        if (mo31088d(obj)) {
            return C8457t.f34900a;
        }
        Object c = m47480c(obj, dVar);
        return c == C8527d.m46722d() ? c : C8457t.f34900a;
    }

    /* renamed from: b */
    public void mo31087b(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C8800a) {
                if (obj == null) {
                    if (((C8800a) obj2).f35188a == C8809d.f35198c) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C8800a aVar = (C8800a) obj2;
                    if (aVar.f35188a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar.f35188a + " but expected " + obj).toString());
                    }
                }
                if (f35189a.compareAndSet(this, obj2, C8809d.f35200e)) {
                    return;
                }
            } else if (obj2 instanceof C8855v) {
                ((C8855v) obj2).mo31102c(this);
            } else if (obj2 instanceof C8806c) {
                if (obj != null) {
                    C8806c cVar = (C8806c) obj2;
                    if (cVar.f35194j != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.f35194j + " but expected " + obj).toString());
                    }
                }
                C8806c cVar2 = (C8806c) obj2;
                C8842o v = cVar2.mo31150v();
                if (v == null) {
                    C8807d dVar = new C8807d(cVar2);
                    if (f35189a.compareAndSet(this, obj2, dVar) && dVar.mo31102c(this) == null) {
                        return;
                    }
                } else {
                    C8805b bVar = (C8805b) v;
                    if (bVar.mo31090B()) {
                        Object obj3 = bVar.f35193j;
                        if (obj3 == null) {
                            obj3 = C8809d.f35197b;
                        }
                        cVar2.f35194j = obj3;
                        bVar.mo31091z();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(C8594l.m46777k("Illegal state ", obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean mo31088d(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C8800a) {
                if (((C8800a) obj2).f35188a != C8809d.f35198c) {
                    return false;
                }
                if (f35189a.compareAndSet(this, obj2, obj == null ? C8809d.f35199d : new C8800a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C8806c) {
                if (((C8806c) obj2).f35194j == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(C8594l.m46777k("Already locked by ", obj).toString());
            } else if (obj2 instanceof C8855v) {
                ((C8855v) obj2).mo31102c(this);
            } else {
                throw new IllegalStateException(C8594l.m46777k("Illegal state ", obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C8800a) {
                return "Mutex[" + ((C8800a) obj).f35188a + ']';
            } else if (obj instanceof C8855v) {
                ((C8855v) obj).mo31102c(this);
            } else if (obj instanceof C8806c) {
                return "Mutex[" + ((C8806c) obj).f35194j + ']';
            } else {
                throw new IllegalStateException(C8594l.m46777k("Illegal state ", obj).toString());
            }
        }
    }
}
