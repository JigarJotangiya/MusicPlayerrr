package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: e.t.e.k */
/* compiled from: EventBackstop */
class C4176k implements RecyclerView.C0816s, C4159g0 {

    /* renamed from: g */
    private boolean f12523g;

    C4176k() {
    }

    /* renamed from: a */
    public void mo14260a() {
        this.f12523g = false;
    }

    /* renamed from: b */
    public boolean mo14261b() {
        return this.f12523g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo14334c() {
        this.f12523g = true;
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!C4207u.m18526g(motionEvent) || !this.f12523g) {
            if (C4207u.m18524e(motionEvent) && mo14261b()) {
                mo14260a();
            }
            return false;
        }
        this.f12523g = false;
        return true;
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        throw new UnsupportedOperationException("Wrap me in an InterceptFilter.");
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
