package p159f.p166c.p177d.p180j;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: f.c.d.j.d */
/* compiled from: LyricUtils */
public class C4360d {
    /* renamed from: a */
    public static int m19019a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static int m19020b(Context context, float f) {
        Resources resources;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        return (int) ((f * resources.getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: c */
    public static String m19021c(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 != 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5)});
        }
        return String.format("%02d:%02d", new Object[]{Long.valueOf(j4), Long.valueOf(j5)});
    }
}
