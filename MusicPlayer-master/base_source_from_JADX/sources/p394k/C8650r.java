package p394k;

import java.io.OutputStream;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.r */
/* compiled from: JvmOkio.kt */
final class C8650r implements C8659y {

    /* renamed from: g */
    private final OutputStream f34996g;

    /* renamed from: h */
    private final C8622b0 f34997h;

    public C8650r(OutputStream outputStream, C8622b0 b0Var) {
        C8594l.m46771e(outputStream, "out");
        C8594l.m46771e(b0Var, "timeout");
        this.f34996g = outputStream;
        this.f34997h = b0Var;
    }

    /* renamed from: b0 */
    public void mo29321b0(C8633e eVar, long j) {
        C8594l.m46771e(eVar, "source");
        C8624c.m46824b(eVar.mo30688U0(), 0, j);
        while (j > 0) {
            this.f34997h.mo30649e();
            C8656v vVar = eVar.f34971g;
            C8594l.m46769c(vVar);
            int min = (int) Math.min(j, (long) (vVar.f35014c - vVar.f35013b));
            this.f34996g.write(vVar.f35012a, vVar.f35013b, min);
            vVar.f35013b += min;
            long j2 = (long) min;
            j -= j2;
            eVar.mo30686T0(eVar.mo30688U0() - j2);
            if (vVar.f35013b == vVar.f35014c) {
                eVar.f34971g = vVar.mo30847b();
                C8657w.m47057b(vVar);
            }
        }
    }

    public void close() {
        this.f34996g.close();
    }

    public void flush() {
        this.f34996g.flush();
    }

    public C8622b0 timeout() {
        return this.f34997h;
    }

    public String toString() {
        return "sink(" + this.f34996g + ')';
    }
}
