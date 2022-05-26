package com.bumptech.glide.p046p;

import com.bumptech.glide.load.C1747d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.a */
/* compiled from: EncoderRegistry */
public class C2135a {

    /* renamed from: a */
    private final List<C2136a<?>> f7290a = new ArrayList();

    /* renamed from: com.bumptech.glide.p.a$a */
    /* compiled from: EncoderRegistry */
    private static final class C2136a<T> {

        /* renamed from: a */
        private final Class<T> f7291a;

        /* renamed from: b */
        final C1747d<T> f7292b;

        C2136a(Class<T> cls, C1747d<T> dVar) {
            this.f7291a = cls;
            this.f7292b = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8339a(Class<?> cls) {
            return this.f7291a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo8337a(Class<T> cls, C1747d<T> dVar) {
        this.f7290a.add(new C2136a(cls, dVar));
    }

    /* renamed from: b */
    public synchronized <T> C1747d<T> mo8338b(Class<T> cls) {
        for (C2136a next : this.f7290a) {
            if (next.mo8339a(cls)) {
                return next.f7292b;
            }
        }
        return null;
    }
}
