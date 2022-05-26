package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.internal.o */
/* compiled from: LockFreeLinkedList.kt */
public class C8842o {

    /* renamed from: g */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35231g;

    /* renamed from: h */
    static final /* synthetic */ AtomicReferenceFieldUpdater f35232h;

    /* renamed from: i */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35233i;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.o$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C8843a extends C8812b {
    }

    /* renamed from: kotlinx.coroutines.internal.o$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C8844b extends C8816d<C8842o> {

        /* renamed from: b */
        public final C8842o f35234b;

        /* renamed from: c */
        public C8842o f35235c;

        public C8844b(C8842o oVar) {
            this.f35234b = oVar;
        }

        /* renamed from: h */
        public void mo31094d(C8842o oVar, Object obj) {
            boolean z = obj == null;
            C8842o oVar2 = z ? this.f35234b : this.f35235c;
            if (oVar2 != null && C8842o.f35231g.compareAndSet(oVar, this, oVar2) && z) {
                C8842o oVar3 = this.f35234b;
                C8842o oVar4 = this.f35235c;
                C8594l.m46769c(oVar4);
                oVar3.m47585n(oVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.o$c */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C8845c extends C8855v {

        /* renamed from: a */
        public final C8843a f35236a;

        /* renamed from: d */
        public final void mo31154d() {
            throw null;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C8842o> cls2 = C8842o.class;
        f35231g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f35232h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f35233i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.o} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (f35231g.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.C8856w) r4).f35253a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C8842o m47583l(kotlinx.coroutines.internal.C8855v r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.o r0 = (kotlinx.coroutines.internal.C8842o) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f35232h
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo31139t()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C8855v
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.v r0 = (kotlinx.coroutines.internal.C8855v) r0
            boolean r0 = r8.mo31172b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.v r4 = (kotlinx.coroutines.internal.C8855v) r4
            r4.mo31102c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C8856w
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f35231g
            kotlinx.coroutines.internal.w r4 = (kotlinx.coroutines.internal.C8856w) r4
            kotlinx.coroutines.internal.o r4 = r4.f35253a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.o r2 = (kotlinx.coroutines.internal.C8842o) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.o r3 = (kotlinx.coroutines.internal.C8842o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C8842o.m47583l(kotlinx.coroutines.internal.v):kotlinx.coroutines.internal.o");
    }

    /* renamed from: m */
    private final C8842o m47584m(C8842o oVar) {
        while (oVar.mo31139t()) {
            oVar = (C8842o) oVar._prev;
        }
        return oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m47585n(C8842o oVar) {
        C8842o oVar2;
        do {
            oVar2 = (C8842o) oVar._prev;
            if (mo31145o() != oVar) {
                return;
            }
        } while (!f35232h.compareAndSet(oVar, oVar2, this));
        if (mo31139t()) {
            oVar.m47583l((C8855v) null);
        }
    }

    /* renamed from: x */
    private final C8856w m47586x() {
        C8856w wVar = (C8856w) this._removedRef;
        if (wVar != null) {
            return wVar;
        }
        C8856w wVar2 = new C8856w(this);
        f35233i.lazySet(this, wVar2);
        return wVar2;
    }

    /* renamed from: h */
    public final void mo31142h(C8842o oVar) {
        do {
        } while (!mo31147q().mo31143i(oVar, this));
    }

    /* renamed from: i */
    public final boolean mo31143i(C8842o oVar, C8842o oVar2) {
        f35232h.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35231g;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, oVar)) {
            return false;
        }
        oVar.m47585n(oVar2);
        return true;
    }

    /* renamed from: j */
    public final boolean mo31144j(C8842o oVar) {
        f35232h.lazySet(oVar, this);
        f35231g.lazySet(oVar, this);
        while (mo31145o() == this) {
            if (f35231g.compareAndSet(this, this, oVar)) {
                oVar.m47585n(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Object mo31145o() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C8855v)) {
                return obj;
            }
            ((C8855v) obj).mo31102c(this);
        }
    }

    /* renamed from: p */
    public final C8842o mo31146p() {
        return C8841n.m47581b(mo31145o());
    }

    /* renamed from: q */
    public final C8842o mo31147q() {
        C8842o l = m47583l((C8855v) null);
        return l == null ? m47584m((C8842o) this._prev) : l;
    }

    /* renamed from: r */
    public final void mo31148r() {
        ((C8856w) mo31145o()).f35253a.mo31149s();
    }

    /* renamed from: s */
    public final void mo31149s() {
        C8842o oVar = this;
        while (true) {
            Object o = oVar.mo31145o();
            if (!(o instanceof C8856w)) {
                oVar.m47583l((C8855v) null);
                return;
            }
            oVar = ((C8856w) o).f35253a;
        }
    }

    /* renamed from: t */
    public boolean mo31139t() {
        return mo31145o() instanceof C8856w;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    /* renamed from: u */
    public boolean mo31140u() {
        return mo31151w() == null;
    }

    /* renamed from: v */
    public final C8842o mo31150v() {
        while (true) {
            C8842o oVar = (C8842o) mo31145o();
            if (oVar == this) {
                return null;
            }
            if (oVar.mo31140u()) {
                return oVar;
            }
            oVar.mo31148r();
        }
    }

    /* renamed from: w */
    public final C8842o mo31151w() {
        Object o;
        C8842o oVar;
        do {
            o = mo31145o();
            if (o instanceof C8856w) {
                return ((C8856w) o).f35253a;
            }
            if (o == this) {
                return (C8842o) o;
            }
            oVar = (C8842o) o;
        } while (!f35231g.compareAndSet(this, o, oVar.m47586x()));
        oVar.m47583l((C8855v) null);
        return null;
    }

    /* renamed from: y */
    public final int mo31152y(C8842o oVar, C8842o oVar2, C8844b bVar) {
        f35232h.lazySet(oVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35231g;
        atomicReferenceFieldUpdater.lazySet(oVar, oVar2);
        bVar.f35235c = oVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, oVar2, bVar)) {
            return 0;
        }
        return bVar.mo31102c(this) == null ? 1 : 2;
    }
}
