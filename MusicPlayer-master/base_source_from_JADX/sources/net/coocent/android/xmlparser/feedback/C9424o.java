package net.coocent.android.xmlparser.feedback;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.gson.p253b.C6488a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import net.coocent.android.xmlparser.application.AbstractApplication;
import net.coocent.android.xmlparser.p461z.C9565e;
import p082e.p109h.p118o.C3699e;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.feedback.o */
/* compiled from: StatisticsSource */
public class C9424o {

    /* renamed from: a */
    private final C9427c f36332a = new C9427c();

    /* renamed from: net.coocent.android.xmlparser.feedback.o$a */
    /* compiled from: StatisticsSource */
    class C9425a extends C6488a<C9428p> {
        C9425a(C9424o oVar) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.o$b */
    /* compiled from: StatisticsSource */
    class C9426b extends C6488a<C9423n> {
        C9426b(C9424o oVar) {
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.o$c */
    /* compiled from: StatisticsSource */
    private static class C9427c {

        /* renamed from: a */
        private final Executor f36333a = Executors.newFixedThreadPool(2);

        /* renamed from: b */
        private final Executor f36334b = Executors.newCachedThreadPool();

        /* renamed from: c */
        private final Executor f36335c = Executors.newSingleThreadExecutor();

        C9427c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Executor mo32543a() {
            return this.f36335c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Executor mo32544b() {
            return this.f36333a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Executor mo32545c() {
            return this.f36334b;
        }
    }

    /* renamed from: a */
    static String m49705a(Context context) {
        String packageName = context.getPackageName();
        if (!(context.getApplicationContext() instanceof Application)) {
            return packageName;
        }
        Application application = (Application) context.getApplicationContext();
        if (!(application instanceof AbstractApplication)) {
            return packageName;
        }
        String a = ((AbstractApplication) application).mo26940a();
        return !TextUtils.isEmpty(a) ? a : packageName;
    }

    /* renamed from: b */
    static String m49706b(Map<String, String> map) {
        try {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (Map.Entry next : map.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append("&");
                }
                sb.append(URLEncoder.encode((String) next.getKey(), "UTF-8"));
                sb.append("=");
                sb.append(URLEncoder.encode((String) next.getValue(), "UTF-8"));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: c */
    private C3699e<String, Boolean> m49707c(SharedPreferences sharedPreferences) {
        boolean z;
        String string = sharedPreferences.getString("uu", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            z = true;
        } else {
            z = false;
        }
        return new C3699e<>(string, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void mo32538e(C3699e eVar, Context context, String str) {
        boolean z = eVar == null || TextUtils.isEmpty((CharSequence) eVar.f11713a) || TextUtils.isEmpty((CharSequence) eVar.f11714b);
        SharedPreferences sharedPreferences = context.getSharedPreferences("event", 0);
        synchronized (this) {
            if (z) {
                sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
            } else {
                str = str + ":" + ((String) eVar.f11713a) + ":" + ((String) eVar.f11714b);
                sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
            }
            if (C9565e.m50189a(context)) {
                m49711j(context, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        java.lang.Thread.sleep(500);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        r11 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0185, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[Catch:{ all -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f A[Catch:{ all -> 0x0187 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo32539g(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            monitor-enter(r10)     // Catch:{ Exception -> 0x018d }
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ all -> 0x018a }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x018a }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            android.content.Context r1 = r11.getApplicationContext()     // Catch:{ all -> 0x018a }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x018a }
            boolean r3 = r1 instanceof net.coocent.android.xmlparser.application.AbstractApplication     // Catch:{ all -> 0x018a }
            if (r3 == 0) goto L_0x001c
            net.coocent.android.xmlparser.application.AbstractApplication r1 = (net.coocent.android.xmlparser.application.AbstractApplication) r1     // Catch:{ all -> 0x018a }
            boolean r1 = r1.mo26944f()     // Catch:{ all -> 0x018a }
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x018a }
            r3.<init>()     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = "https://files.coocent.net/"
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = "https://pro.coocent.net/"
        L_0x0029:
            r3.append(r1)     // Catch:{ all -> 0x018a }
            java.lang.String r1 = "rc2/evn"
            r3.append(r1)     // Catch:{ all -> 0x018a }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x018a }
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x018a }
            r3.<init>(r1)     // Catch:{ all -> 0x018a }
            java.net.URLConnection r1 = r3.openConnection()     // Catch:{ all -> 0x018a }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ all -> 0x0187 }
            r0 = 5000(0x1388, float:7.006E-42)
            r1.setConnectTimeout(r0)     // Catch:{ all -> 0x0187 }
            r1.setReadTimeout(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "Content-Type"
            java.lang.String r3 = "application/x-www-form-urlencoded"
            r1.addRequestProperty(r0, r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "Accept"
            java.lang.String r3 = "application/json"
            r1.addRequestProperty(r0, r3)     // Catch:{ all -> 0x0187 }
            r0 = 1
            r1.setDoInput(r0)     // Catch:{ all -> 0x0187 }
            r1.setDoOutput(r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "event"
            android.content.SharedPreferences r0 = r11.getSharedPreferences(r0, r2)     // Catch:{ all -> 0x0187 }
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ all -> 0x0187 }
            e.h.o.e r4 = r10.m49707c(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = m49705a(r11)     // Catch:{ all -> 0x0187 }
            int r6 = r0.getInt(r12, r2)     // Catch:{ all -> 0x0187 }
            if (r6 != 0) goto L_0x007f
            r1.disconnect()     // Catch:{ all -> 0x0187 }
            monitor-exit(r10)     // Catch:{ all -> 0x0187 }
            return
        L_0x007f:
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = "uu"
            F r9 = r4.f11713a     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0187 }
            r7.put(r8, r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = "ii"
            r7.put(r8, r5)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = "app_ver"
            java.lang.String r11 = net.coocent.android.xmlparser.p461z.C9566f.m50194e(r11)     // Catch:{ all -> 0x0187 }
            r7.put(r5, r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = "evn"
            r7.put(r11, r12)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = "val"
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0187 }
            r7.put(r11, r5)     // Catch:{ all -> 0x0187 }
            java.io.OutputStream r11 = r1.getOutputStream()     // Catch:{ all -> 0x0187 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ all -> 0x0187 }
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = "UTF-8"
            r6.<init>(r11, r8)     // Catch:{ all -> 0x0187 }
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = m49706b(r7)     // Catch:{ all -> 0x0187 }
            r5.write(r6)     // Catch:{ all -> 0x0187 }
            r5.flush()     // Catch:{ all -> 0x0187 }
            r5.close()     // Catch:{ all -> 0x0187 }
            r11.close()     // Catch:{ all -> 0x0187 }
            int r11 = r1.getResponseCode()     // Catch:{ all -> 0x0187 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r11 == r5) goto L_0x00dd
            java.io.InputStream r11 = r1.getInputStream()     // Catch:{ all -> 0x0187 }
            r11.close()     // Catch:{ all -> 0x0187 }
            r1.disconnect()     // Catch:{ all -> 0x0187 }
            monitor-exit(r10)     // Catch:{ all -> 0x0187 }
            return
        L_0x00dd:
            java.io.InputStream r11 = r1.getInputStream()     // Catch:{ all -> 0x0187 }
            if (r11 == 0) goto L_0x017d
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r11, r7)     // Catch:{ all -> 0x0187 }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ all -> 0x0187 }
            r7.<init>(r6)     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            r6.<init>()     // Catch:{ all -> 0x0187 }
        L_0x00f4:
            java.lang.String r8 = r7.readLine()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fe
            r6.append(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00f4
        L_0x00fe:
            java.lang.String r7 = r6.toString()     // Catch:{ all -> 0x0187 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0114
            java.io.InputStream r11 = r1.getInputStream()     // Catch:{ all -> 0x0187 }
            r11.close()     // Catch:{ all -> 0x0187 }
            r1.disconnect()     // Catch:{ all -> 0x0187 }
            monitor-exit(r10)     // Catch:{ all -> 0x0187 }
            return
        L_0x0114:
            com.google.gson.GsonBuilder r7 = new com.google.gson.GsonBuilder     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            com.google.gson.GsonBuilder r7 = r7.serializeNulls()     // Catch:{ all -> 0x0187 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            net.coocent.android.xmlparser.widget.StringAdapter r9 = new net.coocent.android.xmlparser.widget.StringAdapter     // Catch:{ all -> 0x0187 }
            r9.<init>()     // Catch:{ all -> 0x0187 }
            com.google.gson.GsonBuilder r7 = r7.registerTypeAdapter(r8, r9)     // Catch:{ all -> 0x0187 }
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            net.coocent.android.xmlparser.widget.IntegerAdapter r9 = new net.coocent.android.xmlparser.widget.IntegerAdapter     // Catch:{ all -> 0x0187 }
            r9.<init>()     // Catch:{ all -> 0x0187 }
            com.google.gson.GsonBuilder r7 = r7.registerTypeAdapter(r8, r9)     // Catch:{ all -> 0x0187 }
            com.google.gson.Gson r7 = r7.create()     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0187 }
            net.coocent.android.xmlparser.feedback.o$b r8 = new net.coocent.android.xmlparser.feedback.o$b     // Catch:{ all -> 0x0187 }
            r8.<init>(r10)     // Catch:{ all -> 0x0187 }
            java.lang.reflect.Type r8 = r8.getType()     // Catch:{ all -> 0x0187 }
            java.lang.Object r6 = r7.fromJson((java.lang.String) r6, (java.lang.reflect.Type) r8)     // Catch:{ all -> 0x0187 }
            net.coocent.android.xmlparser.feedback.n r6 = (net.coocent.android.xmlparser.feedback.C9423n) r6     // Catch:{ all -> 0x0187 }
            if (r6 == 0) goto L_0x017a
            net.coocent.android.xmlparser.feedback.m r6 = r6.f36331a     // Catch:{ all -> 0x0187 }
            if (r6 == 0) goto L_0x017a
            int r6 = r6.f36329a     // Catch:{ all -> 0x0187 }
            if (r6 != r5) goto L_0x017a
            S r5 = r4.f11714b     // Catch:{ all -> 0x0187 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0187 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0187 }
            if (r5 == 0) goto L_0x016f
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = "uu"
            F r4 = r4.f11713a     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0187 }
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r4)     // Catch:{ all -> 0x0187 }
            r3.apply()     // Catch:{ all -> 0x0187 }
        L_0x016f:
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0187 }
            android.content.SharedPreferences$Editor r12 = r0.putInt(r12, r2)     // Catch:{ all -> 0x0187 }
            r12.apply()     // Catch:{ all -> 0x0187 }
        L_0x017a:
            r11.close()     // Catch:{ all -> 0x0187 }
        L_0x017d:
            monitor-exit(r10)     // Catch:{ all -> 0x0187 }
            r11 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r11)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0196
        L_0x0184:
            r11 = move-exception
            r0 = r1
            goto L_0x018e
        L_0x0187:
            r11 = move-exception
            r0 = r1
            goto L_0x018b
        L_0x018a:
            r11 = move-exception
        L_0x018b:
            monitor-exit(r10)     // Catch:{ all -> 0x018a }
            throw r11     // Catch:{ Exception -> 0x018d }
        L_0x018d:
            r11 = move-exception
        L_0x018e:
            r11.printStackTrace()
            if (r0 == 0) goto L_0x0196
            r0.disconnect()
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.feedback.C9424o.mo32539g(android.content.Context, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[Catch:{ Exception -> 0x0194 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ce A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d9 A[Catch:{ Exception -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo32540i(android.content.Context r11, android.content.SharedPreferences r12) {
        /*
            r10 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "uu"
            r2 = 0
            android.content.Context r3 = r11.getApplicationContext()     // Catch:{ Exception -> 0x0194 }
            boolean r3 = r3 instanceof android.app.Application     // Catch:{ Exception -> 0x0194 }
            r4 = 0
            if (r3 == 0) goto L_0x001f
            android.content.Context r3 = r11.getApplicationContext()     // Catch:{ Exception -> 0x0194 }
            android.app.Application r3 = (android.app.Application) r3     // Catch:{ Exception -> 0x0194 }
            boolean r5 = r3 instanceof net.coocent.android.xmlparser.application.AbstractApplication     // Catch:{ Exception -> 0x0194 }
            if (r5 == 0) goto L_0x001f
            net.coocent.android.xmlparser.application.AbstractApplication r3 = (net.coocent.android.xmlparser.application.AbstractApplication) r3     // Catch:{ Exception -> 0x0194 }
            boolean r3 = r3.mo26944f()     // Catch:{ Exception -> 0x0194 }
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0194 }
            r5.<init>()     // Catch:{ Exception -> 0x0194 }
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = "https://files.coocent.net/"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "https://pro.coocent.net/"
        L_0x002c:
            r5.append(r3)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r3 = "rc2/ver"
            r5.append(r3)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0194 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0194 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x0194 }
            java.net.URLConnection r3 = r5.openConnection()     // Catch:{ Exception -> 0x0194 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0194 }
            java.lang.String r2 = "POST"
            r3.setRequestMethod(r2)     // Catch:{ Exception -> 0x0191 }
            r2 = 5000(0x1388, float:7.006E-42)
            r3.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0191 }
            r3.setReadTimeout(r2)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r2 = "Content-Type"
            java.lang.String r5 = "application/x-www-form-urlencoded"
            r3.addRequestProperty(r2, r5)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r2 = "Accept"
            java.lang.String r5 = "application/json"
            r3.addRequestProperty(r2, r5)     // Catch:{ Exception -> 0x0191 }
            r2 = 1
            r3.setDoInput(r2)     // Catch:{ Exception -> 0x0191 }
            r3.setDoOutput(r2)     // Catch:{ Exception -> 0x0191 }
            e.h.o.e r5 = r10.m49707c(r12)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r6 = m49705a(r11)     // Catch:{ Exception -> 0x0191 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ Exception -> 0x0191 }
            r7.<init>()     // Catch:{ Exception -> 0x0191 }
            F r8 = r5.f11713a     // Catch:{ Exception -> 0x0191 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0191 }
            r7.put(r1, r8)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r8 = "aa"
            S r9 = r5.f11714b     // Catch:{ Exception -> 0x0191 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x0191 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x0191 }
            if (r9 == 0) goto L_0x0088
            java.lang.String r9 = "1"
            goto L_0x008a
        L_0x0088:
            java.lang.String r9 = "0"
        L_0x008a:
            r7.put(r8, r9)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r8 = "ii"
            r7.put(r8, r6)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r6 = "rr"
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0191 }
            r7.put(r6, r8)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r6 = "app_ver"
            java.lang.String r11 = net.coocent.android.xmlparser.p461z.C9566f.m50194e(r11)     // Catch:{ Exception -> 0x0191 }
            r7.put(r6, r11)     // Catch:{ Exception -> 0x0191 }
            java.io.OutputStream r11 = r3.getOutputStream()     // Catch:{ Exception -> 0x0191 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0191 }
            java.io.OutputStreamWriter r8 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0191 }
            r8.<init>(r11, r0)     // Catch:{ Exception -> 0x0191 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r7 = m49706b(r7)     // Catch:{ Exception -> 0x0191 }
            r6.write(r7)     // Catch:{ Exception -> 0x0191 }
            r6.flush()     // Catch:{ Exception -> 0x0191 }
            r6.close()     // Catch:{ Exception -> 0x0191 }
            r11.close()     // Catch:{ Exception -> 0x0191 }
            int r11 = r3.getResponseCode()     // Catch:{ Exception -> 0x0191 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r11 == r6) goto L_0x00d9
            java.io.InputStream r11 = r3.getInputStream()     // Catch:{ Exception -> 0x0191 }
            r11.close()     // Catch:{ Exception -> 0x0191 }
            r3.disconnect()     // Catch:{ Exception -> 0x0191 }
            return
        L_0x00d9:
            java.io.InputStream r11 = r3.getInputStream()     // Catch:{ Exception -> 0x0191 }
            if (r11 == 0) goto L_0x018d
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0191 }
            r7.<init>(r11, r0)     // Catch:{ Exception -> 0x0191 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0191 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x0191 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0191 }
            r7.<init>()     // Catch:{ Exception -> 0x0191 }
        L_0x00ee:
            java.lang.String r8 = r0.readLine()     // Catch:{ Exception -> 0x0191 }
            if (r8 == 0) goto L_0x00f8
            r7.append(r8)     // Catch:{ Exception -> 0x0191 }
            goto L_0x00ee
        L_0x00f8:
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0191 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x010d
            java.io.InputStream r11 = r3.getInputStream()     // Catch:{ Exception -> 0x0191 }
            r11.close()     // Catch:{ Exception -> 0x0191 }
            r3.disconnect()     // Catch:{ Exception -> 0x0191 }
            return
        L_0x010d:
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder     // Catch:{ Exception -> 0x0191 }
            r0.<init>()     // Catch:{ Exception -> 0x0191 }
            com.google.gson.GsonBuilder r0 = r0.serializeNulls()     // Catch:{ Exception -> 0x0191 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            net.coocent.android.xmlparser.widget.StringAdapter r9 = new net.coocent.android.xmlparser.widget.StringAdapter     // Catch:{ Exception -> 0x0191 }
            r9.<init>()     // Catch:{ Exception -> 0x0191 }
            com.google.gson.GsonBuilder r0 = r0.registerTypeAdapter(r8, r9)     // Catch:{ Exception -> 0x0191 }
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            net.coocent.android.xmlparser.widget.IntegerAdapter r9 = new net.coocent.android.xmlparser.widget.IntegerAdapter     // Catch:{ Exception -> 0x0191 }
            r9.<init>()     // Catch:{ Exception -> 0x0191 }
            com.google.gson.GsonBuilder r0 = r0.registerTypeAdapter(r8, r9)     // Catch:{ Exception -> 0x0191 }
            com.google.gson.Gson r0 = r0.create()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0191 }
            net.coocent.android.xmlparser.feedback.o$a r8 = new net.coocent.android.xmlparser.feedback.o$a     // Catch:{ Exception -> 0x0191 }
            r8.<init>(r10)     // Catch:{ Exception -> 0x0191 }
            java.lang.reflect.Type r8 = r8.getType()     // Catch:{ Exception -> 0x0191 }
            java.lang.Object r0 = r0.fromJson((java.lang.String) r7, (java.lang.reflect.Type) r8)     // Catch:{ Exception -> 0x0191 }
            net.coocent.android.xmlparser.feedback.p r0 = (net.coocent.android.xmlparser.feedback.C9428p) r0     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x018a
            net.coocent.android.xmlparser.feedback.m r0 = r0.f36336a     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x018a
            int r0 = r0.f36329a     // Catch:{ Exception -> 0x0191 }
            if (r0 != r6) goto L_0x018a
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch:{ Exception -> 0x0191 }
            S r0 = r5.f11714b     // Catch:{ Exception -> 0x0191 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x0191 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0162
            F r0 = r5.f11713a     // Catch:{ Exception -> 0x0191 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0191 }
            r12.putString(r1, r0)     // Catch:{ Exception -> 0x0191 }
        L_0x0162:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0191 }
            r1 = 13
            r0.set(r1, r4)     // Catch:{ Exception -> 0x0191 }
            r1 = 12
            r0.set(r1, r4)     // Catch:{ Exception -> 0x0191 }
            r1 = 11
            r0.set(r1, r4)     // Catch:{ Exception -> 0x0191 }
            r1 = 14
            r0.set(r1, r4)     // Catch:{ Exception -> 0x0191 }
            r1 = 5
            r0.add(r1, r2)     // Catch:{ Exception -> 0x0191 }
            long r0 = r0.getTimeInMillis()     // Catch:{ Exception -> 0x0191 }
            java.lang.String r2 = "tomorrow_time"
            r12.putLong(r2, r0)     // Catch:{ Exception -> 0x0191 }
            r12.apply()     // Catch:{ Exception -> 0x0191 }
        L_0x018a:
            r11.close()     // Catch:{ Exception -> 0x0191 }
        L_0x018d:
            r3.disconnect()     // Catch:{ Exception -> 0x0191 }
            goto L_0x019d
        L_0x0191:
            r11 = move-exception
            r2 = r3
            goto L_0x0195
        L_0x0194:
            r11 = move-exception
        L_0x0195:
            r11.printStackTrace()
            if (r2 == 0) goto L_0x019d
            r2.disconnect()
        L_0x019d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.coocent.android.xmlparser.feedback.C9424o.mo32540i(android.content.Context, android.content.SharedPreferences):void");
    }

    /* renamed from: j */
    private void m49711j(Context context, String str) {
        this.f36332a.mo32543a().execute(new C9407g(this, context, str));
    }

    /* renamed from: k */
    public void mo32541k(Context context, String str, C3699e<String, String> eVar) {
        this.f36332a.mo32545c().execute(new C9408h(this, eVar, context, str));
    }

    /* renamed from: l */
    public void mo32542l(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (System.currentTimeMillis() >= defaultSharedPreferences.getLong("tomorrow_time", 0)) {
            this.f36332a.mo32544b().execute(new C9406f(this, context, defaultSharedPreferences));
        }
    }
}
