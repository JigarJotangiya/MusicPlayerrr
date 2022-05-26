package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.recyclerview.widget.C0885l;
import java.util.ArrayList;
import p082e.p109h.C3614a;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3763k;
import p082e.p109h.p119p.C3764l;
import p082e.p109h.p119p.C3766n;
import p082e.p109h.p119p.C3768p;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3745e;

public class NestedScrollView extends FrameLayout implements C3766n, C3763k {

    /* renamed from: G */
    private static final C0541a f2755G = new C0541a();

    /* renamed from: H */
    private static final int[] f2756H = {16843130};

    /* renamed from: A */
    private int f2757A;

    /* renamed from: B */
    private SavedState f2758B;

    /* renamed from: C */
    private final C3768p f2759C;

    /* renamed from: D */
    private final C3764l f2760D;

    /* renamed from: E */
    private float f2761E;

    /* renamed from: F */
    private C0542b f2762F;

    /* renamed from: g */
    private long f2763g;

    /* renamed from: h */
    private final Rect f2764h;

    /* renamed from: i */
    private OverScroller f2765i;

    /* renamed from: j */
    private EdgeEffect f2766j;

    /* renamed from: k */
    private EdgeEffect f2767k;

    /* renamed from: l */
    private int f2768l;

    /* renamed from: m */
    private boolean f2769m;

    /* renamed from: n */
    private boolean f2770n;

    /* renamed from: o */
    private View f2771o;

    /* renamed from: p */
    private boolean f2772p;

    /* renamed from: q */
    private VelocityTracker f2773q;

    /* renamed from: r */
    private boolean f2774r;

    /* renamed from: s */
    private boolean f2775s;

    /* renamed from: t */
    private int f2776t;

    /* renamed from: u */
    private int f2777u;

    /* renamed from: v */
    private int f2778v;

    /* renamed from: w */
    private int f2779w;

    /* renamed from: x */
    private final int[] f2780x;

    /* renamed from: y */
    private final int[] f2781y;

    /* renamed from: z */
    private int f2782z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0540a();

        /* renamed from: g */
        public int f2783g;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        class C0540a implements Parcelable.Creator<SavedState> {
            C0540a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2783g + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2783g);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2783g = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0541a extends C3704a {
        C0541a() {
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3426f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3745e.m16076a(accessibilityEvent, nestedScrollView.getScrollX());
            C3745e.m16077b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            int scrollRange;
            super.mo3427g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo13114c0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo13153y0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo13111b(C3736c.C3737a.f11796i);
                    cVar.mo13111b(C3736c.C3737a.f11800m);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo13111b(C3736c.C3737a.f11795h);
                    cVar.mo13111b(C3736c.C3737a.f11801n);
                }
            }
        }

        /* renamed from: j */
        public boolean mo3428j(View view, int i, Bundle bundle) {
            if (super.mo3428j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3359O(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3359O(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0542b {
        /* renamed from: a */
        void mo451a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private static boolean m3309A(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3309A((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private boolean m3310B(View view, int i, int i2) {
        view.getDrawingRect(this.f2764h);
        offsetDescendantRectToMyCoords(view, this.f2764h);
        return this.f2764h.bottom + i >= getScrollY() && this.f2764h.top - i <= getScrollY() + i2;
    }

    /* renamed from: C */
    private void m3311C(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2760D.mo13178e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: D */
    private void m3312D(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2779w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2768l = (int) motionEvent.getY(i);
            this.f2779w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2773q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: G */
    private void m3313G() {
        VelocityTracker velocityTracker = this.f2773q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2773q = null;
        }
    }

    /* renamed from: H */
    private void m3314H(boolean z) {
        if (z) {
            mo3360P(2, 1);
        } else {
            mo3361Q(1);
        }
        this.f2757A = getScrollY();
        C3774v.m16197e0(this);
    }

    /* renamed from: I */
    private boolean m3315I(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View r = m3325r(z2, i2, i3);
        if (r == null) {
            r = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3322h(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (r != findFocus()) {
            r.requestFocus(i);
        }
        return z;
    }

    /* renamed from: J */
    private void m3316J(View view) {
        view.getDrawingRect(this.f2764h);
        offsetDescendantRectToMyCoords(view, this.f2764h);
        int e = mo3380e(this.f2764h);
        if (e != 0) {
            scrollBy(0, e);
        }
    }

    /* renamed from: K */
    private boolean m3317K(Rect rect, boolean z) {
        int e = mo3380e(rect);
        boolean z2 = e != 0;
        if (z2) {
            if (z) {
                scrollBy(0, e);
            } else {
                mo3357L(0, e);
            }
        }
        return z2;
    }

    /* renamed from: M */
    private void m3318M(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2763g > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2765i;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m3314H(z);
            } else {
                if (!this.f2765i.isFinished()) {
                    m3319a();
                }
                scrollBy(i, i2);
            }
            this.f2763g = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m3319a() {
        this.f2765i.abortAnimation();
        mo3361Q(1);
    }

    /* renamed from: c */
    private boolean m3320c() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m3321d(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2761E == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2761E = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2761E;
    }

    /* renamed from: h */
    private void m3322h(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2775s) {
            mo3357L(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: i */
    private void m3323i() {
        this.f2772p = false;
        m3313G();
        mo3361Q(0);
        EdgeEffect edgeEffect = this.f2766j;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2767k.onRelease();
        }
    }

    /* renamed from: p */
    private void m3324p() {
        if (getOverScrollMode() == 2) {
            this.f2766j = null;
            this.f2767k = null;
        } else if (this.f2766j == null) {
            Context context = getContext();
            this.f2766j = new EdgeEffect(context);
            this.f2767k = new EdgeEffect(context);
        }
    }

    /* renamed from: r */
    private View m3325r(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: v */
    private boolean m3326v(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private void m3327w() {
        VelocityTracker velocityTracker = this.f2773q;
        if (velocityTracker == null) {
            this.f2773q = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: x */
    private void m3328x() {
        this.f2765i = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2776t = viewConfiguration.getScaledTouchSlop();
        this.f2777u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2778v = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: y */
    private void m3329y() {
        if (this.f2773q == null) {
            this.f2773q = VelocityTracker.obtain();
        }
    }

    /* renamed from: z */
    private boolean m3330z(View view) {
        return !m3310B(view, 0, getHeight());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3355E(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo3419u(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f2765i
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3355E(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: F */
    public boolean mo3356F(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2764h.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2764h;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2764h.top = getScrollY() - height;
            Rect rect2 = this.f2764h;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2764h;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m3315I(i, i2, i3);
    }

    /* renamed from: L */
    public final void mo3357L(int i, int i2) {
        m3318M(i, i2, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3358N(int i, int i2, int i3, boolean z) {
        m3318M(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo3359O(int i, int i2, boolean z) {
        mo3358N(i, i2, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, z);
    }

    /* renamed from: P */
    public boolean mo3360P(int i, int i2) {
        return this.f2760D.mo13185p(i, i2);
    }

    /* renamed from: Q */
    public void mo3361Q(int i) {
        this.f2760D.mo13187r(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo3366b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3310B(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3322h(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2764h);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2764h);
            m3322h(mo3380e(this.f2764h));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m3330z(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2765i.isFinished()) {
            this.f2765i.computeScrollOffset();
            int currY = this.f2765i.getCurrY();
            int i = currY - this.f2757A;
            this.f2757A = currY;
            int[] iArr = this.f2781y;
            boolean z = false;
            iArr[1] = 0;
            mo3381f(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f2781y[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo3355E(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2781y;
                iArr2[1] = 0;
                mo3382g(0, scrollY2, 0, i3, this.f2780x, 1, iArr2);
                i2 = i3 - this.f2781y[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m3324p();
                    if (i2 < 0) {
                        if (this.f2766j.isFinished()) {
                            this.f2766j.onAbsorb((int) this.f2765i.getCurrVelocity());
                        }
                    } else if (this.f2767k.isFinished()) {
                        this.f2767k.onAbsorb((int) this.f2765i.getCurrVelocity());
                    }
                }
                m3319a();
            }
            if (!this.f2765i.isFinished()) {
                C3774v.m16197e0(this);
            } else {
                mo3361Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3404q(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2760D.mo13174a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2760D.mo13175b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3381f(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2760D.mo13179f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2766j != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2766j.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (i3 >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2766j.setSize(width, height);
                if (this.f2766j.draw(canvas)) {
                    C3774v.m16197e0(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2767k.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (i4 >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2767k.setSize(width2, height2);
                if (this.f2767k.draw(canvas)) {
                    C3774v.m16197e0(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo3380e(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: f */
    public boolean mo3381f(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2760D.mo13177d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: g */
    public void mo3382g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2760D.mo13178e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2759C.mo13188a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo3419u(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2760D.mo13182l();
    }

    /* renamed from: j */
    public void mo1214j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3311C(i4, i5, iArr);
    }

    /* renamed from: k */
    public void mo1215k(View view, int i, int i2, int i3, int i4, int i5) {
        m3311C(i4, i5, (int[]) null);
    }

    /* renamed from: l */
    public boolean mo1216l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: m */
    public void mo1217m(View view, View view2, int i, int i2) {
        this.f2759C.mo13190c(view, view2, i, i2);
        mo3360P(2, i2);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1218n(View view, int i) {
        this.f2759C.mo13192e(view, i);
        mo3361Q(i);
    }

    /* renamed from: o */
    public void mo1219o(View view, int i, int i2, int[] iArr, int i3) {
        mo3381f(i, i2, iArr, (int[]) null, i3);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2770n = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2772p) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2772p) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2779w;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2768l) > this.f2776t && (2 & getNestedScrollAxes()) == 0) {
                                this.f2772p = true;
                                this.f2768l = y;
                                m3329y();
                                this.f2773q.addMovement(motionEvent);
                                this.f2782z = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3312D(motionEvent);
                    }
                }
            }
            this.f2772p = false;
            this.f2779w = -1;
            m3313G();
            if (this.f2765i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C3774v.m16197e0(this);
            }
            mo3361Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m3326v((int) motionEvent.getX(), y2)) {
                this.f2772p = false;
                m3313G();
            } else {
                this.f2768l = y2;
                this.f2779w = motionEvent.getPointerId(0);
                m3327w();
                this.f2773q.addMovement(motionEvent);
                this.f2765i.computeScrollOffset();
                this.f2772p = !this.f2765i.isFinished();
                mo3360P(2, 0);
            }
        }
        return this.f2772p;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2769m = false;
        View view = this.f2771o;
        if (view != null && m3309A(view, this)) {
            m3316J(this.f2771o);
        }
        this.f2771o = null;
        if (!this.f2770n) {
            if (this.f2758B != null) {
                scrollTo(getScrollX(), this.f2758B.f2783g);
                this.f2758B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d = m3321d(scrollY, paddingTop, i5);
            if (d != scrollY) {
                scrollTo(getScrollX(), d);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2770n = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2774r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3409s((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1219o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3311C(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1217m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m3330z(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2758B = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2783g = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0542b bVar = this.f2762F;
        if (bVar != null) {
            bVar.mo451a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3310B(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2764h);
            offsetDescendantRectToMyCoords(findFocus, this.f2764h);
            m3322h(mo3380e(this.f2764h));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1216l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1218n(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        m3329y();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2782z = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f2782z);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2773q;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f2778v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2779w);
                if (Math.abs(yVelocity) >= this.f2777u) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo3409s(i);
                    }
                } else if (this.f2765i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C3774v.m16197e0(this);
                }
                this.f2779w = -1;
                m3323i();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f2779w);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f2779w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f2768l - y;
                    if (!this.f2772p && Math.abs(i2) > this.f2776t) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2772p = true;
                        i2 = i2 > 0 ? i2 - this.f2776t : i2 + this.f2776t;
                    }
                    int i3 = i2;
                    if (this.f2772p) {
                        if (mo3381f(0, i3, this.f2781y, this.f2780x, 0)) {
                            i3 -= this.f2781y[1];
                            this.f2782z += this.f2780x[1];
                        }
                        int i4 = i3;
                        this.f2768l = y - this.f2780x[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (mo3355E(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo3419u(0)) {
                            this.f2773q.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f2781y;
                        iArr[1] = 0;
                        mo3382g(0, scrollY2, 0, i4 - scrollY2, this.f2780x, 0, iArr);
                        int i6 = this.f2768l;
                        int[] iArr2 = this.f2780x;
                        this.f2768l = i6 - iArr2[1];
                        this.f2782z += iArr2[1];
                        if (z) {
                            int i7 = i4 - this.f2781y[1];
                            m3324p();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C0550f.m3397a(this.f2766j, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f2767k.isFinished()) {
                                    this.f2767k.onRelease();
                                }
                            } else if (i8 > i5) {
                                C0550f.m3397a(this.f2767k, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f2766j.isFinished()) {
                                    this.f2766j.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f2766j;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2767k.isFinished())) {
                                C3774v.m16197e0(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2772p && getChildCount() > 0 && this.f2765i.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C3774v.m16197e0(this);
                }
                this.f2779w = -1;
                m3323i();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2768l = (int) motionEvent2.getY(actionIndex);
                this.f2779w = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3312D(motionEvent);
                this.f2768l = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f2779w));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f2765i.isFinished();
            this.f2772p = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2765i.isFinished()) {
                m3319a();
            }
            this.f2768l = (int) motionEvent.getY();
            this.f2779w = motionEvent2.getPointerId(0);
            mo3360P(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2773q;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* renamed from: q */
    public boolean mo3404q(KeyEvent keyEvent) {
        this.f2764h.setEmpty();
        int i = 130;
        if (!m3320c()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo3356F(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo3366b(130);
                } else {
                    return mo3418t(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo3366b(33);
            } else {
                return mo3418t(33);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2769m) {
            m3316J(view2);
        } else {
            this.f2771o = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3317K(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3313G();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2769m = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public void mo3409s(int i) {
        if (getChildCount() > 0) {
            this.f2765i.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3314H(true);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d = m3321d(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d2 = m3321d(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d != getScrollX() || d2 != getScrollY()) {
                super.scrollTo(d, d2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2774r) {
            this.f2774r = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2760D.mo13183m(z);
    }

    public void setOnScrollChangeListener(C0542b bVar) {
        this.f2762F = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2775s = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo3360P(i, 0);
    }

    public void stopNestedScroll() {
        mo3361Q(0);
    }

    /* renamed from: t */
    public boolean mo3418t(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2764h;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2764h.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2764h;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2764h;
        return m3315I(i, rect3.top, rect3.bottom);
    }

    /* renamed from: u */
    public boolean mo3419u(int i) {
        return this.f2760D.mo13181k(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3614a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2764h = new Rect();
        this.f2769m = true;
        this.f2770n = false;
        this.f2771o = null;
        this.f2772p = false;
        this.f2775s = true;
        this.f2779w = -1;
        this.f2780x = new int[2];
        this.f2781y = new int[2];
        m3328x();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2756H, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2759C = new C3768p(this);
        this.f2760D = new C3764l(this);
        setNestedScrollingEnabled(true);
        C3774v.m16217o0(this, f2755G);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
