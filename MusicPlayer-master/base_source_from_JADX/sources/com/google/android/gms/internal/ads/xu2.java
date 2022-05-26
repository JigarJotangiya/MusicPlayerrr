package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.Iterator;
import java.util.regex.Pattern;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xu2 {

    /* renamed from: a */
    private final Context f26070a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f26071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f26072c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f26073d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f26074e = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f26075f = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f26076g = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f26077h = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f26078i = BuildConfig.FLAVOR;

    /* renamed from: j */
    private boolean f26079j = false;

    /* renamed from: k */
    private boolean f26080k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f26081l = 2;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26082m = 2;

    private xu2(Context context, int i) {
        this.f26070a = context;
    }

    /* renamed from: p */
    public static xu2 m33823p(Context context, int i, int i2, zzbfd zzbfd) {
        xu2 xu2 = zu2.m34798b() ? new xu2(context, 7) : null;
        if (xu2 == null) {
            return null;
        }
        xu2.mo22077h();
        xu2.mo22079q(i2);
        String str = zzbfd.f27210v;
        if (!TextUtils.isEmpty(str)) {
            if (Pattern.matches((String) C5054ev.m23225c().mo20153b(C5503qz.f22394O5), str)) {
                xu2.mo22075f(zzbfd.f27210v);
            }
        }
        return xu2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.xu2 mo22072c(com.google.android.gms.internal.ads.zzbew r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f27190k     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.x71 r3 = (com.google.android.gms.internal.ads.x71) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.mo21983e()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.f26074e = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.mo18760c()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.f26075f = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xu2.mo22072c(com.google.android.gms.internal.ads.zzbew):com.google.android.gms.internal.ads.xu2");
    }

    /* renamed from: d */
    public final synchronized xu2 mo22073d(mp2 mp2) {
        if (!TextUtils.isEmpty(mp2.f20121b.f16050b)) {
            this.f26074e = mp2.f20121b.f16050b;
        }
        Iterator<bp2> it = mp2.f20120a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bp2 next = it.next();
            if (!TextUtils.isEmpty(next.f14633Y)) {
                this.f26075f = next.f14633Y;
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public final synchronized xu2 mo22074e(String str) {
        this.f26076g = str;
        return this;
    }

    /* renamed from: f */
    public final synchronized xu2 mo22075f(String str) {
        this.f26078i = str;
        return this;
    }

    /* renamed from: g */
    public final synchronized xu2 mo22076g(boolean z) {
        this.f26072c = z;
        return this;
    }

    /* renamed from: h */
    public final synchronized xu2 mo22077h() {
        C2971s.m13214q();
        this.f26073d = C2979b2.m13249c(this.f26070a);
        Resources resources = this.f26070a.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.f26082m = i;
        this.f26071b = C2971s.m13198a().mo11988a();
        this.f26080k = true;
        return this;
    }

    /* renamed from: i */
    public final synchronized yu2 mo22078i() {
        if (this.f26079j) {
            return null;
        }
        this.f26079j = true;
        if (!this.f26080k) {
            mo22077h();
        }
        return new yu2(this);
    }

    /* renamed from: q */
    public final synchronized xu2 mo22079q(int i) {
        this.f26081l = i;
        return this;
    }
}
