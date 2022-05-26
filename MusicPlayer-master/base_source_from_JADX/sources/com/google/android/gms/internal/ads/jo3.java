package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jo3<E> extends wk3<E> implements RandomAccess {

    /* renamed from: j */
    private static final jo3<Object> f18554j;

    /* renamed from: h */
    private E[] f18555h;

    /* renamed from: i */
    private int f18556i;

    static {
        jo3<Object> jo3 = new jo3<>(new Object[0], 0);
        f18554j = jo3;
        jo3.mo21838a();
    }

    private jo3(E[] eArr, int i) {
        this.f18555h = eArr;
        this.f18556i = i;
    }

    /* renamed from: p */
    public static <E> jo3<E> m25807p() {
        return f18554j;
    }

    /* renamed from: s */
    private final String m25808s(int i) {
        int i2 = this.f18556i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: t */
    private final void m25809t(int i) {
        if (i < 0 || i >= this.f18556i) {
            throw new IndexOutOfBoundsException(m25808s(i));
        }
    }

    public final void add(int i, E e) {
        int i2;
        mo21840d();
        if (i < 0 || i > (i2 = this.f18556i)) {
            throw new IndexOutOfBoundsException(m25808s(i));
        }
        E[] eArr = this.f18555h;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f18555h, i, eArr2, i + 1, this.f18556i - i);
            this.f18555h = eArr2;
        }
        this.f18555h[i] = e;
        this.f18556i++;
        this.modCount++;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ym3 mo15868f(int i) {
        if (i >= this.f18556i) {
            return new jo3(Arrays.copyOf(this.f18555h, i), this.f18556i);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i) {
        m25809t(i);
        return this.f18555h[i];
    }

    public final E remove(int i) {
        mo21840d();
        m25809t(i);
        E[] eArr = this.f18555h;
        E e = eArr[i];
        int i2 = this.f18556i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f18556i--;
        this.modCount++;
        return e;
    }

    public final E set(int i, E e) {
        mo21840d();
        m25809t(i);
        E[] eArr = this.f18555h;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f18556i;
    }

    public final boolean add(E e) {
        mo21840d();
        int i = this.f18556i;
        E[] eArr = this.f18555h;
        if (i == eArr.length) {
            this.f18555h = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f18555h;
        int i2 = this.f18556i;
        this.f18556i = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
