package p082e.p126k.p129c.p131j;

import java.io.IOException;

/* renamed from: e.k.c.j.q1 */
/* compiled from: UnknownFieldSchema */
abstract class C4006q1<T, B> {
    C4006q1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo13912a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo13913b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo13914c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo13915d(B b, int i, C3934i iVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo13916e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo13917f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo13918g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo13919h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo13920i(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo13921j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo13922k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13923l(B r3, p082e.p126k.p129c.p131j.C3933h1 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo13524z()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo13924m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4006q1.mo13923l(java.lang.Object, e.k.c.j.h1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo13924m(B b, C3933h1 h1Var) throws IOException {
        int W = h1Var.mo13493W();
        int a = C4042w1.m17902a(W);
        int b2 = C4042w1.m17903b(W);
        if (b2 == 0) {
            mo13916e(b, a, h1Var.mo13489L());
            return true;
        } else if (b2 == 1) {
            mo13913b(b, a, h1Var.mo13499d());
            return true;
        } else if (b2 == 2) {
            mo13915d(b, a, h1Var.mo13480C());
            return true;
        } else if (b2 == 3) {
            Object n = mo13925n();
            int c = C4042w1.m17904c(a, 4);
            mo13923l(n, h1Var);
            if (c == h1Var.mo13493W()) {
                mo13914c(b, a, mo13929r(n));
                return true;
            }
            throw C3911c0.invalidEndTag();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo13912a(b, a, h1Var.mo13505i());
                return true;
            }
            throw C3911c0.invalidWireType();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo13925n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo13926o(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo13927p(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo13928q(C3933h1 h1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract T mo13929r(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo13930s(T t, C4052x1 x1Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo13931t(T t, C4052x1 x1Var) throws IOException;
}
