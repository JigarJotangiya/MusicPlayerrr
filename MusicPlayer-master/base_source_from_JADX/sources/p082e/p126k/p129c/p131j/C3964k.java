package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.List;
import p082e.p126k.p129c.p131j.C4042w1;

/* renamed from: e.k.c.j.k */
/* compiled from: CodedInputStreamReader */
final class C3964k implements C3933h1 {

    /* renamed from: a */
    private final C3956j f12084a;

    /* renamed from: b */
    private int f12085b;

    /* renamed from: c */
    private int f12086c;

    /* renamed from: d */
    private int f12087d = 0;

    /* renamed from: e.k.c.j.k$a */
    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class C3965a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12088a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.k.c.j.w1$b[] r0 = p082e.p126k.p129c.p131j.C4042w1.C4044b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12088a = r0
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x0090 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x009c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f12088a     // Catch:{ NoSuchFieldError -> 0x00cc }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3964k.C3965a.<clinit>():void");
        }
    }

    private C3964k(C3956j jVar) {
        C3899b0.m16646b(jVar, "input");
        C3956j jVar2 = jVar;
        this.f12084a = jVar2;
        jVar2.f12052d = this;
    }

    /* renamed from: P */
    public static C3964k m17056P(C3956j jVar) {
        C3964k kVar = jVar.f12052d;
        if (kVar != null) {
            return kVar;
        }
        return new C3964k(jVar);
    }

    /* renamed from: Q */
    private Object m17057Q(C4042w1.C4044b bVar, Class<?> cls, C4003q qVar) throws IOException {
        switch (C3965a.f12088a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo13506j());
            case 2:
                return mo13480C();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo13518t());
            case 5:
                return Integer.valueOf(mo13505i());
            case 6:
                return Long.valueOf(mo13499d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo13482E());
            case 9:
                return Long.valueOf(mo13489L());
            case 10:
                return mo13501e(cls, qVar);
            case 11:
                return Integer.valueOf(mo13485H());
            case 12:
                return Long.valueOf(mo13507k());
            case 13:
                return Integer.valueOf(mo13520v());
            case 14:
                return Long.valueOf(mo13521w());
            case 15:
                return mo13490M();
            case 16:
                return Integer.valueOf(mo13510n());
            case 17:
                return Long.valueOf(mo13498c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    private <T> T m17058R(C3963j1<T> j1Var, C4003q qVar) throws IOException {
        int i = this.f12086c;
        this.f12086c = C4042w1.m17904c(C4042w1.m17902a(this.f12085b), 4);
        try {
            T h = j1Var.mo13711h();
            j1Var.mo13705b(h, this, qVar);
            j1Var.mo13706c(h);
            if (this.f12085b == this.f12086c) {
                return h;
            }
            throw C3911c0.parseFailure();
        } finally {
            this.f12086c = i;
        }
    }

    /* renamed from: S */
    private <T> T m17059S(C3963j1<T> j1Var, C4003q qVar) throws IOException {
        int D = this.f12084a.mo13642D();
        C3956j jVar = this.f12084a;
        if (jVar.f12049a < jVar.f12050b) {
            int m = jVar.mo13649m(D);
            T h = j1Var.mo13711h();
            this.f12084a.f12049a++;
            j1Var.mo13705b(h, this, qVar);
            j1Var.mo13706c(h);
            this.f12084a.mo13645a(0);
            C3956j jVar2 = this.f12084a;
            jVar2.f12049a--;
            jVar2.mo13648l(m);
            return h;
        }
        throw C3911c0.recursionLimitExceeded();
    }

    /* renamed from: U */
    private void m17060U(int i) throws IOException {
        if (this.f12084a.mo13646d() != i) {
            throw C3911c0.truncatedMessage();
        }
    }

    /* renamed from: V */
    private void m17061V(int i) throws IOException {
        if (C4042w1.m17903b(this.f12085b) != i) {
            throw C3911c0.invalidWireType();
        }
    }

    /* renamed from: X */
    private void m17062X(int i) throws IOException {
        if ((i & 3) != 0) {
            throw C3911c0.parseFailure();
        }
    }

    /* renamed from: Y */
    private void m17063Y(int i) throws IOException {
        if ((i & 7) != 0) {
            throw C3911c0.parseFailure();
        }
    }

    /* renamed from: A */
    public void mo13478A(List<String> list) throws IOException {
        mo13713T(list, false);
    }

    /* renamed from: B */
    public void mo13479B(List<String> list) throws IOException {
        mo13713T(list, true);
    }

    /* renamed from: C */
    public C3934i mo13480C() throws IOException {
        m17061V(2);
        return this.f12084a.mo13651o();
    }

    /* renamed from: D */
    public void mo13481D(List<Float> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C4050x) {
            C4050x xVar = (C4050x) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17062X(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    xVar.mo14081t(this.f12084a.mo13656t());
                } while (this.f12084a.mo13646d() < d);
            } else if (b == 5) {
                do {
                    xVar.mo14081t(this.f12084a.mo13656t());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17062X(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Float.valueOf(this.f12084a.mo13656t()));
                } while (this.f12084a.mo13646d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f12084a.mo13656t()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: E */
    public int mo13482E() throws IOException {
        m17061V(0);
        return this.f12084a.mo13657u();
    }

    /* renamed from: F */
    public <T> void mo13483F(List<T> list, C3963j1<T> j1Var, C4003q qVar) throws IOException {
        int C;
        if (C4042w1.m17903b(this.f12085b) == 3) {
            int i = this.f12085b;
            do {
                list.add(m17058R(j1Var, qVar));
                if (!this.f12084a.mo13647e() && this.f12087d == 0) {
                    C = this.f12084a.mo13641C();
                } else {
                    return;
                }
            } while (C == i);
            this.f12087d = C;
            return;
        }
        throw C3911c0.invalidWireType();
    }

    /* renamed from: G */
    public boolean mo13484G() throws IOException {
        int i;
        if (this.f12084a.mo13647e() || (i = this.f12085b) == this.f12086c) {
            return false;
        }
        return this.f12084a.mo13644F(i);
    }

    /* renamed from: H */
    public int mo13485H() throws IOException {
        m17061V(5);
        return this.f12084a.mo13659w();
    }

    /* renamed from: I */
    public void mo13486I(List<C3934i> list) throws IOException {
        int C;
        if (C4042w1.m17903b(this.f12085b) == 2) {
            do {
                list.add(mo13480C());
                if (!this.f12084a.mo13647e()) {
                    C = this.f12084a.mo13641C();
                } else {
                    return;
                }
            } while (C == this.f12085b);
            this.f12087d = C;
            return;
        }
        throw C3911c0.invalidWireType();
    }

    /* renamed from: J */
    public void mo13487J(List<Double> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3992n) {
            C3992n nVar = (C3992n) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 1) {
                do {
                    nVar.mo13892t(this.f12084a.mo13652p());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17063Y(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    nVar.mo13892t(this.f12084a.mo13652p());
                } while (this.f12084a.mo13646d() < d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f12084a.mo13652p()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17063Y(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Double.valueOf(this.f12084a.mo13652p()));
                } while (this.f12084a.mo13646d() < d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: K */
    public <T> void mo13488K(List<T> list, C3963j1<T> j1Var, C4003q qVar) throws IOException {
        int C;
        if (C4042w1.m17903b(this.f12085b) == 2) {
            int i = this.f12085b;
            do {
                list.add(m17059S(j1Var, qVar));
                if (!this.f12084a.mo13647e() && this.f12087d == 0) {
                    C = this.f12084a.mo13641C();
                } else {
                    return;
                }
            } while (C == i);
            this.f12087d = C;
            return;
        }
        throw C3911c0.invalidWireType();
    }

    /* renamed from: L */
    public long mo13489L() throws IOException {
        m17061V(0);
        return this.f12084a.mo13658v();
    }

    /* renamed from: M */
    public String mo13490M() throws IOException {
        m17061V(2);
        return this.f12084a.mo13640B();
    }

    /* renamed from: N */
    public void mo13491N(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 1) {
                do {
                    j0Var.mo13701u(this.f12084a.mo13655s());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17063Y(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    j0Var.mo13701u(this.f12084a.mo13655s());
                } while (this.f12084a.mo13646d() < d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f12084a.mo13655s()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17063Y(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Long.valueOf(this.f12084a.mo13655s()));
                } while (this.f12084a.mo13646d() < d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: O */
    public <T> T mo13492O(C3963j1<T> j1Var, C4003q qVar) throws IOException {
        m17061V(3);
        return m17058R(j1Var, qVar);
    }

    /* renamed from: T */
    public void mo13713T(List<String> list, boolean z) throws IOException {
        int C;
        int C2;
        if (C4042w1.m17903b(this.f12085b) != 2) {
            throw C3911c0.invalidWireType();
        } else if (!(list instanceof C3932h0) || z) {
            do {
                list.add(z ? mo13490M() : mo13523y());
                if (!this.f12084a.mo13647e()) {
                    C = this.f12084a.mo13641C();
                } else {
                    return;
                }
            } while (C == this.f12085b);
            this.f12087d = C;
        } else {
            C3932h0 h0Var = (C3932h0) list;
            do {
                h0Var.mo13569j(mo13480C());
                if (!this.f12084a.mo13647e()) {
                    C2 = this.f12084a.mo13641C();
                } else {
                    return;
                }
            } while (C2 == this.f12085b);
            this.f12087d = C2;
        }
    }

    /* renamed from: W */
    public int mo13493W() {
        return this.f12085b;
    }

    /* renamed from: a */
    public <T> T mo13494a(C3963j1<T> j1Var, C4003q qVar) throws IOException {
        m17061V(2);
        return m17059S(j1Var, qVar);
    }

    /* renamed from: b */
    public void mo13496b(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13661y());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    a0Var.mo13429t(this.f12084a.mo13661y());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13661y()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13661y()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: c */
    public long mo13498c() throws IOException {
        m17061V(0);
        return this.f12084a.mo13643E();
    }

    /* renamed from: d */
    public long mo13499d() throws IOException {
        m17061V(1);
        return this.f12084a.mo13655s();
    }

    /* renamed from: e */
    public <T> T mo13501e(Class<T> cls, C4003q qVar) throws IOException {
        m17061V(2);
        return m17059S(C3924e1.m16737a().mo13539d(cls), qVar);
    }

    /* renamed from: f */
    public void mo13502f(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17062X(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    a0Var.mo13429t(this.f12084a.mo13659w());
                } while (this.f12084a.mo13646d() < d);
            } else if (b == 5) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13659w());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17062X(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13659w()));
                } while (this.f12084a.mo13646d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13659w()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: g */
    public void mo13503g(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    j0Var.mo13701u(this.f12084a.mo13662z());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    j0Var.mo13701u(this.f12084a.mo13662z());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f12084a.mo13662z()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Long.valueOf(this.f12084a.mo13662z()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: h */
    public void mo13504h(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13642D());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    a0Var.mo13429t(this.f12084a.mo13642D());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13642D()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13642D()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: i */
    public int mo13505i() throws IOException {
        m17061V(5);
        return this.f12084a.mo13654r();
    }

    /* renamed from: j */
    public boolean mo13506j() throws IOException {
        m17061V(0);
        return this.f12084a.mo13650n();
    }

    /* renamed from: k */
    public long mo13507k() throws IOException {
        m17061V(1);
        return this.f12084a.mo13660x();
    }

    /* renamed from: l */
    public void mo13508l(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    j0Var.mo13701u(this.f12084a.mo13643E());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    j0Var.mo13701u(this.f12084a.mo13643E());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f12084a.mo13643E()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Long.valueOf(this.f12084a.mo13643E()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: m */
    public <T> T mo13509m(Class<T> cls, C4003q qVar) throws IOException {
        m17061V(3);
        return m17058R(C3924e1.m16737a().mo13539d(cls), qVar);
    }

    /* renamed from: n */
    public int mo13510n() throws IOException {
        m17061V(0);
        return this.f12084a.mo13642D();
    }

    /* renamed from: o */
    public void mo13511o(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    j0Var.mo13701u(this.f12084a.mo13658v());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    j0Var.mo13701u(this.f12084a.mo13658v());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f12084a.mo13658v()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Long.valueOf(this.f12084a.mo13658v()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: p */
    public void mo13512p(List<Long> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3962j0) {
            C3962j0 j0Var = (C3962j0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 1) {
                do {
                    j0Var.mo13701u(this.f12084a.mo13660x());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17063Y(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    j0Var.mo13701u(this.f12084a.mo13660x());
                } while (this.f12084a.mo13646d() < d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f12084a.mo13660x()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17063Y(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Long.valueOf(this.f12084a.mo13660x()));
                } while (this.f12084a.mo13646d() < d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: q */
    public void mo13513q(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13657u());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    a0Var.mo13429t(this.f12084a.mo13657u());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13657u()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13657u()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public void mo13514r(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13653q());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    a0Var.mo13429t(this.f12084a.mo13653q());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13653q()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13653q()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    public double readDouble() throws IOException {
        m17061V(1);
        return this.f12084a.mo13652p();
    }

    public float readFloat() throws IOException {
        m17061V(5);
        return this.f12084a.mo13656t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo13484G() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new p082e.p126k.p129c.p131j.C3911c0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo13517s(java.util.Map<K, V> r8, p082e.p126k.p129c.p131j.C3976l0.C3977a<K, V> r9, p082e.p126k.p129c.p131j.C4003q r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m17061V(r0)
            e.k.c.j.j r1 = r7.f12084a
            int r1 = r1.mo13642D()
            e.k.c.j.j r2 = r7.f12084a
            int r1 = r2.mo13649m(r1)
            K r2 = r9.f12108b
            V r3 = r9.f12110d
        L_0x0014:
            int r4 = r7.mo13524z()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            e.k.c.j.j r5 = r7.f12084a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo13647e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo13484G()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            e.k.c.j.c0 r4 = new e.k.c.j.c0     // Catch:{ a -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            e.k.c.j.w1$b r4 = r9.f12109c     // Catch:{ a -> 0x004f }
            V r5 = r9.f12110d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.m17057Q(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            e.k.c.j.w1$b r4 = r9.f12107a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.m17057Q(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo13484G()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            e.k.c.j.c0 r8 = new e.k.c.j.c0     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            e.k.c.j.j r8 = r7.f12084a
            r8.mo13648l(r1)
            return
        L_0x0065:
            r8 = move-exception
            e.k.c.j.j r9 = r7.f12084a
            r9.mo13648l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3964k.mo13517s(java.util.Map, e.k.c.j.l0$a, e.k.c.j.q):void");
    }

    /* renamed from: t */
    public int mo13518t() throws IOException {
        m17061V(0);
        return this.f12084a.mo13653q();
    }

    /* renamed from: u */
    public void mo13519u(List<Integer> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3895a0) {
            C3895a0 a0Var = (C3895a0) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 2) {
                int D = this.f12084a.mo13642D();
                m17062X(D);
                int d = this.f12084a.mo13646d() + D;
                do {
                    a0Var.mo13429t(this.f12084a.mo13654r());
                } while (this.f12084a.mo13646d() < d);
            } else if (b == 5) {
                do {
                    a0Var.mo13429t(this.f12084a.mo13654r());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 2) {
                int D2 = this.f12084a.mo13642D();
                m17062X(D2);
                int d2 = this.f12084a.mo13646d() + D2;
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13654r()));
                } while (this.f12084a.mo13646d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f12084a.mo13654r()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: v */
    public int mo13520v() throws IOException {
        m17061V(0);
        return this.f12084a.mo13661y();
    }

    /* renamed from: w */
    public long mo13521w() throws IOException {
        m17061V(0);
        return this.f12084a.mo13662z();
    }

    /* renamed from: x */
    public void mo13522x(List<Boolean> list) throws IOException {
        int C;
        int C2;
        if (list instanceof C3925f) {
            C3925f fVar = (C3925f) list;
            int b = C4042w1.m17903b(this.f12085b);
            if (b == 0) {
                do {
                    fVar.mo13553u(this.f12084a.mo13650n());
                    if (!this.f12084a.mo13647e()) {
                        C2 = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C2 == this.f12085b);
                this.f12087d = C2;
            } else if (b == 2) {
                int d = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    fVar.mo13553u(this.f12084a.mo13650n());
                } while (this.f12084a.mo13646d() < d);
                m17060U(d);
            } else {
                throw C3911c0.invalidWireType();
            }
        } else {
            int b2 = C4042w1.m17903b(this.f12085b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f12084a.mo13650n()));
                    if (!this.f12084a.mo13647e()) {
                        C = this.f12084a.mo13641C();
                    } else {
                        return;
                    }
                } while (C == this.f12085b);
                this.f12087d = C;
            } else if (b2 == 2) {
                int d2 = this.f12084a.mo13646d() + this.f12084a.mo13642D();
                do {
                    list.add(Boolean.valueOf(this.f12084a.mo13650n()));
                } while (this.f12084a.mo13646d() < d2);
                m17060U(d2);
            } else {
                throw C3911c0.invalidWireType();
            }
        }
    }

    /* renamed from: y */
    public String mo13523y() throws IOException {
        m17061V(2);
        return this.f12084a.mo13639A();
    }

    /* renamed from: z */
    public int mo13524z() throws IOException {
        int i = this.f12087d;
        if (i != 0) {
            this.f12085b = i;
            this.f12087d = 0;
        } else {
            this.f12085b = this.f12084a.mo13641C();
        }
        int i2 = this.f12085b;
        if (i2 == 0 || i2 == this.f12086c) {
            return Integer.MAX_VALUE;
        }
        return C4042w1.m17902a(i2);
    }
}
