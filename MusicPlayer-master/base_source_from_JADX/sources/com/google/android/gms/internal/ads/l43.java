package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l43 extends j63 {

    /* renamed from: g */
    final Iterator<? extends b43> f19200g;

    /* renamed from: h */
    Iterator f19201h = t43.f23747j;

    /* renamed from: i */
    final /* synthetic */ p43 f19202i;

    l43(p43 p43) {
        this.f19202i = p43;
        this.f19200g = ((g43) p43.zzb.values()).listIterator(0);
    }

    public final boolean hasNext() {
        return this.f19201h.hasNext() || this.f19200g.hasNext();
    }

    public final Object next() {
        if (!this.f19201h.hasNext()) {
            this.f19201h = ((b43) this.f19200g.next()).iterator();
        }
        return this.f19201h.next();
    }
}
