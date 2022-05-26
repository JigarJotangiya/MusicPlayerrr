package p159f.p166c.p181e.p182a.p183a.p189f;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: f.c.e.a.a.f.f */
/* compiled from: RoomUtils */
public class C4442f {

    /* renamed from: a */
    private static String f13017a;

    /* renamed from: b */
    private static String f13018b;

    /* renamed from: a */
    public static boolean m19492a(String str) {
        String str2 = f13017a;
        if (str2 != null) {
            return str2.equals(str);
        }
        String b = m19493b("ro.miui.ui.version.name");
        f13018b = b;
        if (!TextUtils.isEmpty(b)) {
            f13017a = "MIUI";
        } else {
            String b2 = m19493b("ro.build.version.emui");
            f13018b = b2;
            if (!TextUtils.isEmpty(b2)) {
                f13017a = "EMUI";
            } else {
                String b3 = m19493b("ro.build.version.opporom");
                f13018b = b3;
                if (!TextUtils.isEmpty(b3)) {
                    f13017a = "OPPO";
                } else {
                    String b4 = m19493b("ro.vivo.os.version");
                    f13018b = b4;
                    if (!TextUtils.isEmpty(b4)) {
                        f13017a = "VIVO";
                    } else {
                        String b5 = m19493b("ro.smartisan.version");
                        f13018b = b5;
                        if (!TextUtils.isEmpty(b5)) {
                            f13017a = "SMARTISAN";
                        } else {
                            String str3 = Build.DISPLAY;
                            f13018b = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                f13017a = "FLYME";
                            } else {
                                f13018b = "unknown";
                                f13017a = Build.MANUFACTURER.toUpperCase();
                            }
                        }
                    }
                }
            }
        }
        return f13017a.equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC, Splitter:B:18:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[SYNTHETIC, Splitter:B:26:0x0065] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19493b(java.lang.String r6) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r2.<init>()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r2.append(r6)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r3.<init>(r1)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch:{ IOException -> 0x003e, all -> 0x003c }
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x003a }
            r2.close()     // Catch:{ IOException -> 0x003a }
            r2.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0039:
            return r1
        L_0x003a:
            r1 = move-exception
            goto L_0x0040
        L_0x003c:
            r6 = move-exception
            goto L_0x0063
        L_0x003e:
            r1 = move-exception
            r2 = r0
        L_0x0040:
            java.lang.String r3 = "Rom"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r4.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r5 = "Unable to read prop "
            r4.append(r5)     // Catch:{ all -> 0x0061 }
            r4.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0061 }
            android.util.Log.e(r3, r6, r1)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0060:
            return r0
        L_0x0061:
            r6 = move-exception
            r0 = r2
        L_0x0063:
            if (r0 == 0) goto L_0x006d
            r0.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4442f.m19493b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m19494c() {
        return m19492a("MIUI");
    }

    /* renamed from: d */
    public static boolean m19495d() {
        return m19492a("OPPO");
    }

    /* renamed from: e */
    public static boolean m19496e() {
        return m19492a("VIVO");
    }
}
