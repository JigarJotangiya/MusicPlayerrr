package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.b */
/* compiled from: lambda */
public final /* synthetic */ class C8674b implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f35039a;

    public /* synthetic */ C8674b(AtomicInteger atomicInteger) {
        this.f35039a = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C8934z.m47857Q0(this.f35039a, runnable);
    }
}
