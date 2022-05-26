package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v41 {

    /* renamed from: a */
    private final Executor f24571a;

    /* renamed from: b */
    private final ScheduledExecutorService f24572b;

    /* renamed from: c */
    private final d93<o41> f24573c;

    /* renamed from: d */
    private volatile boolean f24574d = true;

    public v41(Executor executor, ScheduledExecutorService scheduledExecutorService, d93<o41> d93) {
        this.f24571a = executor;
        this.f24572b = scheduledExecutorService;
        this.f24573c = d93;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m32146b(v41 v41, List list, o83 o83) {
        if (list == null || list.isEmpty()) {
            v41.f24571a.execute(new s41(o83));
            return;
        }
        d93<O> i = s83.m30607i(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i = s83.m30612n(s83.m30605g(i, Throwable.class, new q41(o83), v41.f24571a), new p41(v41, o83, (d93) it.next()), v41.f24571a);
        }
        s83.m30616r(i, new u41(v41, o83), v41.f24571a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ d93 mo21420a(o83 o83, d93 d93, g41 g41) throws Exception {
        if (g41 != null) {
            o83.mo10677a(g41);
        }
        return s83.m30613o(d93, r10.f22702a.mo20989e().longValue(), TimeUnit.MILLISECONDS, this.f24572b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo21421d() {
        this.f24574d = false;
    }

    /* renamed from: e */
    public final void mo21422e(o83<g41> o83) {
        s83.m30616r(this.f24573c, new t41(this, o83), this.f24571a);
    }

    /* renamed from: f */
    public final boolean mo21423f() {
        return this.f24574d;
    }
}
