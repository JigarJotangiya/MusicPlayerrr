package com.google.android.gms.common.util;

import android.util.Base64;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.util.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3357b {
    @RecentlyNonNull
    /* renamed from: a */
    public static String m14434a(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static String m14435b(@RecentlyNonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }
}
