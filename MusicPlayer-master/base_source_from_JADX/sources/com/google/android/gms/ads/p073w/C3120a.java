package com.google.android.gms.ads.p073w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C3145a;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.C3238d;
import com.google.android.gms.common.C3243e;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.stats.C3352a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p159f.p243f.p245b.p246a.p293c.p294a.C7418d;
import p159f.p243f.p245b.p246a.p293c.p294a.C7419e;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.w.a */
public class C3120a {

    /* renamed from: a */
    private C3145a f10217a;

    /* renamed from: b */
    private C7418d f10218b;

    /* renamed from: c */
    private boolean f10219c;

    /* renamed from: d */
    private final Object f10220d;

    /* renamed from: e */
    private C3122b f10221e;

    /* renamed from: f */
    private final Context f10222f;

    /* renamed from: g */
    private final boolean f10223g;

    /* renamed from: h */
    private final long f10224h;

    /* renamed from: com.google.android.gms.ads.w.a$a */
    public static final class C3121a {

        /* renamed from: a */
        private final String f10225a;

        /* renamed from: b */
        private final boolean f10226b;

        public C3121a(String str, boolean z) {
            this.f10225a = str;
            this.f10226b = z;
        }

        /* renamed from: a */
        public final String mo11379a() {
            return this.f10225a;
        }

        /* renamed from: b */
        public final boolean mo11380b() {
            return this.f10226b;
        }

        public final String toString() {
            String str = this.f10225a;
            boolean z = this.f10226b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.w.a$b */
    static class C3122b extends Thread {

        /* renamed from: g */
        private WeakReference<C3120a> f10227g;

        /* renamed from: h */
        private long f10228h;

        /* renamed from: i */
        CountDownLatch f10229i = new CountDownLatch(1);

        /* renamed from: j */
        boolean f10230j = false;

        public C3122b(C3120a aVar, long j) {
            this.f10227g = new WeakReference<>(aVar);
            this.f10228h = j;
            start();
        }

        /* renamed from: a */
        private final void m13705a() {
            C3120a aVar = (C3120a) this.f10227g.get();
            if (aVar != null) {
                aVar.mo11375a();
                this.f10230j = true;
            }
        }

        public final void run() {
            try {
                if (!this.f10229i.await(this.f10228h, TimeUnit.MILLISECONDS)) {
                    m13705a();
                }
            } catch (InterruptedException unused) {
                m13705a();
            }
        }
    }

    public C3120a(Context context) {
        this(context, 30000, false, false);
    }

    private C3120a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.f10220d = new Object();
        C3292l.m14240h(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f10222f = context;
        this.f10219c = false;
        this.f10224h = j;
        this.f10223g = z2;
    }

    /* renamed from: b */
    public static C3121a m13692b(Context context) throws IOException, IllegalStateException, C3238d, C3243e {
        C3124c cVar = new C3124c(context);
        boolean a = cVar.mo11384a("gads:ad_id_app_context:enabled", false);
        float b = cVar.mo11385b("gads:ad_id_app_context:ping_ratio", 0.0f);
        String c = cVar.mo11386c("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        C3120a aVar = new C3120a(context, -1, a, cVar.mo11384a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m13697i(false);
            C3121a c2 = aVar.mo11376c();
            aVar.m13698j(c2, a, b, SystemClock.elapsedRealtime() - elapsedRealtime, c, (Throwable) null);
            aVar.mo11375a();
            return c2;
        } catch (Throwable th) {
            aVar.mo11375a();
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m13693d(Context context) throws IOException, C3238d, C3243e {
        C3124c cVar = new C3124c(context);
        C3120a aVar = new C3120a(context, -1, cVar.mo11384a("gads:ad_id_app_context:enabled", false), cVar.mo11384a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.m13697i(false);
            return aVar.m13699k();
        } finally {
            aVar.mo11375a();
        }
    }

    /* renamed from: f */
    private static C3145a m13694f(Context context, boolean z) throws IOException, C3238d, C3243e {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int h = C3237c.m14031f().mo11680h(context, C3245g.f10501a);
            if (h == 0 || h == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C3145a aVar = new C3145a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C3352a.m14414b().mo11980a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new C3238d(9);
        }
    }

    /* renamed from: g */
    private static C7418d m13695g(Context context, C3145a aVar) throws IOException {
        try {
            return C7419e.m41792z(aVar.mo11470a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13696h() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f10220d
            monitor-enter(r0)
            com.google.android.gms.ads.w.a$b r1 = r6.f10221e     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f10229i     // Catch:{ all -> 0x0024 }
            r1.countDown()     // Catch:{ all -> 0x0024 }
            com.google.android.gms.ads.w.a$b r1 = r6.f10221e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f10224h     // Catch:{ all -> 0x0024 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0022
            com.google.android.gms.ads.w.a$b r1 = new com.google.android.gms.ads.w.a$b     // Catch:{ all -> 0x0024 }
            long r2 = r6.f10224h     // Catch:{ all -> 0x0024 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0024 }
            r6.f10221e = r1     // Catch:{ all -> 0x0024 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0024 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p073w.C3120a.m13696h():void");
    }

    /* renamed from: i */
    private final void m13697i(boolean z) throws IOException, IllegalStateException, C3238d, C3243e {
        C3292l.m14239g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f10219c) {
                mo11375a();
            }
            C3145a f = m13694f(this.f10222f, this.f10223g);
            this.f10217a = f;
            this.f10218b = m13695g(this.f10222f, f);
            this.f10219c = true;
            if (z) {
                m13696h();
            }
        }
    }

    /* renamed from: j */
    private final boolean m13698j(C3121a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.mo11380b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.mo11379a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.mo11379a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C3123b(this, hashMap).start();
        return true;
    }

    /* renamed from: k */
    private final boolean m13699k() throws IOException {
        boolean b;
        C3292l.m14239g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f10219c) {
                synchronized (this.f10220d) {
                    C3122b bVar = this.f10221e;
                    if (bVar == null || !bVar.f10230j) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m13697i(false);
                    if (!this.f10219c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3292l.m14240h(this.f10217a);
            C3292l.m14240h(this.f10218b);
            b = this.f10218b.mo28282b();
        }
        m13696h();
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11375a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C3292l.m14239g(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f10222f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.a r0 = r3.f10217a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f10219c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3352a.m14414b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f10222f     // Catch:{ all -> 0x001f }
            com.google.android.gms.common.a r2 = r3.f10217a     // Catch:{ all -> 0x001f }
            r0.mo11981c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f10219c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f10218b = r0     // Catch:{ all -> 0x0033 }
            r3.f10217a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p073w.C3120a.mo11375a():void");
    }

    /* renamed from: c */
    public C3121a mo11376c() throws IOException {
        C3121a aVar;
        C3292l.m14239g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f10219c) {
                synchronized (this.f10220d) {
                    C3122b bVar = this.f10221e;
                    if (bVar == null || !bVar.f10230j) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m13697i(false);
                    if (!this.f10219c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3292l.m14240h(this.f10217a);
            C3292l.m14240h(this.f10218b);
            aVar = new C3121a(this.f10218b.mo28280D(), this.f10218b.mo28281S(true));
        }
        m13696h();
        return aVar;
    }

    /* renamed from: e */
    public void mo11377e() throws IOException, IllegalStateException, C3238d, C3243e {
        m13697i(true);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo11375a();
        super.finalize();
    }
}
