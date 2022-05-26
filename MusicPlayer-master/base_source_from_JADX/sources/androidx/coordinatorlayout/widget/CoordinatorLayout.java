package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p082e.p108g.C3611a;
import p082e.p108g.C3612b;
import p082e.p108g.C3613c;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p118o.C3700f;
import p082e.p109h.p118o.C3702h;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3765m;
import p082e.p109h.p119p.C3766n;
import p082e.p109h.p119p.C3768p;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;

public class CoordinatorLayout extends ViewGroup implements C3765m, C3766n {

    /* renamed from: A */
    static final String f2465A;

    /* renamed from: B */
    static final Class<?>[] f2466B = {Context.class, AttributeSet.class};

    /* renamed from: C */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f2467C = new ThreadLocal<>();

    /* renamed from: D */
    static final Comparator<View> f2468D;

    /* renamed from: E */
    private static final C3700f<Rect> f2469E = new C3702h(12);

    /* renamed from: g */
    private final List<View> f2470g;

    /* renamed from: h */
    private final C0453a<View> f2471h;

    /* renamed from: i */
    private final List<View> f2472i;

    /* renamed from: j */
    private final List<View> f2473j;

    /* renamed from: k */
    private Paint f2474k;

    /* renamed from: l */
    private final int[] f2475l;

    /* renamed from: m */
    private final int[] f2476m;

    /* renamed from: n */
    private boolean f2477n;

    /* renamed from: o */
    private boolean f2478o;

    /* renamed from: p */
    private int[] f2479p;

    /* renamed from: q */
    private View f2480q;

    /* renamed from: r */
    private View f2481r;

    /* renamed from: s */
    private C0451f f2482s;

    /* renamed from: t */
    private boolean f2483t;

    /* renamed from: u */
    private C3718d0 f2484u;

    /* renamed from: v */
    private boolean f2485v;

    /* renamed from: w */
    private Drawable f2486w;

    /* renamed from: x */
    ViewGroup.OnHierarchyChangeListener f2487x;

    /* renamed from: y */
    private C3769q f2488y;

    /* renamed from: z */
    private final C3768p f2489z;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        /* renamed from: A */
        public boolean mo3047A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo3076z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo3048B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo3049C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo3048B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo3050D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3051a(CoordinatorLayout coordinatorLayout, V v) {
            return mo3054d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo3052b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo3053c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo3054d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo3055e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C3718d0 mo3056f(CoordinatorLayout coordinatorLayout, V v, C3718d0 d0Var) {
            return d0Var;
        }

        /* renamed from: g */
        public void mo3057g(C0450e eVar) {
        }

        /* renamed from: h */
        public boolean mo3058h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo3059i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo3060j() {
        }

        /* renamed from: k */
        public boolean mo3061k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo3062l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3063m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3064n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3065o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo3066p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo3067q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo3066p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo3068r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo3069s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3068r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo3070t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3069s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo3071u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo3072v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo3071u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo3073w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo3074x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo3075y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo3076z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0446a implements C3769q {
        C0446a() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            CoordinatorLayout.this.mo3005a0(d0Var);
            return d0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0447b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C0448c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    private class C0449d implements ViewGroup.OnHierarchyChangeListener {
        C0449d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2487x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3000L(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2487x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    class C0451f implements ViewTreeObserver.OnPreDrawListener {
        C0451f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo3000L(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    static class C0452g implements Comparator<View> {
        C0452g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float N = C3774v.m16175N(view);
            float N2 = C3774v.m16175N(view2);
            if (N > N2) {
                return -1;
            }
            return N < N2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f2465A = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            f2468D = r0
            goto L_0x0021
        L_0x001f:
            f2468D = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f2466B = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f2467C = r0
            e.h.o.h r0 = new e.h.o.h
            r1 = 12
            r0.<init>(r1)
            f2469E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private int m2829A(int i) {
        int[] iArr = this.f2479p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: D */
    private void m2830D(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f2468D;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: E */
    private boolean m2831E(View view) {
        return this.f2471h.mo3114j(view);
    }

    /* renamed from: G */
    private void m2832G(View view, int i) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        Rect e = m2847e();
        e.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f2484u != null && C3774v.m16236y(this) && !C3774v.m16236y(view)) {
            e.left += this.f2484u.mo13036j();
            e.top += this.f2484u.mo13038l();
            e.right -= this.f2484u.mo13037k();
            e.bottom -= this.f2484u.mo13035i();
        }
        Rect e2 = m2847e();
        C3733e.m15971a(m2842W(eVar.f2495c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, i);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        m2839S(e);
        m2839S(e2);
    }

    /* renamed from: H */
    private void m2833H(View view, View view2, int i) {
        Rect e = m2847e();
        Rect e2 = m2847e();
        try {
            mo3045x(view2, e);
            mo3046y(view, i, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        } finally {
            m2839S(e);
            m2839S(e2);
        }
    }

    /* renamed from: I */
    private void m2834I(View view, int i, int i2) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        int b = C3733e.m15972b(m2843X(eVar.f2495c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int A = m2829A(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            A += measuredWidth / 2;
        } else if (i3 == 5) {
            A += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(A, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: J */
    private void m2835J(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C3774v.m16181T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0450e eVar = (C0450e) view.getLayoutParams();
            Behavior f = eVar.mo3092f();
            Rect e = m2847e();
            Rect e2 = m2847e();
            e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo3052b(this, view, e)) {
                e.set(e2);
            } else if (!e2.contains(e)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + e.toShortString() + " | Bounds:" + e2.toShortString());
            }
            m2839S(e2);
            if (e.isEmpty()) {
                m2839S(e);
                return;
            }
            int b = C3733e.m15972b(eVar.f2500h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (e.top - eVar.topMargin) - eVar.f2502j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m2845Z(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - e.bottom) - eVar.bottomMargin) + eVar.f2502j) < (i5 = rect.bottom)) {
                m2845Z(view, height - i5);
                z = true;
            }
            if (!z) {
                m2845Z(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (e.left - eVar.leftMargin) - eVar.f2501i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m2844Y(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - e.right) - eVar.rightMargin) + eVar.f2501i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m2844Y(view, width - i2);
            }
            if (!z3) {
                m2844Y(view, 0);
            }
            m2839S(e);
        }
    }

    /* renamed from: O */
    static Behavior m2836O(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f2465A;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = f2467C;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f2466B);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: P */
    private boolean m2837P(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f2472i;
        m2830D(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0450e eVar = (C0450e) view.getLayoutParams();
            Behavior f = eVar.mo3092f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo3061k(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo3050D(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f2480q = view;
                    }
                }
                boolean c = eVar.mo3089c();
                boolean i4 = eVar.mo3095i(this, view);
                z2 = i4 && !c;
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo3061k(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo3050D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: Q */
    private void m2838Q() {
        this.f2470g.clear();
        this.f2471h.mo3109c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0450e C = mo2997C(childAt);
            C.mo3090d(this, childAt);
            this.f2471h.mo3108b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (C.mo3088b(this, childAt, childAt2)) {
                        if (!this.f2471h.mo3110d(childAt2)) {
                            this.f2471h.mo3108b(childAt2);
                        }
                        this.f2471h.mo3107a(childAt2, childAt);
                    }
                }
            }
        }
        this.f2470g.addAll(this.f2471h.mo3113i());
        Collections.reverse(this.f2470g);
    }

    /* renamed from: S */
    private static void m2839S(Rect rect) {
        rect.setEmpty();
        f2469E.mo8512a(rect);
    }

    /* renamed from: U */
    private void m2840U(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior f = ((C0450e) childAt.getLayoutParams()).mo3092f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo3061k(this, childAt, obtain);
                } else {
                    f.mo3050D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0450e) getChildAt(i2).getLayoutParams()).mo3099m();
        }
        this.f2480q = null;
        this.f2477n = false;
    }

    /* renamed from: V */
    private static int m2841V(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: W */
    private static int m2842W(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: X */
    private static int m2843X(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: Y */
    private void m2844Y(View view, int i) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        int i2 = eVar.f2501i;
        if (i2 != i) {
            C3774v.m16186Y(view, i - i2);
            eVar.f2501i = i;
        }
    }

    /* renamed from: Z */
    private void m2845Z(View view, int i) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        int i2 = eVar.f2502j;
        if (i2 != i) {
            C3774v.m16187Z(view, i - i2);
            eVar.f2502j = i;
        }
    }

    /* renamed from: b0 */
    private void m2846b0() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C3774v.m16236y(this)) {
                if (this.f2488y == null) {
                    this.f2488y = new C0446a();
                }
                C3774v.m16154C0(this, this.f2488y);
                setSystemUiVisibility(1280);
                return;
            }
            C3774v.m16154C0(this, (C3769q) null);
        }
    }

    /* renamed from: e */
    private static Rect m2847e() {
        Rect b = f2469E.mo8513b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: g */
    private static int m2848g(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: h */
    private void m2849h(C0450e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: i */
    private C3718d0 m2850i(C3718d0 d0Var) {
        Behavior f;
        if (d0Var.mo13041p()) {
            return d0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C3774v.m16236y(childAt) && (f = ((C0450e) childAt.getLayoutParams()).mo3092f()) != null) {
                f.mo3056f(this, childAt, d0Var);
                if (d0Var.mo13041p()) {
                    break;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: z */
    private void m2851z(View view, int i, Rect rect, Rect rect2, C0450e eVar, int i2, int i3) {
        int i4;
        int i5;
        int b = C3733e.m15972b(m2841V(eVar.f2495c), i);
        int b2 = C3733e.m15972b(m2842W(eVar.f2496d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo2996B(View view, Rect rect) {
        rect.set(((C0450e) view.getLayoutParams()).mo3094h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C0450e mo2997C(View view) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        if (!eVar.f2494b) {
            if (view instanceof C0447b) {
                Behavior behavior = ((C0447b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo3100o(behavior);
                eVar.f2494b = true;
            } else {
                C0448c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0448c) cls.getAnnotation(C0448c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo3100o((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                eVar.f2494b = true;
            }
        }
        return eVar;
    }

    /* renamed from: F */
    public boolean mo2998F(View view, int i, int i2) {
        Rect e = m2847e();
        mo3045x(view, e);
        try {
            return e.contains(i, i2);
        } finally {
            m2839S(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo2999K(View view, int i) {
        Behavior f;
        View view2 = view;
        C0450e eVar = (C0450e) view.getLayoutParams();
        if (eVar.f2503k != null) {
            Rect e = m2847e();
            Rect e2 = m2847e();
            Rect e3 = m2847e();
            mo3045x(eVar.f2503k, e);
            boolean z = false;
            mo3041u(view2, false, e2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m2851z(view, i, e, e3, eVar, measuredWidth, measuredHeight);
            if (!(e3.left == e2.left && e3.top == e2.top)) {
                z = true;
            }
            m2849h(eVar, e3, measuredWidth, i2);
            int i3 = e3.left - e2.left;
            int i4 = e3.top - e2.top;
            if (i3 != 0) {
                C3774v.m16186Y(view2, i3);
            }
            if (i4 != 0) {
                C3774v.m16187Z(view2, i4);
            }
            if (z && (f = eVar.mo3092f()) != null) {
                f.mo3058h(this, view2, eVar.f2503k);
            }
            m2839S(e);
            m2839S(e2);
            m2839S(e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo3000L(int i) {
        boolean z;
        int i2 = i;
        int B = C3774v.m16151B(this);
        int size = this.f2470g.size();
        Rect e = m2847e();
        Rect e2 = m2847e();
        Rect e3 = m2847e();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f2470g.get(i3);
            C0450e eVar = (C0450e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.f2504l == this.f2470g.get(i4)) {
                        mo2999K(view, B);
                    }
                }
                mo3041u(view, true, e2);
                if (eVar.f2499g != 0 && !e2.isEmpty()) {
                    int b = C3733e.m15972b(eVar.f2499g, B);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        e.top = Math.max(e.top, e2.bottom);
                    } else if (i5 == 80) {
                        e.bottom = Math.max(e.bottom, getHeight() - e2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        e.left = Math.max(e.left, e2.right);
                    } else if (i6 == 5) {
                        e.right = Math.max(e.right, getWidth() - e2.left);
                    }
                }
                if (eVar.f2500h != 0 && view.getVisibility() == 0) {
                    m2835J(view, e, B);
                }
                if (i2 != 2) {
                    mo2996B(view, e3);
                    if (!e3.equals(e2)) {
                        mo3003R(view, e2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f2470g.get(i7);
                    C0450e eVar2 = (C0450e) view2.getLayoutParams();
                    Behavior f = eVar2.mo3092f();
                    if (f != null && f.mo3055e(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo3093g()) {
                            if (i2 != 2) {
                                z = f.mo3058h(this, view2, view);
                            } else {
                                f.mo3059i(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo3101p(z);
                            }
                        } else {
                            eVar2.mo3097k();
                        }
                    }
                }
            }
        }
        m2839S(e);
        m2839S(e2);
        m2839S(e3);
    }

    /* renamed from: M */
    public void mo3001M(View view, int i) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        if (!eVar.mo3087a()) {
            View view2 = eVar.f2503k;
            if (view2 != null) {
                m2833H(view, view2, i);
                return;
            }
            int i2 = eVar.f2497e;
            if (i2 >= 0) {
                m2834I(view, i2, i);
            } else {
                m2832G(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: N */
    public void mo3002N(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo3003R(View view, Rect rect) {
        ((C0450e) view.getLayoutParams()).mo3102q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3004T() {
        if (this.f2478o && this.f2482s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2482s);
        }
        this.f2483t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final C3718d0 mo3005a0(C3718d0 d0Var) {
        if (!C3698d.m15814a(this.f2484u, d0Var)) {
            this.f2484u = d0Var;
            boolean z = true;
            boolean z2 = d0Var != null && d0Var.mo13038l() > 0;
            this.f2485v = z2;
            if (z2 || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            m2850i(d0Var);
            requestLayout();
        }
        return d0Var;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0450e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        Behavior behavior = eVar.f2493a;
        if (behavior != null) {
            float d = behavior.mo3054d(this, view);
            if (d > 0.0f) {
                if (this.f2474k == null) {
                    this.f2474k = new Paint();
                }
                this.f2474k.setColor(eVar.f2493a.mo3053c(this, view));
                this.f2474k.setAlpha(m2848g(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f2474k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2486w;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3009f() {
        if (this.f2478o) {
            if (this.f2482s == null) {
                this.f2482s = new C0451f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2482s);
        }
        this.f2483t = true;
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m2838Q();
        return Collections.unmodifiableList(this.f2470g);
    }

    public final C3718d0 getLastWindowInsets() {
        return this.f2484u;
    }

    public int getNestedScrollAxes() {
        return this.f2489z.mo13188a();
    }

    public Drawable getStatusBarBackground() {
        return this.f2486w;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: j */
    public void mo1214j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior f;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0450e eVar = (C0450e) childAt.getLayoutParams();
                if (eVar.mo3096j(i5) && (f = eVar.mo3092f()) != null) {
                    int[] iArr2 = this.f2475l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3070t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2475l;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f2475l[1]);
                    } else {
                        i7 = Math.min(i9, this.f2475l[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo3000L(1);
        }
    }

    /* renamed from: k */
    public void mo1215k(View view, int i, int i2, int i3, int i4, int i5) {
        mo1214j(view, i, i2, i3, i4, 0, this.f2476m);
    }

    /* renamed from: l */
    public boolean mo1216l(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0450e eVar = (C0450e) childAt.getLayoutParams();
                Behavior f = eVar.mo3092f();
                if (f != null) {
                    boolean A = f.mo3047A(this, childAt, view, view2, i, i2);
                    z |= A;
                    eVar.mo3103r(i3, A);
                } else {
                    eVar.mo3103r(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: m */
    public void mo1217m(View view, View view2, int i, int i2) {
        Behavior f;
        this.f2489z.mo13190c(view, view2, i, i2);
        this.f2481r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0450e eVar = (C0450e) childAt.getLayoutParams();
            if (eVar.mo3096j(i2) && (f = eVar.mo3092f()) != null) {
                f.mo3072v(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: n */
    public void mo1218n(View view, int i) {
        this.f2489z.mo13192e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0450e eVar = (C0450e) childAt.getLayoutParams();
            if (eVar.mo3096j(i)) {
                Behavior f = eVar.mo3092f();
                if (f != null) {
                    f.mo3049C(this, childAt, view, i);
                }
                eVar.mo3098l(i);
                eVar.mo3097k();
            }
        }
        this.f2481r = null;
    }

    /* renamed from: o */
    public void mo1219o(View view, int i, int i2, int[] iArr, int i3) {
        Behavior f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0450e eVar = (C0450e) childAt.getLayoutParams();
                if (eVar.mo3096j(i3) && (f = eVar.mo3092f()) != null) {
                    int[] iArr2 = this.f2475l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3067q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2475l;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f2475l;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo3000L(1);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2840U(false);
        if (this.f2483t) {
            if (this.f2482s == null) {
                this.f2482s = new C0451f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2482s);
        }
        if (this.f2484u == null && C3774v.m16236y(this)) {
            C3774v.m16211l0(this);
        }
        this.f2478o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2840U(false);
        if (this.f2483t && this.f2482s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2482s);
        }
        View view = this.f2481r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2478o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2485v && this.f2486w != null) {
            C3718d0 d0Var = this.f2484u;
            int l = d0Var != null ? d0Var.mo13038l() : 0;
            if (l > 0) {
                this.f2486w.setBounds(0, 0, getWidth(), l);
                this.f2486w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m2840U(true);
        }
        boolean P = m2837P(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m2840U(true);
        }
        return P;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior f;
        int B = C3774v.m16151B(this);
        int size = this.f2470g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f2470g.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0450e) view.getLayoutParams()).mo3092f()) == null || !f.mo3062l(this, view, B))) {
                mo3001M(view, B);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo3063m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m2838Q()
            r30.mo3029q()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p082e.p109h.p119p.C3774v.m16151B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            e.h.p.d0 r3 = r7.f2484u
            if (r3 == 0) goto L_0x004b
            boolean r3 = p082e.p109h.p119p.C3774v.m16236y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f2470g
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f2470g
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0450e) r1
            int r0 = r1.f2497e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m2829A(r0)
            int r11 = r1.f2495c
            int r11 = m2843X(r11)
            int r11 = p082e.p109h.p119p.C3733e.m15972b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p082e.p109h.p119p.C3774v.m16236y(r20)
            if (r0 != 0) goto L_0x00f1
            e.h.p.d0 r0 = r7.f2484u
            int r0 = r0.mo13036j()
            e.h.p.d0 r2 = r7.f2484u
            int r2 = r2.mo13037k()
            int r0 = r0 + r2
            e.h.p.d0 r2 = r7.f2484u
            int r2 = r2.mo13038l()
            e.h.p.d0 r11 = r7.f2484u
            int r11 = r11.mo13035i()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mo3092f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3063m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo3002N(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0450e eVar = (C0450e) childAt.getLayoutParams();
                if (eVar.mo3096j(0) && (f3 = eVar.mo3092f()) != null) {
                    z2 |= f3.mo3064n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3000L(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0450e eVar = (C0450e) childAt.getLayoutParams();
                if (eVar.mo3096j(0) && (f3 = eVar.mo3092f()) != null) {
                    z |= f3.mo3065o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1219o(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1215k(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1217m(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        SparseArray<Parcelable> sparseArray = savedState.f2490i;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = mo2997C(childAt).mo3092f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo3074x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = ((C0450e) childAt.getLayoutParams()).mo3092f();
            if (!(id == -1 || f == null || (y = f.mo3075y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        savedState.f2490i = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1216l(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1218n(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2480q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m2837P(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f2480q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0450e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.mo3092f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f2480q
            boolean r6 = r6.mo3050D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f2480q
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m2840U(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo3028p(View view) {
        List g = this.f2471h.mo3111g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                Behavior f = ((C0450e) view2.getLayoutParams()).mo3092f();
                if (f != null) {
                    f.mo3058h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo3029q() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m2831E(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f2483t) {
            return;
        }
        if (z) {
            mo3009f();
        } else {
            mo3004T();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C0450e generateDefaultLayoutParams() {
        return new C0450e(-2, -2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior f = ((C0450e) view.getLayoutParams()).mo3092f();
        if (f == null || !f.mo3073w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f2477n) {
            m2840U(false);
            this.f2477n = true;
        }
    }

    /* renamed from: s */
    public C0450e generateLayoutParams(AttributeSet attributeSet) {
        return new C0450e(getContext(), attributeSet);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m2846b0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2487x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f2486w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2486w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2486w.setState(getDrawableState());
                }
                C0534a.m3287m(this.f2486w, C3774v.m16151B(this));
                this.f2486w.setVisible(getVisibility() == 0, false);
                this.f2486w.setCallback(this);
            }
            C3774v.m16197e0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0506a.m3152d(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2486w;
        if (drawable != null && drawable.isVisible() != z) {
            this.f2486w.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C0450e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0450e) {
            return new C0450e((C0450e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0450e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0450e(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3041u(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo3045x(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: v */
    public List<View> mo3042v(View view) {
        List<View> h = this.f2471h.mo3112h(view);
        this.f2473j.clear();
        if (h != null) {
            this.f2473j.addAll(h);
        }
        return this.f2473j;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2486w;
    }

    /* renamed from: w */
    public List<View> mo3044w(View view) {
        List g = this.f2471h.mo3111g(view);
        this.f2473j.clear();
        if (g != null) {
            this.f2473j.addAll(g);
        }
        return this.f2473j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo3045x(View view, Rect rect) {
        C0454b.m2945a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo3046y(View view, int i, Rect rect, Rect rect2) {
        C0450e eVar = (C0450e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m2851z(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        m2849h(eVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3611a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f2470g = new ArrayList();
        this.f2471h = new C0453a<>();
        this.f2472i = new ArrayList();
        this.f2473j = new ArrayList();
        this.f2475l = new int[2];
        this.f2476m = new int[2];
        this.f2489z = new C3768p(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C3613c.CoordinatorLayout, 0, C3612b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C3613c.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C3613c.CoordinatorLayout, attributeSet, typedArray, 0, C3612b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C3613c.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C3613c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f2479p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f2479p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f2479p;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f2486w = typedArray.getDrawable(C3613c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m2846b0();
        super.setOnHierarchyChangeListener(new C0449d());
        if (C3774v.m16238z(this) == 0) {
            C3774v.m16237y0(this, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0445a();

        /* renamed from: i */
        SparseArray<Parcelable> f2490i;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0445a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0445a() {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2490i = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2490i.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f2490i;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f2490i.keyAt(i2);
                parcelableArr[i2] = this.f2490i.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0450e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        Behavior f2493a;

        /* renamed from: b */
        boolean f2494b = false;

        /* renamed from: c */
        public int f2495c = 0;

        /* renamed from: d */
        public int f2496d = 0;

        /* renamed from: e */
        public int f2497e = -1;

        /* renamed from: f */
        int f2498f = -1;

        /* renamed from: g */
        public int f2499g = 0;

        /* renamed from: h */
        public int f2500h = 0;

        /* renamed from: i */
        int f2501i;

        /* renamed from: j */
        int f2502j;

        /* renamed from: k */
        View f2503k;

        /* renamed from: l */
        View f2504l;

        /* renamed from: m */
        private boolean f2505m;

        /* renamed from: n */
        private boolean f2506n;

        /* renamed from: o */
        private boolean f2507o;

        /* renamed from: p */
        private boolean f2508p;

        /* renamed from: q */
        final Rect f2509q = new Rect();

        public C0450e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: n */
        private void m2913n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f2498f);
            this.f2503k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f2504l = null;
                            this.f2503k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f2504l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f2504l = null;
                    this.f2503k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f2504l = null;
                this.f2503k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f2498f) + " to anchor view " + view);
            }
        }

        /* renamed from: s */
        private boolean m2914s(View view, int i) {
            int b = C3733e.m15972b(((C0450e) view.getLayoutParams()).f2499g, i);
            return b != 0 && (C3733e.m15972b(this.f2500h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m2915t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f2503k.getId() != this.f2498f) {
                return false;
            }
            View view2 = this.f2503k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f2504l = null;
                    this.f2503k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f2504l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo3087a() {
            return this.f2503k == null && this.f2498f != -1;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f2493a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3088b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f2504l
                if (r4 == r0) goto L_0x001b
                int r0 = p082e.p109h.p119p.C3774v.m16151B(r2)
                boolean r0 = r1.m2914s(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.f2493a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo3055e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0450e.mo3088b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3089c() {
            if (this.f2493a == null) {
                this.f2505m = false;
            }
            return this.f2505m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo3090d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f2498f == -1) {
                this.f2504l = null;
                this.f2503k = null;
                return null;
            }
            if (this.f2503k == null || !m2915t(view, coordinatorLayout)) {
                m2913n(view, coordinatorLayout);
            }
            return this.f2503k;
        }

        /* renamed from: e */
        public int mo3091e() {
            return this.f2498f;
        }

        /* renamed from: f */
        public Behavior mo3092f() {
            return this.f2493a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo3093g() {
            return this.f2508p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo3094h() {
            return this.f2509q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo3095i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f2505m;
            if (z) {
                return true;
            }
            Behavior behavior = this.f2493a;
            boolean a = (behavior != null ? behavior.mo3051a(coordinatorLayout, view) : false) | z;
            this.f2505m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo3096j(int i) {
            if (i == 0) {
                return this.f2506n;
            }
            if (i != 1) {
                return false;
            }
            return this.f2507o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo3097k() {
            this.f2508p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo3098l(int i) {
            mo3103r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo3099m() {
            this.f2505m = false;
        }

        /* renamed from: o */
        public void mo3100o(Behavior behavior) {
            Behavior behavior2 = this.f2493a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo3060j();
                }
                this.f2493a = behavior;
                this.f2494b = true;
                if (behavior != null) {
                    behavior.mo3057g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo3101p(boolean z) {
            this.f2508p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo3102q(Rect rect) {
            this.f2509q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo3103r(int i, boolean z) {
            if (i == 0) {
                this.f2506n = z;
            } else if (i == 1) {
                this.f2507o = z;
            }
        }

        C0450e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3613c.CoordinatorLayout_Layout);
            this.f2495c = obtainStyledAttributes.getInteger(C3613c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2498f = obtainStyledAttributes.getResourceId(C3613c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2496d = obtainStyledAttributes.getInteger(C3613c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2497e = obtainStyledAttributes.getInteger(C3613c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2499g = obtainStyledAttributes.getInt(C3613c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2500h = obtainStyledAttributes.getInt(C3613c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = C3613c.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f2494b = hasValue;
            if (hasValue) {
                this.f2493a = CoordinatorLayout.m2836O(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f2493a;
            if (behavior != null) {
                behavior.mo3057g(this);
            }
        }

        public C0450e(C0450e eVar) {
            super(eVar);
        }

        public C0450e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0450e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
