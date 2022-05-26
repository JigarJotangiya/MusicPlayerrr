package com.bumptech.glide.load.p036p.p042i;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.i.f */
/* compiled from: TranscoderRegistry */
public class C2088f {

    /* renamed from: a */
    private final List<C2089a<?, ?>> f7163a = new ArrayList();

    /* renamed from: com.bumptech.glide.load.p.i.f$a */
    /* compiled from: TranscoderRegistry */
    private static final class C2089a<Z, R> {

        /* renamed from: a */
        private final Class<Z> f7164a;

        /* renamed from: b */
        private final Class<R> f7165b;

        /* renamed from: c */
        final C2087e<Z, R> f7166c;

        C2089a(Class<Z> cls, Class<R> cls2, C2087e<Z, R> eVar) {
            this.f7164a = cls;
            this.f7165b = cls2;
            this.f7166c = eVar;
        }

        /* renamed from: a */
        public boolean mo8236a(Class<?> cls, Class<?> cls2) {
            return this.f7164a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7165b);
        }
    }

    /* renamed from: a */
    public synchronized <Z, R> C2087e<Z, R> mo8233a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C2090g.m9769b();
        }
        for (C2089a next : this.f7163a) {
            if (next.mo8236a(cls, cls2)) {
                return next.f7166c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    /* renamed from: b */
    public synchronized <Z, R> List<Class<R>> mo8234b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C2089a<?, ?> a : this.f7163a) {
            if (a.mo8236a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public synchronized <Z, R> void mo8235c(Class<Z> cls, Class<R> cls2, C2087e<Z, R> eVar) {
        this.f7163a.add(new C2089a(cls, cls2, eVar));
    }
}
