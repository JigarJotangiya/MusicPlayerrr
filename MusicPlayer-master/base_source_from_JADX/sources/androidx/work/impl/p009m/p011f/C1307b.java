package androidx.work.impl.p009m.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1405l;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.f.b */
/* compiled from: BatteryNotLowTracker */
public class C1307b extends C1308c<Boolean> {

    /* renamed from: i */
    private static final String f5266i = C1405l.m7462f("BatteryNotLowTracker");

    public C1307b(Context context, C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo6660g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo6661h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1405l.m7460c().mo6816a(f5266i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo6669d(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo6669d(Boolean.FALSE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo6659b() {
        Intent registerReceiver = this.f5272b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C1405l.m7460c().mo6817b(f5266i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
