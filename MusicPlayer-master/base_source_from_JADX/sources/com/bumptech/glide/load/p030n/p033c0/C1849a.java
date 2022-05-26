package com.bumptech.glide.load.p030n.p033c0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.n.c0.a */
/* compiled from: GlideExecutor */
public final class C1849a implements ExecutorService {

    /* renamed from: h */
    private static final long f6676h = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: i */
    private static volatile int f6677i;

    /* renamed from: g */
    private final ExecutorService f6678g;

    /* renamed from: com.bumptech.glide.load.n.c0.a$a */
    /* compiled from: GlideExecutor */
    public static final class C1850a {

        /* renamed from: a */
        private final boolean f6679a;

        /* renamed from: b */
        private int f6680b;

        /* renamed from: c */
        private int f6681c;

        /* renamed from: d */
        private C1853c f6682d = C1853c.f6691b;

        /* renamed from: e */
        private String f6683e;

        /* renamed from: f */
        private long f6684f;

        C1850a(boolean z) {
            this.f6679a = z;
        }

        /* renamed from: a */
        public C1849a mo7866a() {
            if (!TextUtils.isEmpty(this.f6683e)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f6680b, this.f6681c, this.f6684f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1851b(this.f6683e, this.f6682d, this.f6679a));
                if (this.f6684f != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new C1849a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f6683e);
        }

        /* renamed from: b */
        public C1850a mo7867b(String str) {
            this.f6683e = str;
            return this;
        }

        /* renamed from: c */
        public C1850a mo7868c(int i) {
            this.f6680b = i;
            this.f6681c = i;
            return this;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.c0.a$b */
    /* compiled from: GlideExecutor */
    private static final class C1851b implements ThreadFactory {

        /* renamed from: a */
        private final String f6685a;

        /* renamed from: b */
        final C1853c f6686b;

        /* renamed from: c */
        final boolean f6687c;

        /* renamed from: d */
        private int f6688d;

        /* renamed from: com.bumptech.glide.load.n.c0.a$b$a */
        /* compiled from: GlideExecutor */
        class C1852a extends Thread {
            C1852a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(9);
                if (C1851b.this.f6687c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    C1851b.this.f6686b.mo7871a(th);
                }
            }
        }

        C1851b(String str, C1853c cVar, boolean z) {
            this.f6685a = str;
            this.f6686b = cVar;
            this.f6687c = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C1852a aVar;
            aVar = new C1852a(runnable, "glide-" + this.f6685a + "-thread-" + this.f6688d);
            this.f6688d = this.f6688d + 1;
            return aVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.c0.a$c */
    /* compiled from: GlideExecutor */
    public interface C1853c {

        /* renamed from: a */
        public static final C1853c f6690a;

        /* renamed from: b */
        public static final C1853c f6691b;

        /* renamed from: com.bumptech.glide.load.n.c0.a$c$a */
        /* compiled from: GlideExecutor */
        class C1854a implements C1853c {
            C1854a() {
            }

            /* renamed from: a */
            public void mo7871a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        static {
            C1854a aVar = new C1854a();
            f6690a = aVar;
            f6691b = aVar;
        }

        /* renamed from: a */
        void mo7871a(Throwable th);
    }

    C1849a(ExecutorService executorService) {
        this.f6678g = executorService;
    }

    /* renamed from: a */
    public static int m9011a() {
        if (f6677i == 0) {
            f6677i = Math.min(4, C1855b.m9024a());
        }
        return f6677i;
    }

    /* renamed from: b */
    public static C1850a m9012b() {
        int i = m9011a() >= 4 ? 2 : 1;
        C1850a aVar = new C1850a(true);
        aVar.mo7868c(i);
        aVar.mo7867b("animation");
        return aVar;
    }

    /* renamed from: c */
    public static C1849a m9013c() {
        return m9012b().mo7866a();
    }

    /* renamed from: d */
    public static C1850a m9014d() {
        C1850a aVar = new C1850a(true);
        aVar.mo7868c(1);
        aVar.mo7867b("disk-cache");
        return aVar;
    }

    /* renamed from: e */
    public static C1849a m9015e() {
        return m9014d().mo7866a();
    }

    /* renamed from: f */
    public static C1850a m9016f() {
        C1850a aVar = new C1850a(false);
        aVar.mo7868c(m9011a());
        aVar.mo7867b("source");
        return aVar;
    }

    /* renamed from: g */
    public static C1849a m9017g() {
        return m9016f().mo7866a();
    }

    /* renamed from: h */
    public static C1849a m9018h() {
        return new C1849a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f6676h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1851b("source-unlimited", C1853c.f6691b, false)));
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6678g.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f6678g.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f6678g.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f6678g.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f6678g.isShutdown();
    }

    public boolean isTerminated() {
        return this.f6678g.isTerminated();
    }

    public void shutdown() {
        this.f6678g.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f6678g.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f6678g.submit(runnable);
    }

    public String toString() {
        return this.f6678g.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f6678g.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f6678g.invokeAny(collection, j, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f6678g.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f6678g.submit(callable);
    }
}
