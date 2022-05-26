package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0622q;
import p082e.p109h.p115l.C3644b;
import p082e.p109h.p119p.C3770r;
import p082e.p136n.C4093a;
import p082e.p136n.C4094b;

/* renamed from: androidx.fragment.app.c */
/* compiled from: FragmentAnim */
class C0588c {

    /* renamed from: androidx.fragment.app.c$a */
    /* compiled from: FragmentAnim */
    static class C0589a implements C3644b.C3645a {

        /* renamed from: a */
        final /* synthetic */ Fragment f3041a;

        C0589a(Fragment fragment) {
            this.f3041a = fragment;
        }

        /* renamed from: a */
        public void mo3847a() {
            if (this.f3041a.mo3619P() != null) {
                View P = this.f3041a.mo3619P();
                this.f3041a.mo3577A2((View) null);
                P.clearAnimation();
            }
            this.f3041a.mo3579B2((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* compiled from: FragmentAnim */
    static class C0590b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3042a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3043b;

        /* renamed from: c */
        final /* synthetic */ C0622q.C0629g f3044c;

        /* renamed from: d */
        final /* synthetic */ C3644b f3045d;

        /* renamed from: androidx.fragment.app.c$b$a */
        /* compiled from: FragmentAnim */
        class C0591a implements Runnable {
            C0591a() {
            }

            public void run() {
                if (C0590b.this.f3043b.mo3619P() != null) {
                    C0590b.this.f3043b.mo3577A2((View) null);
                    C0590b bVar = C0590b.this;
                    bVar.f3044c.mo3984a(bVar.f3043b, bVar.f3045d);
                }
            }
        }

        C0590b(ViewGroup viewGroup, Fragment fragment, C0622q.C0629g gVar, C3644b bVar) {
            this.f3042a = viewGroup;
            this.f3043b = fragment;
            this.f3044c = gVar;
            this.f3045d = bVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3042a.post(new C0591a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* compiled from: FragmentAnim */
    static class C0592c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3047a;

        /* renamed from: b */
        final /* synthetic */ View f3048b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3049c;

        /* renamed from: d */
        final /* synthetic */ C0622q.C0629g f3050d;

        /* renamed from: e */
        final /* synthetic */ C3644b f3051e;

        C0592c(ViewGroup viewGroup, View view, Fragment fragment, C0622q.C0629g gVar, C3644b bVar) {
            this.f3047a = viewGroup;
            this.f3048b = view;
            this.f3049c = fragment;
            this.f3050d = gVar;
            this.f3051e = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3047a.endViewTransition(this.f3048b);
            Animator S = this.f3049c.mo3628S();
            this.f3049c.mo3579B2((Animator) null);
            if (S != null && this.f3047a.indexOfChild(this.f3048b) < 0) {
                this.f3050d.mo3984a(this.f3049c, this.f3051e);
            }
        }
    }

    /* renamed from: a */
    static void m3760a(Fragment fragment, C0593d dVar, C0622q.C0629g gVar) {
        View view = fragment.f2920M;
        ViewGroup viewGroup = fragment.f2919L;
        viewGroup.startViewTransition(view);
        C3644b bVar = new C3644b();
        bVar.mo12907c(new C0589a(fragment));
        gVar.mo3985b(fragment, bVar);
        if (dVar.f3052a != null) {
            C0594e eVar = new C0594e(dVar.f3052a, viewGroup, view);
            fragment.mo3577A2(fragment.f2920M);
            eVar.setAnimationListener(new C0590b(viewGroup, fragment, gVar, bVar));
            fragment.f2920M.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3053b;
        fragment.mo3579B2(animator);
        animator.addListener(new C0592c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.f2920M);
        animator.start();
    }

    /* renamed from: b */
    static C0593d m3761b(Context context, C0595d dVar, Fragment fragment, boolean z) {
        int c;
        int o0 = fragment.mo3685o0();
        int n0 = fragment.mo3683n0();
        boolean z2 = false;
        fragment.mo3602J2(0);
        View b = dVar.mo3725b(fragment.f2910C);
        if (b != null) {
            int i = C4094b.visible_removing_fragment_view_tag;
            if (b.getTag(i) != null) {
                b.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup = fragment.f2919L;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation p1 = fragment.mo3691p1(o0, z, n0);
        if (p1 != null) {
            return new C0593d(p1);
        }
        Animator q1 = fragment.mo3694q1(o0, z, n0);
        if (q1 != null) {
            return new C0593d(q1);
        }
        if (n0 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(n0));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, n0);
                    if (loadAnimation != null) {
                        return new C0593d(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, n0);
                    if (loadAnimator != null) {
                        return new C0593d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, n0);
                        if (loadAnimation2 != null) {
                            return new C0593d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (o0 != 0 && (c = m3762c(o0, z)) >= 0) {
            return new C0593d(AnimationUtils.loadAnimation(context, c));
        }
        return null;
    }

    /* renamed from: c */
    private static int m3762c(int i, boolean z) {
        if (i == 4097) {
            return z ? C4093a.fragment_open_enter : C4093a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C4093a.fragment_fade_enter : C4093a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C4093a.fragment_close_enter : C4093a.fragment_close_exit;
    }

    /* renamed from: androidx.fragment.app.c$d */
    /* compiled from: FragmentAnim */
    static class C0593d {

        /* renamed from: a */
        public final Animation f3052a;

        /* renamed from: b */
        public final Animator f3053b;

        C0593d(Animation animation) {
            this.f3052a = animation;
            this.f3053b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0593d(Animator animator) {
            this.f3052a = null;
            this.f3053b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* compiled from: FragmentAnim */
    private static class C0594e extends AnimationSet implements Runnable {

        /* renamed from: g */
        private final ViewGroup f3054g;

        /* renamed from: h */
        private final View f3055h;

        /* renamed from: i */
        private boolean f3056i;

        /* renamed from: j */
        private boolean f3057j;

        /* renamed from: k */
        private boolean f3058k = true;

        C0594e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3054g = viewGroup;
            this.f3055h = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3058k = true;
            if (this.f3056i) {
                return !this.f3057j;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3056i = true;
                C3770r.m16143a(this.f3054g, this);
            }
            return true;
        }

        public void run() {
            if (this.f3056i || !this.f3058k) {
                this.f3054g.endViewTransition(this.f3055h);
                this.f3057j = true;
                return;
            }
            this.f3058k = false;
            this.f3054g.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3058k = true;
            if (this.f3056i) {
                return !this.f3057j;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3056i = true;
                C3770r.m16143a(this.f3054g, this);
            }
            return true;
        }
    }
}
