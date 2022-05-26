package p082e.p109h.p119p;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p082e.p109h.C3617d;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3746f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: e.h.p.v */
/* compiled from: ViewCompat */
public class C3774v {

    /* renamed from: a */
    private static final AtomicInteger f11831a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f11832b;

    /* renamed from: c */
    private static boolean f11833c;

    /* renamed from: d */
    private static Field f11834d;

    /* renamed from: e */
    private static boolean f11835e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f11836f;

    /* renamed from: g */
    private static WeakHashMap<View, C3790z> f11837g = null;

    /* renamed from: h */
    private static Field f11838h;

    /* renamed from: i */
    private static boolean f11839i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f11840j;

    /* renamed from: k */
    private static final int[] f11841k = {C3617d.accessibility_custom_action_0, C3617d.accessibility_custom_action_1, C3617d.accessibility_custom_action_2, C3617d.accessibility_custom_action_3, C3617d.accessibility_custom_action_4, C3617d.accessibility_custom_action_5, C3617d.accessibility_custom_action_6, C3617d.accessibility_custom_action_7, C3617d.accessibility_custom_action_8, C3617d.accessibility_custom_action_9, C3617d.accessibility_custom_action_10, C3617d.accessibility_custom_action_11, C3617d.accessibility_custom_action_12, C3617d.accessibility_custom_action_13, C3617d.accessibility_custom_action_14, C3617d.accessibility_custom_action_15, C3617d.accessibility_custom_action_16, C3617d.accessibility_custom_action_17, C3617d.accessibility_custom_action_18, C3617d.accessibility_custom_action_19, C3617d.accessibility_custom_action_20, C3617d.accessibility_custom_action_21, C3617d.accessibility_custom_action_22, C3617d.accessibility_custom_action_23, C3617d.accessibility_custom_action_24, C3617d.accessibility_custom_action_25, C3617d.accessibility_custom_action_26, C3617d.accessibility_custom_action_27, C3617d.accessibility_custom_action_28, C3617d.accessibility_custom_action_29, C3617d.accessibility_custom_action_30, C3617d.accessibility_custom_action_31};

    /* renamed from: e.h.p.v$a */
    /* compiled from: ViewCompat */
    class C3775a extends C3780f<Boolean> {
        C3775a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo13198d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo13199e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo13200h(Boolean bool, Boolean bool2) {
            return !mo13216a(bool, bool2);
        }
    }

    /* renamed from: e.h.p.v$b */
    /* compiled from: ViewCompat */
    class C3776b extends C3780f<CharSequence> {
        C3776b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo13198d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo13199e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo13200h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: e.h.p.v$c */
    /* compiled from: ViewCompat */
    class C3777c extends C3780f<CharSequence> {
        C3777c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo13198d(View view) {
            return view.getStateDescription();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo13199e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo13200h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: e.h.p.v$d */
    /* compiled from: ViewCompat */
    class C3778d extends C3780f<Boolean> {
        C3778d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo13198d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo13199e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo13200h(Boolean bool, Boolean bool2) {
            return !mo13216a(bool, bool2);
        }
    }

    /* renamed from: e.h.p.v$e */
    /* compiled from: ViewCompat */
    static class C3779e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: g */
        private WeakHashMap<View, Boolean> f11842g = new WeakHashMap<>();

        C3779e() {
        }

        /* renamed from: a */
        private void m16264a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C3774v.m16185X(view, z2 ? 16 : 32);
                this.f11842g.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m16265b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f11842g.entrySet()) {
                    m16264a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m16265b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: e.h.p.v$f */
    /* compiled from: ViewCompat */
    static abstract class C3780f<T> {

        /* renamed from: a */
        private final int f11843a;

        /* renamed from: b */
        private final Class<T> f11844b;

        /* renamed from: c */
        private final int f11845c;

        /* renamed from: d */
        private final int f11846d;

        C3780f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: b */
        private boolean m16266b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m16267c() {
            return Build.VERSION.SDK_INT >= this.f11845c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo13216a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo13198d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo13199e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo13217f(View view) {
            if (m16267c()) {
                return mo13198d(view);
            }
            if (!m16266b()) {
                return null;
            }
            T tag = view.getTag(this.f11843a);
            if (this.f11844b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo13218g(View view, T t) {
            if (m16267c()) {
                mo13199e(view, t);
            } else if (m16266b() && mo13200h(mo13217f(view), t)) {
                C3774v.m16157E(view);
                view.setTag(this.f11843a, t);
                C3774v.m16185X(view, this.f11846d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo13200h(T t, T t2);

        C3780f(int i, Class<T> cls, int i2, int i3) {
            this.f11843a = i;
            this.f11844b = cls;
            this.f11846d = i2;
            this.f11845c = i3;
        }
    }

    /* renamed from: e.h.p.v$g */
    /* compiled from: ViewCompat */
    private static class C3781g {

        /* renamed from: e.h.p.v$g$a */
        /* compiled from: ViewCompat */
        class C3782a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C3718d0 f11847a = null;

            /* renamed from: b */
            final /* synthetic */ View f11848b;

            /* renamed from: c */
            final /* synthetic */ C3769q f11849c;

            C3782a(View view, C3769q qVar) {
                this.f11848b = view;
                this.f11849c = qVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C3718d0 x = C3718d0.m15879x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C3781g.m16274a(windowInsets, this.f11848b);
                    if (x.equals(this.f11847a)) {
                        return this.f11849c.mo580a(view, x).mo13047v();
                    }
                }
                this.f11847a = x;
                C3718d0 a = this.f11849c.mo580a(view, x);
                if (i >= 30) {
                    return a.mo13047v();
                }
                C3774v.m16211l0(view);
                return a.mo13047v();
            }
        }

        /* renamed from: a */
        static void m16274a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C3617d.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C3718d0 m16275b(View view, C3718d0 d0Var, Rect rect) {
            WindowInsets v = d0Var.mo13047v();
            if (v != null) {
                return C3718d0.m15879x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return d0Var;
        }

        /* renamed from: c */
        public static C3718d0 m16276c(View view) {
            return C3718d0.C3719a.m15901a(view);
        }

        /* renamed from: d */
        static void m16277d(View view, C3769q qVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C3617d.tag_on_apply_window_listener, qVar);
            }
            if (qVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C3617d.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C3782a(view, qVar));
            }
        }
    }

    /* renamed from: e.h.p.v$h */
    /* compiled from: ViewCompat */
    private static class C3783h {
        /* renamed from: a */
        public static C3718d0 m16278a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C3718d0 w = C3718d0.m15878w(rootWindowInsets);
            w.mo13045t(w);
            w.mo13028d(view.getRootView());
            return w;
        }
    }

    /* renamed from: e.h.p.v$i */
    /* compiled from: ViewCompat */
    private static class C3784i {
        /* renamed from: a */
        static void m16279a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: e.h.p.v$j */
    /* compiled from: ViewCompat */
    public interface C3785j {
        /* renamed from: a */
        boolean mo13220a(View view, KeyEvent keyEvent);
    }

    /* renamed from: e.h.p.v$k */
    /* compiled from: ViewCompat */
    static class C3786k {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f11850d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f11851a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f11852b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f11853c = null;

        C3786k() {
        }

        /* renamed from: a */
        static C3786k m16281a(View view) {
            int i = C3617d.tag_unhandled_key_event_manager;
            C3786k kVar = (C3786k) view.getTag(i);
            if (kVar != null) {
                return kVar;
            }
            C3786k kVar2 = new C3786k();
            view.setTag(i, kVar2);
            return kVar2;
        }

        /* renamed from: c */
        private View m16282c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f11851a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m16282c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m16284e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m16283d() {
            if (this.f11852b == null) {
                this.f11852b = new SparseArray<>();
            }
            return this.f11852b;
        }

        /* renamed from: e */
        private boolean m16284e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C3617d.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C3785j) arrayList.get(size)).mo13220a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m16285g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f11851a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f11850d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f11851a == null) {
                        this.f11851a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f11850d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f11851a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f11851a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo13221b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m16285g();
            }
            View c = m16282c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m16283d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo13222f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f11853c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f11853c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m16283d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C3774v.m16180S(view)) {
                m16284e(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new C3779e();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: A */
    public static int m16149A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: A0 */
    public static void m16150A0(View view, Paint paint) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: B */
    public static int m16151B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: B0 */
    public static void m16152B0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: C */
    public static int m16153C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f11835e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f11834d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11835e = true;
        }
        Field field = f11834d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: C0 */
    public static void m16154C0(View view, C3769q qVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3781g.m16277d(view, qVar);
        }
    }

    /* renamed from: D */
    public static int m16155D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f11833c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f11832b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11833c = true;
        }
        Field field = f11832b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: D0 */
    public static void m16156D0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: E */
    static C3704a m16157E(View view) {
        C3704a l = m16210l(view);
        if (l == null) {
            l = new C3704a();
        }
        m16217o0(view, l);
        return l;
    }

    /* renamed from: E0 */
    public static void m16158E0(View view, C3771s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (sVar != null ? sVar.mo13197a() : null));
        }
    }

    /* renamed from: F */
    public static int m16159F(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: F0 */
    public static void m16160F0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: G */
    public static int m16161G(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: G0 */
    public static void m16162G0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f11836f == null) {
            f11836f = new WeakHashMap<>();
        }
        f11836f.put(view, str);
    }

    /* renamed from: H */
    public static ViewParent m16163H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    @Deprecated
    /* renamed from: H0 */
    public static void m16164H0(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: I */
    public static C3718d0 m16165I(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C3783h.m16278a(view);
        }
        if (i >= 21) {
            return C3781g.m16276c(view);
        }
        return null;
    }

    /* renamed from: I0 */
    public static void m16166I0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: J */
    public static final CharSequence m16167J(View view) {
        return m16170K0().mo13217f(view);
    }

    /* renamed from: J0 */
    private static void m16168J0(View view) {
        if (m16238z(view) == 0) {
            m16237y0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m16238z((View) parent) == 4) {
                m16237y0(view, 2);
                return;
            }
        }
    }

    /* renamed from: K */
    public static String m16169K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f11836f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: K0 */
    private static C3780f<CharSequence> m16170K0() {
        return new C3777c(C3617d.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: L */
    public static float m16171L(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: L0 */
    public static void m16172L0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C3763k) {
            ((C3763k) view).stopNestedScroll();
        }
    }

    /* renamed from: M */
    public static int m16173M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: M0 */
    private static void m16174M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: N */
    public static float m16175N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: O */
    public static boolean m16176O(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m16177P(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: Q */
    public static boolean m16178Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m16179R(View view) {
        Boolean f = m16188a().mo13217f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: S */
    public static boolean m16180S(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: T */
    public static boolean m16181T(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: U */
    public static boolean m16182U(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C3763k) {
            return ((C3763k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m16183V(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: W */
    public static boolean m16184W(View view) {
        Boolean f = m16215n0().mo13217f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: X */
    static void m16185X(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m16218p(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (m16216o(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m16218p(view));
                    m16168J0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m16218p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: Y */
    public static void m16186Y(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect x = m16234x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m16196e(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m16196e(view, i);
        }
    }

    /* renamed from: Z */
    public static void m16187Z(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect x = m16234x();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m16198f(view, i);
            if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(x);
            }
        } else {
            m16198f(view, i);
        }
    }

    /* renamed from: a */
    private static C3780f<Boolean> m16188a() {
        return new C3778d(C3617d.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static C3718d0 m16189a0(View view, C3718d0 d0Var) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = d0Var.mo13047v()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(v);
            if (!onApplyWindowInsets.equals(v)) {
                return C3718d0.m15879x(onApplyWindowInsets, view);
            }
        }
        return d0Var;
    }

    /* renamed from: b */
    public static int m16190b(View view, CharSequence charSequence, C3746f fVar) {
        int r = m16222r(view, charSequence);
        if (r != -1) {
            m16192c(view, new C3736c.C3737a(r, charSequence, fVar));
        }
        return r;
    }

    /* renamed from: b0 */
    public static void m16191b0(View view, C3736c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo13095H0());
    }

    /* renamed from: c */
    private static void m16192c(View view, C3736c.C3737a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m16157E(view);
            m16207j0(aVar.mo13156b(), view);
            m16220q(view).add(aVar);
            m16185X(view, 0);
        }
    }

    /* renamed from: c0 */
    private static C3780f<CharSequence> m16193c0() {
        return new C3776b(C3617d.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: d */
    public static C3790z m16194d(View view) {
        if (f11837g == null) {
            f11837g = new WeakHashMap<>();
        }
        C3790z zVar = f11837g.get(view);
        if (zVar != null) {
            return zVar;
        }
        C3790z zVar2 = new C3790z(view);
        f11837g.put(view, zVar2);
        return zVar2;
    }

    /* renamed from: d0 */
    public static boolean m16195d0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: e */
    private static void m16196e(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m16174M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m16174M0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m16197e0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: f */
    private static void m16198f(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m16174M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m16174M0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static void m16199f0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: g */
    public static C3718d0 m16200g(View view, C3718d0 d0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C3781g.m16275b(view, d0Var, rect) : d0Var;
    }

    /* renamed from: g0 */
    public static void m16201g0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: h */
    public static C3718d0 m16202h(View view, C3718d0 d0Var) {
        WindowInsets v;
        if (Build.VERSION.SDK_INT >= 21 && (v = d0Var.mo13047v()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(v);
            if (!dispatchApplyWindowInsets.equals(v)) {
                return C3718d0.m15879x(dispatchApplyWindowInsets, view);
            }
        }
        return d0Var;
    }

    /* renamed from: h0 */
    public static void m16203h0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: i */
    static boolean m16204i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3786k.m16281a(view).mo13221b(view, keyEvent);
    }

    /* renamed from: i0 */
    public static void m16205i0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m16207j0(i, view);
            m16185X(view, 0);
        }
    }

    /* renamed from: j */
    static boolean m16206j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3786k.m16281a(view).mo13222f(keyEvent);
    }

    /* renamed from: j0 */
    private static void m16207j0(int i, View view) {
        List<C3736c.C3737a> q = m16220q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).mo13156b() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    /* renamed from: k */
    public static int m16208k() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f11831a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: k0 */
    public static void m16209k0(View view, C3736c.C3737a aVar, CharSequence charSequence, C3746f fVar) {
        if (fVar == null && charSequence == null) {
            m16205i0(view, aVar.mo13156b());
        } else {
            m16192c(view, aVar.mo13155a(charSequence, fVar));
        }
    }

    /* renamed from: l */
    public static C3704a m16210l(View view) {
        View.AccessibilityDelegate m = m16212m(view);
        if (m == null) {
            return null;
        }
        if (m instanceof C3704a.C3705a) {
            return ((C3704a.C3705a) m).f11721a;
        }
        return new C3704a(m);
    }

    /* renamed from: l0 */
    public static void m16211l0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: m */
    private static View.AccessibilityDelegate m16212m(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        return m16214n(view);
    }

    /* renamed from: m0 */
    public static void m16213m0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3784i.m16279a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: n */
    private static View.AccessibilityDelegate m16214n(View view) {
        if (f11839i) {
            return null;
        }
        if (f11838h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f11838h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11839i = true;
                return null;
            }
        }
        try {
            Object obj = f11838h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f11839i = true;
            return null;
        }
    }

    /* renamed from: n0 */
    private static C3780f<Boolean> m16215n0() {
        return new C3775a(C3617d.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: o */
    public static int m16216o(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: o0 */
    public static void m16217o0(View view, C3704a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m16212m(view) instanceof C3704a.C3705a)) {
            aVar = new C3704a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo13000d();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: p */
    public static CharSequence m16218p(View view) {
        return m16193c0().mo13217f(view);
    }

    /* renamed from: p0 */
    public static void m16219p0(View view, boolean z) {
        m16188a().mo13218g(view, Boolean.valueOf(z));
    }

    /* renamed from: q */
    private static List<C3736c.C3737a> m16220q(View view) {
        int i = C3617d.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: q0 */
    public static void m16221q0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: r */
    private static int m16222r(View view, CharSequence charSequence) {
        List<C3736c.C3737a> q = m16220q(view);
        for (int i = 0; i < q.size(); i++) {
            if (TextUtils.equals(charSequence, q.get(i).mo13157c())) {
                return q.get(i).mo13156b();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f11841k;
            if (i2 >= iArr.length || i3 != -1) {
                return i3;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < q.size(); i5++) {
                z &= q.get(i5).mo13156b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: r0 */
    public static void m16223r0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: s */
    public static ColorStateList m16224s(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C3772t) {
            return ((C3772t) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m16225s0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3772t) {
            ((C3772t) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: t */
    public static PorterDuff.Mode m16226t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C3772t) {
            return ((C3772t) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: t0 */
    public static void m16227t0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C3772t) {
            ((C3772t) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: u */
    public static Rect m16228u(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m16229u0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: v */
    public static Display m16230v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m16180S(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m16231v0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: w */
    public static float m16232w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    @Deprecated
    /* renamed from: w0 */
    public static void m16233w0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: x */
    private static Rect m16234x() {
        if (f11840j == null) {
            f11840j = new ThreadLocal<>();
        }
        Rect rect = f11840j.get();
        if (rect == null) {
            rect = new Rect();
            f11840j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: x0 */
    public static void m16235x0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: y */
    public static boolean m16236y(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: y0 */
    public static void m16237y0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: z */
    public static int m16238z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: z0 */
    public static void m16239z0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }
}
