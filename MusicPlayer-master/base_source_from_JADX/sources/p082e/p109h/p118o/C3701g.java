package p082e.p109h.p118o;

/* renamed from: e.h.o.g */
/* compiled from: Pools */
public class C3701g<T> implements C3700f<T> {

    /* renamed from: a */
    private final Object[] f11715a;

    /* renamed from: b */
    private int f11716b;

    public C3701g(int i) {
        if (i > 0) {
            this.f11715a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m15819c(T t) {
        for (int i = 0; i < this.f11716b; i++) {
            if (this.f11715a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo8512a(T t) {
        if (!m15819c(t)) {
            int i = this.f11716b;
            Object[] objArr = this.f11715a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f11716b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo8513b() {
        int i = this.f11716b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f11715a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f11716b = i - 1;
        return t;
    }
}
