package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jq2 {
    /* renamed from: a */
    public static void m25820a(Context context, boolean z) {
        if (z) {
            ul0.m31861f("This request is sent from a test device.");
            return;
        }
        C4980cv.m22123b();
        String t = nl0.m27928t(context);
        StringBuilder sb = new StringBuilder(String.valueOf(t).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(t);
        sb.append("\")) to get test ads on this device.");
        ul0.m31861f(sb.toString());
    }

    /* renamed from: b */
    public static void m25821b(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        ul0.m31861f(sb.toString());
        C3018m1.m13389l(str, th);
        if (i != 3) {
            C2971s.m13213p().mo17570r(th, str);
        }
    }
}
