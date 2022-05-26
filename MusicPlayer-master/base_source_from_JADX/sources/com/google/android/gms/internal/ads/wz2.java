package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.C3364i;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class wz2 {

    /* renamed from: f */
    private static final Object f25600f = new Object();

    /* renamed from: a */
    private final Context f25601a;

    /* renamed from: b */
    private final SharedPreferences f25602b;

    /* renamed from: c */
    private final String f25603c;

    /* renamed from: d */
    private final hz2 f25604d;

    /* renamed from: e */
    private boolean f25605e = false;

    public wz2(Context context, int i, hz2 hz2, boolean z) {
        this.f25601a = context;
        this.f25603c = Integer.toString(i - 1);
        this.f25602b = context.getSharedPreferences("pcvmspf", 0);
        this.f25604d = hz2;
        this.f25605e = z;
    }

    /* renamed from: e */
    private final File m33485e(String str) {
        return new File(new File(this.f25601a.getDir("pccache", 0), this.f25603c), str);
    }

    /* renamed from: f */
    private static String m33486f(C5296ld ldVar) {
        C5370nd G = C5407od.m28425G();
        G.mo19706v(ldVar.mo19141F().mo19963M());
        G.mo19702r(ldVar.mo19141F().mo19962L());
        G.mo19703s(ldVar.mo19141F().mo19959D());
        G.mo19705u(ldVar.mo19141F().mo19961F());
        G.mo19704t(ldVar.mo19141F().mo19960E());
        return C3364i.m14460a(((C5407od) G.mo19761n()).mo21560b().zzE());
    }

    /* renamed from: g */
    private final String m33487g() {
        String valueOf = String.valueOf(this.f25603c);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    /* renamed from: h */
    private final String m33488h() {
        String valueOf = String.valueOf(this.f25603c);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    /* renamed from: i */
    private final void m33489i(int i, long j) {
        hz2 hz2 = this.f25604d;
        if (hz2 != null) {
            hz2.mo10838b(i, j);
        }
    }

    /* renamed from: j */
    private final void m33490j(int i, long j, String str) {
        hz2 hz2 = this.f25604d;
        if (hz2 != null) {
            hz2.mo10837a(i, j, str);
        }
    }

    /* renamed from: k */
    private final C5407od m33491k(int i) {
        String str;
        cm3 cm3;
        if (i == 1) {
            str = this.f25602b.getString(m33488h(), (String) null);
        } else {
            str = this.f25602b.getString(m33487g(), (String) null);
        }
        if (str == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            kl3 zzv = kl3.zzv(C3364i.m14461b(str));
            if (this.f25605e) {
                cm3 = cm3.m21985a();
            } else {
                cm3 = cm3.m21986b();
            }
            return C5407od.m28429K(zzv, cm3);
        } catch (bn3 unused) {
            return null;
        } catch (NullPointerException unused2) {
            m33489i(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            m33489i(2032, currentTimeMillis);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        return r7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21943a(com.google.android.gms.internal.ads.C5296ld r7) {
        /*
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = f25600f
            monitor-enter(r2)
            com.google.android.gms.internal.ads.od r3 = r7.mo19141F()     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = r3.mo19963M()     // Catch:{ all -> 0x0054 }
            java.io.File r3 = r6.m33485e(r3)     // Catch:{ all -> 0x0054 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r5 = "pcbc"
            r4.<init>(r3, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.gms.internal.ads.kl3 r3 = r7.mo19142G()     // Catch:{ all -> 0x0054 }
            byte[] r3 = r3.zzE()     // Catch:{ all -> 0x0054 }
            boolean r3 = com.google.android.gms.internal.ads.rz2.m30475e(r4, r3)     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x0030
            r7 = 4020(0xfb4, float:5.633E-42)
            r6.m33489i(r7, r0)     // Catch:{ all -> 0x0054 }
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            r7 = 0
            return r7
        L_0x0030:
            java.lang.String r7 = m33486f(r7)     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences r3 = r6.f25602b     // Catch:{ all -> 0x0054 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r6.m33488h()     // Catch:{ all -> 0x0054 }
            r3.putString(r4, r7)     // Catch:{ all -> 0x0054 }
            boolean r7 = r3.commit()     // Catch:{ all -> 0x0054 }
            if (r7 == 0) goto L_0x004d
            r3 = 5015(0x1397, float:7.028E-42)
            r6.m33489i(r3, r0)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x004d:
            r3 = 4021(0xfb5, float:5.635E-42)
            r6.m33489i(r3, r0)     // Catch:{ all -> 0x0054 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            return r7
        L_0x0054:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0054 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wz2.mo21943a(com.google.android.gms.internal.ads.ld):boolean");
    }

    /* renamed from: b */
    public final boolean mo21944b(C5296ld ldVar, vz2 vz2) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25600f) {
            C5407od k = m33491k(1);
            String M = ldVar.mo19141F().mo19963M();
            if (k == null || !k.mo19963M().equals(M)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File e = m33485e(M);
                if (e.exists()) {
                    String str2 = "1";
                    if (true != e.isDirectory()) {
                        str2 = "0";
                    }
                    String str3 = "1";
                    if (true != e.isFile()) {
                        str3 = "0";
                    }
                    StringBuilder sb = new StringBuilder(str2.length() + 5 + str3.length());
                    sb.append("d:");
                    sb.append(str2);
                    sb.append(",f:");
                    sb.append(str3);
                    m33490j(4023, currentTimeMillis2, sb.toString());
                    m33489i(4015, currentTimeMillis2);
                } else if (!e.mkdirs()) {
                    String str4 = "1";
                    if (true != e.canWrite()) {
                        str4 = "0";
                    }
                    if (str4.length() != 0) {
                        str = "cw:".concat(str4);
                    } else {
                        str = new String("cw:");
                    }
                    m33490j(4024, currentTimeMillis2, str);
                    m33489i(4015, currentTimeMillis2);
                    return false;
                }
                File e2 = m33485e(M);
                File file = new File(e2, "pcam.jar");
                File file2 = new File(e2, "pcbc");
                if (!rz2.m30475e(file, ldVar.mo19143H().zzE())) {
                    m33489i(4016, currentTimeMillis);
                    return false;
                } else if (!rz2.m30475e(file2, ldVar.mo19142G().zzE())) {
                    m33489i(4017, currentTimeMillis);
                    return false;
                } else if (vz2 == null || vz2.mo19933a(file)) {
                    String f = m33486f(ldVar);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    String string = this.f25602b.getString(m33488h(), (String) null);
                    SharedPreferences.Editor edit = this.f25602b.edit();
                    edit.putString(m33488h(), f);
                    if (string != null) {
                        edit.putString(m33487g(), string);
                    }
                    if (!edit.commit()) {
                        m33489i(4019, currentTimeMillis3);
                        return false;
                    }
                    HashSet hashSet = new HashSet();
                    C5407od k2 = m33491k(1);
                    if (k2 != null) {
                        hashSet.add(k2.mo19963M());
                    }
                    C5407od k3 = m33491k(2);
                    if (k3 != null) {
                        hashSet.add(k3.mo19963M());
                    }
                    for (File file3 : new File(this.f25601a.getDir("pccache", 0), this.f25603c).listFiles()) {
                        if (!hashSet.contains(file3.getName())) {
                            rz2.m30474d(file3);
                        }
                    }
                    m33489i(5014, currentTimeMillis);
                    return true;
                } else {
                    m33489i(4018, currentTimeMillis);
                    rz2.m30474d(e2);
                    return false;
                }
            } else {
                m33489i(4014, currentTimeMillis);
                return false;
            }
        }
    }

    /* renamed from: c */
    public final pz2 mo21945c(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25600f) {
            C5407od k = m33491k(1);
            if (k == null) {
                m33489i(4022, currentTimeMillis);
                return null;
            }
            File e = m33485e(k.mo19963M());
            File file = new File(e, "pcam.jar");
            if (!file.exists()) {
                file = new File(e, "pcam");
            }
            File file2 = new File(e, "pcbc");
            File file3 = new File(e, "pcopt");
            m33489i(5016, currentTimeMillis);
            pz2 pz2 = new pz2(k, file, file2, file3);
            return pz2;
        }
    }

    /* renamed from: d */
    public final boolean mo21946d(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (f25600f) {
            C5407od k = m33491k(1);
            if (k == null) {
                m33489i(4025, currentTimeMillis);
                return false;
            }
            File e = m33485e(k.mo19963M());
            if (!new File(e, "pcam.jar").exists()) {
                m33489i(4026, currentTimeMillis);
                return false;
            } else if (!new File(e, "pcbc").exists()) {
                m33489i(4027, currentTimeMillis);
                return false;
            } else {
                m33489i(5019, currentTimeMillis);
                return true;
            }
        }
    }
}
