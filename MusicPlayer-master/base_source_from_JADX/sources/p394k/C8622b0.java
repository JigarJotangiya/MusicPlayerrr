package p394k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.b0 */
/* compiled from: Timeout.kt */
public class C8622b0 {

    /* renamed from: d */
    public static final C8622b0 f34954d = new C8623a();

    /* renamed from: a */
    private boolean f34955a;

    /* renamed from: b */
    private long f34956b;

    /* renamed from: c */
    private long f34957c;

    /* renamed from: k.b0$a */
    /* compiled from: Timeout.kt */
    public static final class C8623a extends C8622b0 {
        C8623a() {
        }

        /* renamed from: c */
        public C8622b0 mo30647c(long j) {
            return this;
        }

        /* renamed from: e */
        public void mo30649e() {
        }

        /* renamed from: f */
        public C8622b0 mo30650f(long j, TimeUnit timeUnit) {
            C8594l.m46771e(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: a */
    public C8622b0 mo30645a() {
        this.f34955a = false;
        return this;
    }

    /* renamed from: b */
    public long mo30646b() {
        if (this.f34955a) {
            return this.f34956b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: c */
    public C8622b0 mo30647c(long j) {
        this.f34955a = true;
        this.f34956b = j;
        return this;
    }

    /* renamed from: d */
    public boolean mo30648d() {
        return this.f34955a;
    }

    /* renamed from: e */
    public void mo30649e() throws IOException {
        Thread currentThread = Thread.currentThread();
        C8594l.m46770d(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f34955a && this.f34956b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public C8622b0 mo30650f(long j, TimeUnit timeUnit) {
        C8594l.m46771e(timeUnit, "unit");
        if (j >= 0) {
            this.f34957c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    /* renamed from: g */
    public long mo30651g() {
        return this.f34957c;
    }
}
