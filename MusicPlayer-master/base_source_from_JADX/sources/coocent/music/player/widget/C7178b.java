package coocent.music.player.widget;

import android.animation.ValueAnimator;

/* renamed from: coocent.music.player.widget.b */
/* compiled from: lambda */
public final /* synthetic */ class C7178b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ EqLayout f31789a;

    /* renamed from: b */
    public final /* synthetic */ int f31790b;

    /* renamed from: c */
    public final /* synthetic */ int[] f31791c;

    public /* synthetic */ C7178b(EqLayout eqLayout, int i, int[] iArr) {
        this.f31789a = eqLayout;
        this.f31790b = i;
        this.f31791c = iArr;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f31789a.mo27484O(this.f31790b, this.f31791c, valueAnimator);
    }
}
