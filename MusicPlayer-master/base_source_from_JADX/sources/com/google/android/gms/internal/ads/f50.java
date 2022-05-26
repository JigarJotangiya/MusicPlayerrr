package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class f50 implements y50 {

    /* renamed from: a */
    public static final /* synthetic */ f50 f16436a = new f50();

    private /* synthetic */ f50() {
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        rs0 rs0 = (rs0) obj;
        y50<pr0> y50 = x50.f25661a;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            ul0.m31862g("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = rs0.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + obj2.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(obj2);
            C3018m1.m13388k(sb.toString());
        }
        ((d80) rs0).mo16880n0("openableURLs", hashMap);
    }
}
