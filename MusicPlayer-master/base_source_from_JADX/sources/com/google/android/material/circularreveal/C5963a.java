package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.C5967c;

/* renamed from: com.google.android.material.circularreveal.a */
/* compiled from: CircularRevealCompat */
public final class C5963a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    /* compiled from: CircularRevealCompat */
    static class C5964a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5967c f28091a;

        C5964a(C5967c cVar) {
            this.f28091a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f28091a.mo23582b();
        }

        public void onAnimationStart(Animator animator) {
            this.f28091a.mo23581a();
        }
    }

    /* renamed from: a */
    public static Animator m35927a(C5967c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C5967c.C5970c.f28104a, C5967c.C5969b.f28102b, new C5967c.C5972e[]{new C5967c.C5972e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C5967c.C5972e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f28108c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m35928b(C5967c cVar) {
        return new C5964a(cVar);
    }
}
