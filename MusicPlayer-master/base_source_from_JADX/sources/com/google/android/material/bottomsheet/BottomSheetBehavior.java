package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C6100s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3746f;
import p082e.p124j.p125a.C3808c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: Y */
    private static final int f27824Y = C7499k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    float f27825A = 0.5f;

    /* renamed from: B */
    int f27826B;

    /* renamed from: C */
    float f27827C = -1.0f;

    /* renamed from: D */
    boolean f27828D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f27829E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f27830F = true;

    /* renamed from: G */
    int f27831G = 4;

    /* renamed from: H */
    C3808c f27832H;

    /* renamed from: I */
    private boolean f27833I;

    /* renamed from: J */
    private int f27834J;

    /* renamed from: K */
    private boolean f27835K;

    /* renamed from: L */
    private int f27836L;

    /* renamed from: M */
    int f27837M;

    /* renamed from: N */
    int f27838N;

    /* renamed from: O */
    WeakReference<V> f27839O;

    /* renamed from: P */
    WeakReference<View> f27840P;

    /* renamed from: Q */
    private final ArrayList<C5939g> f27841Q = new ArrayList<>();

    /* renamed from: R */
    private VelocityTracker f27842R;

    /* renamed from: S */
    int f27843S;

    /* renamed from: T */
    private int f27844T;

    /* renamed from: U */
    boolean f27845U;

    /* renamed from: V */
    private Map<View, Integer> f27846V;

    /* renamed from: W */
    private int f27847W = -1;

    /* renamed from: X */
    private final C3808c.C3811c f27848X = new C5937e();

    /* renamed from: a */
    private int f27849a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f27850b = true;

    /* renamed from: c */
    private boolean f27851c = false;

    /* renamed from: d */
    private float f27852d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f27853e;

    /* renamed from: f */
    private boolean f27854f;

    /* renamed from: g */
    private int f27855g;

    /* renamed from: h */
    private int f27856h;

    /* renamed from: i */
    private boolean f27857i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7541h f27858j;

    /* renamed from: k */
    private int f27859k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f27860l;

    /* renamed from: m */
    private boolean f27861m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f27862n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f27863o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f27864p;

    /* renamed from: q */
    private boolean f27865q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f27866r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f27867s;

    /* renamed from: t */
    private C7549m f27868t;

    /* renamed from: u */
    private boolean f27869u;

    /* renamed from: v */
    private BottomSheetBehavior<V>.h f27870v = null;

    /* renamed from: w */
    private ValueAnimator f27871w;

    /* renamed from: x */
    int f27872x;

    /* renamed from: y */
    int f27873y;

    /* renamed from: z */
    int f27874z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C5933a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f27880g;

        /* renamed from: h */
        final /* synthetic */ ViewGroup.LayoutParams f27881h;

        C5933a(BottomSheetBehavior bottomSheetBehavior, View view, ViewGroup.LayoutParams layoutParams) {
            this.f27880g = view;
            this.f27881h = layoutParams;
        }

        public void run() {
            this.f27880g.setLayoutParams(this.f27881h);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C5934b implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f27882g;

        /* renamed from: h */
        final /* synthetic */ int f27883h;

        C5934b(View view, int i) {
            this.f27882g = view;
            this.f27883h = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo23063v0(this.f27882g, this.f27883h);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C5935c implements ValueAnimator.AnimatorUpdateListener {
        C5935c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f27858j != null) {
                BottomSheetBehavior.this.f27858j.mo28464b0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C5936d implements C6100s.C6104d {

        /* renamed from: a */
        final /* synthetic */ boolean f27886a;

        C5936d(boolean z) {
            this.f27886a = z;
        }

        /* renamed from: a */
        public C3718d0 mo23008a(View view, C3718d0 d0Var, C6100s.C6105e eVar) {
            int unused = BottomSheetBehavior.this.f27867s = d0Var.mo13038l();
            boolean h = C6100s.m36587h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f27862n) {
                int unused2 = BottomSheetBehavior.this.f27866r = d0Var.mo13035i();
                paddingBottom = eVar.f28554d + BottomSheetBehavior.this.f27866r;
            }
            if (BottomSheetBehavior.this.f27863o) {
                paddingLeft = (h ? eVar.f28553c : eVar.f28551a) + d0Var.mo13036j();
            }
            if (BottomSheetBehavior.this.f27864p) {
                paddingRight = (h ? eVar.f28551a : eVar.f28553c) + d0Var.mo13037k();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f27886a) {
                int unused3 = BottomSheetBehavior.this.f27860l = d0Var.mo13032g().f11592d;
            }
            if (BottomSheetBehavior.this.f27862n || this.f27886a) {
                BottomSheetBehavior.this.m35490C0(false);
            }
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    class C5937e extends C3808c.C3811c {
        C5937e() {
        }

        /* renamed from: n */
        private boolean m35555n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f27838N + bottomSheetBehavior.mo23048b0()) / 2;
        }

        /* renamed from: a */
        public int mo3555a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo3556b(View view, int i, int i2) {
            int b0 = BottomSheetBehavior.this.mo23048b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C3641a.m15694b(i, b0, bottomSheetBehavior.f27828D ? bottomSheetBehavior.f27838N : bottomSheetBehavior.f27826B);
        }

        /* renamed from: e */
        public int mo13308e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f27828D) {
                return bottomSheetBehavior.f27838N;
            }
            return bottomSheetBehavior.f27826B;
        }

        /* renamed from: j */
        public void mo3562j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f27830F) {
                BottomSheetBehavior.this.mo23062t0(1);
            }
        }

        /* renamed from: k */
        public void mo3563k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo23046Z(i2);
        }

        /* renamed from: l */
        public void mo3564l(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f27828D || !bottomSheetBehavior.mo23064x0(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f27850b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f27874z;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f27826B)) {
                                    i = BottomSheetBehavior.this.mo23048b0();
                                } else {
                                    i2 = BottomSheetBehavior.this.f27874z;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f27826B)) {
                                i2 = BottomSheetBehavior.this.f27874z;
                            } else {
                                i = BottomSheetBehavior.this.f27826B;
                                BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f27873y) < Math.abs(top - BottomSheetBehavior.this.f27826B)) {
                            i = BottomSheetBehavior.this.f27873y;
                        } else {
                            i = BottomSheetBehavior.this.f27826B;
                            BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f27850b) {
                            i = BottomSheetBehavior.this.f27826B;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f27874z) < Math.abs(top2 - BottomSheetBehavior.this.f27826B)) {
                                i2 = BottomSheetBehavior.this.f27874z;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f27826B;
                            }
                        }
                        BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m35555n(view)) {
                    i = BottomSheetBehavior.this.f27838N;
                    i3 = 5;
                    BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f27850b) {
                    i = BottomSheetBehavior.this.f27873y;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.mo23048b0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f27874z)) {
                    i = BottomSheetBehavior.this.mo23048b0();
                } else {
                    i2 = BottomSheetBehavior.this.f27874z;
                    i3 = 6;
                    BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f27850b) {
                i = BottomSheetBehavior.this.f27873y;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f27874z;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
                }
                i = bottomSheetBehavior3.mo23048b0();
            }
            i3 = 3;
            BottomSheetBehavior.this.mo23065y0(view, i3, i, true);
        }

        /* renamed from: m */
        public boolean mo3565m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f27831G;
            if (i2 == 1 || bottomSheetBehavior.f27845U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f27843S == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f27840P;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f27839O;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    class C5938f implements C3746f {

        /* renamed from: a */
        final /* synthetic */ int f27889a;

        C5938f(int i) {
            this.f27889a = i;
        }

        /* renamed from: a */
        public boolean mo6390a(View view, C3746f.C3747a aVar) {
            BottomSheetBehavior.this.mo23061s0(this.f27889a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class C5939g {
        /* renamed from: a */
        public abstract void mo23075a(View view, float f);

        /* renamed from: b */
        public abstract void mo23076b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    private class C5940h implements Runnable {

        /* renamed from: g */
        private final View f27891g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f27892h;

        /* renamed from: i */
        int f27893i;

        C5940h(View view, int i) {
            this.f27891g = view;
            this.f27893i = i;
        }

        public void run() {
            C3808c cVar = BottomSheetBehavior.this.f27832H;
            if (cVar == null || !cVar.mo13300n(true)) {
                BottomSheetBehavior.this.mo23062t0(this.f27893i);
            } else {
                C3774v.m16201g0(this.f27891g, this);
            }
            this.f27892h = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: A0 */
    private void m35488A0(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f27869u != z) {
                this.f27869u = z;
                if (this.f27858j != null && (valueAnimator = this.f27871w) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f27871w.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f27871w.setFloatValues(new float[]{1.0f - f, f});
                    this.f27871w.start();
                }
            }
        }
    }

    /* renamed from: B0 */
    private void m35489B0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f27839O;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f27846V == null) {
                        this.f27846V = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f27839O.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f27846V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f27851c) {
                                C3774v.m16237y0(childAt, 4);
                            }
                        } else if (this.f27851c && (map = this.f27846V) != null && map.containsKey(childAt)) {
                            C3774v.m16237y0(childAt, this.f27846V.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f27846V = null;
                } else if (this.f27851c) {
                    ((View) this.f27839O.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m35490C0(boolean z) {
        View view;
        if (this.f27839O != null) {
            m35505S();
            if (this.f27831G == 4 && (view = (View) this.f27839O.get()) != null) {
                if (z) {
                    m35517w0(this.f27831G);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: R */
    private int m35504R(V v, int i, int i2) {
        return C3774v.m16190b(v, v.getResources().getString(i), m35508V(i2));
    }

    /* renamed from: S */
    private void m35505S() {
        int U = m35507U();
        if (this.f27850b) {
            this.f27826B = Math.max(this.f27838N - U, this.f27873y);
        } else {
            this.f27826B = this.f27838N - U;
        }
    }

    /* renamed from: T */
    private void m35506T() {
        this.f27874z = (int) (((float) this.f27838N) * (1.0f - this.f27825A));
    }

    /* renamed from: U */
    private int m35507U() {
        int i;
        if (this.f27854f) {
            return Math.min(Math.max(this.f27855g, this.f27838N - ((this.f27837M * 9) / 16)), this.f27836L) + this.f27866r;
        }
        if (this.f27861m || this.f27862n || (i = this.f27860l) <= 0) {
            return this.f27853e + this.f27866r;
        }
        return Math.max(this.f27853e, i + this.f27856h);
    }

    /* renamed from: V */
    private C3746f m35508V(int i) {
        return new C5938f(i);
    }

    /* renamed from: W */
    private void m35509W(Context context, AttributeSet attributeSet, boolean z) {
        m35510X(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: X */
    private void m35510X(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f27857i) {
            this.f27868t = C7549m.m42149e(context, attributeSet, C7490b.bottomSheetStyle, f27824Y).mo28526m();
            C7541h hVar = new C7541h(this.f27868t);
            this.f27858j = hVar;
            hVar.mo28456P(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f27858j.setTint(typedValue.data);
                return;
            }
            this.f27858j.mo28463a0(colorStateList);
        }
    }

    /* renamed from: Y */
    private void m35511Y() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f27871w = ofFloat;
        ofFloat.setDuration(500);
        this.f27871w.addUpdateListener(new C5935c());
    }

    /* renamed from: c0 */
    private float m35512c0() {
        VelocityTracker velocityTracker = this.f27842R;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f27852d);
        return this.f27842R.getYVelocity(this.f27843S);
    }

    /* renamed from: e0 */
    private void m35513e0(V v, C3736c.C3737a aVar, int i) {
        C3774v.m16209k0(v, aVar, (CharSequence) null, m35508V(i));
    }

    /* renamed from: f0 */
    private void m35514f0() {
        this.f27843S = -1;
        VelocityTracker velocityTracker = this.f27842R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27842R = null;
        }
    }

    /* renamed from: g0 */
    private void m35515g0(SavedState savedState) {
        int i = this.f27849a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f27853e = savedState.f27876j;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f27850b = savedState.f27877k;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f27828D = savedState.f27878l;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f27829E = savedState.f27879m;
            }
        }
    }

    /* renamed from: u0 */
    private void m35516u0(View view) {
        boolean z = Build.VERSION.SDK_INT >= 29 && !mo23049d0() && !this.f27854f;
        if (this.f27862n || this.f27863o || this.f27864p || z) {
            C6100s.m36581b(view, new C5936d(z));
        }
    }

    /* renamed from: w0 */
    private void m35517w0(int i) {
        View view = (View) this.f27839O.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C3774v.m16180S(view)) {
                mo23063v0(view, i);
            } else {
                view.post(new C5934b(view, i));
            }
        }
    }

    /* renamed from: z0 */
    private void m35518z0() {
        View view;
        WeakReference<V> weakReference = this.f27839O;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C3774v.m16205i0(view, 524288);
            C3774v.m16205i0(view, 262144);
            C3774v.m16205i0(view, 1048576);
            int i = this.f27847W;
            if (i != -1) {
                C3774v.m16205i0(view, i);
            }
            int i2 = 6;
            if (!this.f27850b && this.f27831G != 6) {
                this.f27847W = m35504R(view, C7498j.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f27828D && this.f27831G != 5) {
                m35513e0(view, C3736c.C3737a.f11799l, 5);
            }
            int i3 = this.f27831G;
            if (i3 == 3) {
                if (this.f27850b) {
                    i2 = 4;
                }
                m35513e0(view, C3736c.C3737a.f11798k, i2);
            } else if (i3 == 4) {
                if (this.f27850b) {
                    i2 = 3;
                }
                m35513e0(view, C3736c.C3737a.f11797j, i2);
            } else if (i3 == 6) {
                m35513e0(view, C3736c.C3737a.f11798k, 4);
                m35513e0(view, C3736c.C3737a.f11797j, 3);
            }
        }
    }

    /* renamed from: A */
    public boolean mo3047A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f27834J = 0;
        this.f27835K = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public void mo3049C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo23048b0()) {
            mo23062t0(3);
            return;
        }
        WeakReference<View> weakReference = this.f27840P;
        if (weakReference != null && view == weakReference.get() && this.f27835K) {
            if (this.f27834J > 0) {
                if (this.f27850b) {
                    i2 = this.f27873y;
                } else {
                    int top = v.getTop();
                    int i5 = this.f27874z;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = mo23048b0();
                    }
                }
                mo23065y0(v, i4, i2, false);
                this.f27835K = false;
            } else if (!this.f27828D || !mo23064x0(v, m35512c0())) {
                if (this.f27834J == 0) {
                    int top2 = v.getTop();
                    if (!this.f27850b) {
                        int i6 = this.f27874z;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f27826B)) {
                                i2 = mo23048b0();
                                mo23065y0(v, i4, i2, false);
                                this.f27835K = false;
                            }
                            i2 = this.f27874z;
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f27826B)) {
                            i2 = this.f27874z;
                        } else {
                            i3 = this.f27826B;
                        }
                    } else if (Math.abs(top2 - this.f27873y) < Math.abs(top2 - this.f27826B)) {
                        i2 = this.f27873y;
                        mo23065y0(v, i4, i2, false);
                        this.f27835K = false;
                    } else {
                        i3 = this.f27826B;
                    }
                } else if (this.f27850b) {
                    i3 = this.f27826B;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f27874z) < Math.abs(top3 - this.f27826B)) {
                        i2 = this.f27874z;
                    } else {
                        i3 = this.f27826B;
                    }
                }
                i4 = 4;
                mo23065y0(v, i4, i2, false);
                this.f27835K = false;
            } else {
                i2 = this.f27838N;
                i4 = 5;
                mo23065y0(v, i4, i2, false);
                this.f27835K = false;
            }
            i4 = 6;
            mo23065y0(v, i4, i2, false);
            this.f27835K = false;
        }
    }

    /* renamed from: D */
    public boolean mo3050D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27831G == 1 && actionMasked == 0) {
            return true;
        }
        C3808c cVar = this.f27832H;
        if (cVar != null) {
            cVar.mo13287F(motionEvent);
        }
        if (actionMasked == 0) {
            m35514f0();
        }
        if (this.f27842R == null) {
            this.f27842R = VelocityTracker.obtain();
        }
        this.f27842R.addMovement(motionEvent);
        if (this.f27832H != null && actionMasked == 2 && !this.f27833I && Math.abs(((float) this.f27844T) - motionEvent.getY()) > ((float) this.f27832H.mo13304z())) {
            this.f27832H.mo13297c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f27833I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo23046Z(int i) {
        float f;
        float f2;
        View view = (View) this.f27839O.get();
        if (view != null && !this.f27841Q.isEmpty()) {
            int i2 = this.f27826B;
            if (i > i2 || i2 == mo23048b0()) {
                int i3 = this.f27826B;
                f = (float) (i3 - i);
                f2 = (float) (this.f27838N - i3);
            } else {
                int i4 = this.f27826B;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo23048b0());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f27841Q.size(); i5++) {
                this.f27841Q.get(i5).mo23075a(view, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public View mo23047a0(View view) {
        if (C3774v.m16182U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a0 = mo23047a0(viewGroup.getChildAt(i));
            if (a0 != null) {
                return a0;
            }
        }
        return null;
    }

    /* renamed from: b0 */
    public int mo23048b0() {
        if (this.f27850b) {
            return this.f27873y;
        }
        return Math.max(this.f27872x, this.f27865q ? 0 : this.f27867s);
    }

    /* renamed from: d0 */
    public boolean mo23049d0() {
        return this.f27861m;
    }

    /* renamed from: g */
    public void mo3057g(CoordinatorLayout.C0450e eVar) {
        super.mo3057g(eVar);
        this.f27839O = null;
        this.f27832H = null;
    }

    /* renamed from: h0 */
    public void mo23050h0(boolean z) {
        this.f27830F = z;
    }

    /* renamed from: i0 */
    public void mo23051i0(int i) {
        if (i >= 0) {
            this.f27872x = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: j */
    public void mo3060j() {
        super.mo3060j();
        this.f27839O = null;
        this.f27832H = null;
    }

    /* renamed from: j0 */
    public void mo23052j0(boolean z) {
        if (this.f27850b != z) {
            this.f27850b = z;
            if (this.f27839O != null) {
                m35505S();
            }
            mo23062t0((!this.f27850b || this.f27831G != 6) ? this.f27831G : 3);
            m35518z0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3061k(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f27830F
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m35514f0()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f27842R
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f27842R = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f27842R
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f27845U = r1
            r9.f27843S = r4
            boolean r11 = r9.f27833I
            if (r11 == 0) goto L_0x007f
            r9.f27833I = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f27844T = r7
            int r7 = r9.f27831G
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f27840P
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f27844T
            boolean r7 = r10.mo2998F(r7, r6, r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f27843S = r7
            r9.f27845U = r2
        L_0x006e:
            int r7 = r9.f27843S
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f27844T
            boolean r11 = r10.mo2998F(r11, r6, r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f27833I = r11
        L_0x007f:
            boolean r11 = r9.f27833I
            if (r11 != 0) goto L_0x008e
            e.j.a.c r11 = r9.f27832H
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo13292O(r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f27840P
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f27833I
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f27831G
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo2998F(r3, r11, r0)
            if (r10 != 0) goto L_0x00d1
            e.j.a.c r10 = r9.f27832H
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f27844T
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            e.j.a.c r11 = r9.f27832H
            int r11 = r11.mo13304z()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f27833I = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo3061k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k0 */
    public void mo23053k0(boolean z) {
        this.f27861m = z;
    }

    /* renamed from: l */
    public boolean mo3062l(CoordinatorLayout coordinatorLayout, V v, int i) {
        C7541h hVar;
        if (C3774v.m16236y(coordinatorLayout) && !C3774v.m16236y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f27839O == null) {
            this.f27855g = coordinatorLayout.getResources().getDimensionPixelSize(C7492d.design_bottom_sheet_peek_height_min);
            m35516u0(v);
            this.f27839O = new WeakReference<>(v);
            if (this.f27857i && (hVar = this.f27858j) != null) {
                C3774v.m16223r0(v, hVar);
            }
            C7541h hVar2 = this.f27858j;
            if (hVar2 != null) {
                float f = this.f27827C;
                if (f == -1.0f) {
                    f = C3774v.m16232w(v);
                }
                hVar2.mo28462Z(f);
                boolean z = this.f27831G == 3;
                this.f27869u = z;
                this.f27858j.mo28464b0(z ? 0.0f : 1.0f);
            }
            m35518z0();
            if (C3774v.m16238z(v) == 0) {
                C3774v.m16237y0(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.f27859k;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.f27859k;
                v.post(new C5933a(this, v, layoutParams));
            }
        }
        if (this.f27832H == null) {
            this.f27832H = C3808c.m16415p(coordinatorLayout, this.f27848X);
        }
        int top = v.getTop();
        coordinatorLayout.mo3001M(v, i);
        this.f27837M = coordinatorLayout.getWidth();
        this.f27838N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f27836L = height;
        int i3 = this.f27838N;
        int i4 = i3 - height;
        int i5 = this.f27867s;
        if (i4 < i5) {
            if (this.f27865q) {
                this.f27836L = i3;
            } else {
                this.f27836L = i3 - i5;
            }
        }
        this.f27873y = Math.max(0, i3 - this.f27836L);
        m35506T();
        m35505S();
        int i6 = this.f27831G;
        if (i6 == 3) {
            C3774v.m16187Z(v, mo23048b0());
        } else if (i6 == 6) {
            C3774v.m16187Z(v, this.f27874z);
        } else if (this.f27828D && i6 == 5) {
            C3774v.m16187Z(v, this.f27838N);
        } else if (i6 == 4) {
            C3774v.m16187Z(v, this.f27826B);
        } else if (i6 == 1 || i6 == 2) {
            C3774v.m16187Z(v, top - v.getTop());
        }
        this.f27840P = new WeakReference<>(mo23047a0(v));
        return true;
    }

    /* renamed from: l0 */
    public void mo23054l0(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f27825A = f;
        if (this.f27839O != null) {
            m35506T();
        }
    }

    /* renamed from: m0 */
    public void mo23055m0(boolean z) {
        if (this.f27828D != z) {
            this.f27828D = z;
            if (!z && this.f27831G == 5) {
                mo23061s0(4);
            }
            m35518z0();
        }
    }

    /* renamed from: n0 */
    public void mo23056n0(int i) {
        this.f27859k = i;
    }

    /* renamed from: o */
    public boolean mo3065o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f27840P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f27831G != 3 || super.mo3065o(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public void mo23057o0(int i) {
        mo23058p0(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23058p0(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f27854f
            if (r4 != 0) goto L_0x0015
            r3.f27854f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f27854f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f27853e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f27854f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f27853e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.m35490C0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo23058p0(int, boolean):void");
    }

    /* renamed from: q */
    public void mo3067q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f27840P;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo23048b0()) {
                        iArr[1] = top - mo23048b0();
                        C3774v.m16187Z(v, -iArr[1]);
                        mo23062t0(3);
                    } else if (this.f27830F) {
                        iArr[1] = i2;
                        C3774v.m16187Z(v, -i2);
                        mo23062t0(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f27826B;
                    if (i4 > i5 && !this.f27828D) {
                        iArr[1] = top - i5;
                        C3774v.m16187Z(v, -iArr[1]);
                        mo23062t0(4);
                    } else if (this.f27830F) {
                        iArr[1] = i2;
                        C3774v.m16187Z(v, -i2);
                        mo23062t0(1);
                    } else {
                        return;
                    }
                }
                mo23046Z(v.getTop());
                this.f27834J = i2;
                this.f27835K = true;
            }
        }
    }

    /* renamed from: q0 */
    public void mo23059q0(int i) {
        this.f27849a = i;
    }

    /* renamed from: r0 */
    public void mo23060r0(boolean z) {
        this.f27829E = z;
    }

    /* renamed from: s0 */
    public void mo23061s0(int i) {
        if (i != this.f27831G) {
            if (this.f27839O != null) {
                m35517w0(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f27828D && i == 5)) {
                this.f27831G = i;
            }
        }
    }

    /* renamed from: t */
    public void mo3070t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo23062t0(int i) {
        View view;
        if (this.f27831G != i) {
            this.f27831G = i;
            WeakReference<V> weakReference = this.f27839O;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m35489B0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m35489B0(false);
                }
                m35488A0(i);
                for (int i2 = 0; i2 < this.f27841Q.size(); i2++) {
                    this.f27841Q.get(i2).mo23076b(view, i);
                }
                m35518z0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo23063v0(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f27826B;
        } else if (i == 6) {
            int i4 = this.f27874z;
            if (!this.f27850b || i4 > (i3 = this.f27873y)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo23048b0();
        } else if (!this.f27828D || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f27838N;
        }
        mo23065y0(view, i, i2, false);
    }

    /* renamed from: x */
    public void mo3074x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo3074x(coordinatorLayout, v, savedState.mo3471a());
        m35515g0(savedState);
        int i = savedState.f27875i;
        if (i == 1 || i == 2) {
            this.f27831G = 4;
        } else {
            this.f27831G = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public boolean mo23064x0(View view, float f) {
        if (this.f27829E) {
            return true;
        }
        if (view.getTop() < this.f27826B) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f27826B)) / ((float) m35507U()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public Parcelable mo3075y(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo3075y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo23065y0(View view, int i, int i2, boolean z) {
        C3808c cVar = this.f27832H;
        if (cVar != null && (!z ? cVar.mo13293P(view, view.getLeft(), i2) : cVar.mo13291N(view.getLeft(), i2))) {
            mo23062t0(2);
            m35488A0(i);
            if (this.f27870v == null) {
                this.f27870v = new C5940h(view, i);
            }
            if (!this.f27870v.f27892h) {
                BottomSheetBehavior<V>.h hVar = this.f27870v;
                hVar.f27893i = i;
                C3774v.m16201g0(view, hVar);
                boolean unused = this.f27870v.f27892h = true;
                return;
            }
            this.f27870v.f27893i = i;
            return;
        }
        mo23062t0(i);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5932a();

        /* renamed from: i */
        final int f27875i;

        /* renamed from: j */
        int f27876j;

        /* renamed from: k */
        boolean f27877k;

        /* renamed from: l */
        boolean f27878l;

        /* renamed from: m */
        boolean f27879m;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C5932a implements Parcelable.ClassLoaderCreator<SavedState> {
            C5932a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27875i = parcel.readInt();
            this.f27876j = parcel.readInt();
            boolean z = false;
            this.f27877k = parcel.readInt() == 1;
            this.f27878l = parcel.readInt() == 1;
            this.f27879m = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27875i);
            parcel.writeInt(this.f27876j);
            parcel.writeInt(this.f27877k ? 1 : 0);
            parcel.writeInt(this.f27878l ? 1 : 0);
            parcel.writeInt(this.f27879m ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f27875i = bottomSheetBehavior.f27831G;
            this.f27876j = bottomSheetBehavior.f27853e;
            this.f27877k = bottomSheetBehavior.f27850b;
            this.f27878l = bottomSheetBehavior.f27828D;
            this.f27879m = bottomSheetBehavior.f27829E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f27856h = context.getResources().getDimensionPixelSize(C7492d.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.BottomSheetBehavior_Layout);
        this.f27857i = obtainStyledAttributes.hasValue(C7500l.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = C7500l.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            m35510X(context, attributeSet, hasValue, C7522c.m42014a(context, obtainStyledAttributes, i2));
        } else {
            m35509W(context, attributeSet, hasValue);
        }
        m35511Y();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f27827C = obtainStyledAttributes.getDimension(C7500l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        int i3 = C7500l.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo23056n0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C7500l.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo23057o0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            mo23057o0(i);
        }
        mo23055m0(obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo23053k0(obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo23052j0(obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo23060r0(obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo23050h0(obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo23059q0(obtainStyledAttributes.getInt(C7500l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo23054l0(obtainStyledAttributes.getFloat(C7500l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i5 = C7500l.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo23051i0(obtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        } else {
            mo23051i0(peekValue2.data);
        }
        this.f27862n = obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f27863o = obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f27864p = obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f27865q = obtainStyledAttributes.getBoolean(C7500l.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.f27852d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
