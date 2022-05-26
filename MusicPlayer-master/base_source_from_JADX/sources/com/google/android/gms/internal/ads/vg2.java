package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vg2<T> {

    /* renamed from: a */
    private final Set<sg2<? extends rg2<T>>> f24766a;

    /* renamed from: b */
    private final Executor f24767b;

    public vg2(Executor executor, Set<sg2<? extends rg2<T>>> set) {
        this.f24767b = executor;
        this.f24766a = set;
    }

    /* renamed from: a */
    public final d93<T> mo21501a(T t) {
        ArrayList arrayList = new ArrayList(this.f24766a.size());
        for (sg2 next : this.f24766a) {
            d93 a = next.mo15767a();
            if (h10.f17486a.mo20989e().booleanValue()) {
                a.mo15945h(new tg2(next, C2971s.m13198a().mo11989b()), hm0.f17713f);
            }
            arrayList.add(a);
        }
        return s83.m30601c(arrayList).mo20613a(new ug2(arrayList, t), this.f24767b);
    }
}
