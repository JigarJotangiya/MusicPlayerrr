package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
/* compiled from: LinearSnapHelper */
public class C0902q extends C0917z {

    /* renamed from: d */
    private C0908u f4046d;

    /* renamed from: e */
    private C0908u f4047e;

    /* renamed from: m */
    private float m5531m(RecyclerView.C0809p pVar, C0908u uVar) {
        int max;
        int K = pVar.mo4901K();
        if (K == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < K; i3++) {
            View J = pVar.mo4900J(i3);
            int i0 = pVar.mo4941i0(J);
            if (i0 != -1) {
                if (i0 < i) {
                    view = J;
                    i = i0;
                }
                if (i0 > i2) {
                    view2 = J;
                    i2 = i0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(uVar.mo5387d(view), uVar.mo5387d(view2)) - Math.min(uVar.mo5390g(view), uVar.mo5390g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    private int m5532n(View view, C0908u uVar) {
        return (uVar.mo5390g(view) + (uVar.mo5388e(view) / 2)) - (uVar.mo5396m() + (uVar.mo5397n() / 2));
    }

    /* renamed from: o */
    private int m5533o(RecyclerView.C0809p pVar, C0908u uVar, int i, int i2) {
        int[] d = mo5430d(i, i2);
        float m = m5531m(pVar, uVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    /* renamed from: p */
    private View m5534p(RecyclerView.C0809p pVar, C0908u uVar) {
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

    /* renamed from: q */
    private C0908u m5535q(RecyclerView.C0809p pVar) {
        C0908u uVar = this.f4047e;
        if (uVar == null || uVar.f4052a != pVar) {
            this.f4047e = C0908u.m5556a(pVar);
        }
        return this.f4047e;
    }

    /* renamed from: r */
    private C0908u m5536r(RecyclerView.C0809p pVar) {
        C0908u uVar = this.f4046d;
        if (uVar == null || uVar.f4052a != pVar) {
            this.f4046d = C0908u.m5558c(pVar);
        }
        return this.f4046d;
    }

    /* renamed from: c */
    public int[] mo5377c(RecyclerView.C0809p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.mo4495l()) {
            iArr[0] = m5532n(view, m5535q(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.mo4496m()) {
            iArr[1] = m5532n(view, m5536r(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo5378h(RecyclerView.C0809p pVar) {
        if (pVar.mo4496m()) {
            return m5534p(pVar, m5536r(pVar));
        }
        if (pVar.mo4495l()) {
            return m5534p(pVar, m5535q(pVar));
        }
        return null;
    }

    /* renamed from: i */
    public int mo5379i(RecyclerView.C0809p pVar, int i, int i2) {
        int Z;
        View h;
        int i0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(pVar instanceof RecyclerView.C0823y.C0825b) || (Z = pVar.mo4921Z()) == 0 || (h = mo5378h(pVar)) == null || (i0 = pVar.mo4941i0(h)) == -1 || (a = ((RecyclerView.C0823y.C0825b) pVar).mo4486a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (pVar.mo4495l()) {
            i4 = m5533o(pVar, m5535q(pVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (pVar.mo4496m()) {
            i5 = m5533o(pVar, m5536r(pVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (pVar.mo4496m()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = i0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= Z ? Z - 1 : i6;
    }
}
