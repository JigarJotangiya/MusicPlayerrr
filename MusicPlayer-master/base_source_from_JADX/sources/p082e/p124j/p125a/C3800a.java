package p082e.p124j.p125a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p082e.p098e.C3479h;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3789y;
import p082e.p109h.p119p.p120e0.C3735b;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3741d;
import p082e.p109h.p119p.p120e0.C3745e;
import p082e.p124j.p125a.C3804b;

/* renamed from: e.j.a.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C3800a extends C3704a {

    /* renamed from: n */
    private static final Rect f11879n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C3804b.C3805a<C3736c> f11880o = new C3801a();

    /* renamed from: p */
    private static final C3804b.C3806b<C3479h<C3736c>, C3736c> f11881p = new C3802b();

    /* renamed from: d */
    private final Rect f11882d = new Rect();

    /* renamed from: e */
    private final Rect f11883e = new Rect();

    /* renamed from: f */
    private final Rect f11884f = new Rect();

    /* renamed from: g */
    private final int[] f11885g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f11886h;

    /* renamed from: i */
    private final View f11887i;

    /* renamed from: j */
    private C3803c f11888j;

    /* renamed from: k */
    int f11889k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f11890l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f11891m = Integer.MIN_VALUE;

    /* renamed from: e.j.a.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C3801a implements C3804b.C3805a<C3736c> {
        C3801a() {
        }

        /* renamed from: b */
        public void mo13276a(C3736c cVar, Rect rect) {
            cVar.mo13130m(rect);
        }
    }

    /* renamed from: e.j.a.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C3802b implements C3804b.C3806b<C3479h<C3736c>, C3736c> {
        C3802b() {
        }

        /* renamed from: c */
        public C3736c mo13278a(C3479h<C3736c> hVar, int i) {
            return hVar.mo12417n(i);
        }

        /* renamed from: d */
        public int mo13279b(C3479h<C3736c> hVar) {
            return hVar.mo12416m();
        }
    }

    /* renamed from: e.j.a.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C3803c extends C3741d {
        C3803c() {
        }

        /* renamed from: b */
        public C3736c mo13162b(int i) {
            return C3736c.m15979Q(C3800a.this.mo13261J(i));
        }

        /* renamed from: d */
        public C3736c mo13164d(int i) {
            int i2 = i == 2 ? C3800a.this.f11889k : C3800a.this.f11890l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo13162b(i2);
        }

        /* renamed from: f */
        public boolean mo13166f(int i, int i2, Bundle bundle) {
            return C3800a.this.mo13269R(i, i2, bundle);
        }
    }

    public C3800a(View view) {
        if (view != null) {
            this.f11887i = view;
            this.f11886h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C3774v.m16238z(view) == 0) {
                C3774v.m16237y0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m16334D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: G */
    private boolean m16335G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f11887i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f11887i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private static int m16336H(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: I */
    private boolean m16337I(int i, Rect rect) {
        C3736c cVar;
        C3736c cVar2;
        C3479h<C3736c> y = m16349y();
        int i2 = this.f11890l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = y.mo12409f(i2);
        }
        C3736c cVar3 = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (C3736c) C3804b.m16386d(y, f11881p, f11880o, cVar3, i, C3774v.m16151B(this.f11887i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f11890l;
            if (i4 != Integer.MIN_VALUE) {
                m16350z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m16334D(this.f11887i, i, rect2);
            }
            cVar2 = (C3736c) C3804b.m16385c(y, f11881p, f11880o, cVar3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = y.mo12413j(y.mo12412i(cVar2));
        }
        return mo13270V(i3);
    }

    /* renamed from: S */
    private boolean m16338S(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo13270V(i);
        }
        if (i2 == 2) {
            return mo13272o(i);
        }
        if (i2 == 64) {
            return m16340U(i);
        }
        if (i2 != 128) {
            return mo13263L(i, i2, bundle);
        }
        return m16342n(i);
    }

    /* renamed from: T */
    private boolean m16339T(int i, Bundle bundle) {
        return C3774v.m16195d0(this.f11887i, i, bundle);
    }

    /* renamed from: U */
    private boolean m16340U(int i) {
        int i2;
        if (!this.f11886h.isEnabled() || !this.f11886h.isTouchExplorationEnabled() || (i2 = this.f11889k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m16342n(i2);
        }
        this.f11889k = i;
        this.f11887i.invalidate();
        mo13271W(i, 32768);
        return true;
    }

    /* renamed from: X */
    private void m16341X(int i) {
        int i2 = this.f11891m;
        if (i2 != i) {
            this.f11891m = i;
            mo13271W(i, 128);
            mo13271W(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m16342n(int i) {
        if (this.f11889k != i) {
            return false;
        }
        this.f11889k = Integer.MIN_VALUE;
        this.f11887i.invalidate();
        mo13271W(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m16343p() {
        int i = this.f11890l;
        return i != Integer.MIN_VALUE && mo13263L(i, 16, (Bundle) null);
    }

    /* renamed from: q */
    private AccessibilityEvent m16344q(int i, int i2) {
        if (i != -1) {
            return m16345r(i, i2);
        }
        return m16346s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m16345r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C3736c J = mo13261J(i);
        obtain.getText().add(J.mo13150x());
        obtain.setContentDescription(J.mo13139r());
        obtain.setScrollable(J.mo13098K());
        obtain.setPassword(J.mo13097J());
        obtain.setEnabled(J.mo13090F());
        obtain.setChecked(J.mo13086D());
        mo13265N(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(J.mo13136p());
            C3745e.m16078c(obtain, this.f11887i, i);
            obtain.setPackageName(this.f11887i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m16346s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f11887i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C3736c m16347t(int i) {
        C3736c O = C3736c.m15977O();
        O.mo13125i0(true);
        O.mo13128k0(true);
        O.mo13114c0("android.view.View");
        Rect rect = f11879n;
        O.mo13106X(rect);
        O.mo13107Y(rect);
        O.mo13144t0(this.f11887i);
        mo13267P(i, O);
        if (O.mo13150x() == null && O.mo13139r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        O.mo13130m(this.f11883e);
        if (!this.f11883e.equals(rect)) {
            int k = O.mo13127k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                O.mo13140r0(this.f11887i.getContext().getPackageName());
                O.mo13085C0(this.f11887i, i);
                if (this.f11889k == i) {
                    O.mo13105V(true);
                    O.mo13109a(128);
                } else {
                    O.mo13105V(false);
                    O.mo13109a(64);
                }
                boolean z = this.f11890l == i;
                if (z) {
                    O.mo13109a(2);
                } else if (O.mo13092G()) {
                    O.mo13109a(1);
                }
                O.mo13129l0(z);
                this.f11887i.getLocationOnScreen(this.f11885g);
                O.mo13132n(this.f11882d);
                if (this.f11882d.equals(rect)) {
                    O.mo13130m(this.f11882d);
                    if (O.f11790b != -1) {
                        C3736c O2 = C3736c.m15977O();
                        for (int i2 = O.f11790b; i2 != -1; i2 = O2.f11790b) {
                            O2.mo13146u0(this.f11887i, -1);
                            O2.mo13106X(f11879n);
                            mo13267P(i2, O2);
                            O2.mo13130m(this.f11883e);
                            Rect rect2 = this.f11882d;
                            Rect rect3 = this.f11883e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        O2.mo13103S();
                    }
                    this.f11882d.offset(this.f11885g[0] - this.f11887i.getScrollX(), this.f11885g[1] - this.f11887i.getScrollY());
                }
                if (this.f11887i.getLocalVisibleRect(this.f11884f)) {
                    this.f11884f.offset(this.f11885g[0] - this.f11887i.getScrollX(), this.f11885g[1] - this.f11887i.getScrollY());
                    if (this.f11882d.intersect(this.f11884f)) {
                        O.mo13107Y(this.f11882d);
                        if (m16335G(this.f11882d)) {
                            O.mo13093G0(true);
                        }
                    }
                }
                return O;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C3736c m16348u() {
        C3736c P = C3736c.m15978P(this.f11887i);
        C3774v.m16191b0(this.f11887i, P);
        ArrayList arrayList = new ArrayList();
        mo13258C(arrayList);
        if (P.mo13134o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                P.mo13115d(this.f11887i, ((Integer) arrayList.get(i)).intValue());
            }
            return P;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C3479h<C3736c> m16349y() {
        ArrayList arrayList = new ArrayList();
        mo13258C(arrayList);
        C3479h<C3736c> hVar = new C3479h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo12414k(i, m16347t(i));
        }
        return hVar;
    }

    /* renamed from: z */
    private void m16350z(int i, Rect rect) {
        mo13261J(i).mo13130m(rect);
    }

    /* renamed from: A */
    public final int mo13256A() {
        return this.f11890l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo13257B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo13258C(List<Integer> list);

    /* renamed from: E */
    public final void mo13259E(int i) {
        mo13260F(i, 0);
    }

    /* renamed from: F */
    public final void mo13260F(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f11886h.isEnabled() && (parent = this.f11887i.getParent()) != null) {
            AccessibilityEvent q = m16344q(i, 2048);
            C3735b.m15974b(q, i2);
            C3789y.m16301h(parent, this.f11887i, q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C3736c mo13261J(int i) {
        if (i == -1) {
            return m16348u();
        }
        return m16347t(i);
    }

    /* renamed from: K */
    public final void mo13262K(boolean z, int i, Rect rect) {
        int i2 = this.f11890l;
        if (i2 != Integer.MIN_VALUE) {
            mo13272o(i2);
        }
        if (z) {
            m16337I(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public abstract boolean mo13263L(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo13264M(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo13265N(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo13266O(C3736c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo13267P(int i, C3736c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo13268Q(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo13269R(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m16338S(i, i2, bundle);
        }
        return m16339T(i2, bundle);
    }

    /* renamed from: V */
    public final boolean mo13270V(int i) {
        int i2;
        if ((!this.f11887i.isFocused() && !this.f11887i.requestFocus()) || (i2 = this.f11890l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo13272o(i2);
        }
        this.f11890l = i;
        mo13268Q(i, true);
        mo13271W(i, 8);
        return true;
    }

    /* renamed from: W */
    public final boolean mo13271W(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f11886h.isEnabled() || (parent = this.f11887i.getParent()) == null) {
            return false;
        }
        return C3789y.m16301h(parent, this.f11887i, m16344q(i, i2));
    }

    /* renamed from: b */
    public C3741d mo5406b(View view) {
        if (this.f11888j == null) {
            this.f11888j = new C3803c();
        }
        return this.f11888j;
    }

    /* renamed from: f */
    public void mo3426f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3426f(view, accessibilityEvent);
        mo13264M(accessibilityEvent);
    }

    /* renamed from: g */
    public void mo3427g(View view, C3736c cVar) {
        super.mo3427g(view, cVar);
        mo13266O(cVar);
    }

    /* renamed from: o */
    public final boolean mo13272o(int i) {
        if (this.f11890l != i) {
            return false;
        }
        this.f11890l = Integer.MIN_VALUE;
        mo13268Q(i, false);
        mo13271W(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo13273v(MotionEvent motionEvent) {
        if (!this.f11886h.isEnabled() || !this.f11886h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo13257B(motionEvent.getX(), motionEvent.getY());
            m16341X(B);
            if (B != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f11891m == Integer.MIN_VALUE) {
            return false;
        } else {
            m16341X(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo13274w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int H = m16336H(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m16337I(H, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m16343p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m16337I(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m16337I(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo13275x() {
        return this.f11889k;
    }
}
