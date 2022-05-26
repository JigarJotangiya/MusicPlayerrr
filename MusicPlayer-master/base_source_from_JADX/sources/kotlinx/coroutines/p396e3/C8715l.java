package kotlinx.coroutines.p396e3;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C8905s;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.internal.C8828h0;
import kotlinx.coroutines.internal.C8842o;
import kotlinx.coroutines.internal.C8853u;
import kotlinx.coroutines.internal.C8859z;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.e3.l */
/* compiled from: ConflatedChannel.kt */
public class C8715l<E> extends C8694a<E> {

    /* renamed from: e */
    private final ReentrantLock f35087e = new ReentrantLock();

    /* renamed from: f */
    private Object f35088f = C8699b.f35063a;

    public C8715l(C8570l<? super E, C8457t> lVar) {
        super(lVar);
    }

    /* renamed from: C */
    private final C8828h0 m47224C(Object obj) {
        C8570l<E, C8457t> lVar;
        Object obj2 = this.f35088f;
        C8828h0 h0Var = null;
        if (!(obj2 == C8699b.f35063a || (lVar = this.f35069b) == null)) {
            h0Var = C8853u.m47637d(lVar, obj2, (C8828h0) null, 2, (Object) null);
        }
        this.f35088f = obj;
        return h0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo30942f() {
        return "(value=" + this.f35088f + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Object mo30945m(E e) {
        C8719p p;
        C8859z f;
        ReentrantLock reentrantLock = this.f35087e;
        reentrantLock.lock();
        try {
            C8712i<?> g = mo30943g();
            if (g == null) {
                if (this.f35088f == C8699b.f35063a) {
                    do {
                        p = mo30923p();
                        if (p != null) {
                            if (p instanceof C8712i) {
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
                    C8457t tVar = C8457t.f34900a;
                    reentrantLock.unlock();
                    p.mo30932e(e);
                    return p.mo30968a();
                }
                C8828h0 C = m47224C(e);
                if (C == null) {
                    C8859z zVar = C8699b.f35064b;
                    reentrantLock.unlock();
                    return zVar;
                }
                throw C;
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
        ReentrantLock reentrantLock = this.f35087e;
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
        return this.f35088f == C8699b.f35063a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Object mo30929z() {
        ReentrantLock reentrantLock = this.f35087e;
        reentrantLock.lock();
        try {
            Object obj = this.f35088f;
            C8859z zVar = C8699b.f35063a;
            if (obj == zVar) {
                Object g = mo30943g();
                if (g == null) {
                    g = C8699b.f35066d;
                }
                return g;
            }
            this.f35088f = zVar;
            C8457t tVar = C8457t.f34900a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
