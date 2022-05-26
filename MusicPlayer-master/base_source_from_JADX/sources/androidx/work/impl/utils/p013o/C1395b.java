package androidx.work.impl.utils.p013o;

import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.o.b */
/* compiled from: DirectExecutor */
enum C1395b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
