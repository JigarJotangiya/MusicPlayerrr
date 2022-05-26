package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.c0 */
/* compiled from: PointerDragEventInterceptor */
final class C4143c0 implements RecyclerView.C0816s {

    /* renamed from: g */
    private final C4204s<?> f12459g;

    /* renamed from: h */
    private final C4212z f12460h;

    /* renamed from: i */
    private RecyclerView.C0816s f12461i;

    C4143c0(C4204s<?> sVar, C4212z zVar, RecyclerView.C0816s sVar2) {
        boolean z = true;
        C3703i.m15824a(sVar != null);
        C3703i.m15824a(zVar == null ? false : z);
        this.f12459g = sVar;
        this.f12460h = zVar;
        if (sVar2 != null) {
            this.f12461i = sVar2;
        } else {
            this.f12461i = new C4167j();
        }
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!C4207u.m18531l(motionEvent) || !this.f12459g.mo14386d(motionEvent)) {
            return this.f12461i.onInterceptTouchEvent(recyclerView, motionEvent);
        }
        return this.f12460h.mo14329a(motionEvent);
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
        this.f12461i.onRequestDisallowInterceptTouchEvent(z);
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.f12461i.onTouchEvent(recyclerView, motionEvent);
    }
}
