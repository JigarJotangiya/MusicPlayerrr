package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xm0 extends ym0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: h */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f25886h;

    public xm0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f25886h = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo21849a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21850b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener) this.f25886h.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            mo22255e();
        }
    }
}
