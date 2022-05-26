package p159f.p166c.p224o.p226l;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.i */
/* compiled from: DrawableExtensions.kt */
public final class C4659i {
    /* renamed from: a */
    public static final void m20160a(Drawable drawable, int i) {
        C8594l.m46771e(drawable, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }
}
