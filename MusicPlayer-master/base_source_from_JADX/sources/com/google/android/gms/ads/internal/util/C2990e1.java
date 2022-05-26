package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.C3371p;
import java.util.concurrent.Callable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.e1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2990e1 implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f10002a;

    C2990e1(C2998g1 g1Var, Context context) {
        this.f10002a = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences = this.f10002a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (!TextUtils.isEmpty(string)) {
            C3018m1.m13388k("User agent is already initialized on Google Play Services.");
            return string;
        }
        C3018m1.m13388k("User agent is not initialized on Google Play Services. Initializing.");
        C3371p.m14480a(this.f10002a, sharedPreferences.edit().putString("user_agent", WebSettings.getDefaultUserAgent(this.f10002a)), "admob_user_agent");
        throw null;
    }
}
