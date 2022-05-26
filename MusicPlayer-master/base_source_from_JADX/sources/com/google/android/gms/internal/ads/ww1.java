package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ww1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ CookieManager f25571a;

    public /* synthetic */ ww1(CookieManager cookieManager) {
        this.f25571a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f25571a;
        if (cookieManager == null) {
            return BuildConfig.FLAVOR;
        }
        return cookieManager.getCookie((String) C5054ev.m23225c().mo20153b(C5503qz.f22649w0));
    }
}
