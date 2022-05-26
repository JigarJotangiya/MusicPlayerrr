package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C3024o1;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gl0 {

    /* renamed from: a */
    long f17174a = -1;

    /* renamed from: b */
    long f17175b = -1;

    /* renamed from: c */
    int f17176c = -1;

    /* renamed from: d */
    int f17177d = -1;

    /* renamed from: e */
    long f17178e = 0;

    /* renamed from: f */
    private final Object f17179f = new Object();

    /* renamed from: g */
    final String f17180g;

    /* renamed from: h */
    private final C3024o1 f17181h;

    /* renamed from: i */
    int f17182i = 0;

    /* renamed from: j */
    int f17183j = 0;

    public gl0(String str, C3024o1 o1Var) {
        this.f17180g = str;
        this.f17181h = o1Var;
    }

    /* renamed from: g */
    private final void m24421g() {
        if (l10.f19143a.mo20989e().booleanValue()) {
            synchronized (this.f17179f) {
                this.f17176c--;
                this.f17177d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo17966a(Context context, String str) {
        Bundle bundle;
        String str2;
        synchronized (this.f17179f) {
            bundle = new Bundle();
            if (this.f17181h.mo11065E()) {
                str2 = BuildConfig.FLAVOR;
            } else {
                str2 = this.f17180g;
            }
            bundle.putString("session_id", str2);
            bundle.putLong("basets", this.f17175b);
            bundle.putLong("currts", this.f17174a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f17176c);
            bundle.putInt("preqs_in_session", this.f17177d);
            bundle.putLong("time_in_session", this.f17178e);
            bundle.putInt("pclick", this.f17182i);
            bundle.putInt("pimp", this.f17183j);
            Context a = dh0.m22514a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                ul0.m31861f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        ul0.m31861f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    ul0.m31862g("Fail to fetch AdActivity theme");
                    ul0.m31861f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo17967b() {
        synchronized (this.f17179f) {
            this.f17182i++;
        }
    }

    /* renamed from: c */
    public final void mo17968c() {
        synchronized (this.f17179f) {
            this.f17183j++;
        }
    }

    /* renamed from: d */
    public final void mo17969d() {
        m24421g();
    }

    /* renamed from: e */
    public final void mo17970e() {
        m24421g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17971f(com.google.android.gms.internal.ads.zzbfd r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f17179f
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.o1 r1 = r10.f17181h     // Catch:{ all -> 0x0074 }
            long r1 = r1.mo11084b()     // Catch:{ all -> 0x0074 }
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()     // Catch:{ all -> 0x0074 }
            long r3 = r3.mo11988a()     // Catch:{ all -> 0x0074 }
            long r5 = r10.f17175b     // Catch:{ all -> 0x0074 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.iz<java.lang.Long> r5 = com.google.android.gms.internal.ads.C5503qz.f22283A0     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.ads.oz r6 = com.google.android.gms.internal.ads.C5054ev.m23225c()     // Catch:{ all -> 0x0074 }
            java.lang.Object r5 = r6.mo20153b(r5)     // Catch:{ all -> 0x0074 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0074 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0074 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f17177d = r1     // Catch:{ all -> 0x0074 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.o1 r1 = r10.f17181h     // Catch:{ all -> 0x0074 }
            int r1 = r1.mo11082a()     // Catch:{ all -> 0x0074 }
            r10.f17177d = r1     // Catch:{ all -> 0x0074 }
        L_0x003b:
            r10.f17175b = r12     // Catch:{ all -> 0x0074 }
            r10.f17174a = r12     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x0040:
            r10.f17174a = r12     // Catch:{ all -> 0x0074 }
        L_0x0042:
            android.os.Bundle r11 = r11.f27197i     // Catch:{ all -> 0x0074 }
            r12 = 1
            if (r11 == 0) goto L_0x0053
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0074 }
            if (r11 == r12) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0053:
            int r11 = r10.f17176c     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f17176c = r11     // Catch:{ all -> 0x0074 }
            int r11 = r10.f17177d     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f17177d = r11     // Catch:{ all -> 0x0074 }
            if (r11 != 0) goto L_0x0069
            r11 = 0
            r10.f17178e = r11     // Catch:{ all -> 0x0074 }
            com.google.android.gms.ads.internal.util.o1 r11 = r10.f17181h     // Catch:{ all -> 0x0074 }
            r11.mo11069N(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x0069:
            com.google.android.gms.ads.internal.util.o1 r11 = r10.f17181h     // Catch:{ all -> 0x0074 }
            long r11 = r11.mo11092f()     // Catch:{ all -> 0x0074 }
            long r3 = r3 - r11
            r10.f17178e = r3     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gl0.mo17971f(com.google.android.gms.internal.ads.zzbfd, long):void");
    }
}
