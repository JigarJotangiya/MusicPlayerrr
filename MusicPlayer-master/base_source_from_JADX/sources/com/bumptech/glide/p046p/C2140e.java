package com.bumptech.glide.p046p;

import com.bumptech.glide.load.C1792k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.p.e */
/* compiled from: ResourceDecoderRegistry */
public class C2140e {

    /* renamed from: a */
    private final List<String> f7299a = new ArrayList();

    /* renamed from: b */
    private final Map<String, List<C2141a<?, ?>>> f7300b = new HashMap();

    /* renamed from: com.bumptech.glide.p.e$a */
    /* compiled from: ResourceDecoderRegistry */
    private static class C2141a<T, R> {

        /* renamed from: a */
        private final Class<T> f7301a;

        /* renamed from: b */
        final Class<R> f7302b;

        /* renamed from: c */
        final C1792k<T, R> f7303c;

        public C2141a(Class<T> cls, Class<R> cls2, C1792k<T, R> kVar) {
            this.f7301a = cls;
            this.f7302b = cls2;
            this.f7303c = kVar;
        }

        /* renamed from: a */
        public boolean mo8351a(Class<?> cls, Class<?> cls2) {
            return this.f7301a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f7302b);
        }
    }

    /* renamed from: c */
    private synchronized List<C2141a<?, ?>> m9996c(String str) {
        List<C2141a<?, ?>> list;
        if (!this.f7299a.contains(str)) {
            this.f7299a.add(str);
        }
        list = this.f7300b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f7300b.put(str, list);
        }
        return list;
    }

    /* renamed from: a */
    public synchronized <T, R> void mo8347a(String str, C1792k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        m9996c(str).add(new C2141a(cls, cls2, kVar));
    }

    /* renamed from: b */
    public synchronized <T, R> List<C1792k<T, R>> mo8348b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7299a) {
            List<C2141a> list = this.f7300b.get(str);
            if (list != null) {
                for (C2141a aVar : list) {
                    if (aVar.mo8351a(cls, cls2)) {
                        arrayList.add(aVar.f7303c);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo8349d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f7299a) {
            List<C2141a> list = this.f7300b.get(str);
            if (list != null) {
                for (C2141a aVar : list) {
                    if (aVar.mo8351a(cls, cls2) && !arrayList.contains(aVar.f7302b)) {
                        arrayList.add(aVar.f7302b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo8350e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f7299a);
        this.f7299a.clear();
        for (String add : list) {
            this.f7299a.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f7299a.add(str);
            }
        }
    }
}
