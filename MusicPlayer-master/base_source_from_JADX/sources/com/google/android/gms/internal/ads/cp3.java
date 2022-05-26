package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cp3 implements Iterator<Map.Entry> {

    /* renamed from: g */
    private int f15120g = -1;

    /* renamed from: h */
    private boolean f15121h;

    /* renamed from: i */
    private Iterator<Map.Entry> f15122i;

    /* renamed from: j */
    final /* synthetic */ hp3 f15123j;

    /* synthetic */ cp3(hp3 hp3, bp3 bp3) {
        this.f15123j = hp3;
    }

    /* renamed from: a */
    private final Iterator<Map.Entry> m22068a() {
        if (this.f15122i == null) {
            this.f15122i = this.f15123j.f17736i.entrySet().iterator();
        }
        return this.f15122i;
    }

    public final boolean hasNext() {
        if (this.f15120g + 1 >= this.f15123j.f17735h.size()) {
            return !this.f15123j.f17736i.isEmpty() && m22068a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f15121h = true;
        int i = this.f15120g + 1;
        this.f15120g = i;
        if (i < this.f15123j.f17735h.size()) {
            return (Map.Entry) this.f15123j.f17735h.get(this.f15120g);
        }
        return m22068a().next();
    }

    public final void remove() {
        if (this.f15121h) {
            this.f15121h = false;
            this.f15123j.m24873n();
            if (this.f15120g < this.f15123j.f17735h.size()) {
                hp3 hp3 = this.f15123j;
                int i = this.f15120g;
                this.f15120g = i - 1;
                Object unused = hp3.m24871l(i);
                return;
            }
            m22068a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
