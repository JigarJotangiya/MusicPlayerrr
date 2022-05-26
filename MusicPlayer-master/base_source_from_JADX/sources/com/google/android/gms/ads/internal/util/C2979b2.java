package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.browser.customtabs.C0346c;
import com.google.android.gms.ads.formats.C2920k;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.p074x.C3126b;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.common.util.C3361f;
import com.google.android.gms.common.util.C3369n;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5207iz;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.bp2;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.dh0;
import com.google.android.gms.internal.ads.ep2;
import com.google.android.gms.internal.ads.gr0;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.ns0;
import com.google.android.gms.internal.ads.ns3;
import com.google.android.gms.internal.ads.p00;
import com.google.android.gms.internal.ads.rq1;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.w03;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.b2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2979b2 {

    /* renamed from: i */
    public static final w03 f9980i = new C3021n1(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static boolean f9981j = false;

    /* renamed from: a */
    private final AtomicReference<Pattern> f9982a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final AtomicReference<Pattern> f9983b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f9984c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f9985d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f9986e;

    /* renamed from: f */
    private boolean f9987f = false;

    /* renamed from: g */
    private boolean f9988g = false;

    /* renamed from: h */
    private final Executor f9989h = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public static int m13232A(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        ul0.m31862g(sb.toString());
        return 60000;
    }

    /* renamed from: B */
    public static final boolean m13233B(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return m13276x(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m13234C(context));
    }

    /* renamed from: C */
    private static KeyguardManager m13234C(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    /* renamed from: D */
    private static Bundle m13235D(Context context) {
        try {
            return C3334c.m14368a(context).mo11910c(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C3018m1.m13389l("Error getting metadata", e);
            return null;
        }
    }

    /* renamed from: E */
    private static String m13236E(Bundle bundle) {
        if (bundle == null) {
            return BuildConfig.FLAVOR;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return BuildConfig.FLAVOR;
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: F */
    private final JSONArray m13237F(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object G : collection) {
            m13238G(jSONArray, G);
        }
        return jSONArray;
    }

    /* renamed from: G */
    private final void m13238G(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(mo10978M((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo10979N((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m13237F((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object G : (Object[]) obj) {
                m13238G(jSONArray2, G);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: H */
    private final void m13239H(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, mo10978M((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo10979N((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m13237F((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m13237F(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: I */
    private static boolean m13240I(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: U */
    public static void m13245U(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            hm0.f17708a.execute(runnable);
        }
    }

    /* renamed from: a */
    public static final long m13246a(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    /* renamed from: b */
    public static final WebResourceResponse m13247b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C2971s.m13214q().mo10977L(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new C3032r0(context).mo11110b(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            ul0.m31863h("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: b0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m13248b0(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C2979b2.m13248b0(android.view.View):boolean");
    }

    /* renamed from: c */
    public static final int m13249c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (C3369n.m14479k()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22312D5)).booleanValue()) {
                return 0;
            }
        }
        return telephonyManager.getNetworkType();
    }

    @TargetApi(18)
    /* renamed from: c0 */
    public static final void m13250c0(Context context, Intent intent) {
        Bundle bundle;
        if (intent != null && C3369n.m14472d()) {
            if (intent.getExtras() != null) {
                bundle = intent.getExtras();
            } else {
                bundle = new Bundle();
            }
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(bundle);
        }
    }

    /* renamed from: d */
    public static final String m13251d() {
        Resources d = C2971s.m13213p().mo17559d();
        return d != null ? d.getString(C3126b.f10239s7) : "Test Ad";
    }

    /* renamed from: d0 */
    public static final String m13252d0(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return m13236E(m13235D(context));
    }

    /* renamed from: e */
    public static final C3041u0 m13253e(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                ul0.m31859d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof C3041u0 ? (C3041u0) queryLocalInterface : new C3035s0(iBinder);
        } catch (Exception e) {
            C2971s.m13213p().mo17571s(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    /* renamed from: e0 */
    static final String m13254e0() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: f */
    public static final boolean m13255f(Context context, String str) {
        Context a = dh0.m22514a(context);
        return C3334c.m14368a(a).mo11909b(str, a.getPackageName()) == 0;
    }

    /* renamed from: f0 */
    public static final String m13256f0() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: g */
    public static final boolean m13257g(String str) {
        if (!tl0.m31314l()) {
            return false;
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22492c3)).booleanValue()) {
            return false;
        }
        String str2 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22508e3);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) C5054ev.m23225c().mo20153b(C5503qz.f22500d3);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public static final DisplayMetrics m13258g0(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    @TargetApi(16)
    /* renamed from: h */
    public static final boolean m13259h(Context context) {
        KeyguardManager C;
        if (context == null || !C3369n.m14470b() || (C = m13234C(context)) == null || !C.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: h0 */
    protected static final int[] m13260h0() {
        return new int[]{0, 0};
    }

    /* renamed from: i */
    public static final boolean m13261i(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            ul0.m31860e("Error loading class.", th);
            C2971s.m13213p().mo17571s(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: j */
    public static final boolean m13262j(Context context) {
        boolean z;
        if (C3369n.m14478j()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22296B5)).booleanValue()) {
                synchronized (C2979b2.class) {
                    z = f9981j;
                }
                return z;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: k */
    public static final boolean m13263k(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m13264l(Context context) {
        Bundle D = m13235D(context);
        return TextUtils.isEmpty(m13236E(D)) && !TextUtils.isEmpty(D.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    /* renamed from: m */
    public static final boolean m13265m(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final void m13266n(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        bp2 w;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof rq1) {
                view2 = ((rq1) view2).getChildAt(0);
            }
            if ((view2 instanceof C2920k) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            C2971s.m13214q();
            long a = m13246a(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof ns0) {
                ep2 B = ((ns0) view2).mo17651B();
                if (B != null) {
                    str2 = B.f16050b;
                    int hashCode = view2.hashCode();
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
                    sb.append(str2);
                    sb.append(":");
                    sb.append(hashCode);
                    view2.setContentDescription(sb.toString());
                    if ((view2 instanceof gr0) && (w = ((gr0) view2).mo17714w()) != null) {
                        str = bp2.m21487a(w.f14637b);
                        i2 = w.f14645f;
                        str3 = w.f14614F;
                    }
                    ul0.m31861f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(a), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = bp2.m21487a(w.f14637b);
            i2 = w.f14645f;
            str3 = w.f14614F;
            ul0.m31861f(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(a), Integer.toString(i, 2)}));
        } catch (Exception e) {
            ul0.m31860e("Failure getting view location.", e);
        }
    }

    /* renamed from: o */
    public static final void m13267o(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String a1Var : arrayList) {
            new C2974a1(context, str, a1Var).mo10973b();
        }
    }

    /* renamed from: p */
    public static final void m13268p(Context context, Throwable th) {
        if (context != null) {
            try {
                if (n10.f20444b.mo20989e().booleanValue()) {
                    C3361f.m14446a(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: q */
    public static final void m13269q(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: r */
    public static final int m13270r(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            ul0.m31862g("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    /* renamed from: s */
    public static final Map<String, String> m13271s(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    /* renamed from: t */
    public static final WebResourceResponse m13272t(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        C2971s.m13214q();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str2 = BuildConfig.FLAVOR;
        if (isEmpty) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        C2971s.m13214q();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return C2971s.m13215r().mo11023m(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: u */
    public static final int[] m13273u(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m13260h0();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: v */
    protected static final String m13274v(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m13254e0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] m13275w(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m13260h0()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.nl0 r1 = com.google.android.gms.internal.ads.C4980cv.m22123b()
            r5 = r4[r3]
            int r1 = r1.mo19749b(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.nl0 r1 = com.google.android.gms.internal.ads.C4980cv.m22123b()
            r3 = r4[r2]
            int r6 = r1.mo19749b(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C2979b2.m13275w(android.app.Activity):int[]");
    }

    /* renamed from: x */
    public static final boolean m13276x(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = C2971s.m13214q().f9984c || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || m13248b0(view);
        long a = m13246a(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22396P0)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22623s6)).booleanValue()) {
                    return true;
                }
                if (a < ((long) ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22639u6)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: y */
    public static final void m13277y(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m13250c0(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            ul0.m31857b(sb.toString());
        } catch (ActivityNotFoundException e) {
            ul0.m31860e("No browser is found.", e);
        }
    }

    /* renamed from: z */
    public static final int[] m13278z(Activity activity) {
        int[] u = m13273u(activity);
        return new int[]{C4980cv.m22123b().mo19749b(activity, u[0]), C4980cv.m22123b().mo19749b(activity, u[1])};
    }

    /* renamed from: J */
    public final d93<Map<String, String>> mo10976J(Uri uri) {
        return s83.m30609k(new C3036s1(uri), this.f9989h);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0039, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[Catch:{ Exception -> 0x00ad }] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10977L(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f9985d
            monitor-enter(r0)
            java.lang.String r1 = r4.f9986e     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = m13254e0()     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.f r1 = com.google.android.gms.ads.internal.C2971s.m13215r()     // Catch:{ Exception -> 0x001b }
            java.lang.String r1 = r1.mo11012d(r5)     // Catch:{ Exception -> 0x001b }
            r4.f9986e = r1     // Catch:{ Exception -> 0x001b }
        L_0x001b:
            java.lang.String r1 = r4.f9986e     // Catch:{ all -> 0x00c7 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.C4980cv.m22123b()     // Catch:{ all -> 0x00c7 }
            boolean r1 = com.google.android.gms.internal.ads.nl0.m27924p()     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x0063
            r1 = 0
            r4.f9986e = r1     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.w03 r1 = f9980i     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.ads.internal.util.u1 r2 = new com.google.android.gms.ads.internal.util.u1     // Catch:{ all -> 0x00c7 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00c7 }
            r1.post(r2)     // Catch:{ all -> 0x00c7 }
        L_0x0039:
            java.lang.String r1 = r4.f9986e     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x0069
            java.lang.Object r1 = r4.f9985d     // Catch:{ InterruptedException -> 0x0043 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0043 }
            goto L_0x0039
        L_0x0043:
            java.lang.String r1 = m13254e0()     // Catch:{ all -> 0x00c7 }
            r4.f9986e = r1     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c7 }
            int r3 = r1.length()     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x005a
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00c7 }
            goto L_0x005f
        L_0x005a:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00c7 }
            r1.<init>(r2)     // Catch:{ all -> 0x00c7 }
        L_0x005f:
            com.google.android.gms.internal.ads.ul0.m31862g(r1)     // Catch:{ all -> 0x00c7 }
            goto L_0x0039
        L_0x0063:
            java.lang.String r1 = m13274v(r5)     // Catch:{ all -> 0x00c7 }
            r4.f9986e = r1     // Catch:{ all -> 0x00c7 }
        L_0x0069:
            java.lang.String r1 = r4.f9986e     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c7 }
            int r2 = r2.length()     // Catch:{ all -> 0x00c7 }
            int r2 = r2 + 10
            int r3 = r6.length()     // Catch:{ all -> 0x00c7 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r3.<init>(r2)     // Catch:{ all -> 0x00c7 }
            r3.append(r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00c7 }
            r3.append(r6)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00c7 }
            r4.f9986e = r6     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.common.l.b r5 = com.google.android.gms.common.p078l.C3334c.m14368a(r5)     // Catch:{ Exception -> 0x00ad }
            boolean r5 = r5.mo11914g()     // Catch:{ Exception -> 0x00ad }
            if (r5 == 0) goto L_0x00b7
            java.lang.String r5 = r4.f9986e     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00ad }
            r4.f9986e = r5     // Catch:{ Exception -> 0x00ad }
            goto L_0x00b7
        L_0x00ad:
            r5 = move-exception
            com.google.android.gms.internal.ads.fl0 r6 = com.google.android.gms.ads.internal.C2971s.m13213p()     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo17571s(r5, r1)     // Catch:{ all -> 0x00c7 }
        L_0x00b7:
            java.lang.String r5 = r4.f9986e     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00c7 }
            r4.f9986e = r5     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            return r5
        L_0x00c7:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c7 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.C2979b2.mo10977L(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: M */
    public final JSONObject mo10978M(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m13239H(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: N */
    public final JSONObject mo10979N(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m13239H(jSONObject, next, map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: O */
    public final JSONObject mo10980O(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return mo10978M(bundle);
        } catch (JSONException e) {
            ul0.m31860e("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: S */
    public final void mo10981S(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int A = m13232A(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(A);
        sb.append(" milliseconds.");
        ul0.m31861f(sb.toString());
        httpURLConnection.setConnectTimeout(A);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(A);
        httpURLConnection.setRequestProperty("User-Agent", mo10977L(context, str));
        httpURLConnection.setUseCaches(false);
    }

    @TargetApi(26)
    /* renamed from: T */
    public final void mo10982T(Context context) {
        if (C3369n.m14478j()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22296B5)).booleanValue()) {
                ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new C3048w1(this));
            }
        }
    }

    /* renamed from: V */
    public final void mo10983V(Context context, String str, String str2, Bundle bundle, boolean z) {
        C2971s.m13214q();
        bundle.putString("device", m13256f0());
        bundle.putString("eids", TextUtils.join(",", C5503qz.m29788a()));
        C4980cv.m22123b();
        nl0.m27926r(context, str, "gmob-apps", bundle, true, new C3045v1(this, context, str));
    }

    /* renamed from: W */
    public final boolean mo10984W(String str) {
        return m13240I(str, this.f9982a, (String) C5054ev.m23225c().mo20153b(C5503qz.f22423T));
    }

    /* renamed from: X */
    public final boolean mo10985X(String str) {
        return m13240I(str, this.f9983b, (String) C5054ev.m23225c().mo20153b(C5503qz.f22430U));
    }

    /* renamed from: Y */
    public final boolean mo10986Y(Context context) {
        if (this.f9988g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C3054y1(this, (C3051x1) null), intentFilter);
        this.f9988g = true;
        return true;
    }

    /* renamed from: Z */
    public final boolean mo10987Z(Context context) {
        if (this.f9987f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C2975a2(this, (C3057z1) null), intentFilter);
        this.f9987f = true;
        return true;
    }

    @TargetApi(18)
    /* renamed from: a0 */
    public final int mo10988a0(Context context, Uri uri) {
        int i;
        if (context == null) {
            C3018m1.m13388k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!C3369n.m14472d()) {
            C3018m1.m13388k("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = 1;
        } else if (!(context instanceof Activity)) {
            C3018m1.m13388k("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        C5207iz izVar = C5503qz.f22349I2;
        C5207iz izVar2 = C5503qz.f22356J2;
        if (true == ((Boolean) C5054ev.m23225c().mo20153b(izVar)).equals(C5054ev.m23225c().mo20153b(izVar2))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(izVar)).booleanValue()) {
            p00 p00 = new p00();
            p00.mo20166e(new C3039t1(this, p00, context, uri));
            p00.mo20163b((Activity) context);
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(izVar2)).booleanValue()) {
            return 5;
        }
        C0346c a = new C0346c.C0347a().mo2276a();
        a.f1502a.setPackage(ns3.m28062a(context));
        a.mo2275a(context, uri);
        return 5;
    }
}
