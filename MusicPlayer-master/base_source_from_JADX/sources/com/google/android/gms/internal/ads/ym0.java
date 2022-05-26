package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class ym0 {

    /* renamed from: g */
    private final WeakReference<View> f26404g;

    public ym0(View view) {
        this.f26404g = new WeakReference<>(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21849a(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo21850b(ViewTreeObserver viewTreeObserver);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final ViewTreeObserver mo22253c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f26404g.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    /* renamed from: d */
    public final void mo22254d() {
        ViewTreeObserver c = mo22253c();
        if (c != null) {
            mo21849a(c);
        }
    }

    /* renamed from: e */
    public final void mo22255e() {
        ViewTreeObserver c = mo22253c();
        if (c != null) {
            mo21850b(c);
        }
    }
}
