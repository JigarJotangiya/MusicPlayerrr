package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0906t;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3701g;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
final class C0832a implements C0906t.C0907a {

    /* renamed from: a */
    private C3700f<C0834b> f3781a;

    /* renamed from: b */
    final ArrayList<C0834b> f3782b;

    /* renamed from: c */
    final ArrayList<C0834b> f3783c;

    /* renamed from: d */
    final C0833a f3784d;

    /* renamed from: e */
    Runnable f3785e;

    /* renamed from: f */
    final boolean f3786f;

    /* renamed from: g */
    final C0906t f3787g;

    /* renamed from: h */
    private int f3788h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C0833a {
        /* renamed from: a */
        void mo4784a(int i, int i2);

        /* renamed from: b */
        void mo4785b(C0834b bVar);

        /* renamed from: c */
        void mo4786c(int i, int i2, Object obj);

        /* renamed from: d */
        void mo4787d(C0834b bVar);

        /* renamed from: e */
        RecyclerView.C0792c0 mo4788e(int i);

        /* renamed from: f */
        void mo4789f(int i, int i2);

        /* renamed from: g */
        void mo4790g(int i, int i2);

        /* renamed from: h */
        void mo4791h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static final class C0834b {

        /* renamed from: a */
        int f3789a;

        /* renamed from: b */
        int f3790b;

        /* renamed from: c */
        Object f3791c;

        /* renamed from: d */
        int f3792d;

        C0834b(int i, int i2, int i3, Object obj) {
            this.f3789a = i;
            this.f3790b = i2;
            this.f3792d = i3;
            this.f3791c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo5162a() {
            int i = this.f3789a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0834b)) {
                return false;
            }
            C0834b bVar = (C0834b) obj;
            int i = this.f3789a;
            if (i != bVar.f3789a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3792d - this.f3790b) == 1 && this.f3792d == bVar.f3790b && this.f3790b == bVar.f3792d) {
                return true;
            }
            if (this.f3792d != bVar.f3792d || this.f3790b != bVar.f3790b) {
                return false;
            }
            Object obj2 = this.f3791c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f3791c)) {
                    return false;
                }
            } else if (bVar.f3791c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3789a * 31) + this.f3790b) * 31) + this.f3792d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo5162a() + ",s:" + this.f3790b + "c:" + this.f3792d + ",p:" + this.f3791c + "]";
        }
    }

    C0832a(C0833a aVar) {
        this(aVar, false);
    }

    /* renamed from: c */
    private void m5239c(C0834b bVar) {
        m5245v(bVar);
    }

    /* renamed from: d */
    private void m5240d(C0834b bVar) {
        m5245v(bVar);
    }

    /* renamed from: f */
    private void m5241f(C0834b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f3790b;
        int i2 = bVar.f3792d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3784d.mo4788e(i3) != null || m5243h(i3)) {
                if (c2 == 0) {
                    m5244k(mo5145b(2, i, i4, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5245v(mo5145b(2, i, i4, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3792d) {
            mo5144a(bVar);
            bVar = mo5145b(2, i, i4, (Object) null);
        }
        if (c2 == 0) {
            m5244k(bVar);
        } else {
            m5245v(bVar);
        }
    }

    /* renamed from: g */
    private void m5242g(C0834b bVar) {
        int i = bVar.f3790b;
        int i2 = bVar.f3792d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3784d.mo4788e(i) != null || m5243h(i)) {
                if (c == 0) {
                    m5244k(mo5145b(4, i3, i4, bVar.f3791c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m5245v(mo5145b(4, i3, i4, bVar.f3791c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3792d) {
            Object obj = bVar.f3791c;
            mo5144a(bVar);
            bVar = mo5145b(4, i3, i4, obj);
        }
        if (c == 0) {
            m5244k(bVar);
        } else {
            m5245v(bVar);
        }
    }

    /* renamed from: h */
    private boolean m5243h(int i) {
        int size = this.f3783c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0834b bVar = this.f3783c.get(i2);
            int i3 = bVar.f3789a;
            if (i3 == 8) {
                if (mo5151n(bVar.f3792d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3790b;
                int i5 = bVar.f3792d + i4;
                while (i4 < i5) {
                    if (mo5151n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m5244k(C0834b bVar) {
        int i;
        int i2 = bVar.f3789a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = m5246z(bVar.f3790b, i2);
        int i3 = bVar.f3790b;
        int i4 = bVar.f3789a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3792d; i6++) {
            int z2 = m5246z(bVar.f3790b + (i * i6), bVar.f3789a);
            int i7 = bVar.f3789a;
            if (i7 == 2 ? z2 == z : i7 == 4 && z2 == z + 1) {
                i5++;
            } else {
                C0834b b = mo5145b(i7, z, i5, bVar.f3791c);
                mo5149l(b, i3);
                mo5144a(b);
                if (bVar.f3789a == 4) {
                    i3 += i5;
                }
                z = z2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3791c;
        mo5144a(bVar);
        if (i5 > 0) {
            C0834b b2 = mo5145b(bVar.f3789a, z, i5, obj);
            mo5149l(b2, i3);
            mo5144a(b2);
        }
    }

    /* renamed from: v */
    private void m5245v(C0834b bVar) {
        this.f3783c.add(bVar);
        int i = bVar.f3789a;
        if (i == 1) {
            this.f3784d.mo4790g(bVar.f3790b, bVar.f3792d);
        } else if (i == 2) {
            this.f3784d.mo4789f(bVar.f3790b, bVar.f3792d);
        } else if (i == 4) {
            this.f3784d.mo4786c(bVar.f3790b, bVar.f3792d, bVar.f3791c);
        } else if (i == 8) {
            this.f3784d.mo4784a(bVar.f3790b, bVar.f3792d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: z */
    private int m5246z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f3783c.size() - 1; size >= 0; size--) {
            C0834b bVar = this.f3783c.get(size);
            int i5 = bVar.f3789a;
            if (i5 == 8) {
                int i6 = bVar.f3790b;
                int i7 = bVar.f3792d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            bVar.f3790b = i6 + 1;
                            bVar.f3792d = i7 + 1;
                        } else if (i2 == 2) {
                            bVar.f3790b = i6 - 1;
                            bVar.f3792d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        bVar.f3792d = i7 + 1;
                    } else if (i2 == 2) {
                        bVar.f3792d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f3790b = i6 + 1;
                    } else if (i2 == 2) {
                        bVar.f3790b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = bVar.f3790b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= bVar.f3792d;
                    } else if (i5 == 2) {
                        i += bVar.f3792d;
                    }
                } else if (i2 == 1) {
                    bVar.f3790b = i8 + 1;
                } else if (i2 == 2) {
                    bVar.f3790b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f3783c.size() - 1; size2 >= 0; size2--) {
            C0834b bVar2 = this.f3783c.get(size2);
            if (bVar2.f3789a == 8) {
                int i9 = bVar2.f3792d;
                if (i9 == bVar2.f3790b || i9 < 0) {
                    this.f3783c.remove(size2);
                    mo5144a(bVar2);
                }
            } else if (bVar2.f3792d <= 0) {
                this.f3783c.remove(size2);
                mo5144a(bVar2);
            }
        }
        return i;
    }

    /* renamed from: a */
    public void mo5144a(C0834b bVar) {
        if (!this.f3786f) {
            bVar.f3791c = null;
            this.f3781a.mo8512a(bVar);
        }
    }

    /* renamed from: b */
    public C0834b mo5145b(int i, int i2, int i3, Object obj) {
        C0834b b = this.f3781a.mo8513b();
        if (b == null) {
            return new C0834b(i, i2, i3, obj);
        }
        b.f3789a = i;
        b.f3790b = i2;
        b.f3792d = i3;
        b.f3791c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo5146e(int i) {
        int size = this.f3782b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0834b bVar = this.f3782b.get(i2);
            int i3 = bVar.f3789a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3790b;
                    if (i4 <= i) {
                        int i5 = bVar.f3792d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3790b;
                    if (i6 == i) {
                        i = bVar.f3792d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3792d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3790b <= i) {
                i += bVar.f3792d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo5147i() {
        int size = this.f3783c.size();
        for (int i = 0; i < size; i++) {
            this.f3784d.mo4787d(this.f3783c.get(i));
        }
        mo5160x(this.f3783c);
        this.f3788h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5148j() {
        mo5147i();
        int size = this.f3782b.size();
        for (int i = 0; i < size; i++) {
            C0834b bVar = this.f3782b.get(i);
            int i2 = bVar.f3789a;
            if (i2 == 1) {
                this.f3784d.mo4787d(bVar);
                this.f3784d.mo4790g(bVar.f3790b, bVar.f3792d);
            } else if (i2 == 2) {
                this.f3784d.mo4787d(bVar);
                this.f3784d.mo4791h(bVar.f3790b, bVar.f3792d);
            } else if (i2 == 4) {
                this.f3784d.mo4787d(bVar);
                this.f3784d.mo4786c(bVar.f3790b, bVar.f3792d, bVar.f3791c);
            } else if (i2 == 8) {
                this.f3784d.mo4787d(bVar);
                this.f3784d.mo4784a(bVar.f3790b, bVar.f3792d);
            }
            Runnable runnable = this.f3785e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5160x(this.f3782b);
        this.f3788h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5149l(C0834b bVar, int i) {
        this.f3784d.mo4785b(bVar);
        int i2 = bVar.f3789a;
        if (i2 == 2) {
            this.f3784d.mo4791h(i, bVar.f3792d);
        } else if (i2 == 4) {
            this.f3784d.mo4786c(i, bVar.f3792d, bVar.f3791c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo5150m(int i) {
        return mo5151n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo5151n(int i, int i2) {
        int size = this.f3783c.size();
        while (i2 < size) {
            C0834b bVar = this.f3783c.get(i2);
            int i3 = bVar.f3789a;
            if (i3 == 8) {
                int i4 = bVar.f3790b;
                if (i4 == i) {
                    i = bVar.f3792d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3792d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3790b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3792d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3792d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo5152o(int i) {
        return (i & this.f3788h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5153p() {
        return this.f3782b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo5154q() {
        return !this.f3783c.isEmpty() && !this.f3782b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo5155r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f3782b.add(mo5145b(4, i, i2, obj));
        this.f3788h |= 4;
        if (this.f3782b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5156s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3782b.add(mo5145b(1, i, i2, (Object) null));
        this.f3788h |= 1;
        if (this.f3782b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5157t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f3782b.add(mo5145b(8, i, i2, (Object) null));
            this.f3788h |= 8;
            if (this.f3782b.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5158u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3782b.add(mo5145b(2, i, i2, (Object) null));
        this.f3788h |= 2;
        if (this.f3782b.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo5159w() {
        this.f3787g.mo5384b(this.f3782b);
        int size = this.f3782b.size();
        for (int i = 0; i < size; i++) {
            C0834b bVar = this.f3782b.get(i);
            int i2 = bVar.f3789a;
            if (i2 == 1) {
                m5239c(bVar);
            } else if (i2 == 2) {
                m5241f(bVar);
            } else if (i2 == 4) {
                m5242g(bVar);
            } else if (i2 == 8) {
                m5240d(bVar);
            }
            Runnable runnable = this.f3785e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3782b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5160x(List<C0834b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5144a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5161y() {
        mo5160x(this.f3782b);
        mo5160x(this.f3783c);
        this.f3788h = 0;
    }

    C0832a(C0833a aVar, boolean z) {
        this.f3781a = new C3701g(30);
        this.f3782b = new ArrayList<>();
        this.f3783c = new ArrayList<>();
        this.f3788h = 0;
        this.f3784d = aVar;
        this.f3786f = z;
        this.f3787g = new C0906t(this);
    }
}
