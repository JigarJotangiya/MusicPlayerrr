package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class b93<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: g */
    private static final Runnable f14378g = new a93((z83) null);

    /* renamed from: h */
    private static final Runnable f14379h = new a93((z83) null);

    b93() {
    }

    /* renamed from: a */
    private final void m21190a(Thread thread) {
        Runnable runnable = (Runnable) get();
        y83 y83 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof y83)) {
                if (runnable != f14379h) {
                    break;
                }
            } else {
                y83 = (y83) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f14379h;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(y83);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f14378g)) {
                        m21190a(currentThread);
                    }
                    zzd(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, f14378g)) {
                m21190a(currentThread);
            }
            if (z) {
                zze(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f14378g) {
            str = "running=[DONE]";
        } else if (runnable instanceof y83) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzb = zzb();
        StringBuilder sb2 = new StringBuilder(str.length() + 2 + String.valueOf(zzb).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(zzb);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract T zza() throws Exception;

    /* access modifiers changed from: package-private */
    public abstract String zzb();

    /* access modifiers changed from: package-private */
    public abstract void zzd(Throwable th);

    /* access modifiers changed from: package-private */
    public abstract void zze(T t);

    /* access modifiers changed from: package-private */
    public abstract boolean zzg();

    /* access modifiers changed from: package-private */
    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            y83 y83 = new y83(this, (x83) null);
            b93.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, y83)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f14378g)) == f14379h) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f14378g)) == f14379h) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
