package kotlinx.coroutines.p397f3.p398q;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C8919v0;
import kotlinx.coroutines.p397f3.C8730c;

/* renamed from: kotlinx.coroutines.f3.q.a */
/* compiled from: FlowExceptions.kt */
public final class C8751a extends CancellationException {
    private final C8730c<?> owner;

    public C8751a(C8730c<?> cVar) {
        super("Flow was aborted, no more elements needed");
        this.owner = cVar;
    }

    public Throwable fillInStackTrace() {
        if (C8919v0.m47826c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final C8730c<?> getOwner() {
        return this.owner;
    }
}
