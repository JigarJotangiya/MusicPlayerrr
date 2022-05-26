package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kl2 extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ lm2 f18909a;

    /* synthetic */ kl2(lm2 lm2, ik2 ik2) {
        this.f18909a = lm2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        lm2.m26786c(this.f18909a, true != (overrideNetworkType == 3 || overrideNetworkType == 4) ? 5 : 10);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? BuildConfig.FLAVOR : serviceState.toString();
        lm2.m26786c(this.f18909a, true != (serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED")) ? 5 : 10);
    }
}
