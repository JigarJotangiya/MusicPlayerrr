package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import java.util.Arrays;
import p082e.p137o.p138a.p139a.C4097b;
import p082e.p154x.p155a.p156a.C4236b;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.l */
/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
final class C6146l extends C6143i<ObjectAnimator> {

    /* renamed from: j */
    private static final Property<C6146l, Float> f28713j = new C6148b(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f28714d;

    /* renamed from: e */
    private C4097b f28715e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6129c f28716f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f28717g = 1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f28718h;

    /* renamed from: i */
    private float f28719i;

    /* renamed from: com.google.android.material.progressindicator.l$a */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    class C6147a extends AnimatorListenerAdapter {
        C6147a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6146l lVar = C6146l.this;
            int unused = lVar.f28717g = (lVar.f28717g + 1) % C6146l.this.f28716f.f28657c.length;
            boolean unused2 = C6146l.this.f28718h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.l$b */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    static class C6148b extends Property<C6146l, Float> {
        C6148b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C6146l lVar) {
            return Float.valueOf(lVar.m36811n());
        }

        /* renamed from: b */
        public void set(C6146l lVar, Float f) {
            lVar.mo24518r(f.floatValue());
        }
    }

    public C6146l(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f28716f = linearProgressIndicatorSpec;
        this.f28715e = new C4097b();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public float m36811n() {
        return this.f28719i;
    }

    /* renamed from: o */
    private void m36812o() {
        if (this.f28714d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f28713j, new float[]{0.0f, 1.0f});
            this.f28714d = ofFloat;
            ofFloat.setDuration(333);
            this.f28714d.setInterpolator((TimeInterpolator) null);
            this.f28714d.setRepeatCount(-1);
            this.f28714d.addListener(new C6147a());
        }
    }

    /* renamed from: p */
    private void m36813p() {
        if (this.f28718h && this.f28706b[3] < 1.0f) {
            int[] iArr = this.f28707c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = C7513a.m41977a(this.f28716f.f28657c[this.f28717g], this.f28705a.getAlpha());
            this.f28718h = false;
        }
    }

    /* renamed from: s */
    private void m36814s(int i) {
        this.f28706b[0] = 0.0f;
        float b = mo24508b(i, 0, 667);
        float[] fArr = this.f28706b;
        float interpolation = this.f28715e.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f28706b;
        float interpolation2 = this.f28715e.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f28706b[5] = 1.0f;
    }

    /* renamed from: a */
    public void mo24455a() {
        ObjectAnimator objectAnimator = this.f28714d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo24456c() {
        mo24517q();
    }

    /* renamed from: d */
    public void mo24457d(C4236b bVar) {
    }

    /* renamed from: f */
    public void mo24458f() {
    }

    /* renamed from: g */
    public void mo24459g() {
        m36812o();
        mo24517q();
        this.f28714d.start();
    }

    /* renamed from: h */
    public void mo24460h() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo24517q() {
        this.f28718h = true;
        this.f28717g = 1;
        Arrays.fill(this.f28707c, C7513a.m41977a(this.f28716f.f28657c[0], this.f28705a.getAlpha()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo24518r(float f) {
        this.f28719i = f;
        m36814s((int) (f * 333.0f));
        m36813p();
        this.f28705a.invalidateSelf();
    }
}
