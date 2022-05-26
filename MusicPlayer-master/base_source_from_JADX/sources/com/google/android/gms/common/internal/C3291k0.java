package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.p078l.C3334c;

/* renamed from: com.google.android.gms.common.internal.k0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3291k0 {

    /* renamed from: a */
    private static final Object f10639a = new Object();

    /* renamed from: b */
    private static boolean f10640b;

    /* renamed from: c */
    private static int f10641c;

    /* renamed from: a */
    public static int m14231a(Context context) {
        m14232b(context);
        return f10641c;
    }

    /* renamed from: b */
    private static void m14232b(Context context) {
        synchronized (f10639a) {
            if (!f10640b) {
                f10640b = true;
                try {
                    Bundle bundle = C3334c.m14368a(context).mo11910c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        f10641c = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
