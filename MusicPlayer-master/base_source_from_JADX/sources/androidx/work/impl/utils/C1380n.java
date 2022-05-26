package androidx.work.impl.utils;

import androidx.work.C1405l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.utils.n */
/* compiled from: WorkTimer */
public class C1380n {

    /* renamed from: f */
    private static final String f5412f = C1405l.m7462f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f5413a;

    /* renamed from: b */
    private final ScheduledExecutorService f5414b;

    /* renamed from: c */
    final Map<String, C1383c> f5415c = new HashMap();

    /* renamed from: d */
    final Map<String, C1382b> f5416d = new HashMap();

    /* renamed from: e */
    final Object f5417e = new Object();

    /* renamed from: androidx.work.impl.utils.n$a */
    /* compiled from: WorkTimer */
    class C1381a implements ThreadFactory {

        /* renamed from: a */
        private int f5418a = 0;

        C1381a(C1380n nVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f5418a);
            this.f5418a = this.f5418a + 1;
            return newThread;
        }
    }

    /* renamed from: androidx.work.impl.utils.n$b */
    /* compiled from: WorkTimer */
    public interface C1382b {
        /* renamed from: a */
        void mo6540a(String str);
    }

    /* renamed from: androidx.work.impl.utils.n$c */
    /* compiled from: WorkTimer */
    public static class C1383c implements Runnable {

        /* renamed from: g */
        private final C1380n f5419g;

        /* renamed from: h */
        private final String f5420h;

        C1383c(C1380n nVar, String str) {
            this.f5419g = nVar;
            this.f5420h = str;
        }

        public void run() {
            synchronized (this.f5419g.f5417e) {
                if (this.f5419g.f5415c.remove(this.f5420h) != null) {
                    C1382b remove = this.f5419g.f5416d.remove(this.f5420h);
                    if (remove != null) {
                        remove.mo6540a(this.f5420h);
                    }
                } else {
                    C1405l.m7460c().mo6816a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f5420h}), new Throwable[0]);
                }
            }
        }
    }

    public C1380n() {
        C1381a aVar = new C1381a(this);
        this.f5413a = aVar;
        this.f5414b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo6774a() {
        if (!this.f5414b.isShutdown()) {
            this.f5414b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo6775b(String str, long j, C1382b bVar) {
        synchronized (this.f5417e) {
            C1405l.m7460c().mo6816a(f5412f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo6776c(str);
            C1383c cVar = new C1383c(this, str);
            this.f5415c.put(str, cVar);
            this.f5416d.put(str, bVar);
            this.f5414b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void mo6776c(String str) {
        synchronized (this.f5417e) {
            if (this.f5415c.remove(str) != null) {
                C1405l.m7460c().mo6816a(f5412f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f5416d.remove(str);
            }
        }
    }
}
