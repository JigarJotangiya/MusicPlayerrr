package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.internal.C6100s;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p313u.C7528a;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

/* renamed from: com.google.android.material.button.a */
/* compiled from: MaterialButtonHelper */
class C5950a {

    /* renamed from: t */
    private static final boolean f27933t = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f27934a;

    /* renamed from: b */
    private C7549m f27935b;

    /* renamed from: c */
    private int f27936c;

    /* renamed from: d */
    private int f27937d;

    /* renamed from: e */
    private int f27938e;

    /* renamed from: f */
    private int f27939f;

    /* renamed from: g */
    private int f27940g;

    /* renamed from: h */
    private int f27941h;

    /* renamed from: i */
    private PorterDuff.Mode f27942i;

    /* renamed from: j */
    private ColorStateList f27943j;

    /* renamed from: k */
    private ColorStateList f27944k;

    /* renamed from: l */
    private ColorStateList f27945l;

    /* renamed from: m */
    private Drawable f27946m;

    /* renamed from: n */
    private boolean f27947n = false;

    /* renamed from: o */
    private boolean f27948o = false;

    /* renamed from: p */
    private boolean f27949p = false;

    /* renamed from: q */
    private boolean f27950q;

    /* renamed from: r */
    private LayerDrawable f27951r;

    /* renamed from: s */
    private int f27952s;

    C5950a(MaterialButton materialButton, C7549m mVar) {
        this.f27934a = materialButton;
        this.f27935b = mVar;
    }

    /* renamed from: E */
    private void m35619E(int i, int i2) {
        int G = C3774v.m16161G(this.f27934a);
        int paddingTop = this.f27934a.getPaddingTop();
        int F = C3774v.m16159F(this.f27934a);
        int paddingBottom = this.f27934a.getPaddingBottom();
        int i3 = this.f27938e;
        int i4 = this.f27939f;
        this.f27939f = i2;
        this.f27938e = i;
        if (!this.f27948o) {
            m35620F();
        }
        C3774v.m16156D0(this.f27934a, G, (paddingTop + i) - i3, F, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    private void m35620F() {
        this.f27934a.setInternalBackground(m35624a());
        C7541h f = mo23171f();
        if (f != null) {
            f.mo28462Z((float) this.f27952s);
        }
    }

    /* renamed from: G */
    private void m35621G(C7549m mVar) {
        if (mo23171f() != null) {
            mo23171f().setShapeAppearanceModel(mVar);
        }
        if (m35626n() != null) {
            m35626n().setShapeAppearanceModel(mVar);
        }
        if (mo23170e() != null) {
            mo23170e().setShapeAppearanceModel(mVar);
        }
    }

    /* renamed from: I */
    private void m35622I() {
        C7541h f = mo23171f();
        C7541h n = m35626n();
        if (f != null) {
            f.mo28478k0((float) this.f27941h, this.f27944k);
            if (n != null) {
                n.mo28477j0((float) this.f27941h, this.f27947n ? C7513a.m41980d(this.f27934a, C7490b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: J */
    private InsetDrawable m35623J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f27936c, this.f27938e, this.f27937d, this.f27939f);
    }

    /* renamed from: a */
    private Drawable m35624a() {
        C7541h hVar = new C7541h(this.f27935b);
        hVar.mo28456P(this.f27934a.getContext());
        C0534a.m3289o(hVar, this.f27943j);
        PorterDuff.Mode mode = this.f27942i;
        if (mode != null) {
            C0534a.m3290p(hVar, mode);
        }
        hVar.mo28478k0((float) this.f27941h, this.f27944k);
        C7541h hVar2 = new C7541h(this.f27935b);
        hVar2.setTint(0);
        hVar2.mo28477j0((float) this.f27941h, this.f27947n ? C7513a.m41980d(this.f27934a, C7490b.colorSurface) : 0);
        if (f27933t) {
            C7541h hVar3 = new C7541h(this.f27935b);
            this.f27946m = hVar3;
            C0534a.m3288n(hVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C7531b.m42046d(this.f27945l), m35623J(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f27946m);
            this.f27951r = rippleDrawable;
            return rippleDrawable;
        }
        C7528a aVar = new C7528a(this.f27935b);
        this.f27946m = aVar;
        C0534a.m3289o(aVar, C7531b.m42046d(this.f27945l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hVar2, hVar, this.f27946m});
        this.f27951r = layerDrawable;
        return m35623J(layerDrawable);
    }

    /* renamed from: g */
    private C7541h m35625g(boolean z) {
        LayerDrawable layerDrawable = this.f27951r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f27933t) {
            return (C7541h) ((LayerDrawable) ((InsetDrawable) this.f27951r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C7541h) this.f27951r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: n */
    private C7541h m35626n() {
        return m35625g(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo23162A(ColorStateList colorStateList) {
        if (this.f27944k != colorStateList) {
            this.f27944k = colorStateList;
            m35622I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo23163B(int i) {
        if (this.f27941h != i) {
            this.f27941h = i;
            m35622I();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo23164C(ColorStateList colorStateList) {
        if (this.f27943j != colorStateList) {
            this.f27943j = colorStateList;
            if (mo23171f() != null) {
                C0534a.m3289o(mo23171f(), this.f27943j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo23165D(PorterDuff.Mode mode) {
        if (this.f27942i != mode) {
            this.f27942i = mode;
            if (mo23171f() != null && this.f27942i != null) {
                C0534a.m3290p(mo23171f(), this.f27942i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo23166H(int i, int i2) {
        Drawable drawable = this.f27946m;
        if (drawable != null) {
            drawable.setBounds(this.f27936c, this.f27938e, i2 - this.f27937d, i - this.f27939f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo23167b() {
        return this.f27940g;
    }

    /* renamed from: c */
    public int mo23168c() {
        return this.f27939f;
    }

    /* renamed from: d */
    public int mo23169d() {
        return this.f27938e;
    }

    /* renamed from: e */
    public C7565p mo23170e() {
        LayerDrawable layerDrawable = this.f27951r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f27951r.getNumberOfLayers() > 2) {
            return (C7565p) this.f27951r.getDrawable(2);
        }
        return (C7565p) this.f27951r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C7541h mo23171f() {
        return m35625g(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo23172h() {
        return this.f27945l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C7549m mo23173i() {
        return this.f27935b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo23174j() {
        return this.f27944k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo23175k() {
        return this.f27941h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo23176l() {
        return this.f27943j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public PorterDuff.Mode mo23177m() {
        return this.f27942i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo23178o() {
        return this.f27948o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo23179p() {
        return this.f27950q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo23180q(TypedArray typedArray) {
        this.f27936c = typedArray.getDimensionPixelOffset(C7500l.MaterialButton_android_insetLeft, 0);
        this.f27937d = typedArray.getDimensionPixelOffset(C7500l.MaterialButton_android_insetRight, 0);
        this.f27938e = typedArray.getDimensionPixelOffset(C7500l.MaterialButton_android_insetTop, 0);
        this.f27939f = typedArray.getDimensionPixelOffset(C7500l.MaterialButton_android_insetBottom, 0);
        int i = C7500l.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f27940g = dimensionPixelSize;
            mo23188y(this.f27935b.mo28513w((float) dimensionPixelSize));
            this.f27949p = true;
        }
        this.f27941h = typedArray.getDimensionPixelSize(C7500l.MaterialButton_strokeWidth, 0);
        this.f27942i = C6100s.m36588i(typedArray.getInt(C7500l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f27943j = C7522c.m42014a(this.f27934a.getContext(), typedArray, C7500l.MaterialButton_backgroundTint);
        this.f27944k = C7522c.m42014a(this.f27934a.getContext(), typedArray, C7500l.MaterialButton_strokeColor);
        this.f27945l = C7522c.m42014a(this.f27934a.getContext(), typedArray, C7500l.MaterialButton_rippleColor);
        this.f27950q = typedArray.getBoolean(C7500l.MaterialButton_android_checkable, false);
        this.f27952s = typedArray.getDimensionPixelSize(C7500l.MaterialButton_elevation, 0);
        int G = C3774v.m16161G(this.f27934a);
        int paddingTop = this.f27934a.getPaddingTop();
        int F = C3774v.m16159F(this.f27934a);
        int paddingBottom = this.f27934a.getPaddingBottom();
        if (typedArray.hasValue(C7500l.MaterialButton_android_background)) {
            mo23182s();
        } else {
            m35620F();
        }
        C3774v.m16156D0(this.f27934a, G + this.f27936c, paddingTop + this.f27938e, F + this.f27937d, paddingBottom + this.f27939f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo23181r(int i) {
        if (mo23171f() != null) {
            mo23171f().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23182s() {
        this.f27948o = true;
        this.f27934a.setSupportBackgroundTintList(this.f27943j);
        this.f27934a.setSupportBackgroundTintMode(this.f27942i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo23183t(boolean z) {
        this.f27950q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo23184u(int i) {
        if (!this.f27949p || this.f27940g != i) {
            this.f27940g = i;
            this.f27949p = true;
            mo23188y(this.f27935b.mo28513w((float) i));
        }
    }

    /* renamed from: v */
    public void mo23185v(int i) {
        m35619E(this.f27938e, i);
    }

    /* renamed from: w */
    public void mo23186w(int i) {
        m35619E(i, this.f27939f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23187x(ColorStateList colorStateList) {
        if (this.f27945l != colorStateList) {
            this.f27945l = colorStateList;
            boolean z = f27933t;
            if (z && (this.f27934a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f27934a.getBackground()).setColor(C7531b.m42046d(colorStateList));
            } else if (!z && (this.f27934a.getBackground() instanceof C7528a)) {
                ((C7528a) this.f27934a.getBackground()).setTintList(C7531b.m42046d(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo23188y(C7549m mVar) {
        this.f27935b = mVar;
        m35621G(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo23189z(boolean z) {
        this.f27947n = z;
        m35622I();
    }
}
