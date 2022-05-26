package net.coocent.android.xmlparser.p461z;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.C0133c;
import java.util.Iterator;
import java.util.List;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.activity.ReInstallActivity;
import net.coocent.android.xmlparser.application.AbstractApplication;
import p391j.p392a.p393a.C8615h;
import p391j.p392a.p393a.C8617j;

/* renamed from: net.coocent.android.xmlparser.z.d */
/* compiled from: AppUtils */
public class C9564d {
    @Deprecated
    /* renamed from: a */
    private static void m50175a(Context context, String str) {
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            View inflate = LayoutInflater.from(context).inflate(C8615h.layout_dialog_video_editor_ad, (ViewGroup) null, false);
            C0133c.C0134a aVar = new C0133c.C0134a(context, C8617j.Promotion_Dialog_VideoEditor);
            aVar.mo641l(17039370, new C9562b(context, str));
            aVar.mo638i(17039360, C9563c.f36724g);
            aVar.mo633d(false);
            aVar.mo646q(inflate);
            C0133c a = aVar.mo630a();
            a.setCanceledOnTouchOutside(false);
            a.setOnShowListener(new C9561a(a, context));
            a.show();
        }
    }

    /* renamed from: b */
    public static boolean m50176b(Context context, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                Log.e("Promotion", "package name is empty or null");
                return false;
            } else if (((AbstractApplication) AbstractApplication.getApplication()).mo26945h() != 0) {
                m50179e(context, context.getPackageName());
                return true;
            } else if (!m50184j(context)) {
                m50179e(context, context.getPackageName());
                Log.e("Promotion", "Google Play not installed");
                return true;
            } else {
                Intent action = context.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                action.setData(Uri.parse(("market://details?id=" + str) + "&referrer=utm_source%3D" + str2 + "_" + C9502v.m49941l() + "%26utm_medium%3Dclick_download"));
                C9566f.m50207r(context);
                context.startActivity(action);
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /* renamed from: c */
    public static void m50177c(Context context) {
        try {
            if (((AbstractApplication) AbstractApplication.getApplication()).mo26945h() != 0) {
                m50179e(context, context.getPackageName());
            } else if (!m50184j(context)) {
                m50179e(context, context.getPackageName());
            } else {
                Uri parse = Uri.parse("market://details?id=" + context.getPackageName());
                Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage("com.android.vending");
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setAction("android.intent.action.VIEW");
                    launchIntentForPackage.setData(parse);
                    C9566f.m50207r(context);
                    context.startActivity(launchIntentForPackage);
                    return;
                }
                Log.e("Promotion", "get google play intent null");
            }
        } catch (Exception e) {
            Log.i("Promotion", "Intent application details error, now intent to google play");
            e.printStackTrace();
        }
    }

    @Deprecated
    /* renamed from: d */
    public static void m50178d(Context context, String str, String str2) {
        if (m50182h(context, "videoeditor.effect.videomaker")) {
            Intent intent = new Intent();
            intent.setAction("com.coocent.videoeditor.action.MOVIE_EDIT");
            intent.putExtra("videoPath", str);
            intent.putExtra("isNeedTransCode", true);
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                m50175a(context, str2);
            }
        } else {
            m50175a(context, str2);
        }
    }

    /* renamed from: e */
    public static void m50179e(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str));
            C9566f.m50207r(context);
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public static boolean m50180f(Context context, String str, String str2) {
        Uri uri;
        if (context == null) {
            return false;
        }
        try {
            if (!m50184j(context)) {
                m50179e(context, str);
                return true;
            }
            Intent action = context.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
            String str3 = "market://details?id=" + str;
            if (TextUtils.isEmpty(str2)) {
                uri = Uri.parse(str3);
            } else {
                uri = Uri.parse(str3 + "&referrer=utm_source%3D" + str2 + "%26utm_medium%3Dclick_download");
            }
            action.setData(uri);
            C9566f.m50207r(context);
            context.startActivity(action);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m50181g(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("Promotion", "package name is empty or null");
            return false;
        } else if (((AbstractApplication) AbstractApplication.getApplication()).mo26945h() != 0) {
            m50179e(context, context.getPackageName());
            return true;
        } else {
            try {
                C9566f.m50207r(context);
                Intent action = context.getPackageManager().getLaunchIntentForPackage("com.android.vending").setAction("android.intent.action.VIEW");
                action.setData(Uri.parse("market://details?id=" + str));
                context.startActivity(action);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    /* renamed from: h */
    public static boolean m50182h(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            return m50183i(context.getApplicationContext().getPackageManager(), str);
        }
        Log.e("Promotion", "Context is null or package name is empty");
        return false;
    }

    /* renamed from: i */
    public static boolean m50183i(PackageManager packageManager, String str) {
        return packageManager.getLaunchIntentForPackage(str) != null;
    }

    /* renamed from: j */
    public static boolean m50184j(Context context) {
        if (context != null) {
            return m50182h(context, "com.android.vending");
        }
        Log.e("Promotion", "Context is null");
        return false;
    }

    /* renamed from: n */
    public static void m50188n(Context context) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks();
            try {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.AppTask next = it.next();
                    if (!(next.getTaskInfo() == null || next.getTaskInfo().baseIntent == null)) {
                        if (next.getTaskInfo().baseIntent.getComponent() != null) {
                            if (ReInstallActivity.class.getName().equals(next.getTaskInfo().baseIntent.getComponent().getClassName())) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            z = false;
            if (!z) {
                try {
                    Iterator<ActivityManager.AppTask> it2 = appTasks.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ActivityManager.AppTask next2 = it2.next();
                        if (next2.getTaskInfo() != null && next2.getTaskInfo().baseIntent != null && next2.getTaskInfo().baseIntent.getComponent() != null) {
                            z = true;
                            break;
                        }
                    }
                    for (ActivityManager.AppTask finishAndRemoveTask : appTasks) {
                        finishAndRemoveTask.finishAndRemoveTask();
                    }
                    if (z) {
                        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, ReInstallActivity.class), 1, 1);
                        Intent intent = new Intent(context, ReInstallActivity.class);
                        intent.addFlags(884998144);
                        context.startActivity(intent);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                System.exit(0);
                return;
            }
            return;
        }
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.addCategory("android.intent.category.HOME");
        intent2.setFlags(268435456);
        context.startActivity(intent2);
        Toast.makeText(context, "The app " + context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() + " is missing required components and must be reinstalled from the Google Play Store", 1).show();
        System.exit(0);
    }
}
