package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jq0 {

    /* renamed from: a */
    private final ArrayList<C4896al> f18565a = new ArrayList<>();

    /* renamed from: b */
    private long f18566b;

    jq0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo18701a() {
        Iterator<C4896al> it = this.f18565a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> zze = it.next().zze();
            if (zze != null) {
                for (Map.Entry next : zze.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) next.getKey())) {
                            this.f18566b = Math.max(this.f18566b, Long.parseLong((String) ((List) next.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f18566b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18702b(C4896al alVar) {
        this.f18565a.add(alVar);
    }
}
