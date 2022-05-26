package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o33 extends AbstractCollection {

    /* renamed from: g */
    final /* synthetic */ p33 f20889g;

    o33(p33 p33) {
        this.f20889g = p33;
    }

    public final void clear() {
        this.f20889g.clear();
    }

    public final Iterator iterator() {
        p33 p33 = this.f20889g;
        Map zzl = p33.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new h33(p33);
    }

    public final int size() {
        return this.f20889g.size();
    }
}
