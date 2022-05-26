package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C2982c1;
import com.google.android.gms.ads.internal.util.C2997g0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m90 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f19804a = new Object();

    /* renamed from: b */
    private final Context f19805b;

    /* renamed from: c */
    private final String f19806c;

    /* renamed from: d */
    private final zzcjf f19807d;

    /* renamed from: e */
    private final C2997g0<g80> f19808e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public l90 f19809f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f19810g = 1;

    public m90(Context context, zzcjf zzcjf, String str, C2997g0<g80> g0Var, C2997g0<g80> g0Var2) {
        this.f19806c = str;
        this.f19805b = context.getApplicationContext();
        this.f19807d = zzcjf;
        this.f19808e = g0Var2;
    }

    /* renamed from: b */
    public final g90 mo19354b(C5737xa xaVar) {
        synchronized (this.f19804a) {
            synchronized (this.f19804a) {
                l90 l90 = this.f19809f;
                if (l90 != null && this.f19810g == 0) {
                    l90.mo21119e(new t80(this), r80.f22772a);
                }
            }
            l90 l902 = this.f19809f;
            if (l902 != null) {
                if (l902.mo21116a() != -1) {
                    int i = this.f19810g;
                    if (i == 0) {
                        g90 f = this.f19809f.mo19109f();
                        return f;
                    } else if (i == 1) {
                        this.f19810g = 2;
                        mo19355d((C5737xa) null);
                        g90 f2 = this.f19809f.mo19109f();
                        return f2;
                    } else {
                        g90 f3 = this.f19809f.mo19109f();
                        return f3;
                    }
                }
            }
            this.f19810g = 2;
            l90 d = mo19355d((C5737xa) null);
            this.f19809f = d;
            g90 f4 = d.mo19109f();
            return f4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final l90 mo19355d(C5737xa xaVar) {
        l90 l90 = new l90(this.f19808e);
        hm0.f17712e.execute(new v80(this, (C5737xa) null, l90));
        l90.mo21119e(new b90(this, l90), new c90(this, l90));
        return l90;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo19356h(com.google.android.gms.internal.ads.l90 r4, com.google.android.gms.internal.ads.g80 r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f19804a
            monitor-enter(r0)
            int r1 = r4.mo21116a()     // Catch:{ all -> 0x0028 }
            r2 = -1
            if (r1 == r2) goto L_0x0026
            int r1 = r4.mo21116a()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            r4.mo21117c()     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.e93 r4 = com.google.android.gms.internal.ads.hm0.f17712e     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.ads.u80 r1 = new com.google.android.gms.internal.ads.u80     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            r4.execute(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m90.mo19356h(com.google.android.gms.internal.ads.l90, com.google.android.gms.internal.ads.g80):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo19357i(C5737xa xaVar, l90 l90) {
        try {
            o80 o80 = new o80(this.f19805b, this.f19807d, (C5737xa) null, (C2925a) null);
            o80.mo17875D0(new q80(this, l90, o80));
            o80.mo19656z("/jsLoaded", new x80(this, l90, o80));
            C2982c1 c1Var = new C2982c1();
            y80 y80 = new y80(this, (C5737xa) null, o80, c1Var);
            c1Var.mo11005b(y80);
            o80.mo19656z("/requestReload", y80);
            if (this.f19806c.endsWith(".js")) {
                o80.mo17876V(this.f19806c);
            } else if (this.f19806c.startsWith("<html>")) {
                o80.mo17880v(this.f19806c);
            } else {
                o80.mo17874C0(this.f19806c);
            }
            C2979b2.f9980i.postDelayed(new a90(this, l90, o80), 60000);
        } catch (Throwable th) {
            ul0.m31860e("Error creating webview.", th);
            C2971s.m13213p().mo17571s(th, "SdkJavascriptFactory.loadJavascriptEngine");
            l90.mo21117c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo19358j(g80 g80) {
        if (g80.mo17878g()) {
            this.f19810g = 1;
        }
    }
}
