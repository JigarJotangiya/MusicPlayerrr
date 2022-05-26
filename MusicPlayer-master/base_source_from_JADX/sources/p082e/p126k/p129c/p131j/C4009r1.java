package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.Arrays;
import p082e.p126k.p129c.p131j.C4052x1;

/* renamed from: e.k.c.j.r1 */
/* compiled from: UnknownFieldSetLite */
public final class C4009r1 {

    /* renamed from: f */
    private static final C4009r1 f12157f = new C4009r1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f12158a;

    /* renamed from: b */
    private int[] f12159b;

    /* renamed from: c */
    private Object[] f12160c;

    /* renamed from: d */
    private int f12161d;

    /* renamed from: e */
    private boolean f12162e;

    private C4009r1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m17520b() {
        int i = this.f12158a;
        int[] iArr = this.f12159b;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f12159b = Arrays.copyOf(iArr, i2);
            this.f12160c = Arrays.copyOf(this.f12160c, i2);
        }
    }

    /* renamed from: c */
    private static boolean m17521c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m17522d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C4009r1 m17523e() {
        return f12157f;
    }

    /* renamed from: h */
    private static int m17524h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    private static int m17525i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: k */
    static C4009r1 m17526k(C4009r1 r1Var, C4009r1 r1Var2) {
        int i = r1Var.f12158a + r1Var2.f12158a;
        int[] copyOf = Arrays.copyOf(r1Var.f12159b, i);
        System.arraycopy(r1Var2.f12159b, 0, copyOf, r1Var.f12158a, r1Var2.f12158a);
        Object[] copyOf2 = Arrays.copyOf(r1Var.f12160c, i);
        System.arraycopy(r1Var2.f12160c, 0, copyOf2, r1Var.f12158a, r1Var2.f12158a);
        return new C4009r1(i, copyOf, copyOf2, true);
    }

    /* renamed from: l */
    static C4009r1 m17527l() {
        return new C4009r1();
    }

    /* renamed from: p */
    private static void m17528p(int i, Object obj, C4052x1 x1Var) throws IOException {
        int a = C4042w1.m17902a(i);
        int b = C4042w1.m17903b(i);
        if (b == 0) {
            x1Var.mo13812p(a, ((Long) obj).longValue());
        } else if (b == 1) {
            x1Var.mo13804h(a, ((Long) obj).longValue());
        } else if (b == 2) {
            x1Var.mo13819w(a, (C3934i) obj);
        } else if (b != 3) {
            if (b == 5) {
                x1Var.mo13800d(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C3911c0.invalidWireType());
        } else if (x1Var.mo13805i() == C4052x1.C4053a.ASCENDING) {
            x1Var.mo13815s(a);
            ((C4009r1) obj).mo13951q(x1Var);
            x1Var.mo13787F(a);
        } else {
            x1Var.mo13787F(a);
            ((C4009r1) obj).mo13951q(x1Var);
            x1Var.mo13815s(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13942a() {
        if (!this.f12162e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4009r1)) {
            return false;
        }
        C4009r1 r1Var = (C4009r1) obj;
        int i = this.f12158a;
        return i == r1Var.f12158a && m17521c(this.f12159b, r1Var.f12159b, i) && m17522d(this.f12160c, r1Var.f12160c, this.f12158a);
    }

    /* renamed from: f */
    public int mo13944f() {
        int i;
        int i2 = this.f12161d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12158a; i4++) {
            int i5 = this.f12159b[i4];
            int a = C4042w1.m17902a(i5);
            int b = C4042w1.m17903b(i5);
            if (b == 0) {
                i = C3970l.m17142Z(a, ((Long) this.f12160c[i4]).longValue());
            } else if (b == 1) {
                i = C3970l.m17161p(a, ((Long) this.f12160c[i4]).longValue());
            } else if (b == 2) {
                i = C3970l.m17151h(a, (C3934i) this.f12160c[i4]);
            } else if (b == 3) {
                i = (C3970l.m17139W(a) * 2) + ((C4009r1) this.f12160c[i4]).mo13944f();
            } else if (b == 5) {
                i = C3970l.m17159n(a, ((Integer) this.f12160c[i4]).intValue());
            } else {
                throw new IllegalStateException(C3911c0.invalidWireType());
            }
            i3 += i;
        }
        this.f12161d = i3;
        return i3;
    }

    /* renamed from: g */
    public int mo13945g() {
        int i = this.f12161d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f12158a; i3++) {
            i2 += C3970l.m17127K(C4042w1.m17902a(this.f12159b[i3]), (C3934i) this.f12160c[i3]);
        }
        this.f12161d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.f12158a;
        return ((((527 + i) * 31) + m17524h(this.f12159b, i)) * 31) + m17525i(this.f12160c, this.f12158a);
    }

    /* renamed from: j */
    public void mo13947j() {
        this.f12162e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo13948m(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f12158a; i2++) {
            C4021u0.m17610c(sb, i, String.valueOf(C4042w1.m17902a(this.f12159b[i2])), this.f12160c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo13949n(int i, Object obj) {
        mo13942a();
        m17520b();
        int[] iArr = this.f12159b;
        int i2 = this.f12158a;
        iArr[i2] = i;
        this.f12160c[i2] = obj;
        this.f12158a = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo13950o(C4052x1 x1Var) throws IOException {
        if (x1Var.mo13805i() == C4052x1.C4053a.DESCENDING) {
            for (int i = this.f12158a - 1; i >= 0; i--) {
                x1Var.mo13799c(C4042w1.m17902a(this.f12159b[i]), this.f12160c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f12158a; i2++) {
            x1Var.mo13799c(C4042w1.m17902a(this.f12159b[i2]), this.f12160c[i2]);
        }
    }

    /* renamed from: q */
    public void mo13951q(C4052x1 x1Var) throws IOException {
        if (this.f12158a != 0) {
            if (x1Var.mo13805i() == C4052x1.C4053a.ASCENDING) {
                for (int i = 0; i < this.f12158a; i++) {
                    m17528p(this.f12159b[i], this.f12160c[i], x1Var);
                }
                return;
            }
            for (int i2 = this.f12158a - 1; i2 >= 0; i2--) {
                m17528p(this.f12159b[i2], this.f12160c[i2], x1Var);
            }
        }
    }

    private C4009r1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f12161d = -1;
        this.f12158a = i;
        this.f12159b = iArr;
        this.f12160c = objArr;
        this.f12162e = z;
    }
}
