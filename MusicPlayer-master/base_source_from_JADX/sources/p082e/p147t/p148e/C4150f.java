package p082e.p147t.p148e;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4197r;

/* renamed from: e.t.e.f */
/* compiled from: BandSelectionHelper */
class C4150f<K> implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private final C4153c<K> f12467g;

    /* renamed from: h */
    private final C4206t<K> f12468h;

    /* renamed from: i */
    final C4168j0<K> f12469i;

    /* renamed from: j */
    private final C4146e f12470j;

    /* renamed from: k */
    private final C4186n<K> f12471k;

    /* renamed from: l */
    private final C4139b0 f12472l;

    /* renamed from: m */
    private final C4144d f12473m;

    /* renamed from: n */
    private final C4197r.C4203f<K> f12474n;

    /* renamed from: o */
    private Point f12475o;

    /* renamed from: p */
    private Point f12476p;

    /* renamed from: q */
    private C4197r<K> f12477q;

    /* renamed from: e.t.e.f$a */
    /* compiled from: BandSelectionHelper */
    class C4151a extends RecyclerView.C0817t {
        C4151a() {
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            C4150f.this.mo14269f(recyclerView, i, i2);
        }
    }

    /* renamed from: e.t.e.f$b */
    /* compiled from: BandSelectionHelper */
    class C4152b extends C4197r.C4203f<K> {
        C4152b() {
        }

        /* renamed from: a */
        public void mo14270a(Set<K> set) {
            C4150f.this.f12469i.mo14305q(set);
        }
    }

    /* renamed from: e.t.e.f$c */
    /* compiled from: BandSelectionHelper */
    static abstract class C4153c<K> {
        C4153c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo14271a(RecyclerView.C0817t tVar);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract C4197r<K> mo14272b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo14273c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo14274d(Rect rect);
    }

    C4150f(C4153c<K> cVar, C4144d dVar, C4206t<K> tVar, C4168j0<K> j0Var, C4146e eVar, C4186n<K> nVar, C4139b0 b0Var) {
        boolean z = true;
        C3703i.m15824a(cVar != null);
        C3703i.m15824a(dVar != null);
        C3703i.m15824a(tVar != null);
        C3703i.m15824a(j0Var != null);
        C3703i.m15824a(eVar != null);
        C3703i.m15824a(nVar != null);
        C3703i.m15824a(b0Var == null ? false : z);
        this.f12467g = cVar;
        this.f12468h = tVar;
        this.f12469i = j0Var;
        this.f12470j = eVar;
        this.f12471k = nVar;
        this.f12472l = b0Var;
        cVar.mo14271a(new C4151a());
        this.f12473m = dVar;
        this.f12474n = new C4152b();
    }

    /* renamed from: c */
    static <K> C4150f<K> m18301c(RecyclerView recyclerView, C4144d dVar, int i, C4206t<K> tVar, C4168j0<K> j0Var, C4168j0.C4175c<K> cVar, C4146e eVar, C4186n<K> nVar, C4139b0 b0Var) {
        RecyclerView recyclerView2 = recyclerView;
        int i2 = i;
        C4168j0.C4175c<K> cVar2 = cVar;
        return new C4150f(new C4157g(recyclerView, i, tVar, cVar), dVar, tVar, j0Var, eVar, nVar, b0Var);
    }

    /* renamed from: d */
    private void m18302d() {
        int j = this.f12477q.mo14367j();
        if (j != -1 && this.f12469i.mo14301m(this.f12468h.mo10099a(j))) {
            this.f12469i.mo14292d(j);
        }
        this.f12469i.mo14302n();
        this.f12472l.mo14259g();
        this.f12467g.mo14273c();
        C4197r<K> rVar = this.f12477q;
        if (rVar != null) {
            rVar.mo14372w();
            this.f12477q.mo14368p();
        }
        this.f12477q = null;
        this.f12476p = null;
        this.f12473m.mo14263a();
    }

    /* renamed from: e */
    private boolean m18303e() {
        return this.f12477q != null;
    }

    /* renamed from: g */
    private void m18304g() {
        this.f12467g.mo14274d(new Rect(Math.min(this.f12476p.x, this.f12475o.x), Math.min(this.f12476p.y, this.f12475o.y), Math.max(this.f12476p.x, this.f12475o.x), Math.max(this.f12476p.y, this.f12475o.y)));
    }

    /* renamed from: h */
    private boolean m18305h(MotionEvent motionEvent) {
        return C4207u.m18532m(motionEvent) && C4207u.m18525f(motionEvent) && this.f12470j.mo14265a(motionEvent) && !m18303e();
    }

    /* renamed from: i */
    private boolean m18306i(MotionEvent motionEvent) {
        return m18303e() && C4207u.m18526g(motionEvent);
    }

    /* renamed from: j */
    private void m18307j(MotionEvent motionEvent) {
        if (!C4207u.m18529j(motionEvent)) {
            this.f12469i.mo14293e();
        }
        Point b = C4207u.m18521b(motionEvent);
        C4197r<K> b2 = this.f12467g.mo14272b();
        this.f12477q = b2;
        b2.mo14365a(this.f12474n);
        this.f12472l.mo14258f();
        this.f12471k.mo14342a();
        this.f12476p = b;
        this.f12475o = b;
        this.f12477q.mo14371v(b);
    }

    /* renamed from: a */
    public void mo14260a() {
        if (m18303e()) {
            this.f12467g.mo14273c();
            C4197r<K> rVar = this.f12477q;
            if (rVar != null) {
                rVar.mo14372w();
                this.f12477q.mo14368p();
            }
            this.f12477q = null;
            this.f12476p = null;
            this.f12473m.mo14263a();
        }
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return m18303e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo14269f(RecyclerView recyclerView, int i, int i2) {
        if (m18303e()) {
            Point point = this.f12476p;
            if (point == null) {
                Log.e("BandSelectionHelper", "onScrolled called while mOrigin null.");
            } else if (this.f12475o == null) {
                Log.e("BandSelectionHelper", "onScrolled called while mCurrentPosition null.");
            } else {
                point.y -= i2;
                m18304g();
            }
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (m18305h(motionEvent)) {
            m18307j(motionEvent);
        } else if (m18306i(motionEvent)) {
            m18302d();
        }
        return m18303e();
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (m18306i(motionEvent)) {
            m18302d();
        } else if (m18303e()) {
            Point b = C4207u.m18521b(motionEvent);
            this.f12475o = b;
            this.f12477q.mo14370u(b);
            m18304g();
            this.f12473m.mo14264b(this.f12475o);
        }
    }
}
