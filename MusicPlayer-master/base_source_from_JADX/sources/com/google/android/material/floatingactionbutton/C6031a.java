package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: AnimatorTracker */
class C6031a {

    /* renamed from: a */
    private Animator f28268a;

    C6031a() {
    }

    /* renamed from: a */
    public void mo23912a() {
        Animator animator = this.f28268a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo23913b() {
        this.f28268a = null;
    }

    /* renamed from: c */
    public void mo23914c(Animator animator) {
        mo23912a();
        this.f28268a = animator;
    }
}
