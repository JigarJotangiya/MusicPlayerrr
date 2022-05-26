package com.bumptech.glide.p046p;

import com.bumptech.glide.load.C1793l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.p.f */
/* compiled from: ResourceEncoderRegistry */
public class C2142f {

    /* renamed from: a */
    private final List<C2143a<?>> f7304a = new ArrayList();

    /* renamed from: com.bumptech.glide.p.f$a */
    /* compiled from: ResourceEncoderRegistry */
    private static final class C2143a<T> {

        /* renamed from: a */
        private final Class<T> f7305a;

        /* renamed from: b */
        final C1793l<T> f7306b;

        C2143a(Class<T> cls, C1793l<T> lVar) {
            this.f7305a = cls;
            this.f7306b = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8354a(Class<?> cls) {
            return this.f7305a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo8352a(Class<Z> cls, C1793l<Z> lVar) {
        this.f7304a.add(new C2143a(cls, lVar));
    }

    /* renamed from: b */
    public synchronized <Z> C1793l<Z> mo8353b(Class<Z> cls) {
        int size = this.f7304a.size();
        for (int i = 0; i < size; i++) {
            C2143a aVar = this.f7304a.get(i);
            if (aVar.mo8354a(cls)) {
                return aVar.f7306b;
            }
        }
        return null;
    }
}
