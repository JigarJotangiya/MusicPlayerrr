package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1232c;
import androidx.work.C1405l;
import androidx.work.C1407m;
import androidx.work.impl.p012n.C1340p;
import java.util.List;

abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5063a = C1405l.m7462f("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    ConstraintProxy() {
    }

    /* renamed from: a */
    static void m6961a(Context context, List<C1340p> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (C1340p pVar : list) {
            C1232c cVar = pVar.f5322j;
            z |= cVar.mo6479f();
            z2 |= cVar.mo6480g();
            z3 |= cVar.mo6483i();
            z4 |= cVar.mo6474b() != C1407m.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.m6962a(context, z, z2, z3, z4));
    }

    public void onReceive(Context context, Intent intent) {
        C1405l.m7460c().mo6816a(f5063a, String.format("onReceive : %s", new Object[]{intent}), new Throwable[0]);
        context.startService(C1249b.m6969a(context));
    }
}
