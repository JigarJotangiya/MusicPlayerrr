package p082e.p147t.p148e;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3774v;
import p082e.p147t.p148e.C4168j0;

/* renamed from: e.t.e.q */
/* compiled from: GestureSelectionHelper */
final class C4194q implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private final C4168j0<?> f12551g;

    /* renamed from: h */
    private final C4168j0.C4175c<?> f12552h;

    /* renamed from: i */
    private final C4144d f12553i;

    /* renamed from: j */
    private final C4196b f12554j;

    /* renamed from: k */
    private final C4139b0 f12555k;

    /* renamed from: l */
    private boolean f12556l = false;

    /* renamed from: e.t.e.q$a */
    /* compiled from: GestureSelectionHelper */
    static final class C4195a extends C4196b {

        /* renamed from: a */
        private final RecyclerView f12557a;

        C4195a(RecyclerView recyclerView) {
            C3703i.m15824a(recyclerView != null);
            this.f12557a = recyclerView;
        }

        /* renamed from: b */
        static boolean m18464b(int i, int i2, int i3, MotionEvent motionEvent, int i4) {
            if (i4 == 0) {
                return motionEvent.getX() > ((float) i3) && motionEvent.getY() > ((float) i);
            }
            if (motionEvent.getX() >= ((float) i2) || motionEvent.getY() <= ((float) i)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo14364a(MotionEvent motionEvent) {
            View J = this.f12557a.getLayoutManager().mo4900J(this.f12557a.getLayoutManager().mo4901K() - 1);
            boolean b = m18464b(J.getTop(), J.getLeft(), J.getRight(), motionEvent, C3774v.m16151B(this.f12557a));
            float f = C4194q.m18458f((float) this.f12557a.getHeight(), motionEvent.getY());
            if (b) {
                return this.f12557a.getAdapter().getItemCount() - 1;
            }
            RecyclerView recyclerView = this.f12557a;
            return recyclerView.mo4600g0(recyclerView.mo4562S(motionEvent.getX(), f));
        }
    }

    /* renamed from: e.t.e.q$b */
    /* compiled from: GestureSelectionHelper */
    static abstract class C4196b {
        C4196b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract int mo14364a(MotionEvent motionEvent);
    }

    C4194q(C4168j0<?> j0Var, C4168j0.C4175c<?> cVar, C4196b bVar, C4144d dVar, C4139b0 b0Var) {
        boolean z = false;
        C3703i.m15824a(j0Var != null);
        C3703i.m15824a(cVar != null);
        C3703i.m15824a(bVar != null);
        C3703i.m15824a(dVar != null);
        C3703i.m15824a(b0Var != null ? true : z);
        this.f12551g = j0Var;
        this.f12552h = cVar;
        this.f12554j = bVar;
        this.f12553i = dVar;
        this.f12555k = b0Var;
    }

    /* renamed from: c */
    static C4194q m18455c(C4168j0<?> j0Var, C4168j0.C4175c<?> cVar, RecyclerView recyclerView, C4144d dVar, C4139b0 b0Var) {
        return new C4194q(j0Var, cVar, new C4195a(recyclerView), dVar, b0Var);
    }

    /* renamed from: d */
    private void m18456d() {
        this.f12556l = false;
        this.f12553i.mo14263a();
        this.f12555k.mo14259g();
    }

    /* renamed from: e */
    private void m18457e(int i) {
        this.f12551g.mo14295g(i);
    }

    /* renamed from: f */
    static float m18458f(float f, float f2) {
        if (f2 < 0.0f) {
            return 0.0f;
        }
        return f2 > f ? f : f2;
    }

    /* renamed from: g */
    private void m18459g(MotionEvent motionEvent) {
        if (!this.f12556l) {
            Log.e("GestureSelectionHelper", "Received event while not started.");
        }
        int a = this.f12554j.mo14364a(motionEvent);
        if (this.f12552h.mo14325b(a, true)) {
            m18457e(a);
        }
        this.f12553i.mo14264b(C4207u.m18521b(motionEvent));
    }

    /* renamed from: h */
    private void m18460h() {
        this.f12551g.mo14302n();
        m18456d();
    }

    /* renamed from: a */
    public void mo14260a() {
        this.f12556l = false;
        this.f12553i.mo14263a();
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return this.f12556l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo14363i() {
        if (!this.f12556l) {
            this.f12556l = true;
            this.f12555k.mo14258f();
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12556l) {
            onTouchEvent(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 2) {
            return this.f12556l;
        }
        return false;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12556l) {
            if (!this.f12551g.mo14300l()) {
                Log.e("GestureSelectionHelper", "Internal state of GestureSelectionHelper out of sync w/ SelectionTracker (isRangeActive is false). Ignoring event and resetting state.");
                m18456d();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                m18460h();
            } else if (actionMasked == 2) {
                m18459g(motionEvent);
            }
        }
    }
}
