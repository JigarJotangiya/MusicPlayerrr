package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
/* compiled from: PagerSnapHelper */
public class C0911v extends C0917z {

    /* renamed from: d */
    private C0908u f4055d;

    /* renamed from: e */
    private C0908u f4056e;

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* compiled from: PagerSnapHelper */
    class C0912a extends C0901p {
        C0912a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5048o(View view, RecyclerView.C0826z zVar, RecyclerView.C0823y.C0824a aVar) {
            C0911v vVar = C0911v.this;
            int[] c = vVar.mo5377c(vVar.f4063a.getLayoutManager(), view);
            int i = c[0];
            int i2 = c[1];
            int w = mo5374w(Math.max(Math.abs(i), Math.abs(i2)));
            if (w > 0) {
                aVar.mo5055d(i, i2, w, this.f4039j);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5373v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo5375x(int i) {
            return Math.min(100, super.mo5375x(i));
        }
    }

    /* renamed from: m */
    private int m5603m(View view, C0908u uVar) {
        return (uVar.mo5390g(view) + (uVar.mo5388e(view) / 2)) - (uVar.mo5396m() + (uVar.mo5397n() / 2));
    }

    /* renamed from: n */
    private View m5604n(RecyclerView.C0809p pVar, C0908u uVar) {
        int K = pVar.mo4901K();
        View view = null;
        if (K == 0) {
            return null;
        }
        int m = uVar.mo5396m() + (uVar.mo5397n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < K; i2++) {
            View J = pVar.mo4900J(i2);
            int abs = Math.abs((uVar.mo5390g(J) + (uVar.mo5388e(J) / 2)) - m);
            if (abs < i) {
                view = J;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: o */
    private C0908u m5605o(RecyclerView.C0809p pVar) {
        C0908u uVar = this.f4056e;
        if (uVar == null || uVar.f4052a != pVar) {
            this.f4056e = C0908u.m5556a(pVar);
        }
        return this.f4056e;
    }

    /* renamed from: p */
    private C0908u m5606p(RecyclerView.C0809p pVar) {
        if (pVar.mo4496m()) {
            return m5607q(pVar);
        }
        if (pVar.mo4495l()) {
            return m5605o(pVar);
        }
        return null;
    }

    /* renamed from: q */
    private C0908u m5607q(RecyclerView.C0809p pVar) {
        C0908u uVar = this.f4055d;
        if (uVar == null || uVar.f4052a != pVar) {
            this.f4055d = C0908u.m5558c(pVar);
        }
        return this.f4055d;
    }

    /* renamed from: r */
    private boolean m5608r(RecyclerView.C0809p pVar, int i, int i2) {
        return pVar.mo4495l() ? i > 0 : i2 > 0;
    }

    /* renamed from: s */
    private boolean m5609s(RecyclerView.C0809p pVar) {
        PointF a;
        int Z = pVar.mo4921Z();
        if (!(pVar instanceof RecyclerView.C0823y.C0825b) || (a = ((RecyclerView.C0823y.C0825b) pVar).mo4486a(Z - 1)) == null) {
            return false;
        }
        if (a.x < 0.0f || a.y < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int[] mo5377c(RecyclerView.C0809p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.mo4495l()) {
            iArr[0] = m5603m(view, m5605o(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo4496m()) {
            iArr[1] = m5603m(view, m5607q(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C0823y mo5403e(RecyclerView.C0809p pVar) {
        if (!(pVar instanceof RecyclerView.C0823y.C0825b)) {
            return null;
        }
        return new C0912a(this.f4063a.getContext());
    }

    /* renamed from: h */
    public View mo5378h(RecyclerView.C0809p pVar) {
        if (pVar.mo4496m()) {
            return m5604n(pVar, m5607q(pVar));
        }
        if (pVar.mo4495l()) {
            return m5604n(pVar, m5605o(pVar));
        }
        return null;
    }

    /* renamed from: i */
    public int mo5379i(RecyclerView.C0809p pVar, int i, int i2) {
        C0908u p;
        int Z = pVar.mo4921Z();
        if (Z == 0 || (p = m5606p(pVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int K = pVar.mo4901K();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < K; i5++) {
            View J = pVar.mo4900J(i5);
            if (J != null) {
                int m = m5603m(J, p);
                if (m <= 0 && m > i3) {
                    view2 = J;
                    i3 = m;
                }
                if (m >= 0 && m < i4) {
                    view = J;
                    i4 = m;
                }
            }
        }
        boolean r = m5608r(pVar, i, i2);
        if (r && view != null) {
            return pVar.mo4941i0(view);
        }
        if (!r && view2 != null) {
            return pVar.mo4941i0(view2);
        }
        if (r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int i0 = pVar.mo4941i0(view) + (m5609s(pVar) == r ? -1 : 1);
        if (i0 < 0 || i0 >= Z) {
            return -1;
        }
        return i0;
    }
}
