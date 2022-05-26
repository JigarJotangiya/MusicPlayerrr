package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3787w;

/* renamed from: androidx.appcompat.widget.j0 */
/* compiled from: TooltipCompatHandler */
class C0287j0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p */
    private static C0287j0 f1331p;

    /* renamed from: q */
    private static C0287j0 f1332q;

    /* renamed from: g */
    private final View f1333g;

    /* renamed from: h */
    private final CharSequence f1334h;

    /* renamed from: i */
    private final int f1335i;

    /* renamed from: j */
    private final Runnable f1336j = new C0288a();

    /* renamed from: k */
    private final Runnable f1337k = new C0289b();

    /* renamed from: l */
    private int f1338l;

    /* renamed from: m */
    private int f1339m;

    /* renamed from: n */
    private C0291k0 f1340n;

    /* renamed from: o */
    private boolean f1341o;

    /* renamed from: androidx.appcompat.widget.j0$a */
    /* compiled from: TooltipCompatHandler */
    class C0288a implements Runnable {
        C0288a() {
        }

        public void run() {
            C0287j0.this.mo2050g(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.j0$b */
    /* compiled from: TooltipCompatHandler */
    class C0289b implements Runnable {
        C0289b() {
        }

        public void run() {
            C0287j0.this.mo2049c();
        }
    }

    private C0287j0(View view, CharSequence charSequence) {
        this.f1333g = view;
        this.f1334h = charSequence;
        this.f1335i = C3787w.m16290c(ViewConfiguration.get(view.getContext()));
        m1708b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: a */
    private void m1707a() {
        this.f1333g.removeCallbacks(this.f1336j);
    }

    /* renamed from: b */
    private void m1708b() {
        this.f1338l = Integer.MAX_VALUE;
        this.f1339m = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1709d() {
        this.f1333g.postDelayed(this.f1336j, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: e */
    private static void m1710e(C0287j0 j0Var) {
        C0287j0 j0Var2 = f1331p;
        if (j0Var2 != null) {
            j0Var2.m1707a();
        }
        f1331p = j0Var;
        if (j0Var != null) {
            j0Var.m1709d();
        }
    }

    /* renamed from: f */
    public static void m1711f(View view, CharSequence charSequence) {
        C0287j0 j0Var = f1331p;
        if (j0Var != null && j0Var.f1333g == view) {
            m1710e((C0287j0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0287j0 j0Var2 = f1332q;
            if (j0Var2 != null && j0Var2.f1333g == view) {
                j0Var2.mo2049c();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0287j0(view, charSequence);
    }

    /* renamed from: h */
    private boolean m1712h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1338l) <= this.f1335i && Math.abs(y - this.f1339m) <= this.f1335i) {
            return false;
        }
        this.f1338l = x;
        this.f1339m = y;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2049c() {
        if (f1332q == this) {
            f1332q = null;
            C0291k0 k0Var = this.f1340n;
            if (k0Var != null) {
                k0Var.mo2059c();
                this.f1340n = null;
                m1708b();
                this.f1333g.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1331p == this) {
            m1710e((C0287j0) null);
        }
        this.f1333g.removeCallbacks(this.f1337k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2050g(boolean z) {
        long j;
        int i;
        long j2;
        if (C3774v.m16180S(this.f1333g)) {
            m1710e((C0287j0) null);
            C0287j0 j0Var = f1332q;
            if (j0Var != null) {
                j0Var.mo2049c();
            }
            f1332q = this;
            this.f1341o = z;
            C0291k0 k0Var = new C0291k0(this.f1333g.getContext());
            this.f1340n = k0Var;
            k0Var.mo2061e(this.f1333g, this.f1338l, this.f1339m, this.f1341o, this.f1334h);
            this.f1333g.addOnAttachStateChangeListener(this);
            if (this.f1341o) {
                j = 2500;
            } else {
                if ((C3774v.m16173M(this.f1333g) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1333g.removeCallbacks(this.f1337k);
            this.f1333g.postDelayed(this.f1337k, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1340n != null && this.f1341o) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1333g.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1708b();
                mo2049c();
            }
        } else if (this.f1333g.isEnabled() && this.f1340n == null && m1712h(motionEvent)) {
            m1710e(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1338l = view.getWidth() / 2;
        this.f1339m = view.getHeight() / 2;
        mo2050g(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo2049c();
    }
}
