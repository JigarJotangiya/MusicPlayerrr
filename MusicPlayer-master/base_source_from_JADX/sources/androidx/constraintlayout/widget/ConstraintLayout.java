package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.un4seen.bass.BASS;
import java.util.ArrayList;
import java.util.HashMap;
import p082e.p099f.p100a.p104m.C3524d;
import p082e.p099f.p100a.p104m.C3527e;
import p082e.p099f.p100a.p104m.C3530f;
import p082e.p099f.p100a.p104m.C3533h;
import p082e.p099f.p100a.p104m.C3537k;
import p082e.p099f.p100a.p104m.C3539m;
import p082e.p099f.p100a.p104m.p105o.C3542b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: z */
    private static C0440g f2164z;

    /* renamed from: g */
    SparseArray<View> f2165g = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<ConstraintHelper> f2166h = new ArrayList<>(4);
    /* access modifiers changed from: protected */

    /* renamed from: i */
    public C3530f f2167i = new C3530f();

    /* renamed from: j */
    private int f2168j = 0;

    /* renamed from: k */
    private int f2169k = 0;

    /* renamed from: l */
    private int f2170l = Integer.MAX_VALUE;

    /* renamed from: m */
    private int f2171m = Integer.MAX_VALUE;

    /* renamed from: n */
    protected boolean f2172n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f2173o = 257;

    /* renamed from: p */
    private C0430c f2174p = null;

    /* renamed from: q */
    protected C0427b f2175q = null;

    /* renamed from: r */
    private int f2176r = -1;

    /* renamed from: s */
    private HashMap<String, Integer> f2177s = new HashMap<>();

    /* renamed from: t */
    private int f2178t = -1;

    /* renamed from: u */
    private int f2179u = -1;

    /* renamed from: v */
    private SparseArray<C3527e> f2180v = new SparseArray<>();

    /* renamed from: w */
    C0423b f2181w = new C0423b(this);

    /* renamed from: x */
    private int f2182x = 0;

    /* renamed from: y */
    private int f2183y = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0422a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2257a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                e.f.a.m.e$b[] r0 = p082e.p099f.p100a.p104m.C3527e.C3529b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2257a = r0
                e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2257a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.f.a.m.e$b r1 = p082e.p099f.p100a.p104m.C3527e.C3529b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0422a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    class C0423b implements C3542b.C3544b {

        /* renamed from: a */
        ConstraintLayout f2258a;

        /* renamed from: b */
        int f2259b;

        /* renamed from: c */
        int f2260c;

        /* renamed from: d */
        int f2261d;

        /* renamed from: e */
        int f2262e;

        /* renamed from: f */
        int f2263f;

        /* renamed from: g */
        int f2264g;

        public C0423b(ConstraintLayout constraintLayout) {
            this.f2258a = constraintLayout;
        }

        /* renamed from: d */
        private boolean m2714d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo2893a() {
            int childCount = this.f2258a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2258a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo2911b(this.f2258a);
                }
            }
            int size = this.f2258a.f2166h.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f2258a.f2166h.get(i2)).mo2852s(this.f2258a);
                }
            }
        }

        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo2894b(C3527e eVar, C3542b.C3543a aVar) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            C3527e eVar2 = eVar;
            C3542b.C3543a aVar2 = aVar;
            if (eVar2 != null) {
                if (eVar.mo12655U() == 8 && !eVar.mo12684i0()) {
                    aVar2.f11507e = 0;
                    aVar2.f11508f = 0;
                    aVar2.f11509g = 0;
                } else if (eVar.mo12639M() != null) {
                    C3527e.C3529b bVar = aVar2.f11503a;
                    C3527e.C3529b bVar2 = aVar2.f11504b;
                    int i8 = aVar2.f11505c;
                    int i9 = aVar2.f11506d;
                    int i10 = this.f2259b + this.f2260c;
                    int i11 = this.f2261d;
                    View view = (View) eVar.mo12710u();
                    int[] iArr = C0422a.f2257a;
                    int i12 = iArr[bVar.ordinal()];
                    if (i12 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                    } else if (i12 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f2263f, i11, -2);
                    } else if (i12 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f2263f, i11 + eVar.mo12621D(), -1);
                    } else if (i12 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f2263f, i11, -2);
                        boolean z = eVar2.f11391s == 1;
                        int i13 = aVar2.f11512j;
                        if (i13 == C3542b.C3543a.f11501l || i13 == C3542b.C3543a.f11502m) {
                            if (aVar2.f11512j == C3542b.C3543a.f11502m || !z || (z && (view.getMeasuredHeight() == eVar.mo12720z())) || (view instanceof Placeholder) || eVar.mo12579m0()) {
                                i = View.MeasureSpec.makeMeasureSpec(eVar.mo12657V(), 1073741824);
                            }
                        }
                    }
                    int i14 = iArr[bVar2.ordinal()];
                    if (i14 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i14 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2264g, i10, -2);
                    } else if (i14 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2264g, i10 + eVar.mo12653T(), -1);
                    } else if (i14 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f2264g, i10, -2);
                        boolean z2 = eVar2.f11393t == 1;
                        int i15 = aVar2.f11512j;
                        if (i15 == C3542b.C3543a.f11501l || i15 == C3542b.C3543a.f11502m) {
                            if (aVar2.f11512j == C3542b.C3543a.f11502m || !z2 || (z2 && (view.getMeasuredWidth() == eVar.mo12657V())) || (view instanceof Placeholder) || eVar.mo12581n0()) {
                                i2 = View.MeasureSpec.makeMeasureSpec(eVar.mo12720z(), 1073741824);
                            }
                        }
                    }
                    C3530f fVar = (C3530f) eVar.mo12639M();
                    if (fVar != null && C3537k.m15380b(ConstraintLayout.this.f2173o, 256) && view.getMeasuredWidth() == eVar.mo12657V() && view.getMeasuredWidth() < fVar.mo12657V() && view.getMeasuredHeight() == eVar.mo12720z() && view.getMeasuredHeight() < fVar.mo12720z() && view.getBaseline() == eVar.mo12704r() && !eVar.mo12693l0()) {
                        if (m2714d(eVar.mo12623E(), i, eVar.mo12657V()) && m2714d(eVar.mo12625F(), i2, eVar.mo12720z())) {
                            aVar2.f11507e = eVar.mo12657V();
                            aVar2.f11508f = eVar.mo12720z();
                            aVar2.f11509g = eVar.mo12704r();
                            return;
                        }
                    }
                    C3527e.C3529b bVar3 = C3527e.C3529b.MATCH_CONSTRAINT;
                    boolean z3 = bVar == bVar3;
                    boolean z4 = bVar2 == bVar3;
                    C3527e.C3529b bVar4 = C3527e.C3529b.MATCH_PARENT;
                    boolean z5 = bVar2 == bVar4 || bVar2 == C3527e.C3529b.FIXED;
                    boolean z6 = bVar == bVar4 || bVar == C3527e.C3529b.FIXED;
                    boolean z7 = z3 && eVar2.f11358b0 > 0.0f;
                    boolean z8 = z4 && eVar2.f11358b0 > 0.0f;
                    if (view != null) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        int i16 = aVar2.f11512j;
                        if (i16 == C3542b.C3543a.f11501l || i16 == C3542b.C3543a.f11502m || !z3 || eVar2.f11391s != 0 || !z4 || eVar2.f11393t != 0) {
                            if (!(view instanceof VirtualLayout) || !(eVar2 instanceof C3539m)) {
                                view.measure(i, i2);
                            } else {
                                ((VirtualLayout) view).mo2410x((C3539m) eVar2, i, i2);
                            }
                            eVar2.mo12652S0(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i4 = view.getBaseline();
                            int i17 = eVar2.f11397v;
                            i3 = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                            int i18 = eVar2.f11399w;
                            if (i18 > 0) {
                                i3 = Math.min(i18, i3);
                            }
                            int i19 = eVar2.f11403y;
                            if (i19 > 0) {
                                i5 = Math.max(i19, measuredHeight);
                                i7 = i;
                            } else {
                                i7 = i;
                                i5 = measuredHeight;
                            }
                            int i20 = eVar2.f11405z;
                            if (i20 > 0) {
                                i5 = Math.min(i20, i5);
                            }
                            if (!C3537k.m15380b(ConstraintLayout.this.f2173o, 1)) {
                                if (z7 && z5) {
                                    i3 = (int) ((((float) i5) * eVar2.f11358b0) + 0.5f);
                                } else if (z8 && z6) {
                                    i5 = (int) ((((float) i3) / eVar2.f11358b0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i3 && measuredHeight == i5)) {
                                int makeMeasureSpec = measuredWidth != i3 ? View.MeasureSpec.makeMeasureSpec(i3, 1073741824) : i7;
                                if (measuredHeight != i5) {
                                    i2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(makeMeasureSpec, i2);
                                eVar2.mo12652S0(makeMeasureSpec, i2);
                                i3 = view.getMeasuredWidth();
                                i5 = view.getMeasuredHeight();
                                i4 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        boolean z9 = i4 != i6;
                        aVar2.f11511i = (i3 == aVar2.f11505c && i5 == aVar2.f11506d) ? false : true;
                        if (layoutParams.f2217d0) {
                            z9 = true;
                        }
                        if (!(!z9 || i4 == -1 || eVar.mo12704r() == i4)) {
                            aVar2.f11511i = true;
                        }
                        aVar2.f11507e = i3;
                        aVar2.f11508f = i5;
                        aVar2.f11510h = z9;
                        aVar2.f11509g = i4;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo2895c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2259b = i3;
            this.f2260c = i4;
            this.f2261d = i5;
            this.f2262e = i6;
            this.f2263f = i;
            this.f2264g = i2;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        m2695q((AttributeSet) null, 0, 0);
    }

    /* renamed from: A */
    private boolean m2691A() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m2697w();
        }
        return z;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    public static C0440g getSharedValues() {
        if (f2164z == null) {
            f2164z = new C0440g();
        }
        return f2164z;
    }

    /* renamed from: h */
    private final C3527e m2694h(int i) {
        if (i == 0) {
            return this.f2167i;
        }
        View view = this.f2165g.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2167i;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2247s0;
    }

    /* renamed from: q */
    private void m2695q(AttributeSet attributeSet, int i, int i2) {
        this.f2167i.mo12719y0(this);
        this.f2167i.mo12738S1(this.f2181w);
        this.f2165g.put(getId(), this);
        this.f2174p = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0439f.ConstraintLayout_Layout_android_minWidth) {
                    this.f2168j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2168j);
                } else if (index == C0439f.ConstraintLayout_Layout_android_minHeight) {
                    this.f2169k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2169k);
                } else if (index == C0439f.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2170l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2170l);
                } else if (index == C0439f.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2171m = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2171m);
                } else if (index == C0439f.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2173o = obtainStyledAttributes.getInt(index, this.f2173o);
                } else if (index == C0439f.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2500t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f2175q = null;
                        }
                    }
                } else if (index == C0439f.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0430c cVar = new C0430c();
                        this.f2174p = cVar;
                        cVar.mo2947D(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f2174p = null;
                    }
                    this.f2176r = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2167i.mo12739T1(this.f2173o);
    }

    /* renamed from: s */
    private void m2696s() {
        this.f2172n = true;
        this.f2178t = -1;
        this.f2179u = -1;
    }

    /* renamed from: w */
    private void m2697w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C3527e p = mo2874p(getChildAt(i));
            if (p != null) {
                p.mo12707s0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2887x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m2694h(childAt.getId()).mo12721z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f2176r != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f2176r && (childAt2 instanceof Constraints)) {
                    this.f2174p = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0430c cVar = this.f2174p;
        if (cVar != null) {
            cVar.mo2957k(this, true);
        }
        this.f2167i.mo12816r1();
        int size = this.f2166h.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f2166h.get(i4).mo2857v(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo2912c(this);
            }
        }
        this.f2180v.clear();
        this.f2180v.put(0, this.f2167i);
        this.f2180v.put(getId(), this.f2167i);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f2180v.put(childAt4.getId(), mo2874p(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C3527e p2 = mo2874p(childAt5);
            if (p2 != null) {
                this.f2167i.mo12813b(p2);
                mo2860d(isInEditMode, childAt5, p2, (LayoutParams) childAt5.getLayoutParams(), this.f2180v);
            }
        }
    }

    /* renamed from: z */
    private void m2698z(C3527e eVar, LayoutParams layoutParams, SparseArray<C3527e> sparseArray, int i, C3524d.C3526b bVar) {
        View view = this.f2165g.get(i);
        C3527e eVar2 = sparseArray.get(i);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f2217d0 = true;
            C3524d.C3526b bVar2 = C3524d.C3526b.BASELINE;
            if (bVar == bVar2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f2217d0 = true;
                layoutParams2.f2247s0.mo12630H0(true);
            }
            eVar.mo12702q(bVar2).mo12594b(eVar2.mo12702q(bVar), layoutParams.f2186C, layoutParams.f2185B, true);
            eVar.mo12630H0(true);
            eVar.mo12702q(C3524d.C3526b.TOP).mo12609q();
            eVar.mo12702q(C3524d.C3526b.BOTTOM).mo12609q();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2860d(boolean z, View view, C3527e eVar, LayoutParams layoutParams, SparseArray<C3527e> sparseArray) {
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        C3527e eVar2;
        C3527e eVar3;
        C3527e eVar4;
        C3527e eVar5;
        View view2 = view;
        C3527e eVar6 = eVar;
        LayoutParams layoutParams2 = layoutParams;
        SparseArray<C3527e> sparseArray2 = sparseArray;
        layoutParams.mo2891c();
        layoutParams2.f2249t0 = false;
        eVar6.mo12681g1(view.getVisibility());
        if (layoutParams2.f2223g0) {
            eVar6.mo12648Q0(true);
            eVar6.mo12681g1(8);
        }
        eVar6.mo12719y0(view2);
        if (view2 instanceof ConstraintHelper) {
            ((ConstraintHelper) view2).mo2385q(eVar6, this.f2167i.mo12734M1());
        }
        if (layoutParams2.f2219e0) {
            C3533h hVar = (C3533h) eVar6;
            int i5 = layoutParams2.f2241p0;
            int i6 = layoutParams2.f2243q0;
            float f2 = layoutParams2.f2245r0;
            if (Build.VERSION.SDK_INT < 17) {
                i5 = layoutParams2.f2210a;
                i6 = layoutParams2.f2212b;
                f2 = layoutParams2.f2214c;
            }
            if (f2 != -1.0f) {
                hVar.mo12785w1(f2);
            } else if (i5 != -1) {
                hVar.mo12783u1(i5);
            } else if (i6 != -1) {
                hVar.mo12784v1(i6);
            }
        } else {
            int i7 = layoutParams2.f2227i0;
            int i8 = layoutParams2.f2229j0;
            int i9 = layoutParams2.f2231k0;
            int i10 = layoutParams2.f2233l0;
            int i11 = layoutParams2.f2235m0;
            int i12 = layoutParams2.f2237n0;
            float f3 = layoutParams2.f2239o0;
            if (Build.VERSION.SDK_INT < 17) {
                i7 = layoutParams2.f2216d;
                int i13 = layoutParams2.f2218e;
                int i14 = layoutParams2.f2220f;
                int i15 = layoutParams2.f2222g;
                int i16 = layoutParams2.f2251v;
                int i17 = layoutParams2.f2253x;
                float f4 = layoutParams2.f2187D;
                if (i7 == -1 && i13 == -1) {
                    int i18 = layoutParams2.f2246s;
                    if (i18 != -1) {
                        i7 = i18;
                    } else {
                        int i19 = layoutParams2.f2244r;
                        if (i19 != -1) {
                            i13 = i19;
                        }
                    }
                }
                if (i14 == -1 && i15 == -1) {
                    i3 = layoutParams2.f2248t;
                    if (i3 == -1) {
                        int i20 = layoutParams2.f2250u;
                        if (i20 != -1) {
                            i = i17;
                            f = f4;
                            i11 = i16;
                            i2 = i20;
                            i8 = i13;
                            i3 = i14;
                        }
                    }
                    i = i17;
                    f = f4;
                    i11 = i16;
                    i2 = i15;
                    i8 = i13;
                }
                i3 = i14;
                i = i17;
                f = f4;
                i11 = i16;
                i2 = i15;
                i8 = i13;
            } else {
                i = i12;
                f = f3;
                i3 = i9;
                i2 = i10;
            }
            int i21 = layoutParams2.f2238o;
            if (i21 != -1) {
                C3527e eVar7 = sparseArray2.get(i21);
                if (eVar7 != null) {
                    eVar6.mo12695m(eVar7, layoutParams2.f2242q, layoutParams2.f2240p);
                }
            } else {
                if (i7 != -1) {
                    C3527e eVar8 = sparseArray2.get(i7);
                    if (eVar8 != null) {
                        C3524d.C3526b bVar = C3524d.C3526b.LEFT;
                        eVar.mo12673d0(bVar, eVar8, bVar, layoutParams2.leftMargin, i11);
                    }
                } else if (!(i8 == -1 || (eVar5 = sparseArray2.get(i8)) == null)) {
                    eVar.mo12673d0(C3524d.C3526b.LEFT, eVar5, C3524d.C3526b.RIGHT, layoutParams2.leftMargin, i11);
                }
                if (i3 != -1) {
                    C3527e eVar9 = sparseArray2.get(i3);
                    if (eVar9 != null) {
                        eVar.mo12673d0(C3524d.C3526b.RIGHT, eVar9, C3524d.C3526b.LEFT, layoutParams2.rightMargin, i);
                    }
                } else if (!(i2 == -1 || (eVar4 = sparseArray2.get(i2)) == null)) {
                    C3524d.C3526b bVar2 = C3524d.C3526b.RIGHT;
                    eVar.mo12673d0(bVar2, eVar4, bVar2, layoutParams2.rightMargin, i);
                }
                int i22 = layoutParams2.f2224h;
                if (i22 != -1) {
                    C3527e eVar10 = sparseArray2.get(i22);
                    if (eVar10 != null) {
                        C3524d.C3526b bVar3 = C3524d.C3526b.TOP;
                        eVar.mo12673d0(bVar3, eVar10, bVar3, layoutParams2.topMargin, layoutParams2.f2252w);
                    }
                } else {
                    int i23 = layoutParams2.f2226i;
                    if (!(i23 == -1 || (eVar3 = sparseArray2.get(i23)) == null)) {
                        eVar.mo12673d0(C3524d.C3526b.TOP, eVar3, C3524d.C3526b.BOTTOM, layoutParams2.topMargin, layoutParams2.f2252w);
                    }
                }
                int i24 = layoutParams2.f2228j;
                if (i24 != -1) {
                    C3527e eVar11 = sparseArray2.get(i24);
                    if (eVar11 != null) {
                        eVar.mo12673d0(C3524d.C3526b.BOTTOM, eVar11, C3524d.C3526b.TOP, layoutParams2.bottomMargin, layoutParams2.f2254y);
                    }
                } else {
                    int i25 = layoutParams2.f2230k;
                    if (!(i25 == -1 || (eVar2 = sparseArray2.get(i25)) == null)) {
                        C3524d.C3526b bVar4 = C3524d.C3526b.BOTTOM;
                        eVar.mo12673d0(bVar4, eVar2, bVar4, layoutParams2.bottomMargin, layoutParams2.f2254y);
                    }
                }
                int i26 = layoutParams2.f2232l;
                if (i26 != -1) {
                    m2698z(eVar, layoutParams, sparseArray, i26, C3524d.C3526b.BASELINE);
                } else {
                    int i27 = layoutParams2.f2234m;
                    if (i27 != -1) {
                        m2698z(eVar, layoutParams, sparseArray, i27, C3524d.C3526b.TOP);
                    } else {
                        int i28 = layoutParams2.f2236n;
                        if (i28 != -1) {
                            m2698z(eVar, layoutParams, sparseArray, i28, C3524d.C3526b.BOTTOM);
                        }
                    }
                }
                if (f >= 0.0f) {
                    eVar6.mo12634J0(f);
                }
                float f5 = layoutParams2.f2188E;
                if (f5 >= 0.0f) {
                    eVar6.mo12668a1(f5);
                }
            }
            if (z && !((i4 = layoutParams2.f2204U) == -1 && layoutParams2.f2205V == -1)) {
                eVar6.mo12664Y0(i4, layoutParams2.f2205V);
            }
            if (layoutParams2.f2213b0) {
                eVar6.mo12640M0(C3527e.C3529b.FIXED);
                eVar6.mo12683h1(layoutParams2.width);
                if (layoutParams2.width == -2) {
                    eVar6.mo12640M0(C3527e.C3529b.WRAP_CONTENT);
                }
            } else if (layoutParams2.width == -1) {
                if (layoutParams2.f2207X) {
                    eVar6.mo12640M0(C3527e.C3529b.MATCH_CONSTRAINT);
                } else {
                    eVar6.mo12640M0(C3527e.C3529b.MATCH_PARENT);
                }
                eVar6.mo12702q(C3524d.C3526b.LEFT).f11309g = layoutParams2.leftMargin;
                eVar6.mo12702q(C3524d.C3526b.RIGHT).f11309g = layoutParams2.rightMargin;
            } else {
                eVar6.mo12640M0(C3527e.C3529b.MATCH_CONSTRAINT);
                eVar6.mo12683h1(0);
            }
            if (layoutParams2.f2215c0) {
                eVar6.mo12674d1(C3527e.C3529b.FIXED);
                eVar6.mo12632I0(layoutParams2.height);
                if (layoutParams2.height == -2) {
                    eVar6.mo12674d1(C3527e.C3529b.WRAP_CONTENT);
                }
            } else if (layoutParams2.height == -1) {
                if (layoutParams2.f2208Y) {
                    eVar6.mo12674d1(C3527e.C3529b.MATCH_CONSTRAINT);
                } else {
                    eVar6.mo12674d1(C3527e.C3529b.MATCH_PARENT);
                }
                eVar6.mo12702q(C3524d.C3526b.TOP).f11309g = layoutParams2.topMargin;
                eVar6.mo12702q(C3524d.C3526b.BOTTOM).f11309g = layoutParams2.bottomMargin;
            } else {
                eVar6.mo12674d1(C3527e.C3529b.MATCH_CONSTRAINT);
                eVar6.mo12632I0(0);
            }
            eVar6.mo12616A0(layoutParams2.f2189F);
            eVar6.mo12644O0(layoutParams2.f2192I);
            eVar6.mo12679f1(layoutParams2.f2193J);
            eVar6.mo12636K0(layoutParams2.f2194K);
            eVar6.mo12670b1(layoutParams2.f2195L);
            eVar6.mo12685i1(layoutParams2.f2211a0);
            eVar6.mo12642N0(layoutParams2.f2196M, layoutParams2.f2198O, layoutParams2.f2200Q, layoutParams2.f2202S);
            eVar6.mo12676e1(layoutParams2.f2197N, layoutParams2.f2199P, layoutParams2.f2201R, layoutParams2.f2203T);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f2166h;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2166h.get(i).mo2422t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void forceLayout() {
        m2696s();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object mo2864g(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f2177s;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f2177s.get(str);
    }

    public int getMaxHeight() {
        return this.f2171m;
    }

    public int getMaxWidth() {
        return this.f2170l;
    }

    public int getMinHeight() {
        return this.f2169k;
    }

    public int getMinWidth() {
        return this.f2168j;
    }

    public int getOptimizationLevel() {
        return this.f2167i.mo12728G1();
    }

    /* renamed from: i */
    public View mo2873i(int i) {
        return this.f2165g.get(i);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C3527e eVar = layoutParams.f2247s0;
            if ((childAt.getVisibility() != 8 || layoutParams.f2219e0 || layoutParams.f2221f0 || layoutParams.f2225h0 || isInEditMode) && !layoutParams.f2223g0) {
                int W = eVar.mo12659W();
                int X = eVar.mo12661X();
                int V = eVar.mo12657V() + W;
                int z2 = eVar.mo12720z() + X;
                childAt.layout(W, X, V, z2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(W, X, V, z2);
                }
            }
        }
        int size = this.f2166h.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2166h.get(i6).mo2412r(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2182x == i) {
            int i3 = this.f2183y;
        }
        if (!this.f2172n) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.f2172n = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.f2172n;
        this.f2182x = i;
        this.f2183y = i2;
        this.f2167i.mo12741V1(mo2875r());
        if (this.f2172n) {
            this.f2172n = false;
            if (m2691A()) {
                this.f2167i.mo12743X1();
            }
        }
        mo2886v(this.f2167i, this.f2173o, i, i2);
        mo2885u(i, i2, this.f2167i.mo12657V(), this.f2167i.mo12720z(), this.f2167i.mo12735N1(), this.f2167i.mo12733L1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C3527e p = mo2874p(view);
        if ((view instanceof Guideline) && !(p instanceof C3533h)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C3533h hVar = new C3533h();
            layoutParams.f2247s0 = hVar;
            layoutParams.f2219e0 = true;
            hVar.mo12786x1(layoutParams.f2206W);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo2858w();
            ((LayoutParams) view.getLayoutParams()).f2221f0 = true;
            if (!this.f2166h.contains(constraintHelper)) {
                this.f2166h.add(constraintHelper);
            }
        }
        this.f2165g.put(view.getId(), view);
        this.f2172n = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2165g.remove(view.getId());
        this.f2167i.mo12815q1(mo2874p(view));
        this.f2166h.remove(view);
        this.f2172n = true;
    }

    /* renamed from: p */
    public final C3527e mo2874p(View view) {
        if (view == this) {
            return this.f2167i;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f2247s0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f2247s0;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo2875r() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        m2696s();
        super.requestLayout();
    }

    public void setConstraintSet(C0430c cVar) {
        this.f2174p = cVar;
    }

    public void setId(int i) {
        this.f2165g.remove(getId());
        super.setId(i);
        this.f2165g.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2171m) {
            this.f2171m = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2170l) {
            this.f2170l = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2169k) {
            this.f2169k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2168j) {
            this.f2168j = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0437d dVar) {
        C0427b bVar = this.f2175q;
        if (bVar != null) {
            bVar.mo2939c(dVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2173o = i;
        this.f2167i.mo12739T1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo2500t(int i) {
        this.f2175q = new C0427b(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo2885u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0423b bVar = this.f2181w;
        int i5 = bVar.f2262e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + bVar.f2261d, i, 0);
        int min = Math.min(this.f2170l, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f2171m, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= BASS.BASS_SPEAKER_FRONT;
        }
        if (z2) {
            min2 |= BASS.BASS_SPEAKER_FRONT;
        }
        setMeasuredDimension(min, min2);
        this.f2178t = min;
        this.f2179u = min2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo2886v(C3530f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f2181w.mo2895c(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo2875r()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo2888y(fVar, mode, i6, mode2, i7);
        fVar.mo12736O1(i, mode, i6, mode2, i7, this.f2178t, this.f2179u, i4, max);
    }

    /* renamed from: x */
    public void mo2887x(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2177s == null) {
                this.f2177s = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2177s.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo2888y(C3530f fVar, int i, int i2, int i3, int i4) {
        C3527e.C3529b bVar;
        C0423b bVar2 = this.f2181w;
        int i5 = bVar2.f2262e;
        int i6 = bVar2.f2261d;
        C3527e.C3529b bVar3 = C3527e.C3529b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = C3527e.C3529b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f2168j);
                }
            } else if (i != 1073741824) {
                bVar = bVar3;
            } else {
                i2 = Math.min(this.f2170l - i6, i2);
                bVar = bVar3;
            }
            i2 = 0;
        } else {
            bVar = C3527e.C3529b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f2168j);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar3 = C3527e.C3529b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f2169k);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f2171m - i5, i4);
            }
            i4 = 0;
        } else {
            bVar3 = C3527e.C3529b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f2169k);
            }
        }
        if (!(i2 == fVar.mo12657V() && i4 == fVar.mo12720z())) {
            fVar.mo12732K1();
        }
        fVar.mo12688j1(0);
        fVar.mo12691k1(0);
        fVar.mo12656U0(this.f2170l - i6);
        fVar.mo12654T0(this.f2171m - i5);
        fVar.mo12662X0(0);
        fVar.mo12660W0(0);
        fVar.mo12640M0(bVar);
        fVar.mo12683h1(i2);
        fVar.mo12674d1(bVar3);
        fVar.mo12632I0(i4);
        fVar.mo12662X0(this.f2168j - i6);
        fVar.mo12660W0(this.f2169k - i5);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2695q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2695q(attributeSet, i, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f2184A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f2185B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f2186C = 0;

        /* renamed from: D */
        public float f2187D = 0.5f;

        /* renamed from: E */
        public float f2188E = 0.5f;

        /* renamed from: F */
        public String f2189F = null;

        /* renamed from: G */
        float f2190G;

        /* renamed from: H */
        int f2191H;

        /* renamed from: I */
        public float f2192I = -1.0f;

        /* renamed from: J */
        public float f2193J = -1.0f;

        /* renamed from: K */
        public int f2194K = 0;

        /* renamed from: L */
        public int f2195L = 0;

        /* renamed from: M */
        public int f2196M = 0;

        /* renamed from: N */
        public int f2197N = 0;

        /* renamed from: O */
        public int f2198O = 0;

        /* renamed from: P */
        public int f2199P = 0;

        /* renamed from: Q */
        public int f2200Q = 0;

        /* renamed from: R */
        public int f2201R = 0;

        /* renamed from: S */
        public float f2202S = 1.0f;

        /* renamed from: T */
        public float f2203T = 1.0f;

        /* renamed from: U */
        public int f2204U = -1;

        /* renamed from: V */
        public int f2205V = -1;

        /* renamed from: W */
        public int f2206W = -1;

        /* renamed from: X */
        public boolean f2207X = false;

        /* renamed from: Y */
        public boolean f2208Y = false;

        /* renamed from: Z */
        public String f2209Z = null;

        /* renamed from: a */
        public int f2210a = -1;

        /* renamed from: a0 */
        public int f2211a0 = 0;

        /* renamed from: b */
        public int f2212b = -1;

        /* renamed from: b0 */
        boolean f2213b0 = true;

        /* renamed from: c */
        public float f2214c = -1.0f;

        /* renamed from: c0 */
        boolean f2215c0 = true;

        /* renamed from: d */
        public int f2216d = -1;

        /* renamed from: d0 */
        boolean f2217d0 = false;

        /* renamed from: e */
        public int f2218e = -1;

        /* renamed from: e0 */
        boolean f2219e0 = false;

        /* renamed from: f */
        public int f2220f = -1;

        /* renamed from: f0 */
        boolean f2221f0 = false;

        /* renamed from: g */
        public int f2222g = -1;

        /* renamed from: g0 */
        boolean f2223g0 = false;

        /* renamed from: h */
        public int f2224h = -1;

        /* renamed from: h0 */
        boolean f2225h0 = false;

        /* renamed from: i */
        public int f2226i = -1;

        /* renamed from: i0 */
        int f2227i0 = -1;

        /* renamed from: j */
        public int f2228j = -1;

        /* renamed from: j0 */
        int f2229j0 = -1;

        /* renamed from: k */
        public int f2230k = -1;

        /* renamed from: k0 */
        int f2231k0 = -1;

        /* renamed from: l */
        public int f2232l = -1;

        /* renamed from: l0 */
        int f2233l0 = -1;

        /* renamed from: m */
        public int f2234m = -1;

        /* renamed from: m0 */
        int f2235m0 = Integer.MIN_VALUE;

        /* renamed from: n */
        public int f2236n = -1;

        /* renamed from: n0 */
        int f2237n0 = Integer.MIN_VALUE;

        /* renamed from: o */
        public int f2238o = -1;

        /* renamed from: o0 */
        float f2239o0 = 0.5f;

        /* renamed from: p */
        public int f2240p = 0;

        /* renamed from: p0 */
        int f2241p0;

        /* renamed from: q */
        public float f2242q = 0.0f;

        /* renamed from: q0 */
        int f2243q0;

        /* renamed from: r */
        public int f2244r = -1;

        /* renamed from: r0 */
        float f2245r0;

        /* renamed from: s */
        public int f2246s = -1;

        /* renamed from: s0 */
        C3527e f2247s0 = new C3527e();

        /* renamed from: t */
        public int f2248t = -1;

        /* renamed from: t0 */
        public boolean f2249t0;

        /* renamed from: u */
        public int f2250u = -1;

        /* renamed from: v */
        public int f2251v = Integer.MIN_VALUE;

        /* renamed from: w */
        public int f2252w = Integer.MIN_VALUE;

        /* renamed from: x */
        public int f2253x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f2254y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f2255z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        private static class C0421a {

            /* renamed from: a */
            public static final SparseIntArray f2256a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2256a = sparseIntArray;
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C0439f.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                SparseIntArray sparseIntArray2 = f2256a;
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray2.append(C0439f.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0421a.f2256a.get(index);
                switch (i2) {
                    case 1:
                        this.f2206W = obtainStyledAttributes.getInt(index, this.f2206W);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2238o);
                        this.f2238o = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f2238o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f2240p = obtainStyledAttributes.getDimensionPixelSize(index, this.f2240p);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2242q) % 360.0f;
                        this.f2242q = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f2242q = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f2210a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2210a);
                        break;
                    case 6:
                        this.f2212b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2212b);
                        break;
                    case 7:
                        this.f2214c = obtainStyledAttributes.getFloat(index, this.f2214c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2216d);
                        this.f2216d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f2216d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2218e);
                        this.f2218e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f2218e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2220f);
                        this.f2220f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f2220f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2222g);
                        this.f2222g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f2222g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2224h);
                        this.f2224h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f2224h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2226i);
                        this.f2226i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f2226i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2228j);
                        this.f2228j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f2228j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2230k);
                        this.f2230k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f2230k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2232l);
                        this.f2232l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f2232l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2244r);
                        this.f2244r = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f2244r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2246s);
                        this.f2246s = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f2246s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2248t);
                        this.f2248t = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f2248t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2250u);
                        this.f2250u = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f2250u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f2251v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2251v);
                        break;
                    case 22:
                        this.f2252w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2252w);
                        break;
                    case 23:
                        this.f2253x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2253x);
                        break;
                    case 24:
                        this.f2254y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2254y);
                        break;
                    case 25:
                        this.f2255z = obtainStyledAttributes.getDimensionPixelSize(index, this.f2255z);
                        break;
                    case 26:
                        this.f2184A = obtainStyledAttributes.getDimensionPixelSize(index, this.f2184A);
                        break;
                    case 27:
                        this.f2207X = obtainStyledAttributes.getBoolean(index, this.f2207X);
                        break;
                    case 28:
                        this.f2208Y = obtainStyledAttributes.getBoolean(index, this.f2208Y);
                        break;
                    case 29:
                        this.f2187D = obtainStyledAttributes.getFloat(index, this.f2187D);
                        break;
                    case 30:
                        this.f2188E = obtainStyledAttributes.getFloat(index, this.f2188E);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.f2196M = i3;
                        if (i3 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2197N = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f2198O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2198O);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2198O) != -2) {
                                break;
                            } else {
                                this.f2198O = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2200Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f2200Q);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2200Q) != -2) {
                                break;
                            } else {
                                this.f2200Q = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f2202S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2202S));
                        this.f2196M = 2;
                        break;
                    case 36:
                        try {
                            this.f2199P = obtainStyledAttributes.getDimensionPixelSize(index, this.f2199P);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2199P) != -2) {
                                break;
                            } else {
                                this.f2199P = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2201R = obtainStyledAttributes.getDimensionPixelSize(index, this.f2201R);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2201R) != -2) {
                                break;
                            } else {
                                this.f2201R = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f2203T = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2203T));
                        this.f2197N = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C0430c.m2754I(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f2192I = obtainStyledAttributes.getFloat(index, this.f2192I);
                                break;
                            case 46:
                                this.f2193J = obtainStyledAttributes.getFloat(index, this.f2193J);
                                break;
                            case 47:
                                this.f2194K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f2195L = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f2204U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2204U);
                                break;
                            case 50:
                                this.f2205V = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2205V);
                                break;
                            case 51:
                                this.f2209Z = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f2234m);
                                this.f2234m = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f2234m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f2236n);
                                this.f2236n = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f2236n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f2186C = obtainStyledAttributes.getDimensionPixelSize(index, this.f2186C);
                                break;
                            case 55:
                                this.f2185B = obtainStyledAttributes.getDimensionPixelSize(index, this.f2185B);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0430c.m2752G(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        C0430c.m2752G(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f2211a0 = obtainStyledAttributes.getInt(index, this.f2211a0);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo2891c();
        }

        /* renamed from: a */
        public String mo2889a() {
            return this.f2209Z;
        }

        /* renamed from: b */
        public C3527e mo2890b() {
            return this.f2247s0;
        }

        /* renamed from: c */
        public void mo2891c() {
            this.f2219e0 = false;
            this.f2213b0 = true;
            this.f2215c0 = true;
            int i = this.width;
            if (i == -2 && this.f2207X) {
                this.f2213b0 = false;
                if (this.f2196M == 0) {
                    this.f2196M = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f2208Y) {
                this.f2215c0 = false;
                if (this.f2197N == 0) {
                    this.f2197N = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2213b0 = false;
                if (i == 0 && this.f2196M == 1) {
                    this.width = -2;
                    this.f2207X = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2215c0 = false;
                if (i2 == 0 && this.f2197N == 1) {
                    this.height = -2;
                    this.f2208Y = true;
                }
            }
            if (this.f2214c != -1.0f || this.f2210a != -1 || this.f2212b != -1) {
                this.f2219e0 = true;
                this.f2213b0 = true;
                this.f2215c0 = true;
                if (!(this.f2247s0 instanceof C3533h)) {
                    this.f2247s0 = new C3533h();
                }
                ((C3533h) this.f2247s0).mo12786x1(this.f2206W);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                if (r4 != r11) goto L_0x0017
                r11 = 1
                goto L_0x0018
            L_0x0017:
                r11 = 0
            L_0x0018:
                r2 = -1
                r10.f2231k0 = r2
                r10.f2233l0 = r2
                r10.f2227i0 = r2
                r10.f2229j0 = r2
                r10.f2235m0 = r2
                r10.f2237n0 = r2
                int r5 = r10.f2251v
                r10.f2235m0 = r5
                int r5 = r10.f2253x
                r10.f2237n0 = r5
                float r5 = r10.f2187D
                r10.f2239o0 = r5
                int r6 = r10.f2210a
                r10.f2241p0 = r6
                int r7 = r10.f2212b
                r10.f2243q0 = r7
                float r8 = r10.f2214c
                r10.f2245r0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x009a
                int r11 = r10.f2244r
                if (r11 == r2) goto L_0x0049
                r10.f2231k0 = r11
            L_0x0047:
                r3 = 1
                goto L_0x0050
            L_0x0049:
                int r11 = r10.f2246s
                if (r11 == r2) goto L_0x0050
                r10.f2233l0 = r11
                goto L_0x0047
            L_0x0050:
                int r11 = r10.f2248t
                if (r11 == r2) goto L_0x0057
                r10.f2229j0 = r11
                r3 = 1
            L_0x0057:
                int r11 = r10.f2250u
                if (r11 == r2) goto L_0x005e
                r10.f2227i0 = r11
                r3 = 1
            L_0x005e:
                int r11 = r10.f2255z
                if (r11 == r9) goto L_0x0064
                r10.f2237n0 = r11
            L_0x0064:
                int r11 = r10.f2184A
                if (r11 == r9) goto L_0x006a
                r10.f2235m0 = r11
            L_0x006a:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r11 - r5
                r10.f2239o0 = r3
            L_0x0072:
                boolean r3 = r10.f2219e0
                if (r3 == 0) goto L_0x00be
                int r3 = r10.f2206W
                if (r3 != r4) goto L_0x00be
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r4 == 0) goto L_0x0088
                float r11 = r11 - r8
                r10.f2245r0 = r11
                r10.f2241p0 = r2
                r10.f2243q0 = r2
                goto L_0x00be
            L_0x0088:
                if (r6 == r2) goto L_0x0091
                r10.f2243q0 = r6
                r10.f2241p0 = r2
                r10.f2245r0 = r3
                goto L_0x00be
            L_0x0091:
                if (r7 == r2) goto L_0x00be
                r10.f2241p0 = r7
                r10.f2243q0 = r2
                r10.f2245r0 = r3
                goto L_0x00be
            L_0x009a:
                int r11 = r10.f2244r
                if (r11 == r2) goto L_0x00a0
                r10.f2229j0 = r11
            L_0x00a0:
                int r11 = r10.f2246s
                if (r11 == r2) goto L_0x00a6
                r10.f2227i0 = r11
            L_0x00a6:
                int r11 = r10.f2248t
                if (r11 == r2) goto L_0x00ac
                r10.f2231k0 = r11
            L_0x00ac:
                int r11 = r10.f2250u
                if (r11 == r2) goto L_0x00b2
                r10.f2233l0 = r11
            L_0x00b2:
                int r11 = r10.f2255z
                if (r11 == r9) goto L_0x00b8
                r10.f2235m0 = r11
            L_0x00b8:
                int r11 = r10.f2184A
                if (r11 == r9) goto L_0x00be
                r10.f2237n0 = r11
            L_0x00be:
                int r11 = r10.f2248t
                if (r11 != r2) goto L_0x0108
                int r11 = r10.f2250u
                if (r11 != r2) goto L_0x0108
                int r11 = r10.f2246s
                if (r11 != r2) goto L_0x0108
                int r11 = r10.f2244r
                if (r11 != r2) goto L_0x0108
                int r11 = r10.f2220f
                if (r11 == r2) goto L_0x00dd
                r10.f2231k0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r10.rightMargin = r1
                goto L_0x00eb
            L_0x00dd:
                int r11 = r10.f2222g
                if (r11 == r2) goto L_0x00eb
                r10.f2233l0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00eb
                if (r1 <= 0) goto L_0x00eb
                r10.rightMargin = r1
            L_0x00eb:
                int r11 = r10.f2216d
                if (r11 == r2) goto L_0x00fa
                r10.f2227i0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r10.leftMargin = r0
                goto L_0x0108
            L_0x00fa:
                int r11 = r10.f2218e
                if (r11 == r2) goto L_0x0108
                r10.f2229j0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0108
                if (r0 <= 0) goto L_0x0108
                r10.leftMargin = r0
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
