package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.h */
/* compiled from: StateListAnimator */
public final class C6082h {

    /* renamed from: a */
    private final ArrayList<C6084b> f28504a = new ArrayList<>();

    /* renamed from: b */
    private C6084b f28505b = null;

    /* renamed from: c */
    ValueAnimator f28506c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f28507d = new C6083a();

    /* renamed from: com.google.android.material.internal.h$a */
    /* compiled from: StateListAnimator */
    class C6083a extends AnimatorListenerAdapter {
        C6083a() {
        }

        public void onAnimationEnd(Animator animator) {
            C6082h hVar = C6082h.this;
            if (hVar.f28506c == animator) {
                hVar.f28506c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* compiled from: StateListAnimator */
    static class C6084b {

        /* renamed from: a */
        final int[] f28509a;

        /* renamed from: b */
        final ValueAnimator f28510b;

        C6084b(int[] iArr, ValueAnimator valueAnimator) {
            this.f28509a = iArr;
            this.f28510b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m36524b() {
        ValueAnimator valueAnimator = this.f28506c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28506c = null;
        }
    }

    /* renamed from: e */
    private void m36525e(C6084b bVar) {
        ValueAnimator valueAnimator = bVar.f28510b;
        this.f28506c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo24203a(int[] iArr, ValueAnimator valueAnimator) {
        C6084b bVar = new C6084b(iArr, valueAnimator);
        valueAnimator.addListener(this.f28507d);
        this.f28504a.add(bVar);
    }

    /* renamed from: c */
    public void mo24204c() {
        ValueAnimator valueAnimator = this.f28506c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f28506c = null;
        }
    }

    /* renamed from: d */
    public void mo24205d(int[] iArr) {
        C6084b bVar;
        int size = this.f28504a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f28504a.get(i);
            if (StateSet.stateSetMatches(bVar.f28509a, iArr)) {
                break;
            }
            i++;
        }
        C6084b bVar2 = this.f28505b;
        if (bVar != bVar2) {
            if (bVar2 != null) {
                m36524b();
            }
            this.f28505b = bVar;
            if (bVar != null) {
                m36525e(bVar);
            }
        }
    }
}
