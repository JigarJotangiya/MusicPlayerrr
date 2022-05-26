package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cc2 implements sg2<rg2<Bundle>> {

    /* renamed from: a */
    private final Executor f14942a;

    /* renamed from: b */
    private final fl0 f14943b;

    cc2(Executor executor, fl0 fl0) {
        this.f14942a = executor;
        this.f14943b = fl0;
    }

    /* renamed from: a */
    public final d93<rg2<Bundle>> mo15767a() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22348I1)).booleanValue()) {
            return s83.m30607i(null);
        }
        return s83.m30611m(this.f14943b.mo17563j(), bc2.f14405a, this.f14942a);
    }
}
