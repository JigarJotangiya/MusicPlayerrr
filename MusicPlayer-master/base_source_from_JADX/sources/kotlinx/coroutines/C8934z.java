package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p369i.p379w.C8513g;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.z */
/* compiled from: CommonPool.kt */
public final class C8934z extends C8897q1 {

    /* renamed from: h */
    public static final C8934z f35320h = new C8934z();

    /* renamed from: i */
    private static final int f35321i;

    /* renamed from: j */
    private static boolean f35322j;
    private static volatile Executor pool;

    static {
        String str;
        int i;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i = -1;
        } else {
            Integer f = C8435n.m46512f(str);
            if (f == null || f.intValue() < 1) {
                throw new IllegalStateException(C8594l.m46777k("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i = f.intValue();
        }
        f35321i = i;
    }

    private C8934z() {
    }

    /* renamed from: P0 */
    private final ExecutorService m47856P0() {
        return Executors.newFixedThreadPool(m47860T0(), new C8674b(new AtomicInteger()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public static final Thread m47857Q0(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, C8594l.m46777k("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m47858R0() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto L_0x000b
            java.util.concurrent.ExecutorService r0 = r6.m47856P0()
            return r0
        L_0x000b:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 != 0) goto L_0x001b
            java.util.concurrent.ExecutorService r0 = r6.m47856P0()
            return r0
        L_0x001b:
            boolean r2 = f35322j
            r3 = 0
            if (r2 != 0) goto L_0x004b
            int r2 = f35321i
            if (r2 >= 0) goto L_0x004b
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x0039 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0039 }
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch:{ all -> 0x0039 }
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0039 }
            if (r4 == 0) goto L_0x0039
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch:{ all -> 0x0039 }
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            goto L_0x004b
        L_0x003d:
            kotlinx.coroutines.z r4 = f35320h
            boolean r4 = r4.mo31254U0(r1, r2)
            if (r4 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = r0
        L_0x0047:
            if (r2 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            return r2
        L_0x004b:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ all -> 0x0070 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0070 }
            r4[r3] = r5     // Catch:{ all -> 0x0070 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ all -> 0x0070 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0070 }
            kotlinx.coroutines.z r4 = f35320h     // Catch:{ all -> 0x0070 }
            int r4 = r4.m47860T0()     // Catch:{ all -> 0x0070 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0070 }
            r2[r3] = r4     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0070 }
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0071
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch:{ all -> 0x0070 }
            r0 = r1
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.ExecutorService r0 = r6.m47856P0()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8934z.m47858R0():java.util.concurrent.ExecutorService");
    }

    /* renamed from: S0 */
    private final synchronized Executor m47859S0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = m47858R0();
            pool = executor;
        }
        return executor;
    }

    /* renamed from: T0 */
    private final int m47860T0() {
        Integer valueOf = Integer.valueOf(f35321i);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return C8392f.m46450a(Runtime.getRuntime().availableProcessors() - 1, 1);
        }
        return valueOf.intValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public static final void m47861V0() {
    }

    /* renamed from: N0 */
    public void mo30866N0(C8513g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = m47859S0();
            }
            C8690e a = C8723f.m47251a();
            executor.execute(a == null ? runnable : a.mo30914h(runnable));
        } catch (RejectedExecutionException unused) {
            C8690e a2 = C8723f.m47251a();
            if (a2 != null) {
                a2.mo30911e();
            }
            C8927x0.f35312m.mo31189h1(runnable);
        }
    }

    /* renamed from: U0 */
    public final boolean mo31254U0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(C8662a.f35029g);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() >= 1) {
            return true;
        }
        return false;
    }

    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public String toString() {
        return "CommonPool";
    }
}
