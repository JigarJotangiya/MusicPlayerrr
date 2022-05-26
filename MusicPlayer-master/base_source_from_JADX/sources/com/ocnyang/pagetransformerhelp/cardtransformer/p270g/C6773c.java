package com.ocnyang.pagetransformerhelp.cardtransformer.p270g;

import android.util.Log;
import android.view.View;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.g.c */
/* compiled from: CubeInTransformer */
public class C6773c extends C6771a {
    /* renamed from: c */
    public boolean mo26356c() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo26359g(View view, float f) {
        float f2;
        Log.e("cubein", view.getWidth() + "：" + view.getHeight());
        if (f > 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(0.0f);
        view.setRotationY(f * -90.0f);
    }
}
