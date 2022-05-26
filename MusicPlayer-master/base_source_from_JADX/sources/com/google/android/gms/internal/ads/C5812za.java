package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.za */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5812za extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C4886ab f26714a;

    C5812za(C4886ab abVar) {
        this.f26714a = abVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C4886ab.class) {
            this.f26714a.f13834a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (C4886ab.class) {
            this.f26714a.f13834a = null;
        }
    }
}
