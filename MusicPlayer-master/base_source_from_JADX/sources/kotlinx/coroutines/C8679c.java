package kotlinx.coroutines;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: kotlinx.coroutines.c */
/* compiled from: lambda */
public final /* synthetic */ class C8679c implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ int f35042a;

    /* renamed from: b */
    public final /* synthetic */ String f35043b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f35044c;

    public /* synthetic */ C8679c(int i, String str, AtomicInteger atomicInteger) {
        this.f35042a = i;
        this.f35043b = str;
        this.f35044c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return C8933y2.m47855c(this.f35042a, this.f35043b, this.f35044c, runnable);
    }
}
