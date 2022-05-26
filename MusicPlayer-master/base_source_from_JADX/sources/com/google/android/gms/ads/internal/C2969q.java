package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.internal.ads.pg2;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.v00;
import com.google.android.gms.internal.ads.zzbfd;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.ads.internal.q */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2969q {

    /* renamed from: a */
    private final Context f9924a;

    /* renamed from: b */
    private final String f9925b;

    /* renamed from: c */
    private final Map<String, String> f9926c = new TreeMap();

    /* renamed from: d */
    private String f9927d;

    /* renamed from: e */
    private String f9928e;

    /* renamed from: f */
    private final String f9929f;

    public C2969q(Context context, String str) {
        String str2;
        this.f9924a = context.getApplicationContext();
        this.f9925b = str;
        String packageName = context.getPackageName();
        try {
            String str3 = C3334c.m14368a(context).mo11913f(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str3).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str3);
            str2 = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            ul0.m31860e("Unable to get package version name for reporting", e);
            str2 = String.valueOf(packageName).concat("-missing");
        }
        this.f9929f = str2;
    }

    /* renamed from: a */
    public final String mo10917a() {
        return this.f9929f;
    }

    /* renamed from: b */
    public final String mo10918b() {
        return this.f9928e;
    }

    /* renamed from: c */
    public final String mo10919c() {
        return this.f9925b;
    }

    /* renamed from: d */
    public final String mo10920d() {
        return this.f9927d;
    }

    /* renamed from: e */
    public final Map<String, String> mo10921e() {
        return this.f9926c;
    }

    /* renamed from: f */
    public final void mo10922f(zzbfd zzbfd, zzcjf zzcjf) {
        this.f9927d = zzbfd.f27204p.f27244g;
        Bundle bundle = zzbfd.f27207s;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String e = v00.f24529c.mo20989e();
            for (String str : bundle2.keySet()) {
                if (e.equals(str)) {
                    this.f9928e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    this.f9926c.put(str.substring(4), bundle2.getString(str));
                }
            }
            this.f9926c.put("SDKVersion", zzcjf.f27376g);
            if (v00.f24527a.mo20989e().booleanValue()) {
                try {
                    Bundle b = pg2.m29011b(this.f9924a, new JSONArray(v00.f24528b.mo20989e()));
                    for (String str2 : b.keySet()) {
                        this.f9926c.put(str2, b.get(str2).toString());
                    }
                } catch (JSONException e2) {
                    ul0.m31860e("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
                }
            }
        }
    }
}
