package com.bumptech.glide.load.data.p029o;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.data.o.b */
/* compiled from: MediaStoreUtil */
public final class C1771b {
    /* renamed from: a */
    public static boolean m8783a(Uri uri) {
        return m8784b(uri) && !m8787e(uri);
    }

    /* renamed from: b */
    public static boolean m8784b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m8785c(Uri uri) {
        return m8784b(uri) && m8787e(uri);
    }

    /* renamed from: d */
    public static boolean m8786d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m8787e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
