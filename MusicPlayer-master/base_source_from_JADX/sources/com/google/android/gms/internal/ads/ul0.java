package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class ul0 {

    /* renamed from: a */
    protected static final b23 f24362a = b23.m21041b(4000);

    /* renamed from: a */
    static String m31856a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(str);
        sb.append(" @");
        sb.append(lineNumber);
        return sb.toString();
    }

    /* renamed from: b */
    public static void m31857b(String str) {
        if (!m31865j(3)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.d("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f24362a.mo16017d(str)) {
            if (z) {
                Log.d("Ads", next);
            } else {
                Log.d("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: c */
    public static void m31858c(String str, Throwable th) {
        if (m31865j(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m31859d(String str) {
        if (!m31865j(6)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.e("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f24362a.mo16017d(str)) {
            if (z) {
                Log.e("Ads", next);
            } else {
                Log.e("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: e */
    public static void m31860e(String str, Throwable th) {
        if (m31865j(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: f */
    public static void m31861f(String str) {
        if (!m31865j(4)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.i("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f24362a.mo16017d(str)) {
            if (z) {
                Log.i("Ads", next);
            } else {
                Log.i("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: g */
    public static void m31862g(String str) {
        if (!m31865j(5)) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.w("Ads", str);
            return;
        }
        boolean z = true;
        for (String next : f24362a.mo16017d(str)) {
            if (z) {
                Log.w("Ads", next);
            } else {
                Log.w("Ads-cont", next);
            }
            z = false;
        }
    }

    /* renamed from: h */
    public static void m31863h(String str, Throwable th) {
        if (m31865j(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: i */
    public static void m31864i(String str, Throwable th) {
        if (!m31865j(5)) {
            return;
        }
        if (th != null) {
            m31863h(m31856a(str), th);
        } else {
            m31862g(m31856a(str));
        }
    }

    /* renamed from: j */
    public static boolean m31865j(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
