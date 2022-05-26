package com.bumptech.glide.p046p;

import com.bumptech.glide.p051s.C2192i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p082e.p098e.C3465a;

/* renamed from: com.bumptech.glide.p.d */
/* compiled from: ModelToResourceClassCache */
public class C2139d {

    /* renamed from: a */
    private final AtomicReference<C2192i> f7297a = new AtomicReference<>();

    /* renamed from: b */
    private final C3465a<C2192i, List<Class<?>>> f7298b = new C3465a<>();

    /* renamed from: a */
    public List<Class<?>> mo8345a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        C2192i andSet = this.f7297a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C2192i(cls, cls2, cls3);
        } else {
            andSet.mo8505a(cls, cls2, cls3);
        }
        synchronized (this.f7298b) {
            list = this.f7298b.get(andSet);
        }
        this.f7297a.set(andSet);
        return list;
    }

    /* renamed from: b */
    public void mo8346b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f7298b) {
            this.f7298b.put(new C2192i(cls, cls2, cls3), list);
        }
    }
}
