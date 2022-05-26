package coocent.music.player.widget;

import android.animation.ValueAnimator;

/* renamed from: coocent.music.player.widget.c */
/* compiled from: lambda */
public final /* synthetic */ class C7179c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ EqLayout f31792a;

    /* renamed from: b */
    public final /* synthetic */ int f31793b;

    /* renamed from: c */
    public final /* synthetic */ int[] f31794c;

    public /* synthetic */ C7179c(EqLayout eqLayout, int i, int[] iArr) {
        this.f31792a = eqLayout;
        this.f31793b = i;
        this.f31794c = iArr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f31792a.mo27483M(this.f31793b, this.f31794c, valueAnimator);
    }
}
