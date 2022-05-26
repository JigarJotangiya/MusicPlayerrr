package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.common.util.C3359d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m01 implements C5824zm, a91, C2958q, z81 {

    /* renamed from: g */
    private final h01 f19677g;

    /* renamed from: h */
    private final i01 f19678h;

    /* renamed from: i */
    private final Set<pr0> f19679i = new HashSet();

    /* renamed from: j */
    private final na0<JSONObject, JSONObject> f19680j;

    /* renamed from: k */
    private final Executor f19681k;

    /* renamed from: l */
    private final C3359d f19682l;

    /* renamed from: m */
    private final AtomicBoolean f19683m = new AtomicBoolean(false);

    /* renamed from: n */
    private final l01 f19684n = new l01();

    /* renamed from: o */
    private boolean f19685o = false;

    /* renamed from: p */
    private WeakReference<?> f19686p = new WeakReference<>(this);

    public m01(ka0 ka0, i01 i01, Executor executor, h01 h01, C3359d dVar) {
        this.f19677g = h01;
        v90<JSONObject> v90 = y90.f26304b;
        this.f19680j = ka0.mo18873a("google.afma.activeView.handleUpdate", v90, v90);
        this.f19678h = i01;
        this.f19681k = executor;
        this.f19682l = dVar;
    }

    /* renamed from: g */
    private final void m27018g() {
        for (pr0 f : this.f19679i) {
            this.f19677g.mo18054f(f);
        }
        this.f19677g.mo18053e();
    }

    /* renamed from: F5 */
    public final synchronized void mo10899F5() {
        this.f19684n.f19129b = false;
        mo19312c();
    }

    /* renamed from: H0 */
    public final synchronized void mo16484H0(C5749xm xmVar) {
        l01 l01 = this.f19684n;
        l01.f19128a = xmVar.f25884j;
        l01.f19133f = xmVar;
        mo19312c();
    }

    /* renamed from: a */
    public final void mo10900a() {
    }

    /* renamed from: b */
    public final synchronized void mo15713b(Context context) {
        this.f19684n.f19129b = true;
        mo19312c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19312c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.ref.WeakReference<?> r0 = r5.f19686p     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005b
            boolean r0 = r5.f19685o     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0059
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f19683m     // Catch:{ all -> 0x0060 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.l01 r0 = r5.f19684n     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.common.util.d r1 = r5.f19682l     // Catch:{ Exception -> 0x0051 }
            long r1 = r1.mo11989b()     // Catch:{ Exception -> 0x0051 }
            r0.f19131d = r1     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.i01 r0 = r5.f19678h     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.l01 r1 = r5.f19684n     // Catch:{ Exception -> 0x0051 }
            org.json.JSONObject r0 = r0.mo18249a(r1)     // Catch:{ Exception -> 0x0051 }
            java.util.Set<com.google.android.gms.internal.ads.pr0> r1 = r5.f19679i     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0051 }
        L_0x002d:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0051 }
            if (r2 == 0) goto L_0x0044
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.pr0 r2 = (com.google.android.gms.internal.ads.pr0) r2     // Catch:{ Exception -> 0x0051 }
            java.util.concurrent.Executor r3 = r5.f19681k     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.k01 r4 = new com.google.android.gms.internal.ads.k01     // Catch:{ Exception -> 0x0051 }
            r4.<init>(r2, r0)     // Catch:{ Exception -> 0x0051 }
            r3.execute(r4)     // Catch:{ Exception -> 0x0051 }
            goto L_0x002d
        L_0x0044:
            com.google.android.gms.internal.ads.na0<org.json.JSONObject, org.json.JSONObject> r1 = r5.f19680j     // Catch:{ Exception -> 0x0051 }
            com.google.android.gms.internal.ads.d93 r0 = r1.mo19664a(r0)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "ActiveViewListener.callActiveViewJs"
            com.google.android.gms.internal.ads.km0.m26272b(r0, r1)     // Catch:{ Exception -> 0x0051 }
            monitor-exit(r5)
            return
        L_0x0051:
            r0 = move-exception
            java.lang.String r1 = "Failed to call ActiveViewJS"
            com.google.android.gms.ads.internal.util.C3018m1.m13389l(r1, r0)     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0059:
            monitor-exit(r5)
            return
        L_0x005b:
            r5.mo19315f()     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)
            return
        L_0x0060:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m01.mo19312c():void");
    }

    /* renamed from: d */
    public final synchronized void mo19313d(pr0 pr0) {
        this.f19679i.add(pr0);
        this.f19677g.mo18052d(pr0);
    }

    /* renamed from: e */
    public final void mo19314e(Object obj) {
        this.f19686p = new WeakReference<>(obj);
    }

    /* renamed from: f */
    public final synchronized void mo19315f() {
        m27018g();
        this.f19685o = true;
    }

    /* renamed from: j */
    public final synchronized void mo15614j() {
        if (this.f19683m.compareAndSet(false, true)) {
            this.f19677g.mo18051c(this);
            mo19312c();
        }
    }

    /* renamed from: o */
    public final synchronized void mo15714o(Context context) {
        this.f19684n.f19129b = false;
        mo19312c();
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
    }

    /* renamed from: u */
    public final synchronized void mo15715u(Context context) {
        this.f19684n.f19132e = "u";
        mo19312c();
        m27018g();
        this.f19685o = true;
    }

    /* renamed from: y3 */
    public final synchronized void mo10902y3() {
        this.f19684n.f19129b = true;
        mo19312c();
    }

    /* renamed from: z */
    public final void mo10903z(int i) {
    }

    public final void zze() {
    }
}
