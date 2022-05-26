package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0911v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C1195b;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3746f;
import p082e.p158z.C4259a;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: A */
    static boolean f4914A = true;

    /* renamed from: g */
    private final Rect f4915g = new Rect();

    /* renamed from: h */
    private final Rect f4916h = new Rect();

    /* renamed from: i */
    private C1216b f4917i = new C1216b(3);

    /* renamed from: j */
    int f4918j;

    /* renamed from: k */
    boolean f4919k = false;

    /* renamed from: l */
    private RecyclerView.C0800j f4920l = new C1197a();

    /* renamed from: m */
    private LinearLayoutManager f4921m;

    /* renamed from: n */
    private int f4922n = -1;

    /* renamed from: o */
    private Parcelable f4923o;

    /* renamed from: p */
    RecyclerView f4924p;

    /* renamed from: q */
    private C0911v f4925q;

    /* renamed from: r */
    C1219e f4926r;

    /* renamed from: s */
    private C1216b f4927s;

    /* renamed from: t */
    private C1217c f4928t;

    /* renamed from: u */
    private C1218d f4929u;

    /* renamed from: v */
    private RecyclerView.C0803m f4930v = null;

    /* renamed from: w */
    private boolean f4931w = false;

    /* renamed from: x */
    private boolean f4932x = true;

    /* renamed from: y */
    private int f4933y = -1;

    /* renamed from: z */
    C1201e f4934z;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C1197a extends C1203g {
        C1197a() {
            super((C1197a) null);
        }

        /* renamed from: a */
        public void mo4834a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f4919k = true;
            viewPager2.f4926r.mo6406l();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C1198b extends C1205i {
        C1198b() {
        }

        /* renamed from: a */
        public void mo6322a(int i) {
            if (i == 0) {
                ViewPager2.this.mo6346o();
            }
        }

        /* renamed from: c */
        public void mo6323c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f4918j != i) {
                viewPager2.f4918j = i;
                viewPager2.f4934z.mo6384q();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C1199c extends C1205i {
        C1199c() {
        }

        /* renamed from: c */
        public void mo6323c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f4924p.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C1200d implements RecyclerView.C0814q {
        C1200d(ViewPager2 viewPager2) {
        }

        /* renamed from: a */
        public void mo4978a(View view) {
        }

        /* renamed from: b */
        public void mo4979b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class C1201e {
        private C1201e(ViewPager2 viewPager2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6368a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6369b(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6370c(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6371d() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6372e(RecyclerView.C0797h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6373f(RecyclerView.C0797h<?> hVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo6374g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6375h(C1216b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo6376i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6377j(C3736c cVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6378k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo6379l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo6380m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public CharSequence mo6381n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo6382o(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo6383p() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6384q() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6385r() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo6386s() {
        }

        /* synthetic */ C1201e(ViewPager2 viewPager2, C1197a aVar) {
            this(viewPager2);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C1202f extends C1201e {
        C1202f() {
            super(ViewPager2.this, (C1197a) null);
        }

        /* renamed from: b */
        public boolean mo6369b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.mo6332e();
        }

        /* renamed from: d */
        public boolean mo6371d() {
            return true;
        }

        /* renamed from: j */
        public void mo6377j(C3736c cVar) {
            if (!ViewPager2.this.mo6332e()) {
                cVar.mo13104T(C3736c.C3737a.f11796i);
                cVar.mo13104T(C3736c.C3737a.f11795h);
                cVar.mo13153y0(false);
            }
        }

        /* renamed from: k */
        public boolean mo6378k(int i) {
            if (mo6369b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: n */
        public CharSequence mo6381n() {
            if (mo6371d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class C1203g extends RecyclerView.C0800j {
        private C1203g() {
        }

        /* renamed from: b */
        public final void mo4835b(int i, int i2) {
            mo4834a();
        }

        /* renamed from: c */
        public final void mo4836c(int i, int i2, Object obj) {
            mo4834a();
        }

        /* renamed from: d */
        public final void mo4837d(int i, int i2) {
            mo4834a();
        }

        /* renamed from: e */
        public final void mo4838e(int i, int i2, int i3) {
            mo4834a();
        }

        /* renamed from: f */
        public final void mo4839f(int i, int i2) {
            mo4834a();
        }

        /* synthetic */ C1203g(C1197a aVar) {
            this();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C1204h extends LinearLayoutManager {
        C1204h(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: N1 */
        public void mo4478N1(RecyclerView.C0826z zVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo4478N1(zVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: O0 */
        public void mo4907O0(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, C3736c cVar) {
            super.mo4907O0(vVar, zVar, cVar);
            ViewPager2.this.f4934z.mo6377j(cVar);
        }

        /* renamed from: i1 */
        public boolean mo4942i1(RecyclerView.C0820v vVar, RecyclerView.C0826z zVar, int i, Bundle bundle) {
            if (ViewPager2.this.f4934z.mo6369b(i)) {
                return ViewPager2.this.f4934z.mo6378k(i);
            }
            return super.mo4942i1(vVar, zVar, i, bundle);
        }

        /* renamed from: t1 */
        public boolean mo4963t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C1205i {
        /* renamed from: a */
        public void mo6322a(int i) {
        }

        /* renamed from: b */
        public void mo6387b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo6323c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C1206j extends C1201e {

        /* renamed from: a */
        private final C3746f f4943a = new C1207a();

        /* renamed from: b */
        private final C3746f f4944b = new C1208b();

        /* renamed from: c */
        private RecyclerView.C0800j f4945c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class C1207a implements C3746f {
            C1207a() {
            }

            /* renamed from: a */
            public boolean mo6390a(View view, C3746f.C3747a aVar) {
                C1206j.this.mo6388v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class C1208b implements C3746f {
            C1208b() {
            }

            /* renamed from: a */
            public boolean mo6390a(View view, C3746f.C3747a aVar) {
                C1206j.this.mo6388v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class C1209c extends C1203g {
            C1209c() {
                super((C1197a) null);
            }

            /* renamed from: a */
            public void mo4834a() {
                C1206j.this.mo6389w();
            }
        }

        C1206j() {
            super(ViewPager2.this, (C1197a) null);
        }

        /* renamed from: t */
        private void m6773t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
                C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(i2, i, false, 0));
            }
            i = 0;
            C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(i2, i, false, 0));
        }

        /* renamed from: u */
        private void m6774u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.C0797h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.mo6332e()) {
                if (ViewPager2.this.f4918j > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.f4918j < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: a */
        public boolean mo6368a() {
            return true;
        }

        /* renamed from: c */
        public boolean mo6370c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: e */
        public void mo6372e(RecyclerView.C0797h<?> hVar) {
            mo6389w();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f4945c);
            }
        }

        /* renamed from: f */
        public void mo6373f(RecyclerView.C0797h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f4945c);
            }
        }

        /* renamed from: g */
        public String mo6374g() {
            if (mo6368a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* renamed from: h */
        public void mo6375h(C1216b bVar, RecyclerView recyclerView) {
            C3774v.m16237y0(recyclerView, 2);
            this.f4945c = new C1209c();
            if (C3774v.m16238z(ViewPager2.this) == 0) {
                C3774v.m16237y0(ViewPager2.this, 1);
            }
        }

        /* renamed from: i */
        public void mo6376i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m6773t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                m6774u(accessibilityNodeInfo);
            }
        }

        /* renamed from: l */
        public boolean mo6379l(int i, Bundle bundle) {
            int i2;
            if (mo6370c(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo6388v(i2);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: m */
        public void mo6380m() {
            mo6389w();
        }

        /* renamed from: o */
        public void mo6382o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo6374g());
        }

        /* renamed from: p */
        public void mo6383p() {
            mo6389w();
        }

        /* renamed from: q */
        public void mo6384q() {
            mo6389w();
        }

        /* renamed from: r */
        public void mo6385r() {
            mo6389w();
        }

        /* renamed from: s */
        public void mo6386s() {
            mo6389w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo6388v(int i) {
            if (ViewPager2.this.mo6332e()) {
                ViewPager2.this.mo6344k(i, true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo6389w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C3774v.m16205i0(viewPager2, 16908360);
            C3774v.m16205i0(viewPager2, 16908361);
            C3774v.m16205i0(viewPager2, 16908358);
            C3774v.m16205i0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.mo6332e()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean d = ViewPager2.this.mo6330d();
                    int i2 = d ? 16908360 : 16908361;
                    if (d) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.f4918j < itemCount - 1) {
                        C3774v.m16209k0(viewPager2, new C3736c.C3737a(i2, (CharSequence) null), (CharSequence) null, this.f4943a);
                    }
                    if (ViewPager2.this.f4918j > 0) {
                        C3774v.m16209k0(viewPager2, new C3736c.C3737a(i, (CharSequence) null), (CharSequence) null, this.f4944b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.f4918j < itemCount - 1) {
                    C3774v.m16209k0(viewPager2, new C3736c.C3737a(16908359, (CharSequence) null), (CharSequence) null, this.f4943a);
                }
                if (ViewPager2.this.f4918j > 0) {
                    C3774v.m16209k0(viewPager2, new C3736c.C3737a(16908358, (CharSequence) null), (CharSequence) null, this.f4944b);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C1210k {
        /* renamed from: a */
        void mo6391a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C1211l extends C0911v {
        C1211l() {
        }

        /* renamed from: h */
        public View mo5378h(RecyclerView.C0809p pVar) {
            if (ViewPager2.this.mo6327c()) {
                return null;
            }
            return super.mo5378h(pVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C1212m extends RecyclerView {
        C1212m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f4934z.mo6371d()) {
                return ViewPager2.this.f4934z.mo6381n();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f4918j);
            accessibilityEvent.setToIndex(ViewPager2.this.f4918j);
            ViewPager2.this.f4934z.mo6382o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6332e() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo6332e() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    private static class C1213n implements Runnable {

        /* renamed from: g */
        private final int f4952g;

        /* renamed from: h */
        private final RecyclerView f4953h;

        C1213n(int i, RecyclerView recyclerView) {
            this.f4952g = i;
            this.f4953h = recyclerView;
        }

        public void run() {
            this.f4953h.mo4702y1(this.f4952g);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        m6713b(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private RecyclerView.C0814q m6712a() {
        return new C1200d(this);
    }

    /* renamed from: b */
    private void m6713b(Context context, AttributeSet attributeSet) {
        this.f4934z = f4914A ? new C1206j() : new C1202f();
        C1212m mVar = new C1212m(context);
        this.f4924p = mVar;
        mVar.setId(C3774v.m16208k());
        this.f4924p.setDescendantFocusability(131072);
        C1204h hVar = new C1204h(context);
        this.f4921m = hVar;
        this.f4924p.setLayoutManager(hVar);
        this.f4924p.setScrollingTouchSlop(1);
        m6716l(context, attributeSet);
        this.f4924p.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4924p.mo4631j(m6712a());
        C1219e eVar = new C1219e(this);
        this.f4926r = eVar;
        this.f4928t = new C1217c(this, eVar, this.f4924p);
        C1211l lVar = new C1211l();
        this.f4925q = lVar;
        lVar.mo5429b(this.f4924p);
        this.f4924p.mo4634l(this.f4926r);
        C1216b bVar = new C1216b(3);
        this.f4927s = bVar;
        this.f4926r.mo6408o(bVar);
        C1198b bVar2 = new C1198b();
        C1199c cVar = new C1199c();
        this.f4927s.mo6397d(bVar2);
        this.f4927s.mo6397d(cVar);
        this.f4934z.mo6375h(this.f4927s, this.f4924p);
        this.f4927s.mo6397d(this.f4917i);
        C1218d dVar = new C1218d(this.f4921m);
        this.f4929u = dVar;
        this.f4927s.mo6397d(dVar);
        RecyclerView recyclerView = this.f4924p;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m6714f(RecyclerView.C0797h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f4920l);
        }
    }

    /* renamed from: i */
    private void m6715i() {
        RecyclerView.C0797h adapter;
        if (this.f4922n != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f4923o;
            if (parcelable != null) {
                if (adapter instanceof C1195b) {
                    ((C1195b) adapter).mo6307b(parcelable);
                }
                this.f4923o = null;
            }
            int max = Math.max(0, Math.min(this.f4922n, adapter.getItemCount() - 1));
            this.f4918j = max;
            this.f4922n = -1;
            this.f4924p.mo4657q1(max);
            this.f4934z.mo6380m();
        }
    }

    /* renamed from: l */
    private void m6716l(Context context, AttributeSet attributeSet) {
        int[] iArr = C4259a.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C4259a.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m6717m(RecyclerView.C0797h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f4920l);
        }
    }

    /* renamed from: c */
    public boolean mo6327c() {
        return this.f4928t.mo6399a();
    }

    public boolean canScrollHorizontally(int i) {
        return this.f4924p.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f4924p.canScrollVertically(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo6330d() {
        return this.f4921m.mo4922a0() == 1;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f4935g;
            sparseArray.put(this.f4924p.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m6715i();
    }

    /* renamed from: e */
    public boolean mo6332e() {
        return this.f4932x;
    }

    /* renamed from: g */
    public void mo6333g(C1205i iVar) {
        this.f4917i.mo6397d(iVar);
    }

    public CharSequence getAccessibilityClassName() {
        if (this.f4934z.mo6368a()) {
            return this.f4934z.mo6374g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.C0797h getAdapter() {
        return this.f4924p.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4918j;
    }

    public int getItemDecorationCount() {
        return this.f4924p.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4933y;
    }

    public int getOrientation() {
        return this.f4921m.mo4498n2();
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f4924p;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f4926r.mo6403h();
    }

    /* renamed from: h */
    public void mo6342h() {
        if (this.f4929u.mo6400d() != null) {
            double g = this.f4926r.mo6402g();
            int i = (int) g;
            float f = (float) (g - ((double) i));
            this.f4929u.mo6387b(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* renamed from: j */
    public void mo6343j(int i, boolean z) {
        if (!mo6327c()) {
            mo6344k(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6344k(int i, boolean z) {
        RecyclerView.C0797h adapter = getAdapter();
        if (adapter == null) {
            if (this.f4922n != -1) {
                this.f4922n = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.f4918j || !this.f4926r.mo6405j()) {
                int i2 = this.f4918j;
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.f4918j = min;
                    this.f4934z.mo6384q();
                    if (!this.f4926r.mo6405j()) {
                        d = this.f4926r.mo6402g();
                    }
                    this.f4926r.mo6407m(min, z);
                    if (!z) {
                        this.f4924p.mo4657q1(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        this.f4924p.mo4657q1(d2 > d ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f4924p;
                        recyclerView.post(new C1213n(min, recyclerView));
                        return;
                    }
                    this.f4924p.mo4702y1(min);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo6345n(C1205i iVar) {
        this.f4917i.mo6398e(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6346o() {
        C0911v vVar = this.f4925q;
        if (vVar != null) {
            View h = vVar.mo5378h(this.f4921m);
            if (h != null) {
                int i0 = this.f4921m.mo4941i0(h);
                if (i0 != this.f4918j && getScrollState() == 0) {
                    this.f4927s.mo6323c(i0);
                }
                this.f4919k = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4934z.mo6376i(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f4924p.getMeasuredWidth();
        int measuredHeight = this.f4924p.getMeasuredHeight();
        this.f4915g.left = getPaddingLeft();
        this.f4915g.right = (i3 - i) - getPaddingRight();
        this.f4915g.top = getPaddingTop();
        this.f4915g.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f4915g, this.f4916h);
        RecyclerView recyclerView = this.f4924p;
        Rect rect = this.f4916h;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f4919k) {
            mo6346o();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.f4924p, i, i2);
        int measuredWidth = this.f4924p.getMeasuredWidth();
        int measuredHeight = this.f4924p.getMeasuredHeight();
        int measuredState = this.f4924p.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4922n = savedState.f4936h;
        this.f4923o = savedState.f4937i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4935g = this.f4924p.getId();
        int i = this.f4922n;
        if (i == -1) {
            i = this.f4918j;
        }
        savedState.f4936h = i;
        Parcelable parcelable = this.f4923o;
        if (parcelable != null) {
            savedState.f4937i = parcelable;
        } else {
            RecyclerView.C0797h adapter = this.f4924p.getAdapter();
            if (adapter instanceof C1195b) {
                savedState.f4937i = ((C1195b) adapter).mo6306a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f4934z.mo6370c(i, bundle)) {
            return this.f4934z.mo6379l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.C0797h hVar) {
        RecyclerView.C0797h adapter = this.f4924p.getAdapter();
        this.f4934z.mo6373f(adapter);
        m6717m(adapter);
        this.f4924p.setAdapter(hVar);
        this.f4918j = 0;
        m6715i();
        this.f4934z.mo6372e(hVar);
        m6714f(hVar);
    }

    public void setCurrentItem(int i) {
        mo6343j(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f4934z.mo6383p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f4933y = i;
            this.f4924p.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f4921m.mo4471B2(i);
        this.f4934z.mo6385r();
    }

    public void setPageTransformer(C1210k kVar) {
        if (kVar != null) {
            if (!this.f4931w) {
                this.f4930v = this.f4924p.getItemAnimator();
                this.f4931w = true;
            }
            this.f4924p.setItemAnimator((RecyclerView.C0803m) null);
        } else if (this.f4931w) {
            this.f4924p.setItemAnimator(this.f4930v);
            this.f4930v = null;
            this.f4931w = false;
        }
        if (kVar != this.f4929u.mo6400d()) {
            this.f4929u.mo6401e(kVar);
            mo6342h();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f4932x = z;
        this.f4934z.mo6386s();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1196a();

        /* renamed from: g */
        int f4935g;

        /* renamed from: h */
        int f4936h;

        /* renamed from: i */
        Parcelable f4937i;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        static class C1196a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1196a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m6727a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m6727a(Parcel parcel, ClassLoader classLoader) {
            this.f4935g = parcel.readInt();
            this.f4936h = parcel.readInt();
            this.f4937i = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4935g);
            parcel.writeInt(this.f4936h);
            parcel.writeParcelable(this.f4937i, i);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m6727a(parcel, (ClassLoader) null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6713b(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6713b(context, attributeSet);
    }
}
