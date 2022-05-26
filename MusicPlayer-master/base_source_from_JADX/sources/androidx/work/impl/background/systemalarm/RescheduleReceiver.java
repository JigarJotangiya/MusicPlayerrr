package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.C1405l;
import androidx.work.impl.C1285j;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5068a = C1405l.m7462f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        C1405l.m7460c().mo6816a(f5068a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C1285j.m7100k(context).mo6615t(goAsync());
            } catch (IllegalStateException e) {
                C1405l.m7460c().mo6817b(f5068a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
        } else {
            context.startService(C1249b.m6972e(context));
        }
    }
}
