package com.google.android.gms.ads.internal.util;

import android.util.Log;
import com.google.android.gms.internal.ads.h10;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.internal.util.m1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3018m1 extends ul0 {
    /* renamed from: k */
    public static void m13388k(String str) {
        if (!m13390m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : ul0.f24362a.mo16017d(str)) {
            if (z) {
                Log.v("Ads", next);
            } else {
                Log.v("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: l */
    public static void m13389l(String str, Throwable th) {
        if (m13390m()) {
            Log.v("Ads", str, th);
        }
    }

    /* renamed from: m */
    public static boolean m13390m() {
        return ul0.m31865j(2) && h10.f17486a.mo20989e().booleanValue();
    }
}
