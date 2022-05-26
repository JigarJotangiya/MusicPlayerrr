package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3159c;
import java.util.Map;
import java.util.Set;
import p082e.p098e.C3465a;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.x0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3221x0 {

    /* renamed from: a */
    private final C3465a<C3173b<?>, ConnectionResult> f10460a;

    /* renamed from: b */
    private final C3465a<C3173b<?>, String> f10461b;

    /* renamed from: c */
    private final C7471i<Map<C3173b<?>, String>> f10462c;

    /* renamed from: d */
    private int f10463d;

    /* renamed from: e */
    private boolean f10464e;

    /* renamed from: a */
    public final Set<C3173b<?>> mo11634a() {
        return this.f10460a.keySet();
    }

    /* renamed from: b */
    public final void mo11635b(C3173b<?> bVar, ConnectionResult connectionResult, String str) {
        this.f10460a.put(bVar, connectionResult);
        this.f10461b.put(bVar, str);
        this.f10463d--;
        if (!connectionResult.mo11450v0()) {
            this.f10464e = true;
        }
        if (this.f10463d != 0) {
            return;
        }
        if (this.f10464e) {
            this.f10462c.mo28353b(new C3159c(this.f10460a));
            return;
        }
        this.f10462c.mo28354c(this.f10461b);
    }
}
