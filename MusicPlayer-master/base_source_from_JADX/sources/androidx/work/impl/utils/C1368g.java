package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.g */
/* compiled from: SerialExecutor */
public class C1368g implements Executor {

    /* renamed from: g */
    private final ArrayDeque<C1369a> f5371g = new ArrayDeque<>();

    /* renamed from: h */
    private final Executor f5372h;

    /* renamed from: i */
    private final Object f5373i = new Object();

    /* renamed from: j */
    private volatile Runnable f5374j;

    /* renamed from: androidx.work.impl.utils.g$a */
    /* compiled from: SerialExecutor */
    static class C1369a implements Runnable {

        /* renamed from: g */
        final C1368g f5375g;

        /* renamed from: h */
        final Runnable f5376h;

        C1369a(C1368g gVar, Runnable runnable) {
            this.f5375g = gVar;
            this.f5376h = runnable;
        }

        public void run() {
            try {
                this.f5376h.run();
            } finally {
                this.f5375g.mo6762b();
            }
        }
    }

    public C1368g(Executor executor) {
        this.f5372h = executor;
    }

    /* renamed from: a */
    public boolean mo6761a() {
        boolean z;
        synchronized (this.f5373i) {
            z = !this.f5371g.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6762b() {
        synchronized (this.f5373i) {
            Runnable poll = this.f5371g.poll();
            this.f5374j = poll;
            if (poll != null) {
                this.f5372h.execute(this.f5374j);
            }
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f5373i) {
            this.f5371g.add(new C1369a(this, runnable));
            if (this.f5374j == null) {
                mo6762b();
            }
        }
    }
}
