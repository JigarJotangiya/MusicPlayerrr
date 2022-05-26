package com.bumptech.glide.p050r;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.C1786g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.r.b */
/* compiled from: ApplicationVersionSignature */
public final class C2176b {

    /* renamed from: a */
    private static final ConcurrentMap<String, C1786g> f7412a = new ConcurrentHashMap();

    /* renamed from: a */
    private static PackageInfo m10228a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }

    /* renamed from: b */
    private static String m10229b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static C1786g m10230c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, C1786g> concurrentMap = f7412a;
        C1786g gVar = (C1786g) concurrentMap.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        C1786g d = m10231d(context);
        C1786g putIfAbsent = concurrentMap.putIfAbsent(packageName, d);
        return putIfAbsent == null ? d : putIfAbsent;
    }

    /* renamed from: d */
    private static C1786g m10231d(Context context) {
        return new C2178d(m10229b(m10228a(context)));
    }
}
