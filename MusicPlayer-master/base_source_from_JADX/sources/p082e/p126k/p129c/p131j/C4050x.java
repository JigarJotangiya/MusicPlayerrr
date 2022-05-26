package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.x */
/* compiled from: FloatArrayList */
final class C4050x extends C3910c<Float> implements C3899b0.C3905f, RandomAccess, C3913c1 {

    /* renamed from: j */
    private static final C4050x f12227j;

    /* renamed from: h */
    private float[] f12228h;

    /* renamed from: i */
    private int f12229i;

    static {
        C4050x xVar = new C4050x(new float[0], 0);
        f12227j = xVar;
        xVar.mo13463g();
    }

    C4050x() {
        this(new float[10], 0);
    }

    /* renamed from: A */
    private String m17905A(int i) {
        return "Index:" + i + ", Size:" + this.f12229i;
    }

    /* renamed from: u */
    private void m17906u(int i, float f) {
        int i2;
        mo13468d();
        if (i < 0 || i > (i2 = this.f12229i)) {
            throw new IndexOutOfBoundsException(m17905A(i));
        }
        float[] fArr = this.f12228h;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f12228h, i, fArr2, i + 1, this.f12229i - i);
            this.f12228h = fArr2;
        }
        this.f12228h[i] = f;
        this.f12229i++;
        this.modCount++;
    }

    /* renamed from: v */
    private void m17907v(int i) {
        if (i < 0 || i >= this.f12229i) {
            throw new IndexOutOfBoundsException(m17905A(i));
        }
    }

    /* renamed from: B */
    public C3899b0.C3905f mo13421i(int i) {
        if (i >= this.f12229i) {
            return new C4050x(Arrays.copyOf(this.f12228h, i), this.f12229i);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: C */
    public Float remove(int i) {
        mo13468d();
        m17907v(i);
        float[] fArr = this.f12228h;
        float f = fArr[i];
        int i2 = this.f12229i;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f12229i--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* renamed from: D */
    public Float set(int i, Float f) {
        return Float.valueOf(mo14072E(i, f.floatValue()));
    }

    /* renamed from: E */
    public float mo14072E(int i, float f) {
        mo13468d();
        m17907v(i);
        float[] fArr = this.f12228h;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo13468d();
        C3899b0.m16645a(collection);
        if (!(collection instanceof C4050x)) {
            return super.addAll(collection);
        }
        C4050x xVar = (C4050x) collection;
        int i = xVar.f12229i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12229i;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f12228h;
            if (i3 > fArr.length) {
                this.f12228h = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xVar.f12228h, 0, this.f12228h, this.f12229i, xVar.f12229i);
            this.f12229i = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4050x)) {
            return super.equals(obj);
        }
        C4050x xVar = (C4050x) obj;
        if (this.f12229i != xVar.f12229i) {
            return false;
        }
        float[] fArr = xVar.f12228h;
        for (int i = 0; i < this.f12229i; i++) {
            if (Float.floatToIntBits(this.f12228h[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f12229i; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f12228h[i2]);
        }
        return i;
    }

    /* renamed from: p */
    public void add(int i, Float f) {
        m17906u(i, f.floatValue());
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo13468d();
        if (i2 >= i) {
            float[] fArr = this.f12228h;
            System.arraycopy(fArr, i2, fArr, i, this.f12229i - i2);
            this.f12229i -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public boolean add(Float f) {
        mo14081t(f.floatValue());
        return true;
    }

    public int size() {
        return this.f12229i;
    }

    /* renamed from: t */
    public void mo14081t(float f) {
        mo13468d();
        int i = this.f12229i;
        float[] fArr = this.f12228h;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f12228h = fArr2;
        }
        float[] fArr3 = this.f12228h;
        int i2 = this.f12229i;
        this.f12229i = i2 + 1;
        fArr3[i2] = f;
    }

    /* renamed from: x */
    public Float get(int i) {
        return Float.valueOf(mo14083y(i));
    }

    /* renamed from: y */
    public float mo14083y(int i) {
        m17907v(i);
        return this.f12228h[i];
    }

    private C4050x(float[] fArr, int i) {
        this.f12228h = fArr;
        this.f12229i = i;
    }

    public boolean remove(Object obj) {
        mo13468d();
        for (int i = 0; i < this.f12229i; i++) {
            if (obj.equals(Float.valueOf(this.f12228h[i]))) {
                float[] fArr = this.f12228h;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f12229i - i) - 1);
                this.f12229i--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
