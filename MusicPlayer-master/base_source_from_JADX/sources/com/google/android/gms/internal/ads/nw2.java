package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nw2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b */
    private static final nw2 f20749b = new nw2();

    /* renamed from: a */
    private Context f20750a;

    private nw2() {
    }

    /* renamed from: b */
    public static nw2 m28123b() {
        return f20749b;
    }

    /* renamed from: a */
    public final Context mo19858a() {
        return this.f20750a;
    }

    /* renamed from: c */
    public final void mo19859c(Context context) {
        this.f20750a = context != null ? context.getApplicationContext() : null;
    }
}
