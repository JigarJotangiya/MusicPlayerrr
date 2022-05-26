package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0477c;

/* renamed from: androidx.core.content.c */
/* compiled from: PermissionChecker */
public final class C0513c {
    /* renamed from: a */
    public static int m3172a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String b = C0477c.m3003b(str);
        if (b == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0477c.m3002a(context, b, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m3173b(Context context, String str) {
        return m3172a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
