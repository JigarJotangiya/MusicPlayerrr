package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c50 implements y50 {

    /* renamed from: a */
    public static final /* synthetic */ c50 f14825a = new c50();

    private /* synthetic */ c50() {
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        rs0 rs0 = (rs0) obj;
        y50<pr0> y50 = x50.f25661a;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22614r5)).booleanValue()) {
            ul0.m31862g("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            ul0.m31862g("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(rs0.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        C3018m1.m13388k(sb.toString());
        ((d80) rs0).mo16880n0("openableApp", hashMap);
    }
}
