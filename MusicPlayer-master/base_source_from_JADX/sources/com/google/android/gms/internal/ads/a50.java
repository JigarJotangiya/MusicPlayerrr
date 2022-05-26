package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a50 implements y50<pr0> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                ul0.m31862g("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                ul0.m31862g("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = C2971s.m13198a().mo11989b() + (Long.parseLong(str4) - C2971s.m13198a().mo11988a());
                    if (true == TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    pr0.mo17244l().mo16807c(str2, str3, b);
                } catch (NumberFormatException e) {
                    ul0.m31863h("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                ul0.m31862g("No value given for CSI experiment.");
            } else {
                pr0.mo17244l().mo16805a().mo17448d("e", str5);
            }
        } else if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                ul0.m31862g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                ul0.m31862g("No name given for CSI extra.");
            } else {
                pr0.mo17244l().mo16805a().mo17448d(str6, str7);
            }
        }
    }
}
