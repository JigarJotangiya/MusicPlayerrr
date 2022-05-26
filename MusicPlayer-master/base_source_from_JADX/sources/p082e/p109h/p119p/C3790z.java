package p082e.p109h.p119p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: e.h.p.z */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C3790z {

    /* renamed from: a */
    private WeakReference<View> f11855a;

    /* renamed from: b */
    Runnable f11856b = null;

    /* renamed from: c */
    Runnable f11857c = null;

    /* renamed from: d */
    int f11858d = -1;

    /* renamed from: e.h.p.z$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C3791a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3706a0 f11859a;

        /* renamed from: b */
        final /* synthetic */ View f11860b;

        C3791a(C3790z zVar, C3706a0 a0Var, View view) {
            this.f11859a = a0Var;
            this.f11860b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f11859a.mo1916a(this.f11860b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f11859a.mo585b(this.f11860b);
        }

        public void onAnimationStart(Animator animator) {
            this.f11859a.mo586c(this.f11860b);
        }
    }

    /* renamed from: e.h.p.z$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C3792b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C3712c0 f11861a;

        /* renamed from: b */
        final /* synthetic */ View f11862b;

        C3792b(C3790z zVar, C3712c0 c0Var, View view) {
            this.f11861a = c0Var;
            this.f11862b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11861a.mo702a(this.f11862b);
        }
    }

    /* renamed from: e.h.p.z$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C3793c implements C3706a0 {

        /* renamed from: a */
        C3790z f11863a;

        /* renamed from: b */
        boolean f11864b;

        C3793c(C3790z zVar) {
            this.f11863a = zVar;
        }

        /* renamed from: a */
        public void mo1916a(View view) {
            Object tag = view.getTag(2113929216);
            C3706a0 a0Var = tag instanceof C3706a0 ? (C3706a0) tag : null;
            if (a0Var != null) {
                a0Var.mo1916a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: e.h.p.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo585b(android.view.View r4) {
            /*
                r3 = this;
                e.h.p.z r0 = r3.f11863a
                int r0 = r0.f11858d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                e.h.p.z r0 = r3.f11863a
                r0.f11858d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f11864b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                e.h.p.z r0 = r3.f11863a
                java.lang.Runnable r1 = r0.f11857c
                if (r1 == 0) goto L_0x0024
                r0.f11857c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p082e.p109h.p119p.C3706a0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                e.h.p.a0 r2 = (p082e.p109h.p119p.C3706a0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo585b(r4)
            L_0x0036:
                r4 = 1
                r3.f11864b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p119p.C3790z.C3793c.mo585b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: e.h.p.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo586c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f11864b = r0
                e.h.p.z r0 = r3.f11863a
                int r0 = r0.f11858d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                e.h.p.z r0 = r3.f11863a
                java.lang.Runnable r2 = r0.f11856b
                if (r2 == 0) goto L_0x001a
                r0.f11856b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p082e.p109h.p119p.C3706a0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                e.h.p.a0 r1 = (p082e.p109h.p119p.C3706a0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo586c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p119p.C3790z.C3793c.mo586c(android.view.View):void");
        }
    }

    C3790z(View view) {
        this.f11855a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m16302i(View view, C3706a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new C3791a(this, a0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C3790z mo13223a(float f) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo13224b() {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public long mo13225c() {
        View view = (View) this.f11855a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: d */
    public C3790z mo13226d(float f) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    /* renamed from: e */
    public C3790z mo13227e(float f) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    /* renamed from: f */
    public C3790z mo13228f(long j) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C3790z mo13229g(Interpolator interpolator) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C3790z mo13230h(C3706a0 a0Var) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m16302i(view, a0Var);
            } else {
                view.setTag(2113929216, a0Var);
                m16302i(view, new C3793c(this));
            }
        }
        return this;
    }

    /* renamed from: j */
    public C3790z mo13231j(long j) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C3790z mo13232k(C3712c0 c0Var) {
        View view = (View) this.f11855a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C3792b bVar = null;
            if (c0Var != null) {
                bVar = new C3792b(this, c0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    /* renamed from: l */
    public void mo13233l() {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C3790z mo13234m(float f) {
        View view = (View) this.f11855a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: n */
    public C3790z mo13235n() {
        View view = (View) this.f11855a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.f11858d = view.getLayerType();
                m16302i(view, new C3793c(this));
            }
        }
        return this;
    }
}
