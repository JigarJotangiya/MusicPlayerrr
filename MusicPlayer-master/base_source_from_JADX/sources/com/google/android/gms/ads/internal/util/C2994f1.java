package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.f1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2994f1 implements Callable<String> {

    /* renamed from: a */
    final /* synthetic */ Context f10003a;

    /* renamed from: b */
    final /* synthetic */ Context f10004b;

    C2994f1(C2998g1 g1Var, Context context, Context context2) {
        this.f10003a = context;
        this.f10004b = context2;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f10003a != null) {
            C3018m1.m13388k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f10003a.getSharedPreferences("admob_user_agent", 0);
        } else {
            C3018m1.m13388k("Attempting to read user agent from local cache.");
            sharedPreferences = this.f10004b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            C3018m1.m13388k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f10004b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                C3018m1.m13388k("Persisting user agent.");
            }
        }
        return string;
    }
}
