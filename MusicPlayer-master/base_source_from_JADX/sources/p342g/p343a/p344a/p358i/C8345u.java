package p342g.p343a.p344a.p358i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.app.C0466a;
import androidx.core.content.C0506a;
import coocent.music.player.base.BaseApplication;
import java.util.Locale;
import media.musicplayer.audioplayer.videoplayer.R;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.u */
/* compiled from: UiUtils */
public class C8345u {

    /* renamed from: a */
    private static final String[] f34792a = {"android.permission.RECORD_AUDIO"};

    /* renamed from: a */
    public static void m46320a(View view, View view2) {
        int m = m46332m();
        if (m > 0) {
            view.getLayoutParams().height += m;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.height = m;
            view2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public static void m46321b(View view, boolean z, boolean z2) {
        int m;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.rl_default_title);
        View findViewById = relativeLayout.findViewById(R.id.rl_title_black);
        if (z && (m = m46332m()) > 0) {
            relativeLayout.getLayoutParams().height += m;
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = m;
            findViewById.setLayoutParams(layoutParams);
        }
        if (z2) {
            relativeLayout.setBackgroundColor(0);
            findViewById.setBackgroundColor(0);
        }
    }

    /* renamed from: c */
    public static void m46322c(Activity activity) {
        InputMethodManager inputMethodManager;
        if (activity != null && (inputMethodManager = (InputMethodManager) activity.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
            activity.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.close_soft").setPackage(m46327h().getPackageName()));
        }
    }

    /* renamed from: d */
    public static int m46323d(int i) {
        return (int) ((((float) i) * m46330k().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e */
    public static String m46324e(int i) {
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

    /* renamed from: f */
    public static String[] m46325f(int i) {
        return m46330k().getStringArray(i);
    }

    /* renamed from: g */
    public static int m46326g(int i) {
        return m46330k().getColor(i);
    }

    /* renamed from: h */
    public static Context m46327h() {
        return BaseApplication.m40039j();
    }

    /* renamed from: i */
    public static int m46328i(Context context) {
        if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") == 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
    }

    /* renamed from: j */
    public static Drawable m46329j(int i) {
        return m46327h().getResources().getDrawable(i);
    }

    /* renamed from: k */
    public static Resources m46330k() {
        return BaseApplication.m40039j().getResources();
    }

    /* renamed from: l */
    public static int m46331l() {
        new DisplayMetrics();
        return m46327h().getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: m */
    public static int m46332m() {
        int identifier = m46327h().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (Build.VERSION.SDK_INT < 19 || identifier <= 0) {
            return 0;
        }
        return (int) m46327h().getResources().getDimension(identifier);
    }

    /* renamed from: n */
    public static String m46333n(int i) {
        return m46330k().getString(i);
    }

    /* renamed from: o */
    public static String m46334o(String str) {
        String[] split = str.split("/");
        return split[split.length - 1];
    }

    /* renamed from: p */
    public static boolean m46335p(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int i2 = displayMetrics.widthPixels;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics2);
            int i3 = displayMetrics2.heightPixels;
            if (i2 - displayMetrics2.widthPixels > 0 || i - i3 > 0) {
                return true;
            }
        } else {
            boolean hasPermanentMenuKey = ViewConfiguration.get(activity).hasPermanentMenuKey();
            boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
            if (hasPermanentMenuKey || deviceHasKey) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m46336q() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        boolean z = (m46327h().getApplicationInfo().flags & 4194304) == 4194304;
        boolean z2 = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final String m46337r(long j) {
        long j2 = j / 3600;
        long j3 = j % 3600;
        return String.format(m46327h().getResources().getString(j2 == 0 ? R.string.durationformatshort : R.string.durationformatlong), new Object[]{Long.valueOf(j2), Long.valueOf(j3 / 60), Long.valueOf(j3 % 60)});
    }

    /* renamed from: s */
    public static void m46338s(Activity activity) {
        if (C0506a.m3149a(activity, "android.permission.RECORD_AUDIO") != 0) {
            C0466a.m2986m(activity, f34792a, 44);
        }
    }

    /* renamed from: t */
    public static void m46339t(Runnable runnable) {
        if (Process.myTid() == BaseApplication.m40041l()) {
            runnable.run();
        } else {
            BaseApplication.m40040k().post(runnable);
        }
    }

    /* renamed from: u */
    public static void m46340u(int i) {
        Toast.makeText(m46327h(), i, 0).show();
    }
}
