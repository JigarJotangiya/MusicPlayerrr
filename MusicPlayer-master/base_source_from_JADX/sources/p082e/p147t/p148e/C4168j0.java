package p082e.p147t.p148e;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4146e;
import p082e.p147t.p148e.C4204s;

/* renamed from: e.t.e.j0 */
/* compiled from: SelectionTracker */
public abstract class C4168j0<K> {

    /* renamed from: e.t.e.j0$a */
    /* compiled from: SelectionTracker */
    public static final class C4169a<K> {

        /* renamed from: a */
        final RecyclerView f12505a;

        /* renamed from: b */
        private final RecyclerView.C0797h<?> f12506b;

        /* renamed from: c */
        private final Context f12507c;

        /* renamed from: d */
        private final String f12508d;

        /* renamed from: e */
        private final C4177k0<K> f12509e;

        /* renamed from: f */
        C4175c<K> f12510f = C4165i0.m18384a();

        /* renamed from: g */
        private C4139b0 f12511g = new C4139b0();

        /* renamed from: h */
        private C4206t<K> f12512h;

        /* renamed from: i */
        private C4204s<K> f12513i;

        /* renamed from: j */
        private C4186n<K> f12514j = C4186n.m18427b();

        /* renamed from: k */
        private C4137a0<K> f12515k;

        /* renamed from: l */
        private C4212z f12516l;

        /* renamed from: m */
        private C4211y f12517m;

        /* renamed from: n */
        private C4146e f12518n;

        /* renamed from: o */
        private int f12519o = C4145d0.selection_band_overlay;

        /* renamed from: p */
        private int[] f12520p;

        /* renamed from: q */
        private int[] f12521q;

        /* renamed from: e.t.e.j0$a$a */
        /* compiled from: SelectionTracker */
        class C4170a implements C4212z {
            C4170a(C4169a aVar) {
            }

            /* renamed from: a */
            public boolean mo14329a(MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: e.t.e.j0$a$b */
        /* compiled from: SelectionTracker */
        class C4171b implements C4137a0<K> {
            C4171b(C4169a aVar) {
            }

            /* renamed from: a */
            public boolean mo14252a(C4204s.C4205a<K> aVar, MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: e.t.e.j0$a$c */
        /* compiled from: SelectionTracker */
        class C4172c implements C4211y {
            C4172c(C4169a aVar) {
            }

            public boolean onContextClick(MotionEvent motionEvent) {
                return false;
            }
        }

        /* renamed from: e.t.e.j0$a$d */
        /* compiled from: SelectionTracker */
        class C4173d implements Runnable {
            C4173d() {
            }

            public void run() {
                C4169a.this.f12505a.performHapticFeedback(0);
            }
        }

        public C4169a(String str, RecyclerView recyclerView, C4206t<K> tVar, C4204s<K> sVar, C4177k0<K> k0Var) {
            boolean z = true;
            this.f12520p = new int[]{1};
            this.f12521q = new int[]{3};
            C3703i.m15824a(str != null);
            C3703i.m15824a(!str.trim().isEmpty());
            C3703i.m15824a(recyclerView != null);
            this.f12508d = str;
            this.f12505a = recyclerView;
            this.f12507c = recyclerView.getContext();
            RecyclerView.C0797h<?> adapter = recyclerView.getAdapter();
            this.f12506b = adapter;
            C3703i.m15824a(adapter != null);
            C3703i.m15824a(tVar != null);
            C3703i.m15824a(sVar != null);
            C3703i.m15824a(k0Var == null ? false : z);
            this.f12513i = sVar;
            this.f12512h = tVar;
            this.f12509e = k0Var;
            this.f12518n = new C4146e.C4147a(recyclerView, sVar);
        }

        /* renamed from: a */
        public C4168j0<K> mo14327a() {
            C4160h hVar = new C4160h(this.f12508d, this.f12512h, this.f12510f, this.f12509e);
            RecyclerView.C0797h<?> hVar2 = this.f12506b;
            C4206t<K> tVar = this.f12512h;
            RecyclerView recyclerView = this.f12505a;
            recyclerView.getClass();
            C4180l.m18420a(hVar2, hVar, tVar, new C4142c(recyclerView));
            C4188n0 n0Var = new C4188n0(C4188n0.m18437e(this.f12505a));
            C4193p pVar = new C4193p();
            GestureDetector gestureDetector = new GestureDetector(this.f12507c, pVar);
            C4194q c = C4194q.m18455c(hVar, this.f12510f, this.f12505a, n0Var, this.f12511g);
            C4184m mVar = new C4184m();
            C4192o oVar = new C4192o(gestureDetector);
            C4184m mVar2 = new C4184m();
            C4176k kVar = new C4176k();
            C4164i iVar = new C4164i(kVar);
            mVar2.mo14338c(1, iVar);
            this.f12505a.mo4633k(mVar);
            this.f12505a.mo4633k(oVar);
            this.f12505a.mo4633k(mVar2);
            C4154f0 f0Var = new C4154f0();
            hVar.mo14291c(f0Var.mo14278d());
            mVar.mo14338c(0, f0Var.mo14277c());
            f0Var.mo14275a(hVar);
            f0Var.mo14275a(this.f12511g.mo14254a());
            f0Var.mo14275a(c);
            f0Var.mo14275a(oVar);
            f0Var.mo14275a(mVar);
            f0Var.mo14275a(mVar2);
            f0Var.mo14275a(kVar);
            f0Var.mo14275a(iVar);
            C4212z zVar = this.f12516l;
            if (zVar == null) {
                zVar = new C4170a(this);
            }
            this.f12516l = zVar;
            C4137a0<K> a0Var = this.f12515k;
            if (a0Var == null) {
                a0Var = new C4171b(this);
            }
            this.f12515k = a0Var;
            C4211y yVar = this.f12517m;
            if (yVar == null) {
                yVar = new C4172c(this);
            }
            this.f12517m = yVar;
            C4206t<K> tVar2 = this.f12512h;
            C4204s<K> sVar = this.f12513i;
            C4175c<K> cVar = this.f12510f;
            c.getClass();
            C4154f0 f0Var2 = f0Var;
            C4184m mVar3 = mVar;
            C4188n0 n0Var2 = n0Var;
            C4185m0 m0Var = r1;
            C4154f0 f0Var3 = f0Var2;
            C4160h hVar3 = hVar;
            C4184m mVar4 = mVar3;
            C4185m0 m0Var2 = new C4185m0(hVar, tVar2, sVar, cVar, new C4136a(c), this.f12516l, this.f12515k, this.f12514j, new C4173d(), new C4138b(kVar));
            for (int i : this.f12520p) {
                pVar.mo14353a(i, m0Var);
                mVar4.mo14338c(i, c);
            }
            C4209w wVar = new C4209w(hVar3, this.f12512h, this.f12513i, this.f12517m, this.f12515k, this.f12514j);
            for (int a : this.f12521q) {
                pVar.mo14353a(a, wVar);
            }
            C4150f<K> fVar = null;
            if (this.f12512h.mo14394c(0) && this.f12510f.mo14324a()) {
                fVar = C4150f.m18301c(this.f12505a, n0Var2, this.f12519o, this.f12512h, hVar3, this.f12510f, this.f12518n, this.f12514j, this.f12511g);
                f0Var3.mo14275a(fVar);
            }
            mVar4.mo14338c(3, new C4143c0(this.f12513i, this.f12516l, fVar));
            return hVar3;
        }

        /* renamed from: b */
        public C4169a<K> mo14328b(C4175c<K> cVar) {
            C3703i.m15824a(cVar != null);
            this.f12510f = cVar;
            return this;
        }
    }

    /* renamed from: e.t.e.j0$b */
    /* compiled from: SelectionTracker */
    public static abstract class C4174b<K> {
        /* renamed from: a */
        public void mo14332a(K k, boolean z) {
        }

        /* renamed from: b */
        public void mo10079b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo14279c() {
        }

        /* renamed from: d */
        public void mo14333d() {
        }
    }

    /* renamed from: e.t.e.j0$c */
    /* compiled from: SelectionTracker */
    public static abstract class C4175c<K> {
        /* renamed from: a */
        public abstract boolean mo14324a();

        /* renamed from: b */
        public abstract boolean mo14325b(int i, boolean z);

        /* renamed from: c */
        public abstract boolean mo14326c(K k, boolean z);
    }

    /* renamed from: c */
    public abstract void mo14291c(C4174b<K> bVar);

    /* renamed from: d */
    public abstract void mo14292d(int i);

    /* renamed from: e */
    public abstract boolean mo14293e();

    /* renamed from: f */
    public abstract boolean mo14294f(K k);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo14295g(int i);

    /* renamed from: h */
    public abstract void mo14296h(int i);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract RecyclerView.C0800j mo14297i();

    /* renamed from: j */
    public abstract C4163h0<K> mo14298j();

    /* renamed from: k */
    public abstract boolean mo14299k();

    /* renamed from: l */
    public abstract boolean mo14300l();

    /* renamed from: m */
    public abstract boolean mo14301m(K k);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo14302n();

    /* renamed from: o */
    public abstract boolean mo14303o(K k);

    /* renamed from: p */
    public abstract boolean mo14304p(Iterable<K> iterable, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo14305q(Set<K> set);

    /* renamed from: r */
    public abstract void mo14306r(int i);
}
