package p159f.p334h.p337b.p338z.p340k;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p340k.C7894b;
import p394k.C8633e;
import p394k.C8636f;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8640i;
import p394k.C8645n;
import p394k.C8659y;

/* renamed from: f.h.b.z.k.n */
/* compiled from: Spdy3 */
public final class C7918n implements C7938q {

    /* renamed from: a */
    static final byte[] f33564a;

    /* renamed from: f.h.b.z.k.n$a */
    /* compiled from: Spdy3 */
    static final class C7919a implements C7894b {

        /* renamed from: g */
        private final C8637g f33565g;

        /* renamed from: h */
        private final boolean f33566h;

        /* renamed from: i */
        private final C7911j f33567i;

        C7919a(C8637g gVar, boolean z) {
            this.f33565g = gVar;
            this.f33567i = new C7911j(gVar);
            this.f33566h = z;
        }

        /* renamed from: E */
        private void m43390E(C7894b.C7895a aVar, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.f33565g.readInt() & Integer.MAX_VALUE;
                int readInt2 = this.f33565g.readInt();
                C7893a fromSpdy3Rst = C7893a.fromSpdy3Rst(readInt2);
                if (fromSpdy3Rst != null) {
                    aVar.mo29362f(readInt, fromSpdy3Rst);
                    return;
                }
                m43395c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            m43395c("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: H */
        private void m43391H(C7894b.C7895a aVar, int i, int i2) throws IOException {
            int readInt = this.f33565g.readInt();
            boolean z = false;
            if (i2 == (readInt * 8) + 4) {
                C7917m mVar = new C7917m();
                for (int i3 = 0; i3 < readInt; i3++) {
                    int readInt2 = this.f33565g.readInt();
                    int i4 = (-16777216 & readInt2) >>> 24;
                    mVar.mo29428k(readInt2 & 16777215, i4, this.f33565g.readInt());
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                aVar.mo29368o(z, mVar);
                return;
            }
            m43395c("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(readInt));
            throw null;
        }

        /* renamed from: K */
        private void m43392K(C7894b.C7895a aVar, int i, int i2) throws IOException {
            aVar.mo29370q(false, (i & 1) != 0, this.f33565g.readInt() & Integer.MAX_VALUE, -1, this.f33567i.mo29409f(i2 - 4), C7898e.SPDY_REPLY);
        }

        /* renamed from: Q */
        private void m43393Q(C7894b.C7895a aVar, int i, int i2) throws IOException {
            int readInt = this.f33565g.readInt() & Integer.MAX_VALUE;
            int readInt2 = this.f33565g.readInt() & Integer.MAX_VALUE;
            this.f33565g.readShort();
            List<C7897d> f = this.f33567i.mo29409f(i2 - 10);
            aVar.mo29370q((i & 2) != 0, (i & 1) != 0, readInt, readInt2, f, C7898e.SPDY_SYN_STREAM);
        }

        /* renamed from: T */
        private void m43394T(C7894b.C7895a aVar, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.f33565g.readInt() & Integer.MAX_VALUE;
                long readInt2 = (long) (this.f33565g.readInt() & Integer.MAX_VALUE);
                if (readInt2 != 0) {
                    aVar.mo29363i(readInt, readInt2);
                    return;
                }
                m43395c("windowSizeIncrement was 0", Long.valueOf(readInt2));
                throw null;
            }
            m43395c("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: c */
        private static IOException m43395c(String str, Object... objArr) throws IOException {
            throw new IOException(String.format(str, objArr));
        }

        /* renamed from: d */
        private void m43396d(C7894b.C7895a aVar, int i, int i2) throws IOException {
            if (i2 == 8) {
                int readInt = this.f33565g.readInt() & Integer.MAX_VALUE;
                int readInt2 = this.f33565g.readInt();
                C7893a fromSpdyGoAway = C7893a.fromSpdyGoAway(readInt2);
                if (fromSpdyGoAway != null) {
                    aVar.mo29371r(readInt, fromSpdyGoAway, C8638h.EMPTY);
                    return;
                }
                m43395c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            m43395c("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: p */
        private void m43397p(C7894b.C7895a aVar, int i, int i2) throws IOException {
            aVar.mo29370q(false, false, this.f33565g.readInt() & Integer.MAX_VALUE, -1, this.f33567i.mo29409f(i2 - 4), C7898e.SPDY_HEADERS);
        }

        /* renamed from: x */
        private void m43398x(C7894b.C7895a aVar, int i, int i2) throws IOException {
            boolean z = true;
            if (i2 == 4) {
                int readInt = this.f33565g.readInt();
                if (this.f33566h != ((readInt & 1) == 1)) {
                    z = false;
                }
                aVar.mo29364k(z, readInt, 0);
                return;
            }
            m43395c("TYPE_PING length: %d != 4", Integer.valueOf(i2));
            throw null;
        }

        public void close() throws IOException {
            this.f33567i.mo29408c();
        }

        /* renamed from: h0 */
        public void mo29360h0() {
        }

        /* renamed from: s0 */
        public boolean mo29361s0(C7894b.C7895a aVar) throws IOException {
            boolean z = false;
            try {
                int readInt = this.f33565g.readInt();
                int readInt2 = this.f33565g.readInt();
                int i = (-16777216 & readInt2) >>> 24;
                int i2 = readInt2 & 16777215;
                if ((Integer.MIN_VALUE & readInt) != 0) {
                    int i3 = (2147418112 & readInt) >>> 16;
                    int i4 = readInt & 65535;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                m43393Q(aVar, i, i2);
                                return true;
                            case 2:
                                m43392K(aVar, i, i2);
                                return true;
                            case 3:
                                m43390E(aVar, i, i2);
                                return true;
                            case 4:
                                m43391H(aVar, i, i2);
                                return true;
                            case 6:
                                m43398x(aVar, i, i2);
                                return true;
                            case 7:
                                m43396d(aVar, i, i2);
                                return true;
                            case 8:
                                m43397p(aVar, i, i2);
                                return true;
                            case 9:
                                m43394T(aVar, i, i2);
                                return true;
                            default:
                                this.f33565g.mo30715j((long) i2);
                                return true;
                        }
                    } else {
                        throw new ProtocolException("version != 3: " + i3);
                    }
                } else {
                    int i5 = readInt & Integer.MAX_VALUE;
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    aVar.mo29367n(z, i5, this.f33565g, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* renamed from: f.h.b.z.k.n$b */
    /* compiled from: Spdy3 */
    static final class C7920b implements C7896c {

        /* renamed from: g */
        private final C8636f f33568g;

        /* renamed from: h */
        private final C8633e f33569h;

        /* renamed from: i */
        private final C8636f f33570i;

        /* renamed from: j */
        private final boolean f33571j;

        /* renamed from: k */
        private boolean f33572k;

        C7920b(C8636f fVar, boolean z) {
            this.f33568g = fVar;
            this.f33571j = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C7918n.f33564a);
            C8633e eVar = new C8633e();
            this.f33569h = eVar;
            this.f33570i = C8645n.m46984a(new C8640i((C8659y) eVar, deflater));
        }

        /* renamed from: d */
        private void m43401d(List<C7897d> list) throws IOException {
            if (this.f33569h.mo30688U0() == 0) {
                this.f33570i.mo30733w(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C8638h hVar = list.get(i).f33508a;
                    this.f33570i.mo30733w(hVar.size());
                    this.f33570i.mo30731u0(hVar);
                    C8638h hVar2 = list.get(i).f33509b;
                    this.f33570i.mo30733w(hVar2.size());
                    this.f33570i.mo30731u0(hVar2);
                }
                this.f33570i.flush();
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: C */
        public synchronized void mo29372C() {
        }

        /* renamed from: C0 */
        public int mo29373C0() {
            return 16383;
        }

        /* renamed from: D0 */
        public synchronized void mo29374D0(boolean z, boolean z2, int i, int i2, List<C7897d> list) throws IOException {
            if (!this.f33572k) {
                m43401d(list);
                int U0 = (int) (this.f33569h.mo30688U0() + 10);
                boolean z3 = z | (z2 ? (char) 2 : 0);
                this.f33568g.mo30733w(-2147287039);
                this.f33568g.mo30733w(((z3 & true ? 1 : 0) << true) | (U0 & 16777215));
                this.f33568g.mo30733w(i & Integer.MAX_VALUE);
                this.f33568g.mo30733w(Integer.MAX_VALUE & i2);
                this.f33568g.mo30728t(0);
                this.f33568g.mo30703e0(this.f33569h);
                this.f33568g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: F */
        public synchronized void mo29375F(boolean z, int i, C8633e eVar, int i2) throws IOException {
            mo29431c(i, z ? 1 : 0, eVar, i2);
        }

        /* renamed from: G */
        public void mo29376G(C7917m mVar) {
        }

        /* renamed from: O */
        public synchronized void mo29377O(int i, C7893a aVar, byte[] bArr) throws IOException {
            if (this.f33572k) {
                throw new IOException("closed");
            } else if (aVar.spdyGoAwayCode != -1) {
                this.f33568g.mo30733w(-2147287033);
                this.f33568g.mo30733w(8);
                this.f33568g.mo30733w(i);
                this.f33568g.mo30733w(aVar.spdyGoAwayCode);
                this.f33568g.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo29431c(int i, int i2, C8633e eVar, int i3) throws IOException {
            if (!this.f33572k) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.f33568g.mo30733w(i & Integer.MAX_VALUE);
                    this.f33568g.mo30733w(((i2 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.f33568g.mo29321b0(eVar, j);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i3);
            }
            throw new IOException("closed");
        }

        public synchronized void close() throws IOException {
            this.f33572k = true;
            C7859h.m43078b(this.f33568g, this.f33570i);
        }

        /* renamed from: f */
        public synchronized void mo29378f(int i, C7893a aVar) throws IOException {
            if (this.f33572k) {
                throw new IOException("closed");
            } else if (aVar.spdyRstCode != -1) {
                this.f33568g.mo30733w(-2147287037);
                this.f33568g.mo30733w(8);
                this.f33568g.mo30733w(i & Integer.MAX_VALUE);
                this.f33568g.mo30733w(aVar.spdyRstCode);
                this.f33568g.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f33572k) {
                this.f33568g.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: i */
        public synchronized void mo29380i(int i, long j) throws IOException {
            if (this.f33572k) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            } else {
                this.f33568g.mo30733w(-2147287031);
                this.f33568g.mo30733w(8);
                this.f33568g.mo30733w(i);
                this.f33568g.mo30733w((int) j);
                this.f33568g.flush();
            }
        }

        /* renamed from: k */
        public synchronized void mo29381k(boolean z, int i, int i2) throws IOException {
            if (!this.f33572k) {
                boolean z2 = false;
                if (this.f33571j != ((i & 1) == 1)) {
                    z2 = true;
                }
                if (z == z2) {
                    this.f33568g.mo30733w(-2147287034);
                    this.f33568g.mo30733w(4);
                    this.f33568g.mo30733w(i);
                    this.f33568g.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: l */
        public void mo29382l(int i, int i2, List<C7897d> list) throws IOException {
        }

        /* renamed from: y0 */
        public synchronized void mo29383y0(C7917m mVar) throws IOException {
            if (!this.f33572k) {
                int l = mVar.mo29429l();
                this.f33568g.mo30733w(-2147287036);
                this.f33568g.mo30733w((((l * 8) + 4) & 16777215) | 0);
                this.f33568g.mo30733w(l);
                for (int i = 0; i <= 10; i++) {
                    if (mVar.mo29425h(i)) {
                        this.f33568g.mo30733w(((mVar.mo29419b(i) & 255) << 24) | (i & 16777215));
                        this.f33568g.mo30733w(mVar.mo29420c(i));
                    }
                }
                this.f33568g.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    static {
        try {
            f33564a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C7859h.f33392c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C7894b mo29399a(C8637g gVar, boolean z) {
        return new C7919a(gVar, z);
    }

    /* renamed from: b */
    public C7896c mo29400b(C8636f fVar, boolean z) {
        return new C7920b(fVar, z);
    }
}
