package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: kotlinx.coroutines.x0 */
/* compiled from: DefaultExecutor.kt */
public final class C8927x0 extends C8870l1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m */
    public static final C8927x0 f35312m;

    /* renamed from: n */
    private static final long f35313n;

    static {
        Long l;
        C8927x0 x0Var = new C8927x0();
        f35312m = x0Var;
        C8866k1.m47679V0(x0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f35313n = timeUnit.toNanos(l.longValue());
    }

    private C8927x0() {
    }

    /* renamed from: r1 */
    private final synchronized void m47840r1() {
        if (m47842t1()) {
            debugStatus = 3;
            mo31191m1();
            notifyAll();
        }
    }

    /* renamed from: s1 */
    private final synchronized Thread m47841s1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: t1 */
    private final boolean m47842t1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: u1 */
    private final synchronized boolean m47843u1() {
        if (m47842t1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b1 */
    public Thread mo31177b1() {
        Thread thread = _thread;
        return thread == null ? m47841s1() : thread;
    }

    public void run() {
        C8929x2.f35315a.mo31253d(this);
        C8690e a = C8723f.m47251a();
        if (a != null) {
            a.mo30909c();
        }
        try {
            if (m47843u1()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long Y0 = mo31185Y0();
                    if (Y0 == Long.MAX_VALUE) {
                        C8690e a2 = C8723f.m47251a();
                        long nanoTime = a2 == null ? System.nanoTime() : a2.mo30907a();
                        if (j == Long.MAX_VALUE) {
                            j = f35313n + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m47840r1();
                            C8690e a3 = C8723f.m47251a();
                            if (a3 != null) {
                                a3.mo30913g();
                            }
                            if (!mo31190k1()) {
                                mo31177b1();
                                return;
                            }
                            return;
                        }
                        Y0 = C8392f.m46453d(Y0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (Y0 > 0) {
                        if (m47842t1()) {
                            _thread = null;
                            m47840r1();
                            C8690e a4 = C8723f.m47251a();
                            if (a4 != null) {
                                a4.mo30913g();
                            }
                            if (!mo31190k1()) {
                                mo31177b1();
                                return;
                            }
                            return;
                        }
                        C8690e a5 = C8723f.m47251a();
                        if (a5 == null) {
                            LockSupport.parkNanos(this, Y0);
                        } else {
                            a5.mo30908b(this, Y0);
                        }
                    }
                }
            }
        } finally {
            _thread = null;
            m47840r1();
            C8690e a6 = C8723f.m47251a();
            if (a6 != null) {
                a6.mo30913g();
            }
            if (!mo31190k1()) {
                mo31177b1();
            }
        }
    }
}
