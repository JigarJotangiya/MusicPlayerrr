package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.chip.C5961a;
import com.google.android.material.internal.C6093m;
import com.google.android.material.internal.C6100s;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p124j.p125a.C3800a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p312t.C7523d;
import p159f.p243f.p245b.p304b.p312t.C7527f;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p315w.C7545i;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class Chip extends AppCompatCheckBox implements C5961a.C5962a, C7565p {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final Rect f27987A = new Rect();

    /* renamed from: B */
    private static final int[] f27988B = {16842913};

    /* renamed from: C */
    private static final int[] f27989C = {16842911};

    /* renamed from: z */
    private static final int f27990z = C7499k.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C5961a f27991j;

    /* renamed from: k */
    private InsetDrawable f27992k;

    /* renamed from: l */
    private RippleDrawable f27993l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public View.OnClickListener f27994m;

    /* renamed from: n */
    private CompoundButton.OnCheckedChangeListener f27995n;

    /* renamed from: o */
    private boolean f27996o;

    /* renamed from: p */
    private boolean f27997p;

    /* renamed from: q */
    private boolean f27998q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f27999r;

    /* renamed from: s */
    private boolean f28000s;

    /* renamed from: t */
    private int f28001t;

    /* renamed from: u */
    private int f28002u;

    /* renamed from: v */
    private final C5956c f28003v;

    /* renamed from: w */
    private final Rect f28004w;

    /* renamed from: x */
    private final RectF f28005x;

    /* renamed from: y */
    private final C7527f f28006y;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C5954a extends C7527f {
        C5954a() {
        }

        /* renamed from: a */
        public void mo23420a(int i) {
        }

        /* renamed from: b */
        public void mo23421b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f27991j.mo23501R2() ? Chip.this.f27991j.mo23550n1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C5955b extends ViewOutlineProvider {
        C5955b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f27991j != null) {
                Chip.this.f27991j.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C5956c extends C3800a {
        C5956c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo13257B(float f, float f2) {
            return (!Chip.this.m35732o() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo13258C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m35732o() && Chip.this.mo23417t() && Chip.this.f27994m != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public boolean mo13263L(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo23418u();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo13266O(C3736c cVar) {
            cVar.mo13110a0(Chip.this.mo23322s());
            cVar.mo13116d0(Chip.this.isClickable());
            if (Chip.this.mo23322s() || Chip.this.isClickable()) {
                cVar.mo13114c0(Chip.this.mo23322s() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.mo13114c0("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo13089E0(text);
            } else {
                cVar.mo13121g0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo13267P(int i, C3736c cVar) {
            CharSequence charSequence = BuildConfig.FLAVOR;
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo13121g0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C7498j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.mo13121g0(context.getString(i2, objArr).trim());
                }
                cVar.mo13106X(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo13111b(C3736c.C3737a.f11794g);
                cVar.mo13125i0(Chip.this.isEnabled());
                return;
            }
            cVar.mo13121g0(charSequence);
            cVar.mo13106X(Chip.f27987A);
        }

        /* access modifiers changed from: protected */
        /* renamed from: Q */
        public void mo13268Q(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f27999r = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private void m35717A() {
        this.f27993l = new RippleDrawable(C7531b.m42046d(this.f27991j.mo23546l1()), getBackgroundDrawable(), (Drawable) null);
        this.f27991j.mo23498Q2(false);
        C3774v.m16223r0(this, this.f27993l);
        m35718B();
    }

    /* renamed from: B */
    private void m35718B() {
        C5961a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f27991j) != null) {
            int P0 = (int) (aVar.mo23493P0() + this.f27991j.mo23556p1() + this.f27991j.mo23574w0());
            int U0 = (int) (this.f27991j.mo23506U0() + this.f27991j.mo23558q1() + this.f27991j.mo23561s0());
            if (this.f27992k != null) {
                Rect rect = new Rect();
                this.f27992k.getPadding(rect);
                U0 += rect.left;
                P0 += rect.right;
            }
            C3774v.m16156D0(this, U0, getPaddingTop(), P0, getPaddingBottom());
        }
    }

    /* renamed from: C */
    private void m35719C() {
        TextPaint paint = getPaint();
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C7523d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo28417j(getContext(), paint, this.f28006y);
        }
    }

    /* renamed from: D */
    private void m35720D(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f28005x.setEmpty();
        if (m35732o() && this.f27994m != null) {
            this.f27991j.mo23527e1(this.f28005x);
        }
        return this.f28005x;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f28004w.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f28004w;
    }

    private C7523d getTextAppearance() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23552o1();
        }
        return null;
    }

    /* renamed from: j */
    private void m35728j(C5961a aVar) {
        aVar.mo23573v2(this);
    }

    /* renamed from: k */
    private int[] m35729k() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f27999r) {
            i2++;
        }
        if (this.f27998q) {
            i2++;
        }
        if (this.f27997p) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f27999r) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f27998q) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f27997p) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: m */
    private void m35730m() {
        if (getBackgroundDrawable() == this.f27992k && this.f27991j.getCallback() == null) {
            this.f27991j.setCallback(this.f27992k);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: n */
    private boolean m35731n(MotionEvent motionEvent) {
        Class<C3800a> cls = C3800a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f28003v)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("X", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f28003v, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m35732o() {
        C5961a aVar = this.f27991j;
        return (aVar == null || aVar.mo23512X0() == null) ? false : true;
    }

    /* renamed from: p */
    private void m35733p(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.Chip, i, f27990z, new int[0]);
        this.f28000s = h.getBoolean(C7500l.Chip_ensureMinTouchTargetSize, false);
        this.f28002u = (int) Math.ceil((double) h.getDimension(C7500l.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C6100s.m36582c(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: q */
    private void m35734q() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C5955b());
        }
    }

    /* renamed from: r */
    private void m35735r(int i, int i2, int i3, int i4) {
        this.f27992k = new InsetDrawable(this.f27991j, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f27998q != z) {
            this.f27998q = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f27997p != z) {
            this.f27997p = z;
            refreshDrawableState();
        }
    }

    /* renamed from: v */
    private void m35736v() {
        if (this.f27992k != null) {
            this.f27992k = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m35739z();
        }
    }

    /* renamed from: x */
    private void m35737x(C5961a aVar) {
        if (aVar != null) {
            aVar.mo23573v2((C5961a.C5962a) null);
        }
    }

    /* renamed from: y */
    private void m35738y() {
        if (!m35732o() || !mo23417t() || this.f27994m == null) {
            C3774v.m16217o0(this, (C3704a) null);
        } else {
            C3774v.m16217o0(this, this.f28003v);
        }
    }

    /* renamed from: z */
    private void m35739z() {
        if (C7531b.f32755a) {
            m35717A();
            return;
        }
        this.f27991j.mo23498Q2(true);
        C3774v.m16223r0(this, getBackgroundDrawable());
        m35718B();
        m35730m();
    }

    /* renamed from: a */
    public void mo23279a() {
        mo23313l(this.f28002u);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m35731n(motionEvent) || this.f28003v.mo13273v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f28003v.mo13274w(keyEvent) || this.f28003v.mo13256A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5961a aVar = this.f27991j;
        if ((aVar == null || !aVar.mo23572v1()) ? false : this.f27991j.mo23560r2(m35729k())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f27992k;
        return insetDrawable == null ? this.f27991j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23481L0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23484M0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23487N0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo23490O0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f27991j;
    }

    public float getChipEndPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23493P0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23496Q0();
        }
        return null;
    }

    public float getChipIconSize() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23499R0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23502S0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23504T0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23506U0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23508V0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23510W0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23512X0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23514Y0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23516Z0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23518a1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23520b1();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23524d1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23537h1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f28003v.mo13256A() == 1 || this.f28003v.mo13275x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C7508h getHideMotionSpec() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23538i1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23542j1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23544k1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23546l1();
        }
        return null;
    }

    public C7549m getShapeAppearanceModel() {
        return this.f27991j.mo28448D();
    }

    public C7508h getShowMotionSpec() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23548m1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23556p1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            return aVar.mo23558q1();
        }
        return 0.0f;
    }

    /* renamed from: l */
    public boolean mo23313l(int i) {
        this.f28002u = i;
        int i2 = 0;
        if (!mo23419w()) {
            if (this.f27992k != null) {
                m35736v();
            } else {
                m35739z();
            }
            return false;
        }
        int max = Math.max(0, i - this.f27991j.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f27991j.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f27992k != null) {
                Rect rect = new Rect();
                this.f27992k.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m35739z();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m35735r(i3, i2, i3, i2);
            m35739z();
            return true;
        }
        if (this.f27992k != null) {
            m35736v();
        } else {
            m35739z();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42140f(this, this.f27991j);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f27988B);
        }
        if (mo23322s()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f27989C);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f28003v.mo13262K(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo23322s() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo23322s() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo23322s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C3736c.m15976I0(accessibilityNodeInfo).mo13120f0(C3736c.C3739c.m16068a(chipGroup.mo24049b(this), 1, chipGroup.mo23424c() ? chipGroup.mo23435o(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f28001t != i) {
            this.f28001t = i;
            m35718B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f27997p
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f27997p
            if (r0 == 0) goto L_0x0034
            r5.mo23418u()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: s */
    public boolean mo23322s() {
        C5961a aVar = this.f27991j;
        return aVar != null && aVar.mo23569u1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27993l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f27993l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23465D1(z);
        }
    }

    public void setCheckableResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23467E1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C5961a aVar = this.f27991j;
        if (aVar == null) {
            this.f27996o = z;
        } else if (aVar.mo23569u1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f27995n) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23469F1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23471G1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23473H1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23475I1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23477J1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23482L1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23485M1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23488N1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23491O1(i);
        }
    }

    public void setChipDrawable(C5961a aVar) {
        C5961a aVar2 = this.f27991j;
        if (aVar2 != aVar) {
            m35737x(aVar2);
            this.f27991j = aVar;
            aVar.mo23472G2(false);
            m35728j(this.f27991j);
            mo23313l(this.f28002u);
        }
    }

    public void setChipEndPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23494P1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23497Q1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23500R1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23503S1(i);
        }
    }

    public void setChipIconSize(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23505T1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23507U1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23509V1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23511W1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23513X1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23517Z1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23519a2(i);
        }
    }

    public void setChipStartPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23521b2(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23523c2(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23525d2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23528e2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23529f2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23530g2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23539i2(drawable);
        }
        m35738y();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23543j2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23545k2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23547l2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23549m2(i);
        }
        m35738y();
    }

    public void setCloseIconSize(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23551n2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23553o2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23557p2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23559q2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23563s2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23568t2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo28462Z(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f27991j != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C5961a aVar = this.f27991j;
                if (aVar != null) {
                    aVar.mo23576w2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f28000s = z;
        mo23313l(this.f28002u);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C7508h hVar) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23577x2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23578y2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23580z2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23461A2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23463B2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23464C2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f27991j != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23466D2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f27995n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f27994m = onClickListener;
        m35738y();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23468E2(colorStateList);
        }
        if (!this.f27991j.mo23562s1()) {
            m35717A();
        }
    }

    public void setRippleColorResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23470F2(i);
            if (!this.f27991j.mo23562s1()) {
                m35717A();
            }
        }
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        this.f27991j.setShapeAppearanceModel(mVar);
    }

    public void setShowMotionSpec(C7508h hVar) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23474H2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23476I2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = BuildConfig.FLAVOR;
            }
            super.setText(aVar.mo23501R2() ? null : charSequence, bufferType);
            C5961a aVar2 = this.f27991j;
            if (aVar2 != null) {
                aVar2.mo23478J2(charSequence);
            }
        }
    }

    public void setTextAppearance(C7523d dVar) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23480K2(dVar);
        }
        m35719C();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23486M2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23489N2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23492O2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23495P2(i);
        }
    }

    /* renamed from: t */
    public boolean mo23417t() {
        C5961a aVar = this.f27991j;
        return aVar != null && aVar.mo23575w1();
    }

    /* renamed from: u */
    public boolean mo23418u() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f27994m;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f28003v.mo13271W(1, 1);
        return z;
    }

    /* renamed from: w */
    public boolean mo23419w() {
        return this.f28000s;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23570u2(z);
        }
        m35738y();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f27990z
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f28004w = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f28005x = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f28006y = r8
            android.content.Context r8 = r7.getContext()
            r7.m35720D(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.C5961a.m35773B0(r8, r9, r10, r4)
            r7.m35733p(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = p082e.p109h.p119p.C3774v.m16232w(r7)
            r6.mo28462Z(r0)
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.Chip
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L_0x0051
            int r10 = p159f.p243f.p245b.p304b.C7500l.Chip_android_textColor
            android.content.res.ColorStateList r8 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r8, r9, r10)
            r7.setTextColor(r8)
        L_0x0051:
            int r8 = p159f.p243f.p245b.p304b.C7500l.Chip_shapeAppearance
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f28003v = r9
            r7.m35738y()
            if (r8 != 0) goto L_0x0069
            r7.m35734q()
        L_0x0069:
            boolean r8 = r7.f27996o
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.mo23550n1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.mo23537h1()
            r7.setEllipsize(r8)
            r7.m35719C()
            com.google.android.material.chip.a r8 = r7.f27991j
            boolean r8 = r8.mo23501R2()
            if (r8 != 0) goto L_0x008e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L_0x008e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.m35718B()
            boolean r8 = r7.mo23419w()
            if (r8 == 0) goto L_0x00a2
            int r8 = r7.f28002u
            r7.setMinHeight(r8)
        L_0x00a2:
            int r8 = p082e.p109h.p119p.C3774v.m16151B(r7)
            r7.f28001t = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23479K1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23515Y1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23483L2(i);
        }
        m35719C();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C5961a aVar = this.f27991j;
        if (aVar != null) {
            aVar.mo23483L2(i);
        }
        m35719C();
    }
}
