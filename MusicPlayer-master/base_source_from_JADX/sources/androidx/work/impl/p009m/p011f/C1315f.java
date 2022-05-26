package androidx.work.impl.p009m.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C1405l;
import androidx.work.impl.utils.p014p.C1397a;

/* renamed from: androidx.work.impl.m.f.f */
/* compiled from: StorageNotLowTracker */
public class C1315f extends C1308c<Boolean> {

    /* renamed from: i */
    private static final String f5284i = C1405l.m7462f("StorageNotLowTracker");

    public C1315f(Context context, C1397a aVar) {
        super(context, aVar);
    }

    /* renamed from: g */
    public IntentFilter mo6660g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: h */
    public void mo6661h(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C1405l.m7460c().mo6816a(f5284i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo6669d(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo6669d(Boolean.TRUE);
            }
        }
    }

    /* renamed from: i */
    public Boolean mo6659b() {
        Intent registerReceiver = this.f5272b.registerReceiver((BroadcastReceiver) null, mo6660g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }
}
