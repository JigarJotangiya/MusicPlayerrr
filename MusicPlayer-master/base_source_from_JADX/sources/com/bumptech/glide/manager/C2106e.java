package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.manager.C2103c;
import com.bumptech.glide.p051s.C2193j;

/* renamed from: com.bumptech.glide.manager.e */
/* compiled from: DefaultConnectivityMonitor */
final class C2106e implements C2103c {

    /* renamed from: g */
    private final Context f7213g;

    /* renamed from: h */
    final C2103c.C2104a f7214h;

    /* renamed from: i */
    boolean f7215i;

    /* renamed from: j */
    private boolean f7216j;

    /* renamed from: k */
    private final BroadcastReceiver f7217k = new C2107a();

    /* renamed from: com.bumptech.glide.manager.e$a */
    /* compiled from: DefaultConnectivityMonitor */
    class C2107a extends BroadcastReceiver {
        C2107a() {
        }

        public void onReceive(Context context, Intent intent) {
            C2106e eVar = C2106e.this;
            boolean z = eVar.f7215i;
            eVar.f7215i = eVar.mo8277d(context);
            if (z != C2106e.this.f7215i) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + C2106e.this.f7215i);
                }
                C2106e eVar2 = C2106e.this;
                eVar2.f7214h.mo7672a(eVar2.f7215i);
            }
        }
    }

    C2106e(Context context, C2103c.C2104a aVar) {
        this.f7213g = context.getApplicationContext();
        this.f7214h = aVar;
    }

    /* renamed from: h */
    private void m9847h() {
        if (!this.f7216j) {
            this.f7215i = mo8277d(this.f7213g);
            try {
                this.f7213g.registerReceiver(this.f7217k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f7216j = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* renamed from: m */
    private void m9848m() {
        if (this.f7216j) {
            this.f7213g.unregisterReceiver(this.f7217k);
            this.f7216j = false;
        }
    }

    /* renamed from: a */
    public void mo7648a() {
        m9847h();
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public boolean mo8277d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        C2193j.m10269d(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* renamed from: g */
    public void mo7650g() {
        m9848m();
    }

    public void onDestroy() {
    }
}
