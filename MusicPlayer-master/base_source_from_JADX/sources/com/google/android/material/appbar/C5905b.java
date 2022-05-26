package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C6093m;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7495g;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: ViewUtilsLollipop */
class C5905b {

    /* renamed from: a */
    private static final int[] f27705a = {16843848};

    /* renamed from: a */
    static void m35294a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    static void m35295b(View view, float f) {
        int integer = view.getResources().getInteger(C7495g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C7490b.state_liftable, -C7490b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    static void m35296c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray h = C6093m.m36563h(context, attributeSet, f27705a, i, i2, new int[0]);
        try {
            if (h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h.getResourceId(0, 0)));
            }
        } finally {
            h.recycle();
        }
    }
}
