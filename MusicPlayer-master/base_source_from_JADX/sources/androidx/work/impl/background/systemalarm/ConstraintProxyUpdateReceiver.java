package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1405l;
import androidx.work.impl.C1285j;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C1365d;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    static final String f5064a = C1405l.m7462f("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    class C1247a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Intent f5065g;

        /* renamed from: h */
        final /* synthetic */ Context f5066h;

        /* renamed from: i */
        final /* synthetic */ BroadcastReceiver.PendingResult f5067i;

        C1247a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5065g = intent;
            this.f5066h = context;
            this.f5067i = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f5065g.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5065g.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5065g.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5065g.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C1405l.m7460c().mo6816a(ConstraintProxyUpdateReceiver.f5064a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
                C1365d.m7382a(this.f5066h, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C1365d.m7382a(this.f5066h, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C1365d.m7382a(this.f5066h, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C1365d.m7382a(this.f5066h, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5067i.finish();
            }
        }
    }

    /* renamed from: a */
    public static Intent m6962a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1405l.m7460c().mo6816a(f5064a, String.format("Ignoring unknown action %s", new Object[]{action}), new Throwable[0]);
        } else {
            C1285j.m7100k(context).mo6612p().mo6804b(new C1247a(this, intent, context, goAsync()));
        }
    }
}
