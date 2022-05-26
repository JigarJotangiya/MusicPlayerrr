package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
/* compiled from: OrientationHelper */
public abstract class C0908u {

    /* renamed from: a */
    protected final RecyclerView.C0809p f4052a;

    /* renamed from: b */
    private int f4053b;

    /* renamed from: c */
    final Rect f4054c;

    /* renamed from: androidx.recyclerview.widget.u$a */
    /* compiled from: OrientationHelper */
    class C0909a extends C0908u {
        C0909a(RecyclerView.C0809p pVar) {
            super(pVar, (C0909a) null);
        }

        /* renamed from: d */
        public int mo5387d(View view) {
            return this.f4052a.mo4915U(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo5388e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f4052a.mo4914T(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: f */
        public int mo5389f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f4052a.mo4913S(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: g */
        public int mo5390g(View view) {
            return this.f4052a.mo4911R(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo5391h() {
            return this.f4052a.mo4955p0();
        }

        /* renamed from: i */
        public int mo5392i() {
            return this.f4052a.mo4955p0() - this.f4052a.mo4936g0();
        }

        /* renamed from: j */
        public int mo5393j() {
            return this.f4052a.mo4936g0();
        }

        /* renamed from: k */
        public int mo5394k() {
            return this.f4052a.mo4957q0();
        }

        /* renamed from: l */
        public int mo5395l() {
            return this.f4052a.mo4920Y();
        }

        /* renamed from: m */
        public int mo5396m() {
            return this.f4052a.mo4934f0();
        }

        /* renamed from: n */
        public int mo5397n() {
            return (this.f4052a.mo4955p0() - this.f4052a.mo4934f0()) - this.f4052a.mo4936g0();
        }

        /* renamed from: p */
        public int mo5399p(View view) {
            this.f4052a.mo4953o0(view, true, this.f4054c);
            return this.f4054c.right;
        }

        /* renamed from: q */
        public int mo5400q(View view) {
            this.f4052a.mo4953o0(view, true, this.f4054c);
            return this.f4054c.left;
        }

        /* renamed from: r */
        public void mo5401r(int i) {
            this.f4052a.mo4888D0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    /* compiled from: OrientationHelper */
    class C0910b extends C0908u {
        C0910b(RecyclerView.C0809p pVar) {
            super(pVar, (C0909a) null);
        }

        /* renamed from: d */
        public int mo5387d(View view) {
            return this.f4052a.mo4908P(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo5388e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f4052a.mo4913S(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: f */
        public int mo5389f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f4052a.mo4914T(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: g */
        public int mo5390g(View view) {
            return this.f4052a.mo4916V(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo5391h() {
            return this.f4052a.mo4919X();
        }

        /* renamed from: i */
        public int mo5392i() {
            return this.f4052a.mo4919X() - this.f4052a.mo4932e0();
        }

        /* renamed from: j */
        public int mo5393j() {
            return this.f4052a.mo4932e0();
        }

        /* renamed from: k */
        public int mo5394k() {
            return this.f4052a.mo4920Y();
        }

        /* renamed from: l */
        public int mo5395l() {
            return this.f4052a.mo4957q0();
        }

        /* renamed from: m */
        public int mo5396m() {
            return this.f4052a.mo4938h0();
        }

        /* renamed from: n */
        public int mo5397n() {
            return (this.f4052a.mo4919X() - this.f4052a.mo4938h0()) - this.f4052a.mo4932e0();
        }

        /* renamed from: p */
        public int mo5399p(View view) {
            this.f4052a.mo4953o0(view, true, this.f4054c);
            return this.f4054c.bottom;
        }

        /* renamed from: q */
        public int mo5400q(View view) {
            this.f4052a.mo4953o0(view, true, this.f4054c);
            return this.f4054c.top;
        }

        /* renamed from: r */
        public void mo5401r(int i) {
            this.f4052a.mo4889E0(i);
        }
    }

    /* synthetic */ C0908u(RecyclerView.C0809p pVar, C0909a aVar) {
        this(pVar);
    }

    /* renamed from: a */
    public static C0908u m5556a(RecyclerView.C0809p pVar) {
        return new C0909a(pVar);
    }

    /* renamed from: b */
    public static C0908u m5557b(RecyclerView.C0809p pVar, int i) {
        if (i == 0) {
            return m5556a(pVar);
        }
        if (i == 1) {
            return m5558c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C0908u m5558c(RecyclerView.C0809p pVar) {
        return new C0910b(pVar);
    }

    /* renamed from: d */
    public abstract int mo5387d(View view);

    /* renamed from: e */
    public abstract int mo5388e(View view);

    /* renamed from: f */
    public abstract int mo5389f(View view);

    /* renamed from: g */
    public abstract int mo5390g(View view);

    /* renamed from: h */
    public abstract int mo5391h();

    /* renamed from: i */
    public abstract int mo5392i();

    /* renamed from: j */
    public abstract int mo5393j();

    /* renamed from: k */
    public abstract int mo5394k();

    /* renamed from: l */
    public abstract int mo5395l();

    /* renamed from: m */
    public abstract int mo5396m();

    /* renamed from: n */
    public abstract int mo5397n();

    /* renamed from: o */
    public int mo5398o() {
        if (Integer.MIN_VALUE == this.f4053b) {
            return 0;
        }
        return mo5397n() - this.f4053b;
    }

    /* renamed from: p */
    public abstract int mo5399p(View view);

    /* renamed from: q */
    public abstract int mo5400q(View view);

    /* renamed from: r */
    public abstract void mo5401r(int i);

    /* renamed from: s */
    public void mo5402s() {
        this.f4053b = mo5397n();
    }

    private C0908u(RecyclerView.C0809p pVar) {
        this.f4053b = Integer.MIN_VALUE;
        this.f4054c = new Rect();
        this.f4052a = pVar;
    }
}
