package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qi2 implements sg2<ri2> {

    /* renamed from: a */
    final ScheduledExecutorService f21930a;

    public qi2(bf0 bf0, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f21930a = scheduledExecutorService;
    }

    /* renamed from: a */
    public final d93<ri2> mo15767a() {
        return s83.m30611m(s83.m30613o(s83.m30607i(new Bundle()), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22611r2)).longValue(), TimeUnit.MILLISECONDS, this.f21930a), pi2.f21412a, hm0.f17708a);
    }
}
