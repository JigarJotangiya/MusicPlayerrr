package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.C2971s;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class wm0 extends ym0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: h */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f25459h;

    public wm0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f25459h = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21849a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21850b(ViewTreeObserver viewTreeObserver) {
        C2971s.m13215r();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.f25459h.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            mo22255e();
        }
    }
}
