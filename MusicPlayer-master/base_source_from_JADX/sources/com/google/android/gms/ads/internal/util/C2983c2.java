package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.c2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class C2983c2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f9999a;

    /* renamed from: b */
    public final /* synthetic */ WebSettings f10000b;

    public /* synthetic */ C2983c2(Context context, WebSettings webSettings) {
        this.f9999a = context;
        this.f10000b = webSettings;
    }

    public final Object call() {
        Context context = this.f9999a;
        WebSettings webSettings = this.f10000b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22625t0)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
