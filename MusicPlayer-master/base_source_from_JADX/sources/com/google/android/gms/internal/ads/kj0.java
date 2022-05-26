package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kj0 implements C5824zm {

    /* renamed from: g */
    private final Context f18888g;

    /* renamed from: h */
    private final Object f18889h;

    /* renamed from: i */
    private final String f18890i;

    /* renamed from: j */
    private boolean f18891j;

    public kj0(Context context, String str) {
        this.f18888g = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18890i = str;
        this.f18891j = false;
        this.f18889h = new Object();
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        mo18894b(xmVar.f25884j);
    }

    /* renamed from: a */
    public final String mo18893a() {
        return this.f18890i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18894b(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ck0 r0 = com.google.android.gms.ads.internal.C2971s.m13212o()
            android.content.Context r1 = r3.f18888g
            boolean r0 = r0.mo16673z(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f18889h
            monitor-enter(r0)
            boolean r1 = r3.f18891j     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f18891j = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f18890i     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f18891j     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.ck0 r4 = com.google.android.gms.ads.internal.C2971s.m13212o()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f18888g     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f18890i     // Catch:{ all -> 0x003f }
            r4.mo16660m(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.ck0 r4 = com.google.android.gms.ads.internal.C2971s.m13212o()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f18888g     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f18890i     // Catch:{ all -> 0x003f }
            r4.mo16661n(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kj0.mo18894b(boolean):void");
    }
}
