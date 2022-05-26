package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
/* compiled from: SnapHelper */
public abstract class C0917z extends RecyclerView.C0815r {

    /* renamed from: a */
    RecyclerView f4063a;

    /* renamed from: b */
    private Scroller f4064b;

    /* renamed from: c */
    private final RecyclerView.C0817t f4065c = new C0918a();

    /* renamed from: androidx.recyclerview.widget.z$a */
    /* compiled from: SnapHelper */
    class C0918a extends RecyclerView.C0817t {

        /* renamed from: a */
        boolean f4066a = false;

        C0918a() {
        }

        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
            super.mo4984a(recyclerView, i);
            if (i == 0 && this.f4066a) {
                this.f4066a = false;
                C0917z.this.mo5432l();
            }
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4066a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.z$b */
    /* compiled from: SnapHelper */
    class C0919b extends C0901p {
        C0919b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5048o(View view, RecyclerView.C0826z zVar, RecyclerView.C0823y.C0824a aVar) {
            C0917z zVar2 = C0917z.this;
            RecyclerView recyclerView = zVar2.f4063a;
            if (recyclerView != null) {
                int[] c = zVar2.mo5377c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo5374w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo5055d(i, i2, w, this.f4039j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5373v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m5662g() {
        this.f4063a.mo4624h1(this.f4065c);
        this.f4063a.setOnFlingListener((RecyclerView.C0815r) null);
    }

    /* renamed from: j */
    private void m5663j() throws IllegalStateException {
        if (this.f4063a.getOnFlingListener() == null) {
            this.f4063a.mo4634l(this.f4065c);
            this.f4063a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m5664k(RecyclerView.C0809p pVar, int i, int i2) {
        RecyclerView.C0823y e;
        int i3;
        if (!(pVar instanceof RecyclerView.C0823y.C0825b) || (e = mo5403e(pVar)) == null || (i3 = mo5379i(pVar, i, i2)) == -1) {
            return false;
        }
        e.mo5049p(i3);
        pVar.mo4902K1(e);
        return true;
    }

    /* renamed from: a */
    public boolean mo4980a(int i, int i2) {
        RecyclerView.C0809p layoutManager = this.f4063a.getLayoutManager();
        if (layoutManager == null || this.f4063a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4063a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m5664k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo5429b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4063a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m5662g();
            }
            this.f4063a = recyclerView;
            if (recyclerView != null) {
                m5663j();
                this.f4064b = new Scroller(this.f4063a.getContext(), new DecelerateInterpolator());
                mo5432l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo5377c(RecyclerView.C0809p pVar, View view);

    /* renamed from: d */
    public int[] mo5430d(int i, int i2) {
        this.f4064b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f4064b.getFinalX(), this.f4064b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C0823y mo5403e(RecyclerView.C0809p pVar) {
        return mo5431f(pVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C0901p mo5431f(RecyclerView.C0809p pVar) {
        if (!(pVar instanceof RecyclerView.C0823y.C0825b)) {
            return null;
        }
        return new C0919b(this.f4063a.getContext());
    }

    /* renamed from: h */
    public abstract View mo5378h(RecyclerView.C0809p pVar);

    /* renamed from: i */
    public abstract int mo5379i(RecyclerView.C0809p pVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5432l() {
        RecyclerView.C0809p layoutManager;
        View h;
        RecyclerView recyclerView = this.f4063a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo5378h(layoutManager)) != null) {
            int[] c = mo5377c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f4063a.mo4694u1(c[0], c[1]);
            }
        }
    }
}
