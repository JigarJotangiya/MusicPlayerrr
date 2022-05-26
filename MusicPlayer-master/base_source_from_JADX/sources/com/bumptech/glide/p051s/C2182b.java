package com.bumptech.glide.p051s;

import p082e.p098e.C3465a;
import p082e.p098e.C3478g;

/* renamed from: com.bumptech.glide.s.b */
/* compiled from: CachedHashCodeArrayMap */
public final class C2182b<K, V> extends C3465a<K, V> {

    /* renamed from: o */
    private int f7421o;

    public void clear() {
        this.f7421o = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f7421o == 0) {
            this.f7421o = super.hashCode();
        }
        return this.f7421o;
    }

    /* renamed from: j */
    public void mo8471j(C3478g<? extends K, ? extends V> gVar) {
        this.f7421o = 0;
        super.mo8471j(gVar);
    }

    /* renamed from: k */
    public V mo8472k(int i) {
        this.f7421o = 0;
        return super.mo8472k(i);
    }

    /* renamed from: l */
    public V mo8473l(int i, V v) {
        this.f7421o = 0;
        return super.mo8473l(i, v);
    }

    public V put(K k, V v) {
        this.f7421o = 0;
        return super.put(k, v);
    }
}
