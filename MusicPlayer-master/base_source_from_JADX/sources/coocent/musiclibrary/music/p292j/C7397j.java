package coocent.musiclibrary.music.p292j;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.view.Window;
import android.view.WindowManager;
import com.un4seen.bass.BASS;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@SuppressLint({"NewApi"})
/* renamed from: coocent.musiclibrary.music.j.j */
/* compiled from: SystemUtil */
public class C7397j {

    /* renamed from: a */
    public static int f32504a;

    /* renamed from: b */
    public static int f32505b;

    /* renamed from: c */
    public static float f32506c;

    /* renamed from: d */
    public static final String f32507d = (Environment.getExternalStorageDirectory().getPath() + "/Music/Music Cutter/");

    /* renamed from: a */
    public static int m41731a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static String m41732b(int i) {
        if (i < 0) {
            return "00:00";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = (i / 60) / 60;
        String str = "0";
        if (i2 > 0) {
            sb.append(i2 < 10 ? str : BuildConfig.FLAVOR);
            sb.append(i2);
            sb.append(":");
            i -= (i2 * 60) * 60;
        }
        int i3 = i / 60;
        sb.append(i3 < 10 ? str : BuildConfig.FLAVOR);
        sb.append(i3);
        sb.append(":");
        int i4 = i % 60;
        if (i4 >= 10) {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        sb.append(i4);
        return sb.toString();
    }

    /* renamed from: c */
    public static int m41733c(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (Build.VERSION.SDK_INT < 19 || identifier <= 0) {
            return 0;
        }
        return (int) context.getResources().getDimension(identifier);
    }

    /* renamed from: d */
    public static void m41734d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            m41736f(activity, true);
            C7394i iVar = new C7394i(activity);
            iVar.mo28199d(true);
            iVar.mo28198c(17170445);
            iVar.mo28197b().mo28202g(false);
        }
    }

    /* renamed from: e */
    public static boolean m41735e(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == ',' || charAt == '/' || charAt == '\\' || charAt == '@' || charAt == '#' || charAt == '*' || charAt == '&' || charAt == 12290) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(19)
    /* renamed from: f */
    private static void m41736f(Activity activity, boolean z) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= BASS.BASS_SPEAKER_REAR2;
        } else {
            attributes.flags &= -67108865;
        }
        try {
            window.setAttributes(attributes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
