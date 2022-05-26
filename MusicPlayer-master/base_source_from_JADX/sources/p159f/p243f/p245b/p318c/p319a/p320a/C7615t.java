package p159f.p243f.p245b.p318c.p319a.p320a;

import java.io.File;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.f.b.c.a.a.t */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7615t {
    /* renamed from: a */
    public static String m42420a(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", BuildConfig.FLAVOR);
            if (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) {
                return BuildConfig.FLAVOR;
            }
            if (replaceFirst.startsWith("base-")) {
                return replaceFirst.replace("base-", "config.");
            }
            return replaceFirst.replace("-", ".config.").replace(".config.master", BuildConfig.FLAVOR).replace(".config.main", BuildConfig.FLAVOR);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }
}
