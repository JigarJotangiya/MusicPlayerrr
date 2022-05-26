package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.y2 */
/* compiled from: ThreadPoolDispatcher.kt */
public final class C8933y2 {
    /* renamed from: b */
    public static final C8897q1 m47854b(int i, String str) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return C8907s1.m47812b(Executors.newScheduledThreadPool(i, new C8679c(i, str, new AtomicInteger())));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Thread m47855c(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
