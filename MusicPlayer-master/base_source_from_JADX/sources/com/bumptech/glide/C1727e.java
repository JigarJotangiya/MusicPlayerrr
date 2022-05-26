package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* compiled from: GlideExperiments */
public class C1727e {

    /* renamed from: a */
    private final Map<Class<?>, Object> f6471a;

    /* renamed from: com.bumptech.glide.e$a */
    /* compiled from: GlideExperiments */
    static final class C1728a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Map<Class<?>, Object> f6472a = new HashMap();

        C1728a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1727e mo7610b() {
            return new C1727e(this);
        }
    }

    C1727e(C1728a aVar) {
        this.f6471a = Collections.unmodifiableMap(new HashMap(aVar.f6472a));
    }

    /* renamed from: a */
    public boolean mo7609a(Class<? extends Object> cls) {
        return this.f6471a.containsKey(cls);
    }
}
