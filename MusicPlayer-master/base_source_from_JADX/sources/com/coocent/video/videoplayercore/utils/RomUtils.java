package com.coocent.video.videoplayercore.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: RomUtils.kt */
public final class RomUtils {
    public static final RomUtils INSTANCE = new RomUtils();
    private static final String TAG = RomUtils.class.getSimpleName();

    private RomUtils() {
    }

    private final boolean checkManufacturer(String str) {
        return C8436o.m46519m(str, Build.MANUFACTURER, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        p369i.p386y.C8547b.m46749a(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        throw r2;
     */
    @android.annotation.SuppressLint({"Range"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getVivoBgStartPermissionStatus(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "content://com.vivo.permissionmanager.provider.permission/start_bg_activity"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r0 = "parse(\"content://com.viv…ssion/start_bg_activity\")"
            p369i.p387z.p389d.C8594l.m46770d(r2, r0)
            java.lang.String r4 = "pkgname = ?"
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r1 = r8.getPackageName()
            r3 = 0
            r5[r3] = r1
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0042 }
            r3 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0042 }
            if (r8 != 0) goto L_0x0024
            goto L_0x0046
        L_0x0024:
            r1 = 0
            boolean r2 = r8.moveToFirst()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0035
            java.lang.String r2 = "currentstate"
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x003b }
            int r0 = r8.getInt(r2)     // Catch:{ all -> 0x003b }
        L_0x0035:
            i.t r2 = p369i.C8457t.f34900a     // Catch:{ all -> 0x003b }
            p369i.p386y.C8547b.m46749a(r8, r1)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0046
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r2 = move-exception
            p369i.p386y.C8547b.m46749a(r8, r1)     // Catch:{ Exception -> 0x0042 }
            throw r2     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r8 = move-exception
            r8.printStackTrace()
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.utils.RomUtils.getVivoBgStartPermissionStatus(android.content.Context):int");
    }

    private final boolean isVivoBgStartPermissionAllowed(Context context) {
        return getVivoBgStartPermissionStatus(context) == 0;
    }

    private final boolean isXiaomiBgStartPermissionAllowed(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            Object systemService = context.getSystemService("appops");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            AppOpsManager appOpsManager = (AppOpsManager) systemService;
            try {
                Class<?> cls = appOpsManager.getClass();
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class});
                C8594l.m46770d(method, "ops.javaClass.getMethod(…ss.java\n                )");
                Object invoke = method.invoke(appOpsManager, new Object[]{10021, Integer.valueOf(Process.myUid()), context.getPackageName()});
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } else if (((Integer) invoke).intValue() == 0) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        r0 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        r0.setData(android.net.Uri.fromParts("package", r6.getPackageName(), (java.lang.String) null));
        r6.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void requestOppoBGPermissions(android.content.Context r6) {
        /*
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r2 = "packageName"
            java.lang.String r3 = r5.getAppId(r6)     // Catch:{ Exception -> 0x0023 }
            r0.putExtra(r2, r3)     // Catch:{ Exception -> 0x0023 }
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ Exception -> 0x0023 }
            java.lang.String r3 = "com.color.safecenter"
            java.lang.String r4 = "com.color.safecenter.permission.PermissionManagerActivity"
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0023 }
            r0.setComponent(r2)     // Catch:{ Exception -> 0x0023 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0067
        L_0x0023:
            r0.setFlags(r1)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "pkg_name"
            java.lang.String r2 = r6.getPackageName()     // Catch:{ Exception -> 0x004f }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "app_name"
            java.lang.String r2 = r5.getAppName(r6)     // Catch:{ Exception -> 0x004f }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "class_name"
            java.lang.String r2 = "com.welab.notificationdemo.MainActivity"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x004f }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x004f }
            java.lang.String r2 = "com.coloros.notificationmanager"
            java.lang.String r3 = "com.coloros.notificationmanager.AppDetailPreferenceActivity"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x004f }
            r0.setComponent(r1)     // Catch:{ Exception -> 0x004f }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x004f }
            goto L_0x0067
        L_0x004f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = r6.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            r6.startActivity(r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.utils.RomUtils.requestOppoBGPermissions(android.content.Context):void");
    }

    private final void requestPermissionsToSetting(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        context.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (p369i.p376f0.C8437p.m46566v(r2, "Y85A", false, 2, (java.lang.Object) null) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void requestVivoBGPermissions(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MODEL"
            r1 = 0
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0062 }
            p369i.p387z.p389d.C8594l.m46770d(r2, r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = "Y85"
            r4 = 2
            r5 = 0
            boolean r3 = p369i.p376f0.C8437p.m46566v(r2, r3, r5, r4, r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r6 = "packagename"
            java.lang.String r7 = "com.vivo.permissionmanager"
            if (r3 == 0) goto L_0x0021
            p369i.p387z.p389d.C8594l.m46770d(r2, r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r3 = "Y85A"
            boolean r3 = p369i.p376f0.C8437p.m46566v(r2, r3, r5, r4, r1)     // Catch:{ Exception -> 0x0062 }
            if (r3 == 0) goto L_0x002c
        L_0x0021:
            p369i.p387z.p389d.C8594l.m46770d(r2, r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r0 = "vivo Y53L"
            boolean r0 = p369i.p376f0.C8437p.m46566v(r2, r0, r5, r4, r1)     // Catch:{ Exception -> 0x0062 }
            if (r0 == 0) goto L_0x0048
        L_0x002c:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0062 }
            r0.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "com.vivo.permissionmanager.activity.PurviewTabActivity"
            r0.setClassName(r7, r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ Exception -> 0x0062 }
            r0.putExtra(r6, r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "tabId"
            java.lang.String r3 = "1"
            r0.putExtra(r2, r3)     // Catch:{ Exception -> 0x0062 }
            r9.startActivity(r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0079
        L_0x0048:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0062 }
            r0.<init>()     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"
            r0.setClassName(r7, r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "secure.intent.action.softPermissionDetail"
            r0.setAction(r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = r9.getPackageName()     // Catch:{ Exception -> 0x0062 }
            r0.putExtra(r6, r2)     // Catch:{ Exception -> 0x0062 }
            r9.startActivity(r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0079
        L_0x0062:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r2)
            java.lang.String r2 = r9.getPackageName()
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r2, r1)
            r0.setData(r1)
            r9.startActivity(r0)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.utils.RomUtils.requestVivoBGPermissions(android.content.Context):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0030, code lost:
        r0 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        r0.setData(android.net.Uri.fromParts("package", r6.getPackageName(), (java.lang.String) null));
        r6.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void requestXiaoMiBGPermissions(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "extra_pkgname"
            java.lang.String r1 = "com.miui.securitycenter"
            java.lang.String r2 = "miui.intent.action.APP_PERM_EDITOR"
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x001b }
            r3.<init>(r2)     // Catch:{ Exception -> 0x001b }
            java.lang.String r4 = "com.miui.permcenter.permissions.PermissionsEditorActivity"
            r3.setClassName(r1, r4)     // Catch:{ Exception -> 0x001b }
            java.lang.String r4 = r6.getPackageName()     // Catch:{ Exception -> 0x001b }
            r3.putExtra(r0, r4)     // Catch:{ Exception -> 0x001b }
            r6.startActivity(r3)     // Catch:{ Exception -> 0x001b }
            goto L_0x0048
        L_0x001b:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x0030 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r2 = "com.miui.permcenter.permissions.AppPermissionsEditorActivity"
            r3.setClassName(r1, r2)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r1 = r6.getPackageName()     // Catch:{ Exception -> 0x0030 }
            r3.putExtra(r0, r1)     // Catch:{ Exception -> 0x0030 }
            r6.startActivity(r3)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0048
        L_0x0030:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r0.<init>(r1)
            java.lang.String r1 = r6.getPackageName()
            r2 = 0
            java.lang.String r3 = "package"
            android.net.Uri r1 = android.net.Uri.fromParts(r3, r1, r2)
            r0.setData(r1)
            r6.startActivity(r0)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.video.videoplayercore.utils.RomUtils.requestXiaoMiBGPermissions(android.content.Context):void");
    }

    public final String getAppId(Context context) {
        C8594l.m46771e(context, "context");
        try {
            String str = context.getApplicationInfo().processName;
            C8594l.m46770d(str, "context.applicationInfo.processName");
            return str;
        } catch (Throwable th) {
            th.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public final String getAppName(Context context) {
        C8594l.m46771e(context, "context");
        try {
            return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public final boolean isBackgroundStartAllowed(Context context) {
        C8594l.m46771e(context, "context");
        if (isXiaoMi()) {
            return isXiaomiBgStartPermissionAllowed(context);
        }
        if (isVivo()) {
            return isVivoBgStartPermissionAllowed(context);
        }
        if (!isOppo() || Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return Settings.canDrawOverlays(context);
    }

    public final boolean isOppo() {
        return checkManufacturer("oppo");
    }

    public final boolean isVivo() {
        return checkManufacturer("vivo");
    }

    public final boolean isXiaoMi() {
        return checkManufacturer("xiaomi");
    }

    public final void requestBGPermissions(Context context) {
        C8594l.m46771e(context, "context");
        if (isVivo()) {
            requestVivoBGPermissions(context);
        } else if (isXiaoMi()) {
            requestXiaoMiBGPermissions(context);
        } else if (isOppo()) {
            requestOppoBGPermissions(context);
        } else {
            requestPermissionsToSetting(context);
        }
    }
}
