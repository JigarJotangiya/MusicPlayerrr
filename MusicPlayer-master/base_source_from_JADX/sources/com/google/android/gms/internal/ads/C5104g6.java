package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.g6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5104g6 implements C5510r5 {

    /* renamed from: a */
    private final Map<String, List<C5547s5<?>>> f16961a = new HashMap();

    /* renamed from: b */
    private final C5028e5 f16962b;

    /* renamed from: c */
    private final BlockingQueue<C5547s5<?>> f16963c;

    /* renamed from: d */
    private final C5214j5 f16964d;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.s5<?>>, com.google.android.gms.internal.ads.e5] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.s5<?>>, com.google.android.gms.internal.ads.j5] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5104g6(com.google.android.gms.internal.ads.C5028e5 r1, com.google.android.gms.internal.ads.C5028e5 r2, java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.C5547s5<?>> r3, com.google.android.gms.internal.ads.C5214j5 r4) {
        /*
            r0 = this;
            r0.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.f16961a = r4
            r0.f16964d = r3
            r0.f16962b = r1
            r0.f16963c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5104g6.<init>(com.google.android.gms.internal.ads.e5, java.util.concurrent.BlockingQueue, com.google.android.gms.internal.ads.j5, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo17864a(com.google.android.gms.internal.ads.C5547s5<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r6 = r6.mo20784q()     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r0 = r5.f16961a     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = r0.remove(r6)     // Catch:{ all -> 0x0062 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0060
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0060
            boolean r1 = com.google.android.gms.internal.ads.C5066f6.f16447b     // Catch:{ all -> 0x0062 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002f
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            int r4 = r0.size()     // Catch:{ all -> 0x0062 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0062 }
            r1[r3] = r4     // Catch:{ all -> 0x0062 }
            r1[r2] = r6     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "%d waiting requests for cacheKey=%s; resend to network"
            com.google.android.gms.internal.ads.C5066f6.m23483d(r4, r1)     // Catch:{ all -> 0x0062 }
        L_0x002f:
            java.lang.Object r1 = r0.remove(r3)     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.s5 r1 = (com.google.android.gms.internal.ads.C5547s5) r1     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r4 = r5.f16961a     // Catch:{ all -> 0x0062 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0062 }
            r1.mo20773B(r5)     // Catch:{ all -> 0x0062 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.s5<?>> r6 = r5.f16963c     // Catch:{ InterruptedException -> 0x0044 }
            r6.put(r1)     // Catch:{ InterruptedException -> 0x0044 }
            monitor-exit(r5)
            return
        L_0x0044:
            r6 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0062 }
            r0[r3] = r6     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "Couldn't add request to queue. %s"
            com.google.android.gms.internal.ads.C5066f6.m23481b(r6, r0)     // Catch:{ all -> 0x0062 }
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0062 }
            r6.interrupt()     // Catch:{ all -> 0x0062 }
            com.google.android.gms.internal.ads.e5 r6 = r5.f16962b     // Catch:{ all -> 0x0062 }
            r6.mo17118b()     // Catch:{ all -> 0x0062 }
            monitor-exit(r5)
            return
        L_0x0060:
            monitor-exit(r5)
            return
        L_0x0062:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5104g6.mo17864a(com.google.android.gms.internal.ads.s5):void");
    }

    /* renamed from: b */
    public final void mo17865b(C5547s5<?> s5Var, C5769y5<?> y5Var) {
        List<C5547s5> remove;
        C4917b5 b5Var = y5Var.f26265b;
        if (b5Var == null || b5Var.mo16064a(System.currentTimeMillis())) {
            mo17864a(s5Var);
            return;
        }
        String q = s5Var.mo20784q();
        synchronized (this) {
            remove = this.f16961a.remove(q);
        }
        if (remove != null) {
            if (C5066f6.f16447b) {
                C5066f6.m23483d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), q);
            }
            for (C5547s5 b : remove) {
                this.f16964d.mo18546b(b, y5Var, (Runnable) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo17866c(com.google.android.gms.internal.ads.C5547s5<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo20784q()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r1 = r5.f16961a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r1 = r5.f16961a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo20786t(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r6 = r5.f16961a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C5066f6.f16447b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "Request for cacheKey=%s is in flight, putting on hold."
            com.google.android.gms.internal.ads.C5066f6.m23480a(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.s5<?>>> r1 = r5.f16961a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo20773B(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C5066f6.f16447b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r6[r3] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "new request, sending to network %s"
            com.google.android.gms.internal.ads.C5066f6.m23480a(r0, r6)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5104g6.mo17866c(com.google.android.gms.internal.ads.s5):boolean");
    }
}
