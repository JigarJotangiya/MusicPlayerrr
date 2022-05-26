package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l33 extends AbstractSet {

    /* renamed from: g */
    final /* synthetic */ p33 f19178g;

    l33(p33 p33) {
        this.f19178g = p33;
    }

    public final void clear() {
        this.f19178g.clear();
    }

    public final boolean contains(Object obj) {
        return this.f19178g.containsKey(obj);
    }

    public final Iterator iterator() {
        p33 p33 = this.f19178g;
        Map zzl = p33.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new f33(p33);
    }

    public final boolean remove(Object obj) {
        Map zzl = this.f19178g.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        return this.f19178g.m28878g(obj) != p33.f21318m;
    }

    public final int size() {
        return this.f19178g.size();
    }
}
