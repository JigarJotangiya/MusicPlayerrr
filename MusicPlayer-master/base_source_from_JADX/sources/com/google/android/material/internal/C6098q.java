package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: com.google.android.material.internal.q */
/* compiled from: ViewOverlayApi18 */
class C6098q implements C6099r {

    /* renamed from: a */
    private final ViewOverlay f28544a;

    C6098q(View view) {
        this.f28544a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo24227a(Drawable drawable) {
        this.f28544a.add(drawable);
    }

    /* renamed from: b */
    public void mo24228b(Drawable drawable) {
        this.f28544a.remove(drawable);
    }
}
