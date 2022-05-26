package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
/* compiled from: ChildHelper */
class C0851f {

    /* renamed from: a */
    final C0853b f3837a;

    /* renamed from: b */
    final C0852a f3838b = new C0852a();

    /* renamed from: c */
    final List<View> f3839c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.f$a */
    /* compiled from: ChildHelper */
    static class C0852a {

        /* renamed from: a */
        long f3840a = 0;

        /* renamed from: b */
        C0852a f3841b;

        C0852a() {
        }

        /* renamed from: c */
        private void m5354c() {
            if (this.f3841b == null) {
                this.f3841b = new C0852a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5230a(int i) {
            if (i >= 64) {
                C0852a aVar = this.f3841b;
                if (aVar != null) {
                    aVar.mo5230a(i - 64);
                    return;
                }
                return;
            }
            this.f3840a &= ~(1 << i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5231b(int i) {
            C0852a aVar = this.f3841b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f3840a);
                }
                return Long.bitCount(this.f3840a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f3840a & ((1 << i) - 1));
            } else {
                return aVar.mo5231b(i - 64) + Long.bitCount(this.f3840a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo5232d(int i) {
            if (i < 64) {
                return (this.f3840a & (1 << i)) != 0;
            }
            m5354c();
            return this.f3841b.mo5232d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5233e(int i, boolean z) {
            if (i >= 64) {
                m5354c();
                this.f3841b.mo5233e(i - 64, z);
                return;
            }
            long j = this.f3840a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3840a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo5236h(i);
            } else {
                mo5230a(i);
            }
            if (z2 || this.f3841b != null) {
                m5354c();
                this.f3841b.mo5233e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5234f(int i) {
            if (i >= 64) {
                m5354c();
                return this.f3841b.mo5234f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3840a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f3840a = j3;
            long j4 = j - 1;
            this.f3840a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C0852a aVar = this.f3841b;
            if (aVar != null) {
                if (aVar.mo5232d(0)) {
                    mo5236h(63);
                }
                this.f3841b.mo5234f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5235g() {
            this.f3840a = 0;
            C0852a aVar = this.f3841b;
            if (aVar != null) {
                aVar.mo5235g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5236h(int i) {
            if (i >= 64) {
                m5354c();
                this.f3841b.mo5236h(i - 64);
                return;
            }
            this.f3840a |= 1 << i;
        }

        public String toString() {
            if (this.f3841b == null) {
                return Long.toBinaryString(this.f3840a);
            }
            return this.f3841b.toString() + "xx" + Long.toBinaryString(this.f3840a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    /* compiled from: ChildHelper */
    interface C0853b {
        /* renamed from: a */
        void mo4773a(View view);

        /* renamed from: b */
        void mo4774b();

        /* renamed from: c */
        int mo4775c(View view);

        /* renamed from: d */
        RecyclerView.C0792c0 mo4776d(View view);

        /* renamed from: e */
        void mo4777e(int i);

        /* renamed from: f */
        void mo4778f(View view);

        /* renamed from: g */
        void mo4779g(View view, int i);

        View getChildAt(int i);

        int getChildCount();

        /* renamed from: h */
        void mo4782h(int i);

        /* renamed from: i */
        void mo4783i(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    C0851f(C0853b bVar) {
        this.f3837a = bVar;
    }

    /* renamed from: h */
    private int m5334h(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f3837a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int b = i - (i2 - this.f3838b.mo5231b(i2));
            if (b == 0) {
                while (this.f3838b.mo5232d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m5335l(View view) {
        this.f3839c.add(view);
        this.f3837a.mo4773a(view);
    }

    /* renamed from: t */
    private boolean m5336t(View view) {
        if (!this.f3839c.remove(view)) {
            return false;
        }
        this.f3837a.mo4778f(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5212a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3837a.getChildCount();
        } else {
            i2 = m5334h(i);
        }
        this.f3838b.mo5233e(i2, z);
        if (z) {
            m5335l(view);
        }
        this.f3837a.mo4779g(view, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5213b(View view, boolean z) {
        mo5212a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5214c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f3837a.getChildCount();
        } else {
            i2 = m5334h(i);
        }
        this.f3838b.mo5233e(i2, z);
        if (z) {
            m5335l(view);
        }
        this.f3837a.mo4783i(view, i2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5215d(int i) {
        int h = m5334h(i);
        this.f3838b.mo5234f(h);
        this.f3837a.mo4777e(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo5216e(int i) {
        int size = this.f3839c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3839c.get(i2);
            RecyclerView.C0792c0 d = this.f3837a.mo4776d(view);
            if (d.getLayoutPosition() == i && !d.isInvalid() && !d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo5217f(int i) {
        return this.f3837a.getChildAt(m5334h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5218g() {
        return this.f3837a.getChildCount() - this.f3839c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo5219i(int i) {
        return this.f3837a.getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo5220j() {
        return this.f3837a.getChildCount();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5221k(View view) {
        int c = this.f3837a.mo4775c(view);
        if (c >= 0) {
            this.f3838b.mo5236h(c);
            m5335l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5222m(View view) {
        int c = this.f3837a.mo4775c(view);
        if (c != -1 && !this.f3838b.mo5232d(c)) {
            return c - this.f3838b.mo5231b(c);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo5223n(View view) {
        return this.f3839c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5224o() {
        this.f3838b.mo5235g();
        for (int size = this.f3839c.size() - 1; size >= 0; size--) {
            this.f3837a.mo4778f(this.f3839c.get(size));
            this.f3839c.remove(size);
        }
        this.f3837a.mo4774b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5225p(View view) {
        int c = this.f3837a.mo4775c(view);
        if (c >= 0) {
            if (this.f3838b.mo5234f(c)) {
                m5336t(view);
            }
            this.f3837a.mo4782h(c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5226q(int i) {
        int h = m5334h(i);
        View childAt = this.f3837a.getChildAt(h);
        if (childAt != null) {
            if (this.f3838b.mo5234f(h)) {
                m5336t(childAt);
            }
            this.f3837a.mo4782h(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5227r(View view) {
        int c = this.f3837a.mo4775c(view);
        if (c == -1) {
            m5336t(view);
            return true;
        } else if (!this.f3838b.mo5232d(c)) {
            return false;
        } else {
            this.f3838b.mo5234f(c);
            m5336t(view);
            this.f3837a.mo4782h(c);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo5228s(View view) {
        int c = this.f3837a.mo4775c(view);
        if (c < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3838b.mo5232d(c)) {
            this.f3838b.mo5230a(c);
            m5336t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3838b.toString() + ", hidden list:" + this.f3839c.size();
    }
}
