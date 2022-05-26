package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class i74 implements g74 {

    /* renamed from: a */
    private final WindowManager f17913a;

    private i74(WindowManager windowManager) {
        this.f17913a = windowManager;
    }

    /* renamed from: b */
    public static g74 m25109b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new i74(windowManager);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17872a(e74 e74) {
        l74.m26560b(e74.f15890a, this.f17913a.getDefaultDisplay());
    }

    public final void zza() {
    }
}
