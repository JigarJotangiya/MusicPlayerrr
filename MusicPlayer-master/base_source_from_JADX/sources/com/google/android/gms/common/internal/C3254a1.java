package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.a1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3254a1 implements ServiceConnection, C3268d1 {

    /* renamed from: g */
    private final Map<ServiceConnection, ServiceConnection> f10569g = new HashMap();

    /* renamed from: h */
    private int f10570h = 2;

    /* renamed from: i */
    private boolean f10571i;

    /* renamed from: j */
    private IBinder f10572j;

    /* renamed from: k */
    private final C3327y0 f10573k;

    /* renamed from: l */
    private ComponentName f10574l;

    /* renamed from: m */
    final /* synthetic */ C3260c1 f10575m;

    public C3254a1(C3260c1 c1Var, C3327y0 y0Var) {
        this.f10575m = c1Var;
        this.f10573k = y0Var;
    }

    /* renamed from: a */
    public final void mo11752a(String str) {
        this.f10570h = 3;
        boolean d = this.f10575m.f10580g.mo11982d(this.f10575m.f10578e, str, this.f10573k.mo11894d(this.f10575m.f10578e), this, this.f10573k.mo11893c());
        this.f10571i = d;
        if (d) {
            this.f10575m.f10579f.sendMessageDelayed(this.f10575m.f10579f.obtainMessage(1, this.f10573k), this.f10575m.f10582i);
            return;
        }
        this.f10570h = 2;
        try {
            this.f10575m.f10580g.mo11981c(this.f10575m.f10578e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo11753b(String str) {
        this.f10575m.f10579f.removeMessages(1, this.f10573k);
        this.f10575m.f10580g.mo11981c(this.f10575m.f10578e, this);
        this.f10571i = false;
        this.f10570h = 2;
    }

    /* renamed from: c */
    public final void mo11754c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f10569g.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: d */
    public final void mo11755d(ServiceConnection serviceConnection, String str) {
        this.f10569g.remove(serviceConnection);
    }

    /* renamed from: e */
    public final boolean mo11756e() {
        return this.f10571i;
    }

    /* renamed from: f */
    public final int mo11757f() {
        return this.f10570h;
    }

    /* renamed from: g */
    public final boolean mo11758g(ServiceConnection serviceConnection) {
        return this.f10569g.containsKey(serviceConnection);
    }

    /* renamed from: h */
    public final boolean mo11759h() {
        return this.f10569g.isEmpty();
    }

    /* renamed from: i */
    public final IBinder mo11760i() {
        return this.f10572j;
    }

    /* renamed from: j */
    public final ComponentName mo11761j() {
        return this.f10574l;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10575m.f10577d) {
            this.f10575m.f10579f.removeMessages(1, this.f10573k);
            this.f10572j = iBinder;
            this.f10574l = componentName;
            for (ServiceConnection onServiceConnected : this.f10569g.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f10570h = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10575m.f10577d) {
            this.f10575m.f10579f.removeMessages(1, this.f10573k);
            this.f10572j = null;
            this.f10574l = componentName;
            for (ServiceConnection onServiceDisconnected : this.f10569g.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f10570h = 2;
        }
    }
}
