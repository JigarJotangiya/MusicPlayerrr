package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: BatchingListUpdateCallback */
public class C0850e implements C0905s {

    /* renamed from: a */
    final C0905s f3832a;

    /* renamed from: b */
    int f3833b = 0;

    /* renamed from: c */
    int f3834c = -1;

    /* renamed from: d */
    int f3835d = -1;

    /* renamed from: e */
    Object f3836e = null;

    public C0850e(C0905s sVar) {
        this.f3832a = sVar;
    }

    /* renamed from: a */
    public void mo5173a(int i, int i2) {
        mo5211e();
        this.f3832a.mo5173a(i, i2);
    }

    /* renamed from: b */
    public void mo5174b(int i, int i2) {
        int i3;
        if (this.f3833b == 1 && i >= (i3 = this.f3834c)) {
            int i4 = this.f3835d;
            if (i <= i3 + i4) {
                this.f3835d = i4 + i2;
                this.f3834c = Math.min(i, i3);
                return;
            }
        }
        mo5211e();
        this.f3834c = i;
        this.f3835d = i2;
        this.f3833b = 1;
    }

    /* renamed from: c */
    public void mo5175c(int i, int i2) {
        int i3;
        if (this.f3833b != 2 || (i3 = this.f3834c) < i || i3 > i + i2) {
            mo5211e();
            this.f3834c = i;
            this.f3835d = i2;
            this.f3833b = 2;
            return;
        }
        this.f3835d += i2;
        this.f3834c = i;
    }

    /* renamed from: d */
    public void mo5176d(int i, int i2, Object obj) {
        int i3;
        if (this.f3833b == 3) {
            int i4 = this.f3834c;
            int i5 = this.f3835d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f3836e == obj) {
                this.f3834c = Math.min(i, i4);
                this.f3835d = Math.max(i5 + i4, i3) - this.f3834c;
                return;
            }
        }
        mo5211e();
        this.f3834c = i;
        this.f3835d = i2;
        this.f3836e = obj;
        this.f3833b = 3;
    }

    /* renamed from: e */
    public void mo5211e() {
        int i = this.f3833b;
        if (i != 0) {
            if (i == 1) {
                this.f3832a.mo5174b(this.f3834c, this.f3835d);
            } else if (i == 2) {
                this.f3832a.mo5175c(this.f3834c, this.f3835d);
            } else if (i == 3) {
                this.f3832a.mo5176d(this.f3834c, this.f3835d, this.f3836e);
            }
            this.f3836e = null;
            this.f3833b = 0;
        }
    }
}
