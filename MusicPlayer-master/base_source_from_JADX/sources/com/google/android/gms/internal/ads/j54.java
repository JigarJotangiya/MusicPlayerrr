package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j54 {

    /* renamed from: a */
    private final CopyOnWriteArrayList<i54> f18370a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public final void mo18547a(Handler handler, k54 k54) {
        mo18549c(k54);
        this.f18370a.add(new i54(handler, k54));
    }

    /* renamed from: b */
    public final void mo18548b(int i, long j, long j2) {
        Iterator<i54> it = this.f18370a.iterator();
        while (it.hasNext()) {
            i54 next = it.next();
            if (!next.f17899c) {
                next.f17897a.post(new h54(next, i, j, j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo18549c(k54 k54) {
        Iterator<i54> it = this.f18370a.iterator();
        while (it.hasNext()) {
            i54 next = it.next();
            if (next.f17898b == k54) {
                next.mo18297c();
                this.f18370a.remove(next);
            }
        }
    }
}
