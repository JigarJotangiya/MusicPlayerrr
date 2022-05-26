package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: androidx.room.b1 */
/* compiled from: TransactionExecutor */
class C0932b1 implements Executor {

    /* renamed from: g */
    private final Executor f4083g;

    /* renamed from: h */
    private final ArrayDeque<Runnable> f4084h = new ArrayDeque<>();

    /* renamed from: i */
    private Runnable f4085i;

    /* renamed from: androidx.room.b1$a */
    /* compiled from: TransactionExecutor */
    class C0933a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Runnable f4086g;

        C0933a(Runnable runnable) {
            this.f4086g = runnable;
        }

        public void run() {
            try {
                this.f4086g.run();
            } finally {
                C0932b1.this.mo5452a();
            }
        }
    }

    C0932b1(Executor executor) {
        this.f4083g = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo5452a() {
        Runnable poll = this.f4084h.poll();
        this.f4085i = poll;
        if (poll != null) {
            this.f4083g.execute(poll);
        }
    }

    public synchronized void execute(Runnable runnable) {
        this.f4084h.offer(new C0933a(runnable));
        if (this.f4085i == null) {
            mo5452a();
        }
    }
}
