package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.l */
/* compiled from: ScaleInOutTransformer */
public class C6782l extends C6771a {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float f2 = 0.0f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i >= 0) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) / 2.0f);
        float f3 = i < 0 ? f + 1.0f : 1.0f - f;
        view.setScaleX(f3);
        view.setScaleY(f3);
    }
}
