package p082e.p109h.p119p;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: e.h.p.r */
/* compiled from: OneShotPreDrawListener */
public final class C3770r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: g */
    private final View f11827g;

    /* renamed from: h */
    private ViewTreeObserver f11828h;

    /* renamed from: i */
    private final Runnable f11829i;

    private C3770r(View view, Runnable runnable) {
        this.f11827g = view;
        this.f11828h = view.getViewTreeObserver();
        this.f11829i = runnable;
    }

    /* renamed from: a */
    public static C3770r m16143a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        C3770r rVar = new C3770r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(rVar);
        view.addOnAttachStateChangeListener(rVar);
        return rVar;
    }

    /* renamed from: b */
    public void mo13193b() {
        if (this.f11828h.isAlive()) {
            this.f11828h.removeOnPreDrawListener(this);
        } else {
            this.f11827g.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f11827g.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo13193b();
        this.f11829i.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f11828h = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo13193b();
    }
}
