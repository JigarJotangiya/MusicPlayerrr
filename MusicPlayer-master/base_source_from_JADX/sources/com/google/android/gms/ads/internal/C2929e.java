package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.ba0;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.e93;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.q90;
import com.google.android.gms.internal.ads.s83;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.v90;
import com.google.android.gms.internal.ads.y90;
import com.google.android.gms.internal.ads.zzcjf;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.e */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2929e {

    /* renamed from: a */
    private Context f9820a;

    /* renamed from: b */
    private long f9821b = 0;

    /* renamed from: a */
    public final void mo10830a(Context context, zzcjf zzcjf, String str, Runnable runnable) {
        mo10831b(context, zzcjf, true, (al0) null, str, (String) null, runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo10831b(Context context, zzcjf zzcjf, boolean z, al0 al0, String str, String str2, Runnable runnable) {
        PackageInfo f;
        if (C2971s.m13198a().mo11989b() - this.f9821b < 5000) {
            ul0.m31862g("Not retrying to fetch app settings");
            return;
        }
        this.f9821b = C2971s.m13198a().mo11989b();
        if (al0 != null) {
            long a = al0.mo15847a();
            if (C2971s.m13198a().mo11988a() - a <= ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22603q2)).longValue() && al0.mo15855i()) {
                return;
            }
        }
        if (context == null) {
            ul0.m31862g("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.f9820a = applicationContext;
            ba0 a2 = C2971s.m13204g().mo20615a(this.f9820a, zzcjf);
            v90<JSONObject> v90 = y90.f26304b;
            q90<I, O> a3 = a2.mo16162a("google.afma.config.fetchAppSettings", v90, v90);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", C5503qz.m29788a()));
                try {
                    ApplicationInfo applicationInfo = this.f9820a.getApplicationInfo();
                    if (!(applicationInfo == null || (f = C3334c.m14368a(context).mo11913f(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", f.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    C3018m1.m13388k("Error fetching PackageInfo.");
                }
                d93<O> a4 = a3.mo17513a(jSONObject);
                C2928d dVar = C2928d.f9819a;
                e93 e93 = hm0.f17713f;
                d93<O> n = s83.m30612n(a4, dVar, e93);
                if (runnable != null) {
                    a4.mo15945h(runnable, e93);
                }
                km0.m26271a(n, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                ul0.m31860e("Error requesting application settings", e);
            }
        } else {
            ul0.m31862g("App settings could not be fetched. Required parameters missing");
        }
    }

    /* renamed from: c */
    public final void mo10832c(Context context, zzcjf zzcjf, String str, al0 al0) {
        mo10831b(context, zzcjf, false, al0, al0 != null ? al0.mo15848b() : null, str, (Runnable) null);
    }
}
