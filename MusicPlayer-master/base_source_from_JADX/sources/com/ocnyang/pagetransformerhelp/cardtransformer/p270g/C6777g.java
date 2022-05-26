package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.g */
/* compiled from: FlipHorizontalTransformer */
public class C6777g extends C6771a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo26357e(View view, float f) {
        super.mo26357e(view, f);
        if (f <= -0.5f || f >= 0.5f) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float f2 = f * 180.0f;
        view.setAlpha((f2 > 90.0f || f2 < -90.0f) ? 0.0f : 1.0f);
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f2);
    }
}
