package p394k;

import java.io.IOException;
import java.io.InputStream;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.m */
/* compiled from: JvmOkio.kt */
final class C8644m implements C8620a0 {

    /* renamed from: g */
    private final InputStream f34990g;

    /* renamed from: h */
    private final C8622b0 f34991h;

    public C8644m(InputStream inputStream, C8622b0 b0Var) {
        C8594l.m46771e(inputStream, "input");
        C8594l.m46771e(b0Var, "timeout");
        this.f34990g = inputStream;
        this.f34991h = b0Var;
    }

    public void close() {
        this.f34990g.close();
    }

    public C8622b0 timeout() {
        return this.f34991h;
    }

    public String toString() {
        return "source(" + this.f34990g + ')';
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f34991h.mo30649e();
                C8656v X0 = eVar.mo30691X0(1);
                int read = this.f34990g.read(X0.f35012a, X0.f35014c, (int) Math.min(j, (long) (8192 - X0.f35014c)));
                if (read != -1) {
                    X0.f35014c += read;
                    long j2 = (long) read;
                    eVar.mo30686T0(eVar.mo30688U0() + j2);
                    return j2;
                } else if (X0.f35013b != X0.f35014c) {
                    return -1;
                } else {
                    eVar.f34971g = X0.mo30847b();
                    C8657w.m47057b(X0);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C8645n.m46986c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }
}
