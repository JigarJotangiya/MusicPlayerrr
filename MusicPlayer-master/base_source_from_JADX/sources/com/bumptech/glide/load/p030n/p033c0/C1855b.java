package com.bumptech.glide.load.p030n.p033c0;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.n.c0.b */
/* compiled from: RuntimeCompat */
final class C1855b {

    /* renamed from: com.bumptech.glide.load.n.c0.b$a */
    /* compiled from: RuntimeCompat */
    class C1856a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f6692a;

        C1856a(Pattern pattern) {
            this.f6692a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f6692a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m9024a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m9025b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m9025b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C1856a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
