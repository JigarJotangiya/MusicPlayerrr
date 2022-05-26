package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class iz3 {

    /* renamed from: a */
    public final int f18288a;

    /* renamed from: b */
    public final f24 f18289b;

    /* renamed from: c */
    private final CopyOnWriteArrayList<hz3> f18290c;

    public iz3() {
        this(new CopyOnWriteArrayList(), 0, (f24) null);
    }

    private iz3(CopyOnWriteArrayList<hz3> copyOnWriteArrayList, int i, f24 f24) {
        this.f18290c = copyOnWriteArrayList;
        this.f18288a = i;
        this.f18289b = f24;
    }

    /* renamed from: a */
    public final iz3 mo18525a(int i, f24 f24) {
        return new iz3(this.f18290c, i, f24);
    }

    /* renamed from: b */
    public final void mo18526b(Handler handler, jz3 jz3) {
        this.f18290c.add(new hz3(handler, jz3));
    }

    /* renamed from: c */
    public final void mo18527c(jz3 jz3) {
        Iterator<hz3> it = this.f18290c.iterator();
        while (it.hasNext()) {
            hz3 next = it.next();
            if (next.f17826a == jz3) {
                this.f18290c.remove(next);
            }
        }
    }
}
