package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.C5790yp;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.ss0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.wr0;
import java.io.InputStream;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@TargetApi(16)
/* renamed from: com.google.android.gms.ads.internal.util.f */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2992f {
    private C2992f() {
    }

    /* synthetic */ C2992f(C2988e eVar) {
    }

    /* renamed from: r */
    public static C2992f m13325r(int i) {
        return i >= 28 ? new C2984d() : i >= 26 ? new C2976b() : i >= 24 ? new C3003h2() : i >= 21 ? new C2999g2() : i >= 19 ? new C2995f2() : i >= 18 ? new C2991e2() : i >= 17 ? new C2987d2() : new C2992f();
    }

    /* renamed from: s */
    public static final boolean m13326s() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo11009a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: b */
    public int mo11010b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: c */
    public Drawable mo11011c(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: d */
    public String mo11012d(Context context) {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: e */
    public void mo11013e(Context context) {
    }

    /* renamed from: f */
    public boolean mo11014f(Context context, WebSettings webSettings) {
        C2986d1.m13315a(context, new C2983c2(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    /* renamed from: g */
    public int mo11017g() {
        return 5;
    }

    /* renamed from: h */
    public long mo11018h() {
        return -1;
    }

    /* renamed from: i */
    public boolean mo11019i(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: j */
    public ViewGroup.LayoutParams mo11020j() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: k */
    public int mo11021k() {
        return 1;
    }

    /* renamed from: l */
    public CookieManager mo11022l(Context context) {
        if (m13326s()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            ul0.m31860e("Failed to obtain CookieManager.", th);
            C2971s.m13213p().mo17571s(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: m */
    public WebResourceResponse mo11023m(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: n */
    public wr0 mo11024n(pr0 pr0, C5790yp ypVar, boolean z) {
        return new ss0(pr0, ypVar, z);
    }

    /* renamed from: o */
    public boolean mo11025o(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: p */
    public int mo10972p(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    /* renamed from: q */
    public void mo11007q(Activity activity) {
    }
}
