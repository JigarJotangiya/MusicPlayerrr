package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0534a;
import androidx.core.widget.C0556l;
import p082e.p083a.C3400a;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p083a.p089n.C3430a;
import p082e.p109h.p119p.C3774v;

public class SwitchCompat extends CompoundButton {

    /* renamed from: T */
    private static final Property<SwitchCompat, Float> f1129T = new C0255a(Float.class, "thumbPos");

    /* renamed from: U */
    private static final int[] f1130U = {16842912};

    /* renamed from: A */
    private float f1131A;

    /* renamed from: B */
    private VelocityTracker f1132B;

    /* renamed from: C */
    private int f1133C;

    /* renamed from: D */
    float f1134D;

    /* renamed from: E */
    private int f1135E;

    /* renamed from: F */
    private int f1136F;

    /* renamed from: G */
    private int f1137G;

    /* renamed from: H */
    private int f1138H;

    /* renamed from: I */
    private int f1139I;

    /* renamed from: J */
    private int f1140J;

    /* renamed from: K */
    private int f1141K;

    /* renamed from: L */
    private final TextPaint f1142L;

    /* renamed from: M */
    private ColorStateList f1143M;

    /* renamed from: N */
    private Layout f1144N;

    /* renamed from: O */
    private Layout f1145O;

    /* renamed from: P */
    private TransformationMethod f1146P;

    /* renamed from: Q */
    ObjectAnimator f1147Q;

    /* renamed from: R */
    private final C0292l f1148R;

    /* renamed from: S */
    private final Rect f1149S;

    /* renamed from: g */
    private Drawable f1150g;

    /* renamed from: h */
    private ColorStateList f1151h;

    /* renamed from: i */
    private PorterDuff.Mode f1152i;

    /* renamed from: j */
    private boolean f1153j;

    /* renamed from: k */
    private boolean f1154k;

    /* renamed from: l */
    private Drawable f1155l;

    /* renamed from: m */
    private ColorStateList f1156m;

    /* renamed from: n */
    private PorterDuff.Mode f1157n;

    /* renamed from: o */
    private boolean f1158o;

    /* renamed from: p */
    private boolean f1159p;

    /* renamed from: q */
    private int f1160q;

    /* renamed from: r */
    private int f1161r;

    /* renamed from: s */
    private int f1162s;

    /* renamed from: t */
    private boolean f1163t;

    /* renamed from: u */
    private CharSequence f1164u;

    /* renamed from: v */
    private CharSequence f1165v;

    /* renamed from: w */
    private boolean f1166w;

    /* renamed from: x */
    private int f1167x;

    /* renamed from: y */
    private int f1168y;

    /* renamed from: z */
    private float f1169z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0255a extends Property<SwitchCompat, Float> {
        C0255a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1134D);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m1466a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1129T, new float[]{z ? 1.0f : 0.0f});
        this.f1147Q = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1147Q.setAutoCancel(true);
        }
        this.f1147Q.start();
    }

    /* renamed from: b */
    private void m1467b() {
        Drawable drawable = this.f1150g;
        if (drawable == null) {
            return;
        }
        if (this.f1153j || this.f1154k) {
            Drawable mutate = C0534a.m3292r(drawable).mutate();
            this.f1150g = mutate;
            if (this.f1153j) {
                C0534a.m3289o(mutate, this.f1151h);
            }
            if (this.f1154k) {
                C0534a.m3290p(this.f1150g, this.f1152i);
            }
            if (this.f1150g.isStateful()) {
                this.f1150g.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m1468c() {
        Drawable drawable = this.f1155l;
        if (drawable == null) {
            return;
        }
        if (this.f1158o || this.f1159p) {
            Drawable mutate = C0534a.m3292r(drawable).mutate();
            this.f1155l = mutate;
            if (this.f1158o) {
                C0534a.m3289o(mutate, this.f1156m);
            }
            if (this.f1159p) {
                C0534a.m3290p(this.f1155l, this.f1157n);
            }
            if (this.f1155l.isStateful()) {
                this.f1155l.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m1469d() {
        ObjectAnimator objectAnimator = this.f1147Q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m1470e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m1471f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m1472g(float f, float f2) {
        if (this.f1150g == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1150g.getPadding(this.f1149S);
        int i = this.f1139I;
        int i2 = this.f1168y;
        int i3 = i - i2;
        int i4 = (this.f1138H + thumbOffset) - i2;
        Rect rect = this.f1149S;
        int i5 = this.f1137G + i4 + rect.left + rect.right + i2;
        int i6 = this.f1141K + i2;
        if (f <= ((float) i4) || f >= ((float) i5) || f2 <= ((float) i3) || f2 >= ((float) i6)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.f1134D > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0299m0.m1793b(this)) {
            f = 1.0f - this.f1134D;
        } else {
            f = this.f1134D;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1155l;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1149S;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1150g;
        if (drawable2 != null) {
            rect = C0303p.m1831d(drawable2);
        } else {
            rect = C0303p.f1389c;
        }
        return ((((this.f1135E - this.f1137G) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: h */
    private Layout m1473h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1146P;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1142L;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m1474k(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        mo1760j(typeface, i2);
    }

    /* renamed from: l */
    private void m1475l(MotionEvent motionEvent) {
        this.f1167x = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1132B.computeCurrentVelocity(1000);
            float xVelocity = this.f1132B.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1133C)) {
                z = getTargetCheckedState();
            } else if (!C0299m0.m1793b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1470e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1149S;
        int i3 = this.f1138H;
        int i4 = this.f1139I;
        int i5 = this.f1140J;
        int i6 = this.f1141K;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1150g;
        if (drawable != null) {
            rect = C0303p.m1831d(drawable);
        } else {
            rect = C0303p.f1389c;
        }
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1155l.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1155l.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1150g;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f1137G + rect2.right;
            this.f1150g.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0534a.m3286l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1150g;
        if (drawable != null) {
            C0534a.m3285k(drawable, f, f2);
        }
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null) {
            C0534a.m3285k(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1150g;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0299m0.m1793b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1135E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1162s : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0299m0.m1793b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1135E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1162s : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1166w;
    }

    public boolean getSplitTrack() {
        return this.f1163t;
    }

    public int getSwitchMinWidth() {
        return this.f1161r;
    }

    public int getSwitchPadding() {
        return this.f1162s;
    }

    public CharSequence getTextOff() {
        return this.f1165v;
    }

    public CharSequence getTextOn() {
        return this.f1164u;
    }

    public Drawable getThumbDrawable() {
        return this.f1150g;
    }

    public int getThumbTextPadding() {
        return this.f1160q;
    }

    public ColorStateList getThumbTintList() {
        return this.f1151h;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1152i;
    }

    public Drawable getTrackDrawable() {
        return this.f1155l;
    }

    public ColorStateList getTrackTintList() {
        return this.f1156m;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1157n;
    }

    /* renamed from: i */
    public void mo1759i(Context context, int i) {
        C0279g0 t = C0279g0.m1625t(context, i, C3409j.TextAppearance);
        ColorStateList c = t.mo1978c(C3409j.TextAppearance_android_textColor);
        if (c != null) {
            this.f1143M = c;
        } else {
            this.f1143M = getTextColors();
        }
        int f = t.mo1981f(C3409j.TextAppearance_android_textSize, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f1142L.getTextSize()) {
                this.f1142L.setTextSize(f2);
                requestLayout();
            }
        }
        m1474k(t.mo1986k(C3409j.TextAppearance_android_typeface, -1), t.mo1986k(C3409j.TextAppearance_android_textStyle, -1));
        if (t.mo1976a(C3409j.TextAppearance_textAllCaps, false)) {
            this.f1146P = new C3430a(getContext());
        } else {
            this.f1146P = null;
        }
        t.mo1995w();
    }

    /* renamed from: j */
    public void mo1760j(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int i2 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1142L;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1142L;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1142L.setFakeBoldText(false);
        this.f1142L.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1150g;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1147Q;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1147Q.end();
            this.f1147Q = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1130U);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1149S;
        Drawable drawable = this.f1155l;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1139I;
        int i3 = this.f1141K;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1150g;
        if (drawable != null) {
            if (!this.f1163t || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0303p.m1831d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1144N : this.f1145O;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1143M;
            if (colorStateList != null) {
                this.f1142L.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1142L.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1164u : this.f1165v;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1150g != null) {
            Rect rect = this.f1149S;
            Drawable drawable = this.f1155l;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0303p.m1831d(this.f1150g);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0299m0.m1793b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1135E + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1135E) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f1136F;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1136F;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1136F;
            this.f1138H = i7;
            this.f1139I = i9;
            this.f1141K = i8;
            this.f1140J = i6;
        }
        i8 = i10 + i9;
        this.f1138H = i7;
        this.f1139I = i9;
        this.f1141K = i8;
        this.f1140J = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1166w) {
            if (this.f1144N == null) {
                this.f1144N = m1473h(this.f1164u);
            }
            if (this.f1145O == null) {
                this.f1145O = m1473h(this.f1165v);
            }
        }
        Rect rect = this.f1149S;
        Drawable drawable = this.f1150g;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1150g.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1150g.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1137G = Math.max(this.f1166w ? Math.max(this.f1144N.getWidth(), this.f1145O.getWidth()) + (this.f1160q * 2) : 0, i4);
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1155l.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1150g;
        if (drawable3 != null) {
            Rect d = C0303p.m1831d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1161r, (this.f1137G * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1135E = max;
        this.f1136F = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1164u : this.f1165v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1132B
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1167x
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1169z
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0299m0.m1793b(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1134D
            float r0 = r0 + r2
            float r0 = m1471f(r0, r4, r3)
            float r2 = r6.f1134D
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1169z = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1169z
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1168y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1131A
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1168y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1167x = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1169z = r0
            r6.f1131A = r3
            return r1
        L_0x008b:
            int r0 = r6.f1167x
            if (r0 != r2) goto L_0x0096
            r6.m1475l(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1167x = r0
            android.view.VelocityTracker r0 = r6.f1132B
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m1472g(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1167x = r1
            r6.f1169z = r0
            r6.f1131A = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C3774v.m16181T(this)) {
            m1469d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1466a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0556l.m3437s(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1166w != z) {
            this.f1166w = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1163t = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1161r = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1162s = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1142L.getTypeface() != null && !this.f1142L.getTypeface().equals(typeface)) || (this.f1142L.getTypeface() == null && typeface != null)) {
            this.f1142L.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1165v = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1164u = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1150g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1150g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f1134D = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3410a.m14543d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1160q = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1151h = colorStateList;
        this.f1153j = true;
        m1467b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1152i = mode;
        this.f1154k = true;
        m1467b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1155l;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1155l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3410a.m14543d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1156m = colorStateList;
        this.f1158o = true;
        m1468c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1157n = mode;
        this.f1159p = true;
        m1468c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1150g || drawable == this.f1155l;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3400a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1151h = null;
        this.f1152i = null;
        this.f1153j = false;
        this.f1154k = false;
        this.f1156m = null;
        this.f1157n = null;
        this.f1158o = false;
        this.f1159p = false;
        this.f1132B = VelocityTracker.obtain();
        this.f1149S = new Rect();
        C0268b0.m1570a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1142L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C3409j.SwitchCompat;
        C0279g0 v = C0279g0.m1627v(context, attributeSet, iArr, i, 0);
        C3774v.m16213m0(this, context, iArr, attributeSet, v.mo1993r(), i, 0);
        Drawable g = v.mo1982g(C3409j.SwitchCompat_android_thumb);
        this.f1150g = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo1982g(C3409j.SwitchCompat_track);
        this.f1155l = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.f1164u = v.mo1991p(C3409j.SwitchCompat_android_textOn);
        this.f1165v = v.mo1991p(C3409j.SwitchCompat_android_textOff);
        this.f1166w = v.mo1976a(C3409j.SwitchCompat_showText, true);
        this.f1160q = v.mo1981f(C3409j.SwitchCompat_thumbTextPadding, 0);
        this.f1161r = v.mo1981f(C3409j.SwitchCompat_switchMinWidth, 0);
        this.f1162s = v.mo1981f(C3409j.SwitchCompat_switchPadding, 0);
        this.f1163t = v.mo1976a(C3409j.SwitchCompat_splitTrack, false);
        ColorStateList c = v.mo1978c(C3409j.SwitchCompat_thumbTint);
        if (c != null) {
            this.f1151h = c;
            this.f1153j = true;
        }
        PorterDuff.Mode e = C0303p.m1832e(v.mo1986k(C3409j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1152i != e) {
            this.f1152i = e;
            this.f1154k = true;
        }
        if (this.f1153j || this.f1154k) {
            m1467b();
        }
        ColorStateList c2 = v.mo1978c(C3409j.SwitchCompat_trackTint);
        if (c2 != null) {
            this.f1156m = c2;
            this.f1158o = true;
        }
        PorterDuff.Mode e2 = C0303p.m1832e(v.mo1986k(C3409j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f1157n != e2) {
            this.f1157n = e2;
            this.f1159p = true;
        }
        if (this.f1158o || this.f1159p) {
            m1468c();
        }
        int n = v.mo1989n(C3409j.SwitchCompat_switchTextAppearance, 0);
        if (n != 0) {
            mo1759i(context, n);
        }
        C0292l lVar = new C0292l(this);
        this.f1148R = lVar;
        lVar.mo2072m(attributeSet, i);
        v.mo1995w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1168y = viewConfiguration.getScaledTouchSlop();
        this.f1133C = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
