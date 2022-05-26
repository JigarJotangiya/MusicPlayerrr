package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class uv2 {
    /* renamed from: a */
    public static uv2 m32069a(vv2 vv2, wv2 wv2) {
        if (rv2.m30435b()) {
            return new yv2(vv2, wv2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo21380b(View view, aw2 aw2, String str);

    /* renamed from: c */
    public abstract void mo21381c();

    /* renamed from: d */
    public abstract void mo21382d(View view);

    /* renamed from: e */
    public abstract void mo21383e();
}
