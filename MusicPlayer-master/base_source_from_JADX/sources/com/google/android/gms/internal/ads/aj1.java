package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C3056z0;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.util.C3359d;
import com.google.android.gms.common.util.C3369n;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aj1 implements jk1 {

    /* renamed from: a */
    private final Context f13904a;

    /* renamed from: b */
    private final mk1 f13905b;

    /* renamed from: c */
    private final JSONObject f13906c;

    /* renamed from: d */
    private final bp1 f13907d;

    /* renamed from: e */
    private final bk1 f13908e;

    /* renamed from: f */
    private final C5737xa f13909f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final x81 f13910g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final c81 f13911h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final wf1 f13912i;

    /* renamed from: j */
    private final bp2 f13913j;

    /* renamed from: k */
    private final zzcjf f13914k;

    /* renamed from: l */
    private final up2 f13915l;

    /* renamed from: m */
    private final m01 f13916m;

    /* renamed from: n */
    private final el1 f13917n;

    /* renamed from: o */
    private final C3359d f13918o;

    /* renamed from: p */
    private final sf1 f13919p;

    /* renamed from: q */
    private final lv2 f13920q;

    /* renamed from: r */
    private boolean f13921r = false;

    /* renamed from: s */
    private boolean f13922s;

    /* renamed from: t */
    private boolean f13923t = false;

    /* renamed from: u */
    private boolean f13924u = false;

    /* renamed from: v */
    private Point f13925v = new Point();

    /* renamed from: w */
    private Point f13926w = new Point();

    /* renamed from: x */
    private long f13927x = 0;

    /* renamed from: y */
    private long f13928y = 0;

    /* renamed from: z */
    private C5685vw f13929z;

    public aj1(Context context, mk1 mk1, JSONObject jSONObject, bp1 bp1, bk1 bk1, C5737xa xaVar, x81 x81, c81 c81, wf1 wf1, bp2 bp2, zzcjf zzcjf, up2 up2, m01 m01, el1 el1, C3359d dVar, sf1 sf1, lv2 lv2) {
        this.f13904a = context;
        this.f13905b = mk1;
        this.f13906c = jSONObject;
        this.f13907d = bp1;
        this.f13908e = bk1;
        this.f13909f = xaVar;
        this.f13910g = x81;
        this.f13911h = c81;
        this.f13912i = wf1;
        this.f13913j = bp2;
        this.f13914k = zzcjf;
        this.f13915l = up2;
        this.f13916m = m01;
        this.f13917n = el1;
        this.f13918o = dVar;
        this.f13919p = sf1;
        this.f13920q = lv2;
    }

    /* renamed from: v */
    private final String m20742v(View view, Map<String, WeakReference<View>> map) {
        if (!(map == null || view == null)) {
            for (Map.Entry next : map.entrySet()) {
                if (view.equals((View) ((WeakReference) next.getValue()).get())) {
                    return (String) next.getKey();
                }
            }
        }
        int K = this.f13908e.mo16259K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: w */
    private final boolean m20743w(String str) {
        JSONObject optJSONObject = this.f13906c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    private final boolean m20744x() {
        return this.f13906c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: y */
    private final boolean m20745y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        C3292l.m14236d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f13906c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22439V1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f13904a;
            JSONObject jSONObject7 = new JSONObject();
            C2971s.m13214q();
            DisplayMetrics g0 = C2979b2.m13258g0((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", C4980cv.m22123b().mo19749b(context, g0.widthPixels));
                jSONObject7.put("height", C4980cv.m22123b().mo19749b(context, g0.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22304C5)).booleanValue()) {
                this.f13907d.mo16355i("/clickRecorded", new wi1(this, (vi1) null));
            } else {
                this.f13907d.mo16355i("/logScionEvent", new ui1(this, (ti1) null));
            }
            this.f13907d.mo16355i("/nativeImpression", new zi1(this, (yi1) null));
            km0.m26271a(this.f13907d.mo16350d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f13921r) {
                return true;
            }
            this.f13921r = C2971s.m13217t().mo11003n(this.f13904a, this.f13914k.f27376g, this.f13913j.f14612D.toString(), this.f13915l.f24397f);
            return true;
        } catch (JSONException e) {
            ul0.m31860e("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo15798C(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        C3292l.m14236d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f13906c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f13905b.mo19403c(this.f13908e.mo16287g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f13908e.mo16259K());
            jSONObject8.put("view_aware_api_used", z);
            zzbnw zzbnw = this.f13915l.f24400i;
            jSONObject8.put("custom_mute_requested", zzbnw != null && zzbnw.f27254m);
            jSONObject8.put("custom_mute_enabled", !this.f13908e.mo16284f().isEmpty() && this.f13908e.mo16267S() != null);
            if (this.f13917n.mo17203a() != null && this.f13906c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f13918o.mo11988a());
            if (this.f13924u && m20744x()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f13905b.mo19403c(this.f13908e.mo16287g0()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.f13906c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f13909f.mo21999c().mo10845g(this.f13904a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                ul0.m31860e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22363K2)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22336G5)).booleanValue() && C3369n.m14479k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22344H5)).booleanValue() && C3369n.m14479k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.f13918o.mo11988a();
            jSONObject9.put("time_from_last_touch_down", a - this.f13927x);
            jSONObject9.put("time_from_last_touch", a - this.f13928y);
            jSONObject7.put("touch_signal", jSONObject9);
            km0.m26271a(this.f13907d.mo16350d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            ul0.m31860e("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: O */
    public final boolean mo15799O() {
        return m20744x();
    }

    /* renamed from: a */
    public final JSONObject mo15800a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject d = C3056z0.m13518d(this.f13904a, map, map2, view);
        JSONObject g = C3056z0.m13521g(this.f13904a, view);
        JSONObject f = C3056z0.m13520f(view);
        JSONObject e = C3056z0.m13519e(this.f13904a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", g);
            jSONObject.put("scroll_view_signal", f);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            ul0.m31860e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo15801b(View view, MotionEvent motionEvent, View view2) {
        this.f13925v = C3056z0.m13515a(motionEvent, view2);
        long a = this.f13918o.mo11988a();
        this.f13928y = a;
        if (motionEvent.getAction() == 0) {
            this.f13927x = a;
            this.f13926w = this.f13925v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f13925v;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f13909f.mo22000d(obtain);
        obtain.recycle();
    }

    /* renamed from: c */
    public final void mo15802c() {
        try {
            C5685vw vwVar = this.f13929z;
            if (vwVar != null) {
                vwVar.zze();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo15803d() {
        if (this.f13906c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f13917n.mo17204b();
        }
    }

    /* renamed from: e */
    public final void mo15804e() {
        this.f13907d.mo16352f();
    }

    /* renamed from: f */
    public final void mo15805f(String str) {
        mo15798C((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: g */
    public final void mo15806g(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view3 = view2;
        Map<String, WeakReference<View>> map3 = map;
        JSONObject d = C3056z0.m13518d(this.f13904a, map, map2, view2);
        JSONObject g = C3056z0.m13521g(this.f13904a, view2);
        JSONObject f = C3056z0.m13520f(view2);
        JSONObject e = C3056z0.m13519e(this.f13904a, view2);
        View view4 = view;
        String v = m20742v(view, map);
        mo15798C(true == ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22446W1)).booleanValue() ? view3 : view4, g, d, f, e, v, C3056z0.m13517c(v, this.f13904a, this.f13926w, this.f13925v), (JSONObject) null, z, false);
    }

    /* renamed from: h */
    public final void mo15807h(View view) {
        if (!this.f13906c.optBoolean("custom_one_point_five_click_enabled", false)) {
            ul0.m31862g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        el1 el1 = this.f13917n;
        if (view != null) {
            view.setOnClickListener(el1);
            view.setClickable(true);
            el1.f15995m = new WeakReference<>(view);
        }
    }

    /* renamed from: i */
    public final void mo15808i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f13925v = new Point();
        this.f13926w = new Point();
        if (!this.f13922s) {
            this.f13919p.mo20839N0(view);
            this.f13922s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f13916m.mo19314e(this);
        boolean i = C3056z0.m13523i(this.f13914k.f27378i);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean mo15809j(Bundle bundle) {
        if (!m20743w("impression_reporting")) {
            ul0.m31859d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m20745y((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, C2971s.m13214q().mo10980O(bundle, (JSONObject) null), false);
    }

    /* renamed from: k */
    public final void mo15810k(Bundle bundle) {
        if (bundle == null) {
            ul0.m31857b("Click data is null. No click is reported.");
        } else if (!m20743w("click_reporting")) {
            ul0.m31859d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            mo15798C((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, C2971s.m13214q().mo10980O(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: l */
    public final void mo15811l() {
        C3292l.m14236d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f13906c);
            km0.m26271a(this.f13907d.mo16350d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }

    /* renamed from: m */
    public final void mo15812m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String str;
        JSONObject d = C3056z0.m13518d(this.f13904a, map, map2, view);
        JSONObject g = C3056z0.m13521g(this.f13904a, view);
        JSONObject f = C3056z0.m13520f(view);
        JSONObject e = C3056z0.m13519e(this.f13904a, view);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22439V1)).booleanValue()) {
            try {
                str = this.f13909f.mo21999c().mo10844f(this.f13904a, view, (Activity) null);
            } catch (Exception unused) {
                ul0.m31859d("Exception getting data.");
            }
            m20745y(g, d, f, e, str, (JSONObject) null, C3056z0.m13522h(this.f13904a, this.f13913j));
        }
        str = null;
        m20745y(g, d, f, e, str, (JSONObject) null, C3056z0.m13522h(this.f13904a, this.f13913j));
    }

    /* renamed from: n */
    public final void mo15813n(C5685vw vwVar) {
        this.f13929z = vwVar;
    }

    /* renamed from: o */
    public final void mo15814o() {
        m20745y((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    /* renamed from: p */
    public final void mo15815p(C5797yw ywVar) {
        try {
            if (!this.f13923t) {
                if (ywVar == null) {
                    if (this.f13908e.mo16267S() != null) {
                        this.f13923t = true;
                        this.f13920q.mo19285b(this.f13908e.mo16267S().mo17043c());
                        mo15802c();
                        return;
                    }
                }
                this.f13923t = true;
                this.f13920q.mo19285b(ywVar.mo17043c());
                mo15802c();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo15816q(j40 j40) {
        if (!this.f13906c.optBoolean("custom_one_point_five_click_enabled", false)) {
            ul0.m31862g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f13917n.mo17205d(j40);
        }
    }

    /* renamed from: r */
    public final void mo15817r(View view, Map<String, WeakReference<View>> map) {
        this.f13925v = new Point();
        this.f13926w = new Point();
        if (view != null) {
            this.f13919p.mo20840P0(view);
        }
        this.f13922s = false;
    }

    /* renamed from: s */
    public final void mo15818s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        View view2 = view;
        Map<String, WeakReference<View>> map3 = map;
        if (!this.f13924u) {
            ul0.m31857b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m20744x()) {
            ul0.m31857b("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map<String, WeakReference<View>> map4 = map2;
            JSONObject d = C3056z0.m13518d(this.f13904a, map, map2, view);
            JSONObject g = C3056z0.m13521g(this.f13904a, view);
            JSONObject f = C3056z0.m13520f(view);
            JSONObject e = C3056z0.m13519e(this.f13904a, view);
            String v = m20742v((View) null, map);
            mo15798C(view, g, d, f, e, v, C3056z0.m13517c(v, this.f13904a, this.f13926w, this.f13925v), (JSONObject) null, z, true);
        }
    }

    /* renamed from: t */
    public final JSONObject mo15819t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject a = mo15800a(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f13924u && m20744x()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (a != null) {
                jSONObject.put("nas", a);
            }
        } catch (JSONException e) {
            ul0.m31860e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* renamed from: u */
    public final void mo15820u() {
        this.f13924u = true;
    }

    /* renamed from: y0 */
    public final void mo15821y0(Bundle bundle) {
        if (bundle == null) {
            ul0.m31857b("Touch event data is null. No touch event is reported.");
        } else if (!m20743w("touch_reporting")) {
            ul0.m31859d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f13909f.mo21999c().mo10841c((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }
}
