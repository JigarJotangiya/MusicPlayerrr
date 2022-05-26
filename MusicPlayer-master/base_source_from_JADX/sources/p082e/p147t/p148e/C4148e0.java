package p082e.p147t.p148e;

import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.e0 */
/* compiled from: Range */
final class C4148e0 {

    /* renamed from: a */
    private final C4149a f12464a;

    /* renamed from: b */
    private final int f12465b;

    /* renamed from: c */
    private int f12466c = -1;

    /* renamed from: e.t.e.e0$a */
    /* compiled from: Range */
    static abstract class C4149a {
        C4149a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo14268a(int i, int i2, boolean z, int i3);
    }

    C4148e0(int i, C4149a aVar) {
        this.f12465b = i;
        this.f12464a = aVar;
    }

    /* renamed from: a */
    private void m18294a(int i, int i2) {
        C3703i.m15825b(this.f12466c == -1, "End has already been set.");
        this.f12466c = i;
        int i3 = this.f12465b;
        if (i > i3) {
            m18298f(i3 + 1, i, true, i2);
        } else if (i < i3) {
            m18298f(i, i3 - 1, true, i2);
        }
    }

    /* renamed from: c */
    private void m18295c(int i, int i2) {
        int i3 = this.f12466c;
        if (i < i3) {
            int i4 = this.f12465b;
            if (i < i4) {
                m18298f(i4 + 1, i3, false, i2);
                m18298f(i, this.f12465b - 1, true, i2);
                return;
            }
            m18298f(i + 1, i3, false, i2);
        } else if (i > i3) {
            m18298f(i3 + 1, i, true, i2);
        }
    }

    /* renamed from: d */
    private void m18296d(int i, int i2) {
        int i3 = this.f12466c;
        if (i > i3) {
            int i4 = this.f12465b;
            if (i > i4) {
                m18298f(i3, i4 - 1, false, i2);
                m18298f(this.f12465b + 1, i, true, i2);
                return;
            }
            m18298f(i3, i - 1, false, i2);
        } else if (i < i3) {
            m18298f(i, i3 - 1, true, i2);
        }
    }

    /* renamed from: e */
    private void m18297e(int i, int i2) {
        boolean z = true;
        C3703i.m15825b(this.f12466c != -1, "End must already be set.");
        if (this.f12465b == this.f12466c) {
            z = false;
        }
        C3703i.m15825b(z, "Beging and end point to same position.");
        int i3 = this.f12466c;
        int i4 = this.f12465b;
        if (i3 > i4) {
            m18295c(i, i2);
        } else if (i3 < i4) {
            m18296d(i, i2);
        }
        this.f12466c = i;
    }

    /* renamed from: f */
    private void m18298f(int i, int i2, boolean z, int i3) {
        this.f12464a.mo14268a(i, i2, z, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo14266b(int i, int i2) {
        C3703i.m15825b(i != -1, "Position cannot be NO_POSITION.");
        int i3 = this.f12466c;
        if (i3 == -1 || i3 == this.f12465b) {
            this.f12466c = -1;
            m18294a(i, i2);
            return;
        }
        m18297e(i, i2);
    }

    public String toString() {
        return "Range{begin=" + this.f12465b + ", end=" + this.f12466c + "}";
    }
}
