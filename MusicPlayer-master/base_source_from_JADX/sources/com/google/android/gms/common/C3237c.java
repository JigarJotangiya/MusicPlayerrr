package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3272e1;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.common.util.C3363h;

/* renamed from: com.google.android.gms.common.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3237c {

    /* renamed from: a */
    public static final int f10485a = C3245g.f10501a;

    /* renamed from: b */
    private static final C3237c f10486b = new C3237c();

    C3237c() {
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static C3237c m14031f() {
        return f10486b;
    }

    /* renamed from: a */
    public int mo11693a(@RecentlyNonNull Context context) {
        return C3245g.m14045a(context);
    }

    @RecentlyNullable
    /* renamed from: b */
    public Intent mo11676b(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C3363h.m14457g(context)) {
                return C3272e1.m14193c();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(f10485a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(C3334c.m14368a(context).mo11913f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C3272e1.m14192b("com.google.android.gms", sb.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C3272e1.m14191a("com.google.android.gms");
        }
    }

    @RecentlyNullable
    /* renamed from: c */
    public PendingIntent mo11677c(@RecentlyNonNull Context context, int i, int i2) {
        return mo11694d(context, i, i2, (String) null);
    }

    @RecentlyNullable
    /* renamed from: d */
    public PendingIntent mo11694d(@RecentlyNonNull Context context, int i, int i2, String str) {
        Intent b = mo11676b(context, i, str);
        if (b == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, b, 134217728);
    }

    /* renamed from: e */
    public String mo11678e(int i) {
        return C3245g.m14046b(i);
    }

    /* renamed from: g */
    public int mo11679g(@RecentlyNonNull Context context) {
        return mo11680h(context, f10485a);
    }

    /* renamed from: h */
    public int mo11680h(@RecentlyNonNull Context context, int i) {
        int e = C3245g.m14049e(context, i);
        if (C3245g.m14050f(context, e)) {
            return 18;
        }
        return e;
    }

    /* renamed from: i */
    public boolean mo11681i(int i) {
        return C3245g.m14052h(i);
    }
}
