package p082e.p109h.p119p;

import android.view.View;
import android.view.ViewParent;

/* renamed from: e.h.p.l */
/* compiled from: NestedScrollingChildHelper */
public class C3764l {

    /* renamed from: a */
    private ViewParent f11820a;

    /* renamed from: b */
    private ViewParent f11821b;

    /* renamed from: c */
    private final View f11822c;

    /* renamed from: d */
    private boolean f11823d;

    /* renamed from: e */
    private int[] f11824e;

    public C3764l(View view) {
        this.f11822c = view;
    }

    /* renamed from: g */
    private boolean m16113g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo13182l() || (h = m16114h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f11822c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m16115i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C3789y.m16297d(h, this.f11822c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f11822c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m16114h(int i) {
        if (i == 0) {
            return this.f11820a;
        }
        if (i != 1) {
            return null;
        }
        return this.f11821b;
    }

    /* renamed from: i */
    private int[] m16115i() {
        if (this.f11824e == null) {
            this.f11824e = new int[2];
        }
        return this.f11824e;
    }

    /* renamed from: n */
    private void m16116n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f11820a = viewParent;
        } else if (i == 1) {
            this.f11821b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo13174a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo13182l() || (h = m16114h(0)) == null) {
            return false;
        }
        return C3789y.m16294a(h, this.f11822c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo13175b(float f, float f2) {
        ViewParent h;
        if (!mo13182l() || (h = m16114h(0)) == null) {
            return false;
        }
        return C3789y.m16295b(h, this.f11822c, f, f2);
    }

    /* renamed from: c */
    public boolean mo13176c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo13177d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo13177d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo13182l() || (h = m16114h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f11822c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m16115i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C3789y.m16296c(h, this.f11822c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f11822c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo13178e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m16113g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo13179f(int i, int i2, int i3, int i4, int[] iArr) {
        return m16113g(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: j */
    public boolean mo13180j() {
        return mo13181k(0);
    }

    /* renamed from: k */
    public boolean mo13181k(int i) {
        return m16114h(i) != null;
    }

    /* renamed from: l */
    public boolean mo13182l() {
        return this.f11823d;
    }

    /* renamed from: m */
    public void mo13183m(boolean z) {
        if (this.f11823d) {
            C3774v.m16172L0(this.f11822c);
        }
        this.f11823d = z;
    }

    /* renamed from: o */
    public boolean mo13184o(int i) {
        return mo13185p(i, 0);
    }

    /* renamed from: p */
    public boolean mo13185p(int i, int i2) {
        if (mo13181k(i2)) {
            return true;
        }
        if (!mo13182l()) {
            return false;
        }
        View view = this.f11822c;
        for (ViewParent parent = this.f11822c.getParent(); parent != null; parent = parent.getParent()) {
            if (C3789y.m16299f(parent, view, this.f11822c, i, i2)) {
                m16116n(i2, parent);
                C3789y.m16298e(parent, view, this.f11822c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo13186q() {
        mo13187r(0);
    }

    /* renamed from: r */
    public void mo13187r(int i) {
        ViewParent h = m16114h(i);
        if (h != null) {
            C3789y.m16300g(h, this.f11822c, i);
            m16116n(i, (ViewParent) null);
        }
    }
}
