package com.bumptech.glide.load.p034o;

import com.bumptech.glide.C1730g;
import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1786g;
import com.bumptech.glide.load.C1790i;
import com.bumptech.glide.load.data.C1752d;
import com.bumptech.glide.load.p030n.C1895q;
import com.bumptech.glide.load.p034o.C1950n;
import com.bumptech.glide.p051s.C2193j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p082e.p109h.p118o.C3700f;

/* renamed from: com.bumptech.glide.load.o.q */
/* compiled from: MultiModelLoader */
class C1956q<Model, Data> implements C1950n<Model, Data> {

    /* renamed from: a */
    private final List<C1950n<Model, Data>> f6937a;

    /* renamed from: b */
    private final C3700f<List<Throwable>> f6938b;

    /* renamed from: com.bumptech.glide.load.o.q$a */
    /* compiled from: MultiModelLoader */
    static class C1957a<Data> implements C1752d<Data>, C1752d.C1753a<Data> {

        /* renamed from: g */
        private final List<C1752d<Data>> f6939g;

        /* renamed from: h */
        private final C3700f<List<Throwable>> f6940h;

        /* renamed from: i */
        private int f6941i = 0;

        /* renamed from: j */
        private C1730g f6942j;

        /* renamed from: k */
        private C1752d.C1753a<? super Data> f6943k;

        /* renamed from: l */
        private List<Throwable> f6944l;

        /* renamed from: m */
        private boolean f6945m;

        C1957a(List<C1752d<Data>> list, C3700f<List<Throwable>> fVar) {
            this.f6940h = fVar;
            C2193j.m10268c(list);
            this.f6939g = list;
        }

        /* renamed from: g */
        private void m9341g() {
            if (!this.f6945m) {
                if (this.f6941i < this.f6939g.size() - 1) {
                    this.f6941i++;
                    mo7697e(this.f6942j, this.f6943k);
                    return;
                }
                C2193j.m10269d(this.f6944l);
                this.f6943k.mo7704c(new C1895q("Fetch failed", (List<Throwable>) new ArrayList(this.f6944l)));
            }
        }

        /* renamed from: a */
        public Class<Data> mo7688a() {
            return this.f6939g.get(0).mo7688a();
        }

        /* renamed from: b */
        public void mo7693b() {
            List<Throwable> list = this.f6944l;
            if (list != null) {
                this.f6940h.mo8512a(list);
            }
            this.f6944l = null;
            for (C1752d<Data> b : this.f6939g) {
                b.mo7693b();
            }
        }

        /* renamed from: c */
        public void mo7704c(Exception exc) {
            List<Throwable> list = this.f6944l;
            C2193j.m10269d(list);
            list.add(exc);
            m9341g();
        }

        public void cancel() {
            this.f6945m = true;
            for (C1752d<Data> cancel : this.f6939g) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public C1744a mo7696d() {
            return this.f6939g.get(0).mo7696d();
        }

        /* renamed from: e */
        public void mo7697e(C1730g gVar, C1752d.C1753a<? super Data> aVar) {
            this.f6942j = gVar;
            this.f6943k = aVar;
            this.f6944l = this.f6940h.mo8513b();
            this.f6939g.get(this.f6941i).mo7697e(gVar, this);
            if (this.f6945m) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo7705f(Data data) {
            if (data != null) {
                this.f6943k.mo7705f(data);
            } else {
                m9341g();
            }
        }
    }

    C1956q(List<C1950n<Model, Data>> list, C3700f<List<Throwable>> fVar) {
        this.f6937a = list;
        this.f6938b = fVar;
    }

    /* renamed from: a */
    public boolean mo8003a(Model model) {
        for (C1950n<Model, Data> a : this.f6937a) {
            if (a.mo8003a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C1950n.C1951a<Data> mo8004b(Model model, int i, int i2, C1790i iVar) {
        C1950n.C1951a b;
        int size = this.f6937a.size();
        ArrayList arrayList = new ArrayList(size);
        C1786g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1950n nVar = this.f6937a.get(i3);
            if (nVar.mo8003a(model) && (b = nVar.mo8004b(model, i, i2, iVar)) != null) {
                gVar = b.f6930a;
                arrayList.add(b.f6932c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new C1950n.C1951a<>(gVar, new C1957a(arrayList, this.f6938b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f6937a.toArray()) + '}';
    }
}
