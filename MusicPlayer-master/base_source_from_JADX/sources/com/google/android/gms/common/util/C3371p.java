package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.util.p */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3371p {
    @Deprecated
    /* renamed from: a */
    public static void m14480a(@RecentlyNonNull Context context, @RecentlyNonNull SharedPreferences.Editor editor, @RecentlyNonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
