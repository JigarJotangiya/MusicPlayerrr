package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3369n;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5788yn;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.y00;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.util.r1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3033r1 implements C3024o1 {

    /* renamed from: A */
    private long f10074A = 0;

    /* renamed from: a */
    private final Object f10075a = new Object();

    /* renamed from: b */
    private boolean f10076b;

    /* renamed from: c */
    private final List<Runnable> f10077c = new ArrayList();

    /* renamed from: d */
    private d93<?> f10078d;

    /* renamed from: e */
    private C5788yn f10079e = null;

    /* renamed from: f */
    private SharedPreferences f10080f;

    /* renamed from: g */
    private SharedPreferences.Editor f10081g;

    /* renamed from: h */
    private boolean f10082h = true;

    /* renamed from: i */
    private String f10083i;

    /* renamed from: j */
    private String f10084j;

    /* renamed from: k */
    private boolean f10085k = true;

    /* renamed from: l */
    private al0 f10086l = new al0(BuildConfig.FLAVOR, 0);

    /* renamed from: m */
    private long f10087m = 0;

    /* renamed from: n */
    private long f10088n = 0;

    /* renamed from: o */
    private int f10089o = -1;

    /* renamed from: p */
    private int f10090p = 0;

    /* renamed from: q */
    private Set<String> f10091q = Collections.emptySet();

    /* renamed from: r */
    private JSONObject f10092r = new JSONObject();

    /* renamed from: s */
    private boolean f10093s = true;

    /* renamed from: t */
    private boolean f10094t = true;

    /* renamed from: u */
    private String f10095u = null;

    /* renamed from: v */
    private String f10096v = BuildConfig.FLAVOR;

    /* renamed from: w */
    private boolean f10097w = false;

    /* renamed from: x */
    private String f10098x = BuildConfig.FLAVOR;

    /* renamed from: y */
    private int f10099y = -1;

    /* renamed from: z */
    private int f10100z = -1;

    /* renamed from: n */
    private final void m13434n() {
        d93<?> d93 = this.f10078d;
        if (d93 != null && !d93.isDone()) {
            try {
                this.f10078d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ul0.m31863h("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                ul0.m31860e("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: p */
    private final void m13435p() {
        hm0.f17708a.execute(new C3027p1(this));
    }

    /* renamed from: E */
    public final boolean mo11065E() {
        boolean z;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22553k0)).booleanValue()) {
            return false;
        }
        m13434n();
        synchronized (this.f10075a) {
            z = this.f10085k;
        }
        return z;
    }

    /* renamed from: J */
    public final boolean mo11066J() {
        boolean z;
        m13434n();
        synchronized (this.f10075a) {
            z = this.f10097w;
        }
        return z;
    }

    /* renamed from: K */
    public final boolean mo11067K() {
        boolean z;
        m13434n();
        synchronized (this.f10075a) {
            z = this.f10093s;
        }
        return z;
    }

    /* renamed from: M */
    public final void mo11068M(String str) {
        m13434n();
        synchronized (this.f10075a) {
            if (!str.equals(this.f10084j)) {
                this.f10084j = str;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: N */
    public final void mo11069N(long j) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10088n != j) {
                this.f10088n = j;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: O */
    public final void mo11070O(String str) {
        m13434n();
        synchronized (this.f10075a) {
            if (!TextUtils.equals(this.f10095u, str)) {
                this.f10095u = str;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: P */
    public final void mo11071P(Context context) {
        synchronized (this.f10075a) {
            if (this.f10080f == null) {
                this.f10078d = hm0.f17708a.mo17139F0(new C3030q1(this, context, "admob"));
                this.f10076b = true;
            }
        }
    }

    /* renamed from: Q */
    public final void mo11072Q(boolean z) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10093s != z) {
                this.f10093s = z;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: R */
    public final void mo11073R(String str) {
        m13434n();
        synchronized (this.f10075a) {
            long a = C2971s.m13198a().mo11988a();
            if (str != null) {
                if (!str.equals(this.f10086l.mo15849c())) {
                    this.f10086l = new al0(str, a);
                    SharedPreferences.Editor editor = this.f10081g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f10081g.putLong("app_settings_last_update_ms", a);
                        this.f10081g.apply();
                    }
                    m13435p();
                    for (Runnable run : this.f10077c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f10086l.mo15853g(a);
        }
    }

    /* renamed from: S */
    public final void mo11074S(String str) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22422S5)).booleanValue()) {
            m13434n();
            synchronized (this.f10075a) {
                if (!this.f10096v.equals(str)) {
                    this.f10096v = str;
                    SharedPreferences.Editor editor = this.f10081g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f10081g.apply();
                    }
                    m13435p();
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo11075T(Runnable runnable) {
        this.f10077c.add(runnable);
    }

    /* renamed from: U */
    public final void mo11076U(String str, String str2, boolean z) {
        m13434n();
        synchronized (this.f10075a) {
            JSONArray optJSONArray = this.f10092r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i;
                        } else {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C2971s.m13198a().mo11988a());
                optJSONArray.put(length, jSONObject);
                this.f10092r.put(str, optJSONArray);
            } catch (JSONException e) {
                ul0.m31863h("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f10081g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f10092r.toString());
                this.f10081g.apply();
            }
            m13435p();
        }
    }

    /* renamed from: V */
    public final void mo11077V(int i) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10090p != i) {
                this.f10090p = i;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: W */
    public final void mo11078W(String str) {
        m13434n();
        synchronized (this.f10075a) {
            if (!str.equals(this.f10083i)) {
                this.f10083i = str;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: X */
    public final void mo11079X(String str) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
            m13434n();
            synchronized (this.f10075a) {
                if (!this.f10098x.equals(str)) {
                    this.f10098x = str;
                    SharedPreferences.Editor editor = this.f10081g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f10081g.apply();
                    }
                    m13435p();
                }
            }
        }
    }

    /* renamed from: Y */
    public final void mo11080Y(int i) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10100z != i) {
                this.f10100z = i;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: Z */
    public final void mo11081Z(boolean z) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22535h6)).booleanValue()) {
            m13434n();
            synchronized (this.f10075a) {
                if (this.f10097w != z) {
                    this.f10097w = z;
                    SharedPreferences.Editor editor = this.f10081g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f10081g.apply();
                    }
                    m13435p();
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo11082a() {
        int i;
        m13434n();
        synchronized (this.f10075a) {
            i = this.f10089o;
        }
        return i;
    }

    /* renamed from: a0 */
    public final void mo11083a0(long j) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10087m != j) {
                this.f10087m = j;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: b */
    public final long mo11084b() {
        long j;
        m13434n();
        synchronized (this.f10075a) {
            j = this.f10087m;
        }
        return j;
    }

    /* renamed from: b0 */
    public final void mo11085b0(long j) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10074A != j) {
                this.f10074A = j;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: c */
    public final C5788yn mo11086c() {
        if (!this.f10076b) {
            return null;
        }
        if ((mo11067K() && mo11100s()) || !y00.f26179b.mo20989e().booleanValue()) {
            return null;
        }
        synchronized (this.f10075a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f10079e == null) {
                this.f10079e = new C5788yn();
            }
            this.f10079e.mo22261e();
            ul0.m31861f("start fetching content...");
            C5788yn ynVar = this.f10079e;
            return ynVar;
        }
    }

    /* renamed from: c0 */
    public final void mo11087c0(boolean z) {
        m13434n();
        synchronized (this.f10075a) {
            if (z != this.f10085k) {
                this.f10085k = z;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: d */
    public final al0 mo11088d() {
        al0 al0;
        m13434n();
        synchronized (this.f10075a) {
            al0 = this.f10086l;
        }
        return al0;
    }

    /* renamed from: d0 */
    public final void mo11089d0(boolean z) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10094t != z) {
                this.f10094t = z;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: e */
    public final al0 mo11090e() {
        al0 al0;
        synchronized (this.f10075a) {
            al0 = this.f10086l;
        }
        return al0;
    }

    /* renamed from: e0 */
    public final void mo11091e0(int i) {
        m13434n();
        synchronized (this.f10075a) {
            if (this.f10089o != i) {
                this.f10089o = i;
                SharedPreferences.Editor editor = this.f10081g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f10081g.apply();
                }
                m13435p();
            }
        }
    }

    /* renamed from: f */
    public final long mo11092f() {
        long j;
        m13434n();
        synchronized (this.f10075a) {
            j = this.f10088n;
        }
        return j;
    }

    /* renamed from: g */
    public final String mo11093g() {
        String str;
        m13434n();
        synchronized (this.f10075a) {
            str = this.f10083i;
        }
        return str;
    }

    /* renamed from: h */
    public final String mo11094h() {
        String str;
        m13434n();
        synchronized (this.f10075a) {
            str = this.f10084j;
        }
        return str;
    }

    /* renamed from: i */
    public final String mo11095i() {
        String str;
        m13434n();
        synchronized (this.f10075a) {
            str = this.f10098x;
        }
        return str;
    }

    /* renamed from: j */
    public final String mo11096j() {
        String str;
        m13434n();
        synchronized (this.f10075a) {
            str = this.f10095u;
        }
        return str;
    }

    /* renamed from: k */
    public final JSONObject mo11097k() {
        JSONObject jSONObject;
        m13434n();
        synchronized (this.f10075a) {
            jSONObject = this.f10092r;
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo11111l(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f10075a) {
            this.f10080f = sharedPreferences;
            this.f10081g = edit;
            if (C3369n.m14476h()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f10082h = this.f10080f.getBoolean("use_https", this.f10082h);
            this.f10093s = this.f10080f.getBoolean("content_url_opted_out", this.f10093s);
            this.f10083i = this.f10080f.getString("content_url_hashes", this.f10083i);
            this.f10085k = this.f10080f.getBoolean("gad_idless", this.f10085k);
            this.f10094t = this.f10080f.getBoolean("content_vertical_opted_out", this.f10094t);
            this.f10084j = this.f10080f.getString("content_vertical_hashes", this.f10084j);
            this.f10090p = this.f10080f.getInt("version_code", this.f10090p);
            this.f10086l = new al0(this.f10080f.getString("app_settings_json", this.f10086l.mo15849c()), this.f10080f.getLong("app_settings_last_update_ms", this.f10086l.mo15847a()));
            this.f10087m = this.f10080f.getLong("app_last_background_time_ms", this.f10087m);
            this.f10089o = this.f10080f.getInt("request_in_session_count", this.f10089o);
            this.f10088n = this.f10080f.getLong("first_ad_req_time_ms", this.f10088n);
            this.f10091q = this.f10080f.getStringSet("never_pool_slots", this.f10091q);
            this.f10095u = this.f10080f.getString("display_cutout", this.f10095u);
            this.f10099y = this.f10080f.getInt("app_measurement_npa", this.f10099y);
            this.f10100z = this.f10080f.getInt("sd_app_measure_npa", this.f10100z);
            this.f10074A = this.f10080f.getLong("sd_app_measure_npa_ts", this.f10074A);
            this.f10096v = this.f10080f.getString("inspector_info", this.f10096v);
            this.f10097w = this.f10080f.getBoolean("linked_device", this.f10097w);
            this.f10098x = this.f10080f.getString("linked_ad_unit", this.f10098x);
            try {
                this.f10092r = new JSONObject(this.f10080f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                ul0.m31863h("Could not convert native advanced settings to json object", e);
            }
            m13435p();
        }
    }

    /* renamed from: m */
    public final String mo11098m() {
        String str;
        m13434n();
        synchronized (this.f10075a) {
            str = this.f10096v;
        }
        return str;
    }

    /* renamed from: o */
    public final void mo11099o() {
        m13434n();
        synchronized (this.f10075a) {
            this.f10092r = new JSONObject();
            SharedPreferences.Editor editor = this.f10081g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f10081g.apply();
            }
            m13435p();
        }
    }

    /* renamed from: s */
    public final boolean mo11100s() {
        boolean z;
        m13434n();
        synchronized (this.f10075a) {
            z = this.f10094t;
        }
        return z;
    }

    public final int zza() {
        int i;
        m13434n();
        synchronized (this.f10075a) {
            i = this.f10090p;
        }
        return i;
    }

    public final long zze() {
        long j;
        m13434n();
        synchronized (this.f10075a) {
            j = this.f10074A;
        }
        return j;
    }
}
