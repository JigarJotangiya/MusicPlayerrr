package p159f.p334h.p337b.p338z.p339j;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.C7818i;
import p159f.p334h.p337b.C7819j;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.p338z.C7848a;
import p159f.p334h.p337b.p338z.C7859h;
import p394k.C8620a0;
import p394k.C8622b0;
import p394k.C8633e;
import p394k.C8636f;
import p394k.C8637g;
import p394k.C8645n;
import p394k.C8659y;

/* renamed from: f.h.b.z.j.e */
/* compiled from: HttpConnection */
public final class C7868e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7819j f33410a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7818i f33411b;

    /* renamed from: c */
    private final Socket f33412c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8637g f33413d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C8636f f33414e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f33415f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f33416g = 0;

    /* renamed from: f.h.b.z.j.e$b */
    /* compiled from: HttpConnection */
    private abstract class C7870b implements C8620a0 {

        /* renamed from: g */
        protected boolean f33417g;

        private C7870b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo29318c(boolean z) throws IOException {
            if (C7868e.this.f33415f == 5) {
                int unused = C7868e.this.f33415f = 0;
                if (z && C7868e.this.f33416g == 1) {
                    int unused2 = C7868e.this.f33416g = 0;
                    C7848a.f33368b.mo29208h(C7868e.this.f33410a, C7868e.this.f33411b);
                } else if (C7868e.this.f33416g == 2) {
                    int unused3 = C7868e.this.f33415f = 6;
                    C7868e.this.f33411b.mo29117h().close();
                }
            } else {
                throw new IllegalStateException("state: " + C7868e.this.f33415f);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo29319d() {
            C7859h.m43080d(C7868e.this.f33411b.mo29117h());
            int unused = C7868e.this.f33415f = 6;
        }

        public C8622b0 timeout() {
            return C7868e.this.f33413d.timeout();
        }
    }

    /* renamed from: f.h.b.z.j.e$c */
    /* compiled from: HttpConnection */
    private final class C7871c implements C8659y {

        /* renamed from: g */
        private boolean f33419g;

        private C7871c() {
        }

        /* renamed from: b0 */
        public void mo29321b0(C8633e eVar, long j) throws IOException {
            if (this.f33419g) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C7868e.this.f33414e.mo30706f0(j);
                C7868e.this.f33414e.mo30687U("\r\n");
                C7868e.this.f33414e.mo29321b0(eVar, j);
                C7868e.this.f33414e.mo30687U("\r\n");
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f33419g) {
                this.f33419g = true;
                C7868e.this.f33414e.mo30687U("0\r\n\r\n");
                int unused = C7868e.this.f33415f = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f33419g) {
                C7868e.this.f33414e.flush();
            }
        }

        public C8622b0 timeout() {
            return C7868e.this.f33414e.timeout();
        }
    }

    /* renamed from: f.h.b.z.j.e$d */
    /* compiled from: HttpConnection */
    private class C7872d extends C7870b {

        /* renamed from: i */
        private long f33421i = -1;

        /* renamed from: j */
        private boolean f33422j = true;

        /* renamed from: k */
        private final C7878g f33423k;

        C7872d(C7878g gVar) throws IOException {
            super();
            this.f33423k = gVar;
        }

        /* renamed from: p */
        private void m43136p() throws IOException {
            if (this.f33421i != -1) {
                C7868e.this.f33413d.mo30716l0();
            }
            try {
                this.f33421i = C7868e.this.f33413d.mo30676K0();
                String trim = C7868e.this.f33413d.mo30716l0().trim();
                if (this.f33421i < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f33421i + trim + "\"");
                } else if (this.f33421i == 0) {
                    this.f33422j = false;
                    C7827o.C7829b bVar = new C7827o.C7829b();
                    C7868e.this.mo29313t(bVar);
                    this.f33423k.mo29341y(bVar.mo29165e());
                    mo29318c(true);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f33417g) {
                if (this.f33422j && !C7859h.m43081e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo29319d();
                }
                this.f33417g = true;
            }
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f33417g) {
                throw new IllegalStateException("closed");
            } else if (!this.f33422j) {
                return -1;
            } else {
                long j2 = this.f33421i;
                if (j2 == 0 || j2 == -1) {
                    m43136p();
                    if (!this.f33422j) {
                        return -1;
                    }
                }
                long w0 = C7868e.this.f33413d.mo29326w0(eVar, Math.min(j, this.f33421i));
                if (w0 != -1) {
                    this.f33421i -= w0;
                    return w0;
                }
                mo29319d();
                throw new IOException("unexpected end of stream");
            }
        }
    }

    /* renamed from: f.h.b.z.j.e$e */
    /* compiled from: HttpConnection */
    private final class C7873e implements C8659y {

        /* renamed from: g */
        private boolean f33425g;

        /* renamed from: h */
        private long f33426h;

        /* renamed from: b0 */
        public void mo29321b0(C8633e eVar, long j) throws IOException {
            if (!this.f33425g) {
                C7859h.m43077a(eVar.mo30688U0(), 0, j);
                if (j <= this.f33426h) {
                    C7868e.this.f33414e.mo29321b0(eVar, j);
                    this.f33426h -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f33426h + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.f33425g) {
                this.f33425g = true;
                if (this.f33426h <= 0) {
                    int unused = C7868e.this.f33415f = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() throws IOException {
            if (!this.f33425g) {
                C7868e.this.f33414e.flush();
            }
        }

        public C8622b0 timeout() {
            return C7868e.this.f33414e.timeout();
        }

        private C7873e(long j) {
            this.f33426h = j;
        }
    }

    /* renamed from: f.h.b.z.j.e$f */
    /* compiled from: HttpConnection */
    private class C7874f extends C7870b {

        /* renamed from: i */
        private long f33428i;

        public C7874f(long j) throws IOException {
            super();
            this.f33428i = j;
            if (j == 0) {
                mo29318c(true);
            }
        }

        public void close() throws IOException {
            if (!this.f33417g) {
                if (this.f33428i != 0 && !C7859h.m43081e(this, 100, TimeUnit.MILLISECONDS)) {
                    mo29319d();
                }
                this.f33417g = true;
            }
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f33417g) {
                throw new IllegalStateException("closed");
            } else if (this.f33428i == 0) {
                return -1;
            } else {
                long w0 = C7868e.this.f33413d.mo29326w0(eVar, Math.min(this.f33428i, j));
                if (w0 != -1) {
                    long j2 = this.f33428i - w0;
                    this.f33428i = j2;
                    if (j2 == 0) {
                        mo29318c(true);
                    }
                    return w0;
                }
                mo29319d();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* renamed from: f.h.b.z.j.e$g */
    /* compiled from: HttpConnection */
    private class C7875g extends C7870b {

        /* renamed from: i */
        private boolean f33430i;

        private C7875g() {
            super();
        }

        public void close() throws IOException {
            if (!this.f33417g) {
                if (!this.f33430i) {
                    mo29319d();
                }
                this.f33417g = true;
            }
        }

        /* renamed from: w0 */
        public long mo29326w0(C8633e eVar, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f33417g) {
                throw new IllegalStateException("closed");
            } else if (this.f33430i) {
                return -1;
            } else {
                long w0 = C7868e.this.f33413d.mo29326w0(eVar, j);
                if (w0 != -1) {
                    return w0;
                }
                this.f33430i = true;
                mo29318c(false);
                return -1;
            }
        }
    }

    public C7868e(C7819j jVar, C7818i iVar, Socket socket) throws IOException {
        this.f33410a = jVar;
        this.f33411b = iVar;
        this.f33412c = socket;
        this.f33413d = C8645n.m46985b(C8645n.m46990g(socket));
        this.f33414e = C8645n.m46984a(C8645n.m46987d(socket));
    }

    /* renamed from: i */
    public long mo29302i() {
        return this.f33413d.mo30702e().mo30688U0();
    }

    /* renamed from: j */
    public void mo29303j() throws IOException {
        this.f33416g = 2;
        if (this.f33415f == 0) {
            this.f33415f = 6;
            this.f33411b.mo29117h().close();
        }
    }

    /* renamed from: k */
    public void mo29304k() throws IOException {
        this.f33414e.flush();
    }

    /* renamed from: l */
    public boolean mo29305l() {
        return this.f33415f == 6;
    }

    /* renamed from: m */
    public boolean mo29306m() {
        int soTimeout;
        try {
            soTimeout = this.f33412c.getSoTimeout();
            this.f33412c.setSoTimeout(1);
            if (this.f33413d.mo30664A()) {
                this.f33412c.setSoTimeout(soTimeout);
                return false;
            }
            this.f33412c.setSoTimeout(soTimeout);
            return true;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            this.f33412c.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: n */
    public C8659y mo29307n() {
        if (this.f33415f == 1) {
            this.f33415f = 2;
            return new C7871c();
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: o */
    public C8620a0 mo29308o(C7878g gVar) throws IOException {
        if (this.f33415f == 4) {
            this.f33415f = 5;
            return new C7872d(gVar);
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: p */
    public C8659y mo29309p(long j) {
        if (this.f33415f == 1) {
            this.f33415f = 2;
            return new C7873e(j);
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: q */
    public C8620a0 mo29310q(long j) throws IOException {
        if (this.f33415f == 4) {
            this.f33415f = 5;
            return new C7874f(j);
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: r */
    public C8620a0 mo29311r() throws IOException {
        if (this.f33415f == 4) {
            this.f33415f = 5;
            return new C7875g();
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: s */
    public void mo29312s() {
        this.f33416g = 1;
        if (this.f33415f == 0) {
            this.f33416g = 0;
            C7848a.f33368b.mo29208h(this.f33410a, this.f33411b);
        }
    }

    /* renamed from: t */
    public void mo29313t(C7827o.C7829b bVar) throws IOException {
        while (true) {
            String l0 = this.f33413d.mo30716l0();
            if (l0.length() != 0) {
                C7848a.f33368b.mo29201a(bVar, l0);
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public C7842v.C7844b mo29314u() throws IOException {
        C7891p a;
        C7842v.C7844b bVar;
        int i = this.f33415f;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = C7891p.m43245a(this.f33413d.mo30716l0());
                    bVar = new C7842v.C7844b();
                    bVar.mo29259x(a.f33497a);
                    bVar.mo29252q(a.f33498b);
                    bVar.mo29256u(a.f33499c);
                    C7827o.C7829b bVar2 = new C7827o.C7829b();
                    mo29313t(bVar2);
                    bVar2.mo29163b(C7884j.f33470e, a.f33497a.toString());
                    bVar.mo29255t(bVar2.mo29165e());
                } catch (EOFException e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f33411b + " (recycle count=" + C7848a.f33368b.mo29209i(this.f33411b) + ")");
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f33498b == 100);
            this.f33415f = 4;
            return bVar;
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: v */
    public void mo29315v(int i, int i2) {
        if (i != 0) {
            this.f33413d.timeout().mo30650f((long) i, TimeUnit.MILLISECONDS);
        }
        if (i2 != 0) {
            this.f33414e.timeout().mo30650f((long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: w */
    public void mo29316w(C7827o oVar, String str) throws IOException {
        if (this.f33415f == 0) {
            this.f33414e.mo30687U(str).mo30687U("\r\n");
            int f = oVar.mo29160f();
            for (int i = 0; i < f; i++) {
                this.f33414e.mo30687U(oVar.mo29158d(i)).mo30687U(": ").mo30687U(oVar.mo29161g(i)).mo30687U("\r\n");
            }
            this.f33414e.mo30687U("\r\n");
            this.f33415f = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }

    /* renamed from: x */
    public void mo29317x(C7888m mVar) throws IOException {
        if (this.f33415f == 1) {
            this.f33415f = 3;
            mVar.mo29355d(this.f33414e);
            return;
        }
        throw new IllegalStateException("state: " + this.f33415f);
    }
}
