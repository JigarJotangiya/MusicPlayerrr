package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.le0;
import com.google.android.gms.internal.ads.za0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: m */
    private final le0 f9844m;

    public OfflinePingSender(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9844m = C4980cv.m22122a().mo15969i(context, new za0());
    }

    @RecentlyNonNull
    public final ListenableWorker.C1221a doWork() {
        try {
            this.f9844m.mo17811c();
            return ListenableWorker.C1221a.m6838c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1221a.m6836a();
        }
    }
}
