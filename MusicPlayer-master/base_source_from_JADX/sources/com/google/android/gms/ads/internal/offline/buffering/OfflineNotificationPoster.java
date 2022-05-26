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
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: m */
    private final le0 f9843m;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f9843m = C4980cv.m22122a().mo15969i(context, new za0());
    }

    @RecentlyNonNull
    public final ListenableWorker.C1221a doWork() {
        try {
            this.f9843m.mo17812u1(C4865b.m20503f2(getApplicationContext()), getInputData().mo6506i("uri"), getInputData().mo6506i("gws_query_id"));
            return ListenableWorker.C1221a.m6838c();
        } catch (RemoteException unused) {
            return ListenableWorker.C1221a.m6836a();
        }
    }
}
