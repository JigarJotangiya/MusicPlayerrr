package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C1405l;
import androidx.work.C1408n;
import androidx.work.C1422v;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f5138a = C1405l.m7462f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C1405l.m7460c().mo6816a(f5138a, "Requesting diagnostics", new Throwable[0]);
            try {
                C1422v.m7482d(context).mo6830b(C1408n.m7473d(DiagnosticsWorker.class));
            } catch (IllegalStateException e) {
                C1405l.m7460c().mo6817b(f5138a, "WorkManager is not initialized", e);
            }
        }
    }
}
