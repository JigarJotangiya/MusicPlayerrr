package p159f.p166c.p199f.p200h;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.coocent.musiccutter.activity.CropMusicActivity;
import com.coocent.musiccutter.ringtone.C2438d;
import java.math.BigDecimal;
import java.util.Locale;
import p159f.p166c.p199f.C4492f;

/* renamed from: f.c.f.h.a */
/* compiled from: CutUtils */
public class C4494a {

    /* renamed from: a */
    private static String f13106a = (Environment.getExternalStorageDirectory().getPath() + "/Music/Music Cutter");

    /* renamed from: a */
    public static boolean m19692a(Activity activity, String str) {
        boolean e = C2438d.m11419e(str);
        if (!e) {
            new AlertDialog.Builder(activity).setTitle(activity.getResources().getString(C4492f.fail)).setMessage(activity.getResources().getString(C4492f.bad_extension_error) + " " + C2438d.m11422q(str)).setPositiveButton(activity.getResources().getString(C4492f.main_ok), (DialogInterface.OnClickListener) null).setCancelable(false).show();
        }
        return e;
    }

    /* renamed from: b */
    public static String m19693b(double d) {
        double d2;
        int i = (int) (d / 60.0d);
        try {
            d2 = new BigDecimal(d % 60.0d).setScale(1, 4).doubleValue();
        } catch (NumberFormatException unused) {
            d2 = d % 60.0d;
        }
        return String.format("%02d", new Object[]{Integer.valueOf(i)}) + ":" + String.format("%02d", new Object[]{Integer.valueOf((int) d2)}) + "." + String.format("%d", new Object[]{Integer.valueOf((int) ((d2 * 10.0d) % 10.0d))});
    }

    /* renamed from: c */
    public static String m19694c(Context context) {
        return context.getPackageName() + "action_track_current_item_notify";
    }

    /* renamed from: d */
    public static String m19695d() {
        return f13106a;
    }

    /* renamed from: e */
    public static boolean m19696e() {
        if (Build.VERSION.SDK_INT < 17 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static void m19697f(Activity activity, long j, String str, String str2) {
        Intent intent = new Intent(activity, CropMusicActivity.class);
        intent.putExtra("audioId", j);
        intent.putExtra("title", str2);
        intent.putExtra("path", str);
        activity.startActivity(intent);
    }

    /* renamed from: g */
    public static boolean m19698g(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == ',' || charAt == '/' || charAt == '\\' || charAt == '@' || charAt == '#' || charAt == '*' || charAt == '&' || charAt == 12290) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static void m19699h(Activity activity, Uri uri) {
        RingtoneManager.setActualDefaultRingtoneUri(activity, 4, uri);
        String str = Build.MODEL;
        if ((str.equals("vivo X9Plus") || str.equals("SM-G9650")) && Build.VERSION.SDK_INT >= 19) {
            activity.startActivity(new Intent("android.intent.action.SHOW_ALARMS"));
        }
    }

    /* renamed from: i */
    public static void m19700i(Activity activity, Uri uri) {
        RingtoneManager.setActualDefaultRingtoneUri(activity, 2, uri);
    }

    /* renamed from: j */
    public static void m19701j(Activity activity, Uri uri) {
        RingtoneManager.setActualDefaultRingtoneUri(activity, 1, uri);
    }
}
