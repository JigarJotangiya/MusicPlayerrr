package net.coocent.android.xmlparser;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: net.coocent.android.xmlparser.w */
/* compiled from: SharePareUtils */
public class C9508w {
    /* renamed from: a */
    public static Object m49958a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences sharedPreferences = context.getSharedPreferences("music_share_date", 0);
        if ("String".equals(simpleName)) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if ("Integer".equals(simpleName)) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if ("Boolean".equals(simpleName)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if ("Float".equals(simpleName)) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if ("Long".equals(simpleName)) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return null;
    }

    /* renamed from: b */
    public static void m49959b(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        SharedPreferences.Editor edit = context.getSharedPreferences("music_share_date", 0).edit();
        if ("String".equals(simpleName)) {
            edit.putString(str, (String) obj);
        } else if ("Integer".equals(simpleName)) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if ("Boolean".equals(simpleName)) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if ("Float".equals(simpleName)) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if ("Long".equals(simpleName)) {
            edit.putLong(str, ((Long) obj).longValue());
        }
        edit.apply();
    }
}
