package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0160b;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0184l;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.view.menu.C0191p;
import androidx.appcompat.view.menu.C0195r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0534a;
import java.util.ArrayList;
import p082e.p083a.C3400a;
import p082e.p083a.C3406g;
import p082e.p083a.p090o.C3431a;
import p082e.p109h.p119p.C3707b;

class ActionMenuPresenter extends C0160b implements C3707b.C3708a {

    /* renamed from: A */
    private boolean f847A;

    /* renamed from: B */
    private int f848B;

    /* renamed from: C */
    private final SparseBooleanArray f849C = new SparseBooleanArray();

    /* renamed from: D */
    C0208e f850D;

    /* renamed from: E */
    C0203a f851E;

    /* renamed from: F */
    C0205c f852F;

    /* renamed from: G */
    private C0204b f853G;

    /* renamed from: H */
    final C0209f f854H = new C0209f();

    /* renamed from: I */
    int f855I;

    /* renamed from: p */
    C0206d f856p;

    /* renamed from: q */
    private Drawable f857q;

    /* renamed from: r */
    private boolean f858r;

    /* renamed from: s */
    private boolean f859s;

    /* renamed from: t */
    private boolean f860t;

    /* renamed from: u */
    private int f861u;

    /* renamed from: v */
    private int f862v;

    /* renamed from: w */
    private int f863w;

    /* renamed from: x */
    private boolean f864x;

    /* renamed from: y */
    private boolean f865y;

    /* renamed from: z */
    private boolean f866z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0202a();

        /* renamed from: g */
        public int f867g;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        class C0202a implements Parcelable.Creator<SavedState> {
            C0202a() {
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

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f867g);
        }

        SavedState(Parcel parcel) {
            this.f867g = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0203a extends C0184l {
        public C0203a(Context context, C0195r rVar, View view) {
            super(context, rVar, view, false, C3400a.actionOverflowMenuStyle);
            if (!((C0175i) rVar.getItem()).mo989l()) {
                View view2 = ActionMenuPresenter.this.f856p;
                mo1099f(view2 == null ? (View) ActionMenuPresenter.this.f616n : view2);
            }
            mo1103j(ActionMenuPresenter.this.f854H);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1098e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f851E = null;
            actionMenuPresenter.f855I = 0;
            super.mo1098e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0204b extends ActionMenuItemView.C0158b {
        C0204b() {
        }

        /* renamed from: a */
        public C0191p mo739a() {
            C0203a aVar = ActionMenuPresenter.this.f851E;
            if (aVar != null) {
                return aVar.mo1096c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0205c implements Runnable {

        /* renamed from: g */
        private C0208e f870g;

        public C0205c(C0208e eVar) {
            this.f870g = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f611i != null) {
                ActionMenuPresenter.this.f611i.mo923d();
            }
            View view = (View) ActionMenuPresenter.this.f616n;
            if (!(view == null || view.getWindowToken() == null || !this.f870g.mo1105m())) {
                ActionMenuPresenter.this.f850D = this.f870g;
            }
            ActionMenuPresenter.this.f852F = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0206d extends AppCompatImageView implements ActionMenuView.C0210a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0207a extends C0309s {
            C0207a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            /* renamed from: b */
            public C0191p mo737b() {
                C0208e eVar = ActionMenuPresenter.this.f850D;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1096c();
            }

            /* renamed from: d */
            public boolean mo738d() {
                ActionMenuPresenter.this.mo1260O();
                return true;
            }

            /* renamed from: f */
            public boolean mo1278f() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f852F != null) {
                    return false;
                }
                actionMenuPresenter.mo1264v();
                return true;
            }
        }

        public C0206d(Context context) {
            super(context, (AttributeSet) null, C3400a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0285i0.m1700a(this, getContentDescription());
            setOnTouchListener(new C0207a(this, ActionMenuPresenter.this));
        }

        /* renamed from: a */
        public boolean mo718a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo719b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1260O();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0534a.m3286l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0208e extends C0184l {
        public C0208e(Context context, C0171g gVar, View view, boolean z) {
            super(context, gVar, view, z, C3400a.actionOverflowMenuStyle);
            mo1101h(8388613);
            mo1103j(ActionMenuPresenter.this.f854H);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1098e() {
            if (ActionMenuPresenter.this.f611i != null) {
                ActionMenuPresenter.this.f611i.close();
            }
            ActionMenuPresenter.this.f850D = null;
            super.mo1098e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0209f implements C0186m.C0187a {
        C0209f() {
        }

        /* renamed from: c */
        public void mo590c(C0171g gVar, boolean z) {
            if (gVar instanceof C0195r) {
                gVar.mo886F().mo925e(false);
            }
            C0186m.C0187a g = ActionMenuPresenter.this.mo826g();
            if (g != null) {
                g.mo590c(gVar, z);
            }
        }

        /* renamed from: d */
        public boolean mo591d(C0171g gVar) {
            if (gVar == ActionMenuPresenter.this.f611i) {
                return false;
            }
            ActionMenuPresenter.this.f855I = ((C0195r) gVar).getItem().getItemId();
            C0186m.C0187a g = ActionMenuPresenter.this.mo826g();
            if (g != null) {
                return g.mo591d(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C3406g.abc_action_menu_layout, C3406g.abc_action_menu_item_layout);
    }

    /* renamed from: t */
    private View m1225t(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f616n;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0188n.C0189a) && ((C0188n.C0189a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public void mo1256A(boolean z) {
        this.f847A = z;
    }

    /* renamed from: B */
    public void mo1257B(ActionMenuView actionMenuView) {
        this.f616n = actionMenuView;
        actionMenuView.mo741b(this.f611i);
    }

    /* renamed from: C */
    public void mo1258C(Drawable drawable) {
        C0206d dVar = this.f856p;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f858r = true;
        this.f857q = drawable;
    }

    /* renamed from: E */
    public void mo815E(boolean z) {
        C0188n nVar;
        super.mo815E(z);
        ((View) this.f616n).requestLayout();
        C0171g gVar = this.f611i;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList<C0175i> u = gVar.mo952u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                C3707b b = u.get(i).mo756b();
                if (b != null) {
                    b.mo13011i(this);
                }
            }
        }
        C0171g gVar2 = this.f611i;
        ArrayList<C0175i> B = gVar2 != null ? gVar2.mo883B() : null;
        if (this.f859s && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f856p == null) {
                this.f856p = new C0206d(this.f609g);
            }
            ViewGroup viewGroup = (ViewGroup) this.f856p.getParent();
            if (viewGroup != this.f616n) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f856p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f616n;
                actionMenuView.addView(this.f856p, actionMenuView.mo1283F());
            }
        } else {
            C0206d dVar = this.f856p;
            if (dVar != null && dVar.getParent() == (nVar = this.f616n)) {
                ((ViewGroup) nVar).removeView(this.f856p);
            }
        }
        ((ActionMenuView) this.f616n).setOverflowReserved(this.f859s);
    }

    /* renamed from: F */
    public boolean mo836F() {
        int i;
        ArrayList<C0175i> arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0171g gVar = actionMenuPresenter.f611i;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo887G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f863w;
        int i7 = actionMenuPresenter.f862v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f616n;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0175i iVar = arrayList.get(i10);
            if (iVar.mo992o()) {
                i8++;
            } else if (iVar.mo991n()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f847A && iVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f859s && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f849C;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f865y) {
            int i12 = actionMenuPresenter.f848B;
            i2 = i7 / i12;
            i3 = i12 + ((i7 % i12) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0175i iVar2 = arrayList.get(i13);
            if (iVar2.mo992o()) {
                View h = actionMenuPresenter.mo827h(iVar2, view, viewGroup);
                if (actionMenuPresenter.f865y) {
                    i2 -= ActionMenuView.m1263L(h, i3, i2, makeMeasureSpec, i5);
                } else {
                    h.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = h.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo1015u(true);
                i4 = i;
            } else if (iVar2.mo991n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.f865y || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View h2 = actionMenuPresenter.mo827h(iVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f865y) {
                        int L = ActionMenuView.m1263L(h2, i3, i2, makeMeasureSpec, 0);
                        i2 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        h2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = h2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.f865y ? i7 + i14 > 0 : i7 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i15 = 0;
                    while (i15 < i13) {
                        C0175i iVar3 = arrayList.get(i15);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo989l()) {
                                i11++;
                            }
                            iVar3.mo1015u(false);
                        }
                        i15++;
                    }
                }
                if (z3) {
                    i11--;
                }
                iVar2.mo1015u(z3);
            } else {
                i4 = i;
                iVar2.mo1015u(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: J */
    public void mo819J(Context context, C0171g gVar) {
        super.mo819J(context, gVar);
        Resources resources = context.getResources();
        C3431a b = C3431a.m14635b(context);
        if (!this.f860t) {
            this.f859s = b.mo12164h();
        }
        if (!this.f866z) {
            this.f861u = b.mo12159c();
        }
        if (!this.f864x) {
            this.f863w = b.mo12160d();
        }
        int i = this.f861u;
        if (this.f859s) {
            if (this.f856p == null) {
                C0206d dVar = new C0206d(this.f609g);
                this.f856p = dVar;
                if (this.f858r) {
                    dVar.setImageDrawable(this.f857q);
                    this.f857q = null;
                    this.f858r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f856p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f856p.getMeasuredWidth();
        } else {
            this.f856p = null;
        }
        this.f862v = i;
        this.f848B = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: K */
    public void mo837K(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f867g) > 0 && (findItem = this.f611i.findItem(i)) != null) {
            mo820L((C0195r) findItem.getSubMenu());
        }
    }

    /* renamed from: L */
    public boolean mo820L(C0195r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        C0195r rVar2 = rVar;
        while (rVar2.mo1138i0() != this.f611i) {
            rVar2 = (C0195r) rVar2.mo1138i0();
        }
        View t = m1225t(rVar2.getItem());
        if (t == null) {
            return false;
        }
        this.f855I = rVar.getItem().getItemId();
        int size = rVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0203a aVar = new C0203a(this.f610h, rVar, t);
        this.f851E = aVar;
        aVar.mo1100g(z);
        this.f851E.mo1104k();
        super.mo820L(rVar);
        return true;
    }

    /* renamed from: M */
    public Parcelable mo838M() {
        SavedState savedState = new SavedState();
        savedState.f867g = this.f855I;
        return savedState;
    }

    /* renamed from: N */
    public void mo1259N(boolean z) {
        this.f859s = z;
        this.f860t = true;
    }

    /* renamed from: O */
    public boolean mo1260O() {
        C0171g gVar;
        if (!this.f859s || mo1267y() || (gVar = this.f611i) == null || this.f616n == null || this.f852F != null || gVar.mo883B().isEmpty()) {
            return false;
        }
        C0205c cVar = new C0205c(new C0208e(this.f610h, this.f611i, this.f856p, true));
        this.f852F = cVar;
        ((View) this.f616n).post(cVar);
        return true;
    }

    /* renamed from: a */
    public void mo1261a(boolean z) {
        if (z) {
            super.mo820L((C0195r) null);
            return;
        }
        C0171g gVar = this.f611i;
        if (gVar != null) {
            gVar.mo925e(false);
        }
    }

    /* renamed from: c */
    public void mo822c(C0171g gVar, boolean z) {
        mo1262s();
        super.mo822c(gVar, z);
    }

    /* renamed from: d */
    public void mo823d(C0175i iVar, C0188n.C0189a aVar) {
        aVar.mo722n(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f616n);
        if (this.f853G == null) {
            this.f853G = new C0204b();
        }
        actionMenuItemView.setPopupCallback(this.f853G);
    }

    /* renamed from: f */
    public boolean mo825f(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f856p) {
            return false;
        }
        return super.mo825f(viewGroup, i);
    }

    /* renamed from: h */
    public View mo827h(C0175i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo987j()) {
            actionView = super.mo827h(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo1303o(layoutParams));
        }
        return actionView;
    }

    /* renamed from: i */
    public C0188n mo828i(ViewGroup viewGroup) {
        C0188n nVar = this.f616n;
        C0188n i = super.mo828i(viewGroup);
        if (nVar != i) {
            ((ActionMenuView) i).setPresenter(this);
        }
        return i;
    }

    /* renamed from: k */
    public boolean mo830k(int i, C0175i iVar) {
        return iVar.mo989l();
    }

    /* renamed from: s */
    public boolean mo1262s() {
        return mo1264v() | mo1265w();
    }

    /* renamed from: u */
    public Drawable mo1263u() {
        C0206d dVar = this.f856p;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f858r) {
            return this.f857q;
        }
        return null;
    }

    /* renamed from: v */
    public boolean mo1264v() {
        C0188n nVar;
        C0205c cVar = this.f852F;
        if (cVar == null || (nVar = this.f616n) == null) {
            C0208e eVar = this.f850D;
            if (eVar == null) {
                return false;
            }
            eVar.mo1095b();
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.f852F = null;
        return true;
    }

    /* renamed from: w */
    public boolean mo1265w() {
        C0203a aVar = this.f851E;
        if (aVar == null) {
            return false;
        }
        aVar.mo1095b();
        return true;
    }

    /* renamed from: x */
    public boolean mo1266x() {
        return this.f852F != null || mo1267y();
    }

    /* renamed from: y */
    public boolean mo1267y() {
        C0208e eVar = this.f850D;
        return eVar != null && eVar.mo1097d();
    }

    /* renamed from: z */
    public void mo1268z(Configuration configuration) {
        if (!this.f864x) {
            this.f863w = C3431a.m14635b(this.f610h).mo12160d();
        }
        C0171g gVar = this.f611i;
        if (gVar != null) {
            gVar.mo893M(true);
        }
    }
}
