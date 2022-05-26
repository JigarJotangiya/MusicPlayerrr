package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.p078l.C3334c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class uf0 implements wf0 {

    /* renamed from: f */
    private static final Object f24312f = new Object();

    /* renamed from: g */
    static wf0 f24313g;

    /* renamed from: h */
    static wf0 f24314h;

    /* renamed from: a */
    private final Object f24315a = new Object();

    /* renamed from: b */
    private final Context f24316b;

    /* renamed from: c */
    private final WeakHashMap<Thread, Boolean> f24317c = new WeakHashMap<>();

    /* renamed from: d */
    private final ExecutorService f24318d;

    /* renamed from: e */
    private final zzcjf f24319e;

    protected uf0(Context context, zzcjf zzcjf) {
        v03.m32115a();
        this.f24318d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.f24316b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f24319e = zzcjf;
    }

    /* renamed from: c */
    public static wf0 m31800c(Context context) {
        synchronized (f24312f) {
            if (f24313g == null) {
                if (n10.f20447e.mo20989e().booleanValue()) {
                    if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22478a5)).booleanValue()) {
                        f24313g = new uf0(context, zzcjf.m34965Y());
                    }
                }
                f24313g = new vf0();
            }
        }
        return f24313g;
    }

    /* renamed from: d */
    public static wf0 m31801d(Context context, zzcjf zzcjf) {
        synchronized (f24312f) {
            if (f24314h == null) {
                if (n10.f20447e.mo20989e().booleanValue()) {
                    if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22478a5)).booleanValue()) {
                        uf0 uf0 = new uf0(context, zzcjf);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (uf0.f24315a) {
                                uf0.f24317c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new tf0(uf0, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new sf0(uf0, Thread.getDefaultUncaughtExceptionHandler()));
                        f24314h = uf0;
                    }
                }
                f24314h = new vf0();
            }
        }
        return f24314h;
    }

    /* renamed from: a */
    public final void mo21259a(Throwable th, String str, float f) {
        boolean z;
        String str2;
        if (nl0.m27917f(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            double d = (double) f;
            double random = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (random < d) {
                ArrayList<String> arrayList = new ArrayList<>();
                try {
                    z = C3334c.m14368a(this.f24316b).mo11914g();
                } catch (Throwable th2) {
                    ul0.m31860e("Error fetching instant app info", th2);
                    z = false;
                }
                try {
                    str2 = this.f24316b.getPackageName();
                } catch (Throwable unused) {
                    ul0.m31862g("Cannot obtain package name, proceeding.");
                    str2 = "unknown";
                }
                Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str3 = Build.MANUFACTURER;
                String str4 = Build.MODEL;
                if (!str4.startsWith(str3)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
                    sb.append(str3);
                    sb.append(" ");
                    sb.append(str4);
                    str4 = sb.toString();
                }
                arrayList.add(appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.f24319e.f27376g).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", stringWriter2).appendQueryParameter("eids", TextUtils.join(",", C5503qz.m29788a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "428884702").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(n10.f20445c.mo20989e())).appendQueryParameter("gmscv", String.valueOf(C3237c.m14031f().mo11693a(this.f24316b))).appendQueryParameter("lite", true != this.f24319e.f27380k ? "0" : "1").toString());
                for (String rf0 : arrayList) {
                    this.f24318d.execute(new rf0(new am0((String) null), rf0));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo21260b(Throwable th, String str) {
        mo21259a(th, str, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo21261e(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= nl0.m27918j(stackTraceElement.getClassName());
                    z2 |= uf0.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (z && !z2) {
                mo21259a(th, BuildConfig.FLAVOR, 1.0f);
            }
        }
    }
}
