package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x14 {

    /* renamed from: a */
    private static final AtomicLong f25626a = new AtomicLong();

    public x14(long j, uf1 uf1, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
    }

    /* renamed from: a */
    public static long m33513a() {
        return f25626a.getAndIncrement();
    }
}
