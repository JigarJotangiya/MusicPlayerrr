package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.gms.ads.internal.overlay.r */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2959r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C2961t f9902a;

    C2959r(C2961t tVar) {
        this.f9902a = tVar;
    }

    /* renamed from: a */
    private final void m13120a(boolean z) {
        this.f9902a.setClickable(z);
        this.f9902a.f9907g.setClickable(z);
    }

    public final void onAnimationCancel(Animator animator) {
        m13120a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        m13120a(true);
    }

    public final void onAnimationStart(Animator animator) {
        m13120a(false);
    }
}
