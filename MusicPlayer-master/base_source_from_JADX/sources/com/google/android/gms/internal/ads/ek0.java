package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ek0 {
    /* renamed from: a */
    static Uri m23023a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    /* renamed from: b */
    public static String m23024b(Uri uri, Context context) {
        if (!C2971s.m13212o().mo16673z(context)) {
            return uri.toString();
        }
        String f = C2971s.m13212o().mo16653f(context);
        if (f == null) {
            return uri.toString();
        }
        String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22444W);
        String uri2 = uri.toString();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22437V)).booleanValue() && uri2.contains(str)) {
            C2971s.m13212o().mo16665r(context, f);
            return m23026d(uri2, context).replace(str, f);
        } else if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return uri2;
        } else {
            String uri3 = m23023a(m23026d(uri2, context), "fbs_aeid", f).toString();
            C2971s.m13212o().mo16665r(context, f);
            return uri3;
        }
    }

    /* renamed from: c */
    public static String m23025c(String str, Context context, boolean z) {
        String f;
        if ((((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22497d0)).booleanValue() && !z) || !C2971s.m13212o().mo16673z(context) || TextUtils.isEmpty(str) || (f = C2971s.m13212o().mo16653f(context)) == null) {
            return str;
        }
        String str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22444W);
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22437V)).booleanValue() || !str.contains(str2)) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (C2971s.m13214q().mo10984W(str)) {
                C2971s.m13212o().mo16665r(context, f);
                return m23023a(m23026d(str, context), "fbs_aeid", f).toString();
            } else if (!C2971s.m13214q().mo10985X(str)) {
                return str;
            } else {
                C2971s.m13212o().mo16666s(context, f);
                return m23023a(m23026d(str, context), "fbs_aeid", f).toString();
            }
        } else if (C2971s.m13214q().mo10984W(str)) {
            C2971s.m13212o().mo16665r(context, f);
            return m23026d(str, context).replace(str2, f);
        } else if (!C2971s.m13214q().mo10985X(str)) {
            return str;
        } else {
            C2971s.m13212o().mo16666s(context, f);
            return m23026d(str, context).replace(str2, f);
        }
    }

    /* renamed from: d */
    private static String m23026d(String str, Context context) {
        String j = C2971s.m13212o().mo16657j(context);
        String h = C2971s.m13212o().mo16655h(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(j)) {
            str = m23023a(str, "gmp_app_id", j).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(h)) ? str : m23023a(str, "fbs_aiid", h).toString();
    }
}
