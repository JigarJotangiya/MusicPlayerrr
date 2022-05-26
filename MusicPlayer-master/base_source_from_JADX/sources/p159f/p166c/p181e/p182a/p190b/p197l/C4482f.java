package p159f.p166c.p181e.p182a.p190b.p197l;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: f.c.e.a.b.l.f */
/* compiled from: VolumeFadeUtils */
public class C4482f {

    /* renamed from: b */
    private static C4482f f13079b;

    /* renamed from: a */
    private ValueAnimator f13080a;

    /* renamed from: f.c.e.a.b.l.f$a */
    /* compiled from: VolumeFadeUtils */
    public interface C4483a {
        /* renamed from: f */
        void mo15192f();

        /* renamed from: g */
        void mo15193g(float f);
    }

    /* renamed from: c */
    public static C4482f m19680c() {
        if (f13079b == null) {
            synchronized (C4482f.class) {
                f13079b = new C4482f();
            }
        }
        return f13079b;
    }

    /* renamed from: d */
    static /* synthetic */ void m19681d(C4483a aVar, float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (aVar != null) {
            aVar.mo15193g(floatValue);
            if (floatValue == f) {
                aVar.mo15192f();
            }
        }
    }

    /* renamed from: a */
    public void mo15189a(C4483a aVar) {
        mo15191e(0.0f, 1.0f, 2000, aVar);
    }

    /* renamed from: b */
    public void mo15190b(C4483a aVar) {
        mo15191e(1.0f, 0.0f, 500, aVar);
    }

    /* renamed from: e */
    public void mo15191e(float f, float f2, long j, C4483a aVar) {
        ValueAnimator valueAnimator = this.f13080a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        this.f13080a = ofFloat;
        ofFloat.addUpdateListener(new C4475a(aVar, f2));
        if (f < f2) {
            this.f13080a.setInterpolator(new DecelerateInterpolator());
        } else {
            this.f13080a.setInterpolator(new LinearInterpolator());
        }
        this.f13080a.setDuration(j).start();
    }
}
