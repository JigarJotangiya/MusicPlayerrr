package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Arrays;
import p082e.p154x.p155a.p156a.C4236b;
import p082e.p154x.p155a.p156a.C4241d;
import p159f.p243f.p245b.p304b.C7489a;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.m */
/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
final class C6149m extends C6143i<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f28721l = {533, 567, 850, 750};

    /* renamed from: m */
    private static final int[] f28722m = {1267, 1000, 333, 0};

    /* renamed from: n */
    private static final Property<C6149m, Float> f28723n = new C6151b(Float.class, "animationFraction");
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ObjectAnimator f28724d;

    /* renamed from: e */
    private final Interpolator[] f28725e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6129c f28726f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f28727g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f28728h;

    /* renamed from: i */
    private float f28729i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f28730j;

    /* renamed from: k */
    C4236b f28731k = null;

    /* renamed from: com.google.android.material.progressindicator.m$a */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    class C6150a extends AnimatorListenerAdapter {
        C6150a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (C6149m.this.f28730j) {
                C6149m.this.f28724d.setRepeatCount(-1);
                C6149m mVar = C6149m.this;
                mVar.f28731k.mo14425a(mVar.f28705a);
                boolean unused = C6149m.this.f28730j = false;
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6149m mVar = C6149m.this;
            int unused = mVar.f28727g = (mVar.f28727g + 1) % C6149m.this.f28726f.f28657c.length;
            boolean unused2 = C6149m.this.f28728h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.m$b */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    static class C6151b extends Property<C6149m, Float> {
        C6151b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C6149m mVar) {
            return Float.valueOf(mVar.m36833q());
        }

        /* renamed from: b */
        public void set(C6149m mVar, Float f) {
            mVar.mo24525u(f.floatValue());
        }
    }

    public C6149m(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f28726f = linearProgressIndicatorSpec;
        this.f28725e = new Interpolator[]{C4241d.m18633b(context, C7489a.linear_indeterminate_line1_head_interpolator), C4241d.m18633b(context, C7489a.linear_indeterminate_line1_tail_interpolator), C4241d.m18633b(context, C7489a.linear_indeterminate_line2_head_interpolator), C4241d.m18633b(context, C7489a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public float m36833q() {
        return this.f28729i;
    }

    /* renamed from: r */
    private void m36834r() {
        if (this.f28724d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f28723n, new float[]{0.0f, 1.0f});
            this.f28724d = ofFloat;
            ofFloat.setDuration(1800);
            this.f28724d.setInterpolator((TimeInterpolator) null);
            this.f28724d.setRepeatCount(-1);
            this.f28724d.addListener(new C6150a());
        }
    }

    /* renamed from: s */
    private void m36835s() {
        if (this.f28728h) {
            Arrays.fill(this.f28707c, C7513a.m41977a(this.f28726f.f28657c[this.f28727g], this.f28705a.getAlpha()));
            this.f28728h = false;
        }
    }

    /* renamed from: v */
    private void m36836v(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f28706b[i2] = Math.max(0.0f, Math.min(1.0f, this.f28725e[i2].getInterpolation(mo24508b(i, f28722m[i2], f28721l[i2]))));
        }
    }

    /* renamed from: a */
    public void mo24455a() {
        ObjectAnimator objectAnimator = this.f28724d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo24456c() {
        mo24524t();
    }

    /* renamed from: d */
    public void mo24457d(C4236b bVar) {
        this.f28731k = bVar;
    }

    /* renamed from: f */
    public void mo24458f() {
        if (this.f28705a.isVisible()) {
            this.f28730j = true;
            this.f28724d.setRepeatCount(0);
            return;
        }
        mo24455a();
    }

    /* renamed from: g */
    public void mo24459g() {
        m36834r();
        mo24524t();
        this.f28724d.start();
    }

    /* renamed from: h */
    public void mo24460h() {
        this.f28731k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo24524t() {
        this.f28727g = 0;
        int a = C7513a.m41977a(this.f28726f.f28657c[0], this.f28705a.getAlpha());
        int[] iArr = this.f28707c;
        iArr[0] = a;
        iArr[1] = a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo24525u(float f) {
        this.f28729i = f;
        m36836v((int) (f * 1800.0f));
        m36835s();
        this.f28705a.invalidateSelf();
    }
}
