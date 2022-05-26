package com.miguelcatalan.materialsearchview.p269c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;

/* renamed from: com.miguelcatalan.materialsearchview.c.a */
/* compiled from: AnimationUtil */
public class C6757a {

    /* renamed from: a */
    public static int f30245a = 400;

    /* renamed from: com.miguelcatalan.materialsearchview.c.a$a */
    /* compiled from: AnimationUtil */
    class C6758a implements C3706a0 {

        /* renamed from: a */
        final /* synthetic */ C6760c f30246a;

        C6758a(C6760c cVar) {
            this.f30246a = cVar;
        }

        /* renamed from: a */
        public void mo1916a(View view) {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            if (!this.f30246a.mo26304b(view)) {
                view.setDrawingCacheEnabled(false);
            }
        }

        /* renamed from: c */
        public void mo586c(View view) {
            if (!this.f30246a.mo26305c(view)) {
                view.setDrawingCacheEnabled(true);
            }
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.c.a$b */
    /* compiled from: AnimationUtil */
    class C6759b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C6760c f30247a;

        /* renamed from: b */
        final /* synthetic */ View f30248b;

        C6759b(C6760c cVar, View view) {
            this.f30247a = cVar;
            this.f30248b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f30247a.mo26303a(this.f30248b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f30247a.mo26304b(this.f30248b);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f30247a.mo26305c(this.f30248b);
        }
    }

    /* renamed from: com.miguelcatalan.materialsearchview.c.a$c */
    /* compiled from: AnimationUtil */
    public interface C6760c {
        /* renamed from: a */
        boolean mo26303a(View view);

        /* renamed from: b */
        boolean mo26304b(View view);

        /* renamed from: c */
        boolean mo26305c(View view);
    }

    /* renamed from: a */
    public static void m38592a(View view, int i, C6760c cVar) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        C6758a aVar = cVar != null ? new C6758a(cVar) : null;
        C3790z d = C3774v.m16194d(view);
        d.mo13223a(1.0f);
        d.mo13228f((long) i);
        d.mo13230h(aVar);
    }

    @TargetApi(21)
    /* renamed from: b */
    public static void m38593b(View view, C6760c cVar) {
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() - ((int) TypedValue.applyDimension(1, 24.0f, view.getResources().getDisplayMetrics())), view.getHeight() / 2, 0.0f, (float) Math.max(view.getWidth(), view.getHeight()));
        view.setVisibility(0);
        createCircularReveal.addListener(new C6759b(cVar, view));
        createCircularReveal.start();
    }
}
