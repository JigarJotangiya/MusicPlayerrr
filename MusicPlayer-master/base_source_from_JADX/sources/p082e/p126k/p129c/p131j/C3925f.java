package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.f */
/* compiled from: BooleanArrayList */
final class C3925f extends C3910c<Boolean> implements C3899b0.C3900a, RandomAccess, C3913c1 {

    /* renamed from: j */
    private static final C3925f f12002j;

    /* renamed from: h */
    private boolean[] f12003h;

    /* renamed from: i */
    private int f12004i;

    static {
        C3925f fVar = new C3925f(new boolean[0], 0);
        f12002j = fVar;
        fVar.mo13463g();
    }

    C3925f() {
        this(new boolean[10], 0);
    }

    /* renamed from: A */
    private String m16742A(int i) {
        return "Index:" + i + ", Size:" + this.f12004i;
    }

    /* renamed from: t */
    private void m16743t(int i, boolean z) {
        int i2;
        mo13468d();
        if (i < 0 || i > (i2 = this.f12004i)) {
            throw new IndexOutOfBoundsException(m16742A(i));
        }
        boolean[] zArr = this.f12003h;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f12003h, i, zArr2, i + 1, this.f12004i - i);
            this.f12003h = zArr2;
        }
        this.f12003h[i] = z;
        this.f12004i++;
        this.modCount++;
    }

    /* renamed from: v */
    private void m16744v(int i) {
        if (i < 0 || i >= this.f12004i) {
            throw new IndexOutOfBoundsException(m16742A(i));
        }
    }

    /* renamed from: B */
    public C3899b0.C3900a mo13421i(int i) {
        if (i >= this.f12004i) {
            return new C3925f(Arrays.copyOf(this.f12003h, i), this.f12004i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public Boolean remove(int i) {
        mo13468d();
        m16744v(i);
        boolean[] zArr = this.f12003h;
        boolean z = zArr[i];
        int i2 = this.f12004i;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f12004i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* renamed from: D */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo13544E(i, bool.booleanValue()));
    }

    /* renamed from: E */
    public boolean mo13544E(int i, boolean z) {
        mo13468d();
        m16744v(i);
        boolean[] zArr = this.f12003h;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo13468d();
        C3899b0.m16645a(collection);
        if (!(collection instanceof C3925f)) {
            return super.addAll(collection);
        }
        C3925f fVar = (C3925f) collection;
        int i = fVar.f12004i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12004i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f12003h;
            if (i3 > zArr.length) {
                this.f12003h = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.f12003h, 0, this.f12003h, this.f12004i, fVar.f12004i);
            this.f12004i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3925f)) {
            return super.equals(obj);
        }
        C3925f fVar = (C3925f) obj;
        if (this.f12004i != fVar.f12004i) {
            return false;
        }
        boolean[] zArr = fVar.f12003h;
        for (int i = 0; i < this.f12004i; i++) {
            if (this.f12003h[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12004i; i2++) {
            i = (i * 31) + C3899b0.m16647c(this.f12003h[i2]);
        }
        return i;
    }

    /* renamed from: p */
    public void add(int i, Boolean bool) {
        m16743t(i, bool.booleanValue());
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo13468d();
        if (i2 >= i) {
            boolean[] zArr = this.f12003h;
            System.arraycopy(zArr, i2, zArr, i, this.f12004i - i2);
            this.f12004i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean add(Boolean bool) {
        mo13553u(bool.booleanValue());
        return true;
    }

    public int size() {
        return this.f12004i;
    }

    /* renamed from: u */
    public void mo13553u(boolean z) {
        mo13468d();
        int i = this.f12004i;
        boolean[] zArr = this.f12003h;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f12003h = zArr2;
        }
        boolean[] zArr3 = this.f12003h;
        int i2 = this.f12004i;
        this.f12004i = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: x */
    public Boolean get(int i) {
        return Boolean.valueOf(mo13555y(i));
    }

    /* renamed from: y */
    public boolean mo13555y(int i) {
        m16744v(i);
        return this.f12003h[i];
    }

    private C3925f(boolean[] zArr, int i) {
        this.f12003h = zArr;
        this.f12004i = i;
    }

    public boolean remove(Object obj) {
        mo13468d();
        for (int i = 0; i < this.f12004i; i++) {
            if (obj.equals(Boolean.valueOf(this.f12003h[i]))) {
                boolean[] zArr = this.f12003h;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f12004i - i) - 1);
                this.f12004i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
