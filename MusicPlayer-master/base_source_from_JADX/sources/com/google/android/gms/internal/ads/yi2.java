package com.google.android.gms.internal.ads;

import com.google.android.gms.common.C3245g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class yi2 implements rg2 {

    /* renamed from: a */
    public static final /* synthetic */ yi2 f26368a = new yi2();

    private /* synthetic */ yi2() {
    }

    /* renamed from: b */
    public final void mo15742b(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", C3245g.f10501a);
        } catch (JSONException unused) {
        }
    }
}
