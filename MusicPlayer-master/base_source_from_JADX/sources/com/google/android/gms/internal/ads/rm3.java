package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rm3 extends wk3<Integer> implements RandomAccess, um3, ho3 {

    /* renamed from: j */
    private static final rm3 f22904j;

    /* renamed from: h */
    private int[] f22905h;

    /* renamed from: i */
    private int f22906i;

    static {
        rm3 rm3 = new rm3(new int[0], 0);
        f22904j = rm3;
        rm3.mo21838a();
    }

    rm3() {
        this(new int[10], 0);
    }

    /* renamed from: s */
    public static rm3 m30220s() {
        return f22904j;
    }

    /* renamed from: t */
    private final String m30221t(int i) {
        int i2 = this.f22906i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: u */
    private final void m30222u(int i) {
        if (i < 0 || i >= this.f22906i) {
            throw new IndexOutOfBoundsException(m30221t(i));
        }
    }

    /* renamed from: L */
    public final void mo20677L(int i) {
        mo21840d();
        int i2 = this.f22906i;
        int[] iArr = this.f22905h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f22905h = iArr2;
        }
        int[] iArr3 = this.f22905h;
        int i3 = this.f22906i;
        this.f22906i = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo21840d();
        if (i < 0 || i > (i2 = this.f22906i)) {
            throw new IndexOutOfBoundsException(m30221t(i));
        }
        int[] iArr = this.f22905h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f22905h, i, iArr2, i + 1, this.f22906i - i);
            this.f22905h = iArr2;
        }
        this.f22905h[i] = intValue;
        this.f22906i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        mo21840d();
        zm3.m34700e(collection);
        if (!(collection instanceof rm3)) {
            return super.addAll(collection);
        }
        rm3 rm3 = (rm3) collection;
        int i = rm3.f22906i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22906i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f22905h;
            if (i3 > iArr.length) {
                this.f22905h = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(rm3.f22905h, 0, this.f22905h, this.f22906i, rm3.f22906i);
            this.f22906i = i3;
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
        if (!(obj instanceof rm3)) {
            return super.equals(obj);
        }
        rm3 rm3 = (rm3) obj;
        if (this.f22906i != rm3.f22906i) {
            return false;
        }
        int[] iArr = rm3.f22905h;
        for (int i = 0; i < this.f22906i; i++) {
            if (this.f22905h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m30222u(i);
        return Integer.valueOf(this.f22905h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22906i; i2++) {
            i = (i * 31) + this.f22905h[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f22906i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22905h[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final int mo20682p(int i) {
        m30222u(i);
        return this.f22905h[i];
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        m30222u(i);
        int[] iArr = this.f22905h;
        int i2 = iArr[i];
        int i3 = this.f22906i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f22906i--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo21840d();
        if (i2 >= i) {
            int[] iArr = this.f22905h;
            System.arraycopy(iArr, i2, iArr, i, this.f22906i - i2);
            this.f22906i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo21840d();
        m30222u(i);
        int[] iArr = this.f22905h;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f22906i;
    }

    /* renamed from: w */
    public final um3 mo15868f(int i) {
        if (i >= this.f22906i) {
            return new rm3(Arrays.copyOf(this.f22905h, i), this.f22906i);
        }
        throw new IllegalArgumentException();
    }

    private rm3(int[] iArr, int i) {
        this.f22905h = iArr;
        this.f22906i = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo20677L(((Integer) obj).intValue());
        return true;
    }
}
