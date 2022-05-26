package com.bumptech.glide.p046p;

import com.bumptech.glide.load.p030n.C1871i;
import com.bumptech.glide.load.p030n.C1899t;
import com.bumptech.glide.load.p036p.p042i.C2090g;
import com.bumptech.glide.p051s.C2192i;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p082e.p098e.C3465a;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.p.c */
/* compiled from: LoadPathCache */
public class C2138c {

    /* renamed from: c */
    private static final C1899t<?, ?, ?> f7294c = new C1899t(Object.class, Object.class, Object.class, Collections.singletonList(new C1871i(Object.class, Object.class, Object.class, Collections.emptyList(), new C2090g(), (C3700f<List<Throwable>>) null)), (C3700f<List<Throwable>>) null);

    /* renamed from: a */
    private final C3465a<C2192i, C1899t<?, ?, ?>> f7295a = new C3465a<>();

    /* renamed from: b */
    private final AtomicReference<C2192i> f7296b = new AtomicReference<>();

    /* renamed from: b */
    private C2192i m9990b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        C2192i andSet = this.f7296b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new C2192i();
        }
        andSet.mo8505a(cls, cls2, cls3);
        return andSet;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C1899t<Data, TResource, Transcode> mo8342a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1899t<Data, TResource, Transcode> tVar;
        C2192i b = m9990b(cls, cls2, cls3);
        synchronized (this.f7295a) {
            tVar = this.f7295a.get(b);
        }
        this.f7296b.set(b);
        return tVar;
    }

    /* renamed from: c */
    public boolean mo8343c(C1899t<?, ?, ?> tVar) {
        return f7294c.equals(tVar);
    }

    /* renamed from: d */
    public void mo8344d(Class<?> cls, Class<?> cls2, Class<?> cls3, C1899t<?, ?, ?> tVar) {
        synchronized (this.f7295a) {
            C3465a<C2192i, C1899t<?, ?, ?>> aVar = this.f7295a;
            C2192i iVar = new C2192i(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f7294c;
            }
            aVar.put(iVar, tVar);
        }
    }
}
