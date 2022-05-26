package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p013o.C1396c;
import p159f.p243f.p327d.p330c.p331a.C7738a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: l */
    C1396c<ListenableWorker.C1221a> f4984l;

    /* renamed from: androidx.work.Worker$a */
    class C1225a implements Runnable {
        C1225a() {
        }

        public void run() {
            try {
                Worker.this.f4984l.mo6788q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f4984l.mo6789r(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.C1221a doWork();

    public final C7738a<ListenableWorker.C1221a> startWork() {
        this.f4984l = C1396c.m7435u();
        getBackgroundExecutor().execute(new C1225a());
        return this.f4984l;
    }
}
