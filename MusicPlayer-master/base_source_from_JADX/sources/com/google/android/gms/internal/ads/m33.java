package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m33 extends a33 {

    /* renamed from: g */
    private final Object f19751g;

    /* renamed from: h */
    private int f19752h;

    /* renamed from: i */
    final /* synthetic */ p33 f19753i;

    m33(p33 p33, int i) {
        this.f19753i = p33;
        this.f19751g = p33.zzg(p33, i);
        this.f19752h = i;
    }

    /* renamed from: a */
    private final void m27114a() {
        int i = this.f19752h;
        if (i == -1 || i >= this.f19753i.size() || !q13.m29306a(this.f19751g, p33.zzg(this.f19753i, this.f19752h))) {
            this.f19752h = this.f19753i.m28876e(this.f19751g);
        }
    }

    public final Object getKey() {
        return this.f19751g;
    }

    public final Object getValue() {
        Map zzl = this.f19753i.zzl();
        if (zzl != null) {
            return zzl.get(this.f19751g);
        }
        m27114a();
        int i = this.f19752h;
        if (i == -1) {
            return null;
        }
        return p33.zzj(this.f19753i, i);
    }

    public final Object setValue(Object obj) {
        Map zzl = this.f19753i.zzl();
        if (zzl != null) {
            return zzl.put(this.f19751g, obj);
        }
        m27114a();
        int i = this.f19752h;
        if (i == -1) {
            this.f19753i.put(this.f19751g, obj);
            return null;
        }
        Object zzj = p33.zzj(this.f19753i, i);
        p33.zzn(this.f19753i, this.f19752h, obj);
        return zzj;
    }
}
