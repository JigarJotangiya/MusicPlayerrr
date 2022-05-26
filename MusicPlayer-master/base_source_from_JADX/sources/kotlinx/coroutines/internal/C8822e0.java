package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.internal.C8824f0;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.internal.e0 */
/* compiled from: ThreadSafeHeap.kt */
public class C8822e0<T extends C8824f0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f35212a;

    /* renamed from: f */
    private final T[] m47529f() {
        T[] tArr = this.f35212a;
        if (tArr == null) {
            T[] tArr2 = new C8824f0[4];
            this.f35212a = tArr2;
            return tArr2;
        } else if (mo31110c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo31110c() * 2);
            C8594l.m46770d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C8824f0[]) copyOf;
            this.f35212a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m47530j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m47531k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo31110c()) {
                T[] tArr = this.f35212a;
                C8594l.m46769c(tArr);
                int i3 = i2 + 1;
                if (i3 < mo31110c()) {
                    T t = tArr[i3];
                    C8594l.m46769c(t);
                    T t2 = tArr[i2];
                    C8594l.m46769c(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C8594l.m46769c(t3);
                T t4 = tArr[i2];
                C8594l.m46769c(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m47533m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m47532l(int i) {
        while (i > 0) {
            T[] tArr = this.f35212a;
            C8594l.m46769c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C8594l.m46769c(t);
            T t2 = tArr[i];
            C8594l.m46769c(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m47533m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m47533m(int i, int i2) {
        T[] tArr = this.f35212a;
        C8594l.m46769c(tArr);
        T t = tArr[i2];
        C8594l.m46769c(t);
        T t2 = tArr[i];
        C8594l.m46769c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo31119j(i);
        t2.mo31119j(i2);
    }

    /* renamed from: a */
    public final void mo31108a(T t) {
        if (C8919v0.m47824a()) {
            if (!(t.mo31118h() == null)) {
                throw new AssertionError();
            }
        }
        t.mo31117c(this);
        C8824f0[] f = m47529f();
        int c = mo31110c();
        m47530j(c + 1);
        f[c] = t;
        t.mo31119j(c);
        m47532l(c);
    }

    /* renamed from: b */
    public final T mo31109b() {
        T[] tArr = this.f35212a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo31110c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo31111d() {
        return mo31110c() == 0;
    }

    /* renamed from: e */
    public final T mo31112e() {
        T b;
        synchronized (this) {
            b = mo31109b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo31113g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo31118h() == null) {
                z = false;
            } else {
                int l = t.mo31120l();
                if (C8919v0.m47824a()) {
                    if (l >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo31114h(l);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo31114h(int i) {
        boolean z = false;
        if (C8919v0.m47824a()) {
            if (!(mo31110c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f35212a;
        C8594l.m46769c(tArr);
        m47530j(mo31110c() - 1);
        if (i < mo31110c()) {
            m47533m(i, mo31110c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C8594l.m46769c(t);
                T t2 = tArr[i2];
                C8594l.m46769c(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m47533m(i, i2);
                    m47532l(i2);
                }
            }
            m47531k(i);
        }
        T t3 = tArr[mo31110c()];
        C8594l.m46769c(t3);
        if (C8919v0.m47824a()) {
            if (t3.mo31118h() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.mo31117c((C8822e0<?>) null);
        t3.mo31119j(-1);
        tArr[mo31110c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo31115i() {
        T h;
        synchronized (this) {
            h = mo31110c() > 0 ? mo31114h(0) : null;
        }
        return h;
    }
}
