package com.bumptech.glide.load.p030n;

import android.util.Log;
import com.bumptech.glide.C1726d;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1862h;
import com.bumptech.glide.load.p030n.C1893p;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import com.bumptech.glide.load.p030n.p032b0.C1829b;
import com.bumptech.glide.load.p030n.p032b0.C1839h;
import com.bumptech.glide.load.p030n.p033c0.C1849a;
import com.bumptech.glide.p047q.C2154i;
import com.bumptech.glide.p051s.C2188f;
import com.bumptech.glide.p051s.C2193j;
import com.bumptech.glide.p051s.p052l.C2196a;
import java.util.Map;
import java.util.concurrent.Executor;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.n.k */
/* compiled from: Engine */
public class C1877k implements C1890m, C1839h.C1840a, C1893p.C1894a {

    /* renamed from: i */
    private static final boolean f6769i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C1898s f6770a;

    /* renamed from: b */
    private final C1892o f6771b;

    /* renamed from: c */
    private final C1839h f6772c;

    /* renamed from: d */
    private final C1880b f6773d;

    /* renamed from: e */
    private final C1905y f6774e;

    /* renamed from: f */
    private final C1882c f6775f;

    /* renamed from: g */
    private final C1878a f6776g;

    /* renamed from: h */
    private final C1795a f6777h;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    /* compiled from: Engine */
    static class C1878a {

        /* renamed from: a */
        final C1862h.C1867e f6778a;

        /* renamed from: b */
        final C3700f<C1862h<?>> f6779b = C2196a.m10297d(150, new C1879a());

        /* renamed from: c */
        private int f6780c;

        /* renamed from: com.bumptech.glide.load.n.k$a$a */
        /* compiled from: Engine */
        class C1879a implements C2196a.C2200d<C1862h<?>> {
            C1879a() {
            }

            /* renamed from: b */
            public C1862h<?> mo7847a() {
                C1878a aVar = C1878a.this;
                return new C1862h<>(aVar.f6778a, aVar.f6779b);
            }
        }

        C1878a(C1862h.C1867e eVar) {
            this.f6778a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C1862h<R> mo7933a(C1726d dVar, Object obj, C1891n nVar, C1786g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C1730g gVar2, C1873j jVar, Map<Class<?>, C1794m<?>> map, boolean z, boolean z2, boolean z3, C1790i iVar, C1862h.C1864b<R> bVar) {
            C1862h<R> b = this.f6779b.mo8513b();
            C2193j.m10269d(b);
            C1862h<R> hVar = b;
            int i3 = this.f6780c;
            int i4 = i3;
            this.f6780c = i3 + 1;
            hVar.mo7908v(dVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z3, iVar, bVar, i4);
            return hVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$b */
    /* compiled from: Engine */
    static class C1880b {

        /* renamed from: a */
        final C1849a f6782a;

        /* renamed from: b */
        final C1849a f6783b;

        /* renamed from: c */
        final C1849a f6784c;

        /* renamed from: d */
        final C1849a f6785d;

        /* renamed from: e */
        final C1890m f6786e;

        /* renamed from: f */
        final C1893p.C1894a f6787f;

        /* renamed from: g */
        final C3700f<C1884l<?>> f6788g = C2196a.m10297d(150, new C1881a());

        /* renamed from: com.bumptech.glide.load.n.k$b$a */
        /* compiled from: Engine */
        class C1881a implements C2196a.C2200d<C1884l<?>> {
            C1881a() {
            }

            /* renamed from: b */
            public C1884l<?> mo7847a() {
                C1880b bVar = C1880b.this;
                return new C1884l(bVar.f6782a, bVar.f6783b, bVar.f6784c, bVar.f6785d, bVar.f6786e, bVar.f6787f, bVar.f6788g);
            }
        }

        C1880b(C1849a aVar, C1849a aVar2, C1849a aVar3, C1849a aVar4, C1890m mVar, C1893p.C1894a aVar5) {
            this.f6782a = aVar;
            this.f6783b = aVar2;
            this.f6784c = aVar3;
            this.f6785d = aVar4;
            this.f6786e = mVar;
            this.f6787f = aVar5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <R> C1884l<R> mo7935a(C1786g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            C1884l<R> b = this.f6788g.mo8513b();
            C2193j.m10269d(b);
            C1884l<R> lVar = b;
            lVar.mo7944l(gVar, z, z2, z3, z4);
            return lVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$c */
    /* compiled from: Engine */
    private static class C1882c implements C1862h.C1867e {

        /* renamed from: a */
        private final C1826a.C1827a f6790a;

        /* renamed from: b */
        private volatile C1826a f6791b;

        C1882c(C1826a.C1827a aVar) {
            this.f6790a = aVar;
        }

        /* renamed from: a */
        public C1826a mo7917a() {
            if (this.f6791b == null) {
                synchronized (this) {
                    if (this.f6791b == null) {
                        this.f6791b = this.f6790a.mo7823d();
                    }
                    if (this.f6791b == null) {
                        this.f6791b = new C1829b();
                    }
                }
            }
            return this.f6791b;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.k$d */
    /* compiled from: Engine */
    public class C1883d {

        /* renamed from: a */
        private final C1884l<?> f6792a;

        /* renamed from: b */
        private final C2154i f6793b;

        C1883d(C2154i iVar, C1884l<?> lVar) {
            this.f6793b = iVar;
            this.f6792a = lVar;
        }

        /* renamed from: a */
        public void mo7937a() {
            synchronized (C1877k.this) {
                this.f6792a.mo7948r(this.f6793b);
            }
        }
    }

    public C1877k(C1839h hVar, C1826a.C1827a aVar, C1849a aVar2, C1849a aVar3, C1849a aVar4, C1849a aVar5, boolean z) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (C1898s) null, (C1892o) null, (C1795a) null, (C1880b) null, (C1878a) null, (C1905y) null, z);
    }

    /* renamed from: e */
    private C1893p<?> m9119e(C1786g gVar) {
        C1902v<?> d = this.f6772c.mo7832d(gVar);
        if (d == null) {
            return null;
        }
        if (d instanceof C1893p) {
            return (C1893p) d;
        }
        return new C1893p<>(d, true, true, gVar, this);
    }

    /* renamed from: g */
    private C1893p<?> m9120g(C1786g gVar) {
        C1893p<?> e = this.f6777h.mo7756e(gVar);
        if (e != null) {
            e.mo7966b();
        }
        return e;
    }

    /* renamed from: h */
    private C1893p<?> m9121h(C1786g gVar) {
        C1893p<?> e = m9119e(gVar);
        if (e != null) {
            e.mo7966b();
            this.f6777h.mo7752a(gVar, e);
        }
        return e;
    }

    /* renamed from: i */
    private C1893p<?> m9122i(C1891n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1893p<?> g = m9120g(nVar);
        if (g != null) {
            if (f6769i) {
                m9123j("Loaded resource from active resources", j, nVar);
            }
            return g;
        }
        C1893p<?> h = m9121h(nVar);
        if (h == null) {
            return null;
        }
        if (f6769i) {
            m9123j("Loaded resource from cache", j, nVar);
        }
        return h;
    }

    /* renamed from: j */
    private static void m9123j(String str, long j, C1786g gVar) {
        Log.v("Engine", str + " in " + C2188f.m10252a(j) + "ms, key: " + gVar);
    }

    /* renamed from: l */
    private <R> C1883d m9124l(C1726d dVar, Object obj, C1786g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C1730g gVar2, C1873j jVar, Map<Class<?>, C1794m<?>> map, boolean z, boolean z2, C1790i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C2154i iVar2, Executor executor, C1891n nVar, long j) {
        C2154i iVar3 = iVar2;
        Executor executor2 = executor;
        C1891n nVar2 = nVar;
        long j2 = j;
        C1884l<?> a = this.f6770a.mo7990a(nVar2, z6);
        if (a != null) {
            a.mo7938b(iVar3, executor2);
            if (f6769i) {
                m9123j("Added to existing load", j2, nVar2);
            }
            return new C1883d(iVar3, a);
        }
        C1884l a2 = this.f6773d.mo7935a(nVar, z3, z4, z5, z6);
        C1884l lVar = a2;
        C1891n nVar3 = nVar2;
        C1862h<R> a3 = this.f6776g.mo7933a(dVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, a2);
        this.f6770a.mo7991c(nVar3, lVar);
        C1884l lVar2 = lVar;
        C1891n nVar4 = nVar3;
        C2154i iVar4 = iVar2;
        lVar2.mo7938b(iVar4, executor);
        lVar2.mo7949s(a3);
        if (f6769i) {
            m9123j("Started new load", j, nVar4);
        }
        return new C1883d(iVar4, lVar2);
    }

    /* renamed from: a */
    public void mo7839a(C1902v<?> vVar) {
        this.f6774e.mo7998a(vVar, true);
    }

    /* renamed from: b */
    public synchronized void mo7928b(C1884l<?> lVar, C1786g gVar, C1893p<?> pVar) {
        if (pVar != null) {
            if (pVar.mo7970f()) {
                this.f6777h.mo7752a(gVar, pVar);
            }
        }
        this.f6770a.mo7992d(gVar, lVar);
    }

    /* renamed from: c */
    public synchronized void mo7929c(C1884l<?> lVar, C1786g gVar) {
        this.f6770a.mo7992d(gVar, lVar);
    }

    /* renamed from: d */
    public void mo7930d(C1786g gVar, C1893p<?> pVar) {
        this.f6777h.mo7755d(gVar);
        if (pVar.mo7970f()) {
            this.f6772c.mo7831c(gVar, pVar);
        } else {
            this.f6774e.mo7998a(pVar, false);
        }
    }

    /* renamed from: f */
    public <R> C1883d mo7931f(C1726d dVar, Object obj, C1786g gVar, int i, int i2, Class<?> cls, Class<R> cls2, C1730g gVar2, C1873j jVar, Map<Class<?>, C1794m<?>> map, boolean z, boolean z2, C1790i iVar, boolean z3, boolean z4, boolean z5, boolean z6, C2154i iVar2, Executor executor) {
        long b = f6769i ? C2188f.m10253b() : 0;
        C1891n a = this.f6771b.mo7964a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            C1893p<?> i3 = m9122i(a, z3, b);
            if (i3 == null) {
                C1883d l = m9124l(dVar, obj, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, iVar2, executor, a, b);
                return l;
            }
            iVar2.mo8443c(i3, C1744a.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: k */
    public void mo7932k(C1902v<?> vVar) {
        if (vVar instanceof C1893p) {
            ((C1893p) vVar).mo7971g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C1877k(C1839h hVar, C1826a.C1827a aVar, C1849a aVar2, C1849a aVar3, C1849a aVar4, C1849a aVar5, C1898s sVar, C1892o oVar, C1795a aVar6, C1880b bVar, C1878a aVar7, C1905y yVar, boolean z) {
        this.f6772c = hVar;
        C1826a.C1827a aVar8 = aVar;
        C1882c cVar = new C1882c(aVar);
        this.f6775f = cVar;
        C1795a aVar9 = aVar6 == null ? new C1795a(z) : aVar6;
        this.f6777h = aVar9;
        aVar9.mo7757f(this);
        this.f6771b = oVar == null ? new C1892o() : oVar;
        this.f6770a = sVar == null ? new C1898s() : sVar;
        this.f6773d = bVar == null ? new C1880b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f6776g = aVar7 == null ? new C1878a(cVar) : aVar7;
        this.f6774e = yVar == null ? new C1905y() : yVar;
        hVar.mo7833e(this);
    }
}
