package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* renamed from: com.google.android.play.core.appupdate.w */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6313w {

    /* renamed from: a */
    private final Context f29320a;

    C6313w(Context context) {
        this.f29320a = context;
    }

    /* renamed from: b */
    private static long m37535b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File b : listFiles) {
                j += m37535b(b);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo25178a() {
        return m37535b(new File(this.f29320a.getFilesDir(), "assetpacks"));
    }
}
