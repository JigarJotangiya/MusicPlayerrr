package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bx1 implements yr3<ApplicationInfo> {

    /* renamed from: a */
    private final ms3<Context> f14727a;

    public bx1(ms3<Context> ms3) {
        this.f14727a = ms3;
    }

    /* renamed from: b */
    public final ApplicationInfo mo10679a() {
        ApplicationInfo applicationInfo = this.f14727a.mo10679a().getApplicationInfo();
        gs3.m24490b(applicationInfo);
        return applicationInfo;
    }
}
