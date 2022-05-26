package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0195r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p082e.p083a.C3400a;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p083a.p090o.C3434c;
import p082e.p083a.p090o.C3439g;
import p082e.p109h.p119p.C3733e;
import p082e.p109h.p119p.C3760h;
import p082e.p109h.p119p.C3774v;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1170A;

    /* renamed from: B */
    private int f1171B;

    /* renamed from: C */
    private int f1172C;

    /* renamed from: D */
    private CharSequence f1173D;

    /* renamed from: E */
    private CharSequence f1174E;

    /* renamed from: F */
    private ColorStateList f1175F;

    /* renamed from: G */
    private ColorStateList f1176G;

    /* renamed from: H */
    private boolean f1177H;

    /* renamed from: I */
    private boolean f1178I;

    /* renamed from: J */
    private final ArrayList<View> f1179J;

    /* renamed from: K */
    private final ArrayList<View> f1180K;

    /* renamed from: L */
    private final int[] f1181L;

    /* renamed from: M */
    C0261e f1182M;

    /* renamed from: N */
    private final ActionMenuView.C0213d f1183N;

    /* renamed from: O */
    private C0281h0 f1184O;

    /* renamed from: P */
    private ActionMenuPresenter f1185P;

    /* renamed from: Q */
    private C0260d f1186Q;

    /* renamed from: R */
    private C0186m.C0187a f1187R;

    /* renamed from: S */
    private C0171g.C0172a f1188S;

    /* renamed from: T */
    private boolean f1189T;

    /* renamed from: U */
    private final Runnable f1190U;

    /* renamed from: g */
    private ActionMenuView f1191g;

    /* renamed from: h */
    private TextView f1192h;

    /* renamed from: i */
    private TextView f1193i;

    /* renamed from: j */
    private ImageButton f1194j;

    /* renamed from: k */
    private ImageView f1195k;

    /* renamed from: l */
    private Drawable f1196l;

    /* renamed from: m */
    private CharSequence f1197m;

    /* renamed from: n */
    ImageButton f1198n;

    /* renamed from: o */
    View f1199o;

    /* renamed from: p */
    private Context f1200p;

    /* renamed from: q */
    private int f1201q;

    /* renamed from: r */
    private int f1202r;

    /* renamed from: s */
    private int f1203s;

    /* renamed from: t */
    int f1204t;

    /* renamed from: u */
    private int f1205u;

    /* renamed from: v */
    private int f1206v;

    /* renamed from: w */
    private int f1207w;

    /* renamed from: x */
    private int f1208x;

    /* renamed from: y */
    private int f1209y;

    /* renamed from: z */
    private C0328y f1210z;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0257a implements ActionMenuView.C0213d {
        C0257a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0261e eVar = Toolbar.this.f1182M;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0258b implements Runnable {
        C0258b() {
        }

        public void run() {
            Toolbar.this.mo1803P();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0259c implements View.OnClickListener {
        C0259c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1807e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0260d implements C0186m {

        /* renamed from: g */
        C0171g f1217g;

        /* renamed from: h */
        C0175i f1218h;

        C0260d() {
        }

        /* renamed from: D */
        public int mo814D() {
            return 0;
        }

        /* renamed from: E */
        public void mo815E(boolean z) {
            if (this.f1218h != null) {
                C0171g gVar = this.f1217g;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1217g.getItem(i) == this.f1218h) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo816G(this.f1217g, this.f1218h);
                }
            }
        }

        /* renamed from: F */
        public boolean mo836F() {
            return false;
        }

        /* renamed from: G */
        public boolean mo816G(C0171g gVar, C0175i iVar) {
            View view = Toolbar.this.f1199o;
            if (view instanceof C3434c) {
                ((C3434c) view).mo1088e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1199o);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1198n);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1199o = null;
            toolbar3.mo1804a();
            this.f1218h = null;
            Toolbar.this.requestLayout();
            iVar.mo995r(false);
            return true;
        }

        /* renamed from: H */
        public boolean mo817H(C0171g gVar, C0175i iVar) {
            Toolbar.this.mo1842h();
            ViewParent parent = Toolbar.this.f1198n.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1198n);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1198n);
            }
            Toolbar.this.f1199o = iVar.getActionView();
            this.f1218h = iVar;
            ViewParent parent2 = Toolbar.this.f1199o.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1199o);
                }
                LayoutParams n = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                n.f234a = 8388611 | (toolbar4.f1204t & 112);
                n.f1211b = 2;
                toolbar4.f1199o.setLayoutParams(n);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1199o);
            }
            Toolbar.this.mo1797H();
            Toolbar.this.requestLayout();
            iVar.mo995r(true);
            View view = Toolbar.this.f1199o;
            if (view instanceof C3434c) {
                ((C3434c) view).mo1087c();
            }
            return true;
        }

        /* renamed from: J */
        public void mo819J(Context context, C0171g gVar) {
            C0175i iVar;
            C0171g gVar2 = this.f1217g;
            if (!(gVar2 == null || (iVar = this.f1218h) == null)) {
                gVar2.mo927f(iVar);
            }
            this.f1217g = gVar;
        }

        /* renamed from: K */
        public void mo837K(Parcelable parcelable) {
        }

        /* renamed from: L */
        public boolean mo820L(C0195r rVar) {
            return false;
        }

        /* renamed from: M */
        public Parcelable mo838M() {
            return null;
        }

        /* renamed from: c */
        public void mo822c(C0171g gVar, boolean z) {
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public interface C0261e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C */
    private int m1480C(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int r = m1495r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r, max + measuredWidth, view.getMeasuredHeight() + r);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: D */
    private int m1481D(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int r = m1495r(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r, max, view.getMeasuredHeight() + r);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: E */
    private int m1482E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m1483F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m1484G() {
        removeCallbacks(this.f1190U);
        post(this.f1190U);
    }

    /* renamed from: N */
    private boolean m1485N() {
        if (!this.f1189T) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m1486O(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: O */
    private boolean m1486O(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m1487b(List<View> list, int i) {
        boolean z = C3774v.m16151B(this) == 1;
        int childCount = getChildCount();
        int b = C3733e.m15972b(i, C3774v.m16151B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1211b == 0 && m1486O(childAt) && m1494q(layoutParams.f234a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1211b == 0 && m1486O(childAt2) && m1494q(layoutParams2.f234a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m1488c(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1211b = 1;
        if (!z || this.f1199o == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1180K.add(view);
    }

    private MenuInflater getMenuInflater() {
        return new C3439g(getContext());
    }

    /* renamed from: i */
    private void m1489i() {
        if (this.f1210z == null) {
            this.f1210z = new C0328y();
        }
    }

    /* renamed from: j */
    private void m1490j() {
        if (this.f1195k == null) {
            this.f1195k = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: k */
    private void m1491k() {
        m1492l();
        if (this.f1191g.mo1289N() == null) {
            C0171g gVar = (C0171g) this.f1191g.getMenu();
            if (this.f1186Q == null) {
                this.f1186Q = new C0260d();
            }
            this.f1191g.setExpandedActionViewsExclusive(true);
            gVar.mo918c(this.f1186Q, this.f1200p);
        }
    }

    /* renamed from: l */
    private void m1492l() {
        if (this.f1191g == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1191g = actionMenuView;
            actionMenuView.setPopupTheme(this.f1201q);
            this.f1191g.setOnMenuItemClickListener(this.f1183N);
            this.f1191g.mo1290O(this.f1187R, this.f1188S);
            LayoutParams n = generateDefaultLayoutParams();
            n.f234a = 8388613 | (this.f1204t & 112);
            this.f1191g.setLayoutParams(n);
            m1488c(this.f1191g, false);
        }
    }

    /* renamed from: m */
    private void m1493m() {
        if (this.f1194j == null) {
            this.f1194j = new AppCompatImageButton(getContext(), (AttributeSet) null, C3400a.toolbarNavigationButtonStyle);
            LayoutParams n = generateDefaultLayoutParams();
            n.f234a = 8388611 | (this.f1204t & 112);
            this.f1194j.setLayoutParams(n);
        }
    }

    /* renamed from: q */
    private int m1494q(int i) {
        int B = C3774v.m16151B(this);
        int b = C3733e.m15972b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        return B == 1 ? 5 : 3;
    }

    /* renamed from: r */
    private int m1495r(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int s = m1496s(layoutParams.f234a);
        if (s == 48) {
            return getPaddingTop() - i2;
        }
        if (s == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = layoutParams.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = layoutParams.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: s */
    private int m1496s(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1172C & 112;
    }

    /* renamed from: t */
    private int m1497t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C3760h.m16094b(marginLayoutParams) + C3760h.m16093a(marginLayoutParams);
    }

    /* renamed from: u */
    private int m1498u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: v */
    private int m1499v(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m1500z(View view) {
        return view.getParent() == this || this.f1180K.contains(view);
    }

    /* renamed from: A */
    public boolean mo1795A() {
        ActionMenuView actionMenuView = this.f1191g;
        return actionMenuView != null && actionMenuView.mo1286I();
    }

    /* renamed from: B */
    public boolean mo1796B() {
        ActionMenuView actionMenuView = this.f1191g;
        return actionMenuView != null && actionMenuView.mo1287J();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1797H() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1211b == 2 || childAt == this.f1191g)) {
                removeViewAt(childCount);
                this.f1180K.add(childAt);
            }
        }
    }

    /* renamed from: I */
    public void mo1798I(int i, int i2) {
        m1489i();
        this.f1210z.mo2207g(i, i2);
    }

    /* renamed from: J */
    public void mo1799J(C0171g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar != null || this.f1191g != null) {
            m1492l();
            C0171g N = this.f1191g.mo1289N();
            if (N != gVar) {
                if (N != null) {
                    N.mo896Q(this.f1185P);
                    N.mo896Q(this.f1186Q);
                }
                if (this.f1186Q == null) {
                    this.f1186Q = new C0260d();
                }
                actionMenuPresenter.mo1256A(true);
                if (gVar != null) {
                    gVar.mo918c(actionMenuPresenter, this.f1200p);
                    gVar.mo918c(this.f1186Q, this.f1200p);
                } else {
                    actionMenuPresenter.mo819J(this.f1200p, (C0171g) null);
                    this.f1186Q.mo819J(this.f1200p, (C0171g) null);
                    actionMenuPresenter.mo815E(true);
                    this.f1186Q.mo815E(true);
                }
                this.f1191g.setPopupTheme(this.f1201q);
                this.f1191g.setPresenter(actionMenuPresenter);
                this.f1185P = actionMenuPresenter;
            }
        }
    }

    /* renamed from: K */
    public void mo1800K(C0186m.C0187a aVar, C0171g.C0172a aVar2) {
        this.f1187R = aVar;
        this.f1188S = aVar2;
        ActionMenuView actionMenuView = this.f1191g;
        if (actionMenuView != null) {
            actionMenuView.mo1290O(aVar, aVar2);
        }
    }

    /* renamed from: L */
    public void mo1801L(Context context, int i) {
        this.f1203s = i;
        TextView textView = this.f1193i;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: M */
    public void mo1802M(Context context, int i) {
        this.f1202r = i;
        TextView textView = this.f1192h;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: P */
    public boolean mo1803P() {
        ActionMenuView actionMenuView = this.f1191g;
        return actionMenuView != null && actionMenuView.mo1291P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1804a() {
        for (int size = this.f1180K.size() - 1; size >= 0; size--) {
            addView(this.f1180K.get(size));
        }
        this.f1180K.clear();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f1191g;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo1806d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f1191g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo1288K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.mo1806d():boolean");
    }

    /* renamed from: e */
    public void mo1807e() {
        C0175i iVar;
        C0260d dVar = this.f1186Q;
        if (dVar == null) {
            iVar = null;
        } else {
            iVar = dVar.f1218h;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* renamed from: g */
    public void mo1808g() {
        ActionMenuView actionMenuView = this.f1191g;
        if (actionMenuView != null) {
            actionMenuView.mo1279B();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1198n;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1198n;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0328y yVar = this.f1210z;
        if (yVar != null) {
            return yVar.mo2201a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1171B;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0328y yVar = this.f1210z;
        if (yVar != null) {
            return yVar.mo2202b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0328y yVar = this.f1210z;
        if (yVar != null) {
            return yVar.mo2203c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0328y yVar = this.f1210z;
        if (yVar != null) {
            return yVar.mo2204d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1170A;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.mo1289N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1191g
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1289N()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1171B
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C3774v.m16151B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C3774v.m16151B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1170A, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1195k;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1195k;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1491k();
        return this.f1191g.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1194j;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1194j;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1185P;
    }

    public Drawable getOverflowIcon() {
        m1491k();
        return this.f1191g.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1200p;
    }

    public int getPopupTheme() {
        return this.f1201q;
    }

    public CharSequence getSubtitle() {
        return this.f1174E;
    }

    /* access modifiers changed from: package-private */
    public final TextView getSubtitleTextView() {
        return this.f1193i;
    }

    public CharSequence getTitle() {
        return this.f1173D;
    }

    public int getTitleMarginBottom() {
        return this.f1209y;
    }

    public int getTitleMarginEnd() {
        return this.f1207w;
    }

    public int getTitleMarginStart() {
        return this.f1206v;
    }

    public int getTitleMarginTop() {
        return this.f1208x;
    }

    /* access modifiers changed from: package-private */
    public final TextView getTitleTextView() {
        return this.f1192h;
    }

    public C0302o getWrapper() {
        if (this.f1184O == null) {
            this.f1184O = new C0281h0(this, true);
        }
        return this.f1184O;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1842h() {
        if (this.f1198n == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, C3400a.toolbarNavigationButtonStyle);
            this.f1198n = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1196l);
            this.f1198n.setContentDescription(this.f1197m);
            LayoutParams n = generateDefaultLayoutParams();
            n.f234a = 8388611 | (this.f1204t & 112);
            n.f1211b = 2;
            this.f1198n.setLayoutParams(n);
            this.f1198n.setOnClickListener(new C0259c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: o */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1190U);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1178I = false;
        }
        if (!this.f1178I) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1178I = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1178I = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a3 A[LOOP:0: B:101:0x02a1->B:102:0x02a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c5 A[LOOP:1: B:104:0x02c3->B:105:0x02c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fe A[LOOP:2: B:112:0x02fc->B:113:0x02fe, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p082e.p109h.p119p.C3774v.m16151B(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1181L
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p082e.p109h.p119p.C3774v.m16153C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1194j
            boolean r13 = r0.m1486O(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1194j
            int r13 = r0.m1481D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1194j
            int r13 = r0.m1480C(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1198n
            boolean r15 = r0.m1486O(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1198n
            int r14 = r0.m1481D(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1198n
            int r13 = r0.m1480C(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1191g
            boolean r15 = r0.m1486O(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1191g
            int r13 = r0.m1480C(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1191g
            int r14 = r0.m1481D(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1199o
            boolean r13 = r0.m1486O(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1199o
            int r10 = r0.m1481D(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1199o
            int r2 = r0.m1480C(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1195k
            boolean r13 = r0.m1486O(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1195k
            int r10 = r0.m1481D(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1195k
            int r2 = r0.m1480C(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1192h
            boolean r13 = r0.m1486O(r13)
            android.widget.TextView r14 = r0.f1193i
            boolean r14 = r0.m1486O(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1192h
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1192h
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1193i
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1193i
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0294
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1192h
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1193i
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1193i
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1192h
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1192h
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1193i
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1172C
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1208x
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1209y
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1209y
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1208x
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0229
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1206v
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1192h
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1192h
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1192h
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1192h
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1207w
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021d
            android.widget.TextView r1 = r0.f1193i
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1193i
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1193i
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1193i
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f1207w
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x021e
        L_0x021d:
            r3 = r10
        L_0x021e:
            if (r17 == 0) goto L_0x0225
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0225:
            r2 = r24
            goto L_0x0128
        L_0x0229:
            if (r17 == 0) goto L_0x022f
            int r7 = r0.f1206v
            r1 = 0
            goto L_0x0231
        L_0x022f:
            r1 = 0
            r7 = 0
        L_0x0231:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0266
            android.widget.TextView r3 = r0.f1192h
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.widget.TextView r4 = r0.f1192h
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1192h
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1192h
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1207w
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0267
        L_0x0266:
            r4 = r2
        L_0x0267:
            if (r14 == 0) goto L_0x028d
            android.widget.TextView r3 = r0.f1193i
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r5 = r3.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f1193i
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r2
            android.widget.TextView r6 = r0.f1193i
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f1193i
            r7.layout(r2, r8, r5, r6)
            int r6 = r0.f1207w
            int r5 = r5 + r6
            int r3 = r3.bottomMargin
            goto L_0x028e
        L_0x028d:
            r5 = r2
        L_0x028e:
            if (r17 == 0) goto L_0x0294
            int r2 = java.lang.Math.max(r4, r5)
        L_0x0294:
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            r4 = 3
            r0.m1487b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            int r3 = r3.size()
            r7 = 0
        L_0x02a1:
            if (r7 >= r3) goto L_0x02b4
            java.util.ArrayList<android.view.View> r4 = r0.f1179J
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.m1480C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x02a1
        L_0x02b4:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            r4 = 5
            r0.m1487b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            int r3 = r3.size()
            r7 = 0
        L_0x02c3:
            if (r7 >= r3) goto L_0x02d4
            java.util.ArrayList<android.view.View> r4 = r0.f1179J
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m1481D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02c3
        L_0x02d4:
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            r4 = 1
            r0.m1487b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            int r3 = r0.m1499v(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02ef
            goto L_0x02f6
        L_0x02ef:
            if (r3 <= r10) goto L_0x02f5
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f6
        L_0x02f5:
            r2 = r6
        L_0x02f6:
            java.util.ArrayList<android.view.View> r3 = r0.f1179J
            int r3 = r3.size()
        L_0x02fc:
            if (r1 >= r3) goto L_0x030d
            java.util.ArrayList<android.view.View> r4 = r0.f1179J
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.m1480C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02fc
        L_0x030d:
            java.util.ArrayList<android.view.View> r1 = r0.f1179J
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1181L;
        int i10 = 0;
        if (C0299m0.m1793b(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1486O(this.f1194j)) {
            m1483F(this.f1194j, i, 0, i2, 0, this.f1205u);
            i5 = this.f1194j.getMeasuredWidth() + m1497t(this.f1194j);
            i4 = Math.max(0, this.f1194j.getMeasuredHeight() + m1498u(this.f1194j));
            i3 = View.combineMeasuredStates(0, this.f1194j.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1486O(this.f1198n)) {
            m1483F(this.f1198n, i, 0, i2, 0, this.f1205u);
            i5 = this.f1198n.getMeasuredWidth() + m1497t(this.f1198n);
            i4 = Math.max(i4, this.f1198n.getMeasuredHeight() + m1498u(this.f1198n));
            i3 = View.combineMeasuredStates(i3, this.f1198n.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m1486O(this.f1191g)) {
            m1483F(this.f1191g, i, max, i2, 0, this.f1205u);
            i6 = this.f1191g.getMeasuredWidth() + m1497t(this.f1191g);
            i4 = Math.max(i4, this.f1191g.getMeasuredHeight() + m1498u(this.f1191g));
            i3 = View.combineMeasuredStates(i3, this.f1191g.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m1486O(this.f1199o)) {
            max2 += m1482E(this.f1199o, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1199o.getMeasuredHeight() + m1498u(this.f1199o));
            i3 = View.combineMeasuredStates(i3, this.f1199o.getMeasuredState());
        }
        if (m1486O(this.f1195k)) {
            max2 += m1482E(this.f1195k, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1195k.getMeasuredHeight() + m1498u(this.f1195k));
            i3 = View.combineMeasuredStates(i3, this.f1195k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1211b == 0 && m1486O(childAt)) {
                max2 += m1482E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1498u(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1208x + this.f1209y;
        int i13 = this.f1206v + this.f1207w;
        if (m1486O(this.f1192h)) {
            m1482E(this.f1192h, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1192h.getMeasuredWidth() + m1497t(this.f1192h);
            i7 = this.f1192h.getMeasuredHeight() + m1498u(this.f1192h);
            i9 = View.combineMeasuredStates(i3, this.f1192h.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1486O(this.f1193i)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m1482E(this.f1193i, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1193i.getMeasuredHeight() + m1498u(this.f1193i);
            i9 = View.combineMeasuredStates(i9, this.f1193i.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!m1485N()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        ActionMenuView actionMenuView = this.f1191g;
        C0171g N = actionMenuView != null ? actionMenuView.mo1289N() : null;
        int i = savedState.f1212i;
        if (!(i == 0 || this.f1186Q == null || N == null || (findItem = N.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1213j) {
            m1484G();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1489i();
        C0328y yVar = this.f1210z;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        yVar.mo2206f(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0175i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0260d dVar = this.f1186Q;
        if (!(dVar == null || (iVar = dVar.f1218h) == null)) {
            savedState.f1212i = iVar.getItemId();
        }
        savedState.f1213j = mo1796B();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1177H = false;
        }
        if (!this.f1177H) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1177H = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1177H = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C3410a.m14543d(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1189T = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1171B) {
            this.f1171B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1170A) {
            this.f1170A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C3410a.m14543d(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C3410a.m14543d(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1493m();
        this.f1194j.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0261e eVar) {
        this.f1182M = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        m1491k();
        this.f1191g.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1201q != i) {
            this.f1201q = i;
            if (i == 0) {
                this.f1200p = getContext();
            } else {
                this.f1200p = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1209y = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1207w = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1206v = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1208x = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: w */
    public boolean mo1885w() {
        C0260d dVar = this.f1186Q;
        return (dVar == null || dVar.f1218h == null) ? false : true;
    }

    /* renamed from: x */
    public boolean mo1886x() {
        ActionMenuView actionMenuView = this.f1191g;
        return actionMenuView != null && actionMenuView.mo1285H();
    }

    /* renamed from: y */
    public void mo1887y(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f1211b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1888a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f234a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1211b = layoutParams.f1211b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo1888a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1842h();
        }
        ImageButton imageButton = this.f1198n;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1842h();
            this.f1198n.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1198n;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1196l);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1490j();
            if (!m1500z(this.f1195k)) {
                m1488c(this.f1195k, true);
            }
        } else {
            ImageView imageView = this.f1195k;
            if (imageView != null && m1500z(imageView)) {
                removeView(this.f1195k);
                this.f1180K.remove(this.f1195k);
            }
        }
        ImageView imageView2 = this.f1195k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1490j();
        }
        ImageView imageView = this.f1195k;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1493m();
        }
        ImageButton imageButton = this.f1194j;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1493m();
            if (!m1500z(this.f1194j)) {
                m1488c(this.f1194j, true);
            }
        } else {
            ImageButton imageButton = this.f1194j;
            if (imageButton != null && m1500z(imageButton)) {
                removeView(this.f1194j);
                this.f1180K.remove(this.f1194j);
            }
        }
        ImageButton imageButton2 = this.f1194j;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1193i == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1193i = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1193i.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1203s;
                if (i != 0) {
                    this.f1193i.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1176G;
                if (colorStateList != null) {
                    this.f1193i.setTextColor(colorStateList);
                }
            }
            if (!m1500z(this.f1193i)) {
                m1488c(this.f1193i, true);
            }
        } else {
            TextView textView = this.f1193i;
            if (textView != null && m1500z(textView)) {
                removeView(this.f1193i);
                this.f1180K.remove(this.f1193i);
            }
        }
        TextView textView2 = this.f1193i;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1174E = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1176G = colorStateList;
        TextView textView = this.f1193i;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1192h == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1192h = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1192h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1202r;
                if (i != 0) {
                    this.f1192h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1175F;
                if (colorStateList != null) {
                    this.f1192h.setTextColor(colorStateList);
                }
            }
            if (!m1500z(this.f1192h)) {
                m1488c(this.f1192h, true);
            }
        } else {
            TextView textView = this.f1192h;
            if (textView != null && m1500z(textView)) {
                removeView(this.f1192h);
                this.f1180K.remove(this.f1192h);
            }
        }
        TextView textView2 = this.f1192h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1173D = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1175F = colorStateList;
        TextView textView = this.f1192h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0256a();

        /* renamed from: i */
        int f1212i;

        /* renamed from: j */
        boolean f1213j;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        class C0256a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0256a() {
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
            this.f1212i = parcel.readInt();
            this.f1213j = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1212i);
            parcel.writeInt(this.f1213j ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1172C = 8388627;
        this.f1179J = new ArrayList<>();
        this.f1180K = new ArrayList<>();
        this.f1181L = new int[2];
        this.f1183N = new C0257a();
        this.f1190U = new C0258b();
        Context context2 = getContext();
        int[] iArr = C3409j.Toolbar;
        C0279g0 v = C0279g0.m1627v(context2, attributeSet, iArr, i, 0);
        C3774v.m16213m0(this, context, iArr, attributeSet, v.mo1993r(), i, 0);
        this.f1202r = v.mo1989n(C3409j.Toolbar_titleTextAppearance, 0);
        this.f1203s = v.mo1989n(C3409j.Toolbar_subtitleTextAppearance, 0);
        this.f1172C = v.mo1987l(C3409j.Toolbar_android_gravity, this.f1172C);
        this.f1204t = v.mo1987l(C3409j.Toolbar_buttonGravity, 48);
        int e = v.mo1980e(C3409j.Toolbar_titleMargin, 0);
        int i2 = C3409j.Toolbar_titleMargins;
        e = v.mo1994s(i2) ? v.mo1980e(i2, e) : e;
        this.f1209y = e;
        this.f1208x = e;
        this.f1207w = e;
        this.f1206v = e;
        int e2 = v.mo1980e(C3409j.Toolbar_titleMarginStart, -1);
        if (e2 >= 0) {
            this.f1206v = e2;
        }
        int e3 = v.mo1980e(C3409j.Toolbar_titleMarginEnd, -1);
        if (e3 >= 0) {
            this.f1207w = e3;
        }
        int e4 = v.mo1980e(C3409j.Toolbar_titleMarginTop, -1);
        if (e4 >= 0) {
            this.f1208x = e4;
        }
        int e5 = v.mo1980e(C3409j.Toolbar_titleMarginBottom, -1);
        if (e5 >= 0) {
            this.f1209y = e5;
        }
        this.f1205u = v.mo1981f(C3409j.Toolbar_maxButtonHeight, -1);
        int e6 = v.mo1980e(C3409j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e7 = v.mo1980e(C3409j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f = v.mo1981f(C3409j.Toolbar_contentInsetLeft, 0);
        int f2 = v.mo1981f(C3409j.Toolbar_contentInsetRight, 0);
        m1489i();
        this.f1210z.mo2205e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1210z.mo2207g(e6, e7);
        }
        this.f1170A = v.mo1980e(C3409j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1171B = v.mo1980e(C3409j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1196l = v.mo1982g(C3409j.Toolbar_collapseIcon);
        this.f1197m = v.mo1991p(C3409j.Toolbar_collapseContentDescription);
        CharSequence p = v.mo1991p(C3409j.Toolbar_title);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo1991p(C3409j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1200p = getContext();
        setPopupTheme(v.mo1989n(C3409j.Toolbar_popupTheme, 0));
        Drawable g = v.mo1982g(C3409j.Toolbar_navigationIcon);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo1991p(C3409j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo1982g(C3409j.Toolbar_logo);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo1991p(C3409j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = C3409j.Toolbar_titleTextColor;
        if (v.mo1994s(i3)) {
            setTitleTextColor(v.mo1978c(i3));
        }
        int i4 = C3409j.Toolbar_subtitleTextColor;
        if (v.mo1994s(i4)) {
            setSubtitleTextColor(v.mo1978c(i4));
        }
        int i5 = C3409j.Toolbar_menu;
        if (v.mo1994s(i5)) {
            mo1887y(v.mo1989n(i5, 0));
        }
        v.mo1995w();
    }
}
