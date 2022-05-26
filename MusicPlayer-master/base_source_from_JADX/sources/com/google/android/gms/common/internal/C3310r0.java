package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.common.internal.r0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3310r0 implements ServiceConnection {

    /* renamed from: g */
    private final int f10660g;

    /* renamed from: h */
    final /* synthetic */ C3261d f10661h;

    public C3310r0(C3261d dVar, int i) {
        this.f10661h = dVar;
        this.f10660g = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3286j jVar;
        if (iBinder == null) {
            C3261d.m14114U(this.f10661h, 16);
            return;
        }
        synchronized (this.f10661h.f10594n) {
            C3261d dVar = this.f10661h;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3286j)) {
                jVar = new C3287j0(iBinder);
            } else {
                jVar = (C3286j) queryLocalInterface;
            }
            C3286j unused = dVar.f10595o = jVar;
        }
        this.f10661h.mo11789T(0, (Bundle) null, this.f10660g);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10661h.f10594n) {
            C3286j unused = this.f10661h.f10595o = null;
        }
        Handler handler = this.f10661h.f10592l;
        handler.sendMessage(handler.obtainMessage(6, this.f10660g, 1));
    }
}
