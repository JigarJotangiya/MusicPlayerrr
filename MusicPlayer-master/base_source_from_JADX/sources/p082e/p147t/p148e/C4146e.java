package p082e.p147t.p148e;

import android.view.MotionEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4204s;

/* renamed from: e.t.e.e */
/* compiled from: BandPredicate */
public abstract class C4146e {

    /* renamed from: e.t.e.e$a */
    /* compiled from: BandPredicate */
    public static final class C4147a extends C4146e {

        /* renamed from: a */
        private final RecyclerView f12462a;

        /* renamed from: b */
        private final C4204s<?> f12463b;

        public C4147a(RecyclerView recyclerView, C4204s<?> sVar) {
            boolean z = true;
            C3703i.m15824a(recyclerView != null);
            C3703i.m15824a(sVar == null ? false : z);
            this.f12462a = recyclerView;
            this.f12463b = sVar;
        }

        /* renamed from: a */
        public boolean mo14265a(MotionEvent motionEvent) {
            if (!C4146e.m18291b(this.f12462a) || this.f12462a.mo4663s0()) {
                return false;
            }
            C4204s.C4205a<?> a = this.f12463b.mo10098a(motionEvent);
            if (a == null || !a.mo14390d(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    static boolean m18291b(RecyclerView recyclerView) {
        RecyclerView.C0809p layoutManager = recyclerView.getLayoutManager();
        return (layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager);
    }

    /* renamed from: a */
    public abstract boolean mo14265a(MotionEvent motionEvent);
}
