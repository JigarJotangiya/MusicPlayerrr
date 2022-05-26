package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ck0 {

    /* renamed from: a */
    private final AtomicReference<ExecutorService> f14998a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private final Object f14999b = new Object();

    /* renamed from: c */
    private String f15000c = null;

    /* renamed from: d */
    private String f15001d = null;

    /* renamed from: e */
    final AtomicBoolean f15002e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicInteger f15003f = new AtomicInteger(-1);

    /* renamed from: g */
    private final AtomicReference<Object> f15004g = new AtomicReference<>((Object) null);

    /* renamed from: h */
    private final AtomicReference<Object> f15005h = new AtomicReference<>((Object) null);

    /* renamed from: i */
    private final ConcurrentMap<String, Method> f15006i = new ConcurrentHashMap(9);

    /* renamed from: j */
    private final AtomicReference<it0> f15007j = new AtomicReference<>((Object) null);

    /* renamed from: k */
    private final BlockingQueue<FutureTask<?>> f15008k = new ArrayBlockingQueue(20);

    /* renamed from: l */
    private final Object f15009l = new Object();

    /* renamed from: A */
    static final boolean m21936A(Context context) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22465Z)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.m14487a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22473a0)).intValue()) {
            return false;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22481b0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    /* renamed from: B */
    private final <T> T m21937B(String str, T t, ak0<T> ak0) {
        synchronized (this.f15007j) {
            if (this.f15007j.get() != null) {
                try {
                    T a = ak0.mo15827a(this.f15007j.get());
                    return a;
                } catch (Exception unused) {
                    m21943c(str, false);
                    return t;
                }
            }
        }
    }

    /* renamed from: C */
    private final Object m21938C(String str, Context context) {
        if (!m21945e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15004g, true)) {
            return null;
        }
        try {
            return m21939D(context, str).invoke(this.f15004g.get(), new Object[0]);
        } catch (Exception unused) {
            m21943c(str, true);
            return null;
        }
    }

    /* renamed from: D */
    private final Method m21939D(Context context, String str) {
        Method method = (Method) this.f15006i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.f15006i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m21943c(str, false);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.concurrent.ExecutorService m21940E() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f14998a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0065
            boolean r0 = com.google.android.gms.common.util.C3358c.m14436a()
            if (r0 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.s03 r0 = com.google.android.gms.internal.ads.v03.m32115a()
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C5503qz.f22458Y
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r1 = r2.mo20153b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.zj0 r2 = new com.google.android.gms.internal.ads.zj0
            r2.<init>(r9)
            r3 = 2
            java.util.concurrent.ExecutorService r0 = r0.mo20758b(r1, r2, r3)
            goto L_0x005f
        L_0x002d:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.iz<java.lang.Integer> r1 = com.google.android.gms.internal.ads.C5503qz.f22458Y
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r2 = r2.mo20153b(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.oz r3 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r1 = r3.mo20153b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            com.google.android.gms.internal.ads.zj0 r8 = new com.google.android.gms.internal.ads.zj0
            r8.<init>(r9)
            r4 = 1
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7, r8)
        L_0x005f:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r1 = r9.f14998a
            r2 = 0
            r1.compareAndSet(r2, r0)
        L_0x0065:
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.ExecutorService> r0 = r9.f14998a
            java.lang.Object r0 = r0.get()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ck0.m21940E():java.util.concurrent.ExecutorService");
    }

    /* renamed from: a */
    private final void m21941a(Context context, String str, String str2) {
        if (m21945e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15004g, true)) {
            Method method = (Method) this.f15006i.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, new Class[]{String.class});
                    this.f15006i.put(str2, method);
                } catch (Exception unused) {
                    m21943c(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f15004g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C3018m1.m13388k(sb.toString());
            } catch (Exception unused2) {
                m21943c(str2, false);
            }
        }
    }

    /* renamed from: b */
    private final void m21942b(Context context, String str, String str2, Bundle bundle) {
        String str3;
        Class<String> cls = String.class;
        if (mo16673z(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Invalid event ID: ".concat(valueOf);
                } else {
                    str3 = new String("Invalid event ID: ");
                }
                ul0.m31860e(str3, e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (m21936A(context)) {
                m21944d("logEventInternal", new mj0(str, bundle2));
            } else if (m21945e(context, "com.google.android.gms.measurement.AppMeasurement", this.f15004g, true)) {
                Method method = (Method) this.f15006i.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", new Class[]{cls, cls, Bundle.class});
                        this.f15006i.put("logEventInternal", method);
                    } catch (Exception unused) {
                        m21943c("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f15004g.get(), new Object[]{"am", str, bundle2});
                } catch (Exception unused2) {
                    m21943c("logEventInternal", true);
                }
            }
        }
    }

    /* renamed from: c */
    private final void m21943c(String str, boolean z) {
        if (!this.f15002e.get()) {
            StringBuilder sb = new StringBuilder(str.length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            ul0.m31862g(sb.toString());
            if (z) {
                ul0.m31862g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.f15002e.set(true);
            }
        }
    }

    /* renamed from: d */
    private final void m21944d(String str, bk0 bk0) {
        synchronized (this.f15007j) {
            FutureTask futureTask = new FutureTask(new nj0(this, bk0, str), (Object) null);
            if (this.f15007j.get() != null) {
                futureTask.run();
            } else {
                this.f15008k.offer(futureTask);
            }
        }
    }

    /* renamed from: e */
    private final boolean m21945e(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet((Object) null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
            } catch (Exception unused) {
                m21943c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo16653f(Context context) {
        if (!mo16673z(context)) {
            return null;
        }
        if (m21936A(context)) {
            Long l = (Long) m21937B("getAdEventId", (Object) null, qj0.f21938a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object C = m21938C("generateEventId", context);
        if (C != null) {
            return C.toString();
        }
        return null;
    }

    /* renamed from: g */
    public final String mo16654g(Context context) {
        if (!mo16673z(context)) {
            return null;
        }
        synchronized (this.f14999b) {
            String str = this.f15001d;
            if (str != null) {
                return str;
            }
            if (m21936A(context)) {
                this.f15001d = (String) m21937B("getAppIdOrigin", this.f15001d, rj0.f22870a);
            } else {
                this.f15001d = "fa";
            }
            String str2 = this.f15001d;
            return str2;
        }
    }

    /* renamed from: h */
    public final String mo16655h(Context context) {
        if (!mo16673z(context)) {
            return null;
        }
        long longValue = ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22451X)).longValue();
        if (m21936A(context)) {
            if (longValue >= 0) {
                return (String) m21940E().submit(new oj0(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) m21937B("getAppInstanceId", (Object) null, sj0.f23511a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) m21938C("getAppInstanceId", context);
        } else {
            try {
                return (String) m21940E().submit(new pj0(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo16656i(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getCurrentScreenName"
            boolean r1 = r6.mo16673z(r7)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = m21936A(r7)
            if (r1 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.lj0 r7 = com.google.android.gms.internal.ads.lj0.f19443a
            java.lang.String r0 = "getCurrentScreenNameOrScreenClass"
            java.lang.Object r7 = r6.m21937B(r0, r2, r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r6.f15004g
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurement"
            boolean r1 = r6.m21945e(r7, r4, r1, r3)
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r1 = 0
            java.lang.reflect.Method r3 = r6.m21939D(r7, r0)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r4 = r6.f15004g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x0052
            java.lang.String r3 = "getCurrentScreenClass"
            java.lang.reflect.Method r7 = r6.m21939D(r7, r3)     // Catch:{ Exception -> 0x0056 }
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r3 = r6.f15004g     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r7 = r7.invoke(r3, r4)     // Catch:{ Exception -> 0x0056 }
            r3 = r7
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            return r3
        L_0x0055:
            return r2
        L_0x0056:
            r6.m21943c(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ck0.mo16656i(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public final String mo16657j(Context context) {
        if (!mo16673z(context)) {
            return null;
        }
        synchronized (this.f14999b) {
            String str = this.f15000c;
            if (str != null) {
                return str;
            }
            if (m21936A(context)) {
                this.f15000c = (String) m21937B("getGmpAppId", this.f15000c, tj0.f23901a);
            } else {
                this.f15000c = (String) m21938C("getGmpAppId", context);
            }
            String str2 = this.f15000c;
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ String mo16658k() throws Exception {
        return (String) m21937B("getAppInstanceId", (Object) null, sj0.f23511a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ String mo16659l(Context context) throws Exception {
        return (String) m21938C("getAppInstanceId", context);
    }

    /* renamed from: m */
    public final void mo16660m(Context context, String str) {
        if (mo16673z(context)) {
            if (m21936A(context)) {
                m21944d("beginAdUnitExposure", new xj0(str));
            } else {
                m21941a(context, str, "beginAdUnitExposure");
            }
        }
    }

    /* renamed from: n */
    public final void mo16661n(Context context, String str) {
        if (mo16673z(context)) {
            if (m21936A(context)) {
                m21944d("endAdUnitExposure", new yj0(str));
            } else {
                m21941a(context, str, "endAdUnitExposure");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo16662o(bk0 bk0, String str) {
        if (this.f15007j.get() != null) {
            try {
                bk0.mo16255a(this.f15007j.get());
            } catch (Exception unused) {
                m21943c(str, false);
            }
        }
    }

    /* renamed from: p */
    public final void mo16663p(Context context, String str) {
        m21942b(context, "_aa", str, (Bundle) null);
    }

    /* renamed from: q */
    public final void mo16664q(Context context, String str) {
        m21942b(context, "_aq", str, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo16665r(Context context, String str) {
        m21942b(context, "_ac", str, (Bundle) null);
    }

    /* renamed from: s */
    public final void mo16666s(Context context, String str) {
        m21942b(context, "_ai", str, (Bundle) null);
    }

    /* renamed from: t */
    public final void mo16667t(Context context, String str, String str2, String str3, int i) {
        if (mo16673z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            m21942b(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            C3018m1.m13388k(sb.toString());
        }
    }

    /* renamed from: u */
    public final void mo16668u(Context context, zzbfd zzbfd) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22505e0)).booleanValue() && mo16673z(context) && m21936A(context)) {
            synchronized (this.f15009l) {
            }
        }
    }

    /* renamed from: v */
    public final void mo16669v(Context context, zzbkk zzbkk) {
        dk0.m22545d(context).mo16942b().mo17198d(zzbkk);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22505e0)).booleanValue() && mo16673z(context) && m21936A(context)) {
            synchronized (this.f15009l) {
            }
        }
    }

    /* renamed from: w */
    public final void mo16670w(Bundle bundle) {
        m21944d("setConsent", new wj0(bundle));
    }

    @Deprecated
    /* renamed from: x */
    public final void mo16671x(Context context, String str) {
        Class<String> cls = String.class;
        if (!mo16673z(context) || !(context instanceof Activity)) {
            return;
        }
        if (m21936A(context)) {
            m21944d("setScreenName", new vj0(context, str));
        } else if (m21945e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f15005h, false)) {
            Method method = (Method) this.f15006i.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", new Class[]{Activity.class, cls, cls});
                    this.f15006i.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    m21943c("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f15005h.get(), new Object[]{(Activity) context, str, context.getPackageName()});
            } catch (Exception unused2) {
                m21943c("setCurrentScreen", false);
            }
        }
    }

    /* renamed from: y */
    public final boolean mo16672y() {
        synchronized (this.f15009l) {
        }
        return false;
    }

    /* renamed from: z */
    public final boolean mo16673z(Context context) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22416S)).booleanValue() && !this.f15002e.get()) {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22489c0)).booleanValue()) {
                return true;
            }
            if (this.f15003f.get() == -1) {
                C4980cv.m22123b();
                if (!nl0.m27922n(context, C3245g.f10501a)) {
                    C4980cv.m22123b();
                    if (nl0.m27923o(context)) {
                        ul0.m31862g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f15003f.set(0);
                    }
                }
                this.f15003f.set(1);
            }
            if (this.f15003f.get() == 1) {
                return true;
            }
        }
        return false;
    }
}
