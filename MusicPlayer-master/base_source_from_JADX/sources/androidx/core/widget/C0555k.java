package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* renamed from: androidx.core.widget.k */
/* compiled from: ScrollerCompat */
public final class C0555k {

    /* renamed from: a */
    OverScroller f2824a;

    C0555k(Context context, Interpolator interpolator) {
        this.f2824a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* renamed from: c */
    public static C0555k m3410c(Context context, Interpolator interpolator) {
        return new C0555k(context, interpolator);
    }

    @Deprecated
    /* renamed from: a */
    public void mo3459a() {
        this.f2824a.abortAnimation();
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo3460b() {
        return this.f2824a.computeScrollOffset();
    }

    @Deprecated
    /* renamed from: d */
    public int mo3461d() {
        return this.f2824a.getCurrX();
    }

    @Deprecated
    /* renamed from: e */
    public int mo3462e() {
        return this.f2824a.getCurrY();
    }

    @Deprecated
    /* renamed from: f */
    public int mo3463f() {
        return this.f2824a.getFinalX();
    }

    @Deprecated
    /* renamed from: g */
    public int mo3464g() {
        return this.f2824a.getFinalY();
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo3465h() {
        return this.f2824a.isFinished();
    }

    @Deprecated
    /* renamed from: i */
    public void mo3466i(int i, int i2, int i3, int i4, int i5) {
        this.f2824a.startScroll(i, i2, i3, i4, i5);
    }
}
