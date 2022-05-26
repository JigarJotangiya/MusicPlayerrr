package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1786g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.s */
/* compiled from: Jobs */
final class C1898s {

    /* renamed from: a */
    private final Map<C1786g, C1884l<?>> f6847a = new HashMap();

    /* renamed from: b */
    private final Map<C1786g, C1884l<?>> f6848b = new HashMap();

    C1898s() {
    }

    /* renamed from: b */
    private Map<C1786g, C1884l<?>> m9183b(boolean z) {
        return z ? this.f6848b : this.f6847a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1884l<?> mo7990a(C1786g gVar, boolean z) {
        return m9183b(z).get(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7991c(C1786g gVar, C1884l<?> lVar) {
        m9183b(lVar.mo7947p()).put(gVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7992d(C1786g gVar, C1884l<?> lVar) {
        Map<C1786g, C1884l<?>> b = m9183b(lVar.mo7947p());
        if (lVar.equals(b.get(gVar))) {
            b.remove(gVar);
        }
    }
}
