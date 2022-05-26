package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.util.h */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3363h {

    /* renamed from: a */
    private static Boolean f10767a;

    /* renamed from: b */
    private static Boolean f10768b;

    /* renamed from: c */
    private static Boolean f10769c;

    /* renamed from: d */
    private static Boolean f10770d;

    /* renamed from: e */
    private static Boolean f10771e;

    /* renamed from: a */
    public static boolean m14451a(@RecentlyNonNull Context context) {
        return m14452b(context.getPackageManager());
    }

    /* renamed from: b */
    public static boolean m14452b(@RecentlyNonNull PackageManager packageManager) {
        if (f10771e == null) {
            boolean z = false;
            if (C3369n.m14478j() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f10771e = Boolean.valueOf(z);
        }
        return f10771e.booleanValue();
    }

    /* renamed from: c */
    public static boolean m14453c(@RecentlyNonNull Context context) {
        if (f10769c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f10769c = Boolean.valueOf(z);
        }
        return f10769c.booleanValue();
    }

    @TargetApi(21)
    /* renamed from: d */
    public static boolean m14454d(@RecentlyNonNull Context context) {
        return m14458h(context);
    }

    @TargetApi(20)
    /* renamed from: e */
    public static boolean m14455e(@RecentlyNonNull Context context) {
        return m14456f(context.getPackageManager());
    }

    @TargetApi(20)
    /* renamed from: f */
    public static boolean m14456f(@RecentlyNonNull PackageManager packageManager) {
        if (f10767a == null) {
            boolean z = false;
            if (C3369n.m14474f() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f10767a = Boolean.valueOf(z);
        }
        return f10767a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: g */
    public static boolean m14457g(@RecentlyNonNull Context context) {
        if (m14455e(context)) {
            if (!C3369n.m14477i()) {
                return true;
            }
            if (!m14458h(context) || C3369n.m14478j()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @TargetApi(21)
    /* renamed from: h */
    public static boolean m14458h(@RecentlyNonNull Context context) {
        if (f10768b == null) {
            boolean z = false;
            if (C3369n.m14475g() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f10768b = Boolean.valueOf(z);
        }
        return f10768b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m14459i(@RecentlyNonNull Context context) {
        if (f10770d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f10770d = Boolean.valueOf(z);
        }
        return f10770d.booleanValue();
    }
}
