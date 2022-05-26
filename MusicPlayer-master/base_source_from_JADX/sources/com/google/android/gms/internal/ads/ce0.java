package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class ce0 {

    /* renamed from: a */
    private final pr0 f14949a;

    /* renamed from: b */
    private final String f14950b;

    public ce0(pr0 pr0, String str) {
        this.f14949a = pr0;
        this.f14950b = str;
    }

    /* renamed from: b */
    public final void mo16609b(int i, int i2, int i3, int i4) {
        try {
            this.f14949a.mo16881r("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo16610c(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f14950b);
            pr0 pr0 = this.f14949a;
            if (pr0 != null) {
                pr0.mo16881r("onError", put);
            }
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: d */
    public final void mo16611d(String str) {
        try {
            this.f14949a.mo16881r("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* renamed from: e */
    public final void mo16612e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f14949a.mo16881r("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while obtaining screen information.", e);
        }
    }

    /* renamed from: f */
    public final void mo16613f(int i, int i2, int i3, int i4) {
        try {
            this.f14949a.mo16881r("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while dispatching size change.", e);
        }
    }

    /* renamed from: g */
    public final void mo16614g(String str) {
        try {
            this.f14949a.mo16881r("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            ul0.m31860e("Error occurred while dispatching state change.", e);
        }
    }
}
