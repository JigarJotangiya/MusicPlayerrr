package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import p082e.p137o.p138a.p139a.C4097b;
import p082e.p154x.p155a.p156a.C4236b;
import p159f.p243f.p245b.p304b.p305m.C7503c;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.e */
/* compiled from: CircularIndeterminateAnimatorDelegate */
final class C6131e extends C6143i<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f28665l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f28666m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f28667n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<C6131e, Float> f28668o;

    /* renamed from: p */
    private static final Property<C6131e, Float> f28669p;

    /* renamed from: d */
    private ObjectAnimator f28670d;

    /* renamed from: e */
    private ObjectAnimator f28671e;

    /* renamed from: f */
    private final C4097b f28672f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6129c f28673g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f28674h = 0;

    /* renamed from: i */
    private float f28675i;

    /* renamed from: j */
    private float f28676j;

    /* renamed from: k */
    C4236b f28677k = null;

    /* renamed from: com.google.android.material.progressindicator.e$a */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    class C6132a extends AnimatorListenerAdapter {
        C6132a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6131e eVar = C6131e.this;
            int unused = eVar.f28674h = (eVar.f28674h + 4) % C6131e.this.f28673g.f28657c.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.e$b */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    class C6133b extends AnimatorListenerAdapter {
        C6133b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C6131e.this.mo24455a();
            C6131e eVar = C6131e.this;
            eVar.f28677k.mo14425a(eVar.f28705a);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.e$c */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    static class C6134c extends Property<C6131e, Float> {
        C6134c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C6131e eVar) {
            return Float.valueOf(eVar.m36726o());
        }

        /* renamed from: b */
        public void set(C6131e eVar, Float f) {
            eVar.mo24462t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.e$d */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    static class C6135d extends Property<C6131e, Float> {
        C6135d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C6131e eVar) {
            return Float.valueOf(eVar.m36727p());
        }

        /* renamed from: b */
        public void set(C6131e eVar, Float f) {
            eVar.m36730u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f28668o = new C6134c(cls, "animationFraction");
        f28669p = new C6135d(cls, "completeEndFraction");
    }

    public C6131e(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f28673g = circularProgressIndicatorSpec;
        this.f28672f = new C4097b();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public float m36726o() {
        return this.f28675i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public float m36727p() {
        return this.f28676j;
    }

    /* renamed from: q */
    private void m36728q() {
        if (this.f28670d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f28668o, new float[]{0.0f, 1.0f});
            this.f28670d = ofFloat;
            ofFloat.setDuration(5400);
            this.f28670d.setInterpolator((TimeInterpolator) null);
            this.f28670d.setRepeatCount(-1);
            this.f28670d.addListener(new C6132a());
        }
        if (this.f28671e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f28669p, new float[]{0.0f, 1.0f});
            this.f28671e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f28671e.setInterpolator(this.f28672f);
            this.f28671e.addListener(new C6133b());
        }
    }

    /* renamed from: r */
    private void m36729r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo24508b(i, f28667n[i2], 333);
            if (b < 0.0f || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f28674h;
                int[] iArr = this.f28673g.f28657c;
                int length = i3 % iArr.length;
                int a = C7513a.m41977a(iArr[length], this.f28705a.getAlpha());
                int a2 = C7513a.m41977a(this.f28673g.f28657c[(length + 1) % iArr.length], this.f28705a.getAlpha());
                this.f28707c[0] = C7503c.m41944b().evaluate(this.f28672f.getInterpolation(b), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m36730u(float f) {
        this.f28676j = f;
    }

    /* renamed from: v */
    private void m36731v(int i) {
        float[] fArr = this.f28706b;
        float f = this.f28675i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo24508b(i, f28665l[i2], 667);
            float[] fArr2 = this.f28706b;
            fArr2[1] = fArr2[1] + (this.f28672f.getInterpolation(b) * 250.0f);
            float b2 = mo24508b(i, f28666m[i2], 667);
            float[] fArr3 = this.f28706b;
            fArr3[0] = fArr3[0] + (this.f28672f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f28706b;
        fArr4[0] = fArr4[0] + ((fArr4[1] - fArr4[0]) * this.f28676j);
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24455a() {
        ObjectAnimator objectAnimator = this.f28670d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo24456c() {
        mo24461s();
    }

    /* renamed from: d */
    public void mo24457d(C4236b bVar) {
        this.f28677k = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo24458f() {
        if (!this.f28671e.isRunning()) {
            if (this.f28705a.isVisible()) {
                this.f28671e.start();
            } else {
                mo24455a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24459g() {
        m36728q();
        mo24461s();
        this.f28670d.start();
    }

    /* renamed from: h */
    public void mo24460h() {
        this.f28677k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo24461s() {
        this.f28674h = 0;
        this.f28707c[0] = C7513a.m41977a(this.f28673g.f28657c[0], this.f28705a.getAlpha());
        this.f28676j = 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24462t(float f) {
        this.f28675i = f;
        int i = (int) (f * 5400.0f);
        m36731v(i);
        m36729r(i);
        this.f28705a.invalidateSelf();
    }
}
