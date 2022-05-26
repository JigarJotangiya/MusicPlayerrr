package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.k */
/* compiled from: RotateUpTransformer */
public class C6781k extends C6771a {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26356c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY(0.0f);
        view.setTranslationX(0.0f);
        view.setRotation(f * -15.0f);
    }
}
