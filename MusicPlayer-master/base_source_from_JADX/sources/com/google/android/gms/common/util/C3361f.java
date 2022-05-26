package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;

/* renamed from: com.google.android.gms.common.util.f */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3361f {
    /* renamed from: a */
    public static boolean m14446a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            C3292l.m14240h(context);
            C3292l.m14240h(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
