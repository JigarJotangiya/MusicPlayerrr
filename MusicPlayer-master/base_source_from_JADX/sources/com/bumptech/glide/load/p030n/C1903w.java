package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p030n.C1859f;
import com.bumptech.glide.load.p034o.C1950n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.w */
/* compiled from: ResourceCacheGenerator */
class C1903w implements C1859f, C1752d.C1753a<Object> {

    /* renamed from: g */
    private final C1859f.C1860a f6857g;

    /* renamed from: h */
    private final C1861g<?> f6858h;

    /* renamed from: i */
    private int f6859i;

    /* renamed from: j */
    private int f6860j = -1;

    /* renamed from: k */
    private C1786g f6861k;

    /* renamed from: l */
    private List<C1950n<File, ?>> f6862l;

    /* renamed from: m */
    private int f6863m;

    /* renamed from: n */
    private volatile C1950n.C1951a<?> f6864n;

    /* renamed from: o */
    private File f6865o;

    /* renamed from: p */
    private C1904x f6866p;

    C1903w(C1861g<?> gVar, C1859f.C1860a aVar) {
        this.f6858h = gVar;
        this.f6857g = aVar;
    }

    /* renamed from: b */
    private boolean m9202b() {
        return this.f6863m < this.f6862l.size();
    }

    /* renamed from: a */
    public boolean mo7850a() {
        List<C1786g> c = this.f6858h.mo7879c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f6858h.mo7889m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f6862l == null || !m9202b()) {
                    int i = this.f6860j + 1;
                    this.f6860j = i;
                    if (i >= m.size()) {
                        int i2 = this.f6859i + 1;
                        this.f6859i = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f6860j = 0;
                    }
                    C1786g gVar = c.get(this.f6859i);
                    Class cls = m.get(this.f6860j);
                    C1786g gVar2 = gVar;
                    this.f6866p = new C1904x(this.f6858h.mo7878b(), gVar2, this.f6858h.mo7891o(), this.f6858h.mo7895s(), this.f6858h.mo7882f(), this.f6858h.mo7894r(cls), cls, this.f6858h.mo7887k());
                    File b = this.f6858h.mo7880d().mo7822b(this.f6866p);
                    this.f6865o = b;
                    if (b != null) {
                        this.f6861k = gVar;
                        this.f6862l = this.f6858h.mo7886j(b);
                        this.f6863m = 0;
                    }
                } else {
                    this.f6864n = null;
                    while (!z && m9202b()) {
                        List<C1950n<File, ?>> list = this.f6862l;
                        int i3 = this.f6863m;
                        this.f6863m = i3 + 1;
                        this.f6864n = list.get(i3).mo8004b(this.f6865o, this.f6858h.mo7895s(), this.f6858h.mo7882f(), this.f6858h.mo7887k());
                        if (this.f6864n != null && this.f6858h.mo7896t(this.f6864n.f6932c.mo7688a())) {
                            this.f6864n.f6932c.mo7697e(this.f6858h.mo7888l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f6858h.mo7893q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f6858h.mo7885i() + " to " + this.f6858h.mo7893q());
        }
    }

    /* renamed from: c */
    public void mo7704c(Exception exc) {
        this.f6857g.mo7874c(this.f6866p, exc, this.f6864n.f6932c, C1744a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C1950n.C1951a<?> aVar = this.f6864n;
        if (aVar != null) {
            aVar.f6932c.cancel();
        }
    }

    /* renamed from: f */
    public void mo7705f(Object obj) {
        this.f6857g.mo7876h(this.f6861k, obj, this.f6864n.f6932c, C1744a.RESOURCE_DISK_CACHE, this.f6866p);
    }
}
