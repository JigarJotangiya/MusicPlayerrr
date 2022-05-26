package p159f.p166c.p201g.p208p;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: f.c.g.p.d */
/* compiled from: PixelUtils */
public class C4569d {
    /* renamed from: a */
    public static int m19968a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m19969b(Context context, float f) {
        Resources resources;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        return (int) ((f * resources.getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
