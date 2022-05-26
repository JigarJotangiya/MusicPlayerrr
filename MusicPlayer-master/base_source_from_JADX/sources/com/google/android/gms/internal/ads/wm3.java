package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wm3<F, T> extends AbstractList<T> {

    /* renamed from: g */
    private final List<F> f25462g;

    public wm3(List<F> list, vm3<F, T> vm3) {
        this.f25462g = list;
    }

    public final T get(int i) {
        T zzb = C5605tq.zzb(((Integer) this.f25462g.get(i)).intValue());
        return zzb == null ? C5605tq.AD_FORMAT_TYPE_UNSPECIFIED : zzb;
    }

    public final int size() {
        return this.f25462g.size();
    }
}
