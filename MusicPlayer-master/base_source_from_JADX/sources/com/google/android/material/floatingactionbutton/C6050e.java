package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C0506a;
import java.util.ArrayList;
import p082e.p109h.p118o.C3703i;
import p159f.p243f.p245b.p304b.C7491c;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p314v.C7533b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: com.google.android.material.floatingactionbutton.e */
/* compiled from: FloatingActionButtonImplLollipop */
class C6050e extends C6037d {

    /* renamed from: com.google.android.material.floatingactionbutton.e$a */
    /* compiled from: FloatingActionButtonImplLollipop */
    static class C6051a extends C7541h {
        C6051a(C7549m mVar) {
            super(mVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    C6050e(FloatingActionButton floatingActionButton, C7533b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: j0 */
    private Animator m36319j0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f28329y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f28329y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C6037d.f28293F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo23941A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo23943C() {
        mo23974f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo23945E(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f28329y.isEnabled()) {
            this.f28329y.setElevation(this.f28312h);
            if (this.f28329y.isPressed()) {
                this.f28329y.setTranslationZ(this.f28314j);
            } else if (this.f28329y.isFocused() || this.f28329y.isHovered()) {
                this.f28329y.setTranslationZ(this.f28313i);
            } else {
                this.f28329y.setTranslationZ(0.0f);
            }
        } else {
            this.f28329y.setElevation(0.0f);
            this.f28329y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo23946F(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f28329y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C6037d.f28294G, m36319j0(f, f3));
            stateListAnimator.addState(C6037d.f28295H, m36319j0(f, f2));
            stateListAnimator.addState(C6037d.f28296I, m36319j0(f, f2));
            stateListAnimator.addState(C6037d.f28297J, m36319j0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f28329y, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f28329y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f28329y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C6037d.f28293F);
            stateListAnimator.addState(C6037d.f28298K, animatorSet);
            stateListAnimator.addState(C6037d.f28299L, m36319j0(0.0f, 0.0f));
            this.f28329y.setStateListAnimator(stateListAnimator);
        }
        if (mo23966Z()) {
            mo23974f0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo23951K() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo23962V(ColorStateList colorStateList) {
        Drawable drawable = this.f28307c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C7531b.m42046d(colorStateList));
        } else {
            super.mo23962V(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo23966Z() {
        return this.f28330z.mo23906b() || !mo23967b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo23970d0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public C6034c mo24002i0(int i, ColorStateList colorStateList) {
        Context context = this.f28329y.getContext();
        C7549m mVar = this.f28305a;
        C3703i.m15827d(mVar);
        C6034c cVar = new C6034c(mVar);
        cVar.mo23928e(C0506a.m3150b(context, C7491c.design_fab_stroke_top_outer_color), C0506a.m3150b(context, C7491c.design_fab_stroke_top_inner_color), C0506a.m3150b(context, C7491c.design_fab_stroke_end_inner_color), C0506a.m3150b(context, C7491c.design_fab_stroke_end_outer_color));
        cVar.mo23926d((float) i);
        cVar.mo23925c(colorStateList);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7541h mo23976j() {
        C7549m mVar = this.f28305a;
        C3703i.m15827d(mVar);
        return new C6051a(mVar);
    }

    /* renamed from: n */
    public float mo23978n() {
        return this.f28329y.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23982s(Rect rect) {
        if (this.f28330z.mo23906b()) {
            super.mo23982s(rect);
        } else if (!mo23967b0()) {
            int sizeDimension = (this.f28315k - this.f28329y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23987x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C7541h j = mo23976j();
        this.f28306b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.f28306b.setTintMode(mode);
        }
        this.f28306b.mo28456P(this.f28329y.getContext());
        if (i > 0) {
            this.f28308d = mo24002i0(i, colorStateList);
            C6034c cVar = this.f28308d;
            C3703i.m15827d(cVar);
            C7541h hVar = this.f28306b;
            C3703i.m15827d(hVar);
            drawable = new LayerDrawable(new Drawable[]{cVar, hVar});
        } else {
            this.f28308d = null;
            drawable = this.f28306b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C7531b.m42046d(colorStateList2), drawable, (Drawable) null);
        this.f28307c = rippleDrawable;
        this.f28309e = rippleDrawable;
    }
}
