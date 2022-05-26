package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import com.google.android.gms.common.stats.C3352a;
import java.util.HashMap;
import p159f.p243f.p245b.p246a.p293c.p297d.C7448d;

/* renamed from: com.google.android.gms.common.internal.c1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3260c1 extends C3276g {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<C3327y0, C3254a1> f10577d = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f10578e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f10579f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3352a f10580g;

    /* renamed from: h */
    private final long f10581h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f10582i;

    C3260c1(Context context) {
        this.f10578e = context.getApplicationContext();
        this.f10579f = new C7448d(context.getMainLooper(), new C3257b1(this, (C3329z0) null));
        this.f10580g = C3352a.m14414b();
        this.f10581h = 5000;
        this.f10582i = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11768d(C3327y0 y0Var, ServiceConnection serviceConnection, String str) {
        boolean e;
        C3292l.m14241i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10577d) {
            C3254a1 a1Var = this.f10577d.get(y0Var);
            if (a1Var == null) {
                a1Var = new C3254a1(this, y0Var);
                a1Var.mo11754c(serviceConnection, serviceConnection, str);
                a1Var.mo11752a(str);
                this.f10577d.put(y0Var, a1Var);
            } else {
                this.f10579f.removeMessages(0, y0Var);
                if (!a1Var.mo11758g(serviceConnection)) {
                    a1Var.mo11754c(serviceConnection, serviceConnection, str);
                    int f = a1Var.mo11757f();
                    if (f == 1) {
                        serviceConnection.onServiceConnected(a1Var.mo11761j(), a1Var.mo11760i());
                    } else if (f == 2) {
                        a1Var.mo11752a(str);
                    }
                } else {
                    String valueOf = String.valueOf(y0Var);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            e = a1Var.mo11756e();
        }
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo11769e(C3327y0 y0Var, ServiceConnection serviceConnection, String str) {
        C3292l.m14241i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10577d) {
            C3254a1 a1Var = this.f10577d.get(y0Var);
            if (a1Var == null) {
                String valueOf = String.valueOf(y0Var);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (a1Var.mo11758g(serviceConnection)) {
                a1Var.mo11755d(serviceConnection, str);
                if (a1Var.mo11759h()) {
                    this.f10579f.sendMessageDelayed(this.f10579f.obtainMessage(0, y0Var), this.f10581h);
                }
            } else {
                String valueOf2 = String.valueOf(y0Var);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
