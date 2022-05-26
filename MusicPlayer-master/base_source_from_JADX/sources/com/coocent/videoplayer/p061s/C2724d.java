package com.coocent.videoplayer.p061s;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.core.content.C0506a;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.s.d */
/* compiled from: PermissionUtils.kt */
public final class C2724d {
    /* renamed from: a */
    public static final boolean m12316a(Context context) {
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
}
