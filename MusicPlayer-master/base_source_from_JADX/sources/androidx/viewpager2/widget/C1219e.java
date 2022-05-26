package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
/* compiled from: ScrollEventAdapter */
final class C1219e extends RecyclerView.C0817t {

    /* renamed from: a */
    private ViewPager2.C1205i f4960a;

    /* renamed from: b */
    private final ViewPager2 f4961b;

    /* renamed from: c */
    private final RecyclerView f4962c;

    /* renamed from: d */
    private final LinearLayoutManager f4963d;

    /* renamed from: e */
    private int f4964e;

    /* renamed from: f */
    private int f4965f;

    /* renamed from: g */
    private C1220a f4966g = new C1220a();

    /* renamed from: h */
    private int f4967h;

    /* renamed from: i */
    private int f4968i;

    /* renamed from: j */
    private boolean f4969j;

    /* renamed from: k */
    private boolean f4970k;

    /* renamed from: l */
    private boolean f4971l;

    /* renamed from: m */
    private boolean f4972m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    /* compiled from: ScrollEventAdapter */
    private static final class C1220a {

        /* renamed from: a */
        int f4973a;

        /* renamed from: b */
        float f4974b;

        /* renamed from: c */
        int f4975c;

        C1220a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6409a() {
            this.f4973a = -1;
            this.f4974b = 0.0f;
            this.f4975c = 0;
        }
    }

    C1219e(ViewPager2 viewPager2) {
        this.f4961b = viewPager2;
        RecyclerView recyclerView = viewPager2.f4924p;
        this.f4962c = recyclerView;
        this.f4963d = (LinearLayoutManager) recyclerView.getLayoutManager();
        m6818n();
    }

    /* renamed from: c */
    private void m6813c(int i, float f, int i2) {
        ViewPager2.C1205i iVar = this.f4960a;
        if (iVar != null) {
            iVar.mo6387b(i, f, i2);
        }
    }

    /* renamed from: d */
    private void m6814d(int i) {
        ViewPager2.C1205i iVar = this.f4960a;
        if (iVar != null) {
            iVar.mo6323c(i);
        }
    }

    /* renamed from: e */
    private void m6815e(int i) {
        if ((this.f4964e != 3 || this.f4965f != 0) && this.f4965f != i) {
            this.f4965f = i;
            ViewPager2.C1205i iVar = this.f4960a;
            if (iVar != null) {
                iVar.mo6322a(i);
            }
        }
    }

    /* renamed from: f */
    private int m6816f() {
        return this.f4963d.mo4485Z1();
    }

    /* renamed from: k */
    private boolean m6817k() {
        int i = this.f4964e;
        return i == 1 || i == 4;
    }

    /* renamed from: n */
    private void m6818n() {
        this.f4964e = 0;
        this.f4965f = 0;
        this.f4966g.mo6409a();
        this.f4967h = -1;
        this.f4968i = -1;
        this.f4969j = false;
        this.f4970k = false;
        this.f4972m = false;
        this.f4971l = false;
    }

    /* renamed from: p */
    private void m6819p(boolean z) {
        this.f4972m = z;
        this.f4964e = z ? 4 : 1;
        int i = this.f4968i;
        if (i != -1) {
            this.f4967h = i;
            this.f4968i = -1;
        } else if (this.f4967h == -1) {
            this.f4967h = m6816f();
        }
        m6815e(1);
    }

    /* renamed from: q */
    private void m6820q() {
        int i;
        C1220a aVar = this.f4966g;
        int Z1 = this.f4963d.mo4485Z1();
        aVar.f4973a = Z1;
        if (Z1 == -1) {
            aVar.mo6409a();
            return;
        }
        View D = this.f4963d.mo4473D(Z1);
        if (D == null) {
            aVar.mo6409a();
            return;
        }
        int b0 = this.f4963d.mo4924b0(D);
        int k0 = this.f4963d.mo4946k0(D);
        int n0 = this.f4963d.mo4951n0(D);
        int I = this.f4963d.mo4897I(D);
        ViewGroup.LayoutParams layoutParams = D.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            b0 += marginLayoutParams.leftMargin;
            k0 += marginLayoutParams.rightMargin;
            n0 += marginLayoutParams.topMargin;
            I += marginLayoutParams.bottomMargin;
        }
        int height = D.getHeight() + n0 + I;
        int width = D.getWidth() + b0 + k0;
        if (this.f4963d.mo4498n2() == 0) {
            i = (D.getLeft() - b0) - this.f4962c.getPaddingLeft();
            if (this.f4961b.mo6330d()) {
                i = -i;
            }
            height = width;
        } else {
            i = (D.getTop() - n0) - this.f4962c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f4975c = i2;
        if (i2 >= 0) {
            aVar.f4974b = height == 0 ? 0.0f : ((float) i2) / ((float) height);
        } else if (new C1214a(this.f4963d).mo6394d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f4975c)}));
        }
    }

    /* renamed from: a */
    public void mo4984a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f4964e == 1 && this.f4965f == 1) && i == 1) {
            m6819p(false);
        } else if (!m6817k() || i != 2) {
            if (m6817k() && i == 0) {
                m6820q();
                if (!this.f4970k) {
                    int i2 = this.f4966g.f4973a;
                    if (i2 != -1) {
                        m6813c(i2, 0.0f, 0);
                    }
                } else {
                    C1220a aVar = this.f4966g;
                    if (aVar.f4975c == 0) {
                        int i3 = this.f4967h;
                        int i4 = aVar.f4973a;
                        if (i3 != i4) {
                            m6814d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m6815e(0);
                    m6818n();
                }
            }
            if (this.f4964e == 2 && i == 0 && this.f4971l) {
                m6820q();
                C1220a aVar2 = this.f4966g;
                if (aVar2.f4975c == 0) {
                    int i5 = this.f4968i;
                    int i6 = aVar2.f4973a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m6814d(i6);
                    }
                    m6815e(0);
                    m6818n();
                }
            }
        } else if (this.f4970k) {
            m6815e(2);
            this.f4969j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r5 < 0) == r3.f4961b.mo6330d()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4985b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f4970k = r4
            r3.m6820q()
            boolean r0 = r3.f4969j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f4969j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f4961b
            boolean r6 = r6.mo6330d()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = 0
            goto L_0x0023
        L_0x0022:
            r5 = 1
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.e$a r5 = r3.f4966g
            int r6 = r5.f4975c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f4973a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.e$a r5 = r3.f4966g
            int r5 = r5.f4973a
        L_0x0033:
            r3.f4968i = r5
            int r6 = r3.f4967h
            if (r6 == r5) goto L_0x004b
            r3.m6814d(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f4964e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.e$a r5 = r3.f4966g
            int r5 = r5.f4973a
            if (r5 != r1) goto L_0x0048
            r5 = 0
        L_0x0048:
            r3.m6814d(r5)
        L_0x004b:
            androidx.viewpager2.widget.e$a r5 = r3.f4966g
            int r6 = r5.f4973a
            if (r6 != r1) goto L_0x0052
            r6 = 0
        L_0x0052:
            float r0 = r5.f4974b
            int r5 = r5.f4975c
            r3.m6813c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f4966g
            int r6 = r5.f4973a
            int r0 = r3.f4968i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f4975c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f4965f
            if (r5 == r4) goto L_0x0071
            r3.m6815e(r2)
            r3.m6818n()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1219e.mo4985b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public double mo6402g() {
        m6820q();
        C1220a aVar = this.f4966g;
        return ((double) aVar.f4973a) + ((double) aVar.f4974b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo6403h() {
        return this.f4965f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6404i() {
        return this.f4972m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo6405j() {
        return this.f4965f == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6406l() {
        this.f4971l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6407m(int i, boolean z) {
        this.f4964e = z ? 2 : 3;
        boolean z2 = false;
        this.f4972m = false;
        if (this.f4968i != i) {
            z2 = true;
        }
        this.f4968i = i;
        m6815e(2);
        if (z2) {
            m6814d(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6408o(ViewPager2.C1205i iVar) {
        this.f4960a = iVar;
    }
}
