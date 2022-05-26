package p394k;

import java.io.IOException;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.j */
/* compiled from: ForwardingSource.kt */
public abstract class C8641j implements C8620a0 {

    /* renamed from: g */
    private final C8620a0 f34980g;

    public C8641j(C8620a0 a0Var) {
        C8594l.m46771e(a0Var, "delegate");
        this.f34980g = a0Var;
    }

    public void close() throws IOException {
        this.f34980g.close();
    }

    public C8622b0 timeout() {
        return this.f34980g.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f34980g + ')';
    }

    /* renamed from: w0 */
    public long mo29326w0(C8633e eVar, long j) throws IOException {
        C8594l.m46771e(eVar, "sink");
        return this.f34980g.mo29326w0(eVar, j);
    }
}
