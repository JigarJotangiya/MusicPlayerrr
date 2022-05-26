package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.gms.ads.internal.util.c */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C2980c implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ Activity f9990a;

    public /* synthetic */ C2980c(C2984d dVar, Activity activity) {
        this.f9990a = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return C2984d.m13310u(this.f9990a, view, windowInsets);
    }
}
