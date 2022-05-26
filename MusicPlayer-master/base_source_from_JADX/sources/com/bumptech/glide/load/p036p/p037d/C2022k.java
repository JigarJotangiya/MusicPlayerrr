package com.bumptech.glide.load.p036p.p037d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.p051s.C2193j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.load.p.d.k */
/* compiled from: DefaultImageHeaderParser */
public final class C2022k implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f7032a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f7033b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: com.bumptech.glide.load.p.d.k$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C2023a implements C2025c {

        /* renamed from: a */
        private final ByteBuffer f7034a;

        C2023a(ByteBuffer byteBuffer) {
            this.f7034a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: j */
        public long mo8114j(long j) {
            int min = (int) Math.min((long) this.f7034a.remaining(), j);
            ByteBuffer byteBuffer = this.f7034a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        /* renamed from: k */
        public int mo8115k() throws C2025c.C2026a {
            return (mo8117m() << 8) | mo8117m();
        }

        /* renamed from: l */
        public int mo8116l(byte[] bArr, int i) {
            int min = Math.min(i, this.f7034a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7034a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: m */
        public short mo8117m() throws C2025c.C2026a {
            if (this.f7034a.remaining() >= 1) {
                return (short) (this.f7034a.get() & 255);
            }
            throw new C2025c.C2026a();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.k$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C2024b {

        /* renamed from: a */
        private final ByteBuffer f7035a;

        C2024b(byte[] bArr, int i) {
            this.f7035a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m9523c(int i, int i2) {
            return this.f7035a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo8118a(int i) {
            if (m9523c(i, 2)) {
                return this.f7035a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo8119b(int i) {
            if (m9523c(i, 4)) {
                return this.f7035a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo8120d() {
            return this.f7035a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo8121e(ByteOrder byteOrder) {
            this.f7035a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d.k$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C2025c {

        /* renamed from: com.bumptech.glide.load.p.d.k$c$a */
        /* compiled from: DefaultImageHeaderParser */
        public static final class C2026a extends IOException {
            private static final long serialVersionUID = 1;

            C2026a() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: j */
        long mo8114j(long j) throws IOException;

        /* renamed from: k */
        int mo8115k() throws IOException;

        /* renamed from: l */
        int mo8116l(byte[] bArr, int i) throws IOException;

        /* renamed from: m */
        short mo8117m() throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.p.d.k$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C2027d implements C2025c {

        /* renamed from: a */
        private final InputStream f7036a;

        C2027d(InputStream inputStream) {
            this.f7036a = inputStream;
        }

        /* renamed from: j */
        public long mo8114j(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f7036a.skip(j2);
                if (skip <= 0) {
                    if (this.f7036a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        /* renamed from: k */
        public int mo8115k() throws IOException {
            return (mo8117m() << 8) | mo8117m();
        }

        /* renamed from: l */
        public int mo8116l(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f7036a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new C2025c.C2026a();
        }

        /* renamed from: m */
        public short mo8117m() throws IOException {
            int read = this.f7036a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new C2025c.C2026a();
        }
    }

    /* renamed from: d */
    private static int m9508d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m9509e(C2025c cVar, C1802b bVar) throws IOException {
        byte[] bArr;
        try {
            int k = cVar.mo8115k();
            if (!m9511g(k)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + k);
                }
                return -1;
            }
            int i = m9513i(cVar);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo7771e(i, byte[].class);
            int k2 = m9515k(cVar, bArr, i);
            bVar.mo7770d(bArr);
            return k2;
        } catch (C2025c.C2026a unused) {
            return -1;
        } catch (Throwable th) {
            bVar.mo7770d(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m9510f(com.bumptech.glide.load.p036p.p037d.C2022k.C2025c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.mo8115k()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo8117m()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo8117m()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.mo8114j(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo8117m()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.mo8114j(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.mo8115k()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo8115k()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo8115k()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo8115k()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.mo8114j(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo8117m()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.mo8114j(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.mo8117m()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p036p.p037d.C2022k.m9510f(com.bumptech.glide.load.p.d.k$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    private static boolean m9511g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m9512h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f7032a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f7032a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m9513i(C2025c cVar) throws IOException {
        short m;
        int k;
        long j;
        long j2;
        do {
            short m2 = cVar.mo8117m();
            if (m2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + m2);
                }
                return -1;
            }
            m = cVar.mo8117m();
            if (m == 218) {
                return -1;
            }
            if (m == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            k = cVar.mo8115k() - 2;
            if (m == 225) {
                return k;
            }
            j = (long) k;
            j2 = cVar.mo8114j(j);
        } while (j2 == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + m + ", wanted to skip: " + k + ", but actually skipped: " + j2);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m9514j(C2024b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo8118a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo8121e(byteOrder);
        int b = bVar.mo8119b(10) + 6;
        short a2 = bVar.mo8118a(b);
        for (int i = 0; i < a2; i++) {
            int d = m9508d(b, i);
            short a3 = bVar.mo8118a(d);
            if (a3 == 274) {
                short a4 = bVar.mo8118a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo8119b(d + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f7033b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo8120d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo8120d()) {
                                return bVar.mo8118a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m9515k(C2025c cVar, byte[] bArr, int i) throws IOException {
        int l = cVar.mo8116l(bArr, i);
        if (l != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + l);
            }
            return -1;
        } else if (m9512h(bArr, i)) {
            return m9514j(new C2024b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ImageHeaderParser.ImageType mo7676a(ByteBuffer byteBuffer) throws IOException {
        C2193j.m10269d(byteBuffer);
        return m9510f(new C2023a(byteBuffer));
    }

    /* renamed from: b */
    public ImageHeaderParser.ImageType mo7677b(InputStream inputStream) throws IOException {
        C2193j.m10269d(inputStream);
        return m9510f(new C2027d(inputStream));
    }

    /* renamed from: c */
    public int mo7678c(InputStream inputStream, C1802b bVar) throws IOException {
        C2193j.m10269d(inputStream);
        C2027d dVar = new C2027d(inputStream);
        C2193j.m10269d(bVar);
        return m9509e(dVar, bVar);
    }
}
