package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.C0285i0;
import androidx.core.content.C0506a;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C5908a;
import p082e.p109h.p119p.C3771s;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7493e;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7498j;

/* renamed from: com.google.android.material.navigation.a */
/* compiled from: NavigationBarItemView */
public abstract class C6116a extends FrameLayout implements C0188n.C0189a {

    /* renamed from: w */
    private static final int[] f28583w = {16842912};

    /* renamed from: g */
    private final int f28584g;

    /* renamed from: h */
    private float f28585h;

    /* renamed from: i */
    private float f28586i;

    /* renamed from: j */
    private float f28587j;

    /* renamed from: k */
    private int f28588k;

    /* renamed from: l */
    private boolean f28589l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ImageView f28590m;

    /* renamed from: n */
    private final ViewGroup f28591n;

    /* renamed from: o */
    private final TextView f28592o;

    /* renamed from: p */
    private final TextView f28593p;

    /* renamed from: q */
    private int f28594q = -1;

    /* renamed from: r */
    private C0175i f28595r;

    /* renamed from: s */
    private ColorStateList f28596s;

    /* renamed from: t */
    private Drawable f28597t;

    /* renamed from: u */
    private Drawable f28598u;

    /* renamed from: v */
    private BadgeDrawable f28599v;

    /* renamed from: com.google.android.material.navigation.a$a */
    /* compiled from: NavigationBarItemView */
    class C6117a implements View.OnLayoutChangeListener {
        C6117a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C6116a.this.f28590m.getVisibility() == 0) {
                C6116a aVar = C6116a.this;
                aVar.m36649l(aVar.f28590m);
            }
        }
    }

    public C6116a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f28590m = (ImageView) findViewById(C7494f.navigation_bar_item_icon_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(C7494f.navigation_bar_item_labels_group);
        this.f28591n = viewGroup;
        TextView textView = (TextView) findViewById(C7494f.navigation_bar_item_small_label_view);
        this.f28592o = textView;
        TextView textView2 = (TextView) findViewById(C7494f.navigation_bar_item_large_label_view);
        this.f28593p = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f28584g = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(C7494f.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        C3774v.m16237y0(textView, 2);
        C3774v.m16237y0(textView2, 2);
        setFocusable(true);
        m36642c(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f28590m;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C6117a());
        }
    }

    /* renamed from: c */
    private void m36642c(float f, float f2) {
        this.f28585h = f - f2;
        this.f28586i = (f2 * 1.0f) / f;
        this.f28587j = (f * 1.0f) / f2;
    }

    /* renamed from: e */
    private FrameLayout m36643e(View view) {
        ImageView imageView = this.f28590m;
        if (view != imageView || !C5908a.f27741a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: f */
    private boolean m36644f() {
        return this.f28599v != null;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C6116a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        BadgeDrawable badgeDrawable = this.f28599v;
        int minimumHeight = badgeDrawable != null ? badgeDrawable.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) this.f28590m.getLayoutParams()).topMargin) + this.f28590m.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        int i;
        BadgeDrawable badgeDrawable = this.f28599v;
        if (badgeDrawable == null) {
            i = 0;
        } else {
            i = badgeDrawable.getMinimumWidth() - this.f28599v.mo22937j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28590m.getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f28590m.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: h */
    private static void m36645h(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private static void m36646i(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: j */
    private void m36647j(View view) {
        if (m36644f() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C5908a.m35358a(this.f28599v, view, m36643e(view));
        }
    }

    /* renamed from: k */
    private void m36648k(View view) {
        if (m36644f()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C5908a.m35361d(this.f28599v, view);
            }
            this.f28599v = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m36649l(View view) {
        if (m36644f()) {
            C5908a.m35362e(this.f28599v, view, m36643e(view));
        }
    }

    /* renamed from: m */
    private static void m36650m(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: d */
    public boolean mo720d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24327g() {
        m36648k(this.f28590m);
    }

    public BadgeDrawable getBadge() {
        return this.f28599v;
    }

    /* access modifiers changed from: protected */
    public int getItemBackgroundResId() {
        return C7493e.mtrl_navigation_bar_item_background;
    }

    public C0175i getItemData() {
        return this.f28595r;
    }

    /* access modifiers changed from: protected */
    public int getItemDefaultMarginResId() {
        return C7492d.mtrl_navigation_bar_item_default_margin;
    }

    /* access modifiers changed from: protected */
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f28594q;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28591n.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f28591n.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28591n.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f28591n.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: n */
    public void mo722n(C0175i iVar, int i) {
        CharSequence charSequence;
        this.f28595r = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(iVar.getTooltipText())) {
            charSequence = iVar.getTooltipText();
        } else {
            charSequence = iVar.getTitle();
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21 || i2 > 23) {
            C0285i0.m1700a(this, charSequence);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0175i iVar = this.f28595r;
        if (iVar != null && iVar.isCheckable() && this.f28595r.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f28583w);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f28599v;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f28595r.getTitle();
            if (!TextUtils.isEmpty(this.f28595r.getContentDescription())) {
                title = this.f28595r.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f28599v.mo22934h());
        }
        C3736c I0 = C3736c.m15976I0(accessibilityNodeInfo);
        I0.mo13120f0(C3736c.C3739c.m16068a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            I0.mo13116d0(false);
            I0.mo13104T(C3736c.C3737a.f11794g);
        }
        I0.mo13149w0(getResources().getString(C7498j.item_view_role_description));
    }

    /* access modifiers changed from: package-private */
    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f28599v = badgeDrawable;
        ImageView imageView = this.f28590m;
        if (imageView != null) {
            m36647j(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f28593p;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f28593p;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f28592o;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f28592o;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f28588k;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m36645h(this.f28590m, this.f28584g, 49);
                    ViewGroup viewGroup = this.f28591n;
                    m36650m(viewGroup, ((Integer) viewGroup.getTag(C7494f.mtrl_view_tag_bottom_padding)).intValue());
                    this.f28593p.setVisibility(0);
                } else {
                    m36645h(this.f28590m, this.f28584g, 17);
                    m36650m(this.f28591n, 0);
                    this.f28593p.setVisibility(4);
                }
                this.f28592o.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup2 = this.f28591n;
                m36650m(viewGroup2, ((Integer) viewGroup2.getTag(C7494f.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    m36645h(this.f28590m, (int) (((float) this.f28584g) + this.f28585h), 49);
                    m36646i(this.f28593p, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f28592o;
                    float f = this.f28586i;
                    m36646i(textView5, f, f, 4);
                } else {
                    m36645h(this.f28590m, this.f28584g, 49);
                    TextView textView6 = this.f28593p;
                    float f2 = this.f28587j;
                    m36646i(textView6, f2, f2, 4);
                    m36646i(this.f28592o, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m36645h(this.f28590m, this.f28584g, 17);
                this.f28593p.setVisibility(8);
                this.f28592o.setVisibility(8);
            }
        } else if (this.f28589l) {
            if (z) {
                m36645h(this.f28590m, this.f28584g, 49);
                ViewGroup viewGroup3 = this.f28591n;
                m36650m(viewGroup3, ((Integer) viewGroup3.getTag(C7494f.mtrl_view_tag_bottom_padding)).intValue());
                this.f28593p.setVisibility(0);
            } else {
                m36645h(this.f28590m, this.f28584g, 17);
                m36650m(this.f28591n, 0);
                this.f28593p.setVisibility(4);
            }
            this.f28592o.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f28591n;
            m36650m(viewGroup4, ((Integer) viewGroup4.getTag(C7494f.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                m36645h(this.f28590m, (int) (((float) this.f28584g) + this.f28585h), 49);
                m36646i(this.f28593p, 1.0f, 1.0f, 0);
                TextView textView7 = this.f28592o;
                float f3 = this.f28586i;
                m36646i(textView7, f3, f3, 4);
            } else {
                m36645h(this.f28590m, this.f28584g, 49);
                TextView textView8 = this.f28593p;
                float f4 = this.f28587j;
                m36646i(textView8, f4, f4, 4);
                m36646i(this.f28592o, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f28592o.setEnabled(z);
        this.f28593p.setEnabled(z);
        this.f28590m.setEnabled(z);
        if (z) {
            C3774v.m16158E0(this, C3771s.m16145b(getContext(), 1002));
        } else {
            C3774v.m16158E0(this, (C3771s) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f28597t) {
            this.f28597t = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0534a.m3292r(drawable).mutate();
                this.f28598u = drawable;
                ColorStateList colorStateList = this.f28596s;
                if (colorStateList != null) {
                    C0534a.m3289o(drawable, colorStateList);
                }
            }
            this.f28590m.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28590m.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f28590m.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f28596s = colorStateList;
        if (this.f28595r != null && (drawable = this.f28598u) != null) {
            C0534a.m3289o(drawable, colorStateList);
            this.f28598u.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0506a.m3152d(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f28594q = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f28588k != i) {
            this.f28588k = i;
            C0175i iVar = this.f28595r;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f28589l != z) {
            this.f28589l = z;
            C0175i iVar = this.f28595r;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C0556l.m3435q(this.f28593p, i);
        m36642c(this.f28592o.getTextSize(), this.f28593p.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C0556l.m3435q(this.f28592o, i);
        m36642c(this.f28592o.getTextSize(), this.f28593p.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f28592o.setTextColor(colorStateList);
            this.f28593p.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f28592o.setText(charSequence);
        this.f28593p.setText(charSequence);
        C0175i iVar = this.f28595r;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0175i iVar2 = this.f28595r;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.f28595r.getTooltipText();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 21 || i > 23) {
            C0285i0.m1700a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C3774v.m16223r0(this, drawable);
    }
}
