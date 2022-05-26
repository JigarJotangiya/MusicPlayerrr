package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.ProtocolException;
import p159f.p334h.p337b.p338z.C7859h;
import p394k.C8622b0;
import p394k.C8633e;
import p394k.C8659y;

/* renamed from: f.h.b.z.j.m */
/* compiled from: RetryableSink */
public final class C7888m implements C8659y {

    /* renamed from: g */
    private boolean f33473g;

    /* renamed from: h */
    private final int f33474h;

    /* renamed from: i */
    private final C8633e f33475i;

    public C7888m(int i) {
        this.f33475i = new C8633e();
        this.f33474h = i;
    }

    /* renamed from: b0 */
    public void mo29321b0(C8633e eVar, long j) throws IOException {
        if (!this.f33473g) {
            C7859h.m43077a(eVar.mo30688U0(), 0, j);
            if (this.f33474h == -1 || this.f33475i.mo30688U0() <= ((long) this.f33474h) - j) {
                this.f33475i.mo29321b0(eVar, j);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f33474h + " bytes");
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public long mo29354c() throws IOException {
        return this.f33475i.mo30688U0();
    }

    public void close() throws IOException {
        if (!this.f33473g) {
            this.f33473g = true;
            if (this.f33475i.mo30688U0() < ((long) this.f33474h)) {
                throw new ProtocolException("content-length promised " + this.f33474h + " bytes, but received " + this.f33475i.mo30688U0());
            }
        }
    }

    /* renamed from: d */
    public void mo29355d(C8659y yVar) throws IOException {
        C8633e eVar = new C8633e();
        C8633e eVar2 = this.f33475i;
        eVar2.mo30685T(eVar, 0, eVar2.mo30688U0());
        yVar.mo29321b0(eVar, eVar.mo30688U0());
    }

    public void flush() throws IOException {
    }

    public C8622b0 timeout() {
        return C8622b0.f34954d;
    }

    public C7888m() {
        this(-1);
    }
}
