package com.bumptech.glide.load.p030n;

import android.util.Log;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1747d;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p030n.C1859f;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p051s.C2188f;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.n.z */
/* compiled from: SourceGenerator */
class C1907z implements C1859f, C1859f.C1860a {

    /* renamed from: g */
    private final C1861g<?> f6878g;

    /* renamed from: h */
    private final C1859f.C1860a f6879h;

    /* renamed from: i */
    private int f6880i;

    /* renamed from: j */
    private C1848c f6881j;

    /* renamed from: k */
    private Object f6882k;

    /* renamed from: l */
    private volatile C1950n.C1951a<?> f6883l;

    /* renamed from: m */
    private C1857d f6884m;

    /* renamed from: com.bumptech.glide.load.n.z$a */
    /* compiled from: SourceGenerator */
    class C1908a implements C1752d.C1753a<Object> {

        /* renamed from: g */
        final /* synthetic */ C1950n.C1951a f6885g;

        C1908a(C1950n.C1951a aVar) {
            this.f6885g = aVar;
        }

        /* renamed from: c */
        public void mo7704c(Exception exc) {
            if (C1907z.this.mo8000f(this.f6885g)) {
                C1907z.this.mo8002i(this.f6885g, exc);
            }
        }

        /* renamed from: f */
        public void mo7705f(Object obj) {
            if (C1907z.this.mo8000f(this.f6885g)) {
                C1907z.this.mo8001g(this.f6885g, obj);
            }
        }
    }

    C1907z(C1861g<?> gVar, C1859f.C1860a aVar) {
        this.f6878g = gVar;
        this.f6879h = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m9209b(Object obj) {
        long b = C2188f.m10253b();
        try {
            C1747d<X> p = this.f6878g.mo7892p(obj);
            C1858e eVar = new C1858e(p, obj, this.f6878g.mo7887k());
            this.f6884m = new C1857d(this.f6883l.f6930a, this.f6878g.mo7891o());
            this.f6878g.mo7880d().mo7821a(this.f6884m, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f6884m + ", data: " + obj + ", encoder: " + p + ", duration: " + C2188f.m10252a(b));
            }
            this.f6883l.f6932c.mo7693b();
            this.f6881j = new C1848c(Collections.singletonList(this.f6883l.f6930a), this.f6878g, this);
        } catch (Throwable th) {
            this.f6883l.f6932c.mo7693b();
            throw th;
        }
    }

    /* renamed from: e */
    private boolean m9210e() {
        return this.f6880i < this.f6878g.mo7883g().size();
    }

    /* renamed from: j */
    private void m9211j(C1950n.C1951a<?> aVar) {
        this.f6883l.f6932c.mo7697e(this.f6878g.mo7888l(), new C1908a(aVar));
    }

    /* renamed from: a */
    public boolean mo7850a() {
        Object obj = this.f6882k;
        if (obj != null) {
            this.f6882k = null;
            m9209b(obj);
        }
        C1848c cVar = this.f6881j;
        if (cVar != null && cVar.mo7850a()) {
            return true;
        }
        this.f6881j = null;
        this.f6883l = null;
        boolean z = false;
        while (!z && m9210e()) {
            List<C1950n.C1951a<?>> g = this.f6878g.mo7883g();
            int i = this.f6880i;
            this.f6880i = i + 1;
            this.f6883l = g.get(i);
            if (this.f6883l != null && (this.f6878g.mo7881e().mo7926c(this.f6883l.f6932c.mo7696d()) || this.f6878g.mo7896t(this.f6883l.f6932c.mo7688a()))) {
                m9211j(this.f6883l);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo7874c(C1786g gVar, Exception exc, C1752d<?> dVar, C1744a aVar) {
        this.f6879h.mo7874c(gVar, exc, dVar, this.f6883l.f6932c.mo7696d());
    }

    public void cancel() {
        C1950n.C1951a<?> aVar = this.f6883l;
        if (aVar != null) {
            aVar.f6932c.cancel();
        }
    }

    /* renamed from: d */
    public void mo7875d() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo8000f(C1950n.C1951a<?> aVar) {
        C1950n.C1951a<?> aVar2 = this.f6883l;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8001g(C1950n.C1951a<?> aVar, Object obj) {
        C1873j e = this.f6878g.mo7881e();
        if (obj == null || !e.mo7926c(aVar.f6932c.mo7696d())) {
            C1859f.C1860a aVar2 = this.f6879h;
            C1786g gVar = aVar.f6930a;
            C1752d<Data> dVar = aVar.f6932c;
            aVar2.mo7876h(gVar, obj, dVar, dVar.mo7696d(), this.f6884m);
            return;
        }
        this.f6882k = obj;
        this.f6879h.mo7875d();
    }

    /* renamed from: h */
    public void mo7876h(C1786g gVar, Object obj, C1752d<?> dVar, C1744a aVar, C1786g gVar2) {
        this.f6879h.mo7876h(gVar, obj, dVar, this.f6883l.f6932c.mo7696d(), gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo8002i(C1950n.C1951a<?> aVar, Exception exc) {
        C1859f.C1860a aVar2 = this.f6879h;
        C1857d dVar = this.f6884m;
        C1752d<Data> dVar2 = aVar.f6932c;
        aVar2.mo7874c(dVar, exc, dVar2, dVar2.mo7696d());
    }
}
