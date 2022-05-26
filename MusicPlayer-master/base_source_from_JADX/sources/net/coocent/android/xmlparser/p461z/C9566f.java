package net.coocent.android.xmlparser.p461z;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.coocent.android.xmlparser.application.AbstractApplication;
import p082e.p109h.p117n.C3694f;
import p391j.p392a.p393a.C8609b;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@SuppressLint({"NewApi"})
/* renamed from: net.coocent.android.xmlparser.z.f */
/* compiled from: SystemUtils */
public class C9566f {

    /* renamed from: a */
    public static int f36725a;

    /* renamed from: b */
    public static int f36726b;

    /* renamed from: a */
    public static int m50190a(Context context, int i) {
        return (int) ((((float) i) * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: b */
    public static Drawable m50191b(Context context) {
        PackageManager packageManager;
        ApplicationInfo applicationInfo = null;
        try {
            packageManager = context.getApplicationContext().getPackageManager();
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            packageManager = null;
        }
        return packageManager.getApplicationIcon(applicationInfo);
    }

    /* renamed from: c */
    public static String m50192c(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static long m50193d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return (long) packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: e */
    public static String m50194e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0";
        }
    }

    /* renamed from: f */
    public static List<String> m50195f(Context context) {
        if (context == null) {
            return Collections.emptyList();
        }
        return new ArrayList(Arrays.asList(context.getResources().getStringArray(C8609b.eu_country)));
    }

    /* renamed from: g */
    public static String m50196g(Application application) {
        if (!TextUtils.equals(Locale.getDefault().getCountry().toUpperCase(), "CN")) {
            return "https://privacypolicy.oss-us-west-1.aliyuncs.com/protocol/privacy.txt";
        }
        if (!(application instanceof AbstractApplication)) {
            return "https://privacypolicy.oss-us-west-1.aliyuncs.com/china/privacyPolicy.txt";
        }
        String g = ((AbstractApplication) application).mo32495g();
        if (TextUtils.isEmpty(g)) {
            return "https://privacypolicy.oss-us-west-1.aliyuncs.com/china/privacyPolicy.txt";
        }
        return "https://cn-privacypolicy.oss-cn-shenzhen.aliyuncs.com/text/" + g;
    }

    /* renamed from: h */
    public static int m50197h(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (Build.VERSION.SDK_INT < 19 || identifier <= 0) {
            return 0;
        }
        return (int) context.getResources().getDimension(identifier);
    }

    /* renamed from: i */
    public static List<String> m50198i(Context context) {
        if (context == null) {
            return Collections.emptyList();
        }
        return new ArrayList(Arrays.asList(context.getResources().getStringArray(C8609b.target_country)));
    }

    /* renamed from: j */
    public static String m50199j(Context context) {
        List<String> f = m50195f(context);
        String country = Locale.getDefault().getCountry();
        if (m50198i(context).contains(country.toLowerCase())) {
            return country.toLowerCase();
        }
        return f.contains(country.toUpperCase()) ? "eu" : BuildConfig.FLAVOR;
    }

    /* renamed from: k */
    public static String m50200k() {
        AbstractApplication abstractApplication = (AbstractApplication) AbstractApplication.getApplication();
        return (abstractApplication == null || !abstractApplication.mo26944f()) ? BuildConfig.FLAVOR : m50206q(Settings.Secure.getString(abstractApplication.getApplicationContext().getContentResolver(), "android_id")).toUpperCase();
    }

    /* renamed from: l */
    public static int m50201l(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, -65281);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: m */
    public static void m50202m(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f36725a = displayMetrics.widthPixels;
        f36726b = displayMetrics.heightPixels;
        float f = displayMetrics.density;
    }

    /* renamed from: n */
    public static boolean m50203n(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* renamed from: o */
    public static boolean m50204o() {
        try {
            Application application = AbstractApplication.getApplication();
            if (!(application instanceof AbstractApplication) || ((AbstractApplication) application).mo26945h() != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: p */
    public static boolean m50205p(Context context) {
        Locale locale;
        int i = Build.VERSION.SDK_INT;
        if (i < 17) {
            return false;
        }
        if (i >= 24) {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        if (C3694f.m15811b(locale) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static String m50206q(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: r */
    public static void m50207r(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getPackageName(), "net.coocent.android.xmlparser.ads.AppOpenAdBroadcastReceiver"));
        context.sendBroadcast(intent);
    }

    /* renamed from: s */
    public static boolean m50208s(Context context) {
        if (context == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(context.getResources().getStringArray(C8609b.show_privacy_country)));
        List<String> f = m50195f(context);
        String upperCase = Locale.getDefault().getCountry().toUpperCase();
        if (TextUtils.isEmpty(upperCase)) {
            return false;
        }
        if (arrayList.isEmpty() && f.isEmpty()) {
            return false;
        }
        if (arrayList.contains(upperCase) || f.contains(upperCase)) {
            return true;
        }
        return false;
    }
}
