package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class c83<V, C> extends q73<V, C> {

    /* renamed from: v */
    private List<a83<V>> f14897v;

    c83(b43<? extends d93<? extends V>> b43, boolean z) {
        super(b43, true, true);
        List<a83<V>> list;
        if (b43.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = z43.m34424a(b43.size());
        }
        for (int i = 0; i < b43.size(); i++) {
            list.add((Object) null);
        }
        this.f14897v = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo16547M(int i) {
        super.mo16547M(i);
        this.f14897v = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo16548S(int i, V v) {
        List<a83<V>> list = this.f14897v;
        if (list != null) {
            list.set(i, new a83(v));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo16549T() {
        List<a83<V>> list = this.f14897v;
        if (list != null) {
            mo18105w(mo16550X(list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public abstract C mo16550X(List<a83<V>> list);
}
