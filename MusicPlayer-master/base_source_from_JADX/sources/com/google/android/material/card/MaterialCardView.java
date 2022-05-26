package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import p082e.p083a.p084k.p085a.C3410a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p315w.C7545i;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

public class MaterialCardView extends CardView implements Checkable, C7565p {

    /* renamed from: u */
    private static final int[] f27953u = {16842911};

    /* renamed from: v */
    private static final int[] f27954v = {16842912};

    /* renamed from: w */
    private static final int[] f27955w = {C7490b.state_dragged};

    /* renamed from: x */
    private static final int f27956x = C7499k.Widget_MaterialComponents_CardView;

    /* renamed from: p */
    private final C5952a f27957p;

    /* renamed from: q */
    private boolean f27958q;

    /* renamed from: r */
    private boolean f27959r;

    /* renamed from: s */
    private boolean f27960s;

    /* renamed from: t */
    private C5951a f27961t;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C5951a {
        /* renamed from: a */
        void mo23233a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f27957p.mo23260k().getBounds());
        return rectF;
    }

    /* renamed from: j */
    private void m35656j() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f27957p.mo23259j();
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f27957p.mo23261l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f27957p.mo23262m();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f27957p.mo23263n();
    }

    public int getCheckedIconMargin() {
        return this.f27957p.mo23264o();
    }

    public int getCheckedIconSize() {
        return this.f27957p.mo23265p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f27957p.mo23266q();
    }

    public int getContentPaddingBottom() {
        return this.f27957p.mo23234A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f27957p.mo23234A().left;
    }

    public int getContentPaddingRight() {
        return this.f27957p.mo23234A().right;
    }

    public int getContentPaddingTop() {
        return this.f27957p.mo23234A().top;
    }

    public float getProgress() {
        return this.f27957p.mo23268u();
    }

    public float getRadius() {
        return this.f27957p.mo23267s();
    }

    public ColorStateList getRippleColor() {
        return this.f27957p.mo23269v();
    }

    public C7549m getShapeAppearanceModel() {
        return this.f27957p.mo23270w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f27957p.mo23271x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f27957p.mo23272y();
    }

    public int getStrokeWidth() {
        return this.f27957p.mo23273z();
    }

    public boolean isChecked() {
        return this.f27959r;
    }

    /* renamed from: k */
    public boolean mo23203k() {
        C5952a aVar = this.f27957p;
        return aVar != null && aVar.mo23236D();
    }

    /* renamed from: l */
    public boolean mo23204l() {
        return this.f27960s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23205m(int i, int i2, int i3, int i4) {
        super.mo2294h(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42140f(this, this.f27957p.mo23260k());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo23203k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f27953u);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f27954v);
        }
        if (mo23204l()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f27955w);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo23203k());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f27957p.mo23238F(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f27958q) {
            if (!this.f27957p.mo23235C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f27957p.mo23239G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f27957p.mo23240H(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f27957p.mo23256Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f27957p.mo23241I(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f27957p.mo23242J(z);
    }

    public void setChecked(boolean z) {
        if (this.f27959r != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f27957p.mo23243K(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.f27957p.mo23244L(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f27957p.mo23244L(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f27957p.mo23243K(C3410a.m14543d(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f27957p.mo23245M(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f27957p.mo23245M(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f27957p.mo23246N(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C5952a aVar = this.f27957p;
        if (aVar != null) {
            aVar.mo23254X();
        }
    }

    public void setDragged(boolean z) {
        if (this.f27960s != z) {
            this.f27960s = z;
            refreshDrawableState();
            m35656j();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f27957p.mo23257b0();
    }

    public void setOnCheckedChangeListener(C5951a aVar) {
        this.f27961t = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f27957p.mo23257b0();
        this.f27957p.mo23255Y();
    }

    public void setProgress(float f) {
        this.f27957p.mo23248P(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f27957p.mo23247O(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f27957p.mo23249Q(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f27957p.mo23249Q(C3410a.m14542c(getContext(), i));
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(mVar.mo28511u(getBoundsAsRectF()));
        }
        this.f27957p.mo23250R(mVar);
    }

    public void setStrokeColor(int i) {
        this.f27957p.mo23251S(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f27957p.mo23252T(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f27957p.mo23257b0();
        this.f27957p.mo23255Y();
    }

    public void toggle() {
        if (mo23203k() && isEnabled()) {
            this.f27959r = !this.f27959r;
            refreshDrawableState();
            m35656j();
            C5951a aVar = this.f27961t;
            if (aVar != null) {
                aVar.mo23233a(this, this.f27959r);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.materialCardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f27957p.mo23240H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f27957p.mo23251S(colorStateList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f27956x
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f27959r = r8
            r7.f27960s = r8
            r0 = 1
            r7.f27958q = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f27957p = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo23240H(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo23253U(r9, r10, r1, r2)
            r0.mo23237E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
