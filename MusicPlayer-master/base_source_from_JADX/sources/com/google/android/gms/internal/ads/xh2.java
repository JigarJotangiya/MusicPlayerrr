package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xh2 implements sg2<yh2> {

    /* renamed from: a */
    private final fl0 f25831a;

    /* renamed from: b */
    private final ScheduledExecutorService f25832b;

    /* renamed from: c */
    private final Executor f25833c;

    public xh2(xk0 xk0, int i, Context context, fl0 fl0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f25831a = fl0;
        this.f25832b = scheduledExecutorService;
        this.f25833c = executor;
    }

    /* renamed from: a */
    public final d93<yh2> mo15767a() {
        return s83.m30604f((j83) s83.m30613o(s83.m30611m(j83.m25564E(s83.m30610l(new wh2(this), this.f25833c)), vh2.f24781a, this.f25833c), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22299C0)).longValue(), TimeUnit.MILLISECONDS, this.f25832b), Exception.class, new uh2(this), k93.m26167b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ yh2 mo22034b(Exception exc) {
        this.f25831a.mo17571s(exc, "AttestationTokenSignal");
        return null;
    }
}
