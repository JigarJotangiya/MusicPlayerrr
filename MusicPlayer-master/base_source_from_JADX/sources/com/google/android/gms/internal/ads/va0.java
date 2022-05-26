package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class va0 {

    /* renamed from: b */
    private static va0 f24658b;

    /* renamed from: a */
    private final AtomicBoolean f24659a = new AtomicBoolean(false);

    va0() {
    }

    /* renamed from: a */
    public static va0 m32249a() {
        if (f24658b == null) {
            f24658b = new va0();
        }
        return f24658b;
    }

    /* renamed from: b */
    public final Thread mo21451b(Context context, String str) {
        if (!this.f24659a.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new ta0(this, context, str));
        thread.start();
        return thread;
    }
}
