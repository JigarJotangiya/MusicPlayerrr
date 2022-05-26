package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.j.j */
/* compiled from: CodedInputStream */
public abstract class C3956j {

    /* renamed from: a */
    int f12049a;

    /* renamed from: b */
    int f12050b;

    /* renamed from: c */
    int f12051c;

    /* renamed from: d */
    C3964k f12052d;

    /* renamed from: e.k.c.j.j$b */
    /* compiled from: CodedInputStream */
    private static final class C3958b extends C3956j {

        /* renamed from: e */
        private final byte[] f12053e;

        /* renamed from: f */
        private final boolean f12054f;

        /* renamed from: g */
        private int f12055g;

        /* renamed from: h */
        private int f12056h;

        /* renamed from: i */
        private int f12057i;

        /* renamed from: j */
        private int f12058j;

        /* renamed from: k */
        private int f12059k;

        /* renamed from: l */
        private boolean f12060l;

        /* renamed from: m */
        private int f12061m;

        /* renamed from: N */
        private void m16913N() {
            int i = this.f12055g + this.f12056h;
            this.f12055g = i;
            int i2 = i - this.f12058j;
            int i3 = this.f12061m;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f12056h = i4;
                this.f12055g = i - i4;
                return;
            }
            this.f12056h = 0;
        }

        /* renamed from: Q */
        private void m16914Q() throws IOException {
            if (this.f12055g - this.f12057i >= 10) {
                m16915R();
            } else {
                m16916S();
            }
        }

        /* renamed from: R */
        private void m16915R() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f12053e;
                int i2 = this.f12057i;
                this.f12057i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: S */
        private void m16916S() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo13663G() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: A */
        public String mo13639A() throws IOException {
            int K = mo13667K();
            if (K > 0 && K <= this.f12055g - this.f12057i) {
                String str = new String(this.f12053e, this.f12057i, K, C3899b0.f11982a);
                this.f12057i += K;
                return str;
            } else if (K == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (K < 0) {
                    throw C3911c0.negativeSize();
                }
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: B */
        public String mo13640B() throws IOException {
            int K = mo13667K();
            if (K > 0) {
                int i = this.f12055g;
                int i2 = this.f12057i;
                if (K <= i - i2) {
                    String h = C4032v1.m17820h(this.f12053e, i2, K);
                    this.f12057i += K;
                    return h;
                }
            }
            if (K == 0) {
                return BuildConfig.FLAVOR;
            }
            if (K <= 0) {
                throw C3911c0.negativeSize();
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: C */
        public int mo13641C() throws IOException {
            if (mo13647e()) {
                this.f12059k = 0;
                return 0;
            }
            int K = mo13667K();
            this.f12059k = K;
            if (C4042w1.m17902a(K) != 0) {
                return this.f12059k;
            }
            throw C3911c0.invalidTag();
        }

        /* renamed from: D */
        public int mo13642D() throws IOException {
            return mo13667K();
        }

        /* renamed from: E */
        public long mo13643E() throws IOException {
            return mo13668L();
        }

        /* renamed from: F */
        public boolean mo13644F(int i) throws IOException {
            int b = C4042w1.m17903b(i);
            if (b == 0) {
                m16914Q();
                return true;
            } else if (b == 1) {
                mo13671P(8);
                return true;
            } else if (b == 2) {
                mo13671P(mo13667K());
                return true;
            } else if (b == 3) {
                mo13670O();
                mo13645a(C4042w1.m17904c(C4042w1.m17902a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo13671P(4);
                    return true;
                }
                throw C3911c0.invalidWireType();
            }
        }

        /* renamed from: G */
        public byte mo13663G() throws IOException {
            int i = this.f12057i;
            if (i != this.f12055g) {
                byte[] bArr = this.f12053e;
                this.f12057i = i + 1;
                return bArr[i];
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: H */
        public byte[] mo13664H(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f12055g;
                int i3 = this.f12057i;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f12057i = i4;
                    return Arrays.copyOfRange(this.f12053e, i3, i4);
                }
            }
            if (i > 0) {
                throw C3911c0.truncatedMessage();
            } else if (i == 0) {
                return C3899b0.f11983b;
            } else {
                throw C3911c0.negativeSize();
            }
        }

        /* renamed from: I */
        public int mo13665I() throws IOException {
            int i = this.f12057i;
            if (this.f12055g - i >= 4) {
                byte[] bArr = this.f12053e;
                this.f12057i = i + 4;
                return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: J */
        public long mo13666J() throws IOException {
            int i = this.f12057i;
            if (this.f12055g - i >= 8) {
                byte[] bArr = this.f12053e;
                this.f12057i = i + 8;
                return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
            }
            throw C3911c0.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo13667K() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f12057i
                int r1 = r5.f12055g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f12053e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f12057i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo13669M()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f12057i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3958b.mo13667K():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo13668L() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f12057i
                int r1 = r11.f12055g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f12053e
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f12057i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo13669M()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f12057i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3958b.mo13668L():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public long mo13669M() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte G = mo13663G();
                j |= ((long) (G & Byte.MAX_VALUE)) << i;
                if ((G & 128) == 0) {
                    return j;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: O */
        public void mo13670O() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo13641C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo13644F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3958b.mo13670O():void");
        }

        /* renamed from: P */
        public void mo13671P(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f12055g;
                int i3 = this.f12057i;
                if (i <= i2 - i3) {
                    this.f12057i = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw C3911c0.negativeSize();
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: a */
        public void mo13645a(int i) throws C3911c0 {
            if (this.f12059k != i) {
                throw C3911c0.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo13646d() {
            return this.f12057i - this.f12058j;
        }

        /* renamed from: e */
        public boolean mo13647e() throws IOException {
            return this.f12057i == this.f12055g;
        }

        /* renamed from: l */
        public void mo13648l(int i) {
            this.f12061m = i;
            m16913N();
        }

        /* renamed from: m */
        public int mo13649m(int i) throws C3911c0 {
            if (i >= 0) {
                int d = i + mo13646d();
                int i2 = this.f12061m;
                if (d <= i2) {
                    this.f12061m = d;
                    m16913N();
                    return i2;
                }
                throw C3911c0.truncatedMessage();
            }
            throw C3911c0.negativeSize();
        }

        /* renamed from: n */
        public boolean mo13650n() throws IOException {
            return mo13668L() != 0;
        }

        /* renamed from: o */
        public C3934i mo13651o() throws IOException {
            C3934i iVar;
            int K = mo13667K();
            if (K > 0) {
                int i = this.f12055g;
                int i2 = this.f12057i;
                if (K <= i - i2) {
                    if (!this.f12054f || !this.f12060l) {
                        iVar = C3934i.copyFrom(this.f12053e, i2, K);
                    } else {
                        iVar = C3934i.wrap(this.f12053e, i2, K);
                    }
                    this.f12057i += K;
                    return iVar;
                }
            }
            if (K == 0) {
                return C3934i.EMPTY;
            }
            return C3934i.wrap(mo13664H(K));
        }

        /* renamed from: p */
        public double mo13652p() throws IOException {
            return Double.longBitsToDouble(mo13666J());
        }

        /* renamed from: q */
        public int mo13653q() throws IOException {
            return mo13667K();
        }

        /* renamed from: r */
        public int mo13654r() throws IOException {
            return mo13665I();
        }

        /* renamed from: s */
        public long mo13655s() throws IOException {
            return mo13666J();
        }

        /* renamed from: t */
        public float mo13656t() throws IOException {
            return Float.intBitsToFloat(mo13665I());
        }

        /* renamed from: u */
        public int mo13657u() throws IOException {
            return mo13667K();
        }

        /* renamed from: v */
        public long mo13658v() throws IOException {
            return mo13668L();
        }

        /* renamed from: w */
        public int mo13659w() throws IOException {
            return mo13665I();
        }

        /* renamed from: x */
        public long mo13660x() throws IOException {
            return mo13666J();
        }

        /* renamed from: y */
        public int mo13661y() throws IOException {
            return C3956j.m16881b(mo13667K());
        }

        /* renamed from: z */
        public long mo13662z() throws IOException {
            return C3956j.m16882c(mo13668L());
        }

        private C3958b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f12061m = Integer.MAX_VALUE;
            this.f12053e = bArr;
            this.f12055g = i2 + i;
            this.f12057i = i;
            this.f12058j = i;
            this.f12054f = z;
        }
    }

    /* renamed from: e.k.c.j.j$c */
    /* compiled from: CodedInputStream */
    private static final class C3959c extends C3956j {

        /* renamed from: e */
        private final InputStream f12062e;

        /* renamed from: f */
        private final byte[] f12063f;

        /* renamed from: g */
        private int f12064g;

        /* renamed from: h */
        private int f12065h;

        /* renamed from: i */
        private int f12066i;

        /* renamed from: j */
        private int f12067j;

        /* renamed from: k */
        private int f12068k;

        /* renamed from: l */
        private int f12069l;

        /* renamed from: m */
        private C3960a f12070m;

        /* renamed from: e.k.c.j.j$c$a */
        /* compiled from: CodedInputStream */
        private interface C3960a {
            /* renamed from: a */
            void mo13680a();
        }

        /* renamed from: G */
        private C3934i m16950G(int i) throws IOException {
            byte[] J = m16952J(i);
            if (J != null) {
                return C3934i.copyFrom(J);
            }
            int i2 = this.f12066i;
            int i3 = this.f12064g;
            int i4 = i3 - i2;
            this.f12068k += i3;
            this.f12066i = 0;
            this.f12064g = 0;
            List<byte[]> K = m16953K(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f12063f, i2, bArr, 0, i4);
            for (byte[] next : K) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return C3934i.wrap(bArr);
        }

        /* renamed from: I */
        private byte[] m16951I(int i, boolean z) throws IOException {
            byte[] J = m16952J(i);
            if (J != null) {
                return z ? (byte[]) J.clone() : J;
            }
            int i2 = this.f12066i;
            int i3 = this.f12064g;
            int i4 = i3 - i2;
            this.f12068k += i3;
            this.f12066i = 0;
            this.f12064g = 0;
            List<byte[]> K = m16953K(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f12063f, i2, bArr, 0, i4);
            for (byte[] next : K) {
                System.arraycopy(next, 0, bArr, i4, next.length);
                i4 += next.length;
            }
            return bArr;
        }

        /* renamed from: J */
        private byte[] m16952J(int i) throws IOException {
            if (i == 0) {
                return C3899b0.f11983b;
            }
            if (i >= 0) {
                int i2 = this.f12068k;
                int i3 = this.f12066i;
                int i4 = i2 + i3 + i;
                if (i4 - this.f12051c <= 0) {
                    int i5 = this.f12069l;
                    if (i4 <= i5) {
                        int i6 = this.f12064g - i3;
                        int i7 = i - i6;
                        if (i7 >= 4096 && i7 > this.f12062e.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i];
                        System.arraycopy(this.f12063f, this.f12066i, bArr, 0, i6);
                        this.f12068k += this.f12064g;
                        this.f12066i = 0;
                        this.f12064g = 0;
                        while (i6 < i) {
                            int read = this.f12062e.read(bArr, i6, i - i6);
                            if (read != -1) {
                                this.f12068k += read;
                                i6 += read;
                            } else {
                                throw C3911c0.truncatedMessage();
                            }
                        }
                        return bArr;
                    }
                    mo13679T((i5 - i2) - i3);
                    throw C3911c0.truncatedMessage();
                }
                throw C3911c0.sizeLimitExceeded();
            }
            throw C3911c0.negativeSize();
        }

        /* renamed from: K */
        private List<byte[]> m16953K(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.f12062e.read(bArr, i2, min - i2);
                    if (read != -1) {
                        this.f12068k += read;
                        i2 += read;
                    } else {
                        throw C3911c0.truncatedMessage();
                    }
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* renamed from: Q */
        private void m16954Q() {
            int i = this.f12064g + this.f12065h;
            this.f12064g = i;
            int i2 = this.f12068k + i;
            int i3 = this.f12069l;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.f12065h = i4;
                this.f12064g = i - i4;
                return;
            }
            this.f12065h = 0;
        }

        /* renamed from: R */
        private void m16955R(int i) throws IOException {
            if (m16960Y(i)) {
                return;
            }
            if (i > (this.f12051c - this.f12068k) - this.f12066i) {
                throw C3911c0.sizeLimitExceeded();
            }
            throw C3911c0.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f12062e.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* renamed from: U */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m16956U(int r9) throws java.io.IOException {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0097
                int r0 = r8.f12068k
                int r1 = r8.f12066i
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f12069l
                if (r2 > r3) goto L_0x008d
                e.k.c.j.j$c$a r2 = r8.f12070m
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f12068k = r0
                int r0 = r8.f12064g
                int r0 = r0 - r1
                r8.f12064g = r3
                r8.f12066i = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f12062e     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f12062e     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f12068k
                int r0 = r0 + r3
                r8.f12068k = r0
                r8.m16954Q()
                throw r9
            L_0x0067:
                int r0 = r8.f12068k
                int r0 = r0 + r3
                r8.f12068k = r0
                r8.m16954Q()
            L_0x006f:
                if (r3 >= r9) goto L_0x008c
                int r0 = r8.f12064g
                int r1 = r8.f12066i
                int r1 = r0 - r1
                r8.f12066i = r0
                r0 = 1
                r8.m16955R(r0)
            L_0x007d:
                int r2 = r9 - r1
                int r3 = r8.f12064g
                if (r2 <= r3) goto L_0x008a
                int r1 = r1 + r3
                r8.f12066i = r3
                r8.m16955R(r0)
                goto L_0x007d
            L_0x008a:
                r8.f12066i = r2
            L_0x008c:
                return
            L_0x008d:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.mo13679T(r3)
                e.k.c.j.c0 r9 = p082e.p126k.p129c.p131j.C3911c0.truncatedMessage()
                throw r9
            L_0x0097:
                e.k.c.j.c0 r9 = p082e.p126k.p129c.p131j.C3911c0.negativeSize()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3959c.m16956U(int):void");
        }

        /* renamed from: V */
        private void m16957V() throws IOException {
            if (this.f12064g - this.f12066i >= 10) {
                m16958W();
            } else {
                m16959X();
            }
        }

        /* renamed from: W */
        private void m16958W() throws IOException {
            int i = 0;
            while (i < 10) {
                byte[] bArr = this.f12063f;
                int i2 = this.f12066i;
                this.f12066i = i2 + 1;
                if (bArr[i2] < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: X */
        private void m16959X() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo13672H() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: Y */
        private boolean m16960Y(int i) throws IOException {
            int i2 = this.f12066i;
            if (i2 + i > this.f12064g) {
                int i3 = this.f12051c;
                int i4 = this.f12068k;
                if (i > (i3 - i4) - i2 || i4 + i2 + i > this.f12069l) {
                    return false;
                }
                C3960a aVar = this.f12070m;
                if (aVar != null) {
                    aVar.mo13680a();
                }
                int i5 = this.f12066i;
                if (i5 > 0) {
                    int i6 = this.f12064g;
                    if (i6 > i5) {
                        byte[] bArr = this.f12063f;
                        System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.f12068k += i5;
                    this.f12064g -= i5;
                    this.f12066i = 0;
                }
                InputStream inputStream = this.f12062e;
                byte[] bArr2 = this.f12063f;
                int i7 = this.f12064g;
                int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f12051c - this.f12068k) - i7));
                if (read == 0 || read < -1 || read > this.f12063f.length) {
                    throw new IllegalStateException(this.f12062e.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f12064g += read;
                    m16954Q();
                    if (this.f12064g >= i) {
                        return true;
                    }
                    return m16960Y(i);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
        }

        /* renamed from: A */
        public String mo13639A() throws IOException {
            int N = mo13675N();
            if (N > 0 && N <= this.f12064g - this.f12066i) {
                String str = new String(this.f12063f, this.f12066i, N, C3899b0.f11982a);
                this.f12066i += N;
                return str;
            } else if (N == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (N > this.f12064g) {
                    return new String(m16951I(N, false), C3899b0.f11982a);
                }
                m16955R(N);
                String str2 = new String(this.f12063f, this.f12066i, N, C3899b0.f11982a);
                this.f12066i += N;
                return str2;
            }
        }

        /* renamed from: B */
        public String mo13640B() throws IOException {
            byte[] bArr;
            int N = mo13675N();
            int i = this.f12066i;
            int i2 = this.f12064g;
            if (N <= i2 - i && N > 0) {
                bArr = this.f12063f;
                this.f12066i = i + N;
            } else if (N == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (N <= i2) {
                    m16955R(N);
                    bArr = this.f12063f;
                    this.f12066i = N + 0;
                } else {
                    bArr = m16951I(N, false);
                }
                i = 0;
            }
            return C4032v1.m17820h(bArr, i, N);
        }

        /* renamed from: C */
        public int mo13641C() throws IOException {
            if (mo13647e()) {
                this.f12067j = 0;
                return 0;
            }
            int N = mo13675N();
            this.f12067j = N;
            if (C4042w1.m17902a(N) != 0) {
                return this.f12067j;
            }
            throw C3911c0.invalidTag();
        }

        /* renamed from: D */
        public int mo13642D() throws IOException {
            return mo13675N();
        }

        /* renamed from: E */
        public long mo13643E() throws IOException {
            return mo13676O();
        }

        /* renamed from: F */
        public boolean mo13644F(int i) throws IOException {
            int b = C4042w1.m17903b(i);
            if (b == 0) {
                m16957V();
                return true;
            } else if (b == 1) {
                mo13679T(8);
                return true;
            } else if (b == 2) {
                mo13679T(mo13675N());
                return true;
            } else if (b == 3) {
                mo13678S();
                mo13645a(C4042w1.m17904c(C4042w1.m17902a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo13679T(4);
                    return true;
                }
                throw C3911c0.invalidWireType();
            }
        }

        /* renamed from: H */
        public byte mo13672H() throws IOException {
            if (this.f12066i == this.f12064g) {
                m16955R(1);
            }
            byte[] bArr = this.f12063f;
            int i = this.f12066i;
            this.f12066i = i + 1;
            return bArr[i];
        }

        /* renamed from: L */
        public int mo13673L() throws IOException {
            int i = this.f12066i;
            if (this.f12064g - i < 4) {
                m16955R(4);
                i = this.f12066i;
            }
            byte[] bArr = this.f12063f;
            this.f12066i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: M */
        public long mo13674M() throws IOException {
            int i = this.f12066i;
            if (this.f12064g - i < 8) {
                m16955R(8);
                i = this.f12066i;
            }
            byte[] bArr = this.f12063f;
            this.f12066i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo13675N() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f12066i
                int r1 = r5.f12064g
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f12063f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f12066i = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.mo13677P()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f12066i = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3959c.mo13675N():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* renamed from: O */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo13676O() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f12066i
                int r1 = r11.f12064g
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f12063f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f12066i = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.mo13677P()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f12066i = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3959c.mo13676O():long");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public long mo13677P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte H = mo13672H();
                j |= ((long) (H & Byte.MAX_VALUE)) << i;
                if ((H & 128) == 0) {
                    return j;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: S */
        public void mo13678S() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo13641C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo13644F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3959c.mo13678S():void");
        }

        /* renamed from: T */
        public void mo13679T(int i) throws IOException {
            int i2 = this.f12064g;
            int i3 = this.f12066i;
            if (i > i2 - i3 || i < 0) {
                m16956U(i);
            } else {
                this.f12066i = i3 + i;
            }
        }

        /* renamed from: a */
        public void mo13645a(int i) throws C3911c0 {
            if (this.f12067j != i) {
                throw C3911c0.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo13646d() {
            return this.f12068k + this.f12066i;
        }

        /* renamed from: e */
        public boolean mo13647e() throws IOException {
            return this.f12066i == this.f12064g && !m16960Y(1);
        }

        /* renamed from: l */
        public void mo13648l(int i) {
            this.f12069l = i;
            m16954Q();
        }

        /* renamed from: m */
        public int mo13649m(int i) throws C3911c0 {
            if (i >= 0) {
                int i2 = i + this.f12068k + this.f12066i;
                int i3 = this.f12069l;
                if (i2 <= i3) {
                    this.f12069l = i2;
                    m16954Q();
                    return i3;
                }
                throw C3911c0.truncatedMessage();
            }
            throw C3911c0.negativeSize();
        }

        /* renamed from: n */
        public boolean mo13650n() throws IOException {
            return mo13676O() != 0;
        }

        /* renamed from: o */
        public C3934i mo13651o() throws IOException {
            int N = mo13675N();
            int i = this.f12064g;
            int i2 = this.f12066i;
            if (N <= i - i2 && N > 0) {
                C3934i copyFrom = C3934i.copyFrom(this.f12063f, i2, N);
                this.f12066i += N;
                return copyFrom;
            } else if (N == 0) {
                return C3934i.EMPTY;
            } else {
                return m16950G(N);
            }
        }

        /* renamed from: p */
        public double mo13652p() throws IOException {
            return Double.longBitsToDouble(mo13674M());
        }

        /* renamed from: q */
        public int mo13653q() throws IOException {
            return mo13675N();
        }

        /* renamed from: r */
        public int mo13654r() throws IOException {
            return mo13673L();
        }

        /* renamed from: s */
        public long mo13655s() throws IOException {
            return mo13674M();
        }

        /* renamed from: t */
        public float mo13656t() throws IOException {
            return Float.intBitsToFloat(mo13673L());
        }

        /* renamed from: u */
        public int mo13657u() throws IOException {
            return mo13675N();
        }

        /* renamed from: v */
        public long mo13658v() throws IOException {
            return mo13676O();
        }

        /* renamed from: w */
        public int mo13659w() throws IOException {
            return mo13673L();
        }

        /* renamed from: x */
        public long mo13660x() throws IOException {
            return mo13674M();
        }

        /* renamed from: y */
        public int mo13661y() throws IOException {
            return C3956j.m16881b(mo13675N());
        }

        /* renamed from: z */
        public long mo13662z() throws IOException {
            return C3956j.m16882c(mo13676O());
        }

        private C3959c(InputStream inputStream, int i) {
            super();
            this.f12069l = Integer.MAX_VALUE;
            this.f12070m = null;
            C3899b0.m16646b(inputStream, "input");
            this.f12062e = inputStream;
            this.f12063f = new byte[i];
            this.f12064g = 0;
            this.f12066i = 0;
            this.f12068k = 0;
        }
    }

    /* renamed from: e.k.c.j.j$d */
    /* compiled from: CodedInputStream */
    private static final class C3961d extends C3956j {

        /* renamed from: e */
        private final ByteBuffer f12071e;

        /* renamed from: f */
        private final boolean f12072f;

        /* renamed from: g */
        private final long f12073g;

        /* renamed from: h */
        private long f12074h;

        /* renamed from: i */
        private long f12075i;

        /* renamed from: j */
        private long f12076j;

        /* renamed from: k */
        private int f12077k;

        /* renamed from: l */
        private int f12078l;

        /* renamed from: m */
        private boolean f12079m;

        /* renamed from: n */
        private int f12080n;

        /* renamed from: G */
        private int m16994G(long j) {
            return (int) (j - this.f12073g);
        }

        /* renamed from: H */
        static boolean m16995H() {
            return C4022u1.m17620H();
        }

        /* renamed from: O */
        private void m16996O() {
            long j = this.f12074h + ((long) this.f12077k);
            this.f12074h = j;
            int i = (int) (j - this.f12076j);
            int i2 = this.f12080n;
            if (i > i2) {
                int i3 = i - i2;
                this.f12077k = i3;
                this.f12074h = j - ((long) i3);
                return;
            }
            this.f12077k = 0;
        }

        /* renamed from: P */
        private int m16997P() {
            return (int) (this.f12074h - this.f12075i);
        }

        /* renamed from: S */
        private void m16998S() throws IOException {
            if (m16997P() >= 10) {
                m16999T();
            } else {
                m17000U();
            }
        }

        /* renamed from: T */
        private void m16999T() throws IOException {
            int i = 0;
            while (i < 10) {
                long j = this.f12075i;
                this.f12075i = 1 + j;
                if (C4022u1.m17655u(j) < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* renamed from: U */
        private void m17000U() throws IOException {
            int i = 0;
            while (i < 10) {
                if (mo13681I() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0040, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
            throw p082e.p126k.p129c.p131j.C3911c0.truncatedMessage();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
            r3.f12071e.position(r0);
            r3.f12071e.limit(r1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0031 */
        /* renamed from: V */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.ByteBuffer m17001V(long r4, long r6) throws java.io.IOException {
            /*
                r3 = this;
                java.nio.ByteBuffer r0 = r3.f12071e
                int r0 = r0.position()
                java.nio.ByteBuffer r1 = r3.f12071e
                int r1 = r1.limit()
                java.nio.ByteBuffer r2 = r3.f12071e     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r4 = r3.m16994G(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r2.position(r4)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f12071e     // Catch:{ IllegalArgumentException -> 0x0031 }
                int r5 = r3.m16994G(r6)     // Catch:{ IllegalArgumentException -> 0x0031 }
                r4.limit(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r3.f12071e     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r4 = r4.slice()     // Catch:{ IllegalArgumentException -> 0x0031 }
                java.nio.ByteBuffer r5 = r3.f12071e
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f12071e
                r5.limit(r1)
                return r4
            L_0x002f:
                r4 = move-exception
                goto L_0x0036
            L_0x0031:
                e.k.c.j.c0 r4 = p082e.p126k.p129c.p131j.C3911c0.truncatedMessage()     // Catch:{ all -> 0x002f }
                throw r4     // Catch:{ all -> 0x002f }
            L_0x0036:
                java.nio.ByteBuffer r5 = r3.f12071e
                r5.position(r0)
                java.nio.ByteBuffer r5 = r3.f12071e
                r5.limit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3961d.m17001V(long, long):java.nio.ByteBuffer");
        }

        /* renamed from: A */
        public String mo13639A() throws IOException {
            int L = mo13684L();
            if (L > 0 && L <= m16997P()) {
                byte[] bArr = new byte[L];
                long j = (long) L;
                C4022u1.m17648n(this.f12075i, bArr, 0, j);
                String str = new String(bArr, C3899b0.f11982a);
                this.f12075i += j;
                return str;
            } else if (L == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (L < 0) {
                    throw C3911c0.negativeSize();
                }
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: B */
        public String mo13640B() throws IOException {
            int L = mo13684L();
            if (L > 0 && L <= m16997P()) {
                String g = C4032v1.m17819g(this.f12071e, m16994G(this.f12075i), L);
                this.f12075i += (long) L;
                return g;
            } else if (L == 0) {
                return BuildConfig.FLAVOR;
            } else {
                if (L <= 0) {
                    throw C3911c0.negativeSize();
                }
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: C */
        public int mo13641C() throws IOException {
            if (mo13647e()) {
                this.f12078l = 0;
                return 0;
            }
            int L = mo13684L();
            this.f12078l = L;
            if (C4042w1.m17902a(L) != 0) {
                return this.f12078l;
            }
            throw C3911c0.invalidTag();
        }

        /* renamed from: D */
        public int mo13642D() throws IOException {
            return mo13684L();
        }

        /* renamed from: E */
        public long mo13643E() throws IOException {
            return mo13685M();
        }

        /* renamed from: F */
        public boolean mo13644F(int i) throws IOException {
            int b = C4042w1.m17903b(i);
            if (b == 0) {
                m16998S();
                return true;
            } else if (b == 1) {
                mo13688R(8);
                return true;
            } else if (b == 2) {
                mo13688R(mo13684L());
                return true;
            } else if (b == 3) {
                mo13687Q();
                mo13645a(C4042w1.m17904c(C4042w1.m17902a(i), 4));
                return true;
            } else if (b == 4) {
                return false;
            } else {
                if (b == 5) {
                    mo13688R(4);
                    return true;
                }
                throw C3911c0.invalidWireType();
            }
        }

        /* renamed from: I */
        public byte mo13681I() throws IOException {
            long j = this.f12075i;
            if (j != this.f12074h) {
                this.f12075i = 1 + j;
                return C4022u1.m17655u(j);
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: J */
        public int mo13682J() throws IOException {
            long j = this.f12075i;
            if (this.f12074h - j >= 4) {
                this.f12075i = 4 + j;
                return ((C4022u1.m17655u(j + 3) & 255) << 24) | (C4022u1.m17655u(j) & 255) | ((C4022u1.m17655u(1 + j) & 255) << 8) | ((C4022u1.m17655u(2 + j) & 255) << 16);
            }
            throw C3911c0.truncatedMessage();
        }

        /* renamed from: K */
        public long mo13683K() throws IOException {
            long j = this.f12075i;
            if (this.f12074h - j >= 8) {
                this.f12075i = 8 + j;
                return ((((long) C4022u1.m17655u(j + 7)) & 255) << 56) | (((long) C4022u1.m17655u(j)) & 255) | ((((long) C4022u1.m17655u(1 + j)) & 255) << 8) | ((((long) C4022u1.m17655u(2 + j)) & 255) << 16) | ((((long) C4022u1.m17655u(3 + j)) & 255) << 24) | ((((long) C4022u1.m17655u(4 + j)) & 255) << 32) | ((((long) C4022u1.m17655u(5 + j)) & 255) << 40) | ((((long) C4022u1.m17655u(6 + j)) & 255) << 48);
            }
            throw C3911c0.truncatedMessage();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (p082e.p126k.p129c.p131j.C4022u1.m17655u(r4) < 0) goto L_0x0085;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo13684L() throws java.io.IOException {
            /*
                r10 = this;
                long r0 = r10.f12075i
                long r2 = r10.f12074h
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L_0x000a
                goto L_0x0085
            L_0x000a:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r0)
                if (r0 < 0) goto L_0x0017
                r10.f12075i = r4
                return r0
            L_0x0017:
                long r6 = r10.f12074h
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0021
                goto L_0x0085
            L_0x0021:
                long r6 = r4 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x002f
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x008b
            L_0x002f:
                long r4 = r6 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x003c:
                r6 = r4
                goto L_0x008b
            L_0x003e:
                long r6 = r4 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L_0x004e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L_0x008b
            L_0x004e:
                long r4 = r6 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r4)
                if (r1 >= 0) goto L_0x008b
                long r4 = r6 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r6)
                if (r1 >= 0) goto L_0x003c
                long r6 = r4 + r2
                byte r1 = p082e.p126k.p129c.p131j.C4022u1.m17655u(r4)
                if (r1 >= 0) goto L_0x008b
            L_0x0085:
                long r0 = r10.mo13686N()
                int r1 = (int) r0
                return r1
            L_0x008b:
                r10.f12075i = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3961d.mo13684L():int");
        }

        /* renamed from: M */
        public long mo13685M() throws IOException {
            long j;
            long j2;
            long j3;
            byte b;
            long j4 = this.f12075i;
            if (this.f12074h != j4) {
                long j5 = j4 + 1;
                byte u = C4022u1.m17655u(j4);
                if (u >= 0) {
                    this.f12075i = j5;
                    return (long) u;
                } else if (this.f12074h - j5 >= 9) {
                    long j6 = j5 + 1;
                    byte u2 = u ^ (C4022u1.m17655u(j5) << 7);
                    if (u2 < 0) {
                        b = u2 ^ Byte.MIN_VALUE;
                    } else {
                        long j7 = j6 + 1;
                        byte u3 = u2 ^ (C4022u1.m17655u(j6) << 14);
                        if (u3 >= 0) {
                            j = (long) (u3 ^ 16256);
                        } else {
                            j6 = j7 + 1;
                            byte u4 = u3 ^ (C4022u1.m17655u(j7) << 21);
                            if (u4 < 0) {
                                b = u4 ^ -2080896;
                            } else {
                                j7 = j6 + 1;
                                long u5 = ((long) u4) ^ (((long) C4022u1.m17655u(j6)) << 28);
                                if (u5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = j7 + 1;
                                    long u6 = u5 ^ (((long) C4022u1.m17655u(j7)) << 35);
                                    if (u6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = j8 + 1;
                                        u5 = u6 ^ (((long) C4022u1.m17655u(j8)) << 42);
                                        if (u5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = j7 + 1;
                                            u6 = u5 ^ (((long) C4022u1.m17655u(j7)) << 49);
                                            if (u6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j7 = j8 + 1;
                                                j = (u6 ^ (((long) C4022u1.m17655u(j8)) << 56)) ^ 71499008037633920L;
                                                if (j < 0) {
                                                    long j9 = 1 + j7;
                                                    if (((long) C4022u1.m17655u(j7)) >= 0) {
                                                        j6 = j9;
                                                        this.f12075i = j6;
                                                        return j;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    j = u6 ^ j2;
                                    j6 = j8;
                                    this.f12075i = j6;
                                    return j;
                                }
                                j = u5 ^ j3;
                            }
                        }
                        j6 = j7;
                        this.f12075i = j6;
                        return j;
                    }
                    j = (long) b;
                    this.f12075i = j6;
                    return j;
                }
            }
            return mo13686N();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N */
        public long mo13686N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte I = mo13681I();
                j |= ((long) (I & Byte.MAX_VALUE)) << i;
                if ((I & 128) == 0) {
                    return j;
                }
            }
            throw C3911c0.malformedVarint();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: Q */
        public void mo13687Q() throws java.io.IOException {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.mo13641C()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.mo13644F(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3956j.C3961d.mo13687Q():void");
        }

        /* renamed from: R */
        public void mo13688R(int i) throws IOException {
            if (i >= 0 && i <= m16997P()) {
                this.f12075i += (long) i;
            } else if (i < 0) {
                throw C3911c0.negativeSize();
            } else {
                throw C3911c0.truncatedMessage();
            }
        }

        /* renamed from: a */
        public void mo13645a(int i) throws C3911c0 {
            if (this.f12078l != i) {
                throw C3911c0.invalidEndTag();
            }
        }

        /* renamed from: d */
        public int mo13646d() {
            return (int) (this.f12075i - this.f12076j);
        }

        /* renamed from: e */
        public boolean mo13647e() throws IOException {
            return this.f12075i == this.f12074h;
        }

        /* renamed from: l */
        public void mo13648l(int i) {
            this.f12080n = i;
            m16996O();
        }

        /* renamed from: m */
        public int mo13649m(int i) throws C3911c0 {
            if (i >= 0) {
                int d = i + mo13646d();
                int i2 = this.f12080n;
                if (d <= i2) {
                    this.f12080n = d;
                    m16996O();
                    return i2;
                }
                throw C3911c0.truncatedMessage();
            }
            throw C3911c0.negativeSize();
        }

        /* renamed from: n */
        public boolean mo13650n() throws IOException {
            return mo13685M() != 0;
        }

        /* renamed from: o */
        public C3934i mo13651o() throws IOException {
            int L = mo13684L();
            if (L <= 0 || L > m16997P()) {
                if (L == 0) {
                    return C3934i.EMPTY;
                }
                if (L < 0) {
                    throw C3911c0.negativeSize();
                }
                throw C3911c0.truncatedMessage();
            } else if (!this.f12072f || !this.f12079m) {
                byte[] bArr = new byte[L];
                long j = (long) L;
                C4022u1.m17648n(this.f12075i, bArr, 0, j);
                this.f12075i += j;
                return C3934i.wrap(bArr);
            } else {
                long j2 = this.f12075i;
                long j3 = (long) L;
                ByteBuffer V = m17001V(j2, j2 + j3);
                this.f12075i += j3;
                return C3934i.wrap(V);
            }
        }

        /* renamed from: p */
        public double mo13652p() throws IOException {
            return Double.longBitsToDouble(mo13683K());
        }

        /* renamed from: q */
        public int mo13653q() throws IOException {
            return mo13684L();
        }

        /* renamed from: r */
        public int mo13654r() throws IOException {
            return mo13682J();
        }

        /* renamed from: s */
        public long mo13655s() throws IOException {
            return mo13683K();
        }

        /* renamed from: t */
        public float mo13656t() throws IOException {
            return Float.intBitsToFloat(mo13682J());
        }

        /* renamed from: u */
        public int mo13657u() throws IOException {
            return mo13684L();
        }

        /* renamed from: v */
        public long mo13658v() throws IOException {
            return mo13685M();
        }

        /* renamed from: w */
        public int mo13659w() throws IOException {
            return mo13682J();
        }

        /* renamed from: x */
        public long mo13660x() throws IOException {
            return mo13683K();
        }

        /* renamed from: y */
        public int mo13661y() throws IOException {
            return C3956j.m16881b(mo13684L());
        }

        /* renamed from: z */
        public long mo13662z() throws IOException {
            return C3956j.m16882c(mo13685M());
        }

        private C3961d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f12080n = Integer.MAX_VALUE;
            this.f12071e = byteBuffer;
            long i = C4022u1.m17643i(byteBuffer);
            this.f12073g = i;
            this.f12074h = ((long) byteBuffer.limit()) + i;
            long position = i + ((long) byteBuffer.position());
            this.f12075i = position;
            this.f12076j = position;
            this.f12072f = z;
        }
    }

    /* renamed from: b */
    public static int m16881b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: c */
    public static long m16882c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: f */
    public static C3956j m16883f(InputStream inputStream) {
        return m16884g(inputStream, 4096);
    }

    /* renamed from: g */
    public static C3956j m16884g(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        } else if (inputStream == null) {
            return m16886i(C3899b0.f11983b);
        } else {
            return new C3959c(inputStream, i);
        }
    }

    /* renamed from: h */
    static C3956j m16885h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m16888k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && C3961d.m16995H()) {
            return new C3961d(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return m16888k(bArr, 0, remaining, true);
    }

    /* renamed from: i */
    public static C3956j m16886i(byte[] bArr) {
        return m16887j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static C3956j m16887j(byte[] bArr, int i, int i2) {
        return m16888k(bArr, i, i2, false);
    }

    /* renamed from: k */
    static C3956j m16888k(byte[] bArr, int i, int i2, boolean z) {
        C3958b bVar = new C3958b(bArr, i, i2, z);
        try {
            bVar.mo13649m(i2);
            return bVar;
        } catch (C3911c0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public abstract String mo13639A() throws IOException;

    /* renamed from: B */
    public abstract String mo13640B() throws IOException;

    /* renamed from: C */
    public abstract int mo13641C() throws IOException;

    /* renamed from: D */
    public abstract int mo13642D() throws IOException;

    /* renamed from: E */
    public abstract long mo13643E() throws IOException;

    /* renamed from: F */
    public abstract boolean mo13644F(int i) throws IOException;

    /* renamed from: a */
    public abstract void mo13645a(int i) throws C3911c0;

    /* renamed from: d */
    public abstract int mo13646d();

    /* renamed from: e */
    public abstract boolean mo13647e() throws IOException;

    /* renamed from: l */
    public abstract void mo13648l(int i);

    /* renamed from: m */
    public abstract int mo13649m(int i) throws C3911c0;

    /* renamed from: n */
    public abstract boolean mo13650n() throws IOException;

    /* renamed from: o */
    public abstract C3934i mo13651o() throws IOException;

    /* renamed from: p */
    public abstract double mo13652p() throws IOException;

    /* renamed from: q */
    public abstract int mo13653q() throws IOException;

    /* renamed from: r */
    public abstract int mo13654r() throws IOException;

    /* renamed from: s */
    public abstract long mo13655s() throws IOException;

    /* renamed from: t */
    public abstract float mo13656t() throws IOException;

    /* renamed from: u */
    public abstract int mo13657u() throws IOException;

    /* renamed from: v */
    public abstract long mo13658v() throws IOException;

    /* renamed from: w */
    public abstract int mo13659w() throws IOException;

    /* renamed from: x */
    public abstract long mo13660x() throws IOException;

    /* renamed from: y */
    public abstract int mo13661y() throws IOException;

    /* renamed from: z */
    public abstract long mo13662z() throws IOException;

    private C3956j() {
        this.f12050b = 100;
        this.f12051c = Integer.MAX_VALUE;
    }
}
