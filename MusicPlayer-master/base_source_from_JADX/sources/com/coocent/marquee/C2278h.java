package com.coocent.marquee;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.ref.WeakReference;
import p159f.p166c.p176c.C4326a;

/* renamed from: com.coocent.marquee.h */
/* compiled from: MarqueeFloatingManager */
public class C2278h {
    /* renamed from: a */
    private static boolean m10607a(Context context) {
        WeakReference weakReference = new WeakReference(context);
        return C4326a.m18907f().mo14749c((Context) weakReference.get()) && C2296m.m10658b((Context) weakReference.get()) && C2296m.m10659c((Context) weakReference.get());
    }

    /* renamed from: b */
    public static void m10608b(Context context) {
        WeakReference weakReference = new WeakReference(context);
        if (m10609c(context, MarqueeFloatingWindowService.class.getName())) {
            ((Context) weakReference.get()).stopService(new Intent((Context) weakReference.get(), MarqueeFloatingWindowService.class));
        }
    }

    /* renamed from: c */
    public static boolean m10609c(Context context, String str) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE)) {
            if (str.equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m10610d(Context context) {
        Log.d("TAGF", "showWindow");
        WeakReference weakReference = new WeakReference(context);
        if (m10607a((Context) weakReference.get())) {
            ((Context) weakReference.get()).startService(new Intent((Context) weakReference.get(), MarqueeFloatingWindowService.class));
        }
    }
}
