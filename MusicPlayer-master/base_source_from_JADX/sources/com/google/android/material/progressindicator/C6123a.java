package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

/* renamed from: com.google.android.material.progressindicator.a */
/* compiled from: AnimatorDurationScaleProvider */
public class C6123a {

    /* renamed from: a */
    private static float f28636a = 1.0f;

    /* renamed from: a */
    public float mo24417a(ContentResolver contentResolver) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        if (i == 16) {
            return Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        return f28636a;
    }
}
