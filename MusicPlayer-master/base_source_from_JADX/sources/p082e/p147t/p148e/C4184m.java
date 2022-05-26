package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.m */
/* compiled from: EventRouter */
final class C4184m implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private final C4183l0<RecyclerView.C0816s> f12531g = new C4183l0<>(new C4167j());

    /* renamed from: h */
    private boolean f12532h;

    C4184m() {
    }

    /* renamed from: a */
    public void mo14260a() {
        this.f12532h = false;
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return this.f12532h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14338c(int i, RecyclerView.C0816s sVar) {
        C3703i.m15824a(sVar != null);
        this.f12531g.mo14337b(i, sVar);
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12532h && C4207u.m18524e(motionEvent)) {
            this.f12532h = false;
        }
        if (this.f12532h || !this.f12531g.mo14336a(motionEvent).onInterceptTouchEvent(recyclerView, motionEvent)) {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            this.f12532h = z;
        }
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.f12532h) {
            this.f12531g.mo14336a(motionEvent).onTouchEvent(recyclerView, motionEvent);
        }
    }
}
