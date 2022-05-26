package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y43<F, T> extends AbstractSequentialList<T> implements Serializable {
    final List<F> zza;
    final i13<? super F, ? extends T> zzb;

    y43(List<F> list, i13<? super F, ? extends T> i13) {
        this.zza = list;
        this.zzb = i13;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator<T> listIterator(int i) {
        return new x43(this, this.zza.listIterator(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
