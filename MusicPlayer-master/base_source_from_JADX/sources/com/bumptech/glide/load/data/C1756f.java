package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.p051s.C2193j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.f */
/* compiled from: DataRewinderRegistry */
public class C1756f {

    /* renamed from: b */
    private static final C1754e.C1755a<?> f6528b = new C1757a();

    /* renamed from: a */
    private final Map<Class<?>, C1754e.C1755a<?>> f6529a = new HashMap();

    /* renamed from: com.bumptech.glide.load.data.f$a */
    /* compiled from: DataRewinderRegistry */
    class C1757a implements C1754e.C1755a<Object> {
        C1757a() {
        }

        /* renamed from: a */
        public Class<Object> mo7685a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: b */
        public C1754e<Object> mo7686b(Object obj) {
            return new C1758b(obj);
        }
    }

    /* renamed from: com.bumptech.glide.load.data.f$b */
    /* compiled from: DataRewinderRegistry */
    private static final class C1758b implements C1754e<Object> {

        /* renamed from: a */
        private final Object f6530a;

        C1758b(Object obj) {
            this.f6530a = obj;
        }

        /* renamed from: a */
        public Object mo7681a() {
            return this.f6530a;
        }

        /* renamed from: b */
        public void mo7682b() {
        }
    }

    /* renamed from: a */
    public synchronized <T> C1754e<T> mo7706a(T t) {
        C1754e.C1755a<?> aVar;
        C2193j.m10269d(t);
        aVar = this.f6529a.get(t.getClass());
        if (aVar == null) {
            Iterator<C1754e.C1755a<?>> it = this.f6529a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1754e.C1755a<?> next = it.next();
                if (next.mo7685a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f6528b;
        }
        return aVar.mo7686b(t);
    }

    /* renamed from: b */
    public synchronized void mo7707b(C1754e.C1755a<?> aVar) {
        this.f6529a.put(aVar.mo7685a(), aVar);
    }
}
