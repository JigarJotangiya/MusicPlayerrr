package com.coocent.marquee;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;

/* renamed from: com.coocent.marquee.m */
/* compiled from: MarqueeSharedPreferencesUtil */
public class C2296m {
    /* renamed from: a */
    public static int m10657a(Context context) {
        return ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).getInt("marquee_show_back_dialog_count", 0);
    }

    /* renamed from: b */
    public static boolean m10658b(Context context) {
        return ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).getBoolean("marquee_enable", false);
    }

    /* renamed from: c */
    public static boolean m10659c(Context context) {
        return ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).getBoolean("marquee_floating_enable", false);
    }

    /* renamed from: d */
    public static boolean m10660d(Context context) {
        return ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).getBoolean("marquee_link_outer_radians", true);
    }

    /* renamed from: e */
    public static void m10661e(Context context, int i) {
        SharedPreferences sharedPreferences = ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0);
        if (sharedPreferences.getInt("marquee_show_back_dialog_count", 0) < 3) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt("marquee_show_back_dialog_count", i);
            edit.apply();
        }
    }

    /* renamed from: f */
    public static void m10662f(Context context, boolean z) {
        SharedPreferences.Editor edit = ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).edit();
        edit.putBoolean("marquee_floating_enable", z);
        edit.apply();
    }

    /* renamed from: g */
    public static void m10663g(Context context, boolean z) {
        SharedPreferences.Editor edit = ((Context) new WeakReference(context).get()).getSharedPreferences("setting_preference", 0).edit();
        edit.putBoolean("marquee_link_outer_radians", z);
        edit.apply();
    }
}
