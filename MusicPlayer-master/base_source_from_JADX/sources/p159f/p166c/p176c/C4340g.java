package p159f.p166c.p176c;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: f.c.c.g */
/* compiled from: RomUtils */
public class C4340g {
    /* renamed from: a */
    public static boolean m18945a() {
        String str = Build.MANUFACTURER;
        return str.contains("QiKU") || str.contains("360");
    }

    /* renamed from: b */
    public static boolean m18946b() {
        return Build.MANUFACTURER.contains("HUAWEI");
    }

    /* renamed from: c */
    public static boolean m18947c() {
        String f = m18950f("ro.build.display.id");
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        if (f.contains("flyme") || f.toLowerCase().contains("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m18948d() {
        return !TextUtils.isEmpty(m18950f("ro.miui.ui.version.name"));
    }

    /* renamed from: e */
    public static double m18949e() {
        try {
            String f = m18950f("ro.build.version.emui");
            return Double.parseDouble(f.substring(f.indexOf("_") + 1));
        } catch (Exception e) {
            e.printStackTrace();
            return 4.0d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC, Splitter:B:17:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067 A[SYNTHETIC, Splitter:B:25:0x0067] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m18950f(java.lang.String r7) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils"
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.<init>()     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.lang.String r5 = "getprop "
            r4.append(r5)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r4.append(r7)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.lang.Process r3 = r3.exec(r4)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch:{ IOException -> 0x0042, all -> 0x0040 }
            java.lang.String r3 = r4.readLine()     // Catch:{ IOException -> 0x003e }
            r4.close()     // Catch:{ IOException -> 0x003e }
            r4.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L_0x003d:
            return r3
        L_0x003e:
            r3 = move-exception
            goto L_0x0044
        L_0x0040:
            r7 = move-exception
            goto L_0x0065
        L_0x0042:
            r3 = move-exception
            r4 = r2
        L_0x0044:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r5.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = "Unable to read sysprop "
            r5.append(r6)     // Catch:{ all -> 0x0063 }
            r5.append(r7)     // Catch:{ all -> 0x0063 }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x0063 }
            android.util.Log.e(r1, r7, r3)     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r7 = move-exception
            android.util.Log.e(r1, r0, r7)
        L_0x0062:
            return r2
        L_0x0063:
            r7 = move-exception
            r2 = r4
        L_0x0065:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L_0x006f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p176c.C4340g.m18950f(java.lang.String):java.lang.String");
    }
}
