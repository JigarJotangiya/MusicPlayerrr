package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.C1405l;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.i */
/* compiled from: WorkDatabasePathHelper */
public class C1284i {

    /* renamed from: a */
    private static final String f5187a = C1405l.m7462f("WrkDbPathHelper");

    /* renamed from: b */
    private static final String[] f5188b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static File m7092a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return m7093b(context);
        }
        return m7094c(context, "androidx.work.workdb");
    }

    /* renamed from: b */
    public static File m7093b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    /* renamed from: c */
    private static File m7094c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    /* renamed from: d */
    public static String m7095d() {
        return "androidx.work.workdb";
    }

    /* renamed from: e */
    public static void m7096e(Context context) {
        String str;
        File b = m7093b(context);
        if (Build.VERSION.SDK_INT >= 23 && b.exists()) {
            C1405l.m7460c().mo6816a(f5187a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            Map<File, File> f = m7097f(context);
            for (File next : f.keySet()) {
                File file = f.get(next);
                if (next.exists() && file != null) {
                    if (file.exists()) {
                        C1405l.m7460c().mo6820h(f5187a, String.format("Over-writing contents of %s", new Object[]{file}), new Throwable[0]);
                    }
                    if (next.renameTo(file)) {
                        str = String.format("Migrated %s to %s", new Object[]{next, file});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{next, file});
                    }
                    C1405l.m7460c().mo6816a(f5187a, str, new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static Map<File, File> m7097f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b = m7093b(context);
            File a = m7092a(context);
            hashMap.put(b, a);
            for (String str : f5188b) {
                hashMap.put(new File(b.getPath() + str), new File(a.getPath() + str));
            }
        }
        return hashMap;
    }
}
