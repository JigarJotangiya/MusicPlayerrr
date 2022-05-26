package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dh2 implements sg2<bh2> {

    /* renamed from: a */
    private final e93 f15613a;

    /* renamed from: b */
    private final Context f15614b;

    public dh2(e93 e93, Context context) {
        this.f15613a = e93;
        this.f15614b = context;
    }

    /* renamed from: a */
    public final d93<bh2> mo15767a() {
        return this.f15613a.mo17138A0(new ch2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ bh2 mo16931b() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.f15614b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        C2971s.m13214q();
        int i3 = -1;
        if (C2979b2.m13255f(this.f15614b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f15614b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i2 = -2;
            z = false;
            i = -1;
        }
        C2971s.m13214q();
        return new bh2(networkOperator, i2, C2979b2.m13249c(this.f15614b), phoneType, z, i);
    }
}
