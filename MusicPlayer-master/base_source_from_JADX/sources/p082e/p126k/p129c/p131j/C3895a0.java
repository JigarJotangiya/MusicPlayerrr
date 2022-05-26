package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.a0 */
/* compiled from: IntArrayList */
final class C3895a0 extends C3910c<Integer> implements C3899b0.C3906g, RandomAccess, C3913c1 {

    /* renamed from: j */
    private static final C3895a0 f11977j;

    /* renamed from: h */
    private int[] f11978h;

    /* renamed from: i */
    private int f11979i;

    static {
        C3895a0 a0Var = new C3895a0(new int[0], 0);
        f11977j = a0Var;
        a0Var.mo13463g();
    }

    C3895a0() {
        this(new int[10], 0);
    }

    /* renamed from: A */
    private String m16626A(int i) {
        return "Index:" + i + ", Size:" + this.f11979i;
    }

    /* renamed from: u */
    private void m16627u(int i, int i2) {
        int i3;
        mo13468d();
        if (i < 0 || i > (i3 = this.f11979i)) {
            throw new IndexOutOfBoundsException(m16626A(i));
        }
        int[] iArr = this.f11978h;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f11978h, i, iArr2, i + 1, this.f11979i - i);
            this.f11978h = iArr2;
        }
        this.f11978h[i] = i2;
        this.f11979i++;
        this.modCount++;
    }

    /* renamed from: v */
    private void m16628v(int i) {
        if (i < 0 || i >= this.f11979i) {
            throw new IndexOutOfBoundsException(m16626A(i));
        }
    }

    /* renamed from: B */
    public C3899b0.C3906g mo13421i(int i) {
        if (i >= this.f11979i) {
            return new C3895a0(Arrays.copyOf(this.f11978h, i), this.f11979i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public Integer remove(int i) {
        mo13468d();
        m16628v(i);
        int[] iArr = this.f11978h;
        int i2 = iArr[i];
        int i3 = this.f11979i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f11979i--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* renamed from: D */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo13414E(i, num.intValue()));
    }

    /* renamed from: E */
    public int mo13414E(int i, int i2) {
        mo13468d();
        m16628v(i);
        int[] iArr = this.f11978h;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo13468d();
        C3899b0.m16645a(collection);
        if (!(collection instanceof C3895a0)) {
            return super.addAll(collection);
        }
        C3895a0 a0Var = (C3895a0) collection;
        int i = a0Var.f11979i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11979i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f11978h;
            if (i3 > iArr.length) {
                this.f11978h = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(a0Var.f11978h, 0, this.f11978h, this.f11979i, a0Var.f11979i);
            this.f11979i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3895a0)) {
            return super.equals(obj);
        }
        C3895a0 a0Var = (C3895a0) obj;
        if (this.f11979i != a0Var.f11979i) {
            return false;
        }
        int[] iArr = a0Var.f11978h;
        for (int i = 0; i < this.f11979i; i++) {
            if (this.f11978h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11979i; i2++) {
            i = (i * 31) + this.f11978h[i2];
        }
        return i;
    }

    /* renamed from: p */
    public void add(int i, Integer num) {
        m16627u(i, num.intValue());
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo13468d();
        if (i2 >= i) {
            int[] iArr = this.f11978h;
            System.arraycopy(iArr, i2, iArr, i, this.f11979i - i2);
            this.f11979i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean add(Integer num) {
        mo13429t(num.intValue());
        return true;
    }

    public int size() {
        return this.f11979i;
    }

    /* renamed from: t */
    public void mo13429t(int i) {
        mo13468d();
        int i2 = this.f11979i;
        int[] iArr = this.f11978h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f11978h = iArr2;
        }
        int[] iArr3 = this.f11978h;
        int i3 = this.f11979i;
        this.f11979i = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: x */
    public Integer get(int i) {
        return Integer.valueOf(mo13431y(i));
    }

    /* renamed from: y */
    public int mo13431y(int i) {
        m16628v(i);
        return this.f11978h[i];
    }

    private C3895a0(int[] iArr, int i) {
        this.f11978h = iArr;
        this.f11979i = i;
    }

    public boolean remove(Object obj) {
        mo13468d();
        for (int i = 0; i < this.f11979i; i++) {
            if (obj.equals(Integer.valueOf(this.f11978h[i]))) {
                int[] iArr = this.f11978h;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f11979i - i) - 1);
                this.f11979i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
