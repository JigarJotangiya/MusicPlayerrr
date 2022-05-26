package com.bumptech.glide;

import com.bumptech.glide.load.C1747d;
import com.bumptech.glide.load.C1792k;
import com.bumptech.glide.load.C1793l;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1754e;
import com.bumptech.glide.load.data.C1756f;
import com.bumptech.glide.load.p030n.C1871i;
import com.bumptech.glide.load.p030n.C1899t;
import com.bumptech.glide.load.p030n.C1902v;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p034o.C1952o;
import com.bumptech.glide.load.p034o.C1953p;
import com.bumptech.glide.load.p036p.p042i.C2087e;
import com.bumptech.glide.load.p036p.p042i.C2088f;
import com.bumptech.glide.p046p.C2135a;
import com.bumptech.glide.p046p.C2137b;
import com.bumptech.glide.p046p.C2138c;
import com.bumptech.glide.p046p.C2139d;
import com.bumptech.glide.p046p.C2140e;
import com.bumptech.glide.p046p.C2142f;
import com.bumptech.glide.p051s.p052l.C2196a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.i */
/* compiled from: Registry */
public class C1732i {

    /* renamed from: a */
    private final C1953p f6475a;

    /* renamed from: b */
    private final C2135a f6476b;

    /* renamed from: c */
    private final C2140e f6477c;

    /* renamed from: d */
    private final C2142f f6478d;

    /* renamed from: e */
    private final C1756f f6479e;

    /* renamed from: f */
    private final C2088f f6480f;

    /* renamed from: g */
    private final C2137b f6481g;

    /* renamed from: h */
    private final C2139d f6482h = new C2139d();

    /* renamed from: i */
    private final C2138c f6483i = new C2138c();

    /* renamed from: j */
    private final C3700f<List<Throwable>> f6484j;

    /* renamed from: com.bumptech.glide.i$a */
    /* compiled from: Registry */
    public static class C1733a extends RuntimeException {
        public C1733a(String str) {
            super(str);
        }
    }

    /* renamed from: com.bumptech.glide.i$b */
    /* compiled from: Registry */
    public static final class C1734b extends C1733a {
        public C1734b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: com.bumptech.glide.i$c */
    /* compiled from: Registry */
    public static class C1735c extends C1733a {
        public C1735c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> C1735c(M m, List<C1950n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public C1735c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* renamed from: com.bumptech.glide.i$d */
    /* compiled from: Registry */
    public static class C1736d extends C1733a {
        public C1736d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: com.bumptech.glide.i$e */
    /* compiled from: Registry */
    public static class C1737e extends C1733a {
        public C1737e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public C1732i() {
        C3700f<List<Throwable>> e = C2196a.m10298e();
        this.f6484j = e;
        this.f6475a = new C1953p(e);
        this.f6476b = new C2135a();
        this.f6477c = new C2140e();
        this.f6478d = new C2142f();
        this.f6479e = new C1756f();
        this.f6480f = new C2088f();
        this.f6481g = new C2137b();
        mo7628r(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C1871i<Data, TResource, Transcode>> m8627f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.f6477c.mo8349d(cls, cls2)) {
            for (Class next2 : this.f6480f.mo8234b(next, cls3)) {
                arrayList.add(new C1871i(cls, next, next2, this.f6477c.mo8348b(cls, next), this.f6480f.mo8233a(next, next2), this.f6484j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> C1732i mo7612a(Class<Data> cls, C1747d<Data> dVar) {
        this.f6476b.mo8337a(cls, dVar);
        return this;
    }

    /* renamed from: b */
    public <TResource> C1732i mo7613b(Class<TResource> cls, C1793l<TResource> lVar) {
        this.f6478d.mo8352a(cls, lVar);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> C1732i mo7614c(Class<Data> cls, Class<TResource> cls2, C1792k<Data, TResource> kVar) {
        mo7616e("legacy_append", cls, cls2, kVar);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> C1732i mo7615d(Class<Model> cls, Class<Data> cls2, C1952o<Model, Data> oVar) {
        this.f6475a.mo8054a(cls, cls2, oVar);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> C1732i mo7616e(String str, Class<Data> cls, Class<TResource> cls2, C1792k<Data, TResource> kVar) {
        this.f6477c.mo8347a(str, kVar, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> mo7617g() {
        List<ImageHeaderParser> b = this.f6481g.mo8341b();
        if (!b.isEmpty()) {
            return b;
        }
        throw new C1734b();
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C1899t<Data, TResource, Transcode> mo7618h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C1899t<Data, TResource, Transcode> a = this.f6483i.mo8342a(cls, cls2, cls3);
        if (this.f6483i.mo8343c(a)) {
            return null;
        }
        if (a == null) {
            List<C1871i<Data, TResource, Transcode>> f = m8627f(cls, cls2, cls3);
            if (f.isEmpty()) {
                a = null;
            } else {
                a = new C1899t<>(cls, cls2, cls3, f, this.f6484j);
            }
            this.f6483i.mo8344d(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: i */
    public <Model> List<C1950n<Model, ?>> mo7619i(Model model) {
        return this.f6475a.mo8056d(model);
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> mo7620j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f6482h.mo8345a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class<?> d : this.f6475a.mo8055c(cls)) {
                for (Class next : this.f6477c.mo8349d(d, cls2)) {
                    if (!this.f6480f.mo8234b(next, cls3).isEmpty() && !a.contains(next)) {
                        a.add(next);
                    }
                }
            }
            this.f6482h.mo8346b(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: k */
    public <X> C1793l<X> mo7621k(C1902v<X> vVar) throws C1736d {
        C1793l<X> b = this.f6478d.mo8353b(vVar.mo7968d());
        if (b != null) {
            return b;
        }
        throw new C1736d(vVar.mo7968d());
    }

    /* renamed from: l */
    public <X> C1754e<X> mo7622l(X x) {
        return this.f6479e.mo7706a(x);
    }

    /* renamed from: m */
    public <X> C1747d<X> mo7623m(X x) throws C1737e {
        C1747d<X> b = this.f6476b.mo8338b(x.getClass());
        if (b != null) {
            return b;
        }
        throw new C1737e(x.getClass());
    }

    /* renamed from: n */
    public boolean mo7624n(C1902v<?> vVar) {
        return this.f6478d.mo8353b(vVar.mo7968d()) != null;
    }

    /* renamed from: o */
    public C1732i mo7625o(ImageHeaderParser imageHeaderParser) {
        this.f6481g.mo8340a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public C1732i mo7626p(C1754e.C1755a<?> aVar) {
        this.f6479e.mo7707b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> C1732i mo7627q(Class<TResource> cls, Class<Transcode> cls2, C2087e<TResource, Transcode> eVar) {
        this.f6480f.mo8235c(cls, cls2, eVar);
        return this;
    }

    /* renamed from: r */
    public final C1732i mo7628r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        for (String add : list) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        this.f6477c.mo8350e(arrayList);
        return this;
    }
}
