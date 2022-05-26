package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w40 implements y50<Object> {

    /* renamed from: a */
    private final x40 f25221a;

    public w40(x40 x40) {
        this.f25221a = x40;
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map<String, String> map) {
        if (this.f25221a != null) {
            String str = map.get("name");
            if (str == null) {
                ul0.m31861f("Ad metadata with no name parameter.");
                str = BuildConfig.FLAVOR;
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = C3044v0.m13474a(new JSONObject(map.get("info")));
                } catch (JSONException e) {
                    ul0.m31860e("Failed to convert ad metadata to JSON.", e);
                }
            }
            if (bundle == null) {
                ul0.m31859d("Failed to convert ad metadata to Bundle.");
            } else {
                this.f25221a.mo15727n(str, bundle);
            }
        }
    }
}
