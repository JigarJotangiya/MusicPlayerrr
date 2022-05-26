package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0534a;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p315w.C7537d;
import p159f.p243f.p245b.p304b.p315w.C7538e;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7548l;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: com.google.android.material.card.a */
/* compiled from: MaterialCardViewHelper */
class C5952a {

    /* renamed from: t */
    private static final int[] f27962t = {16842912};

    /* renamed from: u */
    private static final double f27963u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f27964a;

    /* renamed from: b */
    private final Rect f27965b = new Rect();

    /* renamed from: c */
    private final C7541h f27966c;

    /* renamed from: d */
    private final C7541h f27967d;

    /* renamed from: e */
    private int f27968e;

    /* renamed from: f */
    private int f27969f;

    /* renamed from: g */
    private int f27970g;

    /* renamed from: h */
    private Drawable f27971h;

    /* renamed from: i */
    private Drawable f27972i;

    /* renamed from: j */
    private ColorStateList f27973j;

    /* renamed from: k */
    private ColorStateList f27974k;

    /* renamed from: l */
    private C7549m f27975l;

    /* renamed from: m */
    private ColorStateList f27976m;

    /* renamed from: n */
    private Drawable f27977n;

    /* renamed from: o */
    private LayerDrawable f27978o;

    /* renamed from: p */
    private C7541h f27979p;

    /* renamed from: q */
    private C7541h f27980q;

    /* renamed from: r */
    private boolean f27981r = false;

    /* renamed from: s */
    private boolean f27982s;

    /* renamed from: com.google.android.material.card.a$a */
    /* compiled from: MaterialCardViewHelper */
    class C5953a extends InsetDrawable {
        C5953a(C5952a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C5952a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f27964a = materialCardView;
        C7541h hVar = new C7541h(materialCardView.getContext(), attributeSet, i, i2);
        this.f27966c = hVar;
        hVar.mo28456P(materialCardView.getContext());
        hVar.mo28469g0(-12303292);
        C7549m.C7551b v = hVar.mo28448D().mo28512v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C7500l.CardView, i, C7499k.CardView);
        int i3 = C7500l.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo28527o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f27967d = new C7541h();
        mo23250R(v.mo28526m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    private Drawable m35661B(Drawable drawable) {
        int i;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f27964a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m35669d());
            i2 = (int) Math.ceil((double) m35667c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C5953a(this, drawable, i2, i, i2, i);
    }

    /* renamed from: V */
    private boolean m35662V() {
        return this.f27964a.getPreventCornerOverlap() && !m35670e();
    }

    /* renamed from: W */
    private boolean m35663W() {
        return this.f27964a.getPreventCornerOverlap() && m35670e() && this.f27964a.getUseCompatPadding();
    }

    /* renamed from: a */
    private float m35664a() {
        return Math.max(Math.max(m35666b(this.f27975l.mo28507q(), this.f27966c.mo28452I()), m35666b(this.f27975l.mo28509s(), this.f27966c.mo28453J())), Math.max(m35666b(this.f27975l.mo28502k(), this.f27966c.mo28486t()), m35666b(this.f27975l.mo28500i(), this.f27966c.mo28485s())));
    }

    /* renamed from: a0 */
    private void m35665a0(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f27964a.getForeground() instanceof InsetDrawable)) {
            this.f27964a.setForeground(m35661B(drawable));
        } else {
            ((InsetDrawable) this.f27964a.getForeground()).setDrawable(drawable);
        }
    }

    /* renamed from: b */
    private float m35666b(C7537d dVar, float f) {
        if (dVar instanceof C7548l) {
            return (float) ((1.0d - f27963u) * ((double) f));
        }
        if (dVar instanceof C7538e) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    private float m35667c() {
        return this.f27964a.getMaxCardElevation() + (m35663W() ? m35664a() : 0.0f);
    }

    /* renamed from: c0 */
    private void m35668c0() {
        Drawable drawable;
        if (!C7531b.f32755a || (drawable = this.f27977n) == null) {
            C7541h hVar = this.f27979p;
            if (hVar != null) {
                hVar.mo28463a0(this.f27973j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f27973j);
    }

    /* renamed from: d */
    private float m35669d() {
        return (this.f27964a.getMaxCardElevation() * 1.5f) + (m35663W() ? m35664a() : 0.0f);
    }

    /* renamed from: e */
    private boolean m35670e() {
        return Build.VERSION.SDK_INT >= 21 && this.f27966c.mo28458S();
    }

    /* renamed from: f */
    private Drawable m35671f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f27972i;
        if (drawable != null) {
            stateListDrawable.addState(f27962t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    private Drawable m35672g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C7541h i = m35674i();
        this.f27979p = i;
        i.mo28463a0(this.f27973j);
        stateListDrawable.addState(new int[]{16842919}, this.f27979p);
        return stateListDrawable;
    }

    /* renamed from: h */
    private Drawable m35673h() {
        if (!C7531b.f32755a) {
            return m35672g();
        }
        this.f27980q = m35674i();
        return new RippleDrawable(this.f27973j, (Drawable) null, this.f27980q);
    }

    /* renamed from: i */
    private C7541h m35674i() {
        return new C7541h(this.f27975l);
    }

    /* renamed from: r */
    private Drawable m35675r() {
        if (this.f27977n == null) {
            this.f27977n = m35673h();
        }
        if (this.f27978o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f27977n, this.f27967d, m35671f()});
            this.f27978o = layerDrawable;
            layerDrawable.setId(2, C7494f.mtrl_card_checked_layer_id);
        }
        return this.f27978o;
    }

    /* renamed from: t */
    private float m35676t() {
        if (!this.f27964a.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT < 21 || this.f27964a.getUseCompatPadding()) {
            return (float) ((1.0d - f27963u) * ((double) this.f27964a.getCardViewRadius()));
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public Rect mo23234A() {
        return this.f27965b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo23235C() {
        return this.f27981r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo23236D() {
        return this.f27982s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo23237E(TypedArray typedArray) {
        ColorStateList a = C7522c.m42014a(this.f27964a.getContext(), typedArray, C7500l.MaterialCardView_strokeColor);
        this.f27976m = a;
        if (a == null) {
            this.f27976m = ColorStateList.valueOf(-1);
        }
        this.f27970g = typedArray.getDimensionPixelSize(C7500l.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C7500l.MaterialCardView_android_checkable, false);
        this.f27982s = z;
        this.f27964a.setLongClickable(z);
        this.f27974k = C7522c.m42014a(this.f27964a.getContext(), typedArray, C7500l.MaterialCardView_checkedIconTint);
        mo23243K(C7522c.m42017d(this.f27964a.getContext(), typedArray, C7500l.MaterialCardView_checkedIcon));
        mo23245M(typedArray.getDimensionPixelSize(C7500l.MaterialCardView_checkedIconSize, 0));
        mo23244L(typedArray.getDimensionPixelSize(C7500l.MaterialCardView_checkedIconMargin, 0));
        ColorStateList a2 = C7522c.m42014a(this.f27964a.getContext(), typedArray, C7500l.MaterialCardView_rippleColor);
        this.f27973j = a2;
        if (a2 == null) {
            this.f27973j = ColorStateList.valueOf(C7513a.m41980d(this.f27964a, C7490b.colorControlHighlight));
        }
        mo23241I(C7522c.m42014a(this.f27964a.getContext(), typedArray, C7500l.MaterialCardView_cardForegroundColor));
        m35668c0();
        mo23256Z();
        mo23258d0();
        this.f27964a.setBackgroundInternal(m35661B(this.f27966c));
        Drawable r = this.f27964a.isClickable() ? m35675r() : this.f27967d;
        this.f27971h = r;
        this.f27964a.setForeground(m35661B(r));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo23238F(int i, int i2) {
        int i3;
        int i4;
        if (this.f27978o != null) {
            int i5 = this.f27968e;
            int i6 = this.f27969f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if ((Build.VERSION.SDK_INT < 21) || this.f27964a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m35669d() * 2.0f));
                i7 -= (int) Math.ceil((double) (m35667c() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f27968e;
            if (C3774v.m16151B(this.f27964a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f27978o.setLayerInset(2, i4, this.f27968e, i3, i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo23239G(boolean z) {
        this.f27981r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo23240H(ColorStateList colorStateList) {
        this.f27966c.mo28463a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo23241I(ColorStateList colorStateList) {
        C7541h hVar = this.f27967d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.mo28463a0(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo23242J(boolean z) {
        this.f27982s = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo23243K(Drawable drawable) {
        this.f27972i = drawable;
        if (drawable != null) {
            Drawable r = C0534a.m3292r(drawable.mutate());
            this.f27972i = r;
            C0534a.m3289o(r, this.f27974k);
        }
        if (this.f27978o != null) {
            this.f27978o.setDrawableByLayerId(C7494f.mtrl_card_checked_layer_id, m35671f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo23244L(int i) {
        this.f27968e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo23245M(int i) {
        this.f27969f = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo23246N(ColorStateList colorStateList) {
        this.f27974k = colorStateList;
        Drawable drawable = this.f27972i;
        if (drawable != null) {
            C0534a.m3289o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo23247O(float f) {
        mo23250R(this.f27975l.mo28513w(f));
        this.f27971h.invalidateSelf();
        if (m35663W() || m35662V()) {
            mo23255Y();
        }
        if (m35663W()) {
            mo23257b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo23248P(float f) {
        this.f27966c.mo28464b0(f);
        C7541h hVar = this.f27967d;
        if (hVar != null) {
            hVar.mo28464b0(f);
        }
        C7541h hVar2 = this.f27980q;
        if (hVar2 != null) {
            hVar2.mo28464b0(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo23249Q(ColorStateList colorStateList) {
        this.f27973j = colorStateList;
        m35668c0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo23250R(C7549m mVar) {
        this.f27975l = mVar;
        this.f27966c.setShapeAppearanceModel(mVar);
        C7541h hVar = this.f27966c;
        hVar.mo28468f0(!hVar.mo28458S());
        C7541h hVar2 = this.f27967d;
        if (hVar2 != null) {
            hVar2.setShapeAppearanceModel(mVar);
        }
        C7541h hVar3 = this.f27980q;
        if (hVar3 != null) {
            hVar3.setShapeAppearanceModel(mVar);
        }
        C7541h hVar4 = this.f27979p;
        if (hVar4 != null) {
            hVar4.setShapeAppearanceModel(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo23251S(ColorStateList colorStateList) {
        if (this.f27976m != colorStateList) {
            this.f27976m = colorStateList;
            mo23258d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo23252T(int i) {
        if (i != this.f27970g) {
            this.f27970g = i;
            mo23258d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo23253U(int i, int i2, int i3, int i4) {
        this.f27965b.set(i, i2, i3, i4);
        mo23255Y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo23254X() {
        Drawable drawable = this.f27971h;
        Drawable r = this.f27964a.isClickable() ? m35675r() : this.f27967d;
        this.f27971h = r;
        if (drawable != r) {
            m35665a0(r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo23255Y() {
        int a = (int) ((m35662V() || m35663W() ? m35664a() : 0.0f) - m35676t());
        MaterialCardView materialCardView = this.f27964a;
        Rect rect = this.f27965b;
        materialCardView.mo23205m(rect.left + a, rect.top + a, rect.right + a, rect.bottom + a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo23256Z() {
        this.f27966c.mo28462Z(this.f27964a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void mo23257b0() {
        if (!mo23235C()) {
            this.f27964a.setBackgroundInternal(m35661B(this.f27966c));
        }
        this.f27964a.setForeground(m35661B(this.f27971h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo23258d0() {
        this.f27967d.mo28478k0((float) this.f27970g, this.f27976m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo23259j() {
        Drawable drawable = this.f27977n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f27977n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f27977n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C7541h mo23260k() {
        return this.f27966c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo23261l() {
        return this.f27966c.mo28489x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ColorStateList mo23262m() {
        return this.f27967d.mo28489x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Drawable mo23263n() {
        return this.f27972i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo23264o() {
        return this.f27968e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23265p() {
        return this.f27969f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public ColorStateList mo23266q() {
        return this.f27974k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo23267s() {
        return this.f27966c.mo28452I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo23268u() {
        return this.f27966c.mo28490y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public ColorStateList mo23269v() {
        return this.f27973j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C7549m mo23270w() {
        return this.f27975l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo23271x() {
        ColorStateList colorStateList = this.f27976m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ColorStateList mo23272y() {
        return this.f27976m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo23273z() {
        return this.f27970g;
    }
}
