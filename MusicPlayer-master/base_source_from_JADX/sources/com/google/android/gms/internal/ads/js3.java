package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class js3<T> {

    /* renamed from: a */
    private final List<ms3<T>> f18627a;

    /* renamed from: b */
    private final List<ms3<Collection<T>>> f18628b;

    /* synthetic */ js3(int i, int i2, is3 is3) {
        this.f18627a = vr3.m32679c(i);
        this.f18628b = vr3.m32679c(i2);
    }

    /* renamed from: a */
    public final js3<T> mo18730a(ms3<? extends Collection<? extends T>> ms3) {
        this.f18628b.add(ms3);
        return this;
    }

    /* renamed from: b */
    public final js3<T> mo18731b(ms3<? extends T> ms3) {
        this.f18627a.add(ms3);
        return this;
    }

    /* renamed from: c */
    public final ks3<T> mo18732c() {
        return new ks3<>(this.f18627a, this.f18628b, (is3) null);
    }
}
