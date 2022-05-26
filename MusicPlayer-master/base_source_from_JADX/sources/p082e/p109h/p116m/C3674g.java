package p082e.p109h.p116m;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p082e.p109h.p118o.C3695a;

/* renamed from: e.h.m.g */
/* compiled from: RequestExecutor */
class C3674g {

    /* renamed from: e.h.m.g$a */
    /* compiled from: RequestExecutor */
    private static class C3675a implements ThreadFactory {

        /* renamed from: a */
        private String f11662a;

        /* renamed from: b */
        private int f11663b;

        /* renamed from: e.h.m.g$a$a */
        /* compiled from: RequestExecutor */
        private static class C3676a extends Thread {

            /* renamed from: g */
            private final int f11664g;

            C3676a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f11664g = i;
            }

            public void run() {
                Process.setThreadPriority(this.f11664g);
                super.run();
            }
        }

        C3675a(String str, int i) {
            this.f11662a = str;
            this.f11663b = i;
        }

        public Thread newThread(Runnable runnable) {
            return new C3676a(runnable, this.f11662a, this.f11663b);
        }
    }

    /* renamed from: e.h.m.g$b */
    /* compiled from: RequestExecutor */
    private static class C3677b<T> implements Runnable {

        /* renamed from: g */
        private Callable<T> f11665g;

        /* renamed from: h */
        private C3695a<T> f11666h;

        /* renamed from: i */
        private Handler f11667i;

        /* renamed from: e.h.m.g$b$a */
        /* compiled from: RequestExecutor */
        class C3678a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C3695a f11668g;

            /* renamed from: h */
            final /* synthetic */ Object f11669h;

            C3678a(C3677b bVar, C3695a aVar, Object obj) {
                this.f11668g = aVar;
                this.f11669h = obj;
            }

            public void run() {
                this.f11668g.accept(this.f11669h);
            }
        }

        C3677b(Handler handler, Callable<T> callable, C3695a<T> aVar) {
            this.f11665g = callable;
            this.f11666h = aVar;
            this.f11667i = handler;
        }

        public void run() {
            T t;
            try {
                t = this.f11665g.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f11667i.post(new C3678a(this, this.f11666h, t));
        }
    }

    /* renamed from: a */
    static ThreadPoolExecutor m15759a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new C3675a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    static <T> void m15760b(Executor executor, Callable<T> callable, C3695a<T> aVar) {
        executor.execute(new C3677b(C3660b.m15722a(), callable, aVar));
    }

    /* renamed from: c */
    static <T> T m15761c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
