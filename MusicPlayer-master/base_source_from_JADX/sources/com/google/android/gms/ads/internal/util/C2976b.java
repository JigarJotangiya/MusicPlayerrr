package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.C2971s;

@TargetApi(26)
/* renamed from: com.google.android.gms.ads.internal.util.b */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C2976b extends C3003h2 {
    /* renamed from: p */
    public final int mo10972p(Context context, TelephonyManager telephonyManager) {
        C2971s.m13214q();
        if (!C2979b2.m13255f(context, "android.permission.ACCESS_NETWORK_STATE") || !telephonyManager.isDataEnabled()) {
            return 1;
        }
        return 2;
    }
}
