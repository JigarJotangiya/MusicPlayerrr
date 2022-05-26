package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5454pn {

    /* renamed from: a */
    private final Object f21430a = new Object();

    /* renamed from: b */
    int f21431b;

    /* renamed from: c */
    private final List<C5417on> f21432c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C5417on mo20284a(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f21430a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.on> r1 = r8.f21432c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.internal.ads.ul0.m31857b(r9)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.on> r1 = r8.f21432c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004c
            java.util.List<com.google.android.gms.internal.ads.on> r9 = r8.f21432c     // Catch:{ all -> 0x0061 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0061 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L_0x0026:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.on r5 = (com.google.android.gms.internal.ads.C5417on) r5     // Catch:{ all -> 0x0061 }
            int r6 = r5.mo20033b()     // Catch:{ all -> 0x0061 }
            if (r6 <= r1) goto L_0x0039
            r4 = r3
        L_0x0039:
            if (r6 <= r1) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r1
        L_0x003e:
            if (r6 <= r1) goto L_0x0041
            r2 = r5
        L_0x0041:
            int r3 = r3 + 1
            r1 = r7
            goto L_0x0026
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.on> r9 = r8.f21432c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x004c:
            java.util.List<com.google.android.gms.internal.ads.on> r1 = r8.f21432c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.on r1 = (com.google.android.gms.internal.ads.C5417on) r1     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x005c
            java.util.List<com.google.android.gms.internal.ads.on> r9 = r8.f21432c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x005c:
            r1.mo20042i()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5454pn.mo20284a(boolean):com.google.android.gms.internal.ads.on");
    }

    /* renamed from: b */
    public final void mo20285b(C5417on onVar) {
        synchronized (this.f21430a) {
            if (this.f21432c.size() >= 10) {
                int size = this.f21432c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                ul0.m31857b(sb.toString());
                this.f21432c.remove(0);
            }
            int i = this.f21431b;
            this.f21431b = i + 1;
            onVar.mo20043j(i);
            onVar.mo20047n();
            this.f21432c.add(onVar);
        }
    }

    /* renamed from: c */
    public final boolean mo20286c(C5417on onVar) {
        synchronized (this.f21430a) {
            Iterator<C5417on> it = this.f21432c.iterator();
            while (it.hasNext()) {
                C5417on next = it.next();
                if (!C2971s.m13213p().mo17562h().mo11067K()) {
                    if (onVar != next && next.mo20035d().equals(onVar.mo20035d())) {
                        it.remove();
                        return true;
                    }
                } else if (!C2971s.m13213p().mo17562h().mo11100s() && onVar != next && next.mo20038f().equals(onVar.mo20038f())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo20287d(C5417on onVar) {
        synchronized (this.f21430a) {
            if (this.f21432c.contains(onVar)) {
                return true;
            }
            return false;
        }
    }
}
