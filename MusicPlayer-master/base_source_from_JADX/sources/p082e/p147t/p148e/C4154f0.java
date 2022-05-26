package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p082e.p147t.p148e.C4168j0;

/* renamed from: e.t.e.f0 */
/* compiled from: ResetManager */
final class C4154f0<K> {

    /* renamed from: a */
    private final List<C4159g0> f12480a = new ArrayList();

    /* renamed from: b */
    private final RecyclerView.C0816s f12481b = new C4155a();

    /* renamed from: c */
    private final C4168j0.C4174b<K> f12482c = new C4156b();

    /* renamed from: e.t.e.f0$a */
    /* compiled from: ResetManager */
    class C4155a implements RecyclerView.C0816s {
        C4155a() {
        }

        public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (!C4207u.m18523d(motionEvent)) {
                return false;
            }
            C4154f0.this.mo14276b();
            return false;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
        }

        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        }
    }

    /* renamed from: e.t.e.f0$b */
    /* compiled from: ResetManager */
    class C4156b extends C4168j0.C4174b<K> {
        C4156b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo14279c() {
            C4154f0.this.mo14276b();
        }
    }

    C4154f0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14275a(C4159g0 g0Var) {
        this.f12480a.add(g0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14276b() {
        for (C4159g0 next : this.f12480a) {
            if (next.mo14261b()) {
                next.mo14260a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public RecyclerView.C0816s mo14277c() {
        return this.f12481b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C4168j0.C4174b<K> mo14278d() {
        return this.f12482c;
    }
}
