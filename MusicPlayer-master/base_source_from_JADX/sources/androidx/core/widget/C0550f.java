package androidx.core.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.f */
/* compiled from: EdgeEffectCompat */
public final class C0550f {
    /* renamed from: a */
    public static void m3397a(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }
}
