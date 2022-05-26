package com.bumptech.glide.load.p030n;

import com.bumptech.glide.C1726d;
import com.bumptech.glide.C1730g;
import com.bumptech.glide.C1732i;
import com.bumptech.glide.load.C1747d;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.C1793l;
import com.bumptech.glide.load.C1794m;
import com.bumptech.glide.load.p030n.C1862h;
import com.bumptech.glide.load.p030n.p031a0.C1802b;
import com.bumptech.glide.load.p030n.p032b0.C1826a;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.load.p036p.C1999c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.g */
/* compiled from: DecodeHelper */
final class C1861g<Transcode> {

    /* renamed from: a */
    private final List<C1950n.C1951a<?>> f6698a = new ArrayList();

    /* renamed from: b */
    private final List<C1786g> f6699b = new ArrayList();

    /* renamed from: c */
    private C1726d f6700c;

    /* renamed from: d */
    private Object f6701d;

    /* renamed from: e */
    private int f6702e;

    /* renamed from: f */
    private int f6703f;

    /* renamed from: g */
    private Class<?> f6704g;

    /* renamed from: h */
    private C1862h.C1867e f6705h;

    /* renamed from: i */
    private C1790i f6706i;

    /* renamed from: j */
    private Map<Class<?>, C1794m<?>> f6707j;

    /* renamed from: k */
    private Class<Transcode> f6708k;

    /* renamed from: l */
    private boolean f6709l;

    /* renamed from: m */
    private boolean f6710m;

    /* renamed from: n */
    private C1786g f6711n;

    /* renamed from: o */
    private C1730g f6712o;

    /* renamed from: p */
    private C1873j f6713p;

    /* renamed from: q */
    private boolean f6714q;

    /* renamed from: r */
    private boolean f6715r;

    C1861g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7877a() {
        this.f6700c = null;
        this.f6701d = null;
        this.f6711n = null;
        this.f6704g = null;
        this.f6708k = null;
        this.f6706i = null;
        this.f6712o = null;
        this.f6707j = null;
        this.f6713p = null;
        this.f6698a.clear();
        this.f6709l = false;
        this.f6699b.clear();
        this.f6710m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1802b mo7878b() {
        return this.f6700c.mo7601b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C1786g> mo7879c() {
        if (!this.f6710m) {
            this.f6710m = true;
            this.f6699b.clear();
            List<C1950n.C1951a<?>> g = mo7883g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C1950n.C1951a aVar = g.get(i);
                if (!this.f6699b.contains(aVar.f6930a)) {
                    this.f6699b.add(aVar.f6930a);
                }
                for (int i2 = 0; i2 < aVar.f6931b.size(); i2++) {
                    if (!this.f6699b.contains(aVar.f6931b.get(i2))) {
                        this.f6699b.add(aVar.f6931b.get(i2));
                    }
                }
            }
        }
        return this.f6699b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1826a mo7880d() {
        return this.f6705h.mo7917a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1873j mo7881e() {
        return this.f6713p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo7882f() {
        return this.f6703f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C1950n.C1951a<?>> mo7883g() {
        if (!this.f6709l) {
            this.f6709l = true;
            this.f6698a.clear();
            List i = this.f6700c.mo7608i().mo7619i(this.f6701d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1950n.C1951a b = ((C1950n) i.get(i2)).mo8004b(this.f6701d, this.f6702e, this.f6703f, this.f6706i);
                if (b != null) {
                    this.f6698a.add(b);
                }
            }
        }
        return this.f6698a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C1899t<Data, ?, Transcode> mo7884h(Class<Data> cls) {
        return this.f6700c.mo7608i().mo7618h(cls, this.f6704g, this.f6708k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo7885i() {
        return this.f6701d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C1950n<File, ?>> mo7886j(File file) throws C1732i.C1735c {
        return this.f6700c.mo7608i().mo7619i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C1790i mo7887k() {
        return this.f6706i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C1730g mo7888l() {
        return this.f6712o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo7889m() {
        return this.f6700c.mo7608i().mo7620j(this.f6701d.getClass(), this.f6704g, this.f6708k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> C1793l<Z> mo7890n(C1902v<Z> vVar) {
        return this.f6700c.mo7608i().mo7621k(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C1786g mo7891o() {
        return this.f6711n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> C1747d<X> mo7892p(X x) throws C1732i.C1737e {
        return this.f6700c.mo7608i().mo7623m(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo7893q() {
        return this.f6708k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> C1794m<Z> mo7894r(Class<Z> cls) {
        C1794m<Z> mVar = this.f6707j.get(cls);
        if (mVar == null) {
            Iterator<Map.Entry<Class<?>, C1794m<?>>> it = this.f6707j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    mVar = (C1794m) next.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f6707j.isEmpty() || !this.f6714q) {
            return C1999c.m9447c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo7895s() {
        return this.f6702e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo7896t(Class<?> cls) {
        return mo7884h(cls) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo7897u(C1726d dVar, Object obj, C1786g gVar, int i, int i2, C1873j jVar, Class<?> cls, Class<R> cls2, C1730g gVar2, C1790i iVar, Map<Class<?>, C1794m<?>> map, boolean z, boolean z2, C1862h.C1867e eVar) {
        this.f6700c = dVar;
        this.f6701d = obj;
        this.f6711n = gVar;
        this.f6702e = i;
        this.f6703f = i2;
        this.f6713p = jVar;
        this.f6704g = cls;
        this.f6705h = eVar;
        this.f6708k = cls2;
        this.f6712o = gVar2;
        this.f6706i = iVar;
        this.f6707j = map;
        this.f6714q = z;
        this.f6715r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo7898v(C1902v<?> vVar) {
        return this.f6700c.mo7608i().mo7624n(vVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo7899w() {
        return this.f6715r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo7900x(C1786g gVar) {
        List<C1950n.C1951a<?>> g = mo7883g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f6930a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
