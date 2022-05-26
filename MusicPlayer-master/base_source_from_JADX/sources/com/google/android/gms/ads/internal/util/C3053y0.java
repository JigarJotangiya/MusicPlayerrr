package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.ads.internal.util.y0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3053y0 {

    /* renamed from: a */
    final Map<Integer, Bitmap> f10133a = new ConcurrentHashMap();

    public C3053y0() {
        new AtomicInteger(0);
    }

    /* renamed from: a */
    public final Bitmap mo11146a(Integer num) {
        return this.f10133a.get(num);
    }
}
