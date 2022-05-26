package kotlinx.coroutines.internal;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.internal.a */
/* compiled from: ArrayQueue.kt */
public class C8810a<T> {

    /* renamed from: a */
    private Object[] f35201a = new Object[16];

    /* renamed from: b */
    private int f35202b;

    /* renamed from: c */
    private int f35203c;

    /* renamed from: b */
    private final void m47501b() {
        Object[] objArr = this.f35201a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C8475g.m46619f(objArr, objArr3, 0, this.f35202b, 0, 10, (Object) null);
        Object[] objArr4 = this.f35201a;
        int length2 = objArr4.length;
        int i = this.f35202b;
        Object[] unused2 = C8475g.m46619f(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f35201a = objArr3;
        this.f35202b = 0;
        this.f35203c = length;
    }

    /* renamed from: a */
    public final void mo31098a(T t) {
        Object[] objArr = this.f35201a;
        int i = this.f35203c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f35203c = length;
        if (length == this.f35202b) {
            m47501b();
        }
    }

    /* renamed from: c */
    public final boolean mo31099c() {
        return this.f35202b == this.f35203c;
    }

    /* renamed from: d */
    public final T mo31100d() {
        int i = this.f35202b;
        if (i == this.f35203c) {
            return null;
        }
        T[] tArr = this.f35201a;
        T t = tArr[i];
        tArr[i] = null;
        this.f35202b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
