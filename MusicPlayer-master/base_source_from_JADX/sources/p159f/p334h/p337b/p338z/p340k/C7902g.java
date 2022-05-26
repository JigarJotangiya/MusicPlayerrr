package p159f.p334h.p337b.p338z.p340k;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p159f.p334h.p337b.p338z.p340k.C7894b;
import p159f.p334h.p337b.p338z.p340k.C7899f;
import p394k.C8620a0;
import p394k.C8622b0;
import p394k.C8633e;
import p394k.C8636f;
import p394k.C8637g;
import p394k.C8638h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.z.k.g */
/* compiled from: Http2 */
public final class C7902g implements C7938q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f33523a = Logger.getLogger(C7904b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C8638h f33524b = C8638h.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: f.h.b.z.k.g$a */
    /* compiled from: Http2 */
    static final class C7903a implements C8620a0 {

        /* renamed from: g */
        private final C8637g f33525g;

        /* renamed from: h */
        int f33526h;

        /* renamed from: i */
        byte f33527i;

        /* renamed from: j */
        int f33528j;

        /* renamed from: k */
        int f33529k;

        /* renamed from: l */
        short f33530l;

        public C7903a(C8637g gVar) {
            this.f33525g = gVar;
        }

        /* renamed from: c */
        private void m43317c() throws IOException {
            int i = this.f33528j;
            int f = C7902g.m43313m(this.f33525g);
            this.f33529k = f;
            this.f33526h = f;
            byte readByte = (byte) (this.f33525g.readByte() & 255);
            this.f33527i = (byte) (this.f33525g.readByte() & 255);
            if (C7902g.f33523a.isLoggable(Level.FINE)) {
                C7902g.f33523a.fine(C7904b.m43320b(true, this.f33528j, this.f33526h, readByte, this.f33527i));
            }
            int readInt = this.f33525g.readInt() & Integer.MAX_VALUE;
            this.f33528j = readInt;
            if (readByte != 9) {
                C7902g.m43305e("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                throw null;
            } else if (readInt != i) {
                C7902g.m43305e("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        public void close() throws IOException {
        }

        public C8622b0 timeout() {
            return this.f33525g.timeout();
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            while (true) {
                int i = this.f33529k;
                if (i == 0) {
                    this.f33525g.mo30715j((long) this.f33530l);
                    this.f33530l = 0;
                    if ((this.f33527i & 4) != 0) {
                        return -1;
                    }
                    m43317c();
                } else {
                    long w0 = this.f33525g.mo29326w0(eVar, Math.min(j, (long) i));
                    if (w0 == -1) {
                        return -1;
                    }
                    this.f33529k = (int) (((long) this.f33529k) - w0);
                    return w0;
                }
            }
        }
    }

    /* renamed from: f.h.b.z.k.g$b */
    /* compiled from: Http2 */
    static final class C7904b {

        /* renamed from: a */
        private static final String[] f33531a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f33532b = new String[64];

        /* renamed from: c */
        private static final String[] f33533c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f33533c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f33532b;
            strArr2[0] = BuildConfig.FLAVOR;
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f33532b;
                strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
            }
            String[] strArr4 = f33532b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f33532b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f33532b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f33533c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C7904b() {
        }

        /* renamed from: a */
        static String m43319a(byte b, byte b2) {
            if (b2 == 0) {
                return BuildConfig.FLAVOR;
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        return "ACK";
                    }
                    return f33533c[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr = f33532b;
                    String str = b2 < strArr.length ? strArr[b2] : f33533c[b2];
                    if (b != 5 || (b2 & 4) == 0) {
                        return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f33533c[b2];
        }

        /* renamed from: b */
        static String m43320b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f33531a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = m43319a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: f.h.b.z.k.g$c */
    /* compiled from: Http2 */
    static final class C7905c implements C7894b {

        /* renamed from: g */
        private final C8637g f33534g;

        /* renamed from: h */
        private final C7903a f33535h;

        /* renamed from: i */
        private final boolean f33536i;

        /* renamed from: j */
        final C7899f.C7900a f33537j;

        C7905c(C8637g gVar, int i, boolean z) {
            this.f33534g = gVar;
            this.f33536i = z;
            C7903a aVar = new C7903a(gVar);
            this.f33535h = aVar;
            this.f33537j = new C7899f.C7900a(i, aVar);
        }

        /* renamed from: E */
        private void m43321E(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            boolean z = false;
            if (i != 8) {
                C7902g.m43305e("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                int readInt = this.f33534g.readInt();
                int readInt2 = this.f33534g.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.mo29364k(z, readInt, readInt2);
            } else {
                C7902g.m43305e("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: H */
        private void m43322H(C7894b.C7895a aVar, int i) throws IOException {
            int readInt = this.f33534g.readInt();
            aVar.mo29369p(i, readInt & Integer.MAX_VALUE, (this.f33534g.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: K */
        private void m43323K(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            if (i != 5) {
                C7902g.m43305e("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                m43322H(aVar, i2);
            } else {
                C7902g.m43305e("TYPE_PRIORITY streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: Q */
        private void m43324Q(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f33534g.readByte() & 255);
                }
                aVar.mo29365l(i2, this.f33534g.readInt() & Integer.MAX_VALUE, m43330p(C7902g.m43312l(i - 4, b, s), s, b, i2));
                return;
            }
            C7902g.m43305e("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }

        /* renamed from: T */
        private void m43325T(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            if (i != 4) {
                C7902g.m43305e("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                int readInt = this.f33534g.readInt();
                C7893a fromHttp2 = C7893a.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    aVar.mo29362f(i2, fromHttp2);
                    return;
                }
                C7902g.m43305e("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt)});
                throw null;
            } else {
                C7902g.m43305e("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: Y */
        private void m43326Y(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            if (i2 != 0) {
                C7902g.m43305e("TYPE_SETTINGS streamId != 0", new Object[0]);
                throw null;
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.mo29366m();
                } else {
                    C7902g.m43305e("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    throw null;
                }
            } else if (i % 6 == 0) {
                C7917m mVar = new C7917m();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f33534g.readShort();
                    int readInt = this.f33534g.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                C7902g.m43305e("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt >= 0) {
                                break;
                            } else {
                                C7902g.m43305e("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            } else {
                                C7902g.m43305e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt)});
                                throw null;
                            }
                            break;
                        default:
                            C7902g.m43305e("PROTOCOL_ERROR invalid settings id: %s", new Object[]{Short.valueOf(readShort)});
                            throw null;
                    }
                    mVar.mo29428k(readShort, 0, readInt);
                }
                aVar.mo29368o(false, mVar);
                if (mVar.mo29421d() >= 0) {
                    this.f33537j.mo29392g(mVar.mo29421d());
                }
            } else {
                C7902g.m43305e("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
        }

        /* renamed from: c */
        private void m43327c(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f33534g.readByte() & 255);
                }
                aVar.mo29367n(z2, i2, this.f33534g, C7902g.m43312l(i, b, s));
                this.f33534g.mo30715j((long) s);
                return;
            }
            C7902g.m43305e("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }

        /* renamed from: d */
        private void m43328d(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            if (i < 8) {
                C7902g.m43305e("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                int readInt = this.f33534g.readInt();
                int readInt2 = this.f33534g.readInt();
                int i3 = i - 8;
                C7893a fromHttp2 = C7893a.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    C8638h hVar = C8638h.EMPTY;
                    if (i3 > 0) {
                        hVar = this.f33534g.mo30719o((long) i3);
                    }
                    aVar.mo29371r(readInt, fromHttp2, hVar);
                    return;
                }
                C7902g.m43305e("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
                throw null;
            } else {
                C7902g.m43305e("TYPE_GOAWAY streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: i0 */
        private void m43329i0(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            if (i == 4) {
                long readInt = ((long) this.f33534g.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.mo29363i(i2, readInt);
                    return;
                }
                C7902g.m43305e("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt)});
                throw null;
            }
            C7902g.m43305e("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
            throw null;
        }

        /* renamed from: p */
        private List<C7897d> m43330p(int i, short s, byte b, int i2) throws IOException {
            C7903a aVar = this.f33535h;
            aVar.f33529k = i;
            aVar.f33526h = i;
            aVar.f33530l = s;
            aVar.f33527i = b;
            aVar.f33528j = i2;
            this.f33537j.mo29394l();
            return this.f33537j.mo29391e();
        }

        /* renamed from: x */
        private void m43331x(C7894b.C7895a aVar, int i, byte b, int i2) throws IOException {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.f33534g.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m43322H(aVar, i2);
                    i -= 5;
                }
                aVar.mo29370q(false, z, i2, -1, m43330p(C7902g.m43312l(i, b, s), s, b, i2), C7898e.HTTP_20_HEADERS);
                return;
            }
            C7902g.m43305e("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }

        public void close() throws IOException {
            this.f33534g.close();
        }

        /* renamed from: h0 */
        public void mo29360h0() throws IOException {
            if (!this.f33536i) {
                C8638h o = this.f33534g.mo30719o((long) C7902g.f33524b.size());
                if (C7902g.f33523a.isLoggable(Level.FINE)) {
                    C7902g.f33523a.fine(String.format("<< CONNECTION %s", new Object[]{o.hex()}));
                }
                if (!C7902g.f33524b.equals(o)) {
                    C7902g.m43305e("Expected a connection header but was %s", new Object[]{o.utf8()});
                    throw null;
                }
            }
        }

        /* renamed from: s0 */
        public boolean mo29361s0(C7894b.C7895a aVar) throws IOException {
            try {
                this.f33534g.mo30668E0(9);
                int f = C7902g.m43313m(this.f33534g);
                if (f < 0 || f > 16384) {
                    C7902g.m43305e("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(f)});
                    throw null;
                }
                byte readByte = (byte) (this.f33534g.readByte() & 255);
                byte readByte2 = (byte) (this.f33534g.readByte() & 255);
                int readInt = this.f33534g.readInt() & Integer.MAX_VALUE;
                if (C7902g.f33523a.isLoggable(Level.FINE)) {
                    C7902g.f33523a.fine(C7904b.m43320b(true, readInt, f, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m43327c(aVar, f, readByte2, readInt);
                        break;
                    case 1:
                        m43331x(aVar, f, readByte2, readInt);
                        break;
                    case 2:
                        m43323K(aVar, f, readByte2, readInt);
                        break;
                    case 3:
                        m43325T(aVar, f, readByte2, readInt);
                        break;
                    case 4:
                        m43326Y(aVar, f, readByte2, readInt);
                        break;
                    case 5:
                        m43324Q(aVar, f, readByte2, readInt);
                        break;
                    case 6:
                        m43321E(aVar, f, readByte2, readInt);
                        break;
                    case 7:
                        m43328d(aVar, f, readByte2, readInt);
                        break;
                    case 8:
                        m43329i0(aVar, f, readByte2, readInt);
                        break;
                    default:
                        this.f33534g.mo30715j((long) f);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: f.h.b.z.k.g$d */
    /* compiled from: Http2 */
    static final class C7906d implements C7896c {

        /* renamed from: g */
        private final C8636f f33538g;

        /* renamed from: h */
        private final boolean f33539h;

        /* renamed from: i */
        private final C8633e f33540i;

        /* renamed from: j */
        private final C7899f.C7901b f33541j;

        /* renamed from: k */
        private int f33542k = 16384;

        /* renamed from: l */
        private boolean f33543l;

        C7906d(C8636f fVar, boolean z) {
            this.f33538g = fVar;
            this.f33539h = z;
            C8633e eVar = new C8633e();
            this.f33540i = eVar;
            this.f33541j = new C7899f.C7901b(eVar);
        }

        /* renamed from: x */
        private void m43334x(int i, long j) throws IOException {
            while (j > 0) {
                int min = (int) Math.min((long) this.f33542k, j);
                long j2 = (long) min;
                j -= j2;
                mo29404d(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f33538g.mo29321b0(this.f33540i, j2);
            }
        }

        /* renamed from: C */
        public synchronized void mo29372C() throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (this.f33539h) {
                if (C7902g.f33523a.isLoggable(Level.FINE)) {
                    C7902g.f33523a.fine(String.format(">> CONNECTION %s", new Object[]{C7902g.f33524b.hex()}));
                }
                this.f33538g.mo30729t0(C7902g.f33524b.toByteArray());
                this.f33538g.flush();
            }
        }

        /* renamed from: C0 */
        public int mo29373C0() {
            return this.f33542k;
        }

        /* renamed from: D0 */
        public synchronized void mo29374D0(boolean z, boolean z2, int i, int i2, List<C7897d> list) throws IOException {
            if (!z2) {
                try {
                    if (!this.f33543l) {
                        mo29405p(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: F */
        public synchronized void mo29375F(boolean z, int i, C8633e eVar, int i2) throws IOException {
            if (!this.f33543l) {
                byte b = 0;
                if (z) {
                    b = (byte) 1;
                }
                mo29402c(i, b, eVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: G */
        public synchronized void mo29376G(C7917m mVar) throws IOException {
            if (!this.f33543l) {
                this.f33542k = mVar.mo29423f(this.f33542k);
                mo29404d(0, 0, (byte) 4, (byte) 1);
                this.f33538g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: O */
        public synchronized void mo29377O(int i, C7893a aVar, byte[] bArr) throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (aVar.httpCode != -1) {
                mo29404d(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f33538g.mo30733w(i);
                this.f33538g.mo30733w(aVar.httpCode);
                if (bArr.length > 0) {
                    this.f33538g.mo30729t0(bArr);
                }
                this.f33538g.flush();
            } else {
                C7902g.m43308h("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo29402c(int i, byte b, C8633e eVar, int i2) throws IOException {
            mo29404d(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f33538g.mo29321b0(eVar, (long) i2);
            }
        }

        public synchronized void close() throws IOException {
            this.f33543l = true;
            this.f33538g.close();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo29404d(int i, int i2, byte b, byte b2) throws IOException {
            if (C7902g.f33523a.isLoggable(Level.FINE)) {
                C7902g.f33523a.fine(C7904b.m43320b(false, i, i2, b, b2));
            }
            int i3 = this.f33542k;
            if (i2 > i3) {
                C7902g.m43308h("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
                throw null;
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C7902g.m43314n(this.f33538g, i2);
                this.f33538g.mo30666B(b & 255);
                this.f33538g.mo30666B(b2 & 255);
                this.f33538g.mo30733w(i & Integer.MAX_VALUE);
            } else {
                C7902g.m43308h("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
        }

        /* renamed from: f */
        public synchronized void mo29378f(int i, C7893a aVar) throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (aVar.spdyRstCode != -1) {
                mo29404d(i, 4, (byte) 3, (byte) 0);
                this.f33538g.mo30733w(aVar.httpCode);
                this.f33538g.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f33543l) {
                this.f33538g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: i */
        public synchronized void mo29380i(int i, long j) throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                C7902g.m43308h("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
                throw null;
            } else {
                mo29404d(i, 4, (byte) 8, (byte) 0);
                this.f33538g.mo30733w((int) j);
                this.f33538g.flush();
            }
        }

        /* renamed from: k */
        public synchronized void mo29381k(boolean z, int i, int i2) throws IOException {
            if (!this.f33543l) {
                mo29404d(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f33538g.mo30733w(i);
                this.f33538g.mo30733w(i2);
                this.f33538g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: l */
        public synchronized void mo29382l(int i, int i2, List<C7897d> list) throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (this.f33540i.mo30688U0() == 0) {
                this.f33541j.mo29397b(list);
                long U0 = this.f33540i.mo30688U0();
                int min = (int) Math.min((long) (this.f33542k - 4), U0);
                long j = (long) min;
                int i3 = (U0 > j ? 1 : (U0 == j ? 0 : -1));
                mo29404d(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
                this.f33538g.mo30733w(i2 & Integer.MAX_VALUE);
                this.f33538g.mo29321b0(this.f33540i, j);
                if (i3 > 0) {
                    m43334x(i, U0 - j);
                }
            } else {
                throw new IllegalStateException();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo29405p(boolean z, int i, List<C7897d> list) throws IOException {
            if (this.f33543l) {
                throw new IOException("closed");
            } else if (this.f33540i.mo30688U0() == 0) {
                this.f33541j.mo29397b(list);
                long U0 = this.f33540i.mo30688U0();
                int min = (int) Math.min((long) this.f33542k, U0);
                long j = (long) min;
                int i2 = (U0 > j ? 1 : (U0 == j ? 0 : -1));
                byte b = i2 == 0 ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo29404d(i, min, (byte) 1, b);
                this.f33538g.mo29321b0(this.f33540i, j);
                if (i2 > 0) {
                    m43334x(i, U0 - j);
                }
            } else {
                throw new IllegalStateException();
            }
        }

        /* renamed from: y0 */
        public synchronized void mo29383y0(C7917m mVar) throws IOException {
            if (!this.f33543l) {
                int i = 0;
                mo29404d(0, mVar.mo29429l() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (mVar.mo29425h(i)) {
                        this.f33538g.mo30728t(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f33538g.mo30733w(mVar.mo29420c(i));
                    }
                    i++;
                }
                this.f33538g.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ IOException m43305e(String str, Object[] objArr) throws IOException {
        m43311k(str, objArr);
        throw null;
    }

    /* renamed from: h */
    static /* synthetic */ IllegalArgumentException m43308h(String str, Object[] objArr) {
        m43310j(str, objArr);
        throw null;
    }

    /* renamed from: j */
    private static IllegalArgumentException m43310j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: k */
    private static IOException m43311k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m43312l(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        m43311k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m43313m(C8637g gVar) throws IOException {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m43314n(C8636f fVar, int i) throws IOException {
        fVar.mo30666B((i >>> 16) & 255);
        fVar.mo30666B((i >>> 8) & 255);
        fVar.mo30666B(i & 255);
    }

    /* renamed from: a */
    public C7894b mo29399a(C8637g gVar, boolean z) {
        return new C7905c(gVar, 4096, z);
    }

    /* renamed from: b */
    public C7896c mo29400b(C8636f fVar, boolean z) {
        return new C7906d(fVar, z);
    }
}
