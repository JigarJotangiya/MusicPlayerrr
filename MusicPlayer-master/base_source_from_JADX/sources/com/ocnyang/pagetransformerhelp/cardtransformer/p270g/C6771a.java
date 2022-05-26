package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.a */
/* compiled from: ABaseTransformer */
public abstract class C6771a implements ViewPager.C1181j {
    /* renamed from: d */
    protected static final float m38637d(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: a */
    public void mo6288a(View view, float f) {
        mo26358f(view, f);
        mo26359g(view, f);
        mo26357e(view, f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo26355b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26356c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26357e(View view, float f) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo26358f(View view, float f) {
        float width = (float) view.getWidth();
        float f2 = 0.0f;
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setTranslationY(0.0f);
        view.setTranslationX(mo26356c() ? 0.0f : (-width) * f);
        if (mo26355b()) {
            if (f > -1.0f && f < 1.0f) {
                f2 = 1.0f;
            }
            view.setAlpha(f2);
            return;
        }
        view.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo26359g(View view, float f);
}
