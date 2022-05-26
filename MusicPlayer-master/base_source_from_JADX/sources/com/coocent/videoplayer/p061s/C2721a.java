package com.coocent.videoplayer.p061s;

import android.content.Context;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videoplayer.s.a */
/* compiled from: ApkUtils.kt */
public final class C2721a {
    /* renamed from: a */
    public static final String m12312a(Context context) {
        C8594l.m46771e(context, "context");
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
