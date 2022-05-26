package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dj2 implements sg2<ej2> {

    /* renamed from: a */
    private final fl0 f15638a;

    /* renamed from: b */
    private final boolean f15639b;

    /* renamed from: c */
    private final ScheduledExecutorService f15640c;

    /* renamed from: d */
    private final e93 f15641d;

    dj2(fl0 fl0, boolean z, vk0 vk0, e93 e93, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f15638a = fl0;
        this.f15639b = z;
        this.f15641d = e93;
        this.f15640c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final d93<ej2> mo15767a() {
        if (!s10.f23294a.mo20989e().booleanValue() && !this.f15639b) {
            return s83.m30607i(null);
        }
        return s83.m30604f(s83.m30613o(s83.m30611m(s83.m30607i(null), cj2.f14993a, this.f15641d), s10.f23295b.mo20989e().longValue(), TimeUnit.MILLISECONDS, this.f15640c), Exception.class, new bj2(this), this.f15641d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ej2 mo16939b(Exception exc) {
        this.f15638a.mo17571s(exc, "TrustlessTokenSignal");
        return null;
    }
}
