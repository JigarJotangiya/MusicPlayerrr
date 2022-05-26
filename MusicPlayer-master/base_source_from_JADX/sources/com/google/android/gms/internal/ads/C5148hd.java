package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.hd */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5148hd<T> {

    /* renamed from: a */
    private final Map<String, AtomicReference<T>> f17617a = new HashMap();

    /* renamed from: a */
    public final AtomicReference<T> mo18123a(String str) {
        synchronized (this) {
            if (!this.f17617a.containsKey(str)) {
                this.f17617a.put(str, new AtomicReference());
            }
        }
        return this.f17617a.get(str);
    }
}
