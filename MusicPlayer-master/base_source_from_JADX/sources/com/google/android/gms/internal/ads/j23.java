package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class j23 extends b53 {

    /* renamed from: g */
    final /* synthetic */ l23 f18334g;

    j23(l23 l23) {
        this.f18334g = l23;
    }

    public final boolean contains(Object obj) {
        Set entrySet = this.f18334g.f19165i.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Map mo16068d() {
        return this.f18334g;
    }

    public final Iterator<Map.Entry> iterator() {
        return new k23(this.f18334g);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        z23.zzo(this.f18334g.f19166j, entry.getKey());
        return true;
    }
}
