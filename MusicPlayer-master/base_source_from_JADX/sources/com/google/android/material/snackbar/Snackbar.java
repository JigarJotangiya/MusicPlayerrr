package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7496h;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: z */
    private static final int[] f28863z = {C7490b.snackbarButtonStyle, C7490b.snackbarTextViewStyle};

    /* renamed from: x */
    private final AccessibilityManager f28864x;

    /* renamed from: y */
    private boolean f28865y;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C6186v {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C6188a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ View.OnClickListener f28866g;

        C6188a(View.OnClickListener onClickListener) {
            this.f28866g = onClickListener;
        }

        public void onClick(View view) {
            this.f28866g.onClick(view);
            Snackbar.this.mo24644t(1);
        }
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, C6189a aVar) {
        super(context, viewGroup, view, aVar);
        this.f28864x = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: V */
    private static ViewGroup m37000V(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: W */
    private static boolean m37001W(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f28863z);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static Snackbar m37002X(View view, CharSequence charSequence, int i) {
        return m37003Y((Context) null, view, charSequence, i);
    }

    /* renamed from: Y */
    private static Snackbar m37003Y(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup V = m37000V(view);
        if (V != null) {
            if (context == null) {
                context = V.getContext();
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m37001W(context) ? C7496h.mtrl_layout_snackbar_include : C7496h.design_layout_snackbar_include, V, false);
            Snackbar snackbar = new Snackbar(context, V, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo24689b0(charSequence);
            snackbar.mo24638J(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: N */
    public void mo24640N() {
        super.mo24640N();
    }

    /* renamed from: Z */
    public Snackbar mo24687Z(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f28814c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener((View.OnClickListener) null);
            this.f28865y = false;
        } else {
            this.f28865y = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C6188a(onClickListener));
        }
        return this;
    }

    /* renamed from: a0 */
    public Snackbar mo24688a0(int i) {
        ((SnackbarContentLayout) this.f28814c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    /* renamed from: b0 */
    public Snackbar mo24689b0(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f28814c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: s */
    public void mo24643s() {
        super.mo24643s();
    }

    /* renamed from: v */
    public int mo24645v() {
        int v = super.mo24645v();
        if (v == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f28864x.getRecommendedTimeoutMillis(v, (this.f28865y ? 4 : 0) | 1 | 2);
        } else if (!this.f28865y || !this.f28864x.isTouchExplorationEnabled()) {
            return v;
        } else {
            return -2;
        }
    }
}
