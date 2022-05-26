package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0275f;
import androidx.appcompat.widget.C0280h;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0560o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C6037d;
import com.google.android.material.internal.C6065c;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3772t;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p305m.C7511k;
import p159f.p243f.p245b.p304b.p310r.C7516a;
import p159f.p243f.p245b.p304b.p310r.C7517b;
import p159f.p243f.p245b.p304b.p314v.C7533b;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

public class FloatingActionButton extends VisibilityAwareImageButton implements C3772t, C0560o, C7516a, C7565p, CoordinatorLayout.C0447b {

    /* renamed from: x */
    private static final int f28243x = C7499k.Widget_Design_FloatingActionButton;

    /* renamed from: h */
    private ColorStateList f28244h;

    /* renamed from: i */
    private PorterDuff.Mode f28245i;

    /* renamed from: j */
    private ColorStateList f28246j;

    /* renamed from: k */
    private PorterDuff.Mode f28247k;

    /* renamed from: l */
    private ColorStateList f28248l;

    /* renamed from: m */
    private int f28249m;

    /* renamed from: n */
    private int f28250n;

    /* renamed from: o */
    private int f28251o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f28252p;

    /* renamed from: q */
    private int f28253q;

    /* renamed from: r */
    boolean f28254r;

    /* renamed from: s */
    final Rect f28255s;

    /* renamed from: t */
    private final Rect f28256t;

    /* renamed from: u */
    private final C0280h f28257u;

    /* renamed from: v */
    private final C7517b f28258v;

    /* renamed from: w */
    private C6037d f28259w;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C6027a implements C6037d.C6047j {

        /* renamed from: a */
        final /* synthetic */ C6028b f28263a;

        C6027a(C6028b bVar) {
            this.f28263a = bVar;
        }

        /* renamed from: a */
        public void mo23903a() {
            this.f28263a.mo23012b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo23904b() {
            this.f28263a.mo23011a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C6028b {
        /* renamed from: a */
        public void mo23011a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo23012b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C6029c implements C7533b {
        C6029c() {
        }

        /* renamed from: a */
        public void mo23905a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f28255s.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f28252p, i2 + FloatingActionButton.this.f28252p, i3 + FloatingActionButton.this.f28252p, i4 + FloatingActionButton.this.f28252p);
        }

        /* renamed from: b */
        public boolean mo23906b() {
            return FloatingActionButton.this.f28254r;
        }

        /* renamed from: c */
        public void mo23907c(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C6030d<T extends FloatingActionButton> implements C6037d.C6046i {

        /* renamed from: a */
        private final C7511k<T> f28266a;

        C6030d(C7511k<T> kVar) {
            this.f28266a = kVar;
        }

        /* renamed from: a */
        public void mo23908a() {
            this.f28266a.mo23005b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo23909b() {
            this.f28266a.mo23004a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6030d) && ((C6030d) obj).f28266a.equals(this.f28266a);
        }

        public int hashCode() {
            return this.f28266a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private C6037d m36190g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C6050e(this, new C6029c());
        }
        return new C6037d(this, new C6029c());
    }

    private C6037d getImpl() {
        if (this.f28259w == null) {
            this.f28259w = m36190g();
        }
        return this.f28259w;
    }

    /* renamed from: j */
    private int m36191j(int i) {
        int i2 = this.f28251o;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C7492d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C7492d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m36191j(1);
        } else {
            return m36191j(0);
        }
    }

    /* renamed from: o */
    private void m36192o(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f28255s;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m36193q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f28246j;
            if (colorStateList == null) {
                C0534a.m3277c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f28247k;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0275f.m1605e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m36194r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C6037d.C6047j m36195u(C6028b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C6027a(bVar);
    }

    /* renamed from: d */
    public void mo23832d(Animator.AnimatorListener animatorListener) {
        getImpl().mo23969d(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo23945E(getDrawableState());
    }

    /* renamed from: e */
    public void mo23834e(Animator.AnimatorListener animatorListener) {
        getImpl().mo23971e(animatorListener);
    }

    /* renamed from: f */
    public void mo23835f(C7511k<? extends FloatingActionButton> kVar) {
        getImpl().mo23973f(new C6030d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f28244h;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f28245i;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo23978n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo23981q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo23983t();
    }

    public Drawable getContentBackground() {
        return getImpl().mo23977k();
    }

    public int getCustomSize() {
        return this.f28251o;
    }

    public int getExpandedComponentIdHint() {
        return this.f28258v.mo28407b();
    }

    public C7508h getHideMotionSpec() {
        return getImpl().mo23980p();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f28248l;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f28248l;
    }

    public C7549m getShapeAppearanceModel() {
        C7549m u = getImpl().mo23984u();
        C3703i.m15827d(u);
        return u;
    }

    public C7508h getShowMotionSpec() {
        return getImpl().mo23985v();
    }

    public int getSize() {
        return this.f28250n;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m36191j(this.f28250n);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f28246j;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f28247k;
    }

    public boolean getUseCompatPadding() {
        return this.f28254r;
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo23852h(Rect rect) {
        if (!C3774v.m16181T(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m36192o(rect);
        return true;
    }

    /* renamed from: i */
    public void mo23853i(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m36192o(rect);
    }

    public boolean isExpanded() {
        return this.f28258v.mo28408c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo23941A();
    }

    /* renamed from: k */
    public void mo23856k(C6028b bVar) {
        mo23857l(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo23857l(C6028b bVar, boolean z) {
        getImpl().mo23986w(m36195u(bVar), z);
    }

    /* renamed from: m */
    public boolean mo23858m() {
        return getImpl().mo23988y();
    }

    /* renamed from: n */
    public boolean mo23859n() {
        return getImpl().mo23989z();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo23942B();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo23944D();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f28252p = (sizeDimension - this.f28253q) / 2;
        getImpl().mo23974f0();
        int min = Math.min(m36194r(sizeDimension, i), m36194r(sizeDimension, i2));
        Rect rect = this.f28255s;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo3471a());
        C7517b bVar = this.f28258v;
        Bundle bundle = extendableSavedState.f28881i.get("expandableWidgetHelper");
        C3703i.m15827d(bundle);
        bVar.mo28409d(bundle);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f28881i.put("expandableWidgetHelper", this.f28258v.mo28410e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo23852h(this.f28256t) || this.f28256t.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo23866s(C6028b bVar) {
        mo23899t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f28244h != colorStateList) {
            this.f28244h = colorStateList;
            getImpl().mo23952L(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f28245i != mode) {
            this.f28245i = mode;
            getImpl().mo23953M(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo23954N(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo23957Q(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo23961U(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f28251o) {
            this.f28251o = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo23975g0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo23979o()) {
            getImpl().mo23955O(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f28258v.mo28411f(i);
    }

    public void setHideMotionSpec(C7508h hVar) {
        getImpl().mo23956P(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo23972e0();
            if (this.f28246j != null) {
                m36193q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f28257u.mo2001g(i);
        m36193q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo23949I();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo23949I();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo23963W(z);
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        getImpl().mo23964X(mVar);
    }

    public void setShowMotionSpec(C7508h hVar) {
        getImpl().mo23965Y(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setSize(int i) {
        this.f28251o = 0;
        if (i != this.f28250n) {
            this.f28250n = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f28246j != colorStateList) {
            this.f28246j = colorStateList;
            m36193q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f28247k != mode) {
            this.f28247k = mode;
            m36193q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo23950J();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo23950J();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo23950J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f28254r != z) {
            this.f28254r = z;
            getImpl().mo23943C();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo23899t(C6028b bVar, boolean z) {
        getImpl().mo23968c0(m36195u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f28260a;

        /* renamed from: b */
        private C6028b f28261b;

        /* renamed from: c */
        private boolean f28262c;

        public BaseBehavior() {
            this.f28262c = true;
        }

        /* renamed from: F */
        private static boolean m36207F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0450e) {
                return ((CoordinatorLayout.C0450e) layoutParams).mo3092f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m36208G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f28255s;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= eVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C3774v.m16187Z(floatingActionButton, i2);
                }
                if (i != 0) {
                    C3774v.m16186Y(floatingActionButton, i);
                }
            }
        }

        /* renamed from: J */
        private boolean m36209J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) floatingActionButton.getLayoutParams();
            if (this.f28262c && eVar.mo3091e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        private boolean m36210K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m36209J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f28260a == null) {
                this.f28260a = new Rect();
            }
            Rect rect = this.f28260a;
            C6065c.m36465a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo23857l(this.f28261b, false);
                return true;
            }
            floatingActionButton.mo23899t(this.f28261b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m36211L(View view, FloatingActionButton floatingActionButton) {
            if (!m36209J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0450e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo23857l(this.f28261b, false);
                return true;
            }
            floatingActionButton.mo23899t(this.f28261b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo3052b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f28255s;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo3058h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m36210K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m36207F(view)) {
                return false;
            } else {
                m36211L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3062l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> v = coordinatorLayout.mo3042v(floatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m36207F(view) && m36211L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m36210K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3001M(floatingActionButton, i);
            m36208G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo3057g(CoordinatorLayout.C0450e eVar) {
            if (eVar.f2500h == 0) {
                eVar.f2500h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.FloatingActionButton_Behavior_Layout);
            this.f28262c = obtainStyledAttributes.getBoolean(C7500l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f28248l != colorStateList) {
            this.f28248l = colorStateList;
            getImpl().mo23962V(this.f28248l);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f28243x
            android.content.Context r11 = com.google.android.material.theme.p249a.C6260a.m37386c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f28255s = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f28256t = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r11, r0, r1)
            r10.f28244h = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C6100s.m36588i(r1, r3)
            r10.f28245i = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r11, r0, r1)
            r10.f28248l = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f28250n = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f28251o = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f28249m = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f28254r = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = p159f.p243f.p245b.p304b.C7492d.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.f28253q = r5
            int r5 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_showMotionSpec
            f.f.b.b.m.h r5 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r11, r0, r5)
            int r8 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_hideMotionSpec
            f.f.b.b.m.h r8 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r11, r0, r8)
            f.f.b.b.w.c r9 = p159f.p243f.p245b.p304b.p315w.C7549m.f32836m
            f.f.b.b.w.m$b r11 = p159f.p243f.p245b.p304b.p315w.C7549m.m42151g(r11, r12, r13, r6, r9)
            f.f.b.b.w.m r11 = r11.mo28526m()
            int r6 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = p159f.p243f.p245b.p304b.C7500l.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.h r0 = new androidx.appcompat.widget.h
            r0.<init>(r10)
            r10.f28257u = r0
            r0.mo2000f(r12, r13)
            f.f.b.b.r.b r12 = new f.f.b.b.r.b
            r12.<init>(r10)
            r10.f28258v = r12
            com.google.android.material.floatingactionbutton.d r12 = r10.getImpl()
            r12.mo23964X(r11)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f28244h
            android.graphics.PorterDuff$Mode r13 = r10.f28245i
            android.content.res.ColorStateList r0 = r10.f28248l
            int r7 = r10.f28249m
            r11.mo23987x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23960T(r4)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23954N(r1)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23957Q(r3)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23961U(r2)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            int r12 = r10.f28253q
            r11.mo23959S(r12)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23965Y(r5)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23956P(r8)
            com.google.android.material.floatingactionbutton.d r11 = r10.getImpl()
            r11.mo23955O(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
