package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p082e.p154x.p155a.p156a.C4236b;
import p159f.p243f.p245b.p304b.p305m.C7501a;

/* renamed from: com.google.android.material.progressindicator.g */
/* compiled from: DrawableWithAnimatedVisibilityChange */
abstract class C6138g extends Drawable implements Animatable {

    /* renamed from: u */
    private static final Property<C6138g, Float> f28686u = new C6141c(Float.class, "growFraction");

    /* renamed from: g */
    final Context f28687g;

    /* renamed from: h */
    final C6129c f28688h;

    /* renamed from: i */
    C6123a f28689i;

    /* renamed from: j */
    private ValueAnimator f28690j;

    /* renamed from: k */
    private ValueAnimator f28691k;

    /* renamed from: l */
    private boolean f28692l;

    /* renamed from: m */
    private boolean f28693m;

    /* renamed from: n */
    private float f28694n;

    /* renamed from: o */
    private List<C4236b> f28695o;

    /* renamed from: p */
    private C4236b f28696p;

    /* renamed from: q */
    private boolean f28697q;

    /* renamed from: r */
    private float f28698r;

    /* renamed from: s */
    final Paint f28699s = new Paint();

    /* renamed from: t */
    private int f28700t;

    /* renamed from: com.google.android.material.progressindicator.g$a */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    class C6139a extends AnimatorListenerAdapter {
        C6139a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C6138g.this.m36762e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$b */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    class C6140b extends AnimatorListenerAdapter {
        C6140b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = C6138g.super.setVisible(false, false);
            C6138g.this.m36761d();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$c */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    static class C6141c extends Property<C6138g, Float> {
        C6141c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C6138g gVar) {
            return Float.valueOf(gVar.mo24484g());
        }

        /* renamed from: b */
        public void set(C6138g gVar, Float f) {
            gVar.mo24492m(f.floatValue());
        }
    }

    C6138g(Context context, C6129c cVar) {
        this.f28687g = context;
        this.f28688h = cVar;
        this.f28689i = new C6123a();
        setAlpha(255);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m36761d() {
        C4236b bVar = this.f28696p;
        if (bVar != null) {
            bVar.mo14425a(this);
        }
        List<C4236b> list = this.f28695o;
        if (list != null && !this.f28697q) {
            for (C4236b a : list) {
                a.mo14425a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m36762e() {
        C4236b bVar = this.f28696p;
        if (bVar != null) {
            bVar.mo14426b(this);
        }
        List<C4236b> list = this.f28695o;
        if (list != null && !this.f28697q) {
            for (C4236b b : list) {
                b.mo14426b(this);
            }
        }
    }

    /* renamed from: f */
    private void m36763f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f28697q;
        this.f28697q = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f28697q = z;
    }

    /* renamed from: k */
    private void m36764k() {
        if (this.f28690j == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f28686u, new float[]{0.0f, 1.0f});
            this.f28690j = ofFloat;
            ofFloat.setDuration(500);
            this.f28690j.setInterpolator(C7501a.f32700b);
            m36766o(this.f28690j);
        }
        if (this.f28691k == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f28686u, new float[]{1.0f, 0.0f});
            this.f28691k = ofFloat2;
            ofFloat2.setDuration(500);
            this.f28691k.setInterpolator(C7501a.f32700b);
            m36765n(this.f28691k);
        }
    }

    /* renamed from: n */
    private void m36765n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f28691k;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f28691k = valueAnimator;
            valueAnimator.addListener(new C6140b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: o */
    private void m36766o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f28690j;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f28690j = valueAnimator;
            valueAnimator.addListener(new C6139a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo24484g() {
        if (!this.f28688h.mo24449b() && !this.f28688h.mo24448a()) {
            return 1.0f;
        }
        if (this.f28693m || this.f28692l) {
            return this.f28694n;
        }
        return this.f28698r;
    }

    public int getAlpha() {
        return this.f28700t;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo24487h() {
        return mo24493p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo24488i() {
        ValueAnimator valueAnimator = this.f28691k;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f28693m;
    }

    public boolean isRunning() {
        return mo24490j() || mo24488i();
    }

    /* renamed from: j */
    public boolean mo24490j() {
        ValueAnimator valueAnimator = this.f28690j;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f28692l;
    }

    /* renamed from: l */
    public void mo24491l(C4236b bVar) {
        if (this.f28695o == null) {
            this.f28695o = new ArrayList();
        }
        if (!this.f28695o.contains(bVar)) {
            this.f28695o.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo24492m(float f) {
        if (this.f28698r != f) {
            this.f28698r = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo24493p(boolean z, boolean z2, boolean z3) {
        return mo24479q(z, z2, z3 && this.f28689i.mo24417a(this.f28687g.getContentResolver()) > 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo24479q(boolean z, boolean z2, boolean z3) {
        m36764k();
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator = z ? this.f28690j : this.f28691k;
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m36763f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z4 = !z || super.setVisible(z, false);
            if (!(z ? this.f28688h.mo24449b() : this.f28688h.mo24448a())) {
                m36763f(valueAnimator);
                return z4;
            }
            if (z2 || Build.VERSION.SDK_INT < 19 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo24494r(C4236b bVar) {
        List<C4236b> list = this.f28695o;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f28695o.remove(bVar);
        if (!this.f28695o.isEmpty()) {
            return true;
        }
        this.f28695o = null;
        return true;
    }

    public void setAlpha(int i) {
        this.f28700t = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28699s.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo24493p(z, z2, true);
    }

    public void start() {
        mo24479q(true, true, false);
    }

    public void stop() {
        mo24479q(false, true, false);
    }
}
