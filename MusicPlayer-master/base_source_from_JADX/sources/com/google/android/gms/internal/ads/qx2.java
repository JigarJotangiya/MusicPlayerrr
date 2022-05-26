package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qx2 {

    /* renamed from: a */
    private final BlockingQueue<Runnable> f22273a;

    /* renamed from: b */
    private final ThreadPoolExecutor f22274b;

    /* renamed from: c */
    private final ArrayDeque<px2> f22275c = new ArrayDeque<>();

    /* renamed from: d */
    private px2 f22276d = null;

    public qx2() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f22273a = linkedBlockingQueue;
        this.f22274b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m29772c() {
        px2 poll = this.f22275c.poll();
        this.f22276d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f22274b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo20526a(px2 px2) {
        this.f22276d = null;
        m29772c();
    }

    /* renamed from: b */
    public final void mo20527b(px2 px2) {
        px2.mo20333b(this);
        this.f22275c.add(px2);
        if (this.f22276d == null) {
            m29772c();
        }
    }
}
