package p342g.p343a.p344a.p358i;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: g.a.a.i.p */
/* compiled from: RomUtils */
public class C8339p {

    /* renamed from: a */
    private static String f34775a;

    /* renamed from: b */
    private static String f34776b;

    /* renamed from: a */
    public static boolean m46284a(String str) {
        String str2 = f34775a;
        if (str2 != null) {
            return str2.equals(str);
        }
        String b = m46285b("ro.miui.ui.version.name");
        f34776b = b;
        if (!TextUtils.isEmpty(b)) {
            f34775a = "MIUI";
        } else {
            String b2 = m46285b("ro.build.version.emui");
            f34776b = b2;
            if (!TextUtils.isEmpty(b2)) {
                f34775a = "EMUI";
            } else {
                String b3 = m46285b("ro.build.version.opporom");
                f34776b = b3;
                if (!TextUtils.isEmpty(b3)) {
                    f34775a = "OPPO";
                } else {
                    String b4 = m46285b("ro.vivo.os.version");
                    f34776b = b4;
                    if (!TextUtils.isEmpty(b4)) {
                        f34775a = "VIVO";
                    } else {
                        String b5 = m46285b("ro.smartisan.version");
                        f34776b = b5;
                        if (!TextUtils.isEmpty(b5)) {
                            f34775a = "SMARTISAN";
                        } else {
                            String str3 = Build.DISPLAY;
                            f34776b = str3;
                            if (str3.toUpperCase().contains("FLYME")) {
                                f34775a = "FLYME";
                            } else {
                                f34776b = "unknown";
                                f34775a = Build.MANUFACTURER.toUpperCase();
                            }
                        }
                    }
                }
            }
        }
        return f34775a.equals(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC, Splitter:B:18:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[SYNTHETIC, Splitter:B:26:0x0065] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m46285b(java.lang.String r6) {
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
        throw new UnsupportedOperationException("Method not decompiled: p342g.p343a.p344a.p358i.C8339p.m46285b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static boolean m46286c() {
        return m46284a("MIUI");
    }
}
