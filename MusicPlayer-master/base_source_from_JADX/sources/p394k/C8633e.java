package p394k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p369i.p376f0.C8422d;
import p369i.p387z.p389d.C8594l;
import p394k.p395c0.C8625a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: k.e */
/* compiled from: Buffer.kt */
public final class C8633e implements C8637g, C8636f, Cloneable, ByteChannel {

    /* renamed from: g */
    public C8656v f34971g;

    /* renamed from: h */
    private long f34972h;

    /* renamed from: k.e$b */
    /* compiled from: Buffer.kt */
    public static final class C8635b extends OutputStream {

        /* renamed from: g */
        final /* synthetic */ C8633e f34974g;

        C8635b(C8633e eVar) {
            this.f34974g = eVar;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f34974g + ".outputStream()";
        }

        public void write(int i) {
            this.f34974g.mo30696b1(i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "data");
            this.f34974g.mo30695a1(bArr, i, i2);
        }
    }

    /* renamed from: A */
    public boolean mo30664A() {
        return this.f34972h == 0;
    }

    /* renamed from: A0 */
    public int mo30665A0(byte[] bArr, int i, int i2) {
        C8594l.m46771e(bArr, "sink");
        C8624c.m46824b((long) bArr.length, (long) i, (long) i2);
        C8656v vVar = this.f34971g;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.f35014c - vVar.f35013b);
        byte[] bArr2 = vVar.f35012a;
        int i3 = vVar.f35013b;
        byte[] unused = C8475g.m46616c(bArr2, bArr, i, i3, i3 + min);
        vVar.f35013b += min;
        mo30686T0(mo30688U0() - ((long) min));
        if (vVar.f35013b != vVar.f35014c) {
            return min;
        }
        this.f34971g = vVar.mo30847b();
        C8657w.m47057b(vVar);
        return min;
    }

    /* renamed from: B */
    public /* bridge */ /* synthetic */ C8636f mo30666B(int i) {
        mo30696b1(i);
        return this;
    }

    /* renamed from: E */
    public C8633e clone() {
        return mo30675K();
    }

    /* renamed from: E0 */
    public void mo30668E0(long j) throws EOFException {
        if (this.f34972h < j) {
            throw new EOFException();
        }
    }

    /* renamed from: F0 */
    public byte[] mo30669F0() {
        return mo30721p0(mo30688U0());
    }

    /* renamed from: H */
    public final long mo30670H() {
        long U0 = mo30688U0();
        if (U0 == 0) {
            return 0;
        }
        C8656v vVar = this.f34971g;
        C8594l.m46769c(vVar);
        C8656v vVar2 = vVar.f35018g;
        C8594l.m46769c(vVar2);
        int i = vVar2.f35014c;
        if (i < 8192 && vVar2.f35016e) {
            U0 -= (long) (i - vVar2.f35013b);
        }
        return U0;
    }

    /* renamed from: H0 */
    public C8638h mo30671H0() {
        return mo30719o(mo30688U0());
    }

    /* renamed from: I */
    public long mo30672I(C8638h hVar) {
        C8594l.m46771e(hVar, "targetBytes");
        return mo30736z0(hVar, 0);
    }

    /* renamed from: J */
    public /* bridge */ /* synthetic */ C8636f mo30673J() {
        mo30717m0();
        return this;
    }

    /* renamed from: J0 */
    public OutputStream mo30674J0() {
        return new C8635b(this);
    }

    /* renamed from: K */
    public final C8633e mo30675K() {
        C8633e eVar = new C8633e();
        if (mo30688U0() != 0) {
            C8656v vVar = this.f34971g;
            C8594l.m46769c(vVar);
            C8656v d = vVar.mo30849d();
            eVar.f34971g = d;
            d.f35018g = d;
            d.f35017f = d;
            for (C8656v vVar2 = vVar.f35017f; vVar2 != vVar; vVar2 = vVar2.f35017f) {
                C8656v vVar3 = d.f35018g;
                C8594l.m46769c(vVar3);
                C8594l.m46769c(vVar2);
                vVar3.mo30848c(vVar2.mo30849d());
            }
            eVar.mo30686T0(mo30688U0());
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r8 != r9) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r15.f34971g = r6.mo30847b();
        p394k.C8657w.m47057b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r6.f35013b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r1 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d A[SYNTHETIC] */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo30676K0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.mo30688U0()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00b6
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000d:
            k.v r6 = r15.f34971g
            p369i.p387z.p389d.C8594l.m46769c(r6)
            byte[] r7 = r6.f35012a
            int r8 = r6.f35013b
            int r9 = r6.f35014c
        L_0x0018:
            if (r8 >= r9) goto L_0x0098
            byte r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0029
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0029
            int r11 = r10 - r11
            goto L_0x0043
        L_0x0029:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0038
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0038
        L_0x0033:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L_0x0043
        L_0x0038:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L_0x0079
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L_0x0079
            goto L_0x0033
        L_0x0043:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0053
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0018
        L_0x0053:
            k.e r0 = new k.e
            r0.<init>()
            r0.mo30698c1(r4)
            r0.mo30696b1(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo30682Q0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0079:
            if (r0 == 0) goto L_0x007d
            r1 = 1
            goto L_0x0098
        L_0x007d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = p394k.C8624c.m46827e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0098:
            if (r8 != r9) goto L_0x00a4
            k.v r7 = r6.mo30847b()
            r15.f34971g = r7
            p394k.C8657w.m47057b(r6)
            goto L_0x00a6
        L_0x00a4:
            r6.f35013b = r8
        L_0x00a6:
            if (r1 != 0) goto L_0x00ac
            k.v r6 = r15.f34971g
            if (r6 != 0) goto L_0x000d
        L_0x00ac:
            long r1 = r15.mo30688U0()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.mo30686T0(r1)
            return r4
        L_0x00b6:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p394k.C8633e.mo30676K0():long");
    }

    /* renamed from: L0 */
    public void mo30677L0(byte[] bArr) throws EOFException {
        C8594l.m46771e(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int A0 = mo30665A0(bArr, i, bArr.length - i);
            if (A0 != -1) {
                i += A0;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: M0 */
    public int mo30678M0(C8648q qVar) {
        C8594l.m46771e(qVar, "options");
        int e = C8625a.m46832e(this, qVar, false, 2, (Object) null);
        if (e == -1) {
            return -1;
        }
        mo30715j((long) qVar.mo30817t()[e].size());
        return e;
    }

    /* renamed from: N0 */
    public int mo30679N0() throws EOFException {
        return C8624c.m46825c(readInt());
    }

    /* renamed from: O0 */
    public short mo30680O0() throws EOFException {
        return C8624c.m46826d(readShort());
    }

    /* renamed from: P0 */
    public String mo30681P0(long j, Charset charset) throws EOFException {
        C8594l.m46771e(charset, "charset");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f34972h < j) {
            throw new EOFException();
        } else if (i == 0) {
            return BuildConfig.FLAVOR;
        } else {
            C8656v vVar = this.f34971g;
            C8594l.m46769c(vVar);
            int i2 = vVar.f35013b;
            if (((long) i2) + j > ((long) vVar.f35014c)) {
                return new String(mo30721p0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(vVar.f35012a, i2, i3, charset);
            int i4 = vVar.f35013b + i3;
            vVar.f35013b = i4;
            this.f34972h -= j;
            if (i4 == vVar.f35014c) {
                this.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            }
            return str;
        }
    }

    /* renamed from: Q0 */
    public String mo30682Q0() {
        return mo30681P0(this.f34972h, C8422d.f34888a);
    }

    /* renamed from: R0 */
    public String mo30683R0(long j) throws EOFException {
        return mo30681P0(j, C8422d.f34888a);
    }

    /* renamed from: S0 */
    public String mo30684S0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b = (byte) 10;
            long o0 = mo30720o0(b, 0, j2);
            if (o0 != -1) {
                return C8625a.m46830c(this, o0);
            }
            if (j2 < mo30688U0() && mo30718n0(j2 - 1) == ((byte) 13) && mo30718n0(j2) == b) {
                return C8625a.m46830c(this, j2);
            }
            C8633e eVar = new C8633e();
            mo30685T(eVar, 0, Math.min((long) 32, mo30688U0()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo30688U0(), j) + " content=" + eVar.mo30671H0().hex() + 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: T */
    public final C8633e mo30685T(C8633e eVar, long j, long j2) {
        C8594l.m46771e(eVar, "out");
        C8624c.m46824b(mo30688U0(), j, j2);
        if (j2 != 0) {
            eVar.mo30686T0(eVar.mo30688U0() + j2);
            C8656v vVar = this.f34971g;
            while (true) {
                C8594l.m46769c(vVar);
                int i = vVar.f35014c;
                int i2 = vVar.f35013b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                vVar = vVar.f35017f;
            }
            while (j2 > 0) {
                C8594l.m46769c(vVar);
                C8656v d = vVar.mo30849d();
                int i3 = d.f35013b + ((int) j);
                d.f35013b = i3;
                d.f35014c = Math.min(i3 + ((int) j2), d.f35014c);
                C8656v vVar2 = eVar.f34971g;
                if (vVar2 == null) {
                    d.f35018g = d;
                    d.f35017f = d;
                    eVar.f34971g = d;
                } else {
                    C8594l.m46769c(vVar2);
                    C8656v vVar3 = vVar2.f35018g;
                    C8594l.m46769c(vVar3);
                    vVar3.mo30848c(d);
                }
                j2 -= (long) (d.f35014c - d.f35013b);
                vVar = vVar.f35017f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: T0 */
    public final void mo30686T0(long j) {
        this.f34972h = j;
    }

    /* renamed from: U */
    public /* bridge */ /* synthetic */ C8636f mo30687U(String str) {
        mo30707f1(str);
        return this;
    }

    /* renamed from: U0 */
    public final long mo30688U0() {
        return this.f34972h;
    }

    /* renamed from: V0 */
    public final C8638h mo30689V0() {
        if (mo30688U0() <= ((long) Integer.MAX_VALUE)) {
            return mo30690W0((int) mo30688U0());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + mo30688U0()).toString());
    }

    /* renamed from: W0 */
    public final C8638h mo30690W0(int i) {
        if (i == 0) {
            return C8638h.EMPTY;
        }
        C8624c.m46824b(mo30688U0(), 0, (long) i);
        C8656v vVar = this.f34971g;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C8594l.m46769c(vVar);
            int i5 = vVar.f35014c;
            int i6 = vVar.f35013b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                vVar = vVar.f35017f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        C8656v vVar2 = this.f34971g;
        int i7 = 0;
        while (i2 < i) {
            C8594l.m46769c(vVar2);
            bArr[i7] = vVar2.f35012a;
            i2 += vVar2.f35014c - vVar2.f35013b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = vVar2.f35013b;
            vVar2.f35015d = true;
            i7++;
            vVar2 = vVar2.f35017f;
        }
        return new C8658x(bArr, iArr);
    }

    /* renamed from: X0 */
    public final C8656v mo30691X0(int i) {
        boolean z = true;
        if (i < 1 || i > 8192) {
            z = false;
        }
        if (z) {
            C8656v vVar = this.f34971g;
            if (vVar == null) {
                C8656v c = C8657w.m47058c();
                this.f34971g = c;
                c.f35018g = c;
                c.f35017f = c;
                return c;
            }
            C8594l.m46769c(vVar);
            C8656v vVar2 = vVar.f35018g;
            C8594l.m46769c(vVar2);
            if (vVar2.f35014c + i <= 8192 && vVar2.f35016e) {
                return vVar2;
            }
            C8656v c2 = C8657w.m47058c();
            vVar2.mo30848c(c2);
            return c2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    /* renamed from: Y0 */
    public C8633e mo30692Y0(C8638h hVar) {
        C8594l.m46771e(hVar, "byteString");
        hVar.write$okio(this, 0, hVar.size());
        return this;
    }

    /* renamed from: Z */
    public /* bridge */ /* synthetic */ C8636f mo30693Z(byte[] bArr, int i, int i2) {
        mo30695a1(bArr, i, i2);
        return this;
    }

    /* renamed from: Z0 */
    public C8633e mo30694Z0(byte[] bArr) {
        C8594l.m46771e(bArr, "source");
        mo30695a1(bArr, 0, bArr.length);
        return this;
    }

    /* renamed from: a1 */
    public C8633e mo30695a1(byte[] bArr, int i, int i2) {
        C8594l.m46771e(bArr, "source");
        long j = (long) i2;
        C8624c.m46824b((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C8656v X0 = mo30691X0(1);
            int min = Math.min(i3 - i, 8192 - X0.f35014c);
            int i4 = i + min;
            byte[] unused = C8475g.m46616c(bArr, X0.f35012a, X0.f35014c, i, i4);
            X0.f35014c += min;
            i = i4;
        }
        mo30686T0(mo30688U0() + j);
        return this;
    }

    /* renamed from: b0 */
    public void mo29321b0(C8633e eVar, long j) {
        C8656v vVar;
        C8594l.m46771e(eVar, "source");
        if (eVar != this) {
            C8624c.m46824b(eVar.mo30688U0(), 0, j);
            while (j > 0) {
                C8656v vVar2 = eVar.f34971g;
                C8594l.m46769c(vVar2);
                int i = vVar2.f35014c;
                C8656v vVar3 = eVar.f34971g;
                C8594l.m46769c(vVar3);
                if (j < ((long) (i - vVar3.f35013b))) {
                    C8656v vVar4 = this.f34971g;
                    if (vVar4 != null) {
                        C8594l.m46769c(vVar4);
                        vVar = vVar4.f35018g;
                    } else {
                        vVar = null;
                    }
                    if (vVar != null && vVar.f35016e) {
                        if ((((long) vVar.f35014c) + j) - ((long) (vVar.f35015d ? 0 : vVar.f35013b)) <= ((long) 8192)) {
                            C8656v vVar5 = eVar.f34971g;
                            C8594l.m46769c(vVar5);
                            vVar5.mo30851f(vVar, (int) j);
                            eVar.mo30686T0(eVar.mo30688U0() - j);
                            mo30686T0(mo30688U0() + j);
                            return;
                        }
                    }
                    C8656v vVar6 = eVar.f34971g;
                    C8594l.m46769c(vVar6);
                    eVar.f34971g = vVar6.mo30850e((int) j);
                }
                C8656v vVar7 = eVar.f34971g;
                C8594l.m46769c(vVar7);
                long j2 = (long) (vVar7.f35014c - vVar7.f35013b);
                eVar.f34971g = vVar7.mo30847b();
                C8656v vVar8 = this.f34971g;
                if (vVar8 == null) {
                    this.f34971g = vVar7;
                    vVar7.f35018g = vVar7;
                    vVar7.f35017f = vVar7;
                } else {
                    C8594l.m46769c(vVar8);
                    C8656v vVar9 = vVar8.f35018g;
                    C8594l.m46769c(vVar9);
                    vVar9.mo30848c(vVar7);
                    vVar7.mo30846a();
                }
                eVar.mo30686T0(eVar.mo30688U0() - j2);
                mo30686T0(mo30688U0() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    /* renamed from: b1 */
    public C8633e mo30696b1(int i) {
        C8656v X0 = mo30691X0(1);
        byte[] bArr = X0.f35012a;
        int i2 = X0.f35014c;
        X0.f35014c = i2 + 1;
        bArr[i2] = (byte) i;
        mo30686T0(mo30688U0() + 1);
        return this;
    }

    /* renamed from: c */
    public final void mo30697c() {
        mo30715j(mo30688U0());
    }

    /* renamed from: c1 */
    public C8633e mo30698c1(long j) {
        if (j == 0) {
            mo30696b1(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
            C8656v X0 = mo30691X0(i);
            byte[] bArr = X0.f35012a;
            int i2 = X0.f35014c;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                bArr[i3] = C8625a.m46828a()[(int) (15 & j)];
                j >>>= 4;
            }
            X0.f35014c += i;
            mo30686T0(mo30688U0() + ((long) i));
        }
        return this;
    }

    public void close() {
    }

    /* renamed from: d0 */
    public /* bridge */ /* synthetic */ C8636f mo30700d0(String str, int i, int i2) {
        mo30709g1(str, i, i2);
        return this;
    }

    /* renamed from: d1 */
    public C8633e mo30701d1(int i) {
        C8656v X0 = mo30691X0(4);
        byte[] bArr = X0.f35012a;
        int i2 = X0.f35014c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        X0.f35014c = i5 + 1;
        mo30686T0(mo30688U0() + 4);
        return this;
    }

    /* renamed from: e */
    public C8633e mo30702e() {
        return this;
    }

    /* renamed from: e0 */
    public long mo30703e0(C8620a0 a0Var) throws IOException {
        C8594l.m46771e(a0Var, "source");
        long j = 0;
        while (true) {
            long w0 = a0Var.mo29326w0(this, (long) 8192);
            if (w0 == -1) {
                return j;
            }
            j += w0;
        }
    }

    /* renamed from: e1 */
    public C8633e mo30704e1(int i) {
        C8656v X0 = mo30691X0(2);
        byte[] bArr = X0.f35012a;
        int i2 = X0.f35014c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        X0.f35014c = i3 + 1;
        mo30686T0(mo30688U0() + 2);
        return this;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000b
        L_0x0008:
            r2 = 1
            goto L_0x0082
        L_0x000b:
            boolean r4 = r1 instanceof p394k.C8633e
            if (r4 != 0) goto L_0x0011
            goto L_0x0082
        L_0x0011:
            long r4 = r20.mo30688U0()
            k.e r1 = (p394k.C8633e) r1
            long r6 = r1.mo30688U0()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0020
            goto L_0x0082
        L_0x0020:
            long r4 = r20.mo30688U0()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x002b
            goto L_0x0008
        L_0x002b:
            k.v r4 = r0.f34971g
            p369i.p387z.p389d.C8594l.m46769c(r4)
            k.v r1 = r1.f34971g
            p369i.p387z.p389d.C8594l.m46769c(r1)
            int r5 = r4.f35013b
            int r8 = r1.f35013b
            r9 = r6
        L_0x003a:
            long r11 = r20.mo30688U0()
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0008
            int r11 = r4.f35014c
            int r11 = r11 - r5
            int r12 = r1.f35014c
            int r12 = r12 - r8
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r6
        L_0x004e:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x006a
            byte[] r15 = r4.f35012a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            byte[] r15 = r1.f35012a
            int r17 = r8 + 1
            byte r8 = r15[r8]
            if (r5 == r8) goto L_0x0061
            goto L_0x0082
        L_0x0061:
            r18 = 1
            long r13 = r13 + r18
            r5 = r16
            r8 = r17
            goto L_0x004e
        L_0x006a:
            int r13 = r4.f35014c
            if (r5 != r13) goto L_0x0075
            k.v r4 = r4.f35017f
            p369i.p387z.p389d.C8594l.m46769c(r4)
            int r5 = r4.f35013b
        L_0x0075:
            int r13 = r1.f35014c
            if (r8 != r13) goto L_0x0080
            k.v r1 = r1.f35017f
            p369i.p387z.p389d.C8594l.m46769c(r1)
            int r8 = r1.f35013b
        L_0x0080:
            long r9 = r9 + r11
            goto L_0x003a
        L_0x0082:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p394k.C8633e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ C8636f mo30706f0(long j) {
        mo30698c1(j);
        return this;
    }

    /* renamed from: f1 */
    public C8633e mo30707f1(String str) {
        C8594l.m46771e(str, "string");
        mo30709g1(str, 0, str.length());
        return this;
    }

    public void flush() {
    }

    /* renamed from: g0 */
    public boolean mo30708g0(long j) {
        return this.f34972h >= j;
    }

    /* renamed from: g1 */
    public C8633e mo30709g1(String str, int i, int i2) {
        C8594l.m46771e(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt = str.charAt(i);
                        if (charAt < 128) {
                            C8656v X0 = mo30691X0(1);
                            byte[] bArr = X0.f35012a;
                            int i3 = X0.f35014c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                            while (i4 < min) {
                                char charAt2 = str.charAt(i4);
                                if (charAt2 >= 128) {
                                    break;
                                }
                                bArr[i4 + i3] = (byte) charAt2;
                                i4++;
                            }
                            int i5 = X0.f35014c;
                            int i6 = (i3 + i4) - i5;
                            X0.f35014c = i5 + i6;
                            mo30686T0(mo30688U0() + ((long) i6));
                            i = i4;
                        } else {
                            if (charAt < 2048) {
                                C8656v X02 = mo30691X0(2);
                                byte[] bArr2 = X02.f35012a;
                                int i7 = X02.f35014c;
                                bArr2[i7] = (byte) ((charAt >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                                X02.f35014c = i7 + 2;
                                mo30686T0(mo30688U0() + 2);
                            } else if (charAt < 55296 || charAt > 57343) {
                                C8656v X03 = mo30691X0(3);
                                byte[] bArr3 = X03.f35012a;
                                int i8 = X03.f35014c;
                                bArr3[i8] = (byte) ((charAt >> 12) | 224);
                                bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                                bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                                X03.f35014c = i8 + 3;
                                mo30686T0(mo30688U0() + 3);
                            } else {
                                int i9 = i + 1;
                                char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                                if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                                    mo30696b1(63);
                                    i = i9;
                                } else {
                                    int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                                    C8656v X04 = mo30691X0(4);
                                    byte[] bArr4 = X04.f35012a;
                                    int i11 = X04.f35014c;
                                    bArr4[i11] = (byte) ((i10 >> 18) | 240);
                                    bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                    bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                    bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                                    X04.f35014c = i11 + 4;
                                    mo30686T0(mo30688U0() + 4);
                                    i += 2;
                                }
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    /* renamed from: h */
    public C8633e mo30710h() {
        return this;
    }

    public int hashCode() {
        C8656v vVar = this.f34971g;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f35014c;
            for (int i3 = vVar.f35013b; i3 < i2; i3++) {
                i = (i * 31) + vVar.f35012a[i3];
            }
            vVar = vVar.f35017f;
            C8594l.m46769c(vVar);
        } while (vVar != this.f34971g);
        return i;
    }

    /* renamed from: i0 */
    public C8633e mo30712i0() {
        return this;
    }

    public InputStream inputStream() {
        return new C8634a(this);
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public void mo30715j(long j) throws EOFException {
        while (j > 0) {
            C8656v vVar = this.f34971g;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f35014c - vVar.f35013b));
                long j2 = (long) min;
                mo30686T0(mo30688U0() - j2);
                j -= j2;
                int i = vVar.f35013b + min;
                vVar.f35013b = i;
                if (i == vVar.f35014c) {
                    this.f34971g = vVar.mo30847b();
                    C8657w.m47057b(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: l0 */
    public String mo30716l0() throws EOFException {
        return mo30684S0(Long.MAX_VALUE);
    }

    /* renamed from: m0 */
    public C8633e mo30717m0() {
        return this;
    }

    /* renamed from: n0 */
    public final byte mo30718n0(long j) {
        C8624c.m46824b(mo30688U0(), j, 1);
        C8656v vVar = this.f34971g;
        if (vVar == null) {
            C8594l.m46769c((Object) null);
            return null.f35012a[(int) ((((long) null.f35013b) + j) - -1)];
        } else if (mo30688U0() - j < j) {
            long U0 = mo30688U0();
            while (U0 > j) {
                vVar = vVar.f35018g;
                C8594l.m46769c(vVar);
                U0 -= (long) (vVar.f35014c - vVar.f35013b);
            }
            C8594l.m46769c(vVar);
            return vVar.f35012a[(int) ((((long) vVar.f35013b) + j) - U0)];
        } else {
            long j2 = 0;
            while (true) {
                long j3 = ((long) (vVar.f35014c - vVar.f35013b)) + j2;
                if (j3 > j) {
                    C8594l.m46769c(vVar);
                    return vVar.f35012a[(int) ((((long) vVar.f35013b) + j) - j2)];
                }
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                j2 = j3;
            }
        }
    }

    /* renamed from: o */
    public C8638h mo30719o(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo30688U0() < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new C8638h(mo30721p0(j));
        } else {
            C8638h W0 = mo30690W0((int) j);
            mo30715j(j);
            return W0;
        }
    }

    /* renamed from: o0 */
    public long mo30720o0(byte b, long j, long j2) {
        C8656v vVar;
        long j3;
        int i;
        long j4 = 0;
        if (0 <= j && j2 >= j) {
            if (j2 > mo30688U0()) {
                j2 = mo30688U0();
            }
            if (j == j2 || (vVar = this.f34971g) == null) {
                return -1;
            }
            if (mo30688U0() - j < j) {
                j3 = mo30688U0();
                while (j3 > j) {
                    vVar = vVar.f35018g;
                    C8594l.m46769c(vVar);
                    j3 -= (long) (vVar.f35014c - vVar.f35013b);
                }
                if (vVar == null) {
                    return -1;
                }
                while (j3 < j2) {
                    byte[] bArr = vVar.f35012a;
                    int min = (int) Math.min((long) vVar.f35014c, (((long) vVar.f35013b) + j2) - j3);
                    i = (int) ((((long) vVar.f35013b) + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b) {
                            i++;
                        }
                    }
                    j3 += (long) (vVar.f35014c - vVar.f35013b);
                    vVar = vVar.f35017f;
                    C8594l.m46769c(vVar);
                    j = j3;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (vVar.f35014c - vVar.f35013b)) + j4;
                if (j5 > j) {
                    break;
                }
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                j4 = j5;
            }
            if (vVar == null) {
                return -1;
            }
            while (j3 < j2) {
                byte[] bArr2 = vVar.f35012a;
                int min2 = (int) Math.min((long) vVar.f35014c, (((long) vVar.f35013b) + j2) - j3);
                int i2 = (int) ((((long) vVar.f35013b) + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b) {
                        i2 = i + 1;
                    }
                }
                j4 = j3 + ((long) (vVar.f35014c - vVar.f35013b));
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                j = j4;
            }
            return -1;
            return ((long) (i - vVar.f35013b)) + j3;
        }
        throw new IllegalArgumentException(("size=" + mo30688U0() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: p0 */
    public byte[] mo30721p0(long j) throws EOFException {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (mo30688U0() >= j) {
            byte[] bArr = new byte[((int) j)];
            mo30677L0(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public C8637g peek() {
        return C8645n.m46985b(new C8651s(this));
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C8594l.m46771e(byteBuffer, "sink");
        C8656v vVar = this.f34971g;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f35014c - vVar.f35013b);
        byteBuffer.put(vVar.f35012a, vVar.f35013b, min);
        int i = vVar.f35013b + min;
        vVar.f35013b = i;
        this.f34972h -= (long) min;
        if (i == vVar.f35014c) {
            this.f34971g = vVar.mo30847b();
            C8657w.m47057b(vVar);
        }
        return min;
    }

    public byte readByte() throws EOFException {
        if (mo30688U0() != 0) {
            C8656v vVar = this.f34971g;
            C8594l.m46769c(vVar);
            int i = vVar.f35013b;
            int i2 = vVar.f35014c;
            int i3 = i + 1;
            byte b = vVar.f35012a[i];
            mo30686T0(mo30688U0() - 1);
            if (i3 == i2) {
                this.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            } else {
                vVar.f35013b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public int readInt() throws EOFException {
        if (mo30688U0() >= 4) {
            C8656v vVar = this.f34971g;
            C8594l.m46769c(vVar);
            int i = vVar.f35013b;
            int i2 = vVar.f35014c;
            if (((long) (i2 - i)) < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = vVar.f35012a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            mo30686T0(mo30688U0() - 4);
            if (i6 == i2) {
                this.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            } else {
                vVar.f35013b = i6;
            }
            return b3;
        }
        throw new EOFException();
    }

    public short readShort() throws EOFException {
        if (mo30688U0() >= 2) {
            C8656v vVar = this.f34971g;
            C8594l.m46769c(vVar);
            int i = vVar.f35013b;
            int i2 = vVar.f35014c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = vVar.f35012a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            mo30686T0(mo30688U0() - 2);
            if (i4 == i2) {
                this.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            } else {
                vVar.f35013b = i4;
            }
            return (short) b;
        }
        throw new EOFException();
    }

    /* renamed from: s */
    public /* bridge */ /* synthetic */ C8636f mo30727s() {
        mo30712i0();
        return this;
    }

    /* renamed from: t */
    public /* bridge */ /* synthetic */ C8636f mo30728t(int i) {
        mo30704e1(i);
        return this;
    }

    /* renamed from: t0 */
    public /* bridge */ /* synthetic */ C8636f mo30729t0(byte[] bArr) {
        mo30694Z0(bArr);
        return this;
    }

    public C8622b0 timeout() {
        return C8622b0.f34954d;
    }

    public String toString() {
        return mo30689V0().toString();
    }

    /* renamed from: u0 */
    public /* bridge */ /* synthetic */ C8636f mo30731u0(C8638h hVar) {
        mo30692Y0(hVar);
        return this;
    }

    /* renamed from: v0 */
    public long mo30732v0(C8638h hVar, long j) throws IOException {
        long j2 = j;
        C8594l.m46771e(hVar, "bytes");
        if (hVar.size() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                C8656v vVar = this.f34971g;
                if (vVar != null) {
                    if (mo30688U0() - j2 < j2) {
                        long U0 = mo30688U0();
                        while (U0 > j2) {
                            vVar = vVar.f35018g;
                            C8594l.m46769c(vVar);
                            U0 -= (long) (vVar.f35014c - vVar.f35013b);
                        }
                        if (vVar != null) {
                            byte[] internalArray$okio = hVar.internalArray$okio();
                            byte b = internalArray$okio[0];
                            int size = hVar.size();
                            long U02 = (mo30688U0() - ((long) size)) + 1;
                            while (U0 < U02) {
                                byte[] bArr = vVar.f35012a;
                                long j4 = U0;
                                int min = (int) Math.min((long) vVar.f35014c, (((long) vVar.f35013b) + U02) - U0);
                                long j5 = ((long) vVar.f35013b) + j2;
                                long j6 = j4;
                                for (int i = (int) (j5 - j6); i < min; i++) {
                                    if (bArr[i] == b && C8625a.m46829b(vVar, i + 1, internalArray$okio, 1, size)) {
                                        return ((long) (i - vVar.f35013b)) + j6;
                                    }
                                }
                                U0 = j6 + ((long) (vVar.f35014c - vVar.f35013b));
                                vVar = vVar.f35017f;
                                C8594l.m46769c(vVar);
                                j2 = U0;
                            }
                        }
                    } else {
                        while (true) {
                            long j7 = ((long) (vVar.f35014c - vVar.f35013b)) + j3;
                            if (j7 > j2) {
                                break;
                            }
                            vVar = vVar.f35017f;
                            C8594l.m46769c(vVar);
                            j3 = j7;
                        }
                        if (vVar != null) {
                            byte[] internalArray$okio2 = hVar.internalArray$okio();
                            byte b2 = internalArray$okio2[0];
                            int size2 = hVar.size();
                            long U03 = (mo30688U0() - ((long) size2)) + 1;
                            while (j3 < U03) {
                                byte[] bArr2 = vVar.f35012a;
                                long j8 = U03;
                                int min2 = (int) Math.min((long) vVar.f35014c, (((long) vVar.f35013b) + U03) - j3);
                                for (int i2 = (int) ((((long) vVar.f35013b) + j2) - j3); i2 < min2; i2++) {
                                    if (bArr2[i2] == b2) {
                                        if (C8625a.m46829b(vVar, i2 + 1, internalArray$okio2, 1, size2)) {
                                            return ((long) (i2 - vVar.f35013b)) + j3;
                                        }
                                    }
                                }
                                j3 += (long) (vVar.f35014c - vVar.f35013b);
                                vVar = vVar.f35017f;
                                C8594l.m46769c(vVar);
                                j2 = j3;
                                U03 = j8;
                            }
                        }
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: w */
    public /* bridge */ /* synthetic */ C8636f mo30733w(int i) {
        mo30701d1(i);
        return this;
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (mo30688U0() == 0) {
            return -1;
        } else {
            if (j > mo30688U0()) {
                j = mo30688U0();
            }
            eVar.mo29321b0(this, j);
            return j;
        }
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        C8594l.m46771e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C8656v X0 = mo30691X0(1);
            int min = Math.min(i, 8192 - X0.f35014c);
            byteBuffer.get(X0.f35012a, X0.f35014c, min);
            i -= min;
            X0.f35014c += min;
        }
        this.f34972h += (long) remaining;
        return remaining;
    }

    /* renamed from: z */
    public long mo30735z(C8638h hVar) throws IOException {
        C8594l.m46771e(hVar, "bytes");
        return mo30732v0(hVar, 0);
    }

    /* renamed from: z0 */
    public long mo30736z0(C8638h hVar, long j) {
        long j2;
        int i;
        int i2;
        int i3;
        C8594l.m46771e(hVar, "targetBytes");
        long j3 = 0;
        if (j >= 0) {
            C8656v vVar = this.f34971g;
            if (vVar == null) {
                return -1;
            }
            if (mo30688U0() - j < j) {
                j2 = mo30688U0();
                while (j2 > j) {
                    vVar = vVar.f35018g;
                    C8594l.m46769c(vVar);
                    j2 -= (long) (vVar.f35014c - vVar.f35013b);
                }
                if (vVar == null) {
                    return -1;
                }
                if (hVar.size() == 2) {
                    byte b = hVar.getByte(0);
                    byte b2 = hVar.getByte(1);
                    while (j2 < mo30688U0()) {
                        byte[] bArr = vVar.f35012a;
                        i2 = (int) ((((long) vVar.f35013b) + j) - j2);
                        int i4 = vVar.f35014c;
                        while (i2 < i4) {
                            byte b3 = bArr[i2];
                            if (!(b3 == b || b3 == b2)) {
                                i2++;
                            }
                        }
                        j2 += (long) (vVar.f35014c - vVar.f35013b);
                        vVar = vVar.f35017f;
                        C8594l.m46769c(vVar);
                        j = j2;
                    }
                    return -1;
                }
                byte[] internalArray$okio = hVar.internalArray$okio();
                while (j2 < mo30688U0()) {
                    byte[] bArr2 = vVar.f35012a;
                    i = (int) ((((long) vVar.f35013b) + j) - j2);
                    int i5 = vVar.f35014c;
                    while (i < i5) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 == b5) {
                                i3 = vVar.f35013b;
                                return ((long) (i2 - i3)) + j2;
                            }
                        }
                        i++;
                    }
                    j2 += (long) (vVar.f35014c - vVar.f35013b);
                    vVar = vVar.f35017f;
                    C8594l.m46769c(vVar);
                    j = j2;
                }
                return -1;
            }
            while (true) {
                long j4 = ((long) (vVar.f35014c - vVar.f35013b)) + j3;
                if (j4 > j) {
                    break;
                }
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                j3 = j4;
            }
            if (vVar == null) {
                return -1;
            }
            if (hVar.size() == 2) {
                byte b6 = hVar.getByte(0);
                byte b7 = hVar.getByte(1);
                while (j2 < mo30688U0()) {
                    byte[] bArr3 = vVar.f35012a;
                    int i6 = (int) ((((long) vVar.f35013b) + j) - j2);
                    int i7 = vVar.f35014c;
                    while (i2 < i7) {
                        byte b8 = bArr3[i2];
                        if (!(b8 == b6 || b8 == b7)) {
                            i6 = i2 + 1;
                        }
                    }
                    j3 = j2 + ((long) (vVar.f35014c - vVar.f35013b));
                    vVar = vVar.f35017f;
                    C8594l.m46769c(vVar);
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray$okio2 = hVar.internalArray$okio();
            while (j2 < mo30688U0()) {
                byte[] bArr4 = vVar.f35012a;
                int i8 = (int) ((((long) vVar.f35013b) + j) - j2);
                int i9 = vVar.f35014c;
                while (i < i9) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 == b10) {
                            i3 = vVar.f35013b;
                            return ((long) (i2 - i3)) + j2;
                        }
                    }
                    i8 = i + 1;
                }
                j3 = j2 + ((long) (vVar.f35014c - vVar.f35013b));
                vVar = vVar.f35017f;
                C8594l.m46769c(vVar);
                j = j3;
            }
            return -1;
            i3 = vVar.f35013b;
            return ((long) (i2 - i3)) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    /* renamed from: k.e$a */
    /* compiled from: Buffer.kt */
    public static final class C8634a extends InputStream {

        /* renamed from: g */
        final /* synthetic */ C8633e f34973g;

        C8634a(C8633e eVar) {
            this.f34973g = eVar;
        }

        public int available() {
            return (int) Math.min(this.f34973g.mo30688U0(), (long) Integer.MAX_VALUE);
        }

        public void close() {
        }

        public int read() {
            if (this.f34973g.mo30688U0() > 0) {
                return this.f34973g.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return this.f34973g + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "sink");
            return this.f34973g.mo30665A0(bArr, i, i2);
        }
    }
}
