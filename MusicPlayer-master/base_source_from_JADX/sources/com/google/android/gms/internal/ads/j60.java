package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j60 {
    /* renamed from: a */
    public static final Intent m25545a(Uri uri, Context context, C5737xa xaVar, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    /* renamed from: b */
    public static final Intent m25546b(Intent intent, ResolveInfo resolveInfo, Context context, C5737xa xaVar, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    /* renamed from: c */
    public static final ResolveInfo m25547c(Intent intent, Context context, C5737xa xaVar, View view) {
        return m25548d(intent, new ArrayList(), context, xaVar, view);
    }

    /* renamed from: d */
    public static final ResolveInfo m25548d(Intent intent, ArrayList<ResolveInfo> arrayList, Context context, C5737xa xaVar, View view) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            C2971s.m13213p().mo17571s(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }
}
