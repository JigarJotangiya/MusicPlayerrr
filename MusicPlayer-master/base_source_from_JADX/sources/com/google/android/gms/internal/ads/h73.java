package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class h73<V> extends v93 implements d93<V> {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final boolean f17567j;

    /* renamed from: k */
    private static final Logger f17568k = Logger.getLogger(h73.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final w63 f17569l;

    /* renamed from: m */
    private static final Object f17570m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile Object f17571g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile z63 f17572h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile g73 f17573i;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        w63 w63;
        Class<g73> cls = g73.class;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f17567j = z;
        try {
            w63 = new f73((j73) null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th3;
            th2 = th;
            w63 = new c73((i73) null);
        }
        f17569l = w63;
        if (th != null) {
            Logger logger = f17568k;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    protected h73() {
    }

    /* renamed from: A */
    private final void m24694A(StringBuilder sb) {
        try {
            Object g = m24702g(this);
            sb.append("SUCCESS, result=[");
            if (g == null) {
                sb.append("null");
            } else if (g == this) {
                sb.append("this future");
            } else {
                sb.append(g.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(g)));
            }
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: B */
    private final void m24695B(StringBuilder sb) {
        String str;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f17571g;
        if (obj instanceof b73) {
            sb.append(", setFuture=[");
            m24696C(sb, ((b73) obj).f14359h);
            sb.append("]");
        } else {
            try {
                str = d23.m22313a(mo18099i());
            } catch (RuntimeException | StackOverflowError e) {
                String valueOf = String.valueOf(e.getClass());
                String.valueOf(valueOf).length();
                str = "Exception thrown from implementation: ".concat(String.valueOf(valueOf));
            }
            if (str != null) {
                sb.append(", info=[");
                sb.append(str);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m24694A(sb);
        }
    }

    /* renamed from: C */
    private final void m24696C(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static void m24697D(h73<?> h73) {
        h73<V> h732;
        z63 z63;
        z63 z632;
        z63 z633 = null;
        h73<?> h733 = h73;
        while (true) {
            g73 g73 = h733.f17573i;
            if (f17569l.mo15707e(h733, g73, g73.f16985c)) {
                while (g73 != null) {
                    Thread thread = g73.f16986a;
                    if (thread != null) {
                        g73.f16986a = null;
                        LockSupport.unpark(thread);
                    }
                    g73 = g73.f16987b;
                }
                h733.mo18102j();
                do {
                    z63 = h733.f17572h;
                } while (!f17569l.mo15705c(h733, z63, z63.f26688d));
                while (true) {
                    z632 = z633;
                    z633 = z63;
                    if (z633 == null) {
                        break;
                    }
                    z63 = z633.f26691c;
                    z633.f26691c = z632;
                }
                while (z632 != null) {
                    z633 = z632.f26691c;
                    Runnable runnable = z632.f26689a;
                    runnable.getClass();
                    if (runnable instanceof b73) {
                        b73 b73 = (b73) runnable;
                        h73<V> h734 = b73.f14358g;
                        if (h734.f17571g == b73) {
                            if (f17569l.mo15706d(h734, b73, m24701f(b73.f14359h))) {
                                h732 = h734;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = z632.f26690b;
                        executor.getClass();
                        m24698b(runnable, executor);
                    }
                    z632 = z633;
                }
                return;
            }
            h732 = h733;
            h733 = h732;
        }
    }

    /* renamed from: b */
    private static void m24698b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f17568k;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), e);
        }
    }

    /* renamed from: c */
    private final void m24699c(g73 g73) {
        g73.f16986a = null;
        while (true) {
            g73 g732 = this.f17573i;
            if (g732 != g73.f16985c) {
                g73 g733 = null;
                while (g732 != null) {
                    g73 g734 = g732.f16987b;
                    if (g732.f16986a != null) {
                        g733 = g732;
                    } else if (g733 != null) {
                        g733.f16987b = g734;
                        if (g733.f16986a == null) {
                        }
                    } else if (!f17569l.mo15707e(this, g732, g734)) {
                    }
                    g732 = g734;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: e */
    private static final V m24700e(Object obj) throws ExecutionException {
        if (obj instanceof x63) {
            Throwable th = ((x63) obj).f25696b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof y63) {
            throw new ExecutionException(((y63) obj).f26280a);
        } else if (obj == f17570m) {
            return null;
        } else {
            return obj;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static Object m24701f(d93<?> d93) {
        Throwable a;
        if (d93 instanceof d73) {
            Object obj = ((h73) d93).f17571g;
            if (obj instanceof x63) {
                x63 x63 = (x63) obj;
                if (x63.f25695a) {
                    Throwable th = x63.f25696b;
                    obj = th != null ? new x63(false, th) : x63.f25694d;
                }
            }
            obj.getClass();
            return obj;
        } else if ((d93 instanceof v93) && (a = ((v93) d93).mo18095a()) != null) {
            return new y63(a);
        } else {
            boolean isCancelled = d93.isCancelled();
            if ((!f17567j) && isCancelled) {
                x63 x632 = x63.f25694d;
                x632.getClass();
                return x632;
            }
            try {
                Object g = m24702g(d93);
                if (!isCancelled) {
                    return g == null ? f17570m : g;
                }
                String valueOf = String.valueOf(d93);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new x63(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e) {
                if (!isCancelled) {
                    return new y63(e.getCause());
                }
                String valueOf2 = String.valueOf(d93);
                String.valueOf(valueOf2).length();
                return new x63(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(valueOf2)), e));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new x63(false, e2);
                }
                String valueOf3 = String.valueOf(d93);
                String.valueOf(valueOf3).length();
                return new y63(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(valueOf3)), e2));
            } catch (Throwable th2) {
                return new y63(th2);
            }
        }
    }

    /* renamed from: g */
    private static <V> V m24702g(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Throwable mo18095a() {
        if (!(this instanceof d73)) {
            return null;
        }
        Object obj = this.f17571g;
        if (obj instanceof y63) {
            return ((y63) obj).f26280a;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, com.google.android.gms.internal.ads.d93<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f17571g
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.b73
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0064
            boolean r3 = f17567j
            if (r3 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.x63 r3 = new com.google.android.gms.internal.ads.x63
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0029
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.x63 r3 = com.google.android.gms.internal.ads.x63.f25693c
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.x63 r3 = com.google.android.gms.internal.ads.x63.f25694d
        L_0x0026:
            r3.getClass()
        L_0x0029:
            r5 = 0
            r4 = r7
        L_0x002b:
            com.google.android.gms.internal.ads.w63 r6 = f17569l
            boolean r6 = r6.mo15706d(r4, r0, r3)
            if (r6 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0038
            r4.mo17511t()
        L_0x0038:
            m24697D(r4)
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.b73
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.ads.b73 r0 = (com.google.android.gms.internal.ads.b73) r0
            com.google.android.gms.internal.ads.d93<? extends V> r0 = r0.f14359h
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.d73
            if (r4 == 0) goto L_0x0058
            r4 = r0
            com.google.android.gms.internal.ads.h73 r4 = (com.google.android.gms.internal.ads.h73) r4
            java.lang.Object r0 = r4.f17571g
            if (r0 != 0) goto L_0x0050
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.b73
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005b
            r5 = 1
            goto L_0x002b
        L_0x0058:
            r0.cancel(r8)
        L_0x005b:
            r1 = 1
            goto L_0x0064
        L_0x005d:
            java.lang.Object r0 = r4.f17571g
            boolean r6 = r0 instanceof com.google.android.gms.internal.ads.b73
            if (r6 != 0) goto L_0x002b
            r1 = r5
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h73.cancel(boolean):boolean");
    }

    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f17571g;
            if ((obj2 != null) && (!(obj2 instanceof b73))) {
                return m24700e(obj2);
            }
            g73 g73 = this.f17573i;
            if (g73 != g73.f16985c) {
                g73 g732 = new g73();
                do {
                    w63 w63 = f17569l;
                    w63.mo15703a(g732, g73);
                    if (w63.mo15707e(this, g73, g732)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f17571g;
                            } else {
                                m24699c(g732);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof b73))));
                        return m24700e(obj);
                    }
                    g73 = this.f17573i;
                } while (g73 != g73.f16985c);
            }
            Object obj3 = this.f17571g;
            obj3.getClass();
            return m24700e(obj3);
        }
        throw new InterruptedException();
    }

    /* renamed from: h */
    public void mo15945h(Runnable runnable, Executor executor) {
        z63 z63;
        s13.m30500c(runnable, "Runnable was null.");
        s13.m30500c(executor, "Executor was null.");
        if (isDone() || (z63 = this.f17572h) == z63.f26688d) {
            m24698b(runnable, executor);
        }
        z63 z632 = new z63(runnable, executor);
        do {
            z632.f26691c = z63;
            if (!f17569l.mo15705c(this, z63, z632)) {
                z63 = this.f17572h;
            } else {
                return;
            }
        } while (z63 != z63.f26688d);
        m24698b(runnable, executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public String mo18099i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public boolean isCancelled() {
        return this.f17571g instanceof x63;
    }

    public boolean isDone() {
        Object obj = this.f17571g;
        return (!(obj instanceof b73)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo18102j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo17511t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m24694A(sb);
        } else {
            m24695B(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo18104u(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(mo18108z());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean mo18105w(V v) {
        if (v == null) {
            v = f17570m;
        }
        if (!f17569l.mo15706d(this, (Object) null, v)) {
            return false;
        }
        m24697D(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public boolean mo18106x(Throwable th) {
        Objects.requireNonNull(th);
        if (!f17569l.mo15706d(this, (Object) null, new y63(th))) {
            return false;
        }
        m24697D(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean mo18107y(d93<? extends V> d93) {
        b73 b73;
        y63 y63;
        Objects.requireNonNull(d93);
        Object obj = this.f17571g;
        if (obj == null) {
            if (d93.isDone()) {
                if (!f17569l.mo15706d(this, (Object) null, m24701f(d93))) {
                    return false;
                }
                m24697D(this);
                return true;
            }
            b73 = new b73(this, d93);
            if (f17569l.mo15706d(this, (Object) null, b73)) {
                try {
                    d93.mo15945h(b73, g83.INSTANCE);
                } catch (Throwable unused) {
                    y63 = y63.f26279b;
                }
                return true;
            }
            obj = this.f17571g;
        }
        if (obj instanceof x63) {
            d93.cancel(((x63) obj).f25695a);
        }
        return false;
        f17569l.mo15706d(this, b73, y63);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo18108z() {
        Object obj = this.f17571g;
        return (obj instanceof x63) && ((x63) obj).f25695a;
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f17571g;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof b73))) {
                return m24700e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                g73 g73 = this.f17573i;
                if (g73 != g73.f16985c) {
                    g73 g732 = new g73();
                    do {
                        w63 w63 = f17569l;
                        w63.mo15703a(g732, g73);
                        if (w63.mo15707e(this, g73, g732)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f17571g;
                                    if ((obj2 != null) && (!(obj2 instanceof b73))) {
                                        return m24700e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m24699c(g732);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m24699c(g732);
                        } else {
                            g73 = this.f17573i;
                        }
                    } while (g73 != g73.f16985c);
                }
                Object obj3 = this.f17571g;
                obj3.getClass();
                return m24700e(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f17571g;
                if ((obj4 != null) && (!(obj4 instanceof b73))) {
                    return m24700e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String h73 = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = sb2.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(h73).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(h73);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }
}
