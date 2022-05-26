package p159f.p166c.p224o.p226l;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.C0466a;
import androidx.core.content.C0506a;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.p */
/* compiled from: PermissionUtils.kt */
public final class C4667p {
    /* renamed from: a */
    public static final String[] m20177a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    }

    /* renamed from: b */
    public static final boolean m20178b(Context context) {
        C8594l.m46771e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            if (!Environment.isExternalStorageManager() && C0506a.m3149a(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                return false;
            }
            return true;
        } else if (C0506a.m3149a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 && C0506a.m3149a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m20179c(Activity activity) {
        C8594l.m46771e(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            return C0466a.m2987n(activity, "android.permission.READ_EXTERNAL_STORAGE");
        }
        return C0466a.m2987n(activity, "android.permission.READ_EXTERNAL_STORAGE") && C0466a.m2987n(activity, "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
