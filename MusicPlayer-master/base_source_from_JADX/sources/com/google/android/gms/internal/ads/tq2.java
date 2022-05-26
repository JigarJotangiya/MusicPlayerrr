package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tq2 implements h81 {

    /* renamed from: g */
    private final HashSet<zk0> f23972g = new HashSet<>();

    /* renamed from: h */
    private final Context f23973h;

    /* renamed from: i */
    private final jl0 f23974i;

    public tq2(Context context, jl0 jl0) {
        this.f23973h = context;
        this.f23974i = jl0;
    }

    /* renamed from: a */
    public final Bundle mo21141a() {
        return this.f23974i.mo18661j(this.f23973h, this);
    }

    /* renamed from: b */
    public final synchronized void mo21142b(HashSet<zk0> hashSet) {
        this.f23972g.clear();
        this.f23972g.addAll(hashSet);
    }

    /* renamed from: c */
    public final synchronized void mo16370c(zzbew zzbew) {
        if (zzbew.f27186g != 3) {
            this.f23974i.mo18659h(this.f23972g);
        }
    }
}
