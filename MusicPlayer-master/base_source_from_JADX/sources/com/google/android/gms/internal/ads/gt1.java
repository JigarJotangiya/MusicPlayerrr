package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gt1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final mt1 f17248a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f17249b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<String, String> f17250c;

    public gt1(mt1 mt1, Executor executor) {
        this.f17248a = mt1;
        this.f17250c = mt1.mo19533c();
        this.f17249b = executor;
    }

    /* renamed from: a */
    public final ft1 mo18022a() {
        ft1 ft1 = new ft1(this);
        ft1 unused = ft1.f16756a.putAll(ft1.f16757b.f17250c);
        return ft1;
    }
}
