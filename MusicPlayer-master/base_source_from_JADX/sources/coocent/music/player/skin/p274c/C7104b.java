package coocent.music.player.skin.p274c;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: coocent.music.player.skin.c.b */
/* compiled from: DensityUtil */
public class C7104b {
    /* renamed from: a */
    public static DisplayMetrics m40455a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: b */
    public static int m40456b(Context context, float f) {
        return (int) ((f / m40455a(context).density) + 0.5f);
    }
}
