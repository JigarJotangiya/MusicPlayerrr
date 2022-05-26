package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lm2 {

    /* renamed from: e */
    private static lm2 f19459e;

    /* renamed from: a */
    private final Handler f19460a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<s54>> f19461b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f19462c = new Object();

    /* renamed from: d */
    private int f19463d = 0;

    private lm2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new hj2(this, (gi2) null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized lm2 m26785b(Context context) {
        lm2 lm2;
        synchronized (lm2.class) {
            if (f19459e == null) {
                f19459e = new lm2(context);
            }
            lm2 = f19459e;
        }
        return lm2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (com.google.android.gms.internal.ads.s54) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        com.google.android.gms.internal.ads.u54.m31669e(r2.f23346a, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r3.f19461b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f19461b.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m26786c(com.google.android.gms.internal.ads.lm2 r3, int r4) {
        /*
            java.lang.Object r0 = r3.f19462c
            monitor-enter(r0)
            int r1 = r3.f19463d     // Catch:{ all -> 0x0033 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r3.f19463d = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.s54>> r0 = r3.f19461b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.gms.internal.ads.s54 r2 = (com.google.android.gms.internal.ads.s54) r2
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.u54 r1 = r2.f23346a
            r1.m31672h(r4)
            goto L_0x0012
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<com.google.android.gms.internal.ads.s54>> r2 = r3.f19461b
            r2.remove(r1)
            goto L_0x0012
        L_0x0032:
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lm2.m26786c(com.google.android.gms.internal.ads.lm2, int):void");
    }

    /* renamed from: a */
    public final int mo19186a() {
        int i;
        synchronized (this.f19462c) {
            i = this.f19463d;
        }
        return i;
    }

    /* renamed from: d */
    public final void mo19187d(s54 s54) {
        Iterator<WeakReference<s54>> it = this.f19461b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f19461b.remove(next);
            }
        }
        this.f19461b.add(new WeakReference(s54));
        this.f19460a.post(new eg2(this, s54, (byte[]) null));
    }
}
