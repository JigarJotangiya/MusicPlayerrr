package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.p078l.C3334c;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gx1 implements yr3<PackageInfo> {

    /* renamed from: a */
    private final ms3<Context> f17451a;

    /* renamed from: b */
    private final ms3<ApplicationInfo> f17452b;

    public gx1(ms3<Context> ms3, ms3<ApplicationInfo> ms32) {
        this.f17451a = ms3;
        this.f17452b = ms32;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10679a() {
        try {
            return C3334c.m14368a(this.f17451a.mo10679a()).mo11913f(((bx1) this.f17452b).mo10679a().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
