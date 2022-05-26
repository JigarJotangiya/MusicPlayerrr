package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C2997g0;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ba0 {

    /* renamed from: b */
    static final C2997g0<g80> f14381b = new z90();

    /* renamed from: c */
    static final C2997g0<g80> f14382c = new aa0();

    /* renamed from: a */
    private final m90 f14383a;

    public ba0(Context context, zzcjf zzcjf, String str) {
        this.f14383a = new m90(context, zzcjf, str, f14381b, f14382c);
    }

    /* renamed from: a */
    public final <I, O> q90<I, O> mo16162a(String str, u90<I> u90, s90<O> s90) {
        return new fa0(this.f14383a, str, u90, s90);
    }

    /* renamed from: b */
    public final ka0 mo16163b() {
        return new ka0(this.f14383a);
    }
}
