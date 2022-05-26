package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bf2 implements sg2, rg2 {

    /* renamed from: a */
    private final ApplicationInfo f14429a;

    /* renamed from: b */
    private final PackageInfo f14430b;

    bf2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f14429a = applicationInfo;
        this.f14430b = packageInfo;
    }

    /* renamed from: a */
    public final d93<rg2<Bundle>> mo15767a() {
        return s83.m30607i(this);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.f14429a.packageName;
        PackageInfo packageInfo = this.f14430b;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.f14430b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
