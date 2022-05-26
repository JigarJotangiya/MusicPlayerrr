package p082e.p091b.p092a.p093a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e.b.a.a.b */
/* compiled from: DefaultTaskExecutor */
public class C3447b extends C3449c {

    /* renamed from: a */
    private final Object f10973a = new Object();

    /* renamed from: b */
    private final ExecutorService f10974b = Executors.newFixedThreadPool(4, new C3448a(this));

    /* renamed from: c */
    private volatile Handler f10975c;

    /* renamed from: e.b.a.a.b$a */
    /* compiled from: DefaultTaskExecutor */
    class C3448a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f10976a = new AtomicInteger(0);

        C3448a(C3447b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f10976a.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: e */
    private static Handler m14722e(Looper looper) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return Handler.createAsync(looper);
        }
        if (i >= 16) {
            Class<Handler> cls = Handler.class;
            try {
                return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            } catch (InvocationTargetException unused2) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    /* renamed from: a */
    public void mo12228a(Runnable runnable) {
        this.f10974b.execute(runnable);
    }

    /* renamed from: c */
    public boolean mo12229c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public void mo12230d(Runnable runnable) {
        if (this.f10975c == null) {
            synchronized (this.f10973a) {
                if (this.f10975c == null) {
                    this.f10975c = m14722e(Looper.getMainLooper());
                }
            }
        }
        this.f10975c.post(runnable);
    }
}
