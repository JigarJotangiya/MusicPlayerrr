package p082e.p098e;

/* renamed from: e.e.d */
/* compiled from: LongSparseArray */
public class C3470d<E> implements Cloneable {

    /* renamed from: k */
    private static final Object f11007k = new Object();

    /* renamed from: g */
    private boolean f11008g;

    /* renamed from: h */
    private long[] f11009h;

    /* renamed from: i */
    private Object[] f11010i;

    /* renamed from: j */
    private int f11011j;

    public C3470d() {
        this(10);
    }

    /* renamed from: g */
    private void m14787g() {
        int i = this.f11011j;
        long[] jArr = this.f11009h;
        Object[] objArr = this.f11010i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f11007k) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f11008g = false;
        this.f11011j = i2;
    }

    /* renamed from: a */
    public void mo12298a(long j, E e) {
        int i = this.f11011j;
        if (i == 0 || j > this.f11009h[i - 1]) {
            if (this.f11008g && i >= this.f11009h.length) {
                m14787g();
            }
            int i2 = this.f11011j;
            if (i2 >= this.f11009h.length) {
                int f = C3469c.m14786f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f11009h;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f11010i;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f11009h = jArr;
                this.f11010i = objArr;
            }
            this.f11009h[i2] = j;
            this.f11010i[i2] = e;
            this.f11011j = i2 + 1;
            return;
        }
        mo12309m(j, e);
    }

    /* renamed from: b */
    public void mo12299b() {
        int i = this.f11011j;
        Object[] objArr = this.f11010i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f11011j = 0;
        this.f11008g = false;
    }

    /* renamed from: c */
    public C3470d<E> clone() {
        try {
            C3470d<E> dVar = (C3470d) super.clone();
            dVar.f11009h = (long[]) this.f11009h.clone();
            dVar.f11010i = (Object[]) this.f11010i.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public boolean mo12302e(long j) {
        return mo12306j(j) >= 0;
    }

    @Deprecated
    /* renamed from: f */
    public void mo12303f(long j) {
        mo12310n(j);
    }

    /* renamed from: h */
    public E mo12304h(long j) {
        return mo12305i(j, (Object) null);
    }

    /* renamed from: i */
    public E mo12305i(long j, E e) {
        int b = C3469c.m14782b(this.f11009h, this.f11011j, j);
        if (b >= 0) {
            E[] eArr = this.f11010i;
            if (eArr[b] != f11007k) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: j */
    public int mo12306j(long j) {
        if (this.f11008g) {
            m14787g();
        }
        return C3469c.m14782b(this.f11009h, this.f11011j, j);
    }

    /* renamed from: k */
    public boolean mo12307k() {
        return mo12312q() == 0;
    }

    /* renamed from: l */
    public long mo12308l(int i) {
        if (this.f11008g) {
            m14787g();
        }
        return this.f11009h[i];
    }

    /* renamed from: m */
    public void mo12309m(long j, E e) {
        int b = C3469c.m14782b(this.f11009h, this.f11011j, j);
        if (b >= 0) {
            this.f11010i[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f11011j;
        if (i < i2) {
            Object[] objArr = this.f11010i;
            if (objArr[i] == f11007k) {
                this.f11009h[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f11008g && i2 >= this.f11009h.length) {
            m14787g();
            i = ~C3469c.m14782b(this.f11009h, this.f11011j, j);
        }
        int i3 = this.f11011j;
        if (i3 >= this.f11009h.length) {
            int f = C3469c.m14786f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f11009h;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f11010i;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11009h = jArr;
            this.f11010i = objArr2;
        }
        int i4 = this.f11011j;
        if (i4 - i != 0) {
            long[] jArr3 = this.f11009h;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f11010i;
            System.arraycopy(objArr4, i, objArr4, i5, this.f11011j - i);
        }
        this.f11009h[i] = j;
        this.f11010i[i] = e;
        this.f11011j++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f11010i;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12310n(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f11009h
            int r1 = r2.f11011j
            int r3 = p082e.p098e.C3469c.m14782b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f11010i
            r0 = r4[r3]
            java.lang.Object r1 = f11007k
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f11008g = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p098e.C3470d.mo12310n(long):void");
    }

    /* renamed from: o */
    public void mo12311o(int i) {
        Object[] objArr = this.f11010i;
        Object obj = objArr[i];
        Object obj2 = f11007k;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f11008g = true;
        }
    }

    /* renamed from: q */
    public int mo12312q() {
        if (this.f11008g) {
            m14787g();
        }
        return this.f11011j;
    }

    /* renamed from: r */
    public E mo12313r(int i) {
        if (this.f11008g) {
            m14787g();
        }
        return this.f11010i[i];
    }

    public String toString() {
        if (mo12312q() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11011j * 28);
        sb.append('{');
        for (int i = 0; i < this.f11011j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo12308l(i));
            sb.append('=');
            Object r = mo12313r(i);
            if (r != this) {
                sb.append(r);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C3470d(int i) {
        this.f11008g = false;
        if (i == 0) {
            this.f11009h = C3469c.f11005b;
            this.f11010i = C3469c.f11006c;
            return;
        }
        int f = C3469c.m14786f(i);
        this.f11009h = new long[f];
        this.f11010i = new Object[f];
    }
}
