package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p082e.p126k.p129c.p131j.C4042w1;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.j.e */
/* compiled from: BinaryReader */
abstract class C3917e implements C3933h1 {

    /* renamed from: e.k.c.j.e$a */
    /* compiled from: BinaryReader */
    static /* synthetic */ class C3918a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11989a;

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
                f11989a = r0
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x0090 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x009c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f11989a     // Catch:{ NoSuchFieldError -> 0x00cc }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3917e.C3918a.<clinit>():void");
        }
    }

    /* renamed from: e.k.c.j.e$b */
    /* compiled from: BinaryReader */
    private static final class C3919b extends C3917e {

        /* renamed from: a */
        private final boolean f11990a;

        /* renamed from: b */
        private final byte[] f11991b;

        /* renamed from: c */
        private int f11992c;

        /* renamed from: d */
        private int f11993d;

        /* renamed from: e */
        private int f11994e;

        /* renamed from: f */
        private int f11995f;

        public C3919b(ByteBuffer byteBuffer, boolean z) {
            super((C3918a) null);
            this.f11990a = z;
            this.f11991b = byteBuffer.array();
            this.f11992c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f11993d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: Q */
        private boolean m16669Q() {
            return this.f11992c == this.f11993d;
        }

        /* renamed from: R */
        private byte m16670R() throws IOException {
            int i = this.f11992c;
            if (i != this.f11993d) {
                byte[] bArr = this.f11991b;
                this.f11992c = i + 1;
                return bArr[i];
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: S */
        private Object m16671S(C4042w1.C4044b bVar, Class<?> cls, C4003q qVar) throws IOException {
            switch (C3918a.f11989a[bVar.ordinal()]) {
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

        /* renamed from: T */
        private <T> T m16672T(C3963j1<T> j1Var, C4003q qVar) throws IOException {
            int i = this.f11995f;
            this.f11995f = C4042w1.m17904c(C4042w1.m17902a(this.f11994e), 4);
            try {
                T h = j1Var.mo13711h();
                j1Var.mo13705b(h, this, qVar);
                j1Var.mo13706c(h);
                if (this.f11994e == this.f11995f) {
                    return h;
                }
                throw C3911c0.parseFailure();
            } finally {
                this.f11995f = i;
            }
        }

        /* renamed from: U */
        private int m16673U() throws IOException {
            m16680f0(4);
            return m16674V();
        }

        /* renamed from: V */
        private int m16674V() {
            int i = this.f11992c;
            byte[] bArr = this.f11991b;
            this.f11992c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: X */
        private long m16675X() throws IOException {
            m16680f0(8);
            return m16676Y();
        }

        /* renamed from: Y */
        private long m16676Y() {
            int i = this.f11992c;
            byte[] bArr = this.f11991b;
            this.f11992c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Z */
        private <T> T m16677Z(C3963j1<T> j1Var, C4003q qVar) throws IOException {
            int c0 = m16678c0();
            m16680f0(c0);
            int i = this.f11993d;
            int i2 = this.f11992c + c0;
            this.f11993d = i2;
            try {
                T h = j1Var.mo13711h();
                j1Var.mo13705b(h, this, qVar);
                j1Var.mo13706c(h);
                if (this.f11992c == i2) {
                    return h;
                }
                throw C3911c0.parseFailure();
            } finally {
                this.f11993d = i;
            }
        }

        /* renamed from: c0 */
        private int m16678c0() throws IOException {
            byte b;
            int i = this.f11992c;
            int i2 = this.f11993d;
            if (i2 != i) {
                byte[] bArr = this.f11991b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f11992c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) m16679e0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ 16256;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ 266354560;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw C3911c0.malformedVarint();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f11992c = i4;
                    return b;
                }
            } else {
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: e0 */
        private long m16679e0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte R = m16670R();
                j |= ((long) (R & Byte.MAX_VALUE)) << i;
                if ((R & 128) == 0) {
                    return j;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: f0 */
        private void m16680f0(int i) throws IOException {
            if (i < 0 || i > this.f11993d - this.f11992c) {
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: g0 */
        private void m16681g0(int i) throws IOException {
            if (this.f11992c != i) {
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: h0 */
        private void m16682h0(int i) throws IOException {
            if (C4042w1.m17903b(this.f11994e) != i) {
                throw C3911c0.invalidWireType();
            }
        }

        /* renamed from: i0 */
        private void m16683i0(int i) throws IOException {
            m16680f0(i);
            this.f11992c += i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: j0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m16684j0() throws java.io.IOException {
            /*
                r3 = this;
                int r0 = r3.f11995f
                int r1 = r3.f11994e
                int r1 = p082e.p126k.p129c.p131j.C4042w1.m17902a(r1)
                r2 = 4
                int r1 = p082e.p126k.p129c.p131j.C4042w1.m17904c(r1, r2)
                r3.f11995f = r1
            L_0x000f:
                int r1 = r3.mo13524z()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo13484G()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f11994e
                int r2 = r3.f11995f
                if (r1 != r2) goto L_0x0027
                r3.f11995f = r0
                return
            L_0x0027:
                e.k.c.j.c0 r0 = p082e.p126k.p129c.p131j.C3911c0.parseFailure()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3917e.C3919b.m16684j0():void");
        }

        /* renamed from: k0 */
        private void m16685k0() throws IOException {
            int i = this.f11993d;
            int i2 = this.f11992c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f11991b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f11992c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            m16686l0();
        }

        /* renamed from: l0 */
        private void m16686l0() throws IOException {
            int i = 0;
            while (i < 10) {
                if (m16670R() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: m0 */
        private void m16687m0(int i) throws IOException {
            m16680f0(i);
            if ((i & 3) != 0) {
                throw C3911c0.parseFailure();
            }
        }

        /* renamed from: n0 */
        private void m16688n0(int i) throws IOException {
            m16680f0(i);
            if ((i & 7) != 0) {
                throw C3911c0.parseFailure();
            }
        }

        /* renamed from: A */
        public void mo13478A(List<String> list) throws IOException {
            mo13497b0(list, false);
        }

        /* renamed from: B */
        public void mo13479B(List<String> list) throws IOException {
            mo13497b0(list, true);
        }

        /* renamed from: C */
        public C3934i mo13480C() throws IOException {
            C3934i iVar;
            m16682h0(2);
            int c0 = m16678c0();
            if (c0 == 0) {
                return C3934i.EMPTY;
            }
            m16680f0(c0);
            if (this.f11990a) {
                iVar = C3934i.wrap(this.f11991b, this.f11992c, c0);
            } else {
                iVar = C3934i.copyFrom(this.f11991b, this.f11992c, c0);
            }
            this.f11992c += c0;
            return iVar;
        }

        /* renamed from: D */
        public void mo13481D(List<Float> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C4050x) {
                C4050x xVar = (C4050x) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 2) {
                    int c0 = m16678c0();
                    m16687m0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        xVar.mo14081t(Float.intBitsToFloat(m16674V()));
                    }
                } else if (b == 5) {
                    do {
                        xVar.mo14081t(readFloat());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 2) {
                    int c02 = m16678c0();
                    m16687m0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(m16674V())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: E */
        public int mo13482E() throws IOException {
            m16682h0(0);
            return m16678c0();
        }

        /* renamed from: F */
        public <T> void mo13483F(List<T> list, C3963j1<T> j1Var, C4003q qVar) throws IOException {
            int i;
            if (C4042w1.m17903b(this.f11994e) == 3) {
                int i2 = this.f11994e;
                do {
                    list.add(m16672T(j1Var, qVar));
                    if (!m16669Q()) {
                        i = this.f11992c;
                    } else {
                        return;
                    }
                } while (m16678c0() == i2);
                this.f11992c = i;
                return;
            }
            throw C3911c0.invalidWireType();
        }

        /* renamed from: G */
        public boolean mo13484G() throws IOException {
            int i;
            if (m16669Q() || (i = this.f11994e) == this.f11995f) {
                return false;
            }
            int b = C4042w1.m17903b(i);
            if (b == 0) {
                m16685k0();
                return true;
            } else if (b == 1) {
                m16683i0(8);
                return true;
            } else if (b == 2) {
                m16683i0(m16678c0());
                return true;
            } else if (b == 3) {
                m16684j0();
                return true;
            } else if (b == 5) {
                m16683i0(4);
                return true;
            } else {
                throw C3911c0.invalidWireType();
            }
        }

        /* renamed from: H */
        public int mo13485H() throws IOException {
            m16682h0(5);
            return m16673U();
        }

        /* renamed from: I */
        public void mo13486I(List<C3934i> list) throws IOException {
            int i;
            if (C4042w1.m17903b(this.f11994e) == 2) {
                do {
                    list.add(mo13480C());
                    if (!m16669Q()) {
                        i = this.f11992c;
                    } else {
                        return;
                    }
                } while (m16678c0() == this.f11994e);
                this.f11992c = i;
                return;
            }
            throw C3911c0.invalidWireType();
        }

        /* renamed from: J */
        public void mo13487J(List<Double> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3992n) {
                C3992n nVar = (C3992n) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 1) {
                    do {
                        nVar.mo13892t(readDouble());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = m16678c0();
                    m16688n0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        nVar.mo13892t(Double.longBitsToDouble(m16676Y()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = m16678c0();
                    m16688n0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(m16676Y())));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: K */
        public <T> void mo13488K(List<T> list, C3963j1<T> j1Var, C4003q qVar) throws IOException {
            int i;
            if (C4042w1.m17903b(this.f11994e) == 2) {
                int i2 = this.f11994e;
                do {
                    list.add(m16677Z(j1Var, qVar));
                    if (!m16669Q()) {
                        i = this.f11992c;
                    } else {
                        return;
                    }
                } while (m16678c0() == i2);
                this.f11992c = i;
                return;
            }
            throw C3911c0.invalidWireType();
        }

        /* renamed from: L */
        public long mo13489L() throws IOException {
            m16682h0(0);
            return mo13500d0();
        }

        /* renamed from: M */
        public String mo13490M() throws IOException {
            return mo13495a0(true);
        }

        /* renamed from: N */
        public void mo13491N(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3962j0) {
                C3962j0 j0Var = (C3962j0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 1) {
                    do {
                        j0Var.mo13701u(mo13499d());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = m16678c0();
                    m16688n0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        j0Var.mo13701u(m16676Y());
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo13499d()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = m16678c0();
                    m16688n0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Long.valueOf(m16676Y()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: O */
        public <T> T mo13492O(C3963j1<T> j1Var, C4003q qVar) throws IOException {
            m16682h0(3);
            return m16672T(j1Var, qVar);
        }

        /* renamed from: W */
        public int mo13493W() {
            return this.f11994e;
        }

        /* renamed from: a */
        public <T> T mo13494a(C3963j1<T> j1Var, C4003q qVar) throws IOException {
            m16682h0(2);
            return m16677Z(j1Var, qVar);
        }

        /* renamed from: a0 */
        public String mo13495a0(boolean z) throws IOException {
            m16682h0(2);
            int c0 = m16678c0();
            if (c0 == 0) {
                return BuildConfig.FLAVOR;
            }
            m16680f0(c0);
            if (z) {
                byte[] bArr = this.f11991b;
                int i = this.f11992c;
                if (!C4032v1.m17832t(bArr, i, i + c0)) {
                    throw C3911c0.invalidUtf8();
                }
            }
            String str = new String(this.f11991b, this.f11992c, c0, C3899b0.f11982a);
            this.f11992c += c0;
            return str;
        }

        /* renamed from: b */
        public void mo13496b(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        a0Var.mo13429t(mo13520v());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        a0Var.mo13429t(C3956j.m16881b(m16678c0()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo13520v()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Integer.valueOf(C3956j.m16881b(m16678c0())));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: b0 */
        public void mo13497b0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (C4042w1.m17903b(this.f11994e) != 2) {
                throw C3911c0.invalidWireType();
            } else if (!(list instanceof C3932h0) || z) {
                do {
                    list.add(mo13495a0(z));
                    if (!m16669Q()) {
                        i = this.f11992c;
                    } else {
                        return;
                    }
                } while (m16678c0() == this.f11994e);
                this.f11992c = i;
            } else {
                C3932h0 h0Var = (C3932h0) list;
                do {
                    h0Var.mo13569j(mo13480C());
                    if (!m16669Q()) {
                        i2 = this.f11992c;
                    } else {
                        return;
                    }
                } while (m16678c0() == this.f11994e);
                this.f11992c = i2;
            }
        }

        /* renamed from: c */
        public long mo13498c() throws IOException {
            m16682h0(0);
            return mo13500d0();
        }

        /* renamed from: d */
        public long mo13499d() throws IOException {
            m16682h0(1);
            return m16675X();
        }

        /* renamed from: d0 */
        public long mo13500d0() throws IOException {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f11992c;
            int i3 = this.f11993d;
            if (i3 != i2) {
                byte[] bArr = this.f11991b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f11992c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return m16679e0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ 16256);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ -2080896;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw C3911c0.malformedVarint();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f11992c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f11992c = i;
                    return j;
                }
            } else {
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: e */
        public <T> T mo13501e(Class<T> cls, C4003q qVar) throws IOException {
            m16682h0(2);
            return m16677Z(C3924e1.m16737a().mo13539d(cls), qVar);
        }

        /* renamed from: f */
        public void mo13502f(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 2) {
                    int c0 = m16678c0();
                    m16687m0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        a0Var.mo13429t(m16674V());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.mo13429t(mo13485H());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 2) {
                    int c02 = m16678c0();
                    m16687m0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Integer.valueOf(m16674V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo13485H()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: g */
        public void mo13503g(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3962j0) {
                C3962j0 j0Var = (C3962j0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        j0Var.mo13701u(mo13521w());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        j0Var.mo13701u(C3956j.m16882c(mo13500d0()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo13521w()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Long.valueOf(C3956j.m16882c(mo13500d0())));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: h */
        public void mo13504h(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        a0Var.mo13429t(mo13510n());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        a0Var.mo13429t(m16678c0());
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo13510n()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Integer.valueOf(m16678c0()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: i */
        public int mo13505i() throws IOException {
            m16682h0(5);
            return m16673U();
        }

        /* renamed from: j */
        public boolean mo13506j() throws IOException {
            m16682h0(0);
            if (m16678c0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: k */
        public long mo13507k() throws IOException {
            m16682h0(1);
            return m16675X();
        }

        /* renamed from: l */
        public void mo13508l(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3962j0) {
                C3962j0 j0Var = (C3962j0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        j0Var.mo13701u(mo13498c());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        j0Var.mo13701u(mo13500d0());
                    }
                    m16681g0(c0);
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo13498c()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Long.valueOf(mo13500d0()));
                    }
                    m16681g0(c02);
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: m */
        public <T> T mo13509m(Class<T> cls, C4003q qVar) throws IOException {
            m16682h0(3);
            return m16672T(C3924e1.m16737a().mo13539d(cls), qVar);
        }

        /* renamed from: n */
        public int mo13510n() throws IOException {
            m16682h0(0);
            return m16678c0();
        }

        /* renamed from: o */
        public void mo13511o(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3962j0) {
                C3962j0 j0Var = (C3962j0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        j0Var.mo13701u(mo13489L());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        j0Var.mo13701u(mo13500d0());
                    }
                    m16681g0(c0);
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo13489L()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Long.valueOf(mo13500d0()));
                    }
                    m16681g0(c02);
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: p */
        public void mo13512p(List<Long> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3962j0) {
                C3962j0 j0Var = (C3962j0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 1) {
                    do {
                        j0Var.mo13701u(mo13507k());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = m16678c0();
                    m16688n0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        j0Var.mo13701u(m16676Y());
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo13507k()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = m16678c0();
                    m16688n0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Long.valueOf(m16676Y()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: q */
        public void mo13513q(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        a0Var.mo13429t(mo13482E());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        a0Var.mo13429t(m16678c0());
                    }
                    m16681g0(c0);
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo13482E()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Integer.valueOf(m16678c0()));
                    }
                    m16681g0(c02);
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: r */
        public void mo13514r(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        a0Var.mo13429t(mo13518t());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        a0Var.mo13429t(m16678c0());
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo13518t()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Integer.valueOf(m16678c0()));
                    }
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        public double readDouble() throws IOException {
            m16682h0(1);
            return Double.longBitsToDouble(m16675X());
        }

        public float readFloat() throws IOException {
            m16682h0(5);
            return Float.intBitsToFloat(m16673U());
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo13484G() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new p082e.p126k.p129c.p131j.C3911c0("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo13517s(java.util.Map<K, V> r8, p082e.p126k.p129c.p131j.C3976l0.C3977a<K, V> r9, p082e.p126k.p129c.p131j.C4003q r10) throws java.io.IOException {
            /*
                r7 = this;
                r0 = 2
                r7.m16682h0(r0)
                int r1 = r7.m16678c0()
                r7.m16680f0(r1)
                int r2 = r7.f11993d
                int r3 = r7.f11992c
                int r3 = r3 + r1
                r7.f11993d = r3
                K r1 = r9.f12108b     // Catch:{ all -> 0x005b }
                V r3 = r9.f12110d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo13524z()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f11993d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo13484G()     // Catch:{ a -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                e.k.c.j.c0 r4 = new e.k.c.j.c0     // Catch:{ a -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004e }
                throw r4     // Catch:{ a -> 0x004e }
            L_0x0039:
                e.k.c.j.w1$b r4 = r9.f12109c     // Catch:{ a -> 0x004e }
                V r5 = r9.f12110d     // Catch:{ a -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004e }
                java.lang.Object r3 = r7.m16671S(r4, r5, r10)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x0046:
                e.k.c.j.w1$b r4 = r9.f12107a     // Catch:{ a -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.m16671S(r4, r5, r5)     // Catch:{ a -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo13484G()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                e.k.c.j.c0 r8 = new e.k.c.j.c0     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f11993d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3917e.C3919b.mo13517s(java.util.Map, e.k.c.j.l0$a, e.k.c.j.q):void");
        }

        /* renamed from: t */
        public int mo13518t() throws IOException {
            m16682h0(0);
            return m16678c0();
        }

        /* renamed from: u */
        public void mo13519u(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3895a0) {
                C3895a0 a0Var = (C3895a0) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 2) {
                    int c0 = m16678c0();
                    m16687m0(c0);
                    int i3 = this.f11992c + c0;
                    while (this.f11992c < i3) {
                        a0Var.mo13429t(m16674V());
                    }
                } else if (b == 5) {
                    do {
                        a0Var.mo13429t(mo13505i());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 2) {
                    int c02 = m16678c0();
                    m16687m0(c02);
                    int i4 = this.f11992c + c02;
                    while (this.f11992c < i4) {
                        list.add(Integer.valueOf(m16674V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo13505i()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: v */
        public int mo13520v() throws IOException {
            m16682h0(0);
            return C3956j.m16881b(m16678c0());
        }

        /* renamed from: w */
        public long mo13521w() throws IOException {
            m16682h0(0);
            return C3956j.m16882c(mo13500d0());
        }

        /* renamed from: x */
        public void mo13522x(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (list instanceof C3925f) {
                C3925f fVar = (C3925f) list;
                int b = C4042w1.m17903b(this.f11994e);
                if (b == 0) {
                    do {
                        fVar.mo13553u(mo13506j());
                        if (!m16669Q()) {
                            i2 = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i2;
                } else if (b == 2) {
                    int c0 = this.f11992c + m16678c0();
                    while (this.f11992c < c0) {
                        fVar.mo13553u(m16678c0() != 0);
                    }
                    m16681g0(c0);
                } else {
                    throw C3911c0.invalidWireType();
                }
            } else {
                int b2 = C4042w1.m17903b(this.f11994e);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo13506j()));
                        if (!m16669Q()) {
                            i = this.f11992c;
                        } else {
                            return;
                        }
                    } while (m16678c0() == this.f11994e);
                    this.f11992c = i;
                } else if (b2 == 2) {
                    int c02 = this.f11992c + m16678c0();
                    while (this.f11992c < c02) {
                        list.add(Boolean.valueOf(m16678c0() != 0));
                    }
                    m16681g0(c02);
                } else {
                    throw C3911c0.invalidWireType();
                }
            }
        }

        /* renamed from: y */
        public String mo13523y() throws IOException {
            return mo13495a0(false);
        }

        /* renamed from: z */
        public int mo13524z() throws IOException {
            if (m16669Q()) {
                return Integer.MAX_VALUE;
            }
            int c0 = m16678c0();
            this.f11994e = c0;
            if (c0 == this.f11995f) {
                return Integer.MAX_VALUE;
            }
            return C4042w1.m17902a(c0);
        }
    }

    /* synthetic */ C3917e(C3918a aVar) {
        this();
    }

    /* renamed from: P */
    public static C3917e m16668P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C3919b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    private C3917e() {
    }
}
