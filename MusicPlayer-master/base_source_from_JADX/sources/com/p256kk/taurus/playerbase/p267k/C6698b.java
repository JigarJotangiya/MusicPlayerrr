package com.p256kk.taurus.playerbase.p267k;

import android.content.Context;

/* renamed from: com.kk.taurus.playerbase.k.b */
/* compiled from: PUtils */
public class C6698b {
    /* renamed from: a */
    public static int m38414a(Context context) {
        int b = m38415b(context);
        return b <= 0 ? m38416c(context) : b;
    }

    /* renamed from: b */
    private static int m38415b(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m38416c(Context context) {
        return (int) Math.ceil((double) (context.getResources().getDisplayMetrics().density * 20.0f));
    }
}
