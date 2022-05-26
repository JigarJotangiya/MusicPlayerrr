package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.C2900e;
import com.google.android.gms.ads.C2921g;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.C2888a;
import com.google.android.gms.ads.p076z.C3130a;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.C3245g;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class nl0 {

    /* renamed from: b */
    public static final Handler f20646b = new w03(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f20647c = AdView.class.getName();

    /* renamed from: d */
    private static final String f20648d = C3130a.class.getName();

    /* renamed from: e */
    private static final String f20649e = AdManagerAdView.class.getName();

    /* renamed from: f */
    private static final String f20650f = C2888a.class.getName();

    /* renamed from: g */
    private static final String f20651g = SearchAdView.class.getName();

    /* renamed from: h */
    private static final String f20652h = C2900e.class.getName();

    /* renamed from: a */
    private float f20653a = -1.0f;

    /* renamed from: a */
    public static int m27913a(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: c */
    public static C2921g m27914c(Context context, int i, int i2, int i3) {
        int a = m27913a(context, i3);
        if (a == -1) {
            return C2921g.f9801q;
        }
        return new C2921g(i, Math.max(Math.min(i > 655 ? Math.round((((float) i) / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? Math.round((((float) i) / 468.0f) * 60.0f) : i > 432 ? 68 : Math.round((((float) i) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) a) * 0.15f))), 50));
    }

    /* renamed from: d */
    public static String m27915d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: e */
    public static String m27916e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Throwable m27917f(Throwable th) {
        if (n10.f20448f.mo20989e().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m27918j(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: j */
    public static boolean m27918j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(n10.f20446d.mo20989e());
    }

    /* renamed from: k */
    public static final int m27919k(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: l */
    public static final String m27920l(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f20647c.equalsIgnoreCase(className) && !f20648d.equalsIgnoreCase(className) && !f20649e.equalsIgnoreCase(className) && !f20650f.equalsIgnoreCase(className) && !f20651g.equalsIgnoreCase(className) && !f20652h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: m */
    public static final boolean m27921m() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    /* renamed from: n */
    public static final boolean m27922n(Context context, int i) {
        return C3237c.m14031f().mo11680h(context, i) == 0;
    }

    /* renamed from: o */
    public static final boolean m27923o(Context context) {
        int h = C3237c.m14031f().mo11680h(context, C3245g.f10501a);
        return h == 0 || h == 2;
    }

    /* renamed from: p */
    public static final boolean m27924p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    public static final int m27925q(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: r */
    public static final void m27926r(Context context, String str, String str2, Bundle bundle, boolean z, ml0 ml0) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a = C3237c.m14031f().mo11693a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(a);
            sb.append(".214106000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        ml0.mo11120p(appendQueryParameter.toString());
    }

    /* renamed from: s */
    public static final int m27927s(Context context, int i) {
        return m27919k(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: t */
    public static final String m27928t(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m27921m()) {
            str = "emulator";
        }
        return m27916e(str);
    }

    /* renamed from: u */
    private static final void m27929u(ViewGroup viewGroup, zzbfi zzbfi, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int s = m27927s(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzbfi.f27220l - s, zzbfi.f27217i - s, 17));
            viewGroup.addView(frameLayout, zzbfi.f27220l, zzbfi.f27217i);
        }
    }

    /* renamed from: b */
    public final int mo19749b(Context context, int i) {
        if (this.f20653a < 0.0f) {
            synchronized (this) {
                if (this.f20653a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f20653a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f20653a);
    }

    /* renamed from: g */
    public final void mo19750g(ViewGroup viewGroup, zzbfi zzbfi, String str, String str2) {
        if (str2 != null) {
            ul0.m31862g(str2);
        }
        m27929u(viewGroup, zzbfi, str, -65536, -16777216);
    }

    /* renamed from: h */
    public final void mo19751h(ViewGroup viewGroup, zzbfi zzbfi, String str) {
        m27929u(viewGroup, zzbfi, "Ads by Google", -16777216, -1);
    }

    /* renamed from: i */
    public final void mo19752i(Context context, String str, String str2, Bundle bundle, boolean z) {
        m27926r(context, str, "gmob-apps", bundle, true, new ll0(this));
    }
}
