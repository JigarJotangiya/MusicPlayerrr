package androidx.work.impl.utils.p014p;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.C1368g;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.p.b */
/* compiled from: WorkManagerTaskExecutor */
public class C1398b implements C1397a {

    /* renamed from: a */
    private final C1368g f5449a;

    /* renamed from: b */
    private final Handler f5450b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Executor f5451c = new C1399a();

    /* renamed from: androidx.work.impl.utils.p.b$a */
    /* compiled from: WorkManagerTaskExecutor */
    class C1399a implements Executor {
        C1399a() {
        }

        public void execute(Runnable runnable) {
            C1398b.this.mo6806d(runnable);
        }
    }

    public C1398b(Executor executor) {
        this.f5449a = new C1368g(executor);
    }

    /* renamed from: a */
    public Executor mo6803a() {
        return this.f5451c;
    }

    /* renamed from: b */
    public void mo6804b(Runnable runnable) {
        this.f5449a.execute(runnable);
    }

    /* renamed from: c */
    public C1368g mo6805c() {
        return this.f5449a;
    }

    /* renamed from: d */
    public void mo6806d(Runnable runnable) {
        this.f5450b.post(runnable);
    }
}
