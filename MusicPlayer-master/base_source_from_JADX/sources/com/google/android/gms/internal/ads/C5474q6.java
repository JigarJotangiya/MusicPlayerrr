package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.q6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5474q6 {
    /* renamed from: a */
    public static long m29371a(String str) {
        try {
            return m29374d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C5066f6.m23483d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C5066f6.m23482c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: b */
    public static C4917b5 m29372b(C5399o5 o5Var) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        C5399o5 o5Var2 = o5Var;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = o5Var2.f20923c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a = str != null ? m29371a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? m29371a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m29371a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        C4917b5 b5Var = new C4917b5();
        b5Var.f14318a = o5Var2.f20922b;
        b5Var.f14319b = str5;
        b5Var.f14323f = j4;
        b5Var.f14322e = j3;
        b5Var.f14320c = a;
        b5Var.f14321d = a3;
        b5Var.f14324g = map;
        b5Var.f14325h = o5Var2.f20924d;
        return b5Var;
    }

    /* renamed from: c */
    static String m29373c(long j) {
        return m29374d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    private static SimpleDateFormat m29374d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
