package p159f.p334h.p337b;

import java.io.IOException;
import java.net.ProtocolException;
import p159f.p334h.p337b.C7830p;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.p338z.p339j.C7878g;
import p159f.p334h.p337b.p338z.p339j.C7888m;
import p159f.p334h.p337b.p338z.p339j.C7889n;
import p394k.C8659y;

/* renamed from: f.h.b.e */
/* compiled from: Call */
public class C7811e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7833r f33239a;

    /* renamed from: b */
    private boolean f33240b;

    /* renamed from: c */
    volatile boolean f33241c;

    /* renamed from: d */
    C7836t f33242d;

    /* renamed from: e */
    C7878g f33243e;

    /* renamed from: f.h.b.e$a */
    /* compiled from: Call */
    class C7812a implements C7830p.C7831a {

        /* renamed from: a */
        private final int f33244a;

        /* renamed from: b */
        private final boolean f33245b;

        C7812a(int i, C7836t tVar, boolean z) {
            this.f33244a = i;
            this.f33245b = z;
        }

        /* renamed from: a */
        public C7842v mo29102a(C7836t tVar) throws IOException {
            if (this.f33244a >= C7811e.this.f33239a.mo29200z().size()) {
                return C7811e.this.mo29101c(tVar, this.f33245b);
            }
            C7811e eVar = C7811e.this;
            return eVar.f33239a.mo29200z().get(this.f33244a).mo29168a(new C7812a(this.f33244a + 1, tVar, this.f33245b));
        }
    }

    protected C7811e(C7833r rVar, C7836t tVar) {
        this.f33239a = rVar.mo29180c();
        this.f33242d = tVar;
    }

    /* renamed from: d */
    private C7842v m42816d(boolean z) throws IOException {
        C7836t tVar = this.f33242d;
        return new C7812a(0, tVar, z).mo29102a(tVar);
    }

    /* renamed from: b */
    public C7842v mo29100b() throws IOException {
        synchronized (this) {
            if (!this.f33240b) {
                this.f33240b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        try {
            this.f33239a.mo29188l().mo29150a(this);
            C7842v d = m42816d(false);
            if (d != null) {
                return d;
            }
            throw new IOException("Canceled");
        } finally {
            this.f33239a.mo29188l().mo29151b(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7842v mo29101c(C7836t tVar, boolean z) throws IOException {
        C7839u g = tVar.mo29214g();
        if (g != null) {
            C7836t.C7838b m = tVar.mo29220m();
            C7832q contentType = g.contentType();
            if (contentType != null) {
                m.mo29227i("Content-Type", contentType.toString());
            }
            long contentLength = g.contentLength();
            if (contentLength != -1) {
                m.mo29227i("Content-Length", Long.toString(contentLength));
                m.mo29229k("Transfer-Encoding");
            } else {
                m.mo29227i("Transfer-Encoding", "chunked");
                m.mo29229k("Content-Length");
            }
            tVar = m.mo29226h();
        }
        this.f33243e = new C7878g(this.f33239a, tVar, false, false, z, (C7818i) null, (C7889n) null, (C7888m) null, (C7842v) null);
        int i = 0;
        while (!this.f33241c) {
            try {
                this.f33243e.mo29331C();
                this.f33243e.mo29340x();
                C7842v n = this.f33243e.mo29337n();
                C7836t k = this.f33243e.mo29334k();
                if (k == null) {
                    if (!z) {
                        this.f33243e.mo29329A();
                    }
                    return n;
                }
                i++;
                if (i <= 20) {
                    if (!this.f33243e.mo29330B(k.mo29222o())) {
                        this.f33243e.mo29329A();
                    }
                    this.f33243e = new C7878g(this.f33239a, k, false, false, z, this.f33243e.mo29333e(), (C7889n) null, (C7888m) null, n);
                } else {
                    throw new ProtocolException("Too many follow-up requests: " + i);
                }
            } catch (IOException e) {
                C7878g z2 = this.f33243e.mo29342z(e, (C8659y) null);
                if (z2 != null) {
                    this.f33243e = z2;
                } else {
                    throw e;
                }
            }
        }
        this.f33243e.mo29329A();
        return null;
    }
}
