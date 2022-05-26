package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: kotlinx.coroutines.internal.e */
/* compiled from: Concurrent.kt */
public final class C8821e {

    /* renamed from: a */
    private static final Method f35211a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f35211a = method;
    }

    /* renamed from: a */
    public static final boolean m47528a(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f35211a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
