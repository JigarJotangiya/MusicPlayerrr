package p082e.p147t.p148e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.o */
/* compiled from: GestureDetectorWrapper */
final class C4192o implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private final GestureDetector f12548g;

    /* renamed from: h */
    private boolean f12549h;

    C4192o(GestureDetector gestureDetector) {
        C3703i.m15824a(gestureDetector != null);
        this.f12548g = gestureDetector;
    }

    /* renamed from: c */
    private void m18451c() {
        this.f12548g.onTouchEvent(C4207u.m18520a());
    }

    /* renamed from: a */
    public void mo14260a() {
        this.f12549h = false;
        m18451c();
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return true;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f12549h && C4207u.m18524e(motionEvent)) {
            this.f12549h = false;
        }
        if (this.f12549h || !this.f12548g.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            this.f12549h = z;
            m18451c();
        }
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
