package kotlinx.coroutines.p396e3;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8859z;
import p369i.C8445j;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.e3.d */
/* compiled from: ArrayChannel.kt */
public class C8702d<E> extends C8694a<E> {

    /* renamed from: e */
    private final int f35072e;

    /* renamed from: f */
    private final C8704e f35073f;

    /* renamed from: g */
    private final ReentrantLock f35074g;

    /* renamed from: h */
    private Object[] f35075h;

    /* renamed from: i */
    private int f35076i;
    private volatile /* synthetic */ int size;

    /* renamed from: kotlinx.coroutines.e3.d$a */
    /* compiled from: ArrayChannel.kt */
    public /* synthetic */ class C8703a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35077a;

        static {
            int[] iArr = new int[C8704e.values().length];
            iArr[C8704e.SUSPEND.ordinal()] = 1;
            iArr[C8704e.DROP_LATEST.ordinal()] = 2;
            iArr[C8704e.DROP_OLDEST.ordinal()] = 3;
            f35077a = iArr;
        }
    }

    public C8702d(int i, C8704e eVar, C8570l<? super E, C8457t> lVar) {
        super(lVar);
        this.f35072e = i;
        this.f35073f = eVar;
        if (i < 1 ? false : true) {
            this.f35074g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C8475g.m46623j(objArr, C8699b.f35063a, 0, 0, 6, (Object) null);
            C8457t tVar = C8457t.f34900a;
            this.f35075h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: C */
    private final void m47188C(int i, E e) {
        if (i < this.f35072e) {
            m47189D(i);
            Object[] objArr = this.f35075h;
            objArr[(this.f35076i + i) % objArr.length] = e;
            return;
        }
        if (C8919v0.m47824a()) {
            if (!(this.f35073f == C8704e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f35075h;
        int i2 = this.f35076i;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f35076i = (i2 + 1) % objArr2.length;
    }

    /* renamed from: D */
    private final void m47189D(int i) {
        Object[] objArr = this.f35075h;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f35072e);
            Object[] objArr2 = new Object[min];
            if (i > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Object[] objArr3 = this.f35075h;
                    objArr2[i2] = objArr3[(this.f35076i + i2) % objArr3.length];
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            C8475g.m46622i(objArr2, C8699b.f35063a, i, min);
            this.f35075h = objArr2;
            this.f35076i = 0;
        }
    }

    /* renamed from: E */
    private final C8859z m47190E(int i) {
        if (i < this.f35072e) {
            this.size = i + 1;
            return null;
        }
        int i2 = C8703a.f35077a[this.f35073f.ordinal()];
        if (i2 == 1) {
            return C8699b.f35065c;
        }
        if (i2 == 2) {
            return C8699b.f35064b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C8445j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo30942f() {
        return "(buffer:capacity=" + this.f35072e + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo30945m(E e) {
        C8719p p;
        C8859z f;
        ReentrantLock reentrantLock = this.f35074g;
        reentrantLock.lock();
        try {
            int i = this.size;
            C8712i<?> g = mo30943g();
            if (g == null) {
                C8859z E = m47190E(i);
                if (E == null) {
                    if (i == 0) {
                        do {
                            p = mo30923p();
                            if (p != null) {
                                if (p instanceof C8712i) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return p;
                                }
                                f = p.mo30933f(e, (C8842o.C8845c) null);
                            }
                        } while (f == null);
                        if (C8919v0.m47824a()) {
                            if (!(f == C8905s.f35297a)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i;
                        C8457t tVar = C8457t.f34900a;
                        reentrantLock.unlock();
                        p.mo30932e(e);
                        return p.mo30968a();
                    }
                    m47188C(i, e);
                    C8859z zVar = C8699b.f35064b;
                    reentrantLock.unlock();
                    return zVar;
                }
                reentrantLock.unlock();
                return E;
            }
            reentrantLock.unlock();
            return g;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo30924u(C8717n<? super E> nVar) {
        ReentrantLock reentrantLock = this.f35074g;
        reentrantLock.lock();
        try {
            return super.mo30924u(nVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo30925v() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo30926w() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object mo30929z() {
        ReentrantLock reentrantLock = this.f35074g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object g = mo30943g();
                if (g == null) {
                    g = C8699b.f35066d;
                }
                return g;
            }
            Object[] objArr = this.f35075h;
            int i2 = this.f35076i;
            Object obj = objArr[i2];
            C8721r rVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C8699b.f35066d;
            boolean z = false;
            if (i == this.f35072e) {
                C8721r rVar2 = null;
                while (true) {
                    C8721r q = mo30948q();
                    if (q == null) {
                        rVar = rVar2;
                        break;
                    }
                    C8859z B = q.mo30951B((C8842o.C8845c) null);
                    if (B != null) {
                        if (C8919v0.m47824a()) {
                            if (B == C8905s.f35297a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = q.mo30950A();
                        rVar = q;
                        z = true;
                    } else {
                        q.mo30970C();
                        rVar2 = q;
                    }
                }
            }
            if (obj2 != C8699b.f35066d && !(obj2 instanceof C8712i)) {
                this.size = i;
                Object[] objArr2 = this.f35075h;
                objArr2[(this.f35076i + i) % objArr2.length] = obj2;
            }
            this.f35076i = (this.f35076i + 1) % this.f35075h.length;
            C8457t tVar = C8457t.f34900a;
            reentrantLock.unlock();
            if (z) {
                C8594l.m46769c(rVar);
                rVar.mo30952z();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
