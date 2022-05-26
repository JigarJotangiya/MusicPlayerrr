package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7614s0;

/* renamed from: com.google.android.play.core.assetpacks.f1 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6350f1 implements ServiceConnection {

    /* renamed from: g */
    private final C7577a f29443g = new C7577a("ExtractionForegroundServiceConnection");

    /* renamed from: h */
    private final List<C7614s0> f29444h = new ArrayList();

    /* renamed from: i */
    private final Context f29445i;

    /* renamed from: j */
    private ExtractionForegroundService f29446j;

    /* renamed from: k */
    private Notification f29447k;

    C6350f1(Context context) {
        this.f29445i = context;
    }

    /* renamed from: d */
    private final void m37614d() {
        ArrayList arrayList;
        synchronized (this.f29444h) {
            arrayList = new ArrayList(this.f29444h);
            this.f29444h.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ((C7614s0) arrayList.get(i)).mo28607R0(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f29443g.mo28575b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25234a(Notification notification) {
        this.f29447k = notification;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25235b() {
        this.f29443g.mo28574a("Stopping foreground installation service.", new Object[0]);
        this.f29445i.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f29446j;
        if (extractionForegroundService != null) {
            extractionForegroundService.mo25192a();
        }
        m37614d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo25236c(C7614s0 s0Var) {
        synchronized (this.f29444h) {
            this.f29444h.add(s0Var);
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f29443g.mo28574a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((C6344e1) iBinder).f29430g;
        this.f29446j = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f29447k);
        m37614d();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
