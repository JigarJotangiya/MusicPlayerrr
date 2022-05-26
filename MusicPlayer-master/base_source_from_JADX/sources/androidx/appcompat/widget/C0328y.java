package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y */
/* compiled from: RtlSpacingHelper */
class C0328y {

    /* renamed from: a */
    private int f1443a = 0;

    /* renamed from: b */
    private int f1444b = 0;

    /* renamed from: c */
    private int f1445c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1446d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1447e = 0;

    /* renamed from: f */
    private int f1448f = 0;

    /* renamed from: g */
    private boolean f1449g = false;

    /* renamed from: h */
    private boolean f1450h = false;

    C0328y() {
    }

    /* renamed from: a */
    public int mo2201a() {
        return this.f1449g ? this.f1443a : this.f1444b;
    }

    /* renamed from: b */
    public int mo2202b() {
        return this.f1443a;
    }

    /* renamed from: c */
    public int mo2203c() {
        return this.f1444b;
    }

    /* renamed from: d */
    public int mo2204d() {
        return this.f1449g ? this.f1444b : this.f1443a;
    }

    /* renamed from: e */
    public void mo2205e(int i, int i2) {
        this.f1450h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1447e = i;
            this.f1443a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1448f = i2;
            this.f1444b = i2;
        }
    }

    /* renamed from: f */
    public void mo2206f(boolean z) {
        if (z != this.f1449g) {
            this.f1449g = z;
            if (!this.f1450h) {
                this.f1443a = this.f1447e;
                this.f1444b = this.f1448f;
            } else if (z) {
                int i = this.f1446d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1447e;
                }
                this.f1443a = i;
                int i2 = this.f1445c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1448f;
                }
                this.f1444b = i2;
            } else {
                int i3 = this.f1445c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1447e;
                }
                this.f1443a = i3;
                int i4 = this.f1446d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1448f;
                }
                this.f1444b = i4;
            }
        }
    }

    /* renamed from: g */
    public void mo2207g(int i, int i2) {
        this.f1445c = i;
        this.f1446d = i2;
        this.f1450h = true;
        if (this.f1449g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1443a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1444b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1443a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1444b = i2;
        }
    }
}
