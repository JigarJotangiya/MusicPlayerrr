package p394k;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.i */
/* compiled from: DeflaterSink.kt */
public final class C8640i implements C8659y {

    /* renamed from: g */
    private boolean f34977g;

    /* renamed from: h */
    private final C8636f f34978h;

    /* renamed from: i */
    private final Deflater f34979i;

    public C8640i(C8636f fVar, Deflater deflater) {
        C8594l.m46771e(fVar, "sink");
        C8594l.m46771e(deflater, "deflater");
        this.f34978h = fVar;
        this.f34979i = deflater;
    }

    @IgnoreJRERequirement
    /* renamed from: c */
    private final void m46970c(boolean z) {
        C8656v X0;
        int i;
        C8633e h = this.f34978h.mo30710h();
        while (true) {
            X0 = h.mo30691X0(1);
            if (z) {
                Deflater deflater = this.f34979i;
                byte[] bArr = X0.f35012a;
                int i2 = X0.f35014c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f34979i;
                byte[] bArr2 = X0.f35012a;
                int i3 = X0.f35014c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                X0.f35014c += i;
                h.mo30686T0(h.mo30688U0() + ((long) i));
                this.f34978h.mo30673J();
            } else if (this.f34979i.needsInput()) {
                break;
            }
        }
        if (X0.f35013b == X0.f35014c) {
            h.f34971g = X0.mo30847b();
            C8657w.m47057b(X0);
        }
    }

    /* renamed from: b0 */
    public void mo29321b0(C8633e eVar, long j) throws IOException {
        C8594l.m46771e(eVar, "source");
        C8624c.m46824b(eVar.mo30688U0(), 0, j);
        while (j > 0) {
            C8656v vVar = eVar.f34971g;
            C8594l.m46769c(vVar);
            int min = (int) Math.min(j, (long) (vVar.f35014c - vVar.f35013b));
            this.f34979i.setInput(vVar.f35012a, vVar.f35013b, min);
            m46970c(false);
            long j2 = (long) min;
            eVar.mo30686T0(eVar.mo30688U0() - j2);
            int i = vVar.f35013b + min;
            vVar.f35013b = i;
            if (i == vVar.f35014c) {
                eVar.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            }
            j -= j2;
        }
    }

    public void close() throws IOException {
        if (!this.f34977g) {
            Throwable th = null;
            try {
                mo30809d();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f34979i.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f34978h.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f34977g = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final void mo30809d() {
        this.f34979i.finish();
        m46970c(false);
    }

    public void flush() throws IOException {
        m46970c(true);
        this.f34978h.flush();
    }

    public C8622b0 timeout() {
        return this.f34978h.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f34978h + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8640i(C8659y yVar, Deflater deflater) {
        this(C8645n.m46984a(yVar), deflater);
        C8594l.m46771e(yVar, "sink");
        C8594l.m46771e(deflater, "deflater");
    }
}
