package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.n */
/* compiled from: DoubleArrayList */
final class C3992n extends C3910c<Double> implements C3899b0.C3901b, RandomAccess, C3913c1 {

    /* renamed from: j */
    private static final C3992n f12139j;

    /* renamed from: h */
    private double[] f12140h;

    /* renamed from: i */
    private int f12141i;

    static {
        C3992n nVar = new C3992n(new double[0], 0);
        f12139j = nVar;
        nVar.mo13463g();
    }

    C3992n() {
        this(new double[10], 0);
    }

    /* renamed from: A */
    private String m17434A(int i) {
        return "Index:" + i + ", Size:" + this.f12141i;
    }

    /* renamed from: u */
    private void m17435u(int i, double d) {
        int i2;
        mo13468d();
        if (i < 0 || i > (i2 = this.f12141i)) {
            throw new IndexOutOfBoundsException(m17434A(i));
        }
        double[] dArr = this.f12140h;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f12140h, i, dArr2, i + 1, this.f12141i - i);
            this.f12140h = dArr2;
        }
        this.f12140h[i] = d;
        this.f12141i++;
        this.modCount++;
    }

    /* renamed from: v */
    private void m17436v(int i) {
        if (i < 0 || i >= this.f12141i) {
            throw new IndexOutOfBoundsException(m17434A(i));
        }
    }

    /* renamed from: B */
    public C3899b0.C3901b mo13421i(int i) {
        if (i >= this.f12141i) {
            return new C3992n(Arrays.copyOf(this.f12140h, i), this.f12141i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public Double remove(int i) {
        mo13468d();
        m17436v(i);
        double[] dArr = this.f12140h;
        double d = dArr[i];
        int i2 = this.f12141i;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f12141i--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* renamed from: D */
    public Double set(int i, Double d) {
        return Double.valueOf(mo13883E(i, d.doubleValue()));
    }

    /* renamed from: E */
    public double mo13883E(int i, double d) {
        mo13468d();
        m17436v(i);
        double[] dArr = this.f12140h;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo13468d();
        C3899b0.m16645a(collection);
        if (!(collection instanceof C3992n)) {
            return super.addAll(collection);
        }
        C3992n nVar = (C3992n) collection;
        int i = nVar.f12141i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12141i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f12140h;
            if (i3 > dArr.length) {
                this.f12140h = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f12140h, 0, this.f12140h, this.f12141i, nVar.f12141i);
            this.f12141i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3992n)) {
            return super.equals(obj);
        }
        C3992n nVar = (C3992n) obj;
        if (this.f12141i != nVar.f12141i) {
            return false;
        }
        double[] dArr = nVar.f12140h;
        for (int i = 0; i < this.f12141i; i++) {
            if (Double.doubleToLongBits(this.f12140h[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12141i; i2++) {
            i = (i * 31) + C3899b0.m16650f(Double.doubleToLongBits(this.f12140h[i2]));
        }
        return i;
    }

    /* renamed from: p */
    public void add(int i, Double d) {
        m17435u(i, d.doubleValue());
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo13468d();
        if (i2 >= i) {
            double[] dArr = this.f12140h;
            System.arraycopy(dArr, i2, dArr, i, this.f12141i - i2);
            this.f12141i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean add(Double d) {
        mo13892t(d.doubleValue());
        return true;
    }

    public int size() {
        return this.f12141i;
    }

    /* renamed from: t */
    public void mo13892t(double d) {
        mo13468d();
        int i = this.f12141i;
        double[] dArr = this.f12140h;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f12140h = dArr2;
        }
        double[] dArr3 = this.f12140h;
        int i2 = this.f12141i;
        this.f12141i = i2 + 1;
        dArr3[i2] = d;
    }

    /* renamed from: x */
    public Double get(int i) {
        return Double.valueOf(mo13894y(i));
    }

    /* renamed from: y */
    public double mo13894y(int i) {
        m17436v(i);
        return this.f12140h[i];
    }

    private C3992n(double[] dArr, int i) {
        this.f12140h = dArr;
        this.f12141i = i;
    }

    public boolean remove(Object obj) {
        mo13468d();
        for (int i = 0; i < this.f12141i; i++) {
            if (obj.equals(Double.valueOf(this.f12140h[i]))) {
                double[] dArr = this.f12140h;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f12141i - i) - 1);
                this.f12141i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
