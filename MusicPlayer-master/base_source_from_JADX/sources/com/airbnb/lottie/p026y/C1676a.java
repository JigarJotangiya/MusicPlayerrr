package com.airbnb.lottie.p026y;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.y.a */
/* compiled from: BaseLottieAnimator */
public abstract class C1676a extends ValueAnimator {

    /* renamed from: g */
    private final Set<ValueAnimator.AnimatorUpdateListener> f6311g = new CopyOnWriteArraySet();

    /* renamed from: h */
    private final Set<Animator.AnimatorListener> f6312h = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7446a() {
        for (Animator.AnimatorListener onAnimationCancel : this.f6312h) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f6312h.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6311g.add(animatorUpdateListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7449b(boolean z) {
        for (Animator.AnimatorListener next : this.f6312h) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7450c() {
        for (Animator.AnimatorListener onAnimationRepeat : this.f6312h) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7451e(boolean z) {
        for (Animator.AnimatorListener next : this.f6312h) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationStart(this, z);
            } else {
                next.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7452f() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f6311g) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f6312h.clear();
    }

    public void removeAllUpdateListeners() {
        this.f6311g.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f6312h.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6311g.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
