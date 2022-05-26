package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.b1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3257b1 implements Handler.Callback {

    /* renamed from: g */
    final /* synthetic */ C3260c1 f10576g;

    /* synthetic */ C3257b1(C3260c1 c1Var, C3329z0 z0Var) {
        this.f10576g = c1Var;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f10576g.f10577d) {
                C3327y0 y0Var = (C3327y0) message.obj;
                C3254a1 a1Var = (C3254a1) this.f10576g.f10577d.get(y0Var);
                if (a1Var != null && a1Var.mo11759h()) {
                    if (a1Var.mo11756e()) {
                        a1Var.mo11753b("GmsClientSupervisor");
                    }
                    this.f10576g.f10577d.remove(y0Var);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f10576g.f10577d) {
                C3327y0 y0Var2 = (C3327y0) message.obj;
                C3254a1 a1Var2 = (C3254a1) this.f10576g.f10577d.get(y0Var2);
                if (a1Var2 != null && a1Var2.mo11757f() == 3) {
                    String valueOf = String.valueOf(y0Var2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName j = a1Var2.mo11761j();
                    if (j == null) {
                        j = y0Var2.mo11892b();
                    }
                    if (j == null) {
                        String a = y0Var2.mo11891a();
                        C3292l.m14240h(a);
                        j = new ComponentName(a, "unknown");
                    }
                    a1Var2.onServiceDisconnected(j);
                }
            }
            return true;
        }
    }
}
