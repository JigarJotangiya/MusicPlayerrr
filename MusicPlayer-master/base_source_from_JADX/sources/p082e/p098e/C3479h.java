package p082e.p098e;

/* renamed from: e.e.h */
/* compiled from: SparseArrayCompat */
public class C3479h<E> implements Cloneable {

    /* renamed from: k */
    private static final Object f11042k = new Object();

    /* renamed from: g */
    private boolean f11043g;

    /* renamed from: h */
    private int[] f11044h;

    /* renamed from: i */
    private Object[] f11045i;

    /* renamed from: j */
    private int f11046j;

    public C3479h() {
        this(10);
    }

    /* renamed from: e */
    private void m14844e() {
        int i = this.f11046j;
        int[] iArr = this.f11044h;
        Object[] objArr = this.f11045i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f11042k) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f11043g = false;
        this.f11046j = i2;
    }

    /* renamed from: a */
    public void mo12405a(int i, E e) {
        int i2 = this.f11046j;
        if (i2 == 0 || i > this.f11044h[i2 - 1]) {
            if (this.f11043g && i2 >= this.f11044h.length) {
                m14844e();
            }
            int i3 = this.f11046j;
            if (i3 >= this.f11044h.length) {
                int e2 = C3469c.m14785e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f11044h;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f11045i;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f11044h = iArr;
                this.f11045i = objArr;
            }
            this.f11044h[i3] = i;
            this.f11045i[i3] = e;
            this.f11046j = i3 + 1;
            return;
        }
        mo12414k(i, e);
    }

    /* renamed from: b */
    public void mo12406b() {
        int i = this.f11046j;
        Object[] objArr = this.f11045i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f11046j = 0;
        this.f11043g = false;
    }

    /* renamed from: c */
    public C3479h<E> clone() {
        try {
            C3479h<E> hVar = (C3479h) super.clone();
            hVar.f11044h = (int[]) this.f11044h.clone();
            hVar.f11045i = (Object[]) this.f11045i.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: f */
    public E mo12409f(int i) {
        return mo12410g(i, (Object) null);
    }

    /* renamed from: g */
    public E mo12410g(int i, E e) {
        int a = C3469c.m14781a(this.f11044h, this.f11046j, i);
        if (a >= 0) {
            E[] eArr = this.f11045i;
            if (eArr[a] != f11042k) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: h */
    public int mo12411h(int i) {
        if (this.f11043g) {
            m14844e();
        }
        return C3469c.m14781a(this.f11044h, this.f11046j, i);
    }

    /* renamed from: i */
    public int mo12412i(E e) {
        if (this.f11043g) {
            m14844e();
        }
        for (int i = 0; i < this.f11046j; i++) {
            if (this.f11045i[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public int mo12413j(int i) {
        if (this.f11043g) {
            m14844e();
        }
        return this.f11044h[i];
    }

    /* renamed from: k */
    public void mo12414k(int i, E e) {
        int a = C3469c.m14781a(this.f11044h, this.f11046j, i);
        if (a >= 0) {
            this.f11045i[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f11046j;
        if (i2 < i3) {
            Object[] objArr = this.f11045i;
            if (objArr[i2] == f11042k) {
                this.f11044h[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f11043g && i3 >= this.f11044h.length) {
            m14844e();
            i2 = ~C3469c.m14781a(this.f11044h, this.f11046j, i);
        }
        int i4 = this.f11046j;
        if (i4 >= this.f11044h.length) {
            int e2 = C3469c.m14785e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f11044h;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f11045i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11044h = iArr;
            this.f11045i = objArr2;
        }
        int i5 = this.f11046j;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f11044h;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f11045i;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f11046j - i2);
        }
        this.f11044h[i2] = i;
        this.f11045i[i2] = e;
        this.f11046j++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f11045i;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12415l(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f11044h
            int r1 = r3.f11046j
            int r4 = p082e.p098e.C3469c.m14781a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f11045i
            r1 = r0[r4]
            java.lang.Object r2 = f11042k
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f11043g = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p098e.C3479h.mo12415l(int):void");
    }

    /* renamed from: m */
    public int mo12416m() {
        if (this.f11043g) {
            m14844e();
        }
        return this.f11046j;
    }

    /* renamed from: n */
    public E mo12417n(int i) {
        if (this.f11043g) {
            m14844e();
        }
        return this.f11045i[i];
    }

    public String toString() {
        if (mo12416m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11046j * 28);
        sb.append('{');
        for (int i = 0; i < this.f11046j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo12413j(i));
            sb.append('=');
            Object n = mo12417n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3479h(int i) {
        this.f11043g = false;
        if (i == 0) {
            this.f11044h = C3469c.f11004a;
            this.f11045i = C3469c.f11006c;
            return;
        }
        int e = C3469c.m14785e(i);
        this.f11044h = new int[e];
        this.f11045i = new Object[e];
    }
}
