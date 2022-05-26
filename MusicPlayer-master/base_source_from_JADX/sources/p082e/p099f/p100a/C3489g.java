package p082e.p099f.p100a;

/* renamed from: e.f.a.g */
/* compiled from: Pools */
class C3489g<T> implements C3488f<T> {

    /* renamed from: a */
    private final Object[] f11122a;

    /* renamed from: b */
    private int f11123b;

    C3489g(int i) {
        if (i > 0) {
            this.f11122a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo12485a(T t) {
        int i = this.f11123b;
        Object[] objArr = this.f11122a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f11123b = i + 1;
        return true;
    }

    /* renamed from: b */
    public T mo12486b() {
        int i = this.f11123b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f11122a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f11123b = i - 1;
        return t;
    }

    /* renamed from: c */
    public void mo12487c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f11123b;
            Object[] objArr = this.f11122a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f11123b = i3 + 1;
            }
        }
    }
}
