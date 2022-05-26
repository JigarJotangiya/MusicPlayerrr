package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class on3 extends wk3<Long> implements RandomAccess, xm3, ho3 {

    /* renamed from: j */
    private static final on3 f21087j;

    /* renamed from: h */
    private long[] f21088h;

    /* renamed from: i */
    private int f21089i;

    static {
        on3 on3 = new on3(new long[0], 0);
        f21087j = on3;
        on3.mo21838a();
    }

    on3() {
        this(new long[10], 0);
    }

    /* renamed from: s */
    public static on3 m28612s() {
        return f21087j;
    }

    /* renamed from: u */
    private final String m28613u(int i) {
        int i2 = this.f21089i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: v */
    private final void m28614v(int i) {
        if (i < 0 || i >= this.f21089i) {
            throw new IndexOutOfBoundsException(m28613u(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo21840d();
        if (i < 0 || i > (i2 = this.f21089i)) {
            throw new IndexOutOfBoundsException(m28613u(i));
        }
        long[] jArr = this.f21088h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f21088h, i, jArr2, i + 1, this.f21089i - i);
            this.f21088h = jArr2;
        }
        this.f21088h[i] = longValue;
        this.f21089i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        mo21840d();
        zm3.m34700e(collection);
        if (!(collection instanceof on3)) {
            return super.addAll(collection);
        }
        on3 on3 = (on3) collection;
        int i = on3.f21089i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21089i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f21088h;
            if (i3 > jArr.length) {
                this.f21088h = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(on3.f21088h, 0, this.f21088h, this.f21089i, on3.f21089i);
            this.f21089i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final xm3 mo15868f(int i) {
        if (i >= this.f21089i) {
            return new on3(Arrays.copyOf(this.f21088h, i), this.f21089i);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on3)) {
            return super.equals(obj);
        }
        on3 on3 = (on3) obj;
        if (this.f21089i != on3.f21089i) {
            return false;
        }
        long[] jArr = on3.f21088h;
        for (int i = 0; i < this.f21089i; i++) {
            if (this.f21088h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m28614v(i);
        return Long.valueOf(this.f21088h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21089i; i2++) {
            i = (i * 31) + zm3.m34698c(this.f21088h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f21089i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21088h[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final long mo20056p(int i) {
        m28614v(i);
        return this.f21088h[i];
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        m28614v(i);
        long[] jArr = this.f21088h;
        long j = jArr[i];
        int i2 = this.f21089i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f21089i--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo21840d();
        if (i2 >= i) {
            long[] jArr = this.f21088h;
            System.arraycopy(jArr, i2, jArr, i, this.f21089i - i2);
            this.f21089i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo21840d();
        m28614v(i);
        long[] jArr = this.f21088h;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f21089i;
    }

    /* renamed from: t */
    public final void mo20060t(long j) {
        mo21840d();
        int i = this.f21089i;
        long[] jArr = this.f21088h;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f21088h = jArr2;
        }
        long[] jArr3 = this.f21088h;
        int i2 = this.f21089i;
        this.f21089i = i2 + 1;
        jArr3[i2] = j;
    }

    private on3(long[] jArr, int i) {
        this.f21088h = jArr;
        this.f21089i = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo20060t(((Long) obj).longValue());
        return true;
    }
}
