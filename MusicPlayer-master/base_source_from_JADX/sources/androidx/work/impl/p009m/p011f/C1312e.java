package androidx.work.impl.p009m.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.C1405l;
import androidx.work.impl.p009m.C1294b;
import androidx.work.impl.utils.p014p.C1397a;
import p082e.p109h.p114k.C3642a;

/* renamed from: androidx.work.impl.m.f.e */
/* compiled from: NetworkStateTracker */
public class C1312e extends C1310d<C1294b> {

    /* renamed from: j */
    static final String f5278j = C1405l.m7462f("NetworkStateTracker");

    /* renamed from: g */
    private final ConnectivityManager f5279g = ((ConnectivityManager) this.f5272b.getSystemService("connectivity"));

    /* renamed from: h */
    private C1314b f5280h;

    /* renamed from: i */
    private C1313a f5281i;

    /* renamed from: androidx.work.impl.m.f.e$a */
    /* compiled from: NetworkStateTracker */
    private class C1313a extends BroadcastReceiver {
        C1313a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C1405l.m7460c().mo6816a(C1312e.f5278j, "Network broadcast received", new Throwable[0]);
                C1312e eVar = C1312e.this;
                eVar.mo6669d(eVar.mo6671g());
            }
        }
    }

    /* renamed from: androidx.work.impl.m.f.e$b */
    /* compiled from: NetworkStateTracker */
    private class C1314b extends ConnectivityManager.NetworkCallback {
        C1314b() {
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C1405l.m7460c().mo6816a(C1312e.f5278j, String.format("Network capabilities changed: %s", new Object[]{networkCapabilities}), new Throwable[0]);
            C1312e eVar = C1312e.this;
            eVar.mo6669d(eVar.mo6671g());
        }

        public void onLost(Network network) {
            C1405l.m7460c().mo6816a(C1312e.f5278j, "Network connection lost", new Throwable[0]);
            C1312e eVar = C1312e.this;
            eVar.mo6669d(eVar.mo6671g());
        }
    }

    public C1312e(Context context, C1397a aVar) {
        super(context, aVar);
        if (m7211j()) {
            this.f5280h = new C1314b();
        } else {
            this.f5281i = new C1313a();
        }
    }

    /* renamed from: j */
    private static boolean m7211j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: e */
    public void mo6664e() {
        if (m7211j()) {
            try {
                C1405l.m7460c().mo6816a(f5278j, "Registering network callback", new Throwable[0]);
                this.f5279g.registerDefaultNetworkCallback(this.f5280h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1405l.m7460c().mo6817b(f5278j, "Received exception while registering network callback", e);
            }
        } else {
            C1405l.m7460c().mo6816a(f5278j, "Registering broadcast receiver", new Throwable[0]);
            this.f5272b.registerReceiver(this.f5281i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: f */
    public void mo6665f() {
        if (m7211j()) {
            try {
                C1405l.m7460c().mo6816a(f5278j, "Unregistering network callback", new Throwable[0]);
                this.f5279g.unregisterNetworkCallback(this.f5280h);
            } catch (IllegalArgumentException | SecurityException e) {
                C1405l.m7460c().mo6817b(f5278j, "Received exception while unregistering network callback", e);
            }
        } else {
            C1405l.m7460c().mo6816a(f5278j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f5272b.unregisterReceiver(this.f5281i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1294b mo6671g() {
        NetworkInfo activeNetworkInfo = this.f5279g.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean i = mo6673i();
        boolean a = C3642a.m15696a(this.f5279g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new C1294b(z2, i, a, z);
    }

    /* renamed from: h */
    public C1294b mo6659b() {
        return mo6671g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo6673i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f5279g.getNetworkCapabilities(this.f5279g.getActiveNetwork());
            if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C1405l.m7460c().mo6817b(f5278j, "Unable to validate active network", e);
            return false;
        }
    }
}
