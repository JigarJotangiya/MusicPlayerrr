package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.widget.C0312t;
import androidx.appcompat.widget.C0313u;
import java.util.ArrayList;
import java.util.List;
import p082e.p083a.C3403d;
import p082e.p083a.C3406g;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.view.menu.d */
/* compiled from: CascadingMenuPopup */
final class C0162d extends C0183k implements C0186m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: H */
    private static final int f621H = C3406g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private int f622A;

    /* renamed from: B */
    private boolean f623B;

    /* renamed from: C */
    private boolean f624C;

    /* renamed from: D */
    private C0186m.C0187a f625D;

    /* renamed from: E */
    ViewTreeObserver f626E;

    /* renamed from: F */
    private PopupWindow.OnDismissListener f627F;

    /* renamed from: G */
    boolean f628G;

    /* renamed from: h */
    private final Context f629h;

    /* renamed from: i */
    private final int f630i;

    /* renamed from: j */
    private final int f631j;

    /* renamed from: k */
    private final int f632k;

    /* renamed from: l */
    private final boolean f633l;

    /* renamed from: m */
    final Handler f634m;

    /* renamed from: n */
    private final List<C0171g> f635n = new ArrayList();

    /* renamed from: o */
    final List<C0167d> f636o = new ArrayList();

    /* renamed from: p */
    final ViewTreeObserver.OnGlobalLayoutListener f637p = new C0163a();

    /* renamed from: q */
    private final View.OnAttachStateChangeListener f638q = new C0164b();

    /* renamed from: r */
    private final C0312t f639r = new C0165c();

    /* renamed from: s */
    private int f640s = 0;

    /* renamed from: t */
    private int f641t = 0;

    /* renamed from: u */
    private View f642u;

    /* renamed from: v */
    View f643v;

    /* renamed from: w */
    private int f644w;

    /* renamed from: x */
    private boolean f645x;

    /* renamed from: y */
    private boolean f646y;

    /* renamed from: z */
    private int f647z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* compiled from: CascadingMenuPopup */
    class C0163a implements ViewTreeObserver.OnGlobalLayoutListener {
        C0163a() {
        }

        public void onGlobalLayout() {
            if (C0162d.this.mo839a() && C0162d.this.f636o.size() > 0 && !C0162d.this.f636o.get(0).f655a.mo1613B()) {
                View view = C0162d.this.f643v;
                if (view == null || !view.isShown()) {
                    C0162d.this.dismiss();
                    return;
                }
                for (C0167d dVar : C0162d.this.f636o) {
                    dVar.f655a.mo840b();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* compiled from: CascadingMenuPopup */
    class C0164b implements View.OnAttachStateChangeListener {
        C0164b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0162d.this.f626E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0162d.this.f626E = view.getViewTreeObserver();
                }
                C0162d dVar = C0162d.this;
                dVar.f626E.removeGlobalOnLayoutListener(dVar.f637p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* compiled from: CascadingMenuPopup */
    class C0165c implements C0312t {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* compiled from: CascadingMenuPopup */
        class C0166a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ C0167d f651g;

            /* renamed from: h */
            final /* synthetic */ MenuItem f652h;

            /* renamed from: i */
            final /* synthetic */ C0171g f653i;

            C0166a(C0167d dVar, MenuItem menuItem, C0171g gVar) {
                this.f651g = dVar;
                this.f652h = menuItem;
                this.f653i = gVar;
            }

            public void run() {
                C0167d dVar = this.f651g;
                if (dVar != null) {
                    C0162d.this.f628G = true;
                    dVar.f656b.mo925e(false);
                    C0162d.this.f628G = false;
                }
                if (this.f652h.isEnabled() && this.f652h.hasSubMenu()) {
                    this.f653i.mo894N(this.f652h, 4);
                }
            }
        }

        C0165c() {
        }

        /* renamed from: e */
        public void mo857e(C0171g gVar, MenuItem menuItem) {
            C0167d dVar = null;
            C0162d.this.f634m.removeCallbacksAndMessages((Object) null);
            int size = C0162d.this.f636o.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == C0162d.this.f636o.get(i).f656b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0162d.this.f636o.size()) {
                    dVar = C0162d.this.f636o.get(i2);
                }
                C0162d.this.f634m.postAtTime(new C0166a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: h */
        public void mo858h(C0171g gVar, MenuItem menuItem) {
            C0162d.this.f634m.removeCallbacksAndMessages(gVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* compiled from: CascadingMenuPopup */
    private static class C0167d {

        /* renamed from: a */
        public final C0313u f655a;

        /* renamed from: b */
        public final C0171g f656b;

        /* renamed from: c */
        public final int f657c;

        public C0167d(C0313u uVar, C0171g gVar, int i) {
            this.f655a = uVar;
            this.f656b = gVar;
            this.f657c = i;
        }

        /* renamed from: a */
        public ListView mo860a() {
            return this.f655a.mo845j();
        }
    }

    public C0162d(Context context, View view, int i, int i2, boolean z) {
        this.f629h = context;
        this.f642u = view;
        this.f631j = i;
        this.f632k = i2;
        this.f633l = z;
        this.f623B = false;
        this.f644w = m944w();
        Resources resources = context.getResources();
        this.f630i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C3403d.abc_config_prefDialogWidth));
        this.f634m = new Handler();
    }

    /* renamed from: s */
    private C0313u m940s() {
        C0313u uVar = new C0313u(this.f629h, (AttributeSet) null, this.f631j, this.f632k);
        uVar.mo2135T(this.f639r);
        uVar.mo1622L(this);
        uVar.mo1621K(this);
        uVar.mo1614D(this.f642u);
        uVar.mo1617G(this.f641t);
        uVar.mo1620J(true);
        uVar.mo1619I(2);
        return uVar;
    }

    /* renamed from: t */
    private int m941t(C0171g gVar) {
        int size = this.f636o.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f636o.get(i).f656b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: u */
    private MenuItem m942u(C0171g gVar, C0171g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: v */
    private View m943v(C0167d dVar, C0171g gVar) {
        int i;
        C0170f fVar;
        int firstVisiblePosition;
        MenuItem u = m942u(dVar.f656b, gVar);
        if (u == null) {
            return null;
        }
        ListView a = dVar.mo860a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0170f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0170f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (u == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: w */
    private int m944w() {
        return C3774v.m16151B(this.f642u) == 1 ? 0 : 1;
    }

    /* renamed from: x */
    private int m945x(int i) {
        List<C0167d> list = this.f636o;
        ListView a = list.get(list.size() - 1).mo860a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f643v.getWindowVisibleDisplayFrame(rect);
        if (this.f644w == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: y */
    private void m946y(C0171g gVar) {
        View view;
        C0167d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f629h);
        C0170f fVar = new C0170f(gVar, from, this.f633l, f621H);
        if (!mo839a() && this.f623B) {
            fVar.mo876d(true);
        } else if (mo839a()) {
            fVar.mo876d(C0183k.m1098q(gVar));
        }
        int g = C0183k.m1097g(fVar, (ViewGroup) null, this.f629h, this.f630i);
        C0313u s = m940s();
        s.mo1496p(fVar);
        s.mo1616F(g);
        s.mo1617G(this.f641t);
        if (this.f636o.size() > 0) {
            List<C0167d> list = this.f636o;
            dVar = list.get(list.size() - 1);
            view = m943v(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            s.mo2136U(false);
            s.mo2133R((Object) null);
            int x = m945x(g);
            boolean z = x == 1;
            this.f644w = x;
            if (Build.VERSION.SDK_INT >= 26) {
                s.mo1614D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f642u.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f641t & 7) == 5) {
                    iArr[0] = iArr[0] + this.f642u.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f641t & 5) != 5) {
                if (z) {
                    g = view.getWidth();
                }
                i3 = i - g;
                s.mo1629f(i3);
                s.mo1623M(true);
                s.mo1631l(i2);
            } else if (!z) {
                g = view.getWidth();
                i3 = i - g;
                s.mo1629f(i3);
                s.mo1623M(true);
                s.mo1631l(i2);
            }
            i3 = i + g;
            s.mo1629f(i3);
            s.mo1623M(true);
            s.mo1631l(i2);
        } else {
            if (this.f645x) {
                s.mo1629f(this.f647z);
            }
            if (this.f646y) {
                s.mo1631l(this.f622A);
            }
            s.mo1618H(mo1092f());
        }
        this.f636o.add(new C0167d(s, gVar, this.f644w));
        s.mo840b();
        ListView j = s.mo845j();
        j.setOnKeyListener(this);
        if (dVar == null && this.f624C && gVar.mo957z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C3406g.abc_popup_menu_header_item_layout, j, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo957z());
            j.addHeaderView(frameLayout, (Object) null, false);
            s.mo840b();
        }
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        for (C0167d a : this.f636o) {
            C0183k.m1099r(a.mo860a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: F */
    public boolean mo836F() {
        return false;
    }

    /* renamed from: I */
    public void mo818I(C0186m.C0187a aVar) {
        this.f625D = aVar;
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        for (C0167d next : this.f636o) {
            if (rVar == next.f656b) {
                next.mo860a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo841d(rVar);
        C0186m.C0187a aVar = this.f625D;
        if (aVar != null) {
            aVar.mo591d(rVar);
        }
        return true;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        return null;
    }

    /* renamed from: a */
    public boolean mo839a() {
        return this.f636o.size() > 0 && this.f636o.get(0).f655a.mo839a();
    }

    /* renamed from: b */
    public void mo840b() {
        if (!mo839a()) {
            for (C0171g y : this.f635n) {
                m946y(y);
            }
            this.f635n.clear();
            View view = this.f642u;
            this.f643v = view;
            if (view != null) {
                boolean z = this.f626E == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f626E = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f637p);
                }
                this.f643v.addOnAttachStateChangeListener(this.f638q);
            }
        }
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        int t = m941t(gVar);
        if (t >= 0) {
            int i = t + 1;
            if (i < this.f636o.size()) {
                this.f636o.get(i).f656b.mo925e(false);
            }
            C0167d remove = this.f636o.remove(t);
            remove.f656b.mo896Q(this);
            if (this.f628G) {
                remove.f655a.mo2134S((Object) null);
                remove.f655a.mo1615E(0);
            }
            remove.f655a.dismiss();
            int size = this.f636o.size();
            if (size > 0) {
                this.f644w = this.f636o.get(size - 1).f657c;
            } else {
                this.f644w = m944w();
            }
            if (size == 0) {
                dismiss();
                C0186m.C0187a aVar = this.f625D;
                if (aVar != null) {
                    aVar.mo590c(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f626E;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f626E.removeGlobalOnLayoutListener(this.f637p);
                    }
                    this.f626E = null;
                }
                this.f643v.removeOnAttachStateChangeListener(this.f638q);
                this.f627F.onDismiss();
            } else if (z) {
                this.f636o.get(0).f656b.mo925e(false);
            }
        }
    }

    /* renamed from: d */
    public void mo841d(C0171g gVar) {
        gVar.mo918c(this, this.f629h);
        if (mo839a()) {
            m946y(gVar);
        } else {
            this.f635n.add(gVar);
        }
    }

    public void dismiss() {
        int size = this.f636o.size();
        if (size > 0) {
            C0167d[] dVarArr = (C0167d[]) this.f636o.toArray(new C0167d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0167d dVar = dVarArr[i];
                if (dVar.f655a.mo839a()) {
                    dVar.f655a.dismiss();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo843e() {
        return false;
    }

    /* renamed from: h */
    public void mo844h(View view) {
        if (this.f642u != view) {
            this.f642u = view;
            this.f641t = C3733e.m15972b(this.f640s, C3774v.m16151B(view));
        }
    }

    /* renamed from: j */
    public ListView mo845j() {
        if (this.f636o.isEmpty()) {
            return null;
        }
        List<C0167d> list = this.f636o;
        return list.get(list.size() - 1).mo860a();
    }

    /* renamed from: k */
    public void mo846k(boolean z) {
        this.f623B = z;
    }

    /* renamed from: l */
    public void mo847l(int i) {
        if (this.f640s != i) {
            this.f640s = i;
            this.f641t = C3733e.m15972b(i, C3774v.m16151B(this.f642u));
        }
    }

    /* renamed from: m */
    public void mo848m(int i) {
        this.f645x = true;
        this.f647z = i;
    }

    /* renamed from: n */
    public void mo849n(PopupWindow.OnDismissListener onDismissListener) {
        this.f627F = onDismissListener;
    }

    /* renamed from: o */
    public void mo850o(boolean z) {
        this.f624C = z;
    }

    public void onDismiss() {
        C0167d dVar;
        int size = this.f636o.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f636o.get(i);
            if (!dVar.f655a.mo839a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f656b.mo925e(false);
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
        this.f646y = true;
        this.f622A = i;
    }
}
