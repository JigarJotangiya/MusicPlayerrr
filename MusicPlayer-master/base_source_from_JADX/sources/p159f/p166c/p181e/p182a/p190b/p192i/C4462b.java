package p159f.p166c.p181e.p182a.p190b.p192i;

import android.os.Build;
import android.text.TextUtils;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.i.b */
/* compiled from: RomUtils.kt */
public final class C4462b {

    /* renamed from: a */
    public static final C4463a f13042a = new C4463a((C8589g) null);

    /* renamed from: f.c.e.a.b.i.b$a */
    /* compiled from: RomUtils.kt */
    public static final class C4463a {
        private C4463a() {
        }

        public /* synthetic */ C4463a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo15152a() {
            String str = Build.MANUFACTURER;
            C8594l.m46770d(str, "MANUFACTURER");
            if (!C8437p.m46566v(str, "QiKU", false, 2, (Object) null)) {
                C8594l.m46770d(str, "MANUFACTURER");
                return C8437p.m46566v(str, "360", false, 2, (Object) null);
            }
        }

        /* renamed from: b */
        public final boolean mo15153b() {
            String str = Build.MANUFACTURER;
            C8594l.m46770d(str, "MANUFACTURER");
            return C8437p.m46566v(str, "HUAWEI", false, 2, (Object) null);
        }

        /* renamed from: c */
        public final boolean mo15154c() {
            String f = mo15157f("ro.build.display.id");
            if (TextUtils.isEmpty(f)) {
                return false;
            }
            C8594l.m46769c(f);
            if (!C8437p.m46566v(f, "flyme", false, 2, (Object) null)) {
                String lowerCase = f.toLowerCase();
                C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C8437p.m46566v(lowerCase, "flyme", false, 2, (Object) null)) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public final boolean mo15155d() {
            return !TextUtils.isEmpty(mo15157f("ro.miui.ui.version.name"));
        }

        /* renamed from: e */
        public final double mo15156e() {
            try {
                String f = mo15157f("ro.build.version.emui");
                C8594l.m46769c(f);
                String substring = f.substring(C8437p.m46530E(f, "_", 0, false, 6, (Object) null) + 1);
                C8594l.m46770d(substring, "(this as java.lang.String).substring(startIndex)");
                return Double.parseDouble(substring);
            } catch (Exception e) {
                e.printStackTrace();
                return 4.0d;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[SYNTHETIC, Splitter:B:26:0x0056] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo15157f(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "Exception while closing InputStream"
                java.lang.String r1 = "RomUtils"
                java.lang.String r2 = "propName"
                p369i.p387z.p389d.C8594l.m46771e(r7, r2)
                r2 = 0
                java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.lang.String r4 = "getprop "
                java.lang.String r4 = p369i.p387z.p389d.C8594l.m46777k(r4, r7)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.lang.Process r3 = r3.exec(r4)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.io.InputStream r3 = r3.getInputStream()     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                r5.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                r3 = 1024(0x400, float:1.435E-42)
                r4.<init>(r5, r3)     // Catch:{ IOException -> 0x003c, all -> 0x003a }
                java.lang.String r3 = r4.readLine()     // Catch:{ IOException -> 0x0038 }
                r4.close()     // Catch:{ IOException -> 0x0038 }
                r4.close()     // Catch:{ IOException -> 0x0033 }
                goto L_0x0037
            L_0x0033:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
            L_0x0037:
                return r3
            L_0x0038:
                r3 = move-exception
                goto L_0x003e
            L_0x003a:
                r7 = move-exception
                goto L_0x0054
            L_0x003c:
                r3 = move-exception
                r4 = r2
            L_0x003e:
                java.lang.String r5 = "Unable to read sysprop "
                java.lang.String r7 = p369i.p387z.p389d.C8594l.m46777k(r5, r7)     // Catch:{ all -> 0x0052 }
                android.util.Log.e(r1, r7, r3)     // Catch:{ all -> 0x0052 }
                if (r4 == 0) goto L_0x0051
                r4.close()     // Catch:{ IOException -> 0x004d }
                goto L_0x0051
            L_0x004d:
                r7 = move-exception
                android.util.Log.e(r1, r0, r7)
            L_0x0051:
                return r2
            L_0x0052:
                r7 = move-exception
                r2 = r4
            L_0x0054:
                if (r2 == 0) goto L_0x005e
                r2.close()     // Catch:{ IOException -> 0x005a }
                goto L_0x005e
            L_0x005a:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x005e:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p190b.p192i.C4462b.C4463a.mo15157f(java.lang.String):java.lang.String");
        }
    }
}
