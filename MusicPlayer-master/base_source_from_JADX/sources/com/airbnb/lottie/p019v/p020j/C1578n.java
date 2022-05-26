package com.airbnb.lottie.p019v.p020j;

import com.airbnb.lottie.p027z.C1688a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.j.n */
/* compiled from: BaseAnimatableValue */
abstract class C1578n<V, O> implements C1577m<V, O> {

    /* renamed from: a */
    final List<C1688a<V>> f6025a;

    C1578n(V v) {
        this(Collections.singletonList(new C1688a(v)));
    }

    /* renamed from: b */
    public List<C1688a<V>> mo7246b() {
        return this.f6025a;
    }

    /* renamed from: c */
    public boolean mo7247c() {
        return this.f6025a.isEmpty() || (this.f6025a.size() == 1 && this.f6025a.get(0).mo7505h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f6025a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f6025a.toArray()));
        }
        return sb.toString();
    }

    C1578n(List<C1688a<V>> list) {
        this.f6025a = list;
    }
}
