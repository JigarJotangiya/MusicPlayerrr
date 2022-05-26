package p159f.p243f.p245b.p246a.p303f;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p246a.p293c.p298e.C7449a;

/* renamed from: f.f.b.a.f.a0 */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7461a0 implements Executor {

    /* renamed from: g */
    private final Handler f32635g = new C7449a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f32635g.post(runnable);
    }
}
