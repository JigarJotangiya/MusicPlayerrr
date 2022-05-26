package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p159f.p243f.p245b.p304b.p305m.C7501a;

/* renamed from: com.google.android.material.tabs.a */
/* compiled from: ElasticTabIndicatorInterpolator */
class C6208a extends C6209b {
    C6208a() {
    }

    /* renamed from: e */
    private static float m37142e(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    private static float m37143f(float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24834c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        RectF a = C6209b.m37145a(tabLayout, view);
        RectF a2 = C6209b.m37145a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = m37142e(f);
            f2 = m37143f(f);
        } else {
            f3 = m37143f(f);
            f2 = m37142e(f);
        }
        drawable.setBounds(C7501a.m41942c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C7501a.m41942c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
