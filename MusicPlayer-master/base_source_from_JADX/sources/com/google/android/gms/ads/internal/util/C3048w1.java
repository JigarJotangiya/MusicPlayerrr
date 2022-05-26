package com.google.android.gms.ads.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.ads.internal.util.w1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3048w1 extends ConnectivityManager.NetworkCallback {
    C3048w1(C2979b2 b2Var) {
    }

    public final void onAvailable(Network network) {
        synchronized (C2979b2.class) {
            C2979b2.f9981j = true;
        }
    }

    public final void onLost(Network network) {
        synchronized (C2979b2.class) {
            C2979b2.f9981j = false;
        }
    }
}
