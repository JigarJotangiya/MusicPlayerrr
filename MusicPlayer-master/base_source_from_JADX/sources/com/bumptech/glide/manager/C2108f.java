package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.C0506a;
import com.bumptech.glide.manager.C2103c;

/* renamed from: com.bumptech.glide.manager.f */
/* compiled from: DefaultConnectivityMonitorFactory */
public class C2108f implements C2105d {
    /* renamed from: a */
    public C2103c mo8276a(Context context, C2103c.C2104a aVar) {
        boolean z = C0506a.m3149a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        if (z) {
            return new C2106e(context, aVar);
        }
        return new C2116n();
    }
}
