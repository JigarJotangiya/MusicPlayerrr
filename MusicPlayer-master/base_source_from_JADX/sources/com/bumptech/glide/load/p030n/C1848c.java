package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p030n.C1859f;
import com.bumptech.glide.load.p034o.C1950n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.c */
/* compiled from: DataCacheGenerator */
class C1848c implements C1859f, C1752d.C1753a<Object> {

    /* renamed from: g */
    private final List<C1786g> f6667g;

    /* renamed from: h */
    private final C1861g<?> f6668h;

    /* renamed from: i */
    private final C1859f.C1860a f6669i;

    /* renamed from: j */
    private int f6670j;

    /* renamed from: k */
    private C1786g f6671k;

    /* renamed from: l */
    private List<C1950n<File, ?>> f6672l;

    /* renamed from: m */
    private int f6673m;

    /* renamed from: n */
    private volatile C1950n.C1951a<?> f6674n;

    /* renamed from: o */
    private File f6675o;

    C1848c(C1861g<?> gVar, C1859f.C1860a aVar) {
        this(gVar.mo7879c(), gVar, aVar);
    }

    /* renamed from: b */
    private boolean m9007b() {
        return this.f6673m < this.f6672l.size();
    }

    /* renamed from: a */
    public boolean mo7850a() {
        while (true) {
            boolean z = false;
            if (this.f6672l == null || !m9007b()) {
                int i = this.f6670j + 1;
                this.f6670j = i;
                if (i >= this.f6667g.size()) {
                    return false;
                }
                C1786g gVar = this.f6667g.get(this.f6670j);
                File b = this.f6668h.mo7880d().mo7822b(new C1857d(gVar, this.f6668h.mo7891o()));
                this.f6675o = b;
                if (b != null) {
                    this.f6671k = gVar;
                    this.f6672l = this.f6668h.mo7886j(b);
                    this.f6673m = 0;
                }
            } else {
                this.f6674n = null;
                while (!z && m9007b()) {
                    List<C1950n<File, ?>> list = this.f6672l;
                    int i2 = this.f6673m;
                    this.f6673m = i2 + 1;
                    this.f6674n = list.get(i2).mo8004b(this.f6675o, this.f6668h.mo7895s(), this.f6668h.mo7882f(), this.f6668h.mo7887k());
                    if (this.f6674n != null && this.f6668h.mo7896t(this.f6674n.f6932c.mo7688a())) {
                        this.f6674n.f6932c.mo7697e(this.f6668h.mo7888l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo7704c(Exception exc) {
        this.f6669i.mo7874c(this.f6671k, exc, this.f6674n.f6932c, C1744a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C1950n.C1951a<?> aVar = this.f6674n;
        if (aVar != null) {
            aVar.f6932c.cancel();
        }
    }

    /* renamed from: f */
    public void mo7705f(Object obj) {
        this.f6669i.mo7876h(this.f6671k, obj, this.f6674n.f6932c, C1744a.DATA_DISK_CACHE, this.f6671k);
    }

    C1848c(List<C1786g> list, C1861g<?> gVar, C1859f.C1860a aVar) {
        this.f6670j = -1;
        this.f6667g = list;
        this.f6668h = gVar;
        this.f6669i = aVar;
    }
}
