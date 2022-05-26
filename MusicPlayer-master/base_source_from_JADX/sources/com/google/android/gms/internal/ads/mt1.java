package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mt1 extends ot1 {

    /* renamed from: f */
    private final pu2 f20158f;

    public mt1(Executor executor, am0 am0, pu2 pu2, ru2 ru2) {
        super(executor, am0, ru2);
        this.f20158f = pu2;
        pu2.mo20320a(this.f21140a);
    }

    /* renamed from: c */
    public final Map<String, String> mo19533c() {
        return new HashMap(this.f21140a);
    }
}
