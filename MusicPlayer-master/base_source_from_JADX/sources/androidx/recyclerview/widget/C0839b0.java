package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p082e.p098e.C3470d;
import p082e.p098e.C3478g;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3701g;

/* renamed from: androidx.recyclerview.widget.b0 */
/* compiled from: ViewInfoStore */
class C0839b0 {

    /* renamed from: a */
    final C3478g<RecyclerView.C0792c0, C0840a> f3801a = new C3478g<>();

    /* renamed from: b */
    final C3470d<RecyclerView.C0792c0> f3802b = new C3470d<>();

    /* renamed from: androidx.recyclerview.widget.b0$a */
    /* compiled from: ViewInfoStore */
    static class C0840a {

        /* renamed from: d */
        static C3700f<C0840a> f3803d = new C3701g(20);

        /* renamed from: a */
        int f3804a;

        /* renamed from: b */
        RecyclerView.C0803m.C0806c f3805b;

        /* renamed from: c */
        RecyclerView.C0803m.C0806c f3806c;

        private C0840a() {
        }

        /* renamed from: a */
        static void m5306a() {
            do {
            } while (f3803d.mo8513b() != null);
        }

        /* renamed from: b */
        static C0840a m5307b() {
            C0840a b = f3803d.mo8513b();
            return b == null ? new C0840a() : b;
        }

        /* renamed from: c */
        static void m5308c(C0840a aVar) {
            aVar.f3804a = 0;
            aVar.f3805b = null;
            aVar.f3806c = null;
            f3803d.mo8512a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b0$b */
    /* compiled from: ViewInfoStore */
    interface C0841b {
        /* renamed from: a */
        void mo4769a(RecyclerView.C0792c0 c0Var);

        /* renamed from: b */
        void mo4770b(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2);

        /* renamed from: c */
        void mo4771c(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2);

        /* renamed from: d */
        void mo4772d(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar, RecyclerView.C0803m.C0806c cVar2);
    }

    C0839b0() {
    }

    /* renamed from: l */
    private RecyclerView.C0803m.C0806c m5289l(RecyclerView.C0792c0 c0Var, int i) {
        C0840a m;
        RecyclerView.C0803m.C0806c cVar;
        int f = this.f3801a.mo12390f(c0Var);
        if (f >= 0 && (m = this.f3801a.mo12397m(f)) != null) {
            int i2 = m.f3804a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m.f3804a = i3;
                if (i == 4) {
                    cVar = m.f3805b;
                } else if (i == 8) {
                    cVar = m.f3806c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f3801a.mo8472k(f);
                    C0840a.m5308c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5177a(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar == null) {
            aVar = C0840a.m5307b();
            this.f3801a.put(c0Var, aVar);
        }
        aVar.f3804a |= 2;
        aVar.f3805b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5178b(RecyclerView.C0792c0 c0Var) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar == null) {
            aVar = C0840a.m5307b();
            this.f3801a.put(c0Var, aVar);
        }
        aVar.f3804a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5179c(long j, RecyclerView.C0792c0 c0Var) {
        this.f3802b.mo12309m(j, c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5180d(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar == null) {
            aVar = C0840a.m5307b();
            this.f3801a.put(c0Var, aVar);
        }
        aVar.f3806c = cVar;
        aVar.f3804a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5181e(RecyclerView.C0792c0 c0Var, RecyclerView.C0803m.C0806c cVar) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar == null) {
            aVar = C0840a.m5307b();
            this.f3801a.put(c0Var, aVar);
        }
        aVar.f3805b = cVar;
        aVar.f3804a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5182f() {
        this.f3801a.clear();
        this.f3802b.mo12299b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C0792c0 mo5183g(long j) {
        return this.f3802b.mo12304h(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5184h(RecyclerView.C0792c0 c0Var) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar == null || (aVar.f3804a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5185i(RecyclerView.C0792c0 c0Var) {
        C0840a aVar = this.f3801a.get(c0Var);
        return (aVar == null || (aVar.f3804a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5186j() {
        C0840a.m5306a();
    }

    /* renamed from: k */
    public void mo5187k(RecyclerView.C0792c0 c0Var) {
        mo5191p(c0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C0803m.C0806c mo5188m(RecyclerView.C0792c0 c0Var) {
        return m5289l(c0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C0803m.C0806c mo5189n(RecyclerView.C0792c0 c0Var) {
        return m5289l(c0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5190o(C0841b bVar) {
        for (int size = this.f3801a.size() - 1; size >= 0; size--) {
            RecyclerView.C0792c0 i = this.f3801a.mo12395i(size);
            C0840a k = this.f3801a.mo8472k(size);
            int i2 = k.f3804a;
            if ((i2 & 3) == 3) {
                bVar.mo4769a(i);
            } else if ((i2 & 1) != 0) {
                RecyclerView.C0803m.C0806c cVar = k.f3805b;
                if (cVar == null) {
                    bVar.mo4769a(i);
                } else {
                    bVar.mo4771c(i, cVar, k.f3806c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.mo4770b(i, k.f3805b, k.f3806c);
            } else if ((i2 & 12) == 12) {
                bVar.mo4772d(i, k.f3805b, k.f3806c);
            } else if ((i2 & 4) != 0) {
                bVar.mo4771c(i, k.f3805b, (RecyclerView.C0803m.C0806c) null);
            } else if ((i2 & 8) != 0) {
                bVar.mo4770b(i, k.f3805b, k.f3806c);
            }
            C0840a.m5308c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5191p(RecyclerView.C0792c0 c0Var) {
        C0840a aVar = this.f3801a.get(c0Var);
        if (aVar != null) {
            aVar.f3804a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5192q(RecyclerView.C0792c0 c0Var) {
        int q = this.f3802b.mo12312q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (c0Var == this.f3802b.mo12313r(q)) {
                this.f3802b.mo12311o(q);
                break;
            } else {
                q--;
            }
        }
        C0840a remove = this.f3801a.remove(c0Var);
        if (remove != null) {
            C0840a.m5308c(remove);
        }
    }
}
