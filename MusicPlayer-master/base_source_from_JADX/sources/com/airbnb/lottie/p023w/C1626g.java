package com.airbnb.lottie.p023w;

import com.airbnb.lottie.p026y.C1679d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.airbnb.lottie.w.g */
/* compiled from: NetworkCache */
public class C1626g {

    /* renamed from: a */
    private final C1624e f6222a;

    public C1626g(C1624e eVar) {
        this.f6222a = eVar;
    }

    /* renamed from: b */
    private static String m8246b(String str, C1622c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", BuildConfig.FLAVOR));
        sb.append(z ? cVar.tempExtension() : cVar.extension);
        return sb.toString();
    }

    /* renamed from: c */
    private File m8247c(String str) throws FileNotFoundException {
        File file = new File(m8248d(), m8246b(str, C1622c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m8248d(), m8246b(str, C1622c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m8248d() {
        File a = this.f6222a.mo7001a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<com.airbnb.lottie.p023w.C1622c, java.io.InputStream> mo7407a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.m8247c(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            com.airbnb.lottie.w.c r0 = com.airbnb.lottie.p023w.C1622c.ZIP
            goto L_0x001e
        L_0x001c:
            com.airbnb.lottie.w.c r0 = com.airbnb.lottie.p023w.C1622c.JSON
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.airbnb.lottie.p026y.C1679d.m8414a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p023w.C1626g.mo7407a(java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7408e(String str, C1622c cVar) {
        File file = new File(m8248d(), m8246b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", BuildConfig.FLAVOR));
        boolean renameTo = file.renameTo(file2);
        C1679d.m8414a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C1679d.m8416c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo7409f(String str, InputStream inputStream, C1622c cVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(m8248d(), m8246b(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
