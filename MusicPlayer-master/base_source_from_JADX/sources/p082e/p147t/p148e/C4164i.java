package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e.t.e.i */
/* compiled from: DisallowInterceptFilter */
class C4164i implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private final RecyclerView.C0816s f12503g;

    /* renamed from: h */
    private boolean f12504h;

    C4164i(RecyclerView.C0816s sVar) {
        this.f12503g = sVar;
    }

    /* renamed from: a */
    public void mo14260a() {
        this.f12504h = false;
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return this.f12504h;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12504h && C4207u.m18524e(motionEvent)) {
            this.f12504h = false;
        }
        if (this.f12504h || !this.f12503g.onInterceptTouchEvent(recyclerView, motionEvent)) {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f12504h = true;
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f12503g.onInterceptTouchEvent(recyclerView, motionEvent);
    }
}
