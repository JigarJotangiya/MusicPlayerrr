package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.j */
/* compiled from: RotateDownTransformer */
public class C6780j extends C6771a {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26356c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        view.setPivotX(((float) view.getWidth()) * 0.5f);
        view.setPivotY((float) view.getHeight());
        view.setRotation(f * -15.0f * -1.25f);
    }
}
