package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3369n;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sg0 {

    /* renamed from: A */
    private int f23441A;

    /* renamed from: B */
    private final String f23442B;

    /* renamed from: C */
    private boolean f23443C;

    /* renamed from: a */
    private int f23444a;

    /* renamed from: b */
    private boolean f23445b;

    /* renamed from: c */
    private boolean f23446c;

    /* renamed from: d */
    private int f23447d;

    /* renamed from: e */
    private int f23448e;

    /* renamed from: f */
    private int f23449f;

    /* renamed from: g */
    private String f23450g;

    /* renamed from: h */
    private int f23451h;

    /* renamed from: i */
    private int f23452i;

    /* renamed from: j */
    private int f23453j;

    /* renamed from: k */
    private boolean f23454k;

    /* renamed from: l */
    private int f23455l;

    /* renamed from: m */
    private double f23456m;

    /* renamed from: n */
    private boolean f23457n;

    /* renamed from: o */
    private String f23458o;

    /* renamed from: p */
    private String f23459p;

    /* renamed from: q */
    private final boolean f23460q;

    /* renamed from: r */
    private final boolean f23461r;

    /* renamed from: s */
    private final String f23462s;

    /* renamed from: t */
    private final boolean f23463t;

    /* renamed from: u */
    private final boolean f23464u;

    /* renamed from: v */
    private final boolean f23465v;

    /* renamed from: w */
    private final String f23466w;

    /* renamed from: x */
    private final String f23467x;

    /* renamed from: y */
    private float f23468y;

    /* renamed from: z */
    private int f23469z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[Catch:{ Exception -> 0x00c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public sg0(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            r6.m30700c(r7)
            r6.m30702e(r7)
            r6.m30701d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = m30699b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r6.f23460q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = m30699b(r0, r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            r6.f23461r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f23462s = r2
            com.google.android.gms.ads.internal.C2971s.m13214q()
            com.google.android.gms.internal.ads.C4980cv.m22123b()
            boolean r2 = com.google.android.gms.internal.ads.nl0.m27921m()
            r6.f23463t = r2
            boolean r2 = com.google.android.gms.common.util.C3363h.m14453c(r7)
            r6.f23464u = r2
            boolean r2 = com.google.android.gms.common.util.C3363h.m14454d(r7)
            r6.f23465v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f23466w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = m30699b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x0060
        L_0x005e:
            r0 = r2
            goto L_0x0091
        L_0x0060:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0065
            goto L_0x005e
        L_0x0065:
            com.google.android.gms.common.l.b r3 = com.google.android.gms.common.p078l.C3334c.m14368a(r7)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            android.content.pm.PackageInfo r3 = r3.mo11913f(r5, r4)     // Catch:{ NameNotFoundException -> 0x005e }
            if (r3 == 0) goto L_0x005e
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4.length()     // Catch:{ NameNotFoundException -> 0x005e }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x005e }
            r5.<init>(r4)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r3)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r1)     // Catch:{ NameNotFoundException -> 0x005e }
            r5.append(r0)     // Catch:{ NameNotFoundException -> 0x005e }
            java.lang.String r0 = r5.toString()     // Catch:{ NameNotFoundException -> 0x005e }
        L_0x0091:
            r6.f23467x = r0
            com.google.android.gms.common.l.b r0 = com.google.android.gms.common.p078l.C3334c.m14368a(r7)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.mo11913f(r3, r4)     // Catch:{ Exception -> 0x00c2 }
            if (r0 == 0) goto L_0x00c3
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c2 }
            int r4 = r4 + 12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c2 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r3)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r1)     // Catch:{ Exception -> 0x00c2 }
            r5.append(r0)     // Catch:{ Exception -> 0x00c2 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x00c2 }
            goto L_0x00c3
        L_0x00c2:
        L_0x00c3:
            r6.f23442B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00cc
            return
        L_0x00cc:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00d3
            return
        L_0x00d3:
            float r0 = r7.density
            r6.f23468y = r0
            int r0 = r7.widthPixels
            r6.f23469z = r0
            int r7 = r7.heightPixels
            r6.f23441A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sg0.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    private static ResolveInfo m30699b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C2971s.m13213p().mo17571s(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m30700c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f23444a = audioManager.getMode();
                this.f23445b = audioManager.isMusicActive();
                this.f23446c = audioManager.isSpeakerphoneOn();
                this.f23447d = audioManager.getStreamVolume(3);
                this.f23448e = audioManager.getRingerMode();
                this.f23449f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C2971s.m13213p().mo17571s(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f23444a = -2;
        this.f23445b = false;
        this.f23446c = false;
        this.f23447d = 0;
        this.f23448e = 2;
        this.f23449f = 0;
    }

    /* renamed from: d */
    private final void m30701d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f23456m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f23457n = z;
            return;
        }
        this.f23456m = -1.0d;
        this.f23457n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    @android.annotation.TargetApi(16)
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30702e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f23450g = r2
            boolean r2 = com.google.android.gms.common.util.C3369n.m14479k()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.C5503qz.f22312D5
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r2 = r4.mo20153b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f23452i = r2
            int r0 = r0.getPhoneType()
            r5.f23453j = r0
            r0 = -2
            r5.f23451h = r0
            r5.f23454k = r3
            r0 = -1
            r5.f23455l = r0
            com.google.android.gms.ads.internal.C2971s.m13214q()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.C2979b2.m13255f(r6, r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f23451h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f23455l = r6
            goto L_0x0069
        L_0x0067:
            r5.f23451h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f23454k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sg0.m30702e(android.content.Context):void");
    }

    /* renamed from: a */
    public final tg0 mo20844a() {
        return new tg0(this.f23444a, this.f23460q, this.f23461r, this.f23450g, this.f23462s, this.f23463t, this.f23464u, this.f23465v, this.f23445b, this.f23446c, this.f23466w, this.f23467x, this.f23442B, this.f23447d, this.f23451h, this.f23452i, this.f23453j, this.f23448e, this.f23449f, this.f23468y, this.f23469z, this.f23441A, this.f23456m, this.f23457n, this.f23454k, this.f23455l, this.f23458o, this.f23443C, this.f23459p);
    }

    public sg0(Context context, tg0 tg0) {
        m30700c(context);
        m30702e(context);
        m30701d(context);
        this.f23458o = Build.FINGERPRINT;
        this.f23459p = Build.DEVICE;
        boolean z = false;
        if (C3369n.m14469a() && p00.m28808g(context)) {
            z = true;
        }
        this.f23443C = z;
        this.f23460q = tg0.f23852a;
        this.f23461r = tg0.f23853b;
        this.f23462s = tg0.f23854c;
        this.f23463t = tg0.f23855d;
        this.f23464u = tg0.f23856e;
        this.f23465v = tg0.f23857f;
        this.f23466w = tg0.f23858g;
        this.f23467x = tg0.f23859h;
        this.f23442B = tg0.f23860i;
        this.f23468y = tg0.f23863l;
        this.f23469z = tg0.f23864m;
        this.f23441A = tg0.f23865n;
    }
}
