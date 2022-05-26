package kotlinx.coroutines.p400h3;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C8811a0;

/* renamed from: kotlinx.coroutines.h3.l */
/* compiled from: Tasks.kt */
public final class C8790l {

    /* renamed from: a */
    public static final long f35166a = C8815c0.m47518e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f35167b;

    /* renamed from: c */
    public static final int f35168c;

    /* renamed from: d */
    public static final long f35169d = TimeUnit.SECONDS.toNanos(C8815c0.m47518e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C8786h f35170e = C8784f.f35160a;

    static {
        int unused = C8815c0.m47517d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
        int f = C8815c0.m47517d("kotlinx.coroutines.scheduler.core.pool.size", C8392f.m46450a(C8811a0.m47505a(), 2), 1, 0, 8, (Object) null);
        f35167b = f;
        f35168c = C8815c0.m47517d("kotlinx.coroutines.scheduler.max.pool.size", C8392f.m46454e(C8811a0.m47505a() * 128, f, 2097150), 0, 2097150, 4, (Object) null);
    }
}
