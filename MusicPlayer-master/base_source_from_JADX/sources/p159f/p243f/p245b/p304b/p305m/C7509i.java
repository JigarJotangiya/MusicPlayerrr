package p159f.p243f.p245b.p304b.p305m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: f.f.b.b.m.i */
/* compiled from: MotionTiming */
public class C7509i {

    /* renamed from: a */
    private long f32714a = 0;

    /* renamed from: b */
    private long f32715b = 300;

    /* renamed from: c */
    private TimeInterpolator f32716c = null;

    /* renamed from: d */
    private int f32717d = 0;

    /* renamed from: e */
    private int f32718e = 1;

    public C7509i(long j, long j2) {
        this.f32714a = j;
        this.f32715b = j2;
    }

    /* renamed from: b */
    static C7509i m41966b(ValueAnimator valueAnimator) {
        C7509i iVar = new C7509i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m41967f(valueAnimator));
        iVar.f32717d = valueAnimator.getRepeatCount();
        iVar.f32718e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m41967f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C7501a.f32700b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C7501a.f32701c;
        }
        return interpolator instanceof DecelerateInterpolator ? C7501a.f32702d : interpolator;
    }

    /* renamed from: a */
    public void mo28393a(Animator animator) {
        animator.setStartDelay(mo28394c());
        animator.setDuration(mo28395d());
        animator.setInterpolator(mo28396e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo28398g());
            valueAnimator.setRepeatMode(mo28399h());
        }
    }

    /* renamed from: c */
    public long mo28394c() {
        return this.f32714a;
    }

    /* renamed from: d */
    public long mo28395d() {
        return this.f32715b;
    }

    /* renamed from: e */
    public TimeInterpolator mo28396e() {
        TimeInterpolator timeInterpolator = this.f32716c;
        return timeInterpolator != null ? timeInterpolator : C7501a.f32700b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7509i)) {
            return false;
        }
        C7509i iVar = (C7509i) obj;
        if (mo28394c() == iVar.mo28394c() && mo28395d() == iVar.mo28395d() && mo28398g() == iVar.mo28398g() && mo28399h() == iVar.mo28399h()) {
            return mo28396e().getClass().equals(iVar.mo28396e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo28398g() {
        return this.f32717d;
    }

    /* renamed from: h */
    public int mo28399h() {
        return this.f32718e;
    }

    public int hashCode() {
        return (((((((((int) (mo28394c() ^ (mo28394c() >>> 32))) * 31) + ((int) (mo28395d() ^ (mo28395d() >>> 32)))) * 31) + mo28396e().getClass().hashCode()) * 31) + mo28398g()) * 31) + mo28399h();
    }

    public String toString() {
        return 10 + C7509i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo28394c() + " duration: " + mo28395d() + " interpolator: " + mo28396e().getClass() + " repeatCount: " + mo28398g() + " repeatMode: " + mo28399h() + "}\n";
    }

    public C7509i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f32714a = j;
        this.f32715b = j2;
        this.f32716c = timeInterpolator;
    }
}
