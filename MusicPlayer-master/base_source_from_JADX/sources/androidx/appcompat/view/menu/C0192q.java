package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.widget.C0313u;
import p082e.p083a.C3403d;
import p082e.p083a.C3406g;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.view.menu.q */
/* compiled from: StandardMenuPopup */
final class C0192q extends C0183k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, C0186m, View.OnKeyListener {

    /* renamed from: B */
    private static final int f764B = C3406g.abc_popup_menu_item_layout;

    /* renamed from: A */
    private boolean f765A;

    /* renamed from: h */
    private final Context f766h;

    /* renamed from: i */
    private final C0171g f767i;

    /* renamed from: j */
    private final C0170f f768j;

    /* renamed from: k */
    private final boolean f769k;

    /* renamed from: l */
    private final int f770l;

    /* renamed from: m */
    private final int f771m;

    /* renamed from: n */
    private final int f772n;

    /* renamed from: o */
    final C0313u f773o;

    /* renamed from: p */
    final ViewTreeObserver.OnGlobalLayoutListener f774p = new C0193a();

    /* renamed from: q */
    private final View.OnAttachStateChangeListener f775q = new C0194b();

    /* renamed from: r */
    private PopupWindow.OnDismissListener f776r;

    /* renamed from: s */
    private View f777s;

    /* renamed from: t */
    View f778t;

    /* renamed from: u */
    private C0186m.C0187a f779u;

    /* renamed from: v */
    ViewTreeObserver f780v;

    /* renamed from: w */
    private boolean f781w;

    /* renamed from: x */
    private boolean f782x;

    /* renamed from: y */
    private int f783y;

    /* renamed from: z */
    private int f784z = 0;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* compiled from: StandardMenuPopup */
    class C0193a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0193a() {
        }

        public void onGlobalLayout() {
            if (C0192q.this.mo839a() && !C0192q.this.f773o.mo1613B()) {
                View view = C0192q.this.f778t;
                if (view == null || !view.isShown()) {
                    C0192q.this.dismiss();
                } else {
                    C0192q.this.f773o.mo840b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* compiled from: StandardMenuPopup */
    class C0194b implements View.OnAttachStateChangeListener {
        C0194b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0192q.this.f780v;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0192q.this.f780v = view.getViewTreeObserver();
                }
                C0192q qVar = C0192q.this;
                qVar.f780v.removeGlobalOnLayoutListener(qVar.f774p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0192q(Context context, C0171g gVar, View view, int i, int i2, boolean z) {
        this.f766h = context;
        this.f767i = gVar;
        this.f769k = z;
        this.f768j = new C0170f(gVar, LayoutInflater.from(context), z, f764B);
        this.f771m = i;
        this.f772n = i2;
        Resources resources = context.getResources();
        this.f770l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3403d.abc_config_prefDialogWidth));
        this.f777s = view;
        this.f773o = new C0313u(context, (AttributeSet) null, i, i2);
        gVar.mo918c(this, context);
    }

    /* renamed from: s */
    private boolean m1148s() {
        View view;
        if (mo839a()) {
            return true;
        }
        if (this.f781w || (view = this.f777s) == null) {
            return false;
        }
        this.f778t = view;
        this.f773o.mo1621K(this);
        this.f773o.mo1622L(this);
        this.f773o.mo1620J(true);
        View view2 = this.f778t;
        boolean z = this.f780v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f780v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f774p);
        }
        view2.addOnAttachStateChangeListener(this.f775q);
        this.f773o.mo1614D(view2);
        this.f773o.mo1617G(this.f784z);
        if (!this.f782x) {
            this.f783y = C0183k.m1097g(this.f768j, (ViewGroup) null, this.f766h, this.f770l);
            this.f782x = true;
        }
        this.f773o.mo1616F(this.f783y);
        this.f773o.mo1619I(2);
        this.f773o.mo1618H(mo1092f());
        this.f773o.mo840b();
        ListView j = this.f773o.mo845j();
        j.setOnKeyListener(this);
        if (this.f765A && this.f767i.mo957z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f766h).inflate(C3406g.abc_popup_menu_header_item_layout, j, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f767i.mo957z());
            }
            frameLayout.setEnabled(false);
            j.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f773o.mo1496p(this.f768j);
        this.f773o.mo840b();
        return true;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        this.f782x = false;
        C0170f fVar = this.f768j;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: F */
    public boolean mo836F() {
        return false;
    }

    /* renamed from: I */
    public void mo818I(C0186m.C0187a aVar) {
        this.f779u = aVar;
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        if (rVar.hasVisibleItems()) {
            C0184l lVar = new C0184l(this.f766h, rVar, this.f778t, this.f769k, this.f771m, this.f772n);
            lVar.mo1103j(this.f779u);
            lVar.mo1100g(C0183k.m1098q(rVar));
            lVar.mo1102i(this.f776r);
            this.f776r = null;
            this.f767i.mo925e(false);
            int d = this.f773o.mo1628d();
            int o = this.f773o.mo1632o();
            if ((Gravity.getAbsoluteGravity(this.f784z, C3774v.m16151B(this.f777s)) & 7) == 5) {
                d += this.f777s.getWidth();
            }
            if (lVar.mo1106n(d, o)) {
                C0186m.C0187a aVar = this.f779u;
                if (aVar == null) {
                    return true;
                }
                aVar.mo591d(rVar);
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        return null;
    }

    /* renamed from: a */
    public boolean mo839a() {
        return !this.f781w && this.f773o.mo839a();
    }

    /* renamed from: b */
    public void mo840b() {
        if (!m1148s()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        if (gVar == this.f767i) {
            dismiss();
            C0186m.C0187a aVar = this.f779u;
            if (aVar != null) {
                aVar.mo590c(gVar, z);
            }
        }
    }

    /* renamed from: d */
    public void mo841d(C0171g gVar) {
    }

    public void dismiss() {
        if (mo839a()) {
            this.f773o.dismiss();
        }
    }

    /* renamed from: h */
    public void mo844h(View view) {
        this.f777s = view;
    }

    /* renamed from: j */
    public ListView mo845j() {
        return this.f773o.mo845j();
    }

    /* renamed from: k */
    public void mo846k(boolean z) {
        this.f768j.mo876d(z);
    }

    /* renamed from: l */
    public void mo847l(int i) {
        this.f784z = i;
    }

    /* renamed from: m */
    public void mo848m(int i) {
        this.f773o.mo1629f(i);
    }

    /* renamed from: n */
    public void mo849n(PopupWindow.OnDismissListener onDismissListener) {
        this.f776r = onDismissListener;
    }

    /* renamed from: o */
    public void mo850o(boolean z) {
        this.f765A = z;
    }

    public void onDismiss() {
        this.f781w = true;
        this.f767i.close();
        ViewTreeObserver viewTreeObserver = this.f780v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f780v = this.f778t.getViewTreeObserver();
            }
            this.f780v.removeGlobalOnLayoutListener(this.f774p);
            this.f780v = null;
        }
        this.f778t.removeOnAttachStateChangeListener(this.f775q);
        PopupWindow.OnDismissListener onDismissListener = this.f776r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo853p(int i) {
        this.f773o.mo1631l(i);
    }
}
