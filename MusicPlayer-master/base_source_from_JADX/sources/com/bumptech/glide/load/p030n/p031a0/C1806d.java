package com.bumptech.glide.load.p030n.p031a0;

import com.bumptech.glide.load.p030n.p031a0.C1820m;
import com.bumptech.glide.p051s.C2194k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.n.a0.d */
/* compiled from: BaseKeyPool */
abstract class C1806d<T extends C1820m> {

    /* renamed from: a */
    private final Queue<T> f6596a = C2194k.m10276f(20);

    C1806d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo7784a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo7787b() {
        T t = (C1820m) this.f6596a.poll();
        return t == null ? mo7784a() : t;
    }

    /* renamed from: c */
    public void mo7788c(T t) {
        if (this.f6596a.size() < 20) {
            this.f6596a.offer(t);
        }
    }
}
