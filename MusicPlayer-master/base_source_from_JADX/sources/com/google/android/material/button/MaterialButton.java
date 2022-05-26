package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p315w.C7545i;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

public class MaterialButton extends AppCompatButton implements Checkable, C7565p {

    /* renamed from: v */
    private static final int[] f27895v = {16842911};

    /* renamed from: w */
    private static final int[] f27896w = {16842912};

    /* renamed from: x */
    private static final int f27897x = C7499k.Widget_MaterialComponents_Button;

    /* renamed from: i */
    private final C5950a f27898i;

    /* renamed from: j */
    private final LinkedHashSet<C5942a> f27899j;

    /* renamed from: k */
    private C5943b f27900k;

    /* renamed from: l */
    private PorterDuff.Mode f27901l;

    /* renamed from: m */
    private ColorStateList f27902m;

    /* renamed from: n */
    private Drawable f27903n;

    /* renamed from: o */
    private int f27904o;

    /* renamed from: p */
    private int f27905p;

    /* renamed from: q */
    private int f27906q;

    /* renamed from: r */
    private int f27907r;

    /* renamed from: s */
    private boolean f27908s;

    /* renamed from: t */
    private boolean f27909t;

    /* renamed from: u */
    private int f27910u;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5941a();

        /* renamed from: i */
        boolean f27911i;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        static class C5941a implements Parcelable.ClassLoaderCreator<SavedState> {
            C5941a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m35579b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f27911i = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27911i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m35579b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C5942a {
        /* renamed from: a */
        void mo23140a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C5943b {
        /* renamed from: a */
        void mo23141a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private boolean m35568c() {
        int i = this.f27910u;
        return i == 3 || i == 4;
    }

    /* renamed from: d */
    private boolean m35569d() {
        int i = this.f27910u;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    private boolean m35570e() {
        int i = this.f27910u;
        return i == 16 || i == 32;
    }

    /* renamed from: g */
    private boolean m35571g() {
        return C3774v.m16151B(this) == 1;
    }

    private String getA11yClassName() {
        return (mo23079b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: h */
    private boolean m35572h() {
        C5950a aVar = this.f27898i;
        return aVar != null && !aVar.mo23178o();
    }

    /* renamed from: j */
    private void m35573j() {
        if (m35569d()) {
            C0556l.m3430l(this, this.f27903n, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (m35568c()) {
            C0556l.m3430l(this, (Drawable) null, (Drawable) null, this.f27903n, (Drawable) null);
        } else if (m35570e()) {
            C0556l.m3430l(this, (Drawable) null, this.f27903n, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: k */
    private void m35574k(boolean z) {
        Drawable drawable = this.f27903n;
        if (drawable != null) {
            Drawable mutate = C0534a.m3292r(drawable).mutate();
            this.f27903n = mutate;
            C0534a.m3289o(mutate, this.f27902m);
            PorterDuff.Mode mode = this.f27901l;
            if (mode != null) {
                C0534a.m3290p(this.f27903n, mode);
            }
            int i = this.f27904o;
            if (i == 0) {
                i = this.f27903n.getIntrinsicWidth();
            }
            int i2 = this.f27904o;
            if (i2 == 0) {
                i2 = this.f27903n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f27903n;
            int i3 = this.f27905p;
            int i4 = this.f27906q;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            m35573j();
            return;
        }
        Drawable[] a = C0556l.m3419a(this);
        boolean z2 = false;
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((m35569d() && drawable3 != this.f27903n) || ((m35568c() && drawable5 != this.f27903n) || (m35570e() && drawable4 != this.f27903n))) {
            z2 = true;
        }
        if (z2) {
            m35573j();
        }
    }

    /* renamed from: l */
    private void m35575l(int i, int i2) {
        if (this.f27903n != null && getLayout() != null) {
            if (m35569d() || m35568c()) {
                this.f27906q = 0;
                int i3 = this.f27910u;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f27905p = 0;
                    m35574k(false);
                    return;
                }
                int i4 = this.f27904o;
                if (i4 == 0) {
                    i4 = this.f27903n.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - C3774v.m16159F(this)) - i4) - this.f27907r) - C3774v.m16161G(this)) / 2;
                boolean g = m35571g();
                if (this.f27910u != 4) {
                    z = false;
                }
                if (g != z) {
                    textWidth = -textWidth;
                }
                if (this.f27905p != textWidth) {
                    this.f27905p = textWidth;
                    m35574k(false);
                }
            } else if (m35570e()) {
                this.f27905p = 0;
                if (this.f27910u == 16) {
                    this.f27906q = 0;
                    m35574k(false);
                    return;
                }
                int i5 = this.f27904o;
                if (i5 == 0) {
                    i5 = this.f27903n.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f27907r) - getPaddingBottom()) / 2;
                if (this.f27906q != textHeight) {
                    this.f27906q = textHeight;
                    m35574k(false);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo23078a(C5942a aVar) {
        this.f27899j.add(aVar);
    }

    /* renamed from: b */
    public boolean mo23079b() {
        C5950a aVar = this.f27898i;
        return aVar != null && aVar.mo23179p();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m35572h()) {
            return this.f27898i.mo23167b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f27903n;
    }

    public int getIconGravity() {
        return this.f27910u;
    }

    public int getIconPadding() {
        return this.f27907r;
    }

    public int getIconSize() {
        return this.f27904o;
    }

    public ColorStateList getIconTint() {
        return this.f27902m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f27901l;
    }

    public int getInsetBottom() {
        return this.f27898i.mo23168c();
    }

    public int getInsetTop() {
        return this.f27898i.mo23169d();
    }

    public ColorStateList getRippleColor() {
        if (m35572h()) {
            return this.f27898i.mo23172h();
        }
        return null;
    }

    public C7549m getShapeAppearanceModel() {
        if (m35572h()) {
            return this.f27898i.mo23173i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m35572h()) {
            return this.f27898i.mo23174j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m35572h()) {
            return this.f27898i.mo23175k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m35572h()) {
            return this.f27898i.mo23176l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m35572h()) {
            return this.f27898i.mo23177m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: i */
    public void mo23095i(C5942a aVar) {
        this.f27899j.remove(aVar);
    }

    public boolean isChecked() {
        return this.f27908s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m35572h()) {
            C7545i.m42140f(this, this.f27898i.mo23171f());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo23079b()) {
            Button.mergeDrawableStates(onCreateDrawableState, f27895v);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f27896w);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo23079b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C5950a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f27898i) != null) {
            aVar.mo23166H(i4 - i2, i3 - i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        setChecked(savedState.f27911i);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27911i = this.f27908s;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m35575l(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m35575l(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m35572h()) {
            this.f27898i.mo23181r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m35572h()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f27898i.mo23182s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m35572h()) {
            this.f27898i.mo23183t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo23079b() && isEnabled() && this.f27908s != z) {
            this.f27908s = z;
            refreshDrawableState();
            if (!this.f27909t) {
                this.f27909t = true;
                Iterator it = this.f27899j.iterator();
                while (it.hasNext()) {
                    ((C5942a) it.next()).mo23140a(this, this.f27908s);
                }
                this.f27909t = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m35572h()) {
            this.f27898i.mo23184u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m35572h()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m35572h()) {
            this.f27898i.mo23171f().mo28462Z(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f27903n != drawable) {
            this.f27903n = drawable;
            m35574k(true);
            m35575l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f27910u != i) {
            this.f27910u = i;
            m35575l(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f27907r != i) {
            this.f27907r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C3410a.m14543d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f27904o != i) {
            this.f27904o = i;
            m35574k(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f27902m != colorStateList) {
            this.f27902m = colorStateList;
            m35574k(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f27901l != mode) {
            this.f27901l = mode;
            m35574k(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C3410a.m14542c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f27898i.mo23185v(i);
    }

    public void setInsetTop(int i) {
        this.f27898i.mo23186w(i);
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C5943b bVar) {
        this.f27900k = bVar;
    }

    public void setPressed(boolean z) {
        C5943b bVar = this.f27900k;
        if (bVar != null) {
            bVar.mo23141a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m35572h()) {
            this.f27898i.mo23187x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m35572h()) {
            setRippleColor(C3410a.m14542c(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        if (m35572h()) {
            this.f27898i.mo23188y(mVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m35572h()) {
            this.f27898i.mo23189z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m35572h()) {
            this.f27898i.mo23162A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m35572h()) {
            setStrokeColor(C3410a.m14542c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m35572h()) {
            this.f27898i.mo23163B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m35572h()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m35572h()) {
            this.f27898i.mo23164C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m35572h()) {
            this.f27898i.mo23165D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f27908s);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f27897x
            android.content.Context r9 = com.google.android.material.theme.p249a.C6260a.m37386c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f27899j = r9
            r9 = 0
            r8.f27908s = r9
            r8.f27909t = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r1 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f27907r = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C6100s.m36588i(r1, r2)
            r8.f27901l = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r1, r0, r2)
            r8.f27902m = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = p159f.p243f.p245b.p304b.p312t.C7522c.m42017d(r1, r0, r2)
            r8.f27903n = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f27910u = r1
            int r1 = p159f.p243f.p245b.p304b.C7500l.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f27904o = r1
            f.f.b.b.w.m$b r10 = p159f.p243f.p245b.p304b.p315w.C7549m.m42149e(r7, r10, r11, r6)
            f.f.b.b.w.m r10 = r10.mo28526m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f27898i = r11
            r11.mo23180q(r0)
            r0.recycle()
            int r10 = r8.f27907r
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f27903n
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.m35574k(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
