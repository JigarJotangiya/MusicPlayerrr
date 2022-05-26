package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.C2910d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class u40 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2910d.C2912b f24173a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2910d.C2911a f24174b;

    /* renamed from: c */
    private C2910d f24175c;

    public u40(C2910d.C2912b bVar, C2910d.C2911a aVar) {
        this.f24173a = bVar;
        this.f24174b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized C2910d m31639f(j30 j30) {
        C2910d dVar = this.f24175c;
        if (dVar != null) {
            return dVar;
        }
        k30 k30 = new k30(j30);
        this.f24175c = k30;
        return k30;
    }

    /* renamed from: d */
    public final t30 mo21216d() {
        if (this.f24174b == null) {
            return null;
        }
        return new r40(this, (q40) null);
    }

    /* renamed from: e */
    public final w30 mo21217e() {
        return new t40(this, (s40) null);
    }
}
