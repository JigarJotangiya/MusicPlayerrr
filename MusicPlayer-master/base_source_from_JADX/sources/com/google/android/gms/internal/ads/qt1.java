package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qt1 {

    /* renamed from: a */
    private final C3024o1 f22020a;

    /* renamed from: b */
    private final List<Map<String, String>> f22021b = new ArrayList();

    /* renamed from: c */
    private boolean f22022c = false;

    /* renamed from: d */
    private boolean f22023d = false;

    /* renamed from: e */
    private final String f22024e;

    /* renamed from: f */
    private final mt1 f22025f;

    public qt1(String str, mt1 mt1) {
        this.f22024e = str;
        this.f22025f = mt1;
        this.f22020a = C2971s.m13213p().mo17562h();
    }

    /* renamed from: f */
    private final Map<String, String> m29683f() {
        String str;
        Map<String, String> c = this.f22025f.mo19533c();
        c.put("tms", Long.toString(C2971s.m13198a().mo11989b(), 10));
        if (this.f22020a.mo11065E()) {
            str = BuildConfig.FLAVOR;
        } else {
            str = this.f22024e;
        }
        c.put("tid", str);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20505a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22594p1     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22352I5     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.util.Map r0 = r3.m29683f()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "rqe"
            r0.put(r4, r5)     // Catch:{ all -> 0x0044 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f22021b     // Catch:{ all -> 0x0044 }
            r4.add(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt1.mo20505a(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20506b(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22594p1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22352I5     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m29683f()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f22021b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt1.mo20506b(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20507c(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22594p1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22352I5     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m29683f()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r4 = r3.f22021b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt1.mo20507c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20508d() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22594p1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22352I5     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            boolean r0 = r3.f22023d     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0057
            java.util.Map r0 = r3.m29683f()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x005b }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f22021b     // Catch:{ all -> 0x005b }
            r1.add(r0)     // Catch:{ all -> 0x005b }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r0 = r3.f22021b     // Catch:{ all -> 0x005b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005b }
        L_0x0040:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x005b }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.mt1 r2 = r3.f22025f     // Catch:{ all -> 0x005b }
            r2.mo20114b(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0040
        L_0x0052:
            r0 = 1
            r3.f22023d = r0     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            return
        L_0x0057:
            monitor-exit(r3)
            return
        L_0x0059:
            monitor-exit(r3)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt1.mo20508d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo20509e() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22594p1     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22352I5     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo20153b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0041
        L_0x0026:
            boolean r0 = r3.f22022c     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x003f
            java.util.Map r0 = r3.m29683f()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.List<java.util.Map<java.lang.String, java.lang.String>> r1 = r3.f22021b     // Catch:{ all -> 0x0043 }
            r1.add(r0)     // Catch:{ all -> 0x0043 }
            r0 = 1
            r3.f22022c = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)
            return
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qt1.mo20509e():void");
    }
}
