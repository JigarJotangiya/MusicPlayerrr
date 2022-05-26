package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.i */
/* compiled from: ForegroundToBackgroundTransformer */
public class C6779i extends C6771a {
    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float height = (float) view.getHeight();
        float width = (float) view.getWidth();
        float f2 = 1.0f;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i <= 0) {
            f2 = Math.abs(1.0f + f);
        }
        float d = C6771a.m38637d(f2, 0.5f);
        view.setScaleX(d);
        view.setScaleY(d);
        view.setPivotX(width * 0.5f);
        view.setPivotY(height * 0.5f);
        view.setTranslationX(i > 0 ? width * f : (-width) * f * 0.25f);
    }
}
