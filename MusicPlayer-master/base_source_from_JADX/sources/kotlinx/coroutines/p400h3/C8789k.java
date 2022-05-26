package kotlinx.coroutines.p400h3;

import kotlinx.coroutines.C8923w0;

/* renamed from: kotlinx.coroutines.h3.k */
/* compiled from: Tasks.kt */
public final class C8789k extends C8787i {

    /* renamed from: i */
    public final Runnable f35165i;

    public C8789k(Runnable runnable, long j, C8788j jVar) {
        super(j, jVar);
        this.f35165i = runnable;
    }

    public void run() {
        try {
            this.f35165i.run();
        } finally {
            this.f35164h.mo31035E();
        }
    }

    public String toString() {
        return "Task[" + C8923w0.m47833a(this.f35165i) + '@' + C8923w0.m47834b(this.f35165i) + ", " + this.f35163g + ", " + this.f35164h + ']';
    }
}
