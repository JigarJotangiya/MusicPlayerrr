package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.b2 */
/* compiled from: Exceptions.kt */
public final class C8677b2 extends CancellationException implements C8865k0<C8677b2> {
    public final C8665a2 job;

    public C8677b2(String str, Throwable th, C8665a2 a2Var) {
        super(str);
        this.job = a2Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C8677b2) {
                C8677b2 b2Var = (C8677b2) obj;
                if (!C8594l.m46767a(b2Var.getMessage(), getMessage()) || !C8594l.m46767a(b2Var.job, this.job) || !C8594l.m46767a(b2Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (C8919v0.m47826c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C8594l.m46769c(message);
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    public String toString() {
        return super.toString() + "; job=" + this.job;
    }

    public C8677b2 createCopy() {
        if (!C8919v0.m47826c()) {
            return null;
        }
        String message = getMessage();
        C8594l.m46769c(message);
        return new C8677b2(message, this, this.job);
    }
}
