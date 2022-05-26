package p394k;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.t */
/* compiled from: RealBufferedSink.kt */
public final class C8652t implements C8636f {

    /* renamed from: g */
    public final C8633e f35004g = new C8633e();

    /* renamed from: h */
    public boolean f35005h;

    /* renamed from: i */
    public final C8659y f35006i;

    public C8652t(C8659y yVar) {
        C8594l.m46771e(yVar, "sink");
        this.f35006i = yVar;
    }

    /* renamed from: B */
    public C8636f mo30666B(int i) {
        if (!this.f35005h) {
            this.f35004g.mo30696b1(i);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: J */
    public C8636f mo30673J() {
        if (!this.f35005h) {
            long H = this.f35004g.mo30670H();
            if (H > 0) {
                this.f35006i.mo29321b0(this.f35004g, H);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: J0 */
    public OutputStream mo30674J0() {
        return new C8653a(this);
    }

    /* renamed from: U */
    public C8636f mo30687U(String str) {
        C8594l.m46771e(str, "string");
        if (!this.f35005h) {
            this.f35004g.mo30707f1(str);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: Z */
    public C8636f mo30693Z(byte[] bArr, int i, int i2) {
        C8594l.m46771e(bArr, "source");
        if (!this.f35005h) {
            this.f35004g.mo30695a1(bArr, i, i2);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b0 */
    public void mo29321b0(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "source");
        if (!this.f35005h) {
            this.f35004g.mo29321b0(eVar, j);
            mo30673J();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f35005h) {
            Throwable th = null;
            try {
                if (this.f35004g.mo30688U0() > 0) {
                    C8659y yVar = this.f35006i;
                    C8633e eVar = this.f35004g;
                    yVar.mo29321b0(eVar, eVar.mo30688U0());
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f35006i.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f35005h = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d0 */
    public C8636f mo30700d0(String str, int i, int i2) {
        C8594l.m46771e(str, "string");
        if (!this.f35005h) {
            this.f35004g.mo30709g1(str, i, i2);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: e */
    public C8633e mo30702e() {
        return this.f35004g;
    }

    /* renamed from: e0 */
    public long mo30703e0(C8620a0 a0Var) {
        C8594l.m46771e(a0Var, "source");
        long j = 0;
        while (true) {
            long w0 = a0Var.mo29326w0(this.f35004g, (long) 8192);
            if (w0 == -1) {
                return j;
            }
            j += w0;
            mo30673J();
        }
    }

    /* renamed from: f0 */
    public C8636f mo30706f0(long j) {
        if (!this.f35005h) {
            this.f35004g.mo30698c1(j);
            return mo30673J();
        }
        throw new IllegalStateException("closed".toString());
    }

    public void flush() {
        if (!this.f35005h) {
            if (this.f35004g.mo30688U0() > 0) {
                C8659y yVar = this.f35006i;
                C8633e eVar = this.f35004g;
                yVar.mo29321b0(eVar, eVar.mo30688U0());
            }
            this.f35006i.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: h */
    public C8633e mo30710h() {
        return this.f35004g;
    }

    public boolean isOpen() {
        return !this.f35005h;
    }

    /* renamed from: s */
    public C8636f mo30727s() {
        if (!this.f35005h) {
            long U0 = this.f35004g.mo30688U0();
            if (U0 > 0) {
                this.f35006i.mo29321b0(this.f35004g, U0);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t */
    public C8636f mo30728t(int i) {
        if (!this.f35005h) {
            this.f35004g.mo30704e1(i);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: t0 */
    public C8636f mo30729t0(byte[] bArr) {
        C8594l.m46771e(bArr, "source");
        if (!this.f35005h) {
            this.f35004g.mo30694Z0(bArr);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C8622b0 timeout() {
        return this.f35006i.timeout();
    }

    public String toString() {
        return "buffer(" + this.f35006i + ')';
    }

    /* renamed from: u0 */
    public C8636f mo30731u0(C8638h hVar) {
        C8594l.m46771e(hVar, "byteString");
        if (!this.f35005h) {
            this.f35004g.mo30692Y0(hVar);
            mo30673J();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: w */
    public C8636f mo30733w(int i) {
        if (!this.f35005h) {
            this.f35004g.mo30701d1(i);
            return mo30673J();
        }
        throw new IllegalStateException("closed".toString());
    }

    public int write(ByteBuffer byteBuffer) {
        C8594l.m46771e(byteBuffer, "source");
        if (!this.f35005h) {
            int write = this.f35004g.write(byteBuffer);
            mo30673J();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: k.t$a */
    /* compiled from: RealBufferedSink.kt */
    public static final class C8653a extends OutputStream {

        /* renamed from: g */
        final /* synthetic */ C8652t f35007g;

        C8653a(C8652t tVar) {
            this.f35007g = tVar;
        }

        public void close() {
            this.f35007g.close();
        }

        public void flush() {
            C8652t tVar = this.f35007g;
            if (!tVar.f35005h) {
                tVar.flush();
            }
        }

        public String toString() {
            return this.f35007g + ".outputStream()";
        }

        public void write(int i) {
            C8652t tVar = this.f35007g;
            if (!tVar.f35005h) {
                tVar.f35004g.mo30696b1((byte) i);
                this.f35007g.mo30673J();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) {
            C8594l.m46771e(bArr, "data");
            C8652t tVar = this.f35007g;
            if (!tVar.f35005h) {
                tVar.f35004g.mo30695a1(bArr, i, i2);
                this.f35007g.mo30673J();
                return;
            }
            throw new IOException("closed");
        }
    }
}
