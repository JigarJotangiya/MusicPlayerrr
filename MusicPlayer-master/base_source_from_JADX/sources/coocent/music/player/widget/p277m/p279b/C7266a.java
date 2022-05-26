package coocent.music.player.widget.p277m.p279b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: coocent.music.player.widget.m.b.a */
/* compiled from: Utils */
public class C7266a {
    @TargetApi(17)
    /* renamed from: a */
    public static boolean m41186a(Resources resources) {
        if (Build.VERSION.SDK_INT < 17 || resources.getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m41187b(Resources resources, float f) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static int m41188c(Resources resources, float f) {
        return (int) TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }
}
