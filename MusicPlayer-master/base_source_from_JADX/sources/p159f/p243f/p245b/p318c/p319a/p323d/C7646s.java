package p159f.p243f.p245b.p318c.p319a.p323d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: f.f.b.c.a.d.s */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7646s implements Executor {

    /* renamed from: g */
    private final Handler f33010g = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f33010g.post(runnable);
    }
}
