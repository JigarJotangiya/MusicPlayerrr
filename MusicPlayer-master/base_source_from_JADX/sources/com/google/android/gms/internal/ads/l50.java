package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class l50 implements y50<pr0> {
    l50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        C2971s.m13214q();
        DisplayMetrics g0 = C2979b2.m13258g0((WindowManager) pr0.getContext().getSystemService("window"));
        int i = g0.widthPixels;
        int i2 = g0.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) pr0).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        pr0.mo16880n0("locationReady", hashMap);
        ul0.m31862g("GET LOCATION COMPILED");
    }
}
