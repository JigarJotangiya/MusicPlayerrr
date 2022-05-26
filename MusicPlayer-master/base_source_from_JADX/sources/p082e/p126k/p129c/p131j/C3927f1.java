package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: e.k.c.j.f1 */
/* compiled from: ProtobufArrayList */
final class C3927f1<E> extends C3910c<E> implements RandomAccess {

    /* renamed from: j */
    private static final C3927f1<Object> f12009j;

    /* renamed from: h */
    private E[] f12010h;

    /* renamed from: i */
    private int f12011i;

    static {
        C3927f1<Object> f1Var = new C3927f1<>(new Object[0], 0);
        f12009j = f1Var;
        f1Var.mo13463g();
    }

    private C3927f1(E[] eArr, int i) {
        this.f12010h = eArr;
        this.f12011i = i;
    }

    /* renamed from: p */
    private static <E> E[] m16760p(int i) {
        return new Object[i];
    }

    /* renamed from: s */
    public static <E> C3927f1<E> m16761s() {
        return f12009j;
    }

    /* renamed from: t */
    private void m16762t(int i) {
        if (i < 0 || i >= this.f12011i) {
            throw new IndexOutOfBoundsException(m16763u(i));
        }
    }

    /* renamed from: u */
    private String m16763u(int i) {
        return "Index:" + i + ", Size:" + this.f12011i;
    }

    public boolean add(E e) {
        mo13468d();
        int i = this.f12011i;
        E[] eArr = this.f12010h;
        if (i == eArr.length) {
            this.f12010h = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12010h;
        int i2 = this.f12011i;
        this.f12011i = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        m16762t(i);
        return this.f12010h[i];
    }

    public E remove(int i) {
        mo13468d();
        m16762t(i);
        E[] eArr = this.f12010h;
        E e = eArr[i];
        int i2 = this.f12011i;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f12011i--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo13468d();
        m16762t(i);
        E[] eArr = this.f12010h;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f12011i;
    }

    /* renamed from: v */
    public C3927f1<E> mo13421i(int i) {
        if (i >= this.f12011i) {
            return new C3927f1<>(Arrays.copyOf(this.f12010h, i), this.f12011i);
        }
        throw new IllegalArgumentException();
    }

    public void add(int i, E e) {
        int i2;
        mo13468d();
        if (i < 0 || i > (i2 = this.f12011i)) {
            throw new IndexOutOfBoundsException(m16763u(i));
        }
        E[] eArr = this.f12010h;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] p = m16760p(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f12010h, 0, p, 0, i);
            System.arraycopy(this.f12010h, i, p, i + 1, this.f12011i - i);
            this.f12010h = p;
        }
        this.f12010h[i] = e;
        this.f12011i++;
        this.modCount++;
    }
}
