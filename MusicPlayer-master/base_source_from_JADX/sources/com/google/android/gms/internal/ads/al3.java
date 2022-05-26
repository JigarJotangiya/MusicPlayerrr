package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class al3 extends wk3<Boolean> implements RandomAccess, ym3, ho3 {

    /* renamed from: j */
    private static final al3 f13973j;

    /* renamed from: h */
    private boolean[] f13974h;

    /* renamed from: i */
    private int f13975i;

    static {
        al3 al3 = new al3(new boolean[0], 0);
        f13973j = al3;
        al3.mo21838a();
    }

    al3() {
        this(new boolean[10], 0);
    }

    /* renamed from: s */
    private final String m20854s(int i) {
        int i2 = this.f13975i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: t */
    private final void m20855t(int i) {
        if (i < 0 || i >= this.f13975i) {
            throw new IndexOutOfBoundsException(m20854s(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo21840d();
        if (i < 0 || i > (i2 = this.f13975i)) {
            throw new IndexOutOfBoundsException(m20854s(i));
        }
        boolean[] zArr = this.f13974h;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f13974h, i, zArr2, i + 1, this.f13975i - i);
            this.f13974h = zArr2;
        }
        this.f13974h[i] = booleanValue;
        this.f13975i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        mo21840d();
        zm3.m34700e(collection);
        if (!(collection instanceof al3)) {
            return super.addAll(collection);
        }
        al3 al3 = (al3) collection;
        int i = al3.f13975i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13975i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f13974h;
            if (i3 > zArr.length) {
                this.f13974h = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(al3.f13974h, 0, this.f13974h, this.f13975i, al3.f13975i);
            this.f13975i = i3;
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
        if (!(obj instanceof al3)) {
            return super.equals(obj);
        }
        al3 al3 = (al3) obj;
        if (this.f13975i != al3.f13975i) {
            return false;
        }
        boolean[] zArr = al3.f13974h;
        for (int i = 0; i < this.f13975i; i++) {
            if (this.f13974h[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ym3 mo15868f(int i) {
        if (i >= this.f13975i) {
            return new al3(Arrays.copyOf(this.f13974h, i), this.f13975i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m20855t(i);
        return Boolean.valueOf(this.f13974h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13975i; i2++) {
            i = (i * 31) + zm3.m34696a(this.f13974h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f13975i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13974h[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final void mo15872p(boolean z) {
        mo21840d();
        int i = this.f13975i;
        boolean[] zArr = this.f13974h;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f13974h = zArr2;
        }
        boolean[] zArr3 = this.f13974h;
        int i2 = this.f13975i;
        this.f13975i = i2 + 1;
        zArr3[i2] = z;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        m20855t(i);
        boolean[] zArr = this.f13974h;
        boolean z = zArr[i];
        int i2 = this.f13975i;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f13975i--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo21840d();
        if (i2 >= i) {
            boolean[] zArr = this.f13974h;
            System.arraycopy(zArr, i2, zArr, i, this.f13975i - i2);
            this.f13975i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo21840d();
        m20855t(i);
        boolean[] zArr = this.f13974h;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f13975i;
    }

    private al3(boolean[] zArr, int i) {
        this.f13974h = zArr;
        this.f13975i = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15872p(((Boolean) obj).booleanValue());
        return true;
    }
}
