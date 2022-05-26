package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
/* renamed from: com.google.android.gms.ads.internal.util.f2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2995f2 extends C2991e2 {
    /* renamed from: i */
    public final boolean mo11019i(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: j */
    public final ViewGroup.LayoutParams mo11020j() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
