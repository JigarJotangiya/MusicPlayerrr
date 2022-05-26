package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements C0171g.C0173b, C0188n {

    /* renamed from: A */
    private C0186m.C0187a f876A;

    /* renamed from: B */
    C0171g.C0172a f877B;

    /* renamed from: C */
    private boolean f878C;

    /* renamed from: D */
    private int f879D;

    /* renamed from: E */
    private int f880E;

    /* renamed from: F */
    private int f881F;

    /* renamed from: G */
    C0213d f882G;

    /* renamed from: v */
    private C0171g f883v;

    /* renamed from: w */
    private Context f884w;

    /* renamed from: x */
    private int f885x;

    /* renamed from: y */
    private boolean f886y;

    /* renamed from: z */
    private ActionMenuPresenter f887z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public boolean f888c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public int f889d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public int f890e;
        @ViewDebug.ExportedProperty

        /* renamed from: f */
        public boolean f891f;
        @ViewDebug.ExportedProperty

        /* renamed from: g */
        public boolean f892g;

        /* renamed from: h */
        boolean f893h;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f888c = layoutParams.f888c;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f888c = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0210a {
        /* renamed from: a */
        boolean mo718a();

        /* renamed from: b */
        boolean mo719b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0211b implements C0186m.C0187a {
        C0211b() {
        }

        /* renamed from: c */
        public void mo590c(C0171g gVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo591d(C0171g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    private class C0212c implements C0171g.C0172a {
        C0212c() {
        }

        /* renamed from: a */
        public boolean mo532a(C0171g gVar, MenuItem menuItem) {
            C0213d dVar = ActionMenuView.this.f882G;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        /* renamed from: b */
        public void mo534b(C0171g gVar) {
            C0171g.C0172a aVar = ActionMenuView.this.f877B;
            if (aVar != null) {
                aVar.mo534b(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0213d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: L */
    static int m1263L(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo728p();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f888c || !z2) {
            z = false;
        }
        layoutParams.f891f = z;
        layoutParams.f889d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: M */
    private void m1264M(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i7 = size - paddingLeft;
        int i8 = this.f880E;
        int i9 = i7 / i8;
        int i10 = i7 % i8;
        if (i9 == 0) {
            setMeasuredDimension(i7, 0);
            return;
        }
        int i11 = i8 + (i10 / i9);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        boolean z5 = false;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        long j = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            int i17 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z6 = childAt instanceof ActionMenuItemView;
                int i18 = i14 + 1;
                if (z6) {
                    int i19 = this.f881F;
                    i6 = i18;
                    z4 = false;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    i6 = i18;
                    z4 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f893h = z4;
                layoutParams.f890e = z4 ? 1 : 0;
                layoutParams.f889d = z4;
                layoutParams.f891f = z4;
                layoutParams.leftMargin = z4;
                layoutParams.rightMargin = z4;
                layoutParams.f892g = z6 && ((ActionMenuItemView) childAt).mo728p();
                int L = m1263L(childAt, i11, layoutParams.f888c ? 1 : i9, childMeasureSpec, paddingTop);
                i15 = Math.max(i15, L);
                if (layoutParams.f891f) {
                    i16++;
                }
                if (layoutParams.f888c) {
                    z5 = true;
                }
                i9 -= L;
                i12 = Math.max(i12, childAt.getMeasuredHeight());
                if (L == 1) {
                    j |= (long) (1 << i13);
                    i12 = i12;
                } else {
                    int i20 = i12;
                }
                i14 = i6;
            }
            i13++;
            size2 = i17;
        }
        int i21 = size2;
        boolean z7 = z5 && i14 == 2;
        boolean z8 = false;
        while (true) {
            if (i16 <= 0 || i9 <= 0) {
                i5 = mode;
                i3 = i7;
                z = z8;
                i4 = i12;
            } else {
                int i22 = 0;
                int i23 = 0;
                int i24 = Integer.MAX_VALUE;
                long j2 = 0;
                while (i23 < childCount) {
                    boolean z9 = z8;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                    int i25 = i12;
                    if (layoutParams2.f891f) {
                        int i26 = layoutParams2.f889d;
                        if (i26 < i24) {
                            j2 = 1 << i23;
                            i24 = i26;
                            i22 = 1;
                        } else if (i26 == i24) {
                            i22++;
                            j2 |= 1 << i23;
                        }
                    }
                    i23++;
                    i12 = i25;
                    z8 = z9;
                }
                z = z8;
                i4 = i12;
                j |= j2;
                if (i22 > i9) {
                    i5 = mode;
                    i3 = i7;
                    break;
                }
                int i27 = i24 + 1;
                int i28 = 0;
                while (i28 < childCount) {
                    View childAt2 = getChildAt(i28);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i29 = i7;
                    int i30 = mode;
                    long j3 = (long) (1 << i28);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.f889d == i27) {
                            j |= j3;
                        }
                        z3 = z7;
                    } else {
                        if (!z7 || !layoutParams3.f892g || i9 != 1) {
                            z3 = z7;
                        } else {
                            int i31 = this.f881F;
                            z3 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        }
                        layoutParams3.f889d++;
                        layoutParams3.f893h = true;
                        i9--;
                    }
                    i28++;
                    mode = i30;
                    i7 = i29;
                    z7 = z3;
                }
                i12 = i4;
                z8 = true;
            }
        }
        boolean z10 = !z5 && i14 == 1;
        if (i9 <= 0 || j == 0 || (i9 >= i14 - 1 && !z10 && i15 <= 1)) {
            z2 = z;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z10) {
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f892g) {
                    bitCount -= 0.5f;
                }
                int i32 = childCount - 1;
                if ((j & ((long) (1 << i32))) != 0 && !((LayoutParams) getChildAt(i32).getLayoutParams()).f892g) {
                    bitCount -= 0.5f;
                }
            }
            int i33 = bitCount > 0.0f ? (int) (((float) (i9 * i11)) / bitCount) : 0;
            z2 = z;
            for (int i34 = 0; i34 < childCount; i34++) {
                if ((j & ((long) (1 << i34))) != 0) {
                    View childAt3 = getChildAt(i34);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f890e = i33;
                        layoutParams4.f893h = true;
                        if (i34 == 0 && !layoutParams4.f892g) {
                            layoutParams4.leftMargin = (-i33) / 2;
                        }
                    } else if (layoutParams4.f888c) {
                        layoutParams4.f890e = i33;
                        layoutParams4.f893h = true;
                        layoutParams4.rightMargin = (-i33) / 2;
                    } else {
                        if (i34 != 0) {
                            layoutParams4.leftMargin = i33 / 2;
                        }
                        if (i34 != childCount - 1) {
                            layoutParams4.rightMargin = i33 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i35 = 0; i35 < childCount; i35++) {
                View childAt4 = getChildAt(i35);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f893h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f889d * i11) + layoutParams5.f890e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i21);
    }

    /* renamed from: B */
    public void mo1279B() {
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1262s();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public LayoutParams mo1301l() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f1012b = 16;
        return layoutParams;
    }

    /* renamed from: D */
    public LayoutParams mo1302m(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public LayoutParams mo1303o(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return mo1301l();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.f1012b <= 0) {
            layoutParams2.f1012b = 16;
        }
        return layoutParams2;
    }

    /* renamed from: F */
    public LayoutParams mo1283F() {
        LayoutParams C = mo1301l();
        C.f888c = true;
        return C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public boolean mo1284G(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0210a)) {
            z = false | ((C0210a) childAt).mo718a();
        }
        return (i <= 0 || !(childAt2 instanceof C0210a)) ? z : z | ((C0210a) childAt2).mo719b();
    }

    /* renamed from: H */
    public boolean mo1285H() {
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        return actionMenuPresenter != null && actionMenuPresenter.mo1264v();
    }

    /* renamed from: I */
    public boolean mo1286I() {
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        return actionMenuPresenter != null && actionMenuPresenter.mo1266x();
    }

    /* renamed from: J */
    public boolean mo1287J() {
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        return actionMenuPresenter != null && actionMenuPresenter.mo1267y();
    }

    /* renamed from: K */
    public boolean mo1288K() {
        return this.f886y;
    }

    /* renamed from: N */
    public C0171g mo1289N() {
        return this.f883v;
    }

    /* renamed from: O */
    public void mo1290O(C0186m.C0187a aVar, C0171g.C0172a aVar2) {
        this.f876A = aVar;
        this.f877B = aVar2;
    }

    /* renamed from: P */
    public boolean mo1291P() {
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        return actionMenuPresenter != null && actionMenuPresenter.mo1260O();
    }

    /* renamed from: a */
    public boolean mo740a(C0175i iVar) {
        return this.f883v.mo894N(iVar, 0);
    }

    /* renamed from: b */
    public void mo741b(C0171g gVar) {
        this.f883v = gVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f883v == null) {
            Context context = getContext();
            C0171g gVar = new C0171g(context);
            this.f883v = gVar;
            gVar.mo901V(new C0212c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f887z = actionMenuPresenter;
            actionMenuPresenter.mo1259N(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f887z;
            C0186m.C0187a aVar = this.f876A;
            if (aVar == null) {
                aVar = new C0211b();
            }
            actionMenuPresenter2.mo818I(aVar);
            this.f883v.mo918c(this.f887z, this.f884w);
            this.f887z.mo1257B(this);
        }
        return this.f883v;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f887z.mo1263u();
    }

    public int getPopupTheme() {
        return this.f885x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f887z;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo815E(false);
            if (this.f887z.mo1267y()) {
                this.f887z.mo1264v();
                this.f887z.mo1260O();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1279B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.f878C) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b = C0299m0.m1793b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f888c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1284G(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + layoutParams.leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1284G(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f888c) {
                    int i17 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f888c) {
                int i20 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0171g gVar;
        boolean z = this.f878C;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f878C = z2;
        if (z != z2) {
            this.f879D = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f878C || (gVar = this.f883v) == null || size == this.f879D)) {
            this.f879D = size;
            gVar.mo893M(true);
        }
        int childCount = getChildCount();
        if (!this.f878C || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1264M(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f887z.mo1256A(z);
    }

    public void setOnMenuItemClickListener(C0213d dVar) {
        this.f882G = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f887z.mo1258C(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f886y = z;
    }

    public void setPopupTheme(int i) {
        if (this.f885x != i) {
            this.f885x = i;
            if (i == 0) {
                this.f884w = getContext();
            } else {
                this.f884w = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f887z = actionMenuPresenter;
        actionMenuPresenter.mo1257B(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f880E = (int) (56.0f * f);
        this.f881F = (int) (f * 4.0f);
        this.f884w = context;
        this.f885x = 0;
    }
}
