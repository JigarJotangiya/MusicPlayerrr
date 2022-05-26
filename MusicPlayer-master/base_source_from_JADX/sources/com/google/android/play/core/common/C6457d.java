package com.google.android.play.core.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.play.core.common.d */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6457d {

    /* renamed from: a */
    private final Map<String, Object> f29745a = new HashMap();

    /* renamed from: b */
    private final AtomicBoolean f29746b = new AtomicBoolean(false);

    /* renamed from: b */
    private final synchronized void m37827b() {
        this.f29745a.put("assetOnlyUpdates", Boolean.FALSE);
    }

    /* renamed from: a */
    public final synchronized boolean mo25384a(String str) {
        if (!this.f29746b.get()) {
            m37827b();
        }
        Object obj = this.f29745a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
