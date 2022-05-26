package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p124j.p125a.C3808c;

public class DrawerLayout extends ViewGroup {

    /* renamed from: Q */
    private static final int[] f2837Q = {16843828};

    /* renamed from: R */
    static final int[] f2838R = {16842931};

    /* renamed from: S */
    static final boolean f2839S;

    /* renamed from: T */
    private static final boolean f2840T;

    /* renamed from: A */
    private float f2841A;

    /* renamed from: B */
    private float f2842B;

    /* renamed from: C */
    private Drawable f2843C;

    /* renamed from: D */
    private Drawable f2844D;

    /* renamed from: E */
    private Drawable f2845E;

    /* renamed from: F */
    private CharSequence f2846F;

    /* renamed from: G */
    private CharSequence f2847G;

    /* renamed from: H */
    private Object f2848H;

    /* renamed from: I */
    private boolean f2849I;

    /* renamed from: J */
    private Drawable f2850J;

    /* renamed from: K */
    private Drawable f2851K;

    /* renamed from: L */
    private Drawable f2852L;

    /* renamed from: M */
    private Drawable f2853M;

    /* renamed from: N */
    private final ArrayList<View> f2854N;

    /* renamed from: O */
    private Rect f2855O;

    /* renamed from: P */
    private Matrix f2856P;

    /* renamed from: g */
    private final C0566c f2857g;

    /* renamed from: h */
    private float f2858h;

    /* renamed from: i */
    private int f2859i;

    /* renamed from: j */
    private int f2860j;

    /* renamed from: k */
    private float f2861k;

    /* renamed from: l */
    private Paint f2862l;

    /* renamed from: m */
    private final C3808c f2863m;

    /* renamed from: n */
    private final C3808c f2864n;

    /* renamed from: o */
    private final C0568e f2865o;

    /* renamed from: p */
    private final C0568e f2866p;

    /* renamed from: q */
    private int f2867q;

    /* renamed from: r */
    private boolean f2868r;

    /* renamed from: s */
    private boolean f2869s;

    /* renamed from: t */
    private int f2870t;

    /* renamed from: u */
    private int f2871u;

    /* renamed from: v */
    private int f2872v;

    /* renamed from: w */
    private int f2873w;

    /* renamed from: x */
    private boolean f2874x;

    /* renamed from: y */
    private C0567d f2875y;

    /* renamed from: z */
    private List<C0567d> f2876z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    class C0564a implements View.OnApplyWindowInsetsListener {
        C0564a(DrawerLayout drawerLayout) {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).mo3490R(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    class C0565b extends C3704a {

        /* renamed from: d */
        private final Rect f2886d = new Rect();

        C0565b() {
        }

        /* renamed from: n */
        private void m3499n(C3736c cVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m3448A(childAt)) {
                    cVar.mo13113c(childAt);
                }
            }
        }

        /* renamed from: o */
        private void m3500o(C3736c cVar, C3736c cVar2) {
            Rect rect = this.f2886d;
            cVar2.mo13130m(rect);
            cVar.mo13106X(rect);
            cVar2.mo13132n(rect);
            cVar.mo13107Y(rect);
            cVar.mo13093G0(cVar2.mo13101N());
            cVar.mo13140r0(cVar2.mo13147v());
            cVar.mo13114c0(cVar2.mo13136p());
            cVar.mo13121g0(cVar2.mo13139r());
            cVar.mo13125i0(cVar2.mo13090F());
            cVar.mo13116d0(cVar2.mo13088E());
            cVar.mo13128k0(cVar2.mo13092G());
            cVar.mo13129l0(cVar2.mo13094H());
            cVar.mo13105V(cVar2.mo13082B());
            cVar.mo13154z0(cVar2.mo13099L());
            cVar.mo13135o0(cVar2.mo13096I());
            cVar.mo13109a(cVar2.mo13127k());
        }

        /* renamed from: a */
        public boolean mo3553a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence s;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3553a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View p = DrawerLayout.this.mo3531p();
            if (p == null || (s = DrawerLayout.this.mo3536s(DrawerLayout.this.mo3544t(p))) == null) {
                return true;
            }
            text.add(s);
            return true;
        }

        /* renamed from: f */
        public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3426f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            if (DrawerLayout.f2839S) {
                super.mo3427g(view, cVar);
            } else {
                C3736c Q = C3736c.m15979Q(cVar);
                super.mo3427g(view, Q);
                cVar.mo13083B0(view);
                ViewParent H = C3774v.m16163H(view);
                if (H instanceof View) {
                    cVar.mo13144t0((View) H);
                }
                m3500o(cVar, Q);
                Q.mo13103S();
                m3499n(cVar, (ViewGroup) view);
            }
            cVar.mo13114c0(DrawerLayout.class.getName());
            cVar.mo13128k0(false);
            cVar.mo13129l0(false);
            cVar.mo13104T(C3736c.C3737a.f11792e);
            cVar.mo13104T(C3736c.C3737a.f11793f);
        }

        /* renamed from: i */
        public boolean mo3554i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f2839S || DrawerLayout.m3448A(view)) {
                return super.mo3554i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    static final class C0566c extends C3704a {
        C0566c() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            if (!DrawerLayout.m3448A(view)) {
                cVar.mo13144t0((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public interface C0567d {
        /* renamed from: a */
        void mo616a(View view);

        /* renamed from: b */
        void mo617b(View view);

        /* renamed from: c */
        void mo618c(int i);

        /* renamed from: d */
        void mo619d(View view, float f);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    private class C0568e extends C3808c.C3811c {

        /* renamed from: a */
        private final int f2888a;

        /* renamed from: b */
        private C3808c f2889b;

        /* renamed from: c */
        private final Runnable f2890c = new C0569a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e$a */
        class C0569a implements Runnable {
            C0569a() {
            }

            public void run() {
                C0568e.this.mo3566o();
            }
        }

        C0568e(int i) {
            this.f2888a = i;
        }

        /* renamed from: n */
        private void m3510n() {
            int i = 3;
            if (this.f2888a == 3) {
                i = 5;
            }
            View n = DrawerLayout.this.mo3517n(i);
            if (n != null) {
                DrawerLayout.this.mo3505f(n);
            }
        }

        /* renamed from: a */
        public int mo3555a(View view, int i, int i2) {
            if (DrawerLayout.this.mo3498c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public int mo3556b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3557d(View view) {
            if (DrawerLayout.this.mo3481D(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo3558f(int i, int i2) {
            View view;
            if ((i & 1) == 1) {
                view = DrawerLayout.this.mo3517n(3);
            } else {
                view = DrawerLayout.this.mo3517n(5);
            }
            if (view != null && DrawerLayout.this.mo3533r(view) == 0) {
                this.f2889b.mo13297c(view, i2);
            }
        }

        /* renamed from: g */
        public boolean mo3559g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo3560h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f2890c, 160);
        }

        /* renamed from: i */
        public void mo3561i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f2879c = false;
            m3510n();
        }

        /* renamed from: j */
        public void mo3562j(int i) {
            DrawerLayout.this.mo3493V(this.f2888a, i, this.f2889b.mo13302w());
        }

        /* renamed from: k */
        public void mo3563k(View view, int i, int i2, int i3, int i4) {
            float f;
            int width = view.getWidth();
            if (DrawerLayout.this.mo3498c(view, 3)) {
                f = (float) (i + width);
            } else {
                f = (float) (DrawerLayout.this.getWidth() - i);
            }
            float f2 = f / ((float) width);
            DrawerLayout.this.mo3492T(view, f2);
            view.setVisibility(f2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo3564l(View view, float f, float f2) {
            int i;
            float u = DrawerLayout.this.mo3545u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo3498c(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && u > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && u > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f2889b.mo13291N(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo3565m(View view, int i) {
            return DrawerLayout.this.mo3481D(view) && DrawerLayout.this.mo3498c(view, this.f2888a) && DrawerLayout.this.mo3533r(view) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo3566o() {
            View view;
            int i;
            int x = this.f2889b.mo13303x();
            int i2 = 0;
            boolean z = this.f2888a == 3;
            if (z) {
                view = DrawerLayout.this.mo3517n(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + x;
            } else {
                view = DrawerLayout.this.mo3517n(5);
                i = DrawerLayout.this.getWidth() - x;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo3533r(view) == 0) {
                this.f2889b.mo13293P(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f2879c = true;
                DrawerLayout.this.invalidate();
                m3510n();
                DrawerLayout.this.mo3497b();
            }
        }

        /* renamed from: p */
        public void mo3567p() {
            DrawerLayout.this.removeCallbacks(this.f2890c);
        }

        /* renamed from: q */
        public void mo3568q(C3808c cVar) {
            this.f2889b = cVar;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        f2839S = i >= 19;
        if (i < 21) {
            z = false;
        }
        f2840T = z;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    static boolean m3448A(View view) {
        return (C3774v.m16238z(view) == 4 || C3774v.m16238z(view) == 2) ? false : true;
    }

    /* renamed from: G */
    private boolean m3449G(float f, float f2, View view) {
        if (this.f2855O == null) {
            this.f2855O = new Rect();
        }
        view.getHitRect(this.f2855O);
        return this.f2855O.contains((int) f, (int) f2);
    }

    /* renamed from: H */
    private boolean m3450H(Drawable drawable, int i) {
        if (drawable == null || !C0534a.m3282h(drawable)) {
            return false;
        }
        C0534a.m3287m(drawable, i);
        return true;
    }

    /* renamed from: O */
    private Drawable m3451O() {
        int B = C3774v.m16151B(this);
        if (B == 0) {
            Drawable drawable = this.f2850J;
            if (drawable != null) {
                m3450H(drawable, B);
                return this.f2850J;
            }
        } else {
            Drawable drawable2 = this.f2851K;
            if (drawable2 != null) {
                m3450H(drawable2, B);
                return this.f2851K;
            }
        }
        return this.f2852L;
    }

    /* renamed from: P */
    private Drawable m3452P() {
        int B = C3774v.m16151B(this);
        if (B == 0) {
            Drawable drawable = this.f2851K;
            if (drawable != null) {
                m3450H(drawable, B);
                return this.f2851K;
            }
        } else {
            Drawable drawable2 = this.f2850J;
            if (drawable2 != null) {
                m3450H(drawable2, B);
                return this.f2850J;
            }
        }
        return this.f2853M;
    }

    /* renamed from: Q */
    private void m3453Q() {
        if (!f2840T) {
            this.f2844D = m3451O();
            this.f2845E = m3452P();
        }
    }

    /* renamed from: U */
    private void m3454U(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo3481D(childAt)) && (!z || childAt != view)) {
                C3774v.m16237y0(childAt, 4);
            } else {
                C3774v.m16237y0(childAt, 1);
            }
        }
    }

    /* renamed from: m */
    private boolean m3455m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent v = m3456v(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(v);
            v.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: v */
    private MotionEvent m3456v(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f2856P == null) {
                this.f2856P = new Matrix();
            }
            matrix.invert(this.f2856P);
            obtain.transform(this.f2856P);
        }
        return obtain;
    }

    /* renamed from: w */
    static String m3457w(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: x */
    private static boolean m3458x(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m3459y() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f2879c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    private boolean m3460z() {
        return mo3531p() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public boolean mo3479B(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2877a == 0;
    }

    /* renamed from: C */
    public boolean mo3480C(View view) {
        if (mo3481D(view)) {
            return (((LayoutParams) view.getLayoutParams()).f2880d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo3481D(View view) {
        int b = C3733e.m15972b(((LayoutParams) view.getLayoutParams()).f2877a, C3774v.m16151B(view));
        return ((b & 3) == 0 && (b & 5) == 0) ? false : true;
    }

    /* renamed from: E */
    public boolean mo3482E(int i) {
        View n = mo3517n(i);
        if (n != null) {
            return mo3483F(n);
        }
        return false;
    }

    /* renamed from: F */
    public boolean mo3483F(View view) {
        if (mo3481D(view)) {
            return ((LayoutParams) view.getLayoutParams()).f2878b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo3484I(View view, float f) {
        float u = mo3545u(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (u * width));
        if (!mo3498c(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo3492T(view, f);
    }

    /* renamed from: J */
    public void mo3485J(int i) {
        mo3486K(i, true);
    }

    /* renamed from: K */
    public void mo3486K(int i, boolean z) {
        View n = mo3517n(i);
        if (n != null) {
            mo3488M(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3457w(i));
    }

    /* renamed from: L */
    public void mo3487L(View view) {
        mo3488M(view, true);
    }

    /* renamed from: M */
    public void mo3488M(View view, boolean z) {
        if (mo3481D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2869s) {
                layoutParams.f2878b = 1.0f;
                layoutParams.f2880d = 1;
                m3454U(view, true);
            } else if (z) {
                layoutParams.f2880d |= 2;
                if (mo3498c(view, 3)) {
                    this.f2863m.mo13293P(view, 0, view.getTop());
                } else {
                    this.f2864n.mo13293P(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo3484I(view, 1.0f);
                mo3493V(layoutParams.f2877a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: N */
    public void mo3489N(C0567d dVar) {
        List<C0567d> list;
        if (dVar != null && (list = this.f2876z) != null) {
            list.remove(dVar);
        }
    }

    /* renamed from: R */
    public void mo3490R(Object obj, boolean z) {
        this.f2848H = obj;
        this.f2849I = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    /* renamed from: S */
    public void mo3491S(int i, int i2) {
        View n;
        int b = C3733e.m15972b(i2, C3774v.m16151B(this));
        if (i2 == 3) {
            this.f2870t = i;
        } else if (i2 == 5) {
            this.f2871u = i;
        } else if (i2 == 8388611) {
            this.f2872v = i;
        } else if (i2 == 8388613) {
            this.f2873w = i;
        }
        if (i != 0) {
            (b == 3 ? this.f2863m : this.f2864n).mo13296b();
        }
        if (i == 1) {
            View n2 = mo3517n(b);
            if (n2 != null) {
                mo3505f(n2);
            }
        } else if (i == 2 && (n = mo3517n(b)) != null) {
            mo3487L(n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo3492T(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f2878b) {
            layoutParams.f2878b = f;
            mo3516l(view, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo3493V(int i, int i2, View view) {
        int A = this.f2863m.mo13283A();
        int A2 = this.f2864n.mo13283A();
        int i3 = 2;
        if (A == 1 || A2 == 1) {
            i3 = 1;
        } else if (!(A == 2 || A2 == 2)) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f2878b;
            if (f == 0.0f) {
                mo3514j(view);
            } else if (f == 1.0f) {
                mo3515k(view);
            }
        }
        if (i3 != this.f2867q) {
            this.f2867q = i3;
            List<C0567d> list = this.f2876z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2876z.get(size).mo618c(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3494a(C0567d dVar) {
        if (dVar != null) {
            if (this.f2876z == null) {
                this.f2876z = new ArrayList();
            }
            this.f2876z.add(dVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo3481D(childAt)) {
                    this.f2854N.add(childAt);
                } else if (mo3480C(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f2854N.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f2854N.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f2854N.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo3518o() != null || mo3481D(view)) {
            C3774v.m16237y0(view, 4);
        } else {
            C3774v.m16237y0(view, 1);
        }
        if (!f2839S) {
            C3774v.m16217o0(view, this.f2857g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3497b() {
        if (!this.f2874x) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f2874x = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo3498c(View view, int i) {
        return (mo3544t(view) & i) == i;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f2878b);
        }
        this.f2861k = f;
        boolean n = this.f2863m.mo13300n(true);
        boolean n2 = this.f2864n.mo13300n(true);
        if (n || n2) {
            C3774v.m16197e0(this);
        }
    }

    /* renamed from: d */
    public void mo3501d(int i) {
        mo3504e(i, true);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2861k <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (m3449G(x, y, childAt) && !mo3479B(childAt) && m3455m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean B = mo3479B(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (B) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m3458x(childAt) && mo3481D(childAt) && childAt.getHeight() >= height) {
                    if (mo3498c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f2861k;
        if (f > 0.0f && B) {
            int i4 = this.f2860j;
            this.f2862l.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f2862l);
        } else if (this.f2844D != null && mo3498c(view2, 3)) {
            int intrinsicWidth = this.f2844D.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f2863m.mo13303x()), 1.0f));
            this.f2844D.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f2844D.setAlpha((int) (max * 255.0f));
            this.f2844D.draw(canvas);
        } else if (this.f2845E != null && mo3498c(view2, 5)) {
            int intrinsicWidth2 = this.f2845E.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f2864n.mo13303x()), 1.0f));
            this.f2845E.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f2845E.setAlpha((int) (max2 * 255.0f));
            this.f2845E.draw(canvas);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo3504e(int i, boolean z) {
        View n = mo3517n(i);
        if (n != null) {
            mo3506g(n, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3457w(i));
    }

    /* renamed from: f */
    public void mo3505f(View view) {
        mo3506g(view, true);
    }

    /* renamed from: g */
    public void mo3506g(View view, boolean z) {
        if (mo3481D(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f2869s) {
                layoutParams.f2878b = 0.0f;
                layoutParams.f2880d = 0;
            } else if (z) {
                layoutParams.f2880d |= 4;
                if (mo3498c(view, 3)) {
                    this.f2863m.mo13293P(view, -view.getWidth(), view.getTop());
                } else {
                    this.f2864n.mo13293P(view, getWidth(), view.getTop());
                }
            } else {
                mo3484I(view, 0.0f);
                mo3493V(layoutParams.f2877a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f2840T) {
            return this.f2858h;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f2843C;
    }

    /* renamed from: h */
    public void mo3512h() {
        mo3513i(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo3513i(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo3481D(childAt) && (!z || layoutParams.f2879c)) {
                int width = childAt.getWidth();
                if (mo3498c(childAt, 3)) {
                    z2 = this.f2863m.mo13293P(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.f2864n.mo13293P(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.f2879c = false;
            }
        }
        this.f2865o.mo3567p();
        this.f2866p.mo3567p();
        if (z3) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo3514j(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f2880d & 1) == 1) {
            layoutParams.f2880d = 0;
            List<C0567d> list = this.f2876z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2876z.get(size).mo617b(view);
                }
            }
            m3454U(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3515k(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f2880d & 1) == 0) {
            layoutParams.f2880d = 1;
            List<C0567d> list = this.f2876z;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f2876z.get(size).mo616a(view);
                }
            }
            m3454U(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3516l(View view, float f) {
        List<C0567d> list = this.f2876z;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f2876z.get(size).mo619d(view, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public View mo3517n(int i) {
        int b = C3733e.m15972b(i, C3774v.m16151B(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo3544t(childAt) & 7) == b) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public View mo3518o() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f2880d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2869s = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2869s = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r4.f2848H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.f2849I
            if (r0 == 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r4.f2843C
            if (r0 == 0) goto L_0x002e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            r2 = 0
            if (r0 < r1) goto L_0x001d
            java.lang.Object r0 = r4.f2848H
            if (r0 == 0) goto L_0x001d
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r1 = r4.f2843C
            int r3 = r4.getWidth()
            r1.setBounds(r2, r2, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.f2843C
            r0.draw(r5)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onDraw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f2863m.mo13301u((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            e.j.a.c r1 = r6.f2863m
            boolean r1 = r1.mo13292O(r7)
            e.j.a.c r2 = r6.f2864n
            boolean r2 = r2.mo13292O(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            e.j.a.c r7 = r6.f2863m
            boolean r7 = r7.mo13298e(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f2865o
            r7.mo3567p()
            androidx.drawerlayout.widget.DrawerLayout$e r7 = r6.f2866p
            r7.mo3567p()
            goto L_0x0036
        L_0x0031:
            r6.mo3513i(r2)
            r6.f2874x = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2841A = r0
            r6.f2842B = r7
            float r4 = r6.f2861k
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            e.j.a.c r4 = r6.f2863m
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo13301u(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.mo3479B(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f2874x = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.m3459y()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f2874x
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m3460z()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View p = mo3531p();
        if (p != null && mo3533r(p) == 0) {
            mo3512h();
        }
        return p != null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        this.f2868r = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo3479B(childAt)) {
                    int i8 = layoutParams.leftMargin;
                    childAt.layout(i8, layoutParams.topMargin, childAt.getMeasuredWidth() + i8, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo3498c(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f2878b * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.f2878b * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != layoutParams.f2878b;
                    int i10 = layoutParams.f2877a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = layoutParams.topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = layoutParams.bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = layoutParams.topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - layoutParams.bottomMargin);
                    }
                    if (z2) {
                        mo3492T(childAt, f);
                    }
                    int i18 = layoutParams.f2878b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        this.f2868r = false;
        this.f2869s = false;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f2848H != null && C3774v.m16236y(this);
        int B = C3774v.m16151B(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int b = C3733e.m15972b(layoutParams.f2877a, B);
                    if (C3774v.m16236y(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.f2848H;
                            if (b == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (b == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.f2848H;
                        if (b == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (b == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (mo3479B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo3481D(childAt)) {
                    if (f2840T) {
                        float w = C3774v.m16232w(childAt);
                        float f = this.f2858h;
                        if (w != f) {
                            C3774v.m16231v0(childAt, f);
                        }
                    }
                    int t = mo3544t(childAt) & 7;
                    boolean z4 = t == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f2859i + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m3457w(t) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View n;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        int i = savedState.f2881i;
        if (!(i == 0 || (n = mo3517n(i)) == null)) {
            mo3487L(n);
        }
        int i2 = savedState.f2882j;
        if (i2 != 3) {
            mo3491S(i2, 3);
        }
        int i3 = savedState.f2883k;
        if (i3 != 3) {
            mo3491S(i3, 5);
        }
        int i4 = savedState.f2884l;
        if (i4 != 3) {
            mo3491S(i4, 8388611);
        }
        int i5 = savedState.f2885m;
        if (i5 != 3) {
            mo3491S(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m3453Q();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f2880d;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.f2881i = layoutParams.f2877a;
            } else {
                i++;
            }
        }
        savedState.f2882j = this.f2870t;
        savedState.f2883k = this.f2871u;
        savedState.f2884l = this.f2872v;
        savedState.f2885m = this.f2873w;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (mo3533r(r7) != 2) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            e.j.a.c r0 = r6.f2863m
            r0.mo13287F(r7)
            e.j.a.c r0 = r6.f2864n
            r0.mo13287F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x0070
        L_0x001a:
            r6.mo3513i(r2)
            r6.f2874x = r1
            goto L_0x0070
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            e.j.a.c r3 = r6.f2863m
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo13301u(r4, r5)
            if (r3 == 0) goto L_0x005d
            boolean r3 = r6.mo3479B(r3)
            if (r3 == 0) goto L_0x005d
            float r3 = r6.f2841A
            float r0 = r0 - r3
            float r3 = r6.f2842B
            float r7 = r7 - r3
            e.j.a.c r3 = r6.f2863m
            int r3 = r3.mo13304z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005d
            android.view.View r7 = r6.mo3518o()
            if (r7 == 0) goto L_0x005d
            int r7 = r6.mo3533r(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005e
        L_0x005d:
            r1 = 1
        L_0x005e:
            r6.mo3513i(r1)
            goto L_0x0070
        L_0x0062:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f2841A = r0
            r6.f2842B = r7
            r6.f2874x = r1
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public View mo3531p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo3481D(childAt) && mo3483F(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public int mo3532q(int i) {
        int B = C3774v.m16151B(this);
        if (i == 3) {
            int i2 = this.f2870t;
            if (i2 != 3) {
                return i2;
            }
            int i3 = B == 0 ? this.f2872v : this.f2873w;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f2871u;
            if (i4 != 3) {
                return i4;
            }
            int i5 = B == 0 ? this.f2873w : this.f2872v;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f2872v;
            if (i6 != 3) {
                return i6;
            }
            int i7 = B == 0 ? this.f2870t : this.f2871u;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f2873w;
            if (i8 != 3) {
                return i8;
            }
            int i9 = B == 0 ? this.f2871u : this.f2870t;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    /* renamed from: r */
    public int mo3533r(View view) {
        if (mo3481D(view)) {
            return mo3532q(((LayoutParams) view.getLayoutParams()).f2877a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo3513i(true);
        }
    }

    public void requestLayout() {
        if (!this.f2868r) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public CharSequence mo3536s(int i) {
        int b = C3733e.m15972b(i, C3774v.m16151B(this));
        if (b == 3) {
            return this.f2846F;
        }
        if (b == 5) {
            return this.f2847G;
        }
        return null;
    }

    public void setDrawerElevation(float f) {
        this.f2858h = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo3481D(childAt)) {
                C3774v.m16231v0(childAt, this.f2858h);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0567d dVar) {
        C0567d dVar2 = this.f2875y;
        if (dVar2 != null) {
            mo3489N(dVar2);
        }
        if (dVar != null) {
            mo3494a(dVar);
        }
        this.f2875y = dVar;
    }

    public void setDrawerLockMode(int i) {
        mo3491S(i, 3);
        mo3491S(i, 5);
    }

    public void setScrimColor(int i) {
        this.f2860j = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f2843C = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.f2843C = new ColorDrawable(i);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo3544t(View view) {
        return C3733e.m15972b(((LayoutParams) view.getLayoutParams()).f2877a, C3774v.m16151B(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo3545u(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2878b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2857g = new C0566c();
        this.f2860j = -1728053248;
        this.f2862l = new Paint();
        this.f2869s = true;
        this.f2870t = 3;
        this.f2871u = 3;
        this.f2872v = 3;
        this.f2873w = 3;
        this.f2850J = null;
        this.f2851K = null;
        this.f2852L = null;
        this.f2853M = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f2859i = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        C0568e eVar = new C0568e(3);
        this.f2865o = eVar;
        C0568e eVar2 = new C0568e(5);
        this.f2866p = eVar2;
        C3808c o = C3808c.m16414o(this, 1.0f, eVar);
        this.f2863m = o;
        o.mo13289L(1);
        o.mo13290M(f2);
        eVar.mo3568q(o);
        C3808c o2 = C3808c.m16414o(this, 1.0f, eVar2);
        this.f2864n = o2;
        o2.mo13289L(2);
        o2.mo13290M(f2);
        eVar2.mo3568q(o2);
        setFocusableInTouchMode(true);
        C3774v.m16237y0(this, 1);
        C3774v.m16217o0(this, new C0565b());
        setMotionEventSplittingEnabled(false);
        if (C3774v.m16236y(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new C0564a(this));
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2837Q);
                try {
                    this.f2843C = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.f2843C = null;
            }
        }
        this.f2858h = f * 10.0f;
        this.f2854N = new ArrayList<>();
    }

    public void setStatusBarBackground(int i) {
        this.f2843C = i != 0 ? C0506a.m3152d(getContext(), i) : null;
        invalidate();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f2877a = 0;

        /* renamed from: b */
        float f2878b;

        /* renamed from: c */
        boolean f2879c;

        /* renamed from: d */
        int f2880d;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f2838R);
            this.f2877a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f2877a = layoutParams.f2877a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0563a();

        /* renamed from: i */
        int f2881i = 0;

        /* renamed from: j */
        int f2882j;

        /* renamed from: k */
        int f2883k;

        /* renamed from: l */
        int f2884l;

        /* renamed from: m */
        int f2885m;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        static class C0563a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0563a() {
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
            this.f2881i = parcel.readInt();
            this.f2882j = parcel.readInt();
            this.f2883k = parcel.readInt();
            this.f2884l = parcel.readInt();
            this.f2885m = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2881i);
            parcel.writeInt(this.f2882j);
            parcel.writeInt(this.f2883k);
            parcel.writeInt(this.f2884l);
            parcel.writeInt(this.f2885m);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
