package p159f.p243f.p245b.p304b.p317y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f.f.b.b.y.d */
/* compiled from: ScaleProvider */
public final class C7573d implements C7576f {

    /* renamed from: a */
    private float f32935a;

    /* renamed from: b */
    private float f32936b;

    /* renamed from: c */
    private float f32937c;

    /* renamed from: d */
    private float f32938d;

    /* renamed from: e */
    private boolean f32939e;

    /* renamed from: f */
    private boolean f32940f;

    /* renamed from: f.f.b.b.y.d$a */
    /* compiled from: ScaleProvider */
    static class C7574a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f32941a;

        /* renamed from: b */
        final /* synthetic */ float f32942b;

        /* renamed from: c */
        final /* synthetic */ float f32943c;

        C7574a(View view, float f, float f2) {
            this.f32941a = view;
            this.f32942b = f;
            this.f32943c = f2;
        }

        public void onAnimationEnd(Animator animator) {
            this.f32941a.setScaleX(this.f32942b);
            this.f32941a.setScaleY(this.f32943c);
        }
    }

    public C7573d() {
        this(true);
    }

    /* renamed from: c */
    private static Animator m42308c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new C7574a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public Animator mo28564a(ViewGroup viewGroup, View view) {
        if (this.f32939e) {
            return m42308c(view, this.f32937c, this.f32938d);
        }
        return m42308c(view, this.f32936b, this.f32935a);
    }

    /* renamed from: b */
    public Animator mo28565b(ViewGroup viewGroup, View view) {
        if (!this.f32940f) {
            return null;
        }
        if (this.f32939e) {
            return m42308c(view, this.f32935a, this.f32936b);
        }
        return m42308c(view, this.f32938d, this.f32937c);
    }

    /* renamed from: d */
    public void mo28571d(float f) {
        this.f32937c = f;
    }

    /* renamed from: e */
    public void mo28572e(boolean z) {
        this.f32940f = z;
    }

    public C7573d(boolean z) {
        this.f32935a = 1.0f;
        this.f32936b = 1.1f;
        this.f32937c = 0.8f;
        this.f32938d = 1.0f;
        this.f32940f = true;
        this.f32939e = z;
    }
}
