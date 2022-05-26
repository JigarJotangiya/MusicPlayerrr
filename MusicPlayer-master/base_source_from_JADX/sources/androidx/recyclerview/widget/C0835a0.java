package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.a0 */
/* compiled from: ViewBoundsCheck */
class C0835a0 {

    /* renamed from: a */
    final C0837b f3793a;

    /* renamed from: b */
    C0836a f3794b = new C0836a();

    /* renamed from: androidx.recyclerview.widget.a0$a */
    /* compiled from: ViewBoundsCheck */
    static class C0836a {

        /* renamed from: a */
        int f3795a = 0;

        /* renamed from: b */
        int f3796b;

        /* renamed from: c */
        int f3797c;

        /* renamed from: d */
        int f3798d;

        /* renamed from: e */
        int f3799e;

        C0836a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5168a(int i) {
            this.f3795a = i | this.f3795a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5169b() {
            int i = this.f3795a;
            if ((i & 7) != 0 && (i & (mo5170c(this.f3798d, this.f3796b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3795a;
            if ((i2 & 112) != 0 && (i2 & (mo5170c(this.f3798d, this.f3797c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3795a;
            if ((i3 & 1792) != 0 && (i3 & (mo5170c(this.f3799e, this.f3796b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3795a;
            if ((i4 & 28672) == 0 || (i4 & (mo5170c(this.f3799e, this.f3797c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5170c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5171d() {
            this.f3795a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5172e(int i, int i2, int i3, int i4) {
            this.f3796b = i;
            this.f3797c = i2;
            this.f3798d = i3;
            this.f3799e = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.a0$b */
    /* compiled from: ViewBoundsCheck */
    interface C0837b {
        /* renamed from: a */
        int mo4972a(View view);

        /* renamed from: b */
        int mo4973b();

        /* renamed from: c */
        int mo4974c();

        /* renamed from: d */
        int mo4975d(View view);

        View getChildAt(int i);
    }

    C0835a0(C0837b bVar) {
        this.f3793a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5166a(int i, int i2, int i3, int i4) {
        int b = this.f3793a.mo4973b();
        int c = this.f3793a.mo4974c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.f3793a.getChildAt(i);
            this.f3794b.mo5172e(b, c, this.f3793a.mo4972a(childAt), this.f3793a.mo4975d(childAt));
            if (i3 != 0) {
                this.f3794b.mo5171d();
                this.f3794b.mo5168a(i3);
                if (this.f3794b.mo5169b()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.f3794b.mo5171d();
                this.f3794b.mo5168a(i4);
                if (this.f3794b.mo5169b()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo5167b(View view, int i) {
        this.f3794b.mo5172e(this.f3793a.mo4973b(), this.f3793a.mo4974c(), this.f3793a.mo4972a(view), this.f3793a.mo4975d(view));
        if (i == 0) {
            return false;
        }
        this.f3794b.mo5171d();
        this.f3794b.mo5168a(i);
        return this.f3794b.mo5169b();
    }
}
