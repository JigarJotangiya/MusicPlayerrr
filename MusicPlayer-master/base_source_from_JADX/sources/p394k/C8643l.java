package p394k;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.l */
/* compiled from: InflaterSource.kt */
public final class C8643l implements C8620a0 {

    /* renamed from: g */
    private int f34986g;

    /* renamed from: h */
    private boolean f34987h;

    /* renamed from: i */
    private final C8637g f34988i;

    /* renamed from: j */
    private final Inflater f34989j;

    public C8643l(C8637g gVar, Inflater inflater) {
        C8594l.m46771e(gVar, "source");
        C8594l.m46771e(inflater, "inflater");
        this.f34988i = gVar;
        this.f34989j = inflater;
    }

    /* renamed from: p */
    private final void m46979p() {
        int i = this.f34986g;
        if (i != 0) {
            int remaining = i - this.f34989j.getRemaining();
            this.f34986g -= remaining;
            this.f34988i.mo30715j((long) remaining);
        }
    }

    /* renamed from: c */
    public final long mo30812c(C8633e eVar, long j) throws IOException {
        C8594l.m46771e(eVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!(!this.f34987h)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                C8656v X0 = eVar.mo30691X0(1);
                int min = (int) Math.min(j, (long) (8192 - X0.f35014c));
                mo30813d();
                int inflate = this.f34989j.inflate(X0.f35012a, X0.f35014c, min);
                m46979p();
                if (inflate > 0) {
                    X0.f35014c += inflate;
                    long j2 = (long) inflate;
                    eVar.mo30686T0(eVar.mo30688U0() + j2);
                    return j2;
                }
                if (X0.f35013b == X0.f35014c) {
                    eVar.f34971g = X0.mo30847b();
                    C8657w.m47057b(X0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    public void close() throws IOException {
        if (!this.f34987h) {
            this.f34989j.end();
            this.f34987h = true;
            this.f34988i.close();
        }
    }

    /* renamed from: d */
    public final boolean mo30813d() throws IOException {
        if (!this.f34989j.needsInput()) {
            return false;
        }
        if (this.f34988i.mo30664A()) {
            return true;
        }
        C8656v vVar = this.f34988i.mo30710h().f34971g;
        C8594l.m46769c(vVar);
        int i = vVar.f35014c;
        int i2 = vVar.f35013b;
        int i3 = i - i2;
        this.f34986g = i3;
        this.f34989j.setInput(vVar.f35012a, i2, i3);
        return false;
    }

    public C8622b0 timeout() {
        return this.f34988i.timeout();
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) throws IOException {
        C8594l.m46771e(eVar, "sink");
        do {
            long c = mo30812c(eVar, j);
            if (c > 0) {
                return c;
            }
            if (this.f34989j.finished() || this.f34989j.needsDictionary()) {
                return -1;
            }
        } while (!this.f34988i.mo30664A());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8643l(C8620a0 a0Var, Inflater inflater) {
        this(C8645n.m46985b(a0Var), inflater);
        C8594l.m46771e(a0Var, "source");
        C8594l.m46771e(inflater, "inflater");
    }
}
