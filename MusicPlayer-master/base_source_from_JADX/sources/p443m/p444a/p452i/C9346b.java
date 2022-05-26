package p443m.p444a.p452i;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* renamed from: m.a.i.b */
/* compiled from: SkinFileUtils */
public class C9346b {
    /* renamed from: a */
    private static String m49492a(Context context) {
        File externalCacheDir;
        if (!Environment.getExternalStorageState().equals("mounted") || (externalCacheDir = context.getExternalCacheDir()) == null || (!externalCacheDir.exists() && !externalCacheDir.mkdirs())) {
            return context.getCacheDir().getAbsolutePath();
        }
        return externalCacheDir.getAbsolutePath();
    }

    /* renamed from: b */
    public static String m49493b(Context context) {
        File file = new File(m49492a(context), "skins");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* renamed from: c */
    public static boolean m49494c(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }
}
