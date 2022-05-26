package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.d */
/* compiled from: CubeOutTransformer */
public class C6774d extends C6771a {
    /* renamed from: c */
    public boolean mo26356c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
