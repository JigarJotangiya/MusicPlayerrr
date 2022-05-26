package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zl3 extends wk3<Double> implements RandomAccess, ym3, ho3 {

    /* renamed from: j */
    private static final zl3 f26827j;

    /* renamed from: h */
    private double[] f26828h;

    /* renamed from: i */
    private int f26829i;

    static {
        zl3 zl3 = new zl3(new double[0], 0);
        f26827j = zl3;
        zl3.mo21838a();
    }

    zl3() {
        this(new double[10], 0);
    }

    /* renamed from: s */
    private final String m34690s(int i) {
        int i2 = this.f26829i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: t */
    private final void m34691t(int i) {
        if (i < 0 || i >= this.f26829i) {
            throw new IndexOutOfBoundsException(m34690s(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo21840d();
        if (i < 0 || i > (i2 = this.f26829i)) {
            throw new IndexOutOfBoundsException(m34690s(i));
        }
        double[] dArr = this.f26828h;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f26828h, i, dArr2, i + 1, this.f26829i - i);
            this.f26828h = dArr2;
        }
        this.f26828h[i] = doubleValue;
        this.f26829i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        mo21840d();
        zm3.m34700e(collection);
        if (!(collection instanceof zl3)) {
            return super.addAll(collection);
        }
        zl3 zl3 = (zl3) collection;
        int i = zl3.f26829i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f26829i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f26828h;
            if (i3 > dArr.length) {
                this.f26828h = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zl3.f26828h, 0, this.f26828h, this.f26829i, zl3.f26829i);
            this.f26829i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl3)) {
            return super.equals(obj);
        }
        zl3 zl3 = (zl3) obj;
        if (this.f26829i != zl3.f26829i) {
            return false;
        }
        double[] dArr = zl3.f26828h;
        for (int i = 0; i < this.f26829i; i++) {
            if (Double.doubleToLongBits(this.f26828h[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ym3 mo15868f(int i) {
        if (i >= this.f26829i) {
            return new zl3(Arrays.copyOf(this.f26828h, i), this.f26829i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m34691t(i);
        return Double.valueOf(this.f26828h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26829i; i2++) {
            i = (i * 31) + zm3.m34698c(Double.doubleToLongBits(this.f26828h[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f26829i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f26828h[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final void mo22390p(double d) {
        mo21840d();
        int i = this.f26829i;
        double[] dArr = this.f26828h;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f26828h = dArr2;
        }
        double[] dArr3 = this.f26828h;
        int i2 = this.f26829i;
        this.f26829i = i2 + 1;
        dArr3[i2] = d;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        m34691t(i);
        double[] dArr = this.f26828h;
        double d = dArr[i];
        int i2 = this.f26829i;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f26829i--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo21840d();
        if (i2 >= i) {
            double[] dArr = this.f26828h;
            System.arraycopy(dArr, i2, dArr, i, this.f26829i - i2);
            this.f26829i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo21840d();
        m34691t(i);
        double[] dArr = this.f26828h;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f26829i;
    }

    private zl3(double[] dArr, int i) {
        this.f26828h = dArr;
        this.f26829i = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo22390p(((Double) obj).doubleValue());
        return true;
    }
}
