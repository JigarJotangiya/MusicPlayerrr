package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class km3 extends wk3<Float> implements RandomAccess, ym3, ho3 {

    /* renamed from: j */
    private static final km3 f18924j;

    /* renamed from: h */
    private float[] f18925h;

    /* renamed from: i */
    private int f18926i;

    static {
        km3 km3 = new km3(new float[0], 0);
        f18924j = km3;
        km3.mo21838a();
    }

    km3() {
        this(new float[10], 0);
    }

    /* renamed from: s */
    private final String m26274s(int i) {
        int i2 = this.f18926i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: t */
    private final void m26275t(int i) {
        if (i < 0 || i >= this.f18926i) {
            throw new IndexOutOfBoundsException(m26274s(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo21840d();
        if (i < 0 || i > (i2 = this.f18926i)) {
            throw new IndexOutOfBoundsException(m26274s(i));
        }
        float[] fArr = this.f18925h;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f18925h, i, fArr2, i + 1, this.f18926i - i);
            this.f18925h = fArr2;
        }
        this.f18925h[i] = floatValue;
        this.f18926i++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        mo21840d();
        zm3.m34700e(collection);
        if (!(collection instanceof km3)) {
            return super.addAll(collection);
        }
        km3 km3 = (km3) collection;
        int i = km3.f18926i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18926i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f18925h;
            if (i3 > fArr.length) {
                this.f18925h = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(km3.f18925h, 0, this.f18925h, this.f18926i, km3.f18926i);
            this.f18926i = i3;
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
        if (!(obj instanceof km3)) {
            return super.equals(obj);
        }
        km3 km3 = (km3) obj;
        if (this.f18926i != km3.f18926i) {
            return false;
        }
        float[] fArr = km3.f18925h;
        for (int i = 0; i < this.f18926i; i++) {
            if (Float.floatToIntBits(this.f18925h[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ ym3 mo15868f(int i) {
        if (i >= this.f18926i) {
            return new km3(Arrays.copyOf(this.f18925h, i), this.f18926i);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m26275t(i);
        return Float.valueOf(this.f18925h[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18926i; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f18925h[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f18926i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18925h[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final void mo18925p(float f) {
        mo21840d();
        int i = this.f18926i;
        float[] fArr = this.f18925h;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f18925h = fArr2;
        }
        float[] fArr3 = this.f18925h;
        int i2 = this.f18926i;
        this.f18926i = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo21840d();
        m26275t(i);
        float[] fArr = this.f18925h;
        float f = fArr[i];
        int i2 = this.f18926i;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f18926i--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo21840d();
        if (i2 >= i) {
            float[] fArr = this.f18925h;
            System.arraycopy(fArr, i2, fArr, i, this.f18926i - i2);
            this.f18926i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo21840d();
        m26275t(i);
        float[] fArr = this.f18925h;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f18926i;
    }

    private km3(float[] fArr, int i) {
        this.f18925h = fArr;
        this.f18926i = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo18925p(((Float) obj).floatValue());
        return true;
    }
}
