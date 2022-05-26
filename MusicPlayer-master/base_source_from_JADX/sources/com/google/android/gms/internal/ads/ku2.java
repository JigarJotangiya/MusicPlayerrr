package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ku2 implements gu2 {

    /* renamed from: a */
    private final gu2 f18993a;

    /* renamed from: b */
    private final Queue<fu2> f18994b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f18995c = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22373L5)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f18996d = new AtomicBoolean(false);

    public ku2(gu2 gu2, ScheduledExecutorService scheduledExecutorService) {
        this.f18993a = gu2;
        long intValue = (long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22366K5)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new ju2(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m26429c(ku2 ku2) {
        while (!ku2.f18994b.isEmpty()) {
            ku2.f18993a.mo18029a(ku2.f18994b.remove());
        }
    }

    /* renamed from: a */
    public final void mo18029a(fu2 fu2) {
        if (this.f18994b.size() < this.f18995c) {
            this.f18994b.offer(fu2);
        } else if (!this.f18996d.getAndSet(true)) {
            Queue<fu2> queue = this.f18994b;
            fu2 b = fu2.m23966b("dropped_event");
            Map<String, String> j = fu2.mo17745j();
            if (j.containsKey("action")) {
                b.mo17738a("dropped_action", j.get("action"));
            }
            queue.offer(b);
        }
    }

    /* renamed from: b */
    public final String mo18030b(fu2 fu2) {
        return this.f18993a.mo18030b(fu2);
    }
}
