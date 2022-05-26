package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082e.p126k.p129c.p131j.C4032v1;

/* renamed from: e.k.c.j.l */
/* compiled from: CodedOutputStream */
public abstract class C3970l extends C3931h {

    /* renamed from: c */
    private static final Logger f12092c = Logger.getLogger(C3970l.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final boolean f12093d = C4022u1.m17619G();

    /* renamed from: a */
    C3979m f12094a;

    /* renamed from: b */
    private boolean f12095b;

    /* renamed from: e.k.c.j.l$b */
    /* compiled from: CodedOutputStream */
    private static abstract class C3972b extends C3970l {

        /* renamed from: e */
        final byte[] f12096e;

        /* renamed from: f */
        final int f12097f;

        /* renamed from: g */
        int f12098g;

        /* renamed from: h */
        int f12099h;

        C3972b(int i) {
            super();
            if (i >= 0) {
                byte[] bArr = new byte[Math.max(i, 20)];
                this.f12096e = bArr;
                this.f12097f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c1 */
        public final void mo13766c1(byte b) {
            byte[] bArr = this.f12096e;
            int i = this.f12098g;
            this.f12098g = i + 1;
            bArr[i] = b;
            this.f12099h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d1 */
        public final void mo13767d1(int i) {
            byte[] bArr = this.f12096e;
            int i2 = this.f12098g;
            int i3 = i2 + 1;
            this.f12098g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f12098g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f12098g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f12098g = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.f12099h += 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e1 */
        public final void mo13768e1(long j) {
            byte[] bArr = this.f12096e;
            int i = this.f12098g;
            int i2 = i + 1;
            this.f12098g = i2;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            this.f12098g = i3;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            this.f12098g = i4;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            this.f12098g = i5;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            this.f12098g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            this.f12098g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            this.f12098g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f12098g = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f12099h += 8;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f1 */
        public final void mo13769f1(int i) {
            if (i >= 0) {
                mo13771h1(i);
            } else {
                mo13772i1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public final void mo13770g1(int i, int i2) {
            mo13771h1(C4042w1.m17904c(i, i2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h1 */
        public final void mo13771h1(int i) {
            if (C3970l.f12093d) {
                long j = (long) this.f12098g;
                while ((i & -128) != 0) {
                    byte[] bArr = this.f12096e;
                    int i2 = this.f12098g;
                    this.f12098g = i2 + 1;
                    C4022u1.m17625M(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f12096e;
                int i3 = this.f12098g;
                this.f12098g = i3 + 1;
                C4022u1.m17625M(bArr2, (long) i3, (byte) i);
                this.f12099h += (int) (((long) this.f12098g) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.f12096e;
                int i4 = this.f12098g;
                this.f12098g = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.f12099h++;
                i >>>= 7;
            }
            byte[] bArr4 = this.f12096e;
            int i5 = this.f12098g;
            this.f12098g = i5 + 1;
            bArr4[i5] = (byte) i;
            this.f12099h++;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i1 */
        public final void mo13772i1(long j) {
            if (C3970l.f12093d) {
                long j2 = (long) this.f12098g;
                while ((j & -128) != 0) {
                    byte[] bArr = this.f12096e;
                    int i = this.f12098g;
                    this.f12098g = i + 1;
                    C4022u1.m17625M(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f12096e;
                int i2 = this.f12098g;
                this.f12098g = i2 + 1;
                C4022u1.m17625M(bArr2, (long) i2, (byte) ((int) j));
                this.f12099h += (int) (((long) this.f12098g) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f12096e;
                int i3 = this.f12098g;
                this.f12098g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.f12099h++;
                j >>>= 7;
            }
            byte[] bArr4 = this.f12096e;
            int i4 = this.f12098g;
            this.f12098g = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.f12099h++;
        }

        /* renamed from: j0 */
        public final int mo13749j0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    /* renamed from: e.k.c.j.l$c */
    /* compiled from: CodedOutputStream */
    private static class C3973c extends C3970l {

        /* renamed from: e */
        private final byte[] f12100e;

        /* renamed from: f */
        private final int f12101f;

        /* renamed from: g */
        private int f12102g;

        C3973c(byte[] bArr, int i, int i2) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) >= 0) {
                this.f12100e = bArr;
                this.f12102g = i;
                this.f12101f = i3;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: F0 */
        public final void mo13722F0(int i, int i2) throws IOException {
            mo13740X0(i, 0);
            mo13723G0(i2);
        }

        /* renamed from: G0 */
        public final void mo13723G0(int i) throws IOException {
            if (i >= 0) {
                mo13742Z0(i);
            } else {
                mo13744b1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J0 */
        public final void mo13726J0(int i, C4012s0 s0Var, C3963j1 j1Var) throws IOException {
            mo13740X0(i, 2);
            mo13742Z0(((C3893a) s0Var).mo13404l(j1Var));
            j1Var.mo13708e(s0Var, this.f12094a);
        }

        /* renamed from: K0 */
        public final void mo13727K0(C4012s0 s0Var) throws IOException {
            mo13742Z0(s0Var.mo13953e());
            s0Var.mo13954f(this);
        }

        /* renamed from: L0 */
        public final void mo13728L0(int i, C4012s0 s0Var) throws IOException {
            mo13740X0(1, 3);
            mo13741Y0(2, i);
            mo13775e1(3, s0Var);
            mo13740X0(1, 4);
        }

        /* renamed from: M0 */
        public final void mo13729M0(int i, C3934i iVar) throws IOException {
            mo13740X0(1, 3);
            mo13741Y0(2, i);
            mo13755p0(3, iVar);
            mo13740X0(1, 4);
        }

        /* renamed from: V0 */
        public final void mo13738V0(int i, String str) throws IOException {
            mo13740X0(i, 2);
            mo13739W0(str);
        }

        /* renamed from: W0 */
        public final void mo13739W0(String str) throws IOException {
            int i = this.f12102g;
            try {
                int Y = C3970l.m17141Y(str.length() * 3);
                int Y2 = C3970l.m17141Y(str.length());
                if (Y2 == Y) {
                    int i2 = i + Y2;
                    this.f12102g = i2;
                    int i3 = C4032v1.m17821i(str, this.f12100e, i2, mo13749j0());
                    this.f12102g = i;
                    mo13742Z0((i3 - i) - Y2);
                    this.f12102g = i3;
                    return;
                }
                mo13742Z0(C4032v1.m17822j(str));
                this.f12102g = C4032v1.m17821i(str, this.f12100e, this.f12102g, mo13749j0());
            } catch (C4032v1.C4036d e) {
                this.f12102g = i;
                mo13747e0(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C3974d((Throwable) e2);
            }
        }

        /* renamed from: X0 */
        public final void mo13740X0(int i, int i2) throws IOException {
            mo13742Z0(C4042w1.m17904c(i, i2));
        }

        /* renamed from: Y0 */
        public final void mo13741Y0(int i, int i2) throws IOException {
            mo13740X0(i, 0);
            mo13742Z0(i2);
        }

        /* renamed from: Z0 */
        public final void mo13742Z0(int i) throws IOException {
            if (!C3970l.f12093d || C3914d.m16667c() || mo13749j0() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f12100e;
                    int i2 = this.f12102g;
                    this.f12102g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f12100e;
                    int i3 = this.f12102g;
                    this.f12102g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), 1}), e);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f12100e;
                int i4 = this.f12102g;
                this.f12102g = i4 + 1;
                C4022u1.m17625M(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f12100e;
                int i5 = this.f12102g;
                this.f12102g = i5 + 1;
                C4022u1.m17625M(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f12100e;
                    int i7 = this.f12102g;
                    this.f12102g = i7 + 1;
                    C4022u1.m17625M(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f12100e;
                int i8 = this.f12102g;
                this.f12102g = i8 + 1;
                C4022u1.m17625M(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f12100e;
                    int i10 = this.f12102g;
                    this.f12102g = i10 + 1;
                    C4022u1.m17625M(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f12100e;
                int i11 = this.f12102g;
                this.f12102g = i11 + 1;
                C4022u1.m17625M(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f12100e;
                    int i13 = this.f12102g;
                    this.f12102g = i13 + 1;
                    C4022u1.m17625M(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f12100e;
                int i14 = this.f12102g;
                this.f12102g = i14 + 1;
                C4022u1.m17625M(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f12100e;
                int i15 = this.f12102g;
                this.f12102g = i15 + 1;
                C4022u1.m17625M(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        /* renamed from: a */
        public final void mo13586a(ByteBuffer byteBuffer) throws IOException {
            mo13773c1(byteBuffer);
        }

        /* renamed from: a1 */
        public final void mo13743a1(int i, long j) throws IOException {
            mo13740X0(i, 0);
            mo13744b1(j);
        }

        /* renamed from: b */
        public final void mo13587b(byte[] bArr, int i, int i2) throws IOException {
            mo13774d1(bArr, i, i2);
        }

        /* renamed from: b1 */
        public final void mo13744b1(long j) throws IOException {
            if (!C3970l.f12093d || mo13749j0() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f12100e;
                    int i = this.f12102g;
                    this.f12102g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f12100e;
                    int i2 = this.f12102g;
                    this.f12102g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f12100e;
                    int i3 = this.f12102g;
                    this.f12102g = i3 + 1;
                    C4022u1.m17625M(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f12100e;
                int i4 = this.f12102g;
                this.f12102g = i4 + 1;
                C4022u1.m17625M(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: c1 */
        public final void mo13773c1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f12100e, this.f12102g, remaining);
                this.f12102g += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), Integer.valueOf(remaining)}), e);
            }
        }

        /* renamed from: d0 */
        public void mo13746d0() {
        }

        /* renamed from: d1 */
        public final void mo13774d1(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f12100e, this.f12102g, i2);
                this.f12102g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: e1 */
        public final void mo13775e1(int i, C4012s0 s0Var) throws IOException {
            mo13740X0(i, 2);
            mo13727K0(s0Var);
        }

        /* renamed from: j0 */
        public final int mo13749j0() {
            return this.f12101f - this.f12102g;
        }

        /* renamed from: k0 */
        public final void mo13750k0(byte b) throws IOException {
            try {
                byte[] bArr = this.f12100e;
                int i = this.f12102g;
                this.f12102g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), 1}), e);
            }
        }

        /* renamed from: l0 */
        public final void mo13751l0(int i, boolean z) throws IOException {
            mo13740X0(i, 0);
            mo13750k0(z ? (byte) 1 : 0);
        }

        /* renamed from: o0 */
        public final void mo13754o0(byte[] bArr, int i, int i2) throws IOException {
            mo13742Z0(i2);
            mo13774d1(bArr, i, i2);
        }

        /* renamed from: p0 */
        public final void mo13755p0(int i, C3934i iVar) throws IOException {
            mo13740X0(i, 2);
            mo13756q0(iVar);
        }

        /* renamed from: q0 */
        public final void mo13756q0(C3934i iVar) throws IOException {
            mo13742Z0(iVar.size());
            iVar.writeTo((C3931h) this);
        }

        /* renamed from: v0 */
        public final void mo13761v0(int i, int i2) throws IOException {
            mo13740X0(i, 5);
            mo13762w0(i2);
        }

        /* renamed from: w0 */
        public final void mo13762w0(int i) throws IOException {
            try {
                byte[] bArr = this.f12100e;
                int i2 = this.f12102g;
                int i3 = i2 + 1;
                this.f12102g = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i3 + 1;
                this.f12102g = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i4 + 1;
                this.f12102g = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f12102g = i5 + 1;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), 1}), e);
            }
        }

        /* renamed from: x0 */
        public final void mo13763x0(int i, long j) throws IOException {
            mo13740X0(i, 1);
            mo13764y0(j);
        }

        /* renamed from: y0 */
        public final void mo13764y0(long j) throws IOException {
            try {
                byte[] bArr = this.f12100e;
                int i = this.f12102g;
                int i2 = i + 1;
                this.f12102g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i2 + 1;
                this.f12102g = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i3 + 1;
                this.f12102g = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i4 + 1;
                this.f12102g = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i5 + 1;
                this.f12102g = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i6 + 1;
                this.f12102g = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i7 + 1;
                this.f12102g = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f12102g = i8 + 1;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new C3974d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f12102g), Integer.valueOf(this.f12101f), 1}), e);
            }
        }
    }

    /* renamed from: e.k.c.j.l$d */
    /* compiled from: CodedOutputStream */
    public static class C3974d extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C3974d() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C3974d(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        C3974d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        C3974d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    /* renamed from: e.k.c.j.l$e */
    /* compiled from: CodedOutputStream */
    private static final class C3975e extends C3972b {

        /* renamed from: i */
        private final OutputStream f12103i;

        C3975e(OutputStream outputStream, int i) {
            super(i);
            Objects.requireNonNull(outputStream, "out");
            this.f12103i = outputStream;
        }

        /* renamed from: j1 */
        private void m17258j1() throws IOException {
            this.f12103i.write(this.f12096e, 0, this.f12098g);
            this.f12098g = 0;
        }

        /* renamed from: k1 */
        private void m17259k1(int i) throws IOException {
            if (this.f12097f - this.f12098g < i) {
                m17258j1();
            }
        }

        /* renamed from: F0 */
        public void mo13722F0(int i, int i2) throws IOException {
            m17259k1(20);
            mo13770g1(i, 0);
            mo13769f1(i2);
        }

        /* renamed from: G0 */
        public void mo13723G0(int i) throws IOException {
            if (i >= 0) {
                mo13742Z0(i);
            } else {
                mo13744b1((long) i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J0 */
        public void mo13726J0(int i, C4012s0 s0Var, C3963j1 j1Var) throws IOException {
            mo13740X0(i, 2);
            mo13779o1(s0Var, j1Var);
        }

        /* renamed from: K0 */
        public void mo13727K0(C4012s0 s0Var) throws IOException {
            mo13742Z0(s0Var.mo13953e());
            s0Var.mo13954f(this);
        }

        /* renamed from: L0 */
        public void mo13728L0(int i, C4012s0 s0Var) throws IOException {
            mo13740X0(1, 3);
            mo13741Y0(2, i);
            mo13778n1(3, s0Var);
            mo13740X0(1, 4);
        }

        /* renamed from: M0 */
        public void mo13729M0(int i, C3934i iVar) throws IOException {
            mo13740X0(1, 3);
            mo13741Y0(2, i);
            mo13755p0(3, iVar);
            mo13740X0(1, 4);
        }

        /* renamed from: V0 */
        public void mo13738V0(int i, String str) throws IOException {
            mo13740X0(i, 2);
            mo13739W0(str);
        }

        /* renamed from: W0 */
        public void mo13739W0(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int Y = C3970l.m17141Y(length);
                int i3 = Y + length;
                int i4 = this.f12097f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int i5 = C4032v1.m17821i(str, bArr, 0, length);
                    mo13742Z0(i5);
                    mo13587b(bArr, 0, i5);
                    return;
                }
                if (i3 > i4 - this.f12098g) {
                    m17258j1();
                }
                int Y2 = C3970l.m17141Y(str.length());
                i = this.f12098g;
                if (Y2 == Y) {
                    int i6 = i + Y2;
                    this.f12098g = i6;
                    int i7 = C4032v1.m17821i(str, this.f12096e, i6, this.f12097f - i6);
                    this.f12098g = i;
                    i2 = (i7 - i) - Y2;
                    mo13771h1(i2);
                    this.f12098g = i7;
                } else {
                    i2 = C4032v1.m17822j(str);
                    mo13771h1(i2);
                    this.f12098g = C4032v1.m17821i(str, this.f12096e, this.f12098g, i2);
                }
                this.f12099h += i2;
            } catch (C4032v1.C4036d e) {
                this.f12099h -= this.f12098g - i;
                this.f12098g = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C3974d((Throwable) e2);
            } catch (C4032v1.C4036d e3) {
                mo13747e0(str, e3);
            }
        }

        /* renamed from: X0 */
        public void mo13740X0(int i, int i2) throws IOException {
            mo13742Z0(C4042w1.m17904c(i, i2));
        }

        /* renamed from: Y0 */
        public void mo13741Y0(int i, int i2) throws IOException {
            m17259k1(20);
            mo13770g1(i, 0);
            mo13771h1(i2);
        }

        /* renamed from: Z0 */
        public void mo13742Z0(int i) throws IOException {
            m17259k1(5);
            mo13771h1(i);
        }

        /* renamed from: a */
        public void mo13586a(ByteBuffer byteBuffer) throws IOException {
            mo13776l1(byteBuffer);
        }

        /* renamed from: a1 */
        public void mo13743a1(int i, long j) throws IOException {
            m17259k1(20);
            mo13770g1(i, 0);
            mo13772i1(j);
        }

        /* renamed from: b */
        public void mo13587b(byte[] bArr, int i, int i2) throws IOException {
            mo13777m1(bArr, i, i2);
        }

        /* renamed from: b1 */
        public void mo13744b1(long j) throws IOException {
            m17259k1(10);
            mo13772i1(j);
        }

        /* renamed from: d0 */
        public void mo13746d0() throws IOException {
            if (this.f12098g > 0) {
                m17258j1();
            }
        }

        /* renamed from: k0 */
        public void mo13750k0(byte b) throws IOException {
            if (this.f12098g == this.f12097f) {
                m17258j1();
            }
            mo13766c1(b);
        }

        /* renamed from: l0 */
        public void mo13751l0(int i, boolean z) throws IOException {
            m17259k1(11);
            mo13770g1(i, 0);
            mo13766c1(z ? (byte) 1 : 0);
        }

        /* renamed from: l1 */
        public void mo13776l1(ByteBuffer byteBuffer) throws IOException {
            int remaining = byteBuffer.remaining();
            int i = this.f12097f;
            int i2 = this.f12098g;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.f12096e, i2, remaining);
                this.f12098g += remaining;
                this.f12099h += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f12096e, i2, i3);
            int i4 = remaining - i3;
            this.f12098g = this.f12097f;
            this.f12099h += i3;
            m17258j1();
            while (true) {
                int i5 = this.f12097f;
                if (i4 > i5) {
                    byteBuffer.get(this.f12096e, 0, i5);
                    this.f12103i.write(this.f12096e, 0, this.f12097f);
                    int i6 = this.f12097f;
                    i4 -= i6;
                    this.f12099h += i6;
                } else {
                    byteBuffer.get(this.f12096e, 0, i4);
                    this.f12098g = i4;
                    this.f12099h += i4;
                    return;
                }
            }
        }

        /* renamed from: m1 */
        public void mo13777m1(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f12097f;
            int i4 = this.f12098g;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f12096e, i4, i2);
                this.f12098g += i2;
                this.f12099h += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f12096e, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f12098g = this.f12097f;
            this.f12099h += i5;
            m17258j1();
            if (i7 <= this.f12097f) {
                System.arraycopy(bArr, i6, this.f12096e, 0, i7);
                this.f12098g = i7;
            } else {
                this.f12103i.write(bArr, i6, i7);
            }
            this.f12099h += i7;
        }

        /* renamed from: n1 */
        public void mo13778n1(int i, C4012s0 s0Var) throws IOException {
            mo13740X0(i, 2);
            mo13727K0(s0Var);
        }

        /* renamed from: o0 */
        public void mo13754o0(byte[] bArr, int i, int i2) throws IOException {
            mo13742Z0(i2);
            mo13777m1(bArr, i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o1 */
        public void mo13779o1(C4012s0 s0Var, C3963j1 j1Var) throws IOException {
            mo13742Z0(((C3893a) s0Var).mo13404l(j1Var));
            j1Var.mo13708e(s0Var, this.f12094a);
        }

        /* renamed from: p0 */
        public void mo13755p0(int i, C3934i iVar) throws IOException {
            mo13740X0(i, 2);
            mo13756q0(iVar);
        }

        /* renamed from: q0 */
        public void mo13756q0(C3934i iVar) throws IOException {
            mo13742Z0(iVar.size());
            iVar.writeTo((C3931h) this);
        }

        /* renamed from: v0 */
        public void mo13761v0(int i, int i2) throws IOException {
            m17259k1(14);
            mo13770g1(i, 5);
            mo13767d1(i2);
        }

        /* renamed from: w0 */
        public void mo13762w0(int i) throws IOException {
            m17259k1(4);
            mo13767d1(i);
        }

        /* renamed from: x0 */
        public void mo13763x0(int i, long j) throws IOException {
            m17259k1(18);
            mo13770g1(i, 1);
            mo13768e1(j);
        }

        /* renamed from: y0 */
        public void mo13764y0(long j) throws IOException {
            m17259k1(8);
            mo13768e1(j);
        }
    }

    /* renamed from: A */
    public static int m17117A(int i, C3926f0 f0Var) {
        return (m17139W(1) * 2) + m17140X(2, i) + m17118B(3, f0Var);
    }

    /* renamed from: B */
    public static int m17118B(int i, C3926f0 f0Var) {
        return m17139W(i) + m17119C(f0Var);
    }

    /* renamed from: C */
    public static int m17119C(C3926f0 f0Var) {
        return m17120D(f0Var.mo13557b());
    }

    /* renamed from: D */
    static int m17120D(int i) {
        return m17141Y(i) + i;
    }

    /* renamed from: E */
    public static int m17121E(int i, C4012s0 s0Var) {
        return (m17139W(1) * 2) + m17140X(2, i) + m17122F(3, s0Var);
    }

    /* renamed from: F */
    public static int m17122F(int i, C4012s0 s0Var) {
        return m17139W(i) + m17124H(s0Var);
    }

    /* renamed from: G */
    static int m17123G(int i, C4012s0 s0Var, C3963j1 j1Var) {
        return m17139W(i) + m17125I(s0Var, j1Var);
    }

    /* renamed from: H */
    public static int m17124H(C4012s0 s0Var) {
        return m17120D(s0Var.mo13953e());
    }

    /* renamed from: I */
    static int m17125I(C4012s0 s0Var, C3963j1 j1Var) {
        return m17120D(((C3893a) s0Var).mo13404l(j1Var));
    }

    /* renamed from: J */
    static int m17126J(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    /* renamed from: K */
    public static int m17127K(int i, C3934i iVar) {
        return (m17139W(1) * 2) + m17140X(2, i) + m17151h(3, iVar);
    }

    @Deprecated
    /* renamed from: L */
    public static int m17128L(int i) {
        return m17141Y(i);
    }

    /* renamed from: M */
    public static int m17129M(int i, int i2) {
        return m17139W(i) + m17130N(i2);
    }

    /* renamed from: N */
    public static int m17130N(int i) {
        return 4;
    }

    /* renamed from: O */
    public static int m17131O(int i, long j) {
        return m17139W(i) + m17132P(j);
    }

    /* renamed from: P */
    public static int m17132P(long j) {
        return 8;
    }

    /* renamed from: Q */
    public static int m17133Q(int i, int i2) {
        return m17139W(i) + m17134R(i2);
    }

    /* renamed from: R */
    public static int m17134R(int i) {
        return m17141Y(m17144b0(i));
    }

    /* renamed from: S */
    public static int m17135S(int i, long j) {
        return m17139W(i) + m17136T(j);
    }

    /* renamed from: T */
    public static int m17136T(long j) {
        return m17143a0(m17146c0(j));
    }

    /* renamed from: U */
    public static int m17137U(int i, String str) {
        return m17139W(i) + m17138V(str);
    }

    /* renamed from: V */
    public static int m17138V(String str) {
        int i;
        try {
            i = C4032v1.m17822j(str);
        } catch (C4032v1.C4036d unused) {
            i = str.getBytes(C3899b0.f11982a).length;
        }
        return m17120D(i);
    }

    /* renamed from: W */
    public static int m17139W(int i) {
        return m17141Y(C4042w1.m17904c(i, 0));
    }

    /* renamed from: X */
    public static int m17140X(int i, int i2) {
        return m17139W(i) + m17141Y(i2);
    }

    /* renamed from: Y */
    public static int m17141Y(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: Z */
    public static int m17142Z(int i, long j) {
        return m17139W(i) + m17143a0(j);
    }

    /* renamed from: a0 */
    public static int m17143a0(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: b0 */
    public static int m17144b0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: c0 */
    public static long m17146c0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: e */
    public static int m17147e(int i, boolean z) {
        return m17139W(i) + m17148f(z);
    }

    /* renamed from: f */
    public static int m17148f(boolean z) {
        return 1;
    }

    /* renamed from: g */
    public static int m17149g(byte[] bArr) {
        return m17120D(bArr.length);
    }

    /* renamed from: g0 */
    public static C3970l m17150g0(OutputStream outputStream, int i) {
        return new C3975e(outputStream, i);
    }

    /* renamed from: h */
    public static int m17151h(int i, C3934i iVar) {
        return m17139W(i) + m17153i(iVar);
    }

    /* renamed from: h0 */
    public static C3970l m17152h0(byte[] bArr) {
        return m17154i0(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static int m17153i(C3934i iVar) {
        return m17120D(iVar.size());
    }

    /* renamed from: i0 */
    public static C3970l m17154i0(byte[] bArr, int i, int i2) {
        return new C3973c(bArr, i, i2);
    }

    /* renamed from: j */
    public static int m17155j(int i, double d) {
        return m17139W(i) + m17156k(d);
    }

    /* renamed from: k */
    public static int m17156k(double d) {
        return 8;
    }

    /* renamed from: l */
    public static int m17157l(int i, int i2) {
        return m17139W(i) + m17158m(i2);
    }

    /* renamed from: m */
    public static int m17158m(int i) {
        return m17169x(i);
    }

    /* renamed from: n */
    public static int m17159n(int i, int i2) {
        return m17139W(i) + m17160o(i2);
    }

    /* renamed from: o */
    public static int m17160o(int i) {
        return 4;
    }

    /* renamed from: p */
    public static int m17161p(int i, long j) {
        return m17139W(i) + m17162q(j);
    }

    /* renamed from: q */
    public static int m17162q(long j) {
        return 8;
    }

    /* renamed from: r */
    public static int m17163r(int i, float f) {
        return m17139W(i) + m17164s(f);
    }

    /* renamed from: s */
    public static int m17164s(float f) {
        return 4;
    }

    @Deprecated
    /* renamed from: t */
    static int m17165t(int i, C4012s0 s0Var, C3963j1 j1Var) {
        return (m17139W(i) * 2) + m17167v(s0Var, j1Var);
    }

    @Deprecated
    /* renamed from: u */
    public static int m17166u(C4012s0 s0Var) {
        return s0Var.mo13953e();
    }

    @Deprecated
    /* renamed from: v */
    static int m17167v(C4012s0 s0Var, C3963j1 j1Var) {
        return ((C3893a) s0Var).mo13404l(j1Var);
    }

    /* renamed from: w */
    public static int m17168w(int i, int i2) {
        return m17139W(i) + m17169x(i2);
    }

    /* renamed from: x */
    public static int m17169x(int i) {
        if (i >= 0) {
            return m17141Y(i);
        }
        return 10;
    }

    /* renamed from: y */
    public static int m17170y(int i, long j) {
        return m17139W(i) + m17171z(j);
    }

    /* renamed from: z */
    public static int m17171z(long j) {
        return m17143a0(j);
    }

    /* renamed from: A0 */
    public final void mo13717A0(float f) throws IOException {
        mo13762w0(Float.floatToRawIntBits(f));
    }

    @Deprecated
    /* renamed from: B0 */
    public final void mo13718B0(int i, C4012s0 s0Var) throws IOException {
        mo13740X0(i, 3);
        mo13720D0(s0Var);
        mo13740X0(i, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: C0 */
    public final void mo13719C0(int i, C4012s0 s0Var, C3963j1 j1Var) throws IOException {
        mo13740X0(i, 3);
        mo13721E0(s0Var, j1Var);
        mo13740X0(i, 4);
    }

    @Deprecated
    /* renamed from: D0 */
    public final void mo13720D0(C4012s0 s0Var) throws IOException {
        s0Var.mo13954f(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: E0 */
    public final void mo13721E0(C4012s0 s0Var, C3963j1 j1Var) throws IOException {
        j1Var.mo13708e(s0Var, this.f12094a);
    }

    /* renamed from: F0 */
    public abstract void mo13722F0(int i, int i2) throws IOException;

    /* renamed from: G0 */
    public abstract void mo13723G0(int i) throws IOException;

    /* renamed from: H0 */
    public final void mo13724H0(int i, long j) throws IOException {
        mo13743a1(i, j);
    }

    /* renamed from: I0 */
    public final void mo13725I0(long j) throws IOException {
        mo13744b1(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public abstract void mo13726J0(int i, C4012s0 s0Var, C3963j1 j1Var) throws IOException;

    /* renamed from: K0 */
    public abstract void mo13727K0(C4012s0 s0Var) throws IOException;

    /* renamed from: L0 */
    public abstract void mo13728L0(int i, C4012s0 s0Var) throws IOException;

    /* renamed from: M0 */
    public abstract void mo13729M0(int i, C3934i iVar) throws IOException;

    /* renamed from: N0 */
    public final void mo13730N0(int i, int i2) throws IOException {
        mo13761v0(i, i2);
    }

    /* renamed from: O0 */
    public final void mo13731O0(int i) throws IOException {
        mo13762w0(i);
    }

    /* renamed from: P0 */
    public final void mo13732P0(int i, long j) throws IOException {
        mo13763x0(i, j);
    }

    /* renamed from: Q0 */
    public final void mo13733Q0(long j) throws IOException {
        mo13764y0(j);
    }

    /* renamed from: R0 */
    public final void mo13734R0(int i, int i2) throws IOException {
        mo13741Y0(i, m17144b0(i2));
    }

    /* renamed from: S0 */
    public final void mo13735S0(int i) throws IOException {
        mo13742Z0(m17144b0(i));
    }

    /* renamed from: T0 */
    public final void mo13736T0(int i, long j) throws IOException {
        mo13743a1(i, m17146c0(j));
    }

    /* renamed from: U0 */
    public final void mo13737U0(long j) throws IOException {
        mo13744b1(m17146c0(j));
    }

    /* renamed from: V0 */
    public abstract void mo13738V0(int i, String str) throws IOException;

    /* renamed from: W0 */
    public abstract void mo13739W0(String str) throws IOException;

    /* renamed from: X0 */
    public abstract void mo13740X0(int i, int i2) throws IOException;

    /* renamed from: Y0 */
    public abstract void mo13741Y0(int i, int i2) throws IOException;

    /* renamed from: Z0 */
    public abstract void mo13742Z0(int i) throws IOException;

    /* renamed from: a1 */
    public abstract void mo13743a1(int i, long j) throws IOException;

    /* renamed from: b1 */
    public abstract void mo13744b1(long j) throws IOException;

    /* renamed from: d */
    public final void mo13745d() {
        if (mo13749j0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: d0 */
    public abstract void mo13746d0() throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo13747e0(String str, C4032v1.C4036d dVar) throws IOException {
        f12092c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(C3899b0.f11982a);
        try {
            mo13742Z0(bytes.length);
            mo13587b(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C3974d((Throwable) e);
        } catch (C3974d e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public boolean mo13748f0() {
        return this.f12095b;
    }

    /* renamed from: j0 */
    public abstract int mo13749j0();

    /* renamed from: k0 */
    public abstract void mo13750k0(byte b) throws IOException;

    /* renamed from: l0 */
    public abstract void mo13751l0(int i, boolean z) throws IOException;

    /* renamed from: m0 */
    public final void mo13752m0(boolean z) throws IOException {
        mo13750k0(z ? (byte) 1 : 0);
    }

    /* renamed from: n0 */
    public final void mo13753n0(byte[] bArr) throws IOException {
        mo13754o0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public abstract void mo13754o0(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: p0 */
    public abstract void mo13755p0(int i, C3934i iVar) throws IOException;

    /* renamed from: q0 */
    public abstract void mo13756q0(C3934i iVar) throws IOException;

    /* renamed from: r0 */
    public final void mo13757r0(int i, double d) throws IOException {
        mo13763x0(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: s0 */
    public final void mo13758s0(double d) throws IOException {
        mo13764y0(Double.doubleToRawLongBits(d));
    }

    /* renamed from: t0 */
    public final void mo13759t0(int i, int i2) throws IOException {
        mo13722F0(i, i2);
    }

    /* renamed from: u0 */
    public final void mo13760u0(int i) throws IOException {
        mo13723G0(i);
    }

    /* renamed from: v0 */
    public abstract void mo13761v0(int i, int i2) throws IOException;

    /* renamed from: w0 */
    public abstract void mo13762w0(int i) throws IOException;

    /* renamed from: x0 */
    public abstract void mo13763x0(int i, long j) throws IOException;

    /* renamed from: y0 */
    public abstract void mo13764y0(long j) throws IOException;

    /* renamed from: z0 */
    public final void mo13765z0(int i, float f) throws IOException {
        mo13761v0(i, Float.floatToRawIntBits(f));
    }

    private C3970l() {
    }
}
