package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.j0 */
/* compiled from: LongArrayList */
final class C3962j0 extends C3910c<Long> implements C3899b0.C3907h, RandomAccess, C3913c1 {

    /* renamed from: j */
    private static final C3962j0 f12081j;

    /* renamed from: h */
    private long[] f12082h;

    /* renamed from: i */
    private int f12083i;

    static {
        C3962j0 j0Var = new C3962j0(new long[0], 0);
        f12081j = j0Var;
        j0Var.mo13463g();
    }

    C3962j0() {
        this(new long[10], 0);
    }

    /* renamed from: A */
    private String m17034A(int i) {
        return "Index:" + i + ", Size:" + this.f12083i;
    }

    /* renamed from: t */
    private void m17035t(int i, long j) {
        int i2;
        mo13468d();
        if (i < 0 || i > (i2 = this.f12083i)) {
            throw new IndexOutOfBoundsException(m17034A(i));
        }
        long[] jArr = this.f12082h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f12082h, i, jArr2, i + 1, this.f12083i - i);
            this.f12082h = jArr2;
        }
        this.f12082h[i] = j;
        this.f12083i++;
        this.modCount++;
    }

    /* renamed from: v */
    private void m17036v(int i) {
        if (i < 0 || i >= this.f12083i) {
            throw new IndexOutOfBoundsException(m17034A(i));
        }
    }

    /* renamed from: B */
    public C3899b0.C3907h mo13421i(int i) {
        if (i >= this.f12083i) {
            return new C3962j0(Arrays.copyOf(this.f12082h, i), this.f12083i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public Long remove(int i) {
        mo13468d();
        m17036v(i);
        long[] jArr = this.f12082h;
        long j = jArr[i];
        int i2 = this.f12083i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f12083i--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* renamed from: D */
    public Long set(int i, Long l) {
        return Long.valueOf(mo13692E(i, l.longValue()));
    }

    /* renamed from: E */
    public long mo13692E(int i, long j) {
        mo13468d();
        m17036v(i);
        long[] jArr = this.f12082h;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo13468d();
        C3899b0.m16645a(collection);
        if (!(collection instanceof C3962j0)) {
            return super.addAll(collection);
        }
        C3962j0 j0Var = (C3962j0) collection;
        int i = j0Var.f12083i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12083i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f12082h;
            if (i3 > jArr.length) {
                this.f12082h = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(j0Var.f12082h, 0, this.f12082h, this.f12083i, j0Var.f12083i);
            this.f12083i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3962j0)) {
            return super.equals(obj);
        }
        C3962j0 j0Var = (C3962j0) obj;
        if (this.f12083i != j0Var.f12083i) {
            return false;
        }
        long[] jArr = j0Var.f12082h;
        for (int i = 0; i < this.f12083i; i++) {
            if (this.f12082h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12083i; i2++) {
            i = (i * 31) + C3899b0.m16650f(this.f12082h[i2]);
        }
        return i;
    }

    /* renamed from: p */
    public void add(int i, Long l) {
        m17035t(i, l.longValue());
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo13468d();
        if (i2 >= i) {
            long[] jArr = this.f12082h;
            System.arraycopy(jArr, i2, jArr, i, this.f12083i - i2);
            this.f12083i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean add(Long l) {
        mo13701u(l.longValue());
        return true;
    }

    public int size() {
        return this.f12083i;
    }

    /* renamed from: u */
    public void mo13701u(long j) {
        mo13468d();
        int i = this.f12083i;
        long[] jArr = this.f12082h;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f12082h = jArr2;
        }
        long[] jArr3 = this.f12082h;
        int i2 = this.f12083i;
        this.f12083i = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: x */
    public Long get(int i) {
        return Long.valueOf(mo13703y(i));
    }

    /* renamed from: y */
    public long mo13703y(int i) {
        m17036v(i);
        return this.f12082h[i];
    }

    private C3962j0(long[] jArr, int i) {
        this.f12082h = jArr;
        this.f12083i = i;
    }

    public boolean remove(Object obj) {
        mo13468d();
        for (int i = 0; i < this.f12083i; i++) {
            if (obj.equals(Long.valueOf(this.f12082h[i]))) {
                long[] jArr = this.f12082h;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f12083i - i) - 1);
                this.f12083i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
