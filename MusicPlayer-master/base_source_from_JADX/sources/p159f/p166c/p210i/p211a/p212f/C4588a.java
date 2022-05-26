package p159f.p166c.p210i.p211a.p212f;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import androidx.core.app.C0492j;
import androidx.core.content.p003d.C0524f;
import com.coocent.notification.permission.activity.NotificationPermissionDialogActivity;
import com.un4seen.bass.BASS;
import p159f.p166c.p210i.p211a.C4583a;
import p159f.p166c.p210i.p211a.C4587e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.i.a.f.a */
/* compiled from: NotificationPermissionUtils.kt */
public final class C4588a {
    /* renamed from: a */
    public static final boolean m20008a(Activity activity, int i) {
        C8594l.m46771e(activity, "activity");
        if (i == 61024) {
            return m20011d(activity);
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m20009b(Context context) {
        C8594l.m46771e(context, "context");
        return m20011d(context);
    }

    /* renamed from: c */
    public static final void m20010c(Activity activity) {
        C8594l.m46771e(activity, "activity");
        if (!m20012e(activity) && !m20009b(activity) && Build.VERSION.SDK_INT >= 21) {
            NotificationPermissionDialogActivity.f8748E.mo9600a(activity);
        }
    }

    /* renamed from: d */
    private static final boolean m20011d(Context context) {
        C0492j f = C0492j.m3089f(context);
        C8594l.m46770d(f, "NotificationManagerCompat.from(this)");
        return f.mo3220a();
    }

    /* renamed from: e */
    public static final boolean m20012e(Context context) {
        C8594l.m46771e(context, "$this$isNotAskAgain");
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("notAskAgain", false);
    }

    /* renamed from: f */
    public static final void m20013f(Context context, boolean z) {
        C8594l.m46771e(context, "$this$setNotAskAgain");
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("notAskAgain", z).apply();
    }

    /* renamed from: g */
    public static final void m20014g(Activity activity, Context context, int i) {
        C8594l.m46771e(activity, "$this$startNotificationPermissionActivity");
        C8594l.m46771e(context, "context");
        Intent intent = new Intent();
        try {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", activity.getApplicationInfo().uid);
            intent.putExtra("app_package", activity.getPackageName());
            intent.putExtra("app_uid", activity.getApplicationInfo().uid);
            activity.startActivityForResult(intent, i);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.putExtra("package", activity.getPackageName());
                activity.startActivityForResult(intent, i);
            } catch (Exception e2) {
                e2.printStackTrace();
                Toast.makeText(context, C4587e.notification_open_error, 1).show();
            }
        }
    }

    /* renamed from: h */
    public static final void m20015h(Activity activity) {
        C8594l.m46771e(activity, "$this$statusTranslucent");
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.clearFlags(BASS.BASS_SPEAKER_REAR2);
            window.addFlags(Integer.MIN_VALUE);
            C8594l.m46770d(window, "window");
            View decorView = window.getDecorView();
            C8594l.m46770d(decorView, "window.decorView");
            View decorView2 = window.getDecorView();
            C8594l.m46770d(decorView2, "window.decorView");
            decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 1024);
            window.setStatusBarColor(0);
            View decorView3 = window.getDecorView();
            C8594l.m46770d(decorView3, "window.decorView");
            decorView3.setSystemUiVisibility(9232);
            window.setNavigationBarColor(C0524f.m3223d(activity.getResources(), C4583a.white, (Resources.Theme) null));
            return;
        }
        window.addFlags(BASS.BASS_SPEAKER_REAR2);
    }
}
