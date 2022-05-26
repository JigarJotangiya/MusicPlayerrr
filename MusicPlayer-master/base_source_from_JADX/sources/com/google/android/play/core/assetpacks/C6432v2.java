package com.google.android.play.core.assetpacks;

import com.google.android.play.core.common.C6457d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.assetpacks.v2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6432v2 {

    /* renamed from: d */
    private static final C7577a f29682d = new C7577a("PackMetadataManager");

    /* renamed from: a */
    private final C6355g0 f29683a;

    /* renamed from: b */
    private final C6442x2 f29684b;

    /* renamed from: c */
    private final C6457d f29685c;

    C6432v2(C6355g0 g0Var, C6442x2 x2Var, C6457d dVar) {
        this.f29683a = g0Var;
        this.f29684b = x2Var;
        this.f29685c = dVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0053 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo25369a(java.lang.String r6) {
        /*
            r5 = this;
            com.google.android.play.core.common.d r0 = r5.f29685c
            java.lang.String r1 = "assetOnlyUpdates"
            boolean r0 = r0.mo25384a(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0061
            com.google.android.play.core.assetpacks.g0 r0 = r5.f29683a
            boolean r0 = r0.mo25255f(r6)
            if (r0 != 0) goto L_0x0015
            goto L_0x0061
        L_0x0015:
            com.google.android.play.core.assetpacks.x2 r0 = r5.f29684b
            int r0 = r0.mo25374a()
            com.google.android.play.core.assetpacks.g0 r2 = r5.f29683a
            long r3 = r2.mo25258r(r6)
            java.io.File r2 = r2.mo25264x(r6, r0, r3)
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0054 }
            goto L_0x004e
        L_0x0030:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0054 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0054 }
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x004f }
            r2.<init>()     // Catch:{ all -> 0x004f }
            r2.load(r3)     // Catch:{ all -> 0x004f }
            r3.close()     // Catch:{ IOException -> 0x0054 }
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r2 = r2.getProperty(r3)     // Catch:{ IOException -> 0x0054 }
            if (r2 != 0) goto L_0x004d
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0054 }
            goto L_0x004e
        L_0x004d:
            r6 = r2
        L_0x004e:
            return r6
        L_0x004f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            f.f.b.c.a.a.a r0 = f29682d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "Failed to read pack version tag for pack %s"
            r0.mo28575b(r6, r2)
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C6432v2.mo25369a(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25370b(String str, int i, long j, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        File x = this.f29683a.mo25264x(str, i, j);
        x.getParentFile().mkdirs();
        x.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(x);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
