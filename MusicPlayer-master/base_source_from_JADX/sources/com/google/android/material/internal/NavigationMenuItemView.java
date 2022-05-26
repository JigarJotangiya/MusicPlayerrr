package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.C0285i0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.p003d.C0524f;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import p082e.p083a.C3400a;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7493e;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0188n.C0189a {

    /* renamed from: L */
    private static final int[] f28386L = {16842912};

    /* renamed from: B */
    private int f28387B;

    /* renamed from: C */
    private boolean f28388C;

    /* renamed from: D */
    boolean f28389D;

    /* renamed from: E */
    private final CheckedTextView f28390E;

    /* renamed from: F */
    private FrameLayout f28391F;

    /* renamed from: G */
    private C0175i f28392G;

    /* renamed from: H */
    private ColorStateList f28393H;

    /* renamed from: I */
    private boolean f28394I;

    /* renamed from: J */
    private Drawable f28395J;

    /* renamed from: K */
    private final C3704a f28396K;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C6056a extends C3704a {
        C6056a() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            cVar.mo13110a0(NavigationMenuItemView.this.f28389D);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    private void m36362B() {
        if (m36364E()) {
            this.f28390E.setVisibility(8);
            FrameLayout frameLayout = this.f28391F;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f28391F.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f28390E.setVisibility(0);
        FrameLayout frameLayout2 = this.f28391F;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f28391F.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m36363C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C3400a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f28386L, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: E */
    private boolean m36364E() {
        return this.f28392G.getTitle() == null && this.f28392G.getIcon() == null && this.f28392G.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f28391F == null) {
                this.f28391F = (FrameLayout) ((ViewStub) findViewById(C7494f.design_menu_item_action_area_stub)).inflate();
            }
            this.f28391F.removeAllViews();
            this.f28391F.addView(view);
        }
    }

    /* renamed from: D */
    public void mo24067D() {
        FrameLayout frameLayout = this.f28391F;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f28390E.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: d */
    public boolean mo720d() {
        return false;
    }

    public C0175i getItemData() {
        return this.f28392G;
    }

    /* renamed from: n */
    public void mo722n(C0175i iVar, int i) {
        this.f28392G = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C3774v.m16223r0(this, m36363C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0285i0.m1700a(this, iVar.getTooltipText());
        m36362B();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0175i iVar = this.f28392G;
        if (iVar != null && iVar.isCheckable() && this.f28392G.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f28386L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f28389D != z) {
            this.f28389D = z;
            this.f28396K.mo5408l(this.f28390E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f28390E.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f28394I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0534a.m3292r(drawable).mutate();
                C0534a.m3289o(drawable, this.f28393H);
            }
            int i = this.f28387B;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f28388C) {
            if (this.f28395J == null) {
                Drawable f = C0524f.m3225f(getResources(), C7493e.navigation_empty_icon, getContext().getTheme());
                this.f28395J = f;
                if (f != null) {
                    int i2 = this.f28387B;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f28395J;
        }
        C0556l.m3430l(this.f28390E, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f28390E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f28387B = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f28393H = colorStateList;
        this.f28394I = colorStateList != null;
        C0175i iVar = this.f28392G;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f28390E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f28388C = z;
    }

    public void setTextAppearance(int i) {
        C0556l.m3435q(this.f28390E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f28390E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f28390E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6056a aVar = new C6056a();
        this.f28396K = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C7496h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C7492d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C7494f.design_menu_item_text);
        this.f28390E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C3774v.m16217o0(checkedTextView, aVar);
    }
}
